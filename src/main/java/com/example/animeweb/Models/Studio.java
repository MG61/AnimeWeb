package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Studio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stud;

    @OneToMany(mappedBy = "studio", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Studio(String stud, Collection<Anime> anime) {
        this.stud = stud;
        this.anime = anime;
    }

    public Studio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStud() {
        return stud;
    }

    public void setStud(String stud) {
        this.stud = stud;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
