//package com.symbiosis.model;
//
//import java.time.LocalDateTime;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Booking {
//	
//	@Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//	private int id;
//	private String fullName;
//    private String email;
//    private String phone;
//    private String address;
//    private String serviceType;
//    private LocalDateTime preferredTime;
//	public Booking() {
//		super();
//	}
//	public Booking(String fullName, String email, String phone, String address, String serviceType,
//			LocalDateTime preferredTime) {
//		super();
//		this.fullName = fullName;
//		this.email = email;
//		this.phone = phone;
//		this.address = address;
//		this.serviceType = serviceType;
//		this.preferredTime = preferredTime;
//	}
//	public String getFullName() {
//		return fullName;
//	}
//	public void setFullName(String fullName) {
//		this.fullName = fullName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public String getServiceType() {
//		return serviceType;
//	}
//	public void setServiceType(String serviceType) {
//		this.serviceType = serviceType;
//	}
//	public LocalDateTime getPreferredTime() {
//		return preferredTime;
//	}
//	public void setPreferredTime(LocalDateTime preferredTime) {
//		this.preferredTime = preferredTime;
//	}
//	@Override
//	public String toString() {
//		return "Booking [id=" + id + ", fullName=" + fullName + ", email=" + email + ", phone=" + phone + ", address="
//				+ address + ", serviceType=" + serviceType + ", preferredTime=" + preferredTime + "]";
//	}
//    
//	
//
//}
