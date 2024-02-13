package com.symbiosis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symbiosis.model.Appointment;
import com.symbiosis.model.ServiceInfo;
import com.symbiosis.model.UserInfo;
import com.symbiosis.repository.AppointmentRepository;
import com.symbiosis.repository.ServiceInfoRepository;
import com.symbiosis.repository.UserInfoRepository;

@Service
public class AdminServiceImplementation implements AdminServiceInterface{

	@Autowired
	UserInfoRepository userRepo;
	
	@Autowired
	ServiceInfoRepository serviceRepo;
	
	@Autowired
	AppointmentRepository appointRepo;
	
	
	
	@Override
	public List<UserInfo> getAllUserInfos() {
		return userRepo.findAll();
	}

	@Override
	public List<ServiceInfo> getAllServicePages() {
		return serviceRepo.findAll();
	}

	@Override
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointRepo.findAll();
	}

	

}
