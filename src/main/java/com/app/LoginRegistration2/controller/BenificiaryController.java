package com.app.LoginRegistration2.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.LoginRegistration2.entity.Benificiary;
import com.app.LoginRegistration2.service.BenificiaryService;

@RestController
@RequestMapping("/benificiary")
public class BenificiaryController {
	@Autowired
	BenificiaryService service;
	@GetMapping("/benifitiary/all")
	public List<Benificiary> getAllAccounts() {
		return service.findAll();
	}
	@GetMapping("/benfitiary/{id}")
	public Optional<Benificiary> getAccountById(@PathVariable(value = "id") Long Id) {
		return service.findById(Id);
	}	
	@PostMapping("/benifiatiry/new")
	public Benificiary createBenificiary(@Valid @RequestBody Benificiary benificiary) {

		return service.save(benificiary);
	}
	@DeleteMapping("/benificiary/{id}")
	public void deleteAccount(@PathVariable(value = "id") Long Id) {
		service.delete(Id);

	}
}
