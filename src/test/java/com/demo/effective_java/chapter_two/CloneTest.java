package com.demo.effective_java.chapter_two;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CloneTest {

    @Test
    public void testCloneWithPrimitives() {
        Rectangle r1 = new Rectangle(2,3);
        Rectangle r2 = r1.clone();

        assertThat(r1.getX()).isEqualTo(r2.getX());
        assertThat(r1.getY()).isEqualTo(r2.getY());
    }
}
