/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import BusinessLayer.AdminManneger;
import DataAccessLayer.*;
import DataAccessLayer.DTOClasses.Admin;
import DataAccessLayer.DTOClasses.Customer;
import DataAccessLayer.DTOClasses.Order;
import DataAccessLayer.Repositories.AdminRepository;
import DataAccessLayer.Repositories.CustomerRepository;
import DataAccessLayer.Repositories.OrderRepository;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author samaa mohammed
 */
public class Main{

    public  static  int fib (int num){
   
		if (num <= 0)
			return 0;
                else if (num==1)
                    return 1;
		else
			return fib(num-1) + fib(num-2);
	}
    
    public static void main(String[] args) {

//        CustomerRepository customerRepository = new CustomerRepository();
//        Customer customer = customerRepository.GetById(1);
//        System.out.println(customer.toString());
//
//        Customer newCustomer = new Customer();
//        newCustomer.setFirstName("mohammed");
//        newCustomer.setLastName("atef");
//        newCustomer.setAge(32);
//        customerRepository.Save(newCustomer);
//        customerRepository.Delete(3);
//        ArrayList<Customer> customers = customerRepository.GetAll();
//        for (Customer customer : customers) {
//            System.out.println(customer.toString() + "\n");
//        AdminRepository adminRepository=new AdminRepository();
//        Admin admin =new Admin();
//        admin.setUserName("seissa");
//        admin.setPassword("m20121987");
//        adminRepository.Save(admin);
//        Admin admin1=adminRepository.GetById(1);
//        System.out.println(admin1.toString());
//        String name ="seissa";
//        String password="m20121987";
//        Admin admin=new Admin();
//        admin.setPassword(password);
//        admin.setUserName(name);
//        AdminManneger adminManneger =new AdminManneger();
//        boolean answer= adminManneger.checkAccess(name,password);
//        System.out.println(answer);
        
//        OrderRepository repository =new  OrderRepository();
//        Order order=new Order();
//       
//        order.setComment("paid");
//        order.setCustomerId(1012);
//        order.setMealId(1013);
//        boolean ana= repository.Save(order);
//        System.out.println(ana);

//      Scanner scanner =new Scanner(System.in);
//           System.out.println("please enter the number : "); 
//        int num = new Scanner(System.in).nextInt(); 
//        System.out.println ("the answer = "+fib(num));
  CustomerRepository cr =new CustomerRepository();
  cr.addpoint(1012);
        
        }

    }

