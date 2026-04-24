package com.example.tasklist.web.dto.auth;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import jakarta.validation.constraints.NotNull;

@Data
@Schema(description = "Request for login")
public class JwtRequest
{
    @Schema(description = "email", example = "johndoe@mail.com")
    @NotNull(message = "Username must be not null")
    private String username;

    @Schema(description = "password", example = "12345")
    @NotNull(message = "Password must be not null")
    private String password;
}
