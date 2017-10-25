package com.wane.catnip.service.login;

import com.wane.catnip.exception.InvalidLoginCredentialException;
import com.wane.catnip.model.LoginCredential;
import com.wane.catnip.model.LoginKey;
import org.springframework.stereotype.Service;

@Service
public class DefaultLoginService implements LoginService {
    @Override
    public LoginKey login(LoginCredential credential) {
        String username = credential.getUsername();
        String password = credential.getPassword();

        if (username == null || password == null) {
            throw new InvalidLoginCredentialException("Username and Password must be supplied.");
        }

        if (username.equalsIgnoreCase("apiuser") && password.equals("Test1234")) {
            return new LoginKey(String.format("%s:%s", username, password));
        }

        throw new InvalidLoginCredentialException("Invalid Username and Password.");
    }
}
