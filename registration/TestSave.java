package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EntityManagerFactory entityManagerFactory=
       Persistence.createEntityManagerFactory("vikas");

EntityManager entityManager=entityManagerFactory.createEntityManager();

EntityTransaction entityTransaction=entityManager.getTransaction();

Vehicle vehicle=new Vehicle();
vehicle.setBrand("Shine");
vehicle.setName("Bike");
vehicle.setPrice(80000);
vehicle.setColor("Blue");


Registration registration=new Registration();
registration.setReg_no(123);
registration.setCity("Mumbai");

vehicle.setRegistration(registration);

entityTransaction.begin();
entityManager.persist(vehicle);
entityManager.persist(registration);
entityTransaction.commit();
	}

}
