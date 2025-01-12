package com.wahid.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(description = "API path", example = "/create")
    private String apiPath;

    @Schema(description = "Error Code")
    private HttpStatus errorCode;

    @Schema(description = "Error Message")
    private String errorMessage;

    @Schema(description = "Error Time", example = "2024-08-25T12:00:00")
    private LocalDateTime errorTime;
}
