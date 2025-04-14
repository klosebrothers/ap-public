package de.klosebrothers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.klosebrothers.streams.Sum.calculate;
import static org.assertj.core.api.Assertions.assertThat;

/*
Sum all elements of a collection
 */
class SumTest {

    @Test
    void calculateShouldReturnSumOfAllIntegersInCollection() {
        final var numbers = List.of(1, 2, 3, 4, 5);

        assertThat(calculate(numbers)).isEqualTo(1 + 2 + 3 + 4 + 5);
    }

}
