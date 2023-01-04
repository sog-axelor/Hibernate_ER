package com.unique.apps.main;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.unique.apps.Class;
import com.unique.apps.Teacher;

public class TeacherMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Eclipselink_JPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Class cs1 = new Class();
		cs1.setCname("11 Div-A");
		
		Class cs2 = new Class();
		cs2.setCname("11 Div-B");
		
		Class cs3 = new Class();
		cs3.setCname("11 Div-C");
		
		em.persist(cs1);
		em.persist(cs2);
		em.persist(cs3);
	
		Set<Class> cset  = new HashSet();
		cset.add(cs1);
		cset.add(cs2);
		cset.add(cs3);
		
		Set<Class> cset1  = new HashSet();
		cset1.add(cs1);
		cset1.add(cs2);
		cset1.add(cs3);
		
		
		Set<Class> cset2 = new HashSet();
		cset2.add(cs1);
		cset2.add(cs2);
		cset2.add(cs3);
		
		Teacher tc = new Teacher();
		tc.setT_name("Shilpa Shah");
		tc.setT_subject("Computer Science");
		tc.setClassSet(cset1);
		
		Teacher tc1 = new Teacher();
		tc1.setT_name("RUpa Shah");
		tc1.setT_subject("Micro Science");
		tc1.setClassSet(cset2);
		
		Teacher tc2 = new Teacher();
		tc2.setT_name("Vikram Shah");
		tc2.setT_subject("Bio Science");
		tc2.setClassSet(cset);
		
		em.persist(tc1);
		em.persist(tc2);
		em.persist(tc);
		
		
		
		
		
		
				
		
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

}
