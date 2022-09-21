package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @OneToMany (mappedBy = "type", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Type(String street, Collection<Anime> anime) {
        this.street = street;
        this.anime = anime;
    }

    public Type() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
