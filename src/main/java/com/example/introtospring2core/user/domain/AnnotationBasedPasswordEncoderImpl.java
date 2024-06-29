package com.example.introtospring2core.user.domain;

import com.example.introtospring2core.user.annotation.Lightweight;
import org.springframework.stereotype.Component;

@Component
@Lightweight
public class AnnotationBasedPasswordEncoderImpl implements PasswordEncoder {
}
