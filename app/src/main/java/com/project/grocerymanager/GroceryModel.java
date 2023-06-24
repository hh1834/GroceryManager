package com.project.grocerymanager;

import java.util.Date;

public class GroceryModel {
    private String name;
    private Date expirationDate;

    private int image;

    public GroceryModel(String name, Date expirationDate, int image) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
