/*package com.app.LoginRegistration2.ControllerTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;

import java.math.BigDecimal;

import org.aspectj.lang.annotation.Before;
import org.easymock.EasyMock;
import org.easymock.Mock;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.LoginRegistration2.controller.AccountController;
import com.app.LoginRegistration2.entity.Account;
import com.app.LoginRegistration2.service.AccountService;
@RunWith(SpringRunner.class)
public class AccountControllerTest {
	@Autowired
	private AccountController  accountController;

   @Mock
	private AccountService accountService;
	
	@Before(value="")
	public void setUp(){

	accountService=EasyMock.createMock(AccountService.class);

	accountController=new AccountController();
	accountController.setAccountService(accountService);

	}
	@Test
	public void getAccountTest() {
	Account account=new Account();
	account.setAccountId(5l);
	account.setAccountNumber("1234");
	account.setCurrentBalance(new BigDecimal(2000.00));
	 doNothing().when(accountService).save();
	}
	@Test
	public void saveDeviceDataTest() {
	Account account1=new Account();
	 account1.setAccountId(15);
	account1.setAccountNumber("12345");
	account1.setCurrentBalance(new BigDecimal(5000));
	EasyMock.expect(accountService.persistAccountData(account1)).andReturn(account1);
	EasyMock.replay(accountService);

	ResponseEntity<String> responseEntity=accountController.saveAccountData(account1);
	assertEquals("kk",account1.getCurrentBalance());


	}




}*/
