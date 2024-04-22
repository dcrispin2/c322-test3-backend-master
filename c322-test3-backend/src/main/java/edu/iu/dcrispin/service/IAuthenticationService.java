package edu.iu.dcrispin.service;

import edu.iu.dcrispin.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {
    boolean register(Customer customer) throws IOException;
    boolean login(String username, String password) throws IOException;
}
