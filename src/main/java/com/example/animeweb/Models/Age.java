package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Age {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ag;

    @OneToMany(mappedBy = "age", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Age(String ag, Collection<Anime> anime) {
        this.ag = ag;
        this.anime = anime;
    }

    public Age() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
