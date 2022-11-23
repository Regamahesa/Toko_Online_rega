package com.tugas.tokoonline.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponHelper {

    public static <T> ResponseEntity<ConnorResponse<T>> ok (T data) {
        ConnorResponse<T> response = new ConnorResponse<>();
        response.setMesssage("SUCCES");
        response.setStatus("200");
        response.setData(data);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public static <T> ResponseEntity<ConnorResponse<T>> error(String error, HttpStatus httpStatus) {
        ConnorResponse<T> response = new ConnorResponse<>();
        response.setStatus(String.valueOf(httpStatus.value()));
        response.setMesssage(httpStatus.name());
        response.setData((T) error);
        return new ResponseEntity<>(response, httpStatus);
    }
}
