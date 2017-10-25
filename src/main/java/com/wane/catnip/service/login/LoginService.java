package com.wane.catnip.service.login;

import com.wane.catnip.model.LoginCredential;
import com.wane.catnip.model.LoginKey;

public interface LoginService {
    LoginKey login(LoginCredential credential);
}
