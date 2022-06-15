package com.repositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;


@Repository	
@Transactional
public class UserRepositoryImp implements UserRepository{

	@Autowired
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void registerUser(User user) {
		// TODO Auto-generated method stub
		
	}
    
   /* @Override
    public void registerUser(User user) {
        System.out.println(user.getEdad());
        entityManager.merge(user);
    }

   /* public void eliminar(UserPojo userPojo, String id) {
    	String sql = "DELETE From User where id"+id;
    	entityManager.createQuery(sql).executeUpdate();
    	entityManager.remove(userPojo);
    	
    }
    
    public void modificar(UserPojo userPojo, String id) {
    		UserPojo user = entityManager.find(UserPojo.class,id) ;
    		entityManager.remove(user);
    		entityManager.merge(user);
    }
    
    public UserPojo leerPorId(String id) {
    	try {
    	UserPojo userPojo = entityManager.find(UserPojo.class, id); 
    	return userPojo;
    	}
    	
    	catch(Exception e){
    		e.printStackTrace();
    	}
		return null;
   
      }
*/
}
