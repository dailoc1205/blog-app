package com.vti.blogapp.service;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateFrom;

public interface PostService {
    PostDto create(PostCreateFrom from);
}
