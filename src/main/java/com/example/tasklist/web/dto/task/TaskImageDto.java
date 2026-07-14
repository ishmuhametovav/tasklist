package com.example.tasklist.web.dto.task;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class TaskImageDto {
    @NotNull(message = "Image must be not null")
    @Schema(type = "string", format = "binary", description = "Image file")
    private MultipartFile file;
}
