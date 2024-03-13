package com.alvarohdr.shortifyapi.story;

import com.alvarohdr.shortifyapi.domain.dto.LinkDto;
import com.alvarohdr.shortifyapi.domain.factory.LinkFactory;
import com.alvarohdr.shortifyapi.domain.model.Link;
import com.alvarohdr.shortifyapi.domain.service.LinkService;
import com.alvarohdr.shortifyapi.domain.utils.UrlUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/v1")
public class EventController {

    private final LinkService linkService;

    private final LinkFactory linkFactory;

    @Autowired
    public EventController(LinkService linkService, LinkFactory linkFactory) {
        this.linkService = linkService;
        this.linkFactory = linkFactory;
    }

    @GetMapping("{uri}")
    public ResponseEntity<?> get(@PathVariable String uri) {
        Optional<Link> optionalLink = linkService.findByUri(uri);
        if(optionalLink.isPresent()) {
            LinkDto link = linkFactory.getDto(optionalLink.get());
            return ResponseEntity.ok().body(link);
        }else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The uri doesn't exist");
        }
    }

    @PostMapping()
    public ResponseEntity<?> post(@RequestParam(name = "url") String url) {
        // TODO Álvaro: check if it's a valid URL

        if(!UrlUtils.isValidURL(url)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("The url is not valid");
        }

        Optional<Link> optionalLink = linkService.findByUrl(url);
        String uri;
        if(optionalLink.isPresent()) {
            uri = optionalLink.get().getUri();
        }else {
            Link link = new Link();
            link.setUrl(url);
            do {
                uri = UrlUtils.crateUri();
            }while (linkService.findByUri(uri).isPresent());
            link.setUri(uri);
            linkService.save(link);
        }
        return ResponseEntity.ok().body(uri);
    }
}
