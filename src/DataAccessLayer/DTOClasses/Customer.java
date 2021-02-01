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
public class Customer {
    private int ID;
    private String fulltName ;
    private String E_mail ;
    private String phone ;
    private String address ;
    private int age ;
    private String medicalStatus ;
    private int freePoint ;
    private double weight;
    private double height;
    private Diet diet=new Diet();
    private int DietID;
    private int free_meals;

    public int getFree_meals() {
        return free_meals;
    }

    public void setFree_meals(int free_meals) {
        this.free_meals = free_meals;
    }
     public void addFree_meals() {
        this.free_meals ++;
    }

    public int getDietID() {
        return DietID;
    }

    public void setDietID(int DietID) {
        this.DietID = DietID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFulltName() {
        return fulltName;
    }

    public void setFulltName(String fulltName) {
        this.fulltName = fulltName;
    }

   
   
    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMedicalStatus() {
        return medicalStatus;
    }

    public void setMedicalStatus(String medicalStatus) {
        this.medicalStatus = medicalStatus;
    }

    public int getFreePoint() {
        return freePoint;
    }

    public void setFreePoint(int freePoint) {
        this.freePoint = freePoint;
    }
     public void addFreePoint() {
        this.freePoint++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID=" + ID + ", fulltName=" + fulltName + ", E_mail=" + E_mail + ", phone=" + phone + ", address=" + address + ", age=" + age + ", medicalStatus=" + medicalStatus + ", freePoint=" + freePoint + ", weight=" + weight + ", height=" + height + ", diet=" + diet + '}';
    }

   
    
    
}
