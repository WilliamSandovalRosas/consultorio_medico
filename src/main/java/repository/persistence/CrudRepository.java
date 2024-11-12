/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 *
 * @author DeveloperOak
 */
public abstract class CrudRepository <T> implements Repository<T>{

    private final Class<T> entityClass;
    
   
    public CrudRepository(Class<T> entityClass) {
    
        this.entityClass = entityClass;
    
    }
        
    @PersistenceContext(unitName = "consultorio")//consultorio es la unidad de persistencia
    public EntityManager entityManager;
    
    protected abstract EntityManager getEntityManager();
    
    
        @Override
         public T save(T entity){
             getEntityManager().persist(entity);
             return entity;
         }

         @Override
         public T update(T entity){
             getEntityManager().merge(entity);
             return entity;
         }

        @Override 
        public T findById(Object entityId){
            return getEntityManager().find(entityClass, entityId);
        }


       public void delete(T entity){
           getEntityManager().remove(getEntityManager().merge(entity));
       }

       @Override 
        public List<T> findAll(){
            CriteriaQuery criteriaQuery = getEntityManager().getCriteriaBuilder().createQuery();
            criteriaQuery.select(criteriaQuery.from (entityClass));
            return getEntityManager().createQuery(criteriaQuery).getResultList();
        }

   
    
    
    
    
}
