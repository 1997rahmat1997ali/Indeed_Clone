package com.ali.server.services;

import com.ali.server.dto.PostDTO;
import com.ali.server.model.PostModel;

import java.util.List;

public interface PostService {
    public List<PostModel> getAllPosts();

    public PostModel savePost(PostDTO post);
}
