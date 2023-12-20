package com.vti.blogapp.controller;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateForm;
import com.vti.blogapp.form.PostFilterPorm;
import com.vti.blogapp.form.PostUpdateForm;
import com.vti.blogapp.service.PostService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@Getter
@Setter
@RestController
@AllArgsConstructor
public class PostController {
    private final PostService postService;
    @GetMapping("/api/v1/posts")
    public Page<PostDto> findAll(/*@RequestParam(required = false)*/ PostFilterPorm form, Pageable pageable) {
        return postService.findAll(form,pageable);
    }
    @GetMapping("/api/v1/posts/{id}")
    public PostDto findById(@PathVariable("id") Long id) {
        return postService.findById(id);
    }


    @PostMapping("/api/v1/posts")
    public PostDto create(@RequestBody PostCreateForm from){

        return postService.create(from);
    }
    @PutMapping("/api/v1/posts/{id}")
    public PostDto update(@RequestBody PostUpdateForm form, @PathVariable("id") Long id){
        return postService.update(form, id);
    }
    @DeleteMapping("/api/v1/posts/{id}")
    public void deleteById (@PathVariable("id") Long id){
        postService.deleteById(id);
    }
}
