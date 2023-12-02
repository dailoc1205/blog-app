package com.vti.blogapp.service;

import com.vti.blogapp.dto.PostDto;
import com.vti.blogapp.form.PostCreateFrom;
import com.vti.blogapp.mapper.PostMapper;
import com.vti.blogapp.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService{

    private  final PostRepository postRepository;
    @Override
    public PostDto create(PostCreateFrom from) {
        var post = PostMapper.map(from);
        var savedPost = postRepository.save(post);
        return  PostMapper.map(savedPost);
    }
}
