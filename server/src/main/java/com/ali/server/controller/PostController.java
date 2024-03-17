package com.ali.server.controller;

import com.ali.server.constants.APIConstants;
import com.ali.server.dto.PostDTO;
import com.ali.server.model.PostModel;
import com.ali.server.services.PostService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin
public class PostController {


    final PostService postService;

    @GetMapping(APIConstants.GET_ALL_POSTS)
    public List<PostModel> getAllPosts() {
        log.info("Getting all the posts #####");
        return this.postService.getAllPosts();
    }

    @PostMapping(APIConstants.SAVE_POST)
    public PostModel savePost(@Valid @RequestBody PostDTO postDTORequest) {
        log.info("Saving post #####");
        return this.postService.savePost(postDTORequest);
    }
}