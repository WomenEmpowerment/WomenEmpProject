package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.model.Accomodation;
import com.lti.model.Course;
import com.lti.model.Registration;
import com.lti.repository.DaoWe;

@Service
public class WomenE {
	
	
	/*@Autowired
	private Accomodation accomodation;*/
	
	@Autowired
	private DaoWe dao;
	
	
	
	
	/*@Autowired
	private MailService mailService;*/
	
	public void registerAdd(Registration registration)
	{
		
		dao.addEntry(registration);
		//mailService.send(registration.getEmail(),"Thankyou for registering","For further details log in into your account");
		
	}
	
	public void registerAccomodation(Accomodation accomodation,int regId)
	{
		
		dao.addEntry1(accomodation,regId);
	}

	public void registerCourse(Course course,int regId)
	{
		
		dao.addEntry2(course, regId);
	}

	
	
	/*public Registration fetchReg(int id)
	{
		Registration a1= (Registration)dao.fetchByObject(Registration.class,id);
		//accomodation.setRegistration(a1);
		return a1;
	}*/
}
