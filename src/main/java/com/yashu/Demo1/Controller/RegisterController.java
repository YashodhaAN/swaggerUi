package com.yashu.Demo1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yashu.Demo1.Entity.Register;
import com.yashu.Demo1.Service.RegisterService;
import com.yashu.Demo1.costant.AppConstant;



@RestController    //(combination of responseBody+controller (

//just to return in method we have to use responseBody both in class and above method instead we use @restMapping))
@RequestMapping(value = AppConstant.FORWARD_SLASH)
public class RegisterController 
{
	 
	@Autowired
	private RegisterService service;
	
	@PostMapping(value = AppConstant.SAVE_REGISTER_DETAILS)
	public void saveRegisterDetails(@RequestBody Register register)
	{
		service.saveRegisterDetails(register);
	}
//	
	
	@PostMapping(value=AppConstant.SAVE_ALL_REGISTER_DETAILS)
	public void   saveAllRegisterDetails(List<Register> list)
	{
		 service.saveAllRegisterDetails(list);
		
	}
	
	
	@GetMapping(value=AppConstant.GET_REGISTER_DETAILS)
	public @ResponseBody List<Register> getRegisterDetails()
	{
		return service.getRegisterDetails();
	}
	

	
	
	@GetMapping(value=AppConstant.DELETE_REGISTER_DETAILS)
	public void deleteRegisterDetailsById(int id)
	{
		  service.deleteRegisterDetailsById(id);
	}
	
	
	@PostMapping(value=AppConstant.UPDATE_REGISTER_DETAILS)
	public void updateRegisterDetails(@RequestBody List<Register >register)
	{
		  service.updateRegisterDetails(register);
	}
	

}




