package com.vti.blogapp.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import lombok.Getter;
import lombok.Setter;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Constraint(validatedBy = PostIdExixtsValidator.class)
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface PostIdExixts {
    String message() default "{post.id.Exists.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};


    }
