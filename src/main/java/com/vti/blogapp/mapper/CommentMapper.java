package com.vti.blogapp.mapper;

import com.vti.blogapp.dto.CommentDto;
import com.vti.blogapp.entity.Comment;
import com.vti.blogapp.form.CommentCreateForm;
import com.vti.blogapp.form.CommentUpdateForm;

public class CommentMapper {
    public static Comment map(CommentCreateForm form){
        var commment = new Comment();
        commment.setName(form.getName());
        commment.setBody(form.getBody());
        commment.setEmail(form.getEmail());
        return commment;
    }

    public static  void map(CommentUpdateForm form, Comment comment){
        comment.setName(form.getName());
        comment.setBody(form.getBody());
        comment.setEmail(form.getEmail());

    }

    public static CommentDto map(Comment comment){
        var dto = new CommentDto();
        dto.setId(comment.getId());
        dto.setName(comment.getName());
        dto.setBody(comment.getBody());
        dto.setEmail(comment.getEmail());
        dto.setCreatedAt(comment.getCreatedAt());
        dto.setUpdatedAt(comment.getUpdatedAt());
        return dto;

    }
}
