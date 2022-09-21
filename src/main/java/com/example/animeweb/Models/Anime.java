package com.example.animeweb.Models;

import javax.persistence.*;

@Entity
public class Anime {
    @Id
    @GeneratedValue
    private Long id;

    private String name, opis, img;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Type type;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Quantity quantity;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Status status;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Ozvuch ozvuch;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Studio studio;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private MPAA mpaa;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Age age;

    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Source source;

    public Anime(String name, String opis, String img, Type type, Quantity quantity, Status status, Ozvuch ozvuch, Studio studio, MPAA mpaa, Age age, Source source) {
        this.name = name;
        this.opis = opis;
        this.img = img;
        this.type = type;
        this.quantity = quantity;
        this.status = status;
        this.ozvuch = ozvuch;
        this.studio = studio;
        this.mpaa = mpaa;
        this.age = age;
        this.source = source;
    }

    public Anime() {
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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Ozvuch getOzvuch() {
        return ozvuch;
    }

    public void setOzvuch(Ozvuch ozvuch) {
        this.ozvuch = ozvuch;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public MPAA getMpaa() {
        return mpaa;
    }

    public void setMpaa(MPAA mpaa) {
        this.mpaa = mpaa;
    }

    public Age getAge() {
        return age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
