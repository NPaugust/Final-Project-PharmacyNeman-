package com.alatoo.FinalProject.model;

public class PopularProducts {

    String name;
    String kolvo;
    Integer imageUrl;
    Integer available;
    Integer orangetext;

    public PopularProducts(String name, String kolvo, Integer imageUrl, String availability
                           ) {
        this.name = name;
        this.kolvo = kolvo;
        this.imageUrl = imageUrl;
        this.available = available;
        this.orangetext = orangetext;
    }



    public Integer getAvailable() {
        return available;}
        public void setAvailable(Integer available) {
            this.available = available;
        }



    public Integer getOrangetext() {
        return orangetext;
    }

    public void setOrangetext(Integer orangetext) {
        this.orangetext = orangetext;
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