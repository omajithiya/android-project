package com.example.demo.Domain;

public class FoodDomain {
    private String title;
    private String pic;
    private String description;
    private String fee;
    private String numberInCart;

    public FoodDomain(String title, String pic, String description, String fee) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
    }

    public FoodDomain(String title, String pic, String description, String fee, String numberInCart) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.fee = fee;
        this.numberInCart = numberInCart;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getNumberInCart() {
        return numberInCart;
    }

    public void setNumberInCart(String numberInCart) {
        this.numberInCart = numberInCart;
    }
}
