package com.symbiosis.controller;

import java.util.List;


import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


import javax.security.sasl.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.symbiosis.model.Appointment;
import com.symbiosis.model.ServiceInfo;
import com.symbiosis.model.UserInfo;
import com.symbiosis.repository.AdminRepository;
import com.symbiosis.repository.AppointmentRepository;
import com.symbiosis.repository.ServiceInfoRepository;
import com.symbiosis.repository.UserInfoRepository;
import com.symbiosis.service.AdminServiceInterface;
import com.symbiosis.model.Admin;
import com.symbiosis.service.AppointmentServiceInterface;



@Controller
public class UserController {

	

	@Autowired	
	UserInfoRepository userRepo;
	
	@Autowired
	AdminServiceInterface adminServ;
	
	@Autowired
	ServiceInfoRepository serviceRepo;
	
	
	
	 @GetMapping("/AdminPage.html")
	    public String adminPage(Model model) {
	        List<ServiceInfo> servicePages = adminServ.getAllServicePages();
	        List<UserInfo> userInfos = adminServ.getAllUserInfos();
	        List<Appointment> Appointments = adminServ.getAllAppointments();


	        model.addAttribute("servicePages", servicePages);
	        model.addAttribute("userInfos", userInfos);
	        model.addAttribute("appointmentPage", Appointments);

	        return "AdminPage";
	    }	
	
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}

	
	@GetMapping("/UserLogin.html")
	public String UserLogin(Model model)
	{
		  model.addAttribute("UserInfo", new UserInfo());

		return "UserLogin";
	}
	
	
	
	@PostMapping("/login")
	public String login(@ModelAttribute UserInfo userInfo, Model model) {
	    UserInfo user = userRepo.findByUsernameAndUserpassword(userInfo.getUsername(), userInfo.getUserpassword());

	    if (user != null) {
	        // Successful login
	        return "redirect:/ServicePage.html";
	    } else {
	        // Failed login
	        model.addAttribute("error", "Invalid username or password");
	        return "UserLogin.html";
	    }
	}
	
	@Autowired
	AdminRepository adminRepo;
	
	
	@PostMapping("/admin")
	public String Admin(@ModelAttribute Admin admin, Model model) {
	    Admin adminlog = adminRepo.findByAdminemailAndAdminpassword( admin.getAdminemail(),admin.getAdminpassword());

	    if (adminlog != null) {
	        // Successful login
	        return "redirect:/AdminPage.html";
	    } else {
	        // Failed login
	        model.addAttribute("error", "Invalid username or password");
	        return "AdminLogin.html";
	    }
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/RegisterUser.html")
	public String UserRegister(Model model)
	{
		  model.addAttribute("UserInfo", new UserInfo());

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
	
	
	@GetMapping("/Appointment.html")
   public String showAppointmentForm(Model model) {
		
		 // Get the logged-in user's ID
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String loggedInUserId = authentication.getName(); // Assuming the username is the user's ID

        // Pass the user ID to the appointment form
        model.addAttribute("loggedInUserId", loggedInUserId);
        
        model.addAttribute("Appointment", new Appointment());
        return "Appointment";
    }
	
	@Autowired
	AppointmentServiceInterface appointServ;
	
    @PostMapping("/saveAppointment")
    public String saveAppointment( Appointment appointment) {
	        // Call the service to save the appointment
	        appointServ.saveAppointment(appointment);

	        // Redirect to a success page or any other appropriate view
	        return "redirect:/ThankYou.html";
	    }
	
    @GetMapping("/ThankYou.html")
    public String thankYouPage()
    {
    	return "ThankYou";
    }
	
	
	  @PostMapping("/register")
	   public String saveUserData(UserInfo user) {
	        // Save data to the database
		  userRepo.save(user);
	        return "redirect:/UserLogin.html";
	    }
	    
	    
	  @GetMapping("/AddService.html")
	  public String showAddService(Model model)
	  {
	        model.addAttribute("ServiceInfo",model);

		  return "AddService";
	  }
	    
	  @PostMapping("/addservice")
	   public String saveService(ServiceInfo serv) {
	        // Save data to the database
		  serviceRepo.save(serv);
	        return "redirect:/ServiceLogin.html";
	    }
	  
	  
	  
	  
}
