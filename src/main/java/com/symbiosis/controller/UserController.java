package com.symbiosis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.symbiosis.model.UserInfo;
import com.symbiosis.repository.UserInfoRepository;

@Controller
public class UserController {

	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/UserLogin.html")
	public String UserLogin()
	{
		return "UserLogin";
	}
	
	@GetMapping("/RegisterUser.html")
	public String UserRegister()
	{
		return "RegisterUser";
	}
	
	@GetMapping("/ServiceLogin.html")
	public String ServiceLogin()
	{
		return "ServiceLogin";
	}
	
	@GetMapping("/ServiceRegister.html")
	public String ServiceRegister()
	{
		return "ServiceRegister";
	}
	
	
	@GetMapping("/AdminLogin.html")
	public String AdminLogin()
	{
		return "AdminLogin";
	}
	
	
	@GetMapping("/ServicePage.html")
	public String ServicePage()
	{
		return "ServicePage";
	}
	
	
	@GetMapping("/Booking.html")
	public String Booking()
	{
		return "Booking";
	}
	
	
//	@Autowired
//	UserInfoRepository userRepo;
//	
//	  @PostMapping("/register")
//	    public String saveData(UserInfo user) {
//	        // Save data to the database
//		  userRepo.save(user);
//	        return "redirect:/your-page";
//	    }
//	    
	    
	    
}
