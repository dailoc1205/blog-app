package com.vti.blogapp.service;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateFrom;
import com.vti.blogapp.form.PostUpdateForm;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface PostService {

    Page<PostDto> findAll(Pageable pageable);
    PostDto create(PostCreateFrom from);

    PostDto update(PostUpdateForm form, Long id);
}
