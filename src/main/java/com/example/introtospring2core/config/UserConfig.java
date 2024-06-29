package com.example.introtospring2core.config;

import com.example.introtospring2core.user.domain.JavaBasedPasswordEncoderImpl;
import com.example.introtospring2core.user.domain.PasswordEncoder;
import com.example.introtospring2core.user.domain.UserRepository;
import com.example.introtospring2core.user.infra.JavaBasedUserRepositoryImpl;
import com.example.introtospring2core.user.service.UserService;
import com.example.introtospring2core.user.service.JavaBasedUserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.introtospring2core.user")
public class UserConfig {
    @Bean
    UserRepository userRepository() {
        return new JavaBasedUserRepositoryImpl();
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return new JavaBasedPasswordEncoderImpl();
    }

    @Bean
    UserService userService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        return new JavaBasedUserServiceImpl(userRepository, passwordEncoder);
    }
}
