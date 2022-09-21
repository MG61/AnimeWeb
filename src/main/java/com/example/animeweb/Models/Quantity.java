package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Quantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String col;

    @OneToMany(mappedBy = "quantity", fetch = FetchType.EAGER)
    private Collection<Anime> anime;

    public Quantity(String col, Collection<Anime> anime) {
        this.col = col;
        this.anime = anime;
    }

    public Quantity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCol() {
        return col;
    }

    public void setCol(String col) {
        this.col = col;
    }

    public Collection<Anime> getAnime() {
        return anime;
    }

    public void setAnime(Collection<Anime> anime) {
        this.anime = anime;
    }
}
