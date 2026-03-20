package org.example.stragedypattern_medglobalfejlhaandtering.Exceptions;

public class ValidationException extends RuntimeException {
    public ValidationException(String message) {
        super(message);
    }
}
