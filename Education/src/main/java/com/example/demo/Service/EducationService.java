package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LoanApplicationModel;

import com.example.demo.Model.UserModel;
import com.example.demo.Repository.LoanApplicationRepository;
import com.example.demo.Repository.UserRepository;

@Service
public class EducationService {
@Autowired
public UserRepository  urepo;
@Autowired
public LoanApplicationRepository loanrepo;
//posting
public UserModel saveinfo(UserModel u)
{
	return urepo.save(u);
}
public LoanApplicationModel saveloan(LoanApplicationModel lm)
{
	return loanrepo.save(lm);
}
//getting the information
public List<UserModel> getinfo()
{
	return urepo.findAll();
}
public List<LoanApplicationModel> getinfo2()
{
	return loanrepo.findAll();
}
//update 
public UserModel updateinfo(UserModel um)
{
	return urepo.saveAndFlush(um);
}
public LoanApplicationModel updateloan(LoanApplicationModel la)
{
	return loanrepo.saveAndFlush(la);
}
//delete
public void deleteinfo(int userid)
{
	urepo.deleteById(userid);
}

public void deleteloan(int loanid)
{
	loanrepo.deleteById(loanid);
}



}