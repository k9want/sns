package com.example.sns.controller.response;

import com.example.sns.model.Post;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PostResponse {

    private Long id;
    private String title;
    private String body;
    private UserResponse user;
    private Timestamp registeredAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    public static PostResponse fromPost(Post post) {
        return new PostResponse(
            post.getId(),
            post.getTitle(),
            post.getBody(),
            UserResponse.fromUser(post.getUser()),
            post.getRegisteredAt(),
            post.getUpdatedAt(),
            post.getDeletedAt()
        );
    }
}
