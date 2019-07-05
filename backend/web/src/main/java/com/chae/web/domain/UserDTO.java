package com.chae.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data @Component @Lazy
public class UserDTO {
    private String userId,userName,password,email;
    private Long id;
}