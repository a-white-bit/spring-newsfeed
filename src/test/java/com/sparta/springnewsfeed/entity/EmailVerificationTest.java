package com.sparta.springnewsfeed.entity;

import com.sparta.springnewsfeed.user.EmailVerification;
import com.sparta.springnewsfeed.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.time.Duration;
import java.time.LocalDateTime;

class EmailVerificationTest {
    @Mock
    User user;

    @Test
    @DisplayName("이메일 인증 유효기간이 180초인지 확인")
    void testIsValidFor180Seconds() {
        // given
        LocalDateTime startTime = LocalDateTime.now(); // 야매 추정
        EmailVerification emailVerification = new EmailVerification(user, "123456");

        // when-then
        LocalDateTime expiryDate = emailVerification.getExpiryDate();
        long diffSecond = Duration.between(startTime, expiryDate).toSeconds();
        Assertions.assertEquals(180L, diffSecond);
    }
}