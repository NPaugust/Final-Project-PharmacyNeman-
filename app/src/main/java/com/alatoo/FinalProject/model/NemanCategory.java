package com.alatoo.FinalProject.model;

public class NemanCategory {
    String name;
    String kolvo;
    Integer imageUrl;

    public NemanCategory(String name, String kolvo, Integer imageUrl) {
        this.name = name;
        this.kolvo = kolvo;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKolvo() {
        return kolvo;
    }

    public void setKolvo(String kolvo) {
        this.kolvo = kolvo;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
