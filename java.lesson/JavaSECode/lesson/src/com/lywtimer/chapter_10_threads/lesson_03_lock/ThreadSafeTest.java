package com.lywtimer.chapter_10_threads.lesson_03_lock;

/**
 * ClassName: ThreadSafeTest
 * Package: com.lywtimer.chapter_10_threads
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/8 11:57
 */
public class ThreadSafeTest {
    public static void main(String[] args) {
        final Account account = new Account(3000);
        final Customer c1 = new Customer(account,"甲");
        final Customer c2 = new Customer(account, "乙");
        c1.start();
        c2.start();
    }
}

class Account{
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amt){
        if (amt > 0) {
            balance += amt;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " 存钱 " + amt + " 余额为 " + balance );
    }
}

class Customer extends Thread{
    Account account;
    private String name;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(500);
        }
    }
}