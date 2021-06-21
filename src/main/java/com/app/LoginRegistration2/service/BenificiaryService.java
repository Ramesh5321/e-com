package com.app.LoginRegistration2.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.LoginRegistration2.entity.Benificiary;
import com.app.LoginRegistration2.repository.BenificiaryDao;

@Service
public class BenificiaryService {
	@Autowired
	BenificiaryDao dao;

	public List<Benificiary> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Optional<Benificiary> findById(Long accountId) {
		// TODO Auto-generated method stub
		return dao.findById(accountId);
	}


	public void delete(Long id) {
		// TODO Auto-generated method stub
		 dao.deleteById(id);

		
	}

	public Benificiary save(@Valid Benificiary benificiary) {
		// TODO Auto-generated method stub
		return dao.save(benificiary);
	}


	

}
