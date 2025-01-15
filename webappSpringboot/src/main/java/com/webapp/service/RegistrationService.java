package com.webapp.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.entity.Registration;
import com.webapp.repository.RegistrationRepository;

@Service
public class RegistrationService {
	
	@Autowired
	private RegistrationRepository registrationRepository;
	public void createRegistration(Registration registration) {
		 registrationRepository.save(registration);
	}
	
	public List<Registration> getAllRegistrations(){
		List<Registration> registrations = registrationRepository.findAll();
		return registrations;
	}

	public void deleteRegistrationById(long id) {
		registrationRepository.deleteById(id);
	}

	public Registration getRegById(long id) {
	    Optional<Registration> opReg = registrationRepository.findById(id);
	    Registration registration = opReg.get();
	    return registration;
	}

	public void updateRegistration(Registration registration) {
		 registrationRepository.save(registration);
	}
}
