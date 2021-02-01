/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.DTOClasses;

import java.sql.Date;

/**
 *
 * @author Hp
 */
public class Order {
    private int ID;
    private String state;
    private String comment;
    private Date date;
    private int customerId;
    private int mealId;
    private Customer customer=new Customer();
    private Meal meal =new Meal();

    @Override
    public String toString() {
        return "Order{" + "ID=" + ID + ", state=" + state + ", comment=" + comment + ", date=" + date + ", customerId=" + customerId + ", mealId=" + mealId + ", customer=" + customer + ", meal=" + meal + '}';
    }
   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Meal getMeal() {
        return meal;
    }

    public void setMeal(Meal meal) {
        this.meal = meal;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId=customerId;
    }

    public int getMealId() {
        return mealId;
    }

    public void setMealId(int mealId) {
        this.mealId=mealId;
    }
            
}
