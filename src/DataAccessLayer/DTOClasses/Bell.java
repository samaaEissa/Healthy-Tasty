/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.DTOClasses;

import java.util.Date;

/**
 *
 * @author Hp
 */
public class Bell {
    private int ID;
    private double TotalCost;
    private Date date;
    private Order order=new Order();

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "Bell{" + "ID=" + ID + ", TotalCost=" + TotalCost + ", date=" + date + ", order=" + order + '}';
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(double TotalCost) {
        this.TotalCost = TotalCost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
