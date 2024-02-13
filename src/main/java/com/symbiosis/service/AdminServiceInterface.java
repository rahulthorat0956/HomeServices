package com.symbiosis.service;

import java.util.List;

import com.symbiosis.model.Appointment;
import com.symbiosis.model.ServiceInfo;
import com.symbiosis.model.UserInfo;

public interface AdminServiceInterface {

    public List<UserInfo> getAllUserInfos();
    
    public List<ServiceInfo> getAllServicePages();
    
    public List<Appointment> getAllAppointments();


}
