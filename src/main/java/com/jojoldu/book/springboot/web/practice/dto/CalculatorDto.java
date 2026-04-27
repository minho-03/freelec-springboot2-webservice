package com.jojoldu.book.springboot.web.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor // @Builder가 정상 작동하기 위해 추가
public class CalculatorDto {

    private int a;
    private int b;

    public int add() {
        return a + b;
    }

    public int subtract() {
        return a - b;
    }
}