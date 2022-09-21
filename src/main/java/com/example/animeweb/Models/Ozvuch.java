package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Ozvuch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ozv;

    @OneToMany(mappedBy = "ozvuch", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Ozvuch(String ozv, Collection<Anime> anime) {
        this.ozv = ozv;
        this.anime = anime;
    }

    public Ozvuch() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOzv() {
        return ozv;
    }

    public void setOzv(String ozv) {
        this.ozv = ozv;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
