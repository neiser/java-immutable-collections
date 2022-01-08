package de.qaware.tools.immutablecollection;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ImmutableListTest {

    private static final List<String> MUTABLE_LIST = List.of("item1", "item2");

    private ImmutableList<String> sut;

    @BeforeEach
    void setUp() {
        sut = MutableList.wrap(MUTABLE_LIST);
    }

    @Test
    void get() {
        assertThat(sut.get(0)).isEqualTo("item1");
        assertThat(sut.get(1)).isEqualTo("item2");
    }

    @Test
    void stream() {
        assertThat(sut.stream()).containsExactly("item1", "item2");
    }

    @Test
    void equals() {
        assertThat(sut).isEqualTo(MUTABLE_LIST);
    }

    @Test
    void unwrap() {
        assertThat(sut.unwrap()).isSameAs(MUTABLE_LIST);
    }

    @Test
    void immutableIterator() {
        assertThat(sut.immutableIterator().unwrap()).toIterable().containsExactlyElementsOf(MUTABLE_LIST);
    }
}