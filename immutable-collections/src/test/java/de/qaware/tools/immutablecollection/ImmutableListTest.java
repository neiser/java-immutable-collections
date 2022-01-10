package de.qaware.tools.immutablecollection;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ImmutableListTest {

    private static final List<String> LIST = List.of("item1", "item2");

    private ImmutableList<String> sut;

    @BeforeEach
    void setUp() {
        sut = MutableList.wrap(LIST);
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
        assertThat(sut).isEqualTo(LIST).isEqualTo(sut);
    }

    @Test
    void unwrap() {
        assertThat(sut.unwrap()).isSameAs(LIST);
    }

    @Test
    void immutableIterator() {
        assertThat(sut.immutableIterator().unwrap())
                .toIterable().containsExactlyElementsOf(LIST);
    }

    @Test
    void immutableSubList() {
        assertThat(sut.immutableSubList(0, 0).unwrap()).isEmpty();
        assertThat(sut.immutableSubList(1, 2).unwrap()).containsExactly("item2");
        assertThat(sut.immutableSubList(0, 2)).isEqualTo(sut).isEqualTo(LIST);
    }
}