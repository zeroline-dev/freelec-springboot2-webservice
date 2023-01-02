package com.zeroline.book.springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateReqeustDto {
    private String title;
    private String content;

    @Builder
    public PostsUpdateReqeustDto(String title, String content){
        this.title = title;
        this.content = content;
    }
}

