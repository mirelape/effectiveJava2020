package com.demo.effective_java.chapter_two;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.TreeSet;

import static org.assertj.core.api.Assertions.assertThat;

public class ComparableTest {

    @Test
    public void testBigDecimalEqualsConsistency() {

        BigDecimal b1 = new BigDecimal("1.0");
        BigDecimal b2 = new BigDecimal("1.00");

        assertThat(b1.equals(b2)).isFalse();

        TreeSet<BigDecimal> ts = new TreeSet<>();
        ts.add(b1);
        ts.add(b2);

        assertThat(ts.size()).isEqualTo(1);
    }
}
