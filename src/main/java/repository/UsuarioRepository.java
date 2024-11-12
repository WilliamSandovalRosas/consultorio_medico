/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import jakarta.persistence.EntityManager;
import model.entity.Usuario;
import repository.persistence.CrudRepository;

/**
 *
 * @author DeveloperOak
 */
public class UsuarioRepository extends CrudRepository<Usuario>{

//    public UsuarioRepository(Class<Usuario> entityClass) {
//        super(entityClass);
//    }
    
    public UsuarioRepository() {
        super(Usuario.class);//Se envía la clase usuario como parámetro para la clase abstracta <T>
    }

    @Override
    protected EntityManager getEntityManager() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return entityManager;//La persistencia permite el uso del entityManager creado en CrudRepository
    }
    
}
