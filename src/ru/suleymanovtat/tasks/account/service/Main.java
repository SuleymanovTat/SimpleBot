package ru.suleymanovtat.tasks.account.service;

public class Main {

    public static void main(String[] args) {


        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, i, new User(i, "firstName " + i, "lastName " + i));
        }
        AccountService service = new AccountServiceImpl(accounts);
        System.out.println(service.findAccountByOwnerId(0));
        System.out.println(service.countAccountsWithBalanceGreaterThan(-1));
    }
}
