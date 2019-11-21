package com.lti.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Accomodation;
import com.lti.model.Course;
import com.lti.model.LoginC;
import com.lti.model.Registration;

@Repository
public class DaoWe {

	@PersistenceContext
	private EntityManager entitymanager;

	@Transactional
	public void addEntry(Registration registration) {
		entitymanager.persist(registration);

	}

	@Transactional
	public void addEntry1(Accomodation accomodation, int regId) {
		Registration reg = entitymanager.find(Registration.class, regId);
		accomodation.setRegistration(reg);
		entitymanager.persist(accomodation);
	}
	
	@Transactional
	public void addEntry2(Course course, int regId) {
		Registration reg = entitymanager.find(Registration.class, regId);
		course.setRegistration(reg);
		entitymanager.persist(course);
	}
	/*
	@Transactional
	public int log(String username, String password)
	{
		Query q = entitymanager.createQuery("select a from registration where a.username=:user and a.password=:password");
				
				
	}*/
	/*
	 * @Transactional public Object fetchByObject(Class clazz,Object pk) {
	 * Object obj=entitymanager.find(clazz,pk); return obj; }
	 */

}
