package com.yashu.Demo1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yashu.Demo1.Entity.Register;
import com.yashu.Demo1.Repository.RegisterRepsitory;



@Service
public class RegisterService 
{
	@Autowired
	private RegisterRepsitory  repository;
	public Object saveAllRegisterDetails;
	
	public void saveRegisterDetails(Register register)
	{
		repository.save(register);
	}
	
	public void  deleteRegisterDetailsById(int id) 
	{
		repository.deleteById(id);
	}

	public List<Register> getRegisterDetails()
	{
		return repository.findAll();
	}
	

	
	public void updateRegisterDetails(List<Register> register) 
	{
		repository.saveAll(register);

	}

	public void saveAllRegisterDetails(List<Register> list) {
		// TODO Auto-generated method stub
		
	}

	
	

	
	
	
	

}
