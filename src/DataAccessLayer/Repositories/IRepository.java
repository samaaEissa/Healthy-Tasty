/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccessLayer.Repositories;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public interface IRepository<E> {
    
    boolean Save(E obj);
    boolean Update(E obj);
    boolean Delete(int Id);
    E GetById(int Id);
    ArrayList<E>GetAll();
}
