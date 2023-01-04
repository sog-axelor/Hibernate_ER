package com.unique.apps.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Department;
import com.unique.apps.Employee;

public class MainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Department de = new Department();
		de.setD_name("Department of Computer Science");
		em.persist(de);
		
		Employee ep = new Employee();
		ep.setEname("Ramesh Pashwan");
		ep.setSalary(45000.0);
		ep.setDept(de);
		
		em.persist(ep);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
	}

}
