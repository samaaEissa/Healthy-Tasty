/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Meal;
import DataAccessLayer.Repositories.CustomerRepository;
import DataAccessLayer.Repositories.MealRepository;
import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class CustomerManneger {
    
    CustomerRepository customerRepository = new CustomerRepository();
      MealRepository mealRepository= new MealRepository();
    public int chooseDiet(double weight, double hight) {
        double h= hight/100;
        
        double BMI = weight /(h*h) ;
        
        if (BMI < 18.5) {
            return 3;
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            return 4;
        } else if (BMI >= 25 && BMI <= 29.9) {
            return 5;
        } else {
            return 8;
        }       
    }

    public void addCustomer(Customer customer) {
        double weight = customer.getWeight();
        double height = customer.getHeight();
        int dietId = chooseDiet(weight, height);
        customer.setDietID(dietId);
        customerRepository.Save(customer);
    }
    public ArrayList<Meal> getCustomerMeals(String phone){
    
        ArrayList<Meal> meals = new ArrayList<Meal>();
       Customer customer= customerRepository.GetByPhone(phone);
       if (customer!=null){
      meals= mealRepository .GetMealsByDietID(customer.getDietID());
      return meals;}
       else
           return null;
       
    }
    public Customer getCustomer(String phone){
    
       
       Customer customer= customerRepository.GetByPhone(phone);
      
        if (customer!=null){
      
      return customer;}
       else
           return null;
    }
}
