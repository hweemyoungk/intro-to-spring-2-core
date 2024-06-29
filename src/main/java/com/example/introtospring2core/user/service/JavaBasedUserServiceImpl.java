package com.example.introtospring2core.user.service;

import com.example.introtospring2core.user.domain.PasswordEncoder;
import com.example.introtospring2core.user.domain.UserRepository;

public class JavaBasedUserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public JavaBasedUserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
}
