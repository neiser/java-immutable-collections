package de.qaware.tools.immutablecollection;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class MutableListTest {

    @Test
    void wrap() {
        List<String> mutableList = List.of("item1", "item2");
        ImmutableList<String> list1 = MutableList.wrap(mutableList);
        assertThat(list1.get(0)).isEqualTo("item1");
        assertThat(list1.stream()).containsExactly("item1", "item2");

        assertThat(list1).isEqualTo(mutableList);

        // TODO fix me!
        assertThatThrownBy(list1::immutableIterator).isInstanceOf(IllegalArgumentException.class);
    }
}