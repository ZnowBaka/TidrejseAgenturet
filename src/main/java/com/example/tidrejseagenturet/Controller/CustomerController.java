package com.example.tidrejseagenturet.Controller;

import com.example.tidrejseagenturet.Model.Customer;

public class CustomerController {

    public int newCustomer(String firstName, String lastName, String email,String phoneNumber){

        Customer customer = new Customer(String firstName, String lastName, String email, String phoneNumber);

    }

}
