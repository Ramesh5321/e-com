package com.app.LoginRegistration2.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.LoginRegistration2.entity.Account;
import com.app.LoginRegistration2.entity.Transaction;
import com.app.LoginRegistration2.repository.AccountDao;
import com.app.LoginRegistration2.repository.TransactionDao;
import com.app.LoginRegistration2.request.TransferBalanceRequest;

@Service
public class AccountService {
	@Autowired
	AccountDao accountRepository;
	@Autowired
	TransactionDao transactionRepository;

	public Account save(Account account) {
		// TODO Auto-generated method stub
        accountRepository.save(account);
        return accountRepository.findByAccountNumberEquals(account.getAccountNumber());
	}

	public List<Account> findAll() {
		// TODO Auto-generated method stub
        return accountRepository.findAll();

	}
    public Account findByAccountNumber(String accountNumber){
        Account account = accountRepository.findByAccountNumberEquals(accountNumber);
        return account;
    }
   
	public Transaction sendMoney(TransferBalanceRequest transferBalanceRequest) {
        String fromAccountNumber = transferBalanceRequest.getFromAccountNumber();
        String toAccountNumber = transferBalanceRequest.getToAccountNumber();
        BigDecimal amount = transferBalanceRequest.getAmount();
        Account fromAccount = accountRepository.findByAccountNumberEquals(
                fromAccountNumber
        );
        Account toAccount = accountRepository.findByAccountNumberEquals(toAccountNumber);
        if(fromAccount.getCurrentBalance().compareTo(BigDecimal.ONE) == 1
                && fromAccount.getCurrentBalance().compareTo(amount) == 1
        ){
            fromAccount.setCurrentBalance(fromAccount.getCurrentBalance().subtract(amount));
            accountRepository.save(fromAccount);
            toAccount.setCurrentBalance(toAccount.getCurrentBalance().add(amount));
            accountRepository.save(toAccount);
            Transaction transaction = transactionRepository.save(new Transaction(0L,fromAccountNumber,amount,new Timestamp(System.currentTimeMillis())));
            return transaction;
        }
        return null;

	}



	public List<Account> fetchAllAccount() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	public Account getAccountByAccountId(long i) {
		// TODO Auto-generated method stub
		return accountRepository.getById(i);
	}

	public Account save1(Account account1) {
		// TODO Auto-generated method stub
		return accountRepository.save(account1);
	}

	public Object persistAccountData(Account account1) {
		// TODO Auto-generated method stub
		return accountRepository.save(account1);
	}
	

}