package com.lti.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.model.Accomodation;
import com.lti.model.Course;
import com.lti.model.LoginC;
//import com.lti.model.Accomodation;
import com.lti.model.Registration;
import com.lti.service.WomenE;

@Controller
public class WeController {

	@Autowired
	private WomenE w;

	@RequestMapping(path = "register.lti", method = RequestMethod.POST)
	public String register(Registration register, @RequestParam("docfile") MultipartFile m, HttpSession session) // ,@RequestParam("docfile")
	// MultipartFile m)
	{

		System.out.println(m.getOriginalFilename());

		String path = "D:/uploads/";
		String finalpath = path + m.getOriginalFilename();

		try {
			m.transferTo(new File(finalpath));
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		register.setDocfilename(m.getOriginalFilename());

		w.registerAdd(register);
		session.setAttribute("reg_id", register.getId());

		return "courses.jsp";
	}

	@RequestMapping(path = "acc.lti", method = RequestMethod.POST)
	public String acc(Accomodation accomodation, HttpSession session) {
		Integer regId = new Integer(session.getAttribute("reg_id").toString());
		w.registerAccomodation(accomodation, (int) regId);
		return "Confirmation.jsp";
	}

	@RequestMapping(path = "cour.lti", method = RequestMethod.POST)
	public String course(Course course, HttpSession session) {
		Integer regId1 = new Integer(session.getAttribute("reg_id").toString());
		w.registerCourse(course, (int) regId1);
		return "Confirmation.jsp";

	}

	
	 @RequestMapping(path = "log.lti", method = RequestMethod.POST) public
	 void login(LoginC login,HttpSession session) { 
		 
	
	 
	 }
	 

}
