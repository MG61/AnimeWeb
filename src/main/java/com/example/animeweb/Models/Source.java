package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Source {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sour;

    @OneToMany(mappedBy = "source", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Source(String sour, Collection<Anime> anime) {
        this.sour = sour;
        this.anime = anime;
    }

    public Source() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSour() {
        return sour;
    }

    public void setSour(String sour) {
        this.sour = sour;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
