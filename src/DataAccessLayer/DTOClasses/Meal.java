/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.DTOClasses;

/**
 *
 * @author Hp
 */
public class Meal {
    private int ID;
    private String Name;
    private float price;
    private String type;
    private String ingredients;
    private byte [] image;
    private Diet diet=new Diet();
    private int dietID;

    @Override
    public String toString() {
        return "Meal{" + "ID=" + ID + ", Name=" + Name + ", price=" + price + ", type=" + type + ", ingredients=" + ingredients + ", image=" + image + ", diet=" + diet + ", dietID=" + dietID + '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    
   

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public int getDietID() {
        return dietID;
    }

    public void setDietID(int dietID) {
        this.dietID = dietID;
    }
    
    
    
}
