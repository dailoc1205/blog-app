package com.vti.blogapp.mapper;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.entity.Post;
import com.vti.blogapp.form.PostCreateForm;
import com.vti.blogapp.form.PostUpdateForm;

public class PostMapper {
    public  static Post map(PostCreateForm from){
        var post = new Post();
        post.setTitle(from.getTitle());
        post.setDescription(from.getDescription());
        post.setContent(from.getContent());
        return post;
    }

    public static Post map(PostUpdateForm form){
        var post = new Post();
        post.setTitle(form.getTitle());
        post.setDescription(form.getDescription());
        post.setContent(form.getContent());
        return post;
    }

    public static PostDto map(Post post){
        var dto = new PostDto();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setDescription(post.getDescription());
        dto.setContent(post.getContent());
        dto.setCreatedAt(post.getCreatedAt());
        dto.setUpdatedAt(post.getUpdatedAt());
        return dto;
    }
}
