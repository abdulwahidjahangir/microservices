package com.wahid.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {


    @Schema(
            description = "Name of the customer", example = "Abdul Wahid Jahangir", required = true
    )
    @NotEmpty(message = "Customer name can not be null or empty")
    @Size(min = 5, max = 30, message = "The length of customer name must be between 5 and 30")
    private String name;

    @Schema(
            description = "Email of the customer", example = "H7b9o@example.com", required = true
    )
    @NotEmpty(message = "Email name can not be null or empty")
    @Email(message = "Please provide a valid email")
    private String email;

    @Schema(
            description = "Mobile number of the customer", example = "0123456789", required = true
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(
            description = "Accounts of the customer", required = true
    )
    private AccountsDto accountsDto;
}
