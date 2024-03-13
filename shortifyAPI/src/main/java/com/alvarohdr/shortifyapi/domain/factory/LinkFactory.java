package com.alvarohdr.shortifyapi.domain.factory;

import com.alvarohdr.shortifyapi.domain.dto.LinkDto;
import com.alvarohdr.shortifyapi.domain.model.Link;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LinkFactory {

    public LinkDto getDto(Link link) {
        return new LinkDto(
                link.getId(),
                link.getUrl(),
                link.getUri()
        );
    }

    public List<LinkDto> getDtoList(List<Link> links) {
        return links.stream().map(this::getDto).collect(Collectors.toList());
    }
}
