package com.emp.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ResponseDTO {
    private List<String> error_messages; // Jakarta validation annotations
    private String exception_message; // Some exceptions occurring in our application, we need to send the exception message
    private String statusCodeDescription;
    private LocalDateTime timestamp;

}
