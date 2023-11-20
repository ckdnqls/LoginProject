package com.sparta.loginproject.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class SignupRequestDto {
    private Long noticeId;
    private String username;
    private String password;
    private String email;
    private boolean admin = false;
    private String adminToken = "";
}