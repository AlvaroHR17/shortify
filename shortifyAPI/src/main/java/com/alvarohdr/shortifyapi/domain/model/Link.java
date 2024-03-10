package com.alvarohdr.shortifyapi.domain.model;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "links")
public class Link implements Serializable {

    @Serial
    private static final long serialVersionUID = -2963804850743289699L;

    private long id;

    private String url;
    private String uri;

    public Link() {
    }

    public Link(long id, String url, String uri) {
        this.id = id;
        this.url = url;
        this.uri = uri;
    }

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "URL", nullable = false)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Column(name = "URI", nullable = false)
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
