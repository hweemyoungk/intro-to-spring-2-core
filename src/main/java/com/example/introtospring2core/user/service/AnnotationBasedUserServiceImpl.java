package com.example.introtospring2core.user.service;

import com.example.introtospring2core.user.annotation.Lightweight;
import com.example.introtospring2core.user.domain.PasswordEncoder;
import com.example.introtospring2core.user.domain.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class AnnotationBasedUserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final Map<String, PasswordEncoder> stringPasswordEncoderMap;

    //Not works:
    //@ConstructorProperties({"userRepository", "annotationBasedPasswordEncoderImpl"})
    public AnnotationBasedUserServiceImpl(UserRepository userRepository,
                                          //@Qualifier("annotationBasedPasswordEncoderImpl") PasswordEncoder passwordEncoder) {
                                          @Lightweight PasswordEncoder pwEncoder,
                                          Map<String, PasswordEncoder> stringPasswordEncoderMap) {
        this.userRepository = userRepository;
        this.passwordEncoder = pwEncoder;
        this.stringPasswordEncoderMap = stringPasswordEncoderMap;
    }
}
