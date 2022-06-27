package com.ownproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor

public class CreateUserResponse {

    protected final UUID userId;
    protected final String message;

}
