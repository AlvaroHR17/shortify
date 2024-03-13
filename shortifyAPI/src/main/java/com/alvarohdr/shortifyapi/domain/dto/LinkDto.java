package com.alvarohdr.shortifyapi.domain.dto;

import java.io.Serial;
import java.io.Serializable;

public class LinkDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 5316715568945996L;

    private long id;
    private String url;
    private String uri;

    public LinkDto() {
    }

    public LinkDto(long id, String url, String uri) {
        this.id = id;
        this.url = url;
        this.uri = uri;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "LinkDto{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
