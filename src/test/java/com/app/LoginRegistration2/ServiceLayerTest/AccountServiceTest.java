package com.app.LoginRegistration2.ServiceLayerTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.LoginRegistration2.entity.Account;
import com.app.LoginRegistration2.repository.AccountDao;
import com.app.LoginRegistration2.service.AccountService;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {
	@Mock
	AccountDao dao;
	@Autowired
	AccountService service;
    @Test
    public void saveAccount_Success() {
        Account acc = new Account();
        acc.setAccountId(1);
        acc.setAccountNumber("1354");
        acc.setCurrentBalance(new BigDecimal(3000));
      // when(dao.save((any(Account.class))).thenReturn(acc);

        Account savedAccount = dao.save(acc);
        assertThat(savedAccount.getAccountNumber()).isNotNull();
    }
    @Test
    public void account_exists_in_db_success() {
    	Account acc1=new Account();
    	acc1.setAccountId(5);
    	acc1.setAccountNumber("5321");
    	acc1.setCurrentBalance(new BigDecimal(3000));
        List<Account> acc2= new ArrayList<>();
        acc2.add(acc1);
        when(dao.findAll()).thenReturn(acc2);

        List<Account> fetchedAccounts =service.fetchAllAccount();
        assertThat(fetchedAccounts.size()).isGreaterThan(0);
    }
}

