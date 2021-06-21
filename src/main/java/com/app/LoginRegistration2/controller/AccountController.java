package com.app.LoginRegistration2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.LoginRegistration2.entity.Account;
import com.app.LoginRegistration2.entity.Response;
import com.app.LoginRegistration2.request.TransferBalanceRequest;
import com.app.LoginRegistration2.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired 
    private AccountService accountService;
    @PostMapping("/create")
    public List<Account> save(@RequestBody Account account) {
        accountService.save(account);
        return accountService.findAll();
    }
    @GetMapping("/all")
    public List<Account> all() {
        return accountService.findAll();
    }

    @PostMapping("/sendmoney")
    public Response sendMoney(@RequestBody TransferBalanceRequest transferBalanceRequest)
     {
        return Response.ok().setPayload(accountService.sendMoney(transferBalanceRequest));
              
        
    }
	public Account getAccount(long l) {
		// TODO Auto-generated method stub
		return accountService.getAccountByAccountId(l);
	}
	public void setAccountService(AccountService accountService2) {
		// TODO Auto-generated method stub
		
	}
	public Account saveDeviceData1(Account account1) {
		// TODO Auto-generated method stub
		return accountService.save1(account1);
	}
	public ResponseEntity<String> saveAccountData(Account account1) {
		// TODO Auto-generated method stub
		return null;
	}

  
}




















