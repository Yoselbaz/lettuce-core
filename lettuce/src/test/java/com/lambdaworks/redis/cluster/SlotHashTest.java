package com.lambdaworks.redis.cluster;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * @author <a href="mailto:mpaluch@paluch.biz">Mark Paluch</a>
 * @since 27.05.14 08:43
 */
public class SlotHashTest {
    @Test
    public void testHash() throws Exception {
        int result = SlotHash.getSlot("123456789".getBytes());
        assertThat(result).isEqualTo(0x31C3);

    }

    @Test
    public void testHashWithHash() throws Exception {
        int result = SlotHash.getSlot("key{123456789}a".getBytes());
        assertThat(result).isEqualTo(0x31C3);

    }
}
