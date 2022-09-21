package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genr;

    @OneToMany(mappedBy = "genre", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Genre(String genr, Collection<Anime> anime) {
        this.genr = genr;
        this.anime = anime;
    }

    public Genre() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenr() {
        return genr;
    }

    public void setGenr(String genr) {
        this.genr = genr;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
