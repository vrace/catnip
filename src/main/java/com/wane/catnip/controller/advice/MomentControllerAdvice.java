package com.wane.catnip.controller.advice;

import com.wane.catnip.controller.MomentController;
import com.wane.catnip.exception.MomentNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Component
@ControllerAdvice(assignableTypes = MomentController.class)
public class MomentControllerAdvice {
    @ExceptionHandler(MomentNotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    @ResponseBody
    public ApiError handleMomentNotFound(MomentNotFoundException e) {
        return new ApiError(e.getMessage());
    }
}
