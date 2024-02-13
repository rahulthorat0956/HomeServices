package com.symbiosis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.model.Admin;
import com.symbiosis.model.UserInfo;

@Repository
public interface AdminRepository  extends JpaRepository<Admin, Integer>{
	
    Admin findByAdminemailAndAdminpassword(String adminemail , String adminpassword);

}
