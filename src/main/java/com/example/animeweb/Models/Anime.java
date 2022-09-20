package com.example.animeweb.Models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Anime {
    @Id
    @GeneratedValue
    public Long id;

    public String name, opis, quantity, img, type, status, ozvuch;

    public Anime() {
    }

    public Anime(String name, String opis, String quantity, String img, String type, String status, String ozvuch) {
        this.name = name;
        this.opis = opis;
        this.quantity = quantity;
        this.img = img;
        this.type = type;
        this.status = status;
        this.ozvuch = ozvuch;
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

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getOzvuch() {
        return ozvuch;
    }

    public void setOzvuch(String ozvuch) {
        this.ozvuch = ozvuch;
    }
}
