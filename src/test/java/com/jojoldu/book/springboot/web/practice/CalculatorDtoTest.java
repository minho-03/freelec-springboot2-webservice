package com.jojoldu.book.springboot.web.practice;

import com.jojoldu.book.springboot.web.practice.dto.CalculatorDto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorDtoTest {

    @Test
    public void add_메서드_검증() {
        CalculatorDto dto = CalculatorDto.builder()
                .a(10)
                .b(3)
                .build();

        int result = dto.add();
        assertThat(result).isEqualTo(13); // 10 + 3 = 13 검증
    }

    @Test
    public void subtract_메서드_검증() {
        CalculatorDto dto = CalculatorDto.builder()
                .a(10)
                .b(3)
                .build();

        int result = dto.subtract();
        assertThat(result).isEqualTo(7);
    }
}