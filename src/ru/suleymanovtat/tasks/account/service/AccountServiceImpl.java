package ru.suleymanovtat.tasks.account.service;

class AccountServiceImpl implements AccountService {

    Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts;
    }

    @Override
    public Account findAccountByOwnerId(long id) {
        for (Account account : accounts) {
            if (account.getOwner().getId() == id) {
                return account;
            }
        }
        return null;
    }

    @Override
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 0;
        for (Account account : accounts) {
            if (account.getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}
