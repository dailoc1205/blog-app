package com.vti.blogapp.dto;

import java.time.LocalDateTime;

public class CommentDto {
    private Long id;
    private String name;
    private String email;
    private String body;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}