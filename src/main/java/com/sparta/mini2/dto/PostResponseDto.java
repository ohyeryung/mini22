package com.sparta.mini2.dto;

import lombok.Getter;

@Getter
public class PostResponseDto {
    private boolean result;

    public PostResponseDto(boolean result) {
        this.result = result;
    }
}
