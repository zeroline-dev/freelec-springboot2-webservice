package com.zeroline.book.springboot.web;

import com.zeroline.book.springboot.service.posts.PostsService;
import com.zeroline.book.springboot.web.dto.PostsListResponseDto;
import com.zeroline.book.springboot.web.dto.PostsResponseDto;
import com.zeroline.book.springboot.web.dto.PostsSaveRequestDto;
import com.zeroline.book.springboot.web.dto.PostsUpdateReqeustDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto) {
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id,
                       @RequestBody PostsUpdateReqeustDto requestDto){
        return postsService.update(id, requestDto);
    }

    @DeleteMapping("/api/v1/posts/{id}")
    public Long delete(@PathVariable Long id) {
        postsService.delete(id);
        return id;
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto fineById (@PathVariable Long id){
        return postsService.findById(id);
    }

    @GetMapping("/api/v1/posts/list")
    public List<PostsListResponseDto> findAll() {
        return postsService.findAllDesc();
    }


}
