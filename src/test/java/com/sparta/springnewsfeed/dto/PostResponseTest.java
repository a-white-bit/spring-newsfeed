package com.sparta.springnewsfeed.dto;

import com.sparta.springnewsfeed.post.Post;
import com.sparta.springnewsfeed.post.PostResponse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class PostResponseTest {
    static Post post;

    @BeforeAll
    static void setUpPost() {
        post = mock(Post.class);
    }

    @Test
    @DisplayName("Post Respose DTO 생성 테스트")
    void testPostResponseDTO() {
        // given
        PostResponse postResponse = new PostResponse(post);

        // when-then
        Assertions.assertThat(postResponse).isNotNull();
    }
}