package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stat;

    @OneToMany(mappedBy = "status", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Status(String stat, Collection<Anime> anime) {
        this.stat = stat;
        this.anime = anime;
    }

    public Status() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
