package com.evadevcwa.jakartawebapp001.contex;

import com.evadevcwa.jakartawebapp001.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PostgreSQLContext {
    
    private final EntityManager entityManager;
    
    
    public PostgreSQLContext(){
        //Lee la configuracion y crea las conexiones a la db
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("database-postgres");
        //Crea las consultas SQL para la base de datos
        entityManager = entityManagerFactory.createEntityManager();
        
        User user  = new User();
        user.setNombres("RENE ALEXANDER");
        user.setApellidos("MACHIC MORALES");
        //.................................
        //GUARDA A LA BASE DE DATOS AUTOMATICAMENTE
        entityManager.persist(user); //INSERT
        entityManager.remove(user);  //DELETE
        entityManager.merge(user);   //UPDATE
        User user_2 = entityManager.find(User.class,10); //SELECT
        //CRUD
        
        
        //2
        //BEANS
        
        
        
        //3
        //SERVLET JSP
        
        
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
    
    
}
