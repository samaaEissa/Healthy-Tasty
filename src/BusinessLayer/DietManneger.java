
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;


import DataAccessLayer.DTOClasses.Diet;
import DataAccessLayer.Repositories.DietRepository;

/**
 *
 * @author Hp
 */
public class DietManneger {
    private DietRepository dietRepository=new DietRepository();
    
    public void addDiet(Diet diet){
        dietRepository.Save(diet);
    
    }
}
