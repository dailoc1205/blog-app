package com.vti.blogapp.validation;

import com.vti.blogapp.repository.CommentRepository;
import com.vti.blogapp.repository.PostRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CommentIdExixtsValidator implements ConstraintValidator<CommentIdExixts, Long> {

    private final CommentRepository commentRepository;
    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        return commentRepository.existsById(id);
    }
}
