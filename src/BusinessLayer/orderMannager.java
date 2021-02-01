/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Order;
import DataAccessLayer.Repositories.CustomerRepository;
import DataAccessLayer.Repositories.OrderRepository;

/**
 *
 * @author Hp
 */
public class orderMannager {
   private OrderRepository orderRepository = new OrderRepository();
   private CustomerRepository customerRepository= new CustomerRepository();
   public boolean ordering(Order order)
   {
       orderRepository.Save(order);
      Customer customer =customerRepository.GetById(order.getCustomerId());
      customerRepository.addpoint(customer.getDietID());
     int points= customer.getFreePoint();
     int fmeals=customer.getFree_meals();
     if(points<18)
     {
         customerRepository.addpoint(order.getCustomerId());
         
         return false;
     }
     else if (points>=18&&fmeals<=3)
     { customerRepository.addfree_meal(order.getCustomerId());
      
        return true;
       
     }
     else if (points>=18&&fmeals>3)
     {
      customerRepository.setpoint(order.getCustomerId());
      customerRepository.setfree_meal(order.getCustomerId());
         
       return false;}
       return false;
     
   
   }
}
