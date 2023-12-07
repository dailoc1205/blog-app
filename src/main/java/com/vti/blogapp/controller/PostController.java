package com.vti.blogapp.controller;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateFrom;
import com.vti.blogapp.service.PostService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Getter
@Setter
@RestController
@AllArgsConstructor
public class PostController {
    private final PostService postService;

    @PostMapping("/api/v1/posts")
    public PostDto create(@RequestBody PostCreateFrom from){

        return postService.create(from);
    }
}
