package com.vti.blogapp.form;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class PostCreateFrom {
    private String title;
    private String description;
    private String content;
}
