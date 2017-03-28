package com.pos.dao;

import java.util.List;

import com.pos.bean.Customer;

public interface CustomerDao {
public void saveCustomer(Customer customer);
public List<Customer> listCustomer();
public Customer getCustomer();
public void deleteCustomer(int id);
}
