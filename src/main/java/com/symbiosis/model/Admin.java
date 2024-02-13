package com.symbiosis.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Adminid;
	private String adminemail;
	private String adminpassword;

	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int adminid, String adminemail, String adminpassword) {
		super();
		Adminid = adminid;
		this.adminemail = adminemail;
		this.adminpassword = adminpassword;
	}


	public int getAdminid() {
		return Adminid;
	}


	public void setAdminid(int adminid) {
		Adminid = adminid;
	}


	public String getAdminemail() {
		return adminemail;
	}


	public void setAdminemail(String adminemail) {
		this.adminemail = adminemail;
	}


	public String getAdminpassword() {
		return adminpassword;
	}


	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}


	@Override
	public String toString() {
		return "Admin [Adminid=" + Adminid + ", adminemail=" + adminemail + ", adminpassword=" + adminpassword + "]";
	}


	


}
