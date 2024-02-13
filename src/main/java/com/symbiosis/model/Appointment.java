package com.symbiosis.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appointment {

	

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Appointmentid;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private UserInfo user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "serviceid")
	private ServiceInfo service;
	
	private String appointmenttime;
	
	
	
	public Appointment() {
		super();
	}
	public Appointment(int appointmentid, UserInfo user, ServiceInfo service, String appointmenttime) {
		super();
		Appointmentid = appointmentid;
		this.user = user;
		this.service = service;
		this.appointmenttime = appointmenttime;
	}
	public int getAppointmentid() {
		return Appointmentid;
	}
	public void setAppointmentid(int appointmentid) {
		Appointmentid = appointmentid;
	}
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
	public ServiceInfo getService() {
		return service;
	}
	public void setService(ServiceInfo service) {
		this.service = service;
	}
	public String getAppointmenttime() {
		return appointmenttime;
	}
	public void setAppointmenttime(String appointmenttime) {
		this.appointmenttime = appointmenttime;
	}
	@Override
	public String toString() {
		return "Appointment [Appointmentid=" + Appointmentid + ", user=" + user + ", service=" + service
				+ ", appointmenttime=" + appointmenttime + "]";
	}
	
	
	
}
