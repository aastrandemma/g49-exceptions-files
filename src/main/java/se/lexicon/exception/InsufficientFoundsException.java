package se.lexicon.exception;

import java.time.LocalDateTime;
import java.util.UUID;

public class InsufficientFoundsException extends Exception { // Custom class of check exceptions
    private final String errorCode;
    private final LocalDateTime localDateTime;

    public InsufficientFoundsException(String message) {
        super(message);
        this.errorCode = UUID.randomUUID().toString();
        this.localDateTime = LocalDateTime.now();
    }

    public String getErrorCode() {
        return errorCode;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public String description() {
        return "Message: " + super.getMessage() + ", Error Code: " + errorCode + ", DateTime: " + localDateTime;
    }
}