package application.handler;

import activity.exception.ActivityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    private static final String NOT_FOUND = "Error - Activity not found";

    @ExceptionHandler(value = ActivityNotFoundException.class)
    public ResponseEntity<String> activityNotFoundException(ActivityNotFoundException activityNotFoundException) {
        return new ResponseEntity<>(NOT_FOUND, HttpStatus.NOT_FOUND);
    }

}
