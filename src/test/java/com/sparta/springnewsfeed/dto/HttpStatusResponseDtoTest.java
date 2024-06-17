package com.sparta.springnewsfeed.dto;

import com.sparta.springnewsfeed.common.HttpStatusResponseDto;
import com.sparta.springnewsfeed.common.ResponseCode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

class HttpStatusResponseDtoTest {
    static ResponseCode responseCode;

    @BeforeAll
    static void setUpResponseCode() {
        responseCode = mock(ResponseCode.class);
    }

    @Test
    @DisplayName("data 없는 Http 응답 DTO 생성 테스트")
    void testHttpStatusResponseDto() {
        // given
        HttpStatusResponseDto httpStatusResponseDto = new HttpStatusResponseDto(responseCode);

        // when-then
        assertNotNull(httpStatusResponseDto);
    }

    @Test
    @DisplayName("data 있는 Http 응답 DTO 생성 테스트")
    void testHttpStatusResponseDtoWithoutData() {
        // given
        HttpStatusResponseDto httpStatusResponseDto = new HttpStatusResponseDto(responseCode, "12345");

        // when-then
        assertNotNull(httpStatusResponseDto);
    }


    @Test
    @DisplayName("data 없는 Http 응답 DTO data가 null인지 테스트")
    void testHttpStatusResponseDataReturnNull() {
        // given
        HttpStatusResponseDto httpStatusResponseDto = new HttpStatusResponseDto(responseCode);

        // when-then
        Assertions.assertThat(httpStatusResponseDto.getData()).isNull();
    }

    @Test
    @DisplayName("data 있는 Http 응답 DTO data가 null인지 테스트")
    void testHttpStatusResponseDataReturnNotNull() {
        // given
        HttpStatusResponseDto httpStatusResponseDto = new HttpStatusResponseDto(responseCode, "12345");

        // when-then
        Assertions.assertThat(httpStatusResponseDto.getData()).isNotNull();
    }
}