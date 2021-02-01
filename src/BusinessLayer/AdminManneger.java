/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;


import DataAccessLayer.Repositories.AdminRepository;

/**
 *
 * @author Hp
 */
public class AdminManneger 
{
    AdminRepository adminRepository =new AdminRepository();
    
    public boolean  checkAccess(String userName,String password){
    boolean result= adminRepository.checkUser(userName, password);
    return result;
    }
}

