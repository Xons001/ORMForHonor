package net.codejava.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class faccionDAOTest {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("UsersDB");
		EntityManager entityManager = factory.createEntityManager();
		 
		entityManager.getTransaction().begin();
		
		//Insertar
        /*User newUser = new User();
        newUser.setEmail("billjoy@gmail.com");
        newUser.setFullname("bill Joy");
        newUser.setPassword("billi");
         
        entityManager.persist(newUser);*/
		
		//Actualizar
		/*User existingUser = new User();
		existingUser.setId(1);
		existingUser.setEmail("bill.joy@gmail.com");
		existingUser.setFullname("Bill Joy");
		existingUser.setPassword("billionaire");
		 
		entityManager.merge(existingUser);*/
		
		//Select Hibernate
		/*Integer primaryKey = 1;
		User user = entityManager.find(User.class, primaryKey);
		 
		System.out.println(user.getEmail());
		System.out.println(user.getFullname());
		System.out.println(user.getPassword());*/
		
		//Query
		/*String sql = "SELECT u from User u where u.email = 'bill.joy@gmail.com'";
		Query query = entityManager.createQuery(sql);
		User user = (User) query.getSingleResult();
		 
		System.out.println(user.getEmail());
		System.out.println(user.getFullname());
		System.out.println(user.getPassword());*/
		
		//Borrar
		Integer primaryKey = 1;
		User reference = entityManager.getReference(User.class, primaryKey);
		entityManager.remove(reference);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
