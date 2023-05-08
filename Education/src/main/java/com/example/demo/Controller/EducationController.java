package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.LoanApplicationModel;
import com.example.demo.Model.UserModel;
import com.example.demo.Service.EducationService;

@RestController
@CrossOrigin
public class EducationController {
	@Autowired
	EducationService eser;
	@PostMapping("/userdetails")
	public UserModel adddetails(@RequestBody UserModel u)
	{
		return eser.saveinfo(u);
	}
	@PostMapping("/loandetails")
	public LoanApplicationModel addinfo(@RequestBody LoanApplicationModel l)
	{
		return eser.saveloan(l);
	}
	@GetMapping("/getuser")
	public List<UserModel> getdetails()
	{
		return eser.getinfo();
		}
	@GetMapping("/getloan")
	public List<LoanApplicationModel> getloan()
	{
		return eser.getinfo2();
	}
	@PutMapping("/updateuser")
	public UserModel update(@RequestBody UserModel um)
	{
		return eser.updateinfo(um);
	}
	@PutMapping("/updateloan")
	public LoanApplicationModel updatedetails(@RequestBody LoanApplicationModel lo)
	{
		return eser.updateloan(lo);
	}
	@DeleteMapping("/deleteuser")
	public String delete(@RequestParam("uid") int Id)
	{
		eser.deleteinfo(Id);
		return "deleted";
	}
	@DeleteMapping("/deleteloan")
	public String deletedetails(@RequestParam("loid") int loanId)
	{
		eser.deleteinfo(loanId);
		return " loanid is deleted";
	}
	
}