package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
      Persistence.createEntityManagerFactory("vikas");	

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

//create object person
  Person person=new Person();
  person.setName("Omkar");
  person.setEmail("omkar@mail.com");
  person.setCno(885699795l);
  
  //create object pan
  Pan pan =new Pan();
  pan.setAddress("Ratnagiri");
  //setting pan with the specified person
  pan.setPerson(person);

  entityTransaction.begin();
  entityManager.persist(person);
  entityManager.persist(pan);
  entityTransaction.commit();
	}

}
