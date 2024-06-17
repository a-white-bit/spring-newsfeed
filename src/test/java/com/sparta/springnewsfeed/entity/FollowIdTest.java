package com.sparta.springnewsfeed.entity;

import com.sparta.springnewsfeed.follow.FollowId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FollowIdTest {

    @Test
    void testEqualsisTrue() {
        // given
        FollowId follow1 = new FollowId(10L, 20L);
        FollowId follow2 = new FollowId(10L, 20L);

        // when-then
        Assertions.assertTrue(follow1.equals(follow2));
    }

    @Test
    void testEqualsisFalse() {
        // given
        FollowId follow1 = new FollowId(10L, 20L);
        FollowId follow2 = new FollowId(10L, 30L);

        // when-then
        Assertions.assertFalse(follow1.equals(follow2));
    }

    @Test
    void testHashCode() {
        // given
        FollowId follow1 = new FollowId(10L, 20L);
        FollowId follow2 = new FollowId(10L, 20L);

        // when-then
        Assertions.assertEquals(follow1.hashCode(), follow2.hashCode());
    }
}