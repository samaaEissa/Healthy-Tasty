/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccessLayer.DTOClasses.Meal;
import DataAccessLayer.Repositories.MealRepository;

/**
 *
 * @author Hp
 */
public class MealManneger {
    
    private MealRepository mealRepository = new MealRepository();
    public void addMeal (Meal meal){
    mealRepository.Save(meal);
    }
    
    
}
