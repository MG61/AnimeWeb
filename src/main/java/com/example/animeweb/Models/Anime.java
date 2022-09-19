package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Anime {
    @Id
    @GeneratedValue
    public Long id;

    public String name, opis, img;

    public Anime() {
    }

    public Anime(String name, String opis, String img) {
        this.name = name;
        this.opis = opis;
        this.img = img;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
