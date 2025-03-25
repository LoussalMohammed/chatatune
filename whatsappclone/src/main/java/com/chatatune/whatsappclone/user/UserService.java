package com.chatatune.whatsappclone.user;

import org.springframework.security.core.Authentication;

import java.util.List;

public interface UserService {
    List<UserResponse> finAllUsersExceptSelf(Authentication connectedUser);
}
