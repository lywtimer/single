package com.lywtimer.customer;

/**
 * ClassName: CustomerList
 * Package: com.lywtimer.customer
 * Description:
 *
 * @Author lywtimer
 * @Create 2023/8/4 16:04
 */
public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    public boolean addCustomer(Customer customer){
        if (total >= customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }
    public boolean replaceCustomer(int index, Customer c){
        if (index >= 0 && index < total) {
            customers[index] = c;
            return true;
        }
        return false;
    }

    public boolean deleteCustomer(int index){
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i+1];
        }
        customers[--total] = null;
        return true;
    }
    public Customer[] getAllCustomers(){
        Customer[] cArr = new Customer[total];
        for (int i = 0; i < total; i++) {
            cArr[i] = customers[i];
        }
        return cArr;
    }
    public Customer getCustomer(int index){
        if (this.total == 0 ||index >= this.total) {
            return null;
        }
        return this.customers[index];
    }
    public int getTotal(){
        return this.total;
    }


}
