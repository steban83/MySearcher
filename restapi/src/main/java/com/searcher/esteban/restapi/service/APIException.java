package com.searcher.esteban.restapi.service;

/**
 * Created by ealcalde on 16/06/2015.
 */

import java.io.IOException;

public class APIException extends IOException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public APIException() {
        super();
    }

    public APIException(String message) {
        super(message);
    }

    public APIException(String message, Throwable cause) {
        super(message);
        initCause(cause);
    }

    @Override
    public String toString() {
        if (getCause() != null) {
            return getLocalizedMessage() + ": " + getCause();
        } else {
            return getLocalizedMessage();
        }
    }
}
