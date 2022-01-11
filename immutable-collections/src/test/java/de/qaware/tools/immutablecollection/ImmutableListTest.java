package de.qaware.tools.immutablecollection;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("AssertBetweenInconvertibleTypes")
class ImmutableListTest {

    private static final List<String> LIST = List.of("item1", "item2");

    private ImmutableList<String> sut;

    @BeforeEach
    void setUp() {
        sut = AlmostImmutableList.wrap(LIST);
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
        assertThat(sut)
                .isEqualTo(LIST)
                .isEqualTo(sut);
    }

    @Test
    void unwrap() {
        assertThat(AlmostImmutableList.wrap(LIST).unwrap()).isSameAs(LIST);
    }

    @Test
    void immutableIterator() {
        assertThat(ImmutableListTest.<Iterator<String>>forceUnwrap(sut.immutableIterator()))
                .toIterable().containsExactlyElementsOf(LIST);
    }

    @SuppressWarnings("unchecked")
    private static <T> T forceUnwrap(Object unwrappable) {
        if (unwrappable instanceof Unwrappable<?>) {
            return (T) ((Unwrappable<?>) unwrappable).unwrap();
        }
        throw new IllegalStateException("Cannot unwrap " + unwrappable);
    }

    @Test
    void immutableSubList() {
        assertThat(sut.immutableSubList(0, 0)).isEqualTo(emptyList());
        assertThat(sut.immutableSubList(1, 2)).isEqualTo(LIST.subList(1, 2));
        assertThat(sut.immutableSubList(0, 2)).isEqualTo(sut).isEqualTo(LIST);
    }


}