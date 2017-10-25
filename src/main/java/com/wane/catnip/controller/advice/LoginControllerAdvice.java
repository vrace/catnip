package com.wane.catnip.controller.advice;

import com.wane.catnip.controller.LoginController;
import com.wane.catnip.exception.InvalidLoginCredentialException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.UNAUTHORIZED;

@Component
@ControllerAdvice(assignableTypes = LoginController.class)
public class LoginControllerAdvice {
    @ExceptionHandler(InvalidLoginCredentialException.class)
    @ResponseStatus(UNAUTHORIZED)
    @ResponseBody
    public ApiError handleInvalidLoginCredential(InvalidLoginCredentialException exc) {
        return new ApiError(exc.getMessage());
    }
}
