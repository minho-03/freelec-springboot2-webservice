package com.jojoldu.book.springboot.web.practice;

import com.jojoldu.book.springboot.web.practice.dto.HealthResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class HealthController {

    @GetMapping("/health")
    public HealthResponseDto health() {
        return new HealthResponseDto("OK", LocalDateTime.now());
    }
}