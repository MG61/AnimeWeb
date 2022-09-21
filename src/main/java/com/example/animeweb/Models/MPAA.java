package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class MPAA {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mpaa;

    @OneToMany(mappedBy = "mpaa", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public MPAA(String mpaa, Collection<Anime> anime) {
        this.mpaa = mpaa;
        this.anime = anime;
    }

    public MPAA() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMpaa() {
        return mpaa;
    }

    public void setMpaa(String mpaa) {
        this.mpaa = mpaa;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
