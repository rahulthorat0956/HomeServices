package com.symbiosis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiosis.model.Appointment;
import com.symbiosis.repository.AppointmentRepository;

@Service
public class AppointmentServiceImple implements AppointmentServiceInterface{

	@Autowired
	AppointmentRepository appointRepo;
	
	@Override
	public Appointment saveAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointRepo.save(appointment);
	}

}
