package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Year {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String yea;

    @OneToMany(mappedBy = "year", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Year(String yea, Collection<Anime> anime) {
        this.yea = yea;
        this.anime = anime;
    }

    public Year() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getYea() {
        return yea;
    }

    public void setYea(String yea) {
        this.yea = yea;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
