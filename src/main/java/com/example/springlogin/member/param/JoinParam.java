package com.example.springlogin.member.param;


import lombok.Builder;
import lombok.Data;


@Data
public class JoinParam {
    private String email;
    private String password;
}