package com.example.sns.model;

import com.example.sns.model.entity.UserEntity;
import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;

// todo : implement
@Getter
@AllArgsConstructor
public class User {

    private Long Id;
    private String userName;
    private String password;
    private UserRole userRole;
    private Timestamp registeredAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;

    public static User fromEntity(UserEntity entity) {
        return new User(
            entity.getId(),
            entity.getUserName(),
            entity.getPassword(),
            entity.getRole(),
            entity.getRegisteredAt(),
            entity.getUpdatedAt(),
            entity.getDeletedAt()
        );
    }
}
