package com.lti.mayu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.model.Accomodation;
import com.lti.model.Registration;
import com.lti.service.WomenE;

public class AccController {

	@Autowired
	private WomenE w;

	@RequestMapping(path = "acc.lti", method = RequestMethod.POST)
	public String entry (Accomodation accomodation)
	{
		
		//w.registerAccomodation(accomodation);
		return "confirmation.jsp";
}
}

