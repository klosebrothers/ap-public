package de.klosebrothers.streams;

import de.klosebrothers.streams.model.Person;
import org.junit.jupiter.api.Test;

import java.util.List;

import static de.klosebrothers.streams.PeopleStats.getStats;
import static de.klosebrothers.streams.util.TestData.*;
import static java.util.Objects.requireNonNull;
import static org.assertj.core.api.Assertions.assertThat;

class PeopleStatsTest {

    private static final List<Person> collection = List.of(SARA, EVA, VIKTOR);

    @Test
    void getStatsShouldReturnAverageAge() {
        final var stats = getStats(collection);

        assertThat(requireNonNull(stats).getAverage()).isEqualTo((double) (4 + 40 + 42) / 3);
    }

    @Test
    void getStatsShouldReturnNumberOfPeople() {
        final var stats = getStats(collection);

        assertThat(requireNonNull(stats).getCount()).isEqualTo(3);
    }

    @Test
    void getStatsShouldReturnMaximumAge() {
        final var stats = getStats(collection);

        assertThat(requireNonNull(stats).getMax()).isEqualTo(42);
    }

    @Test
    void getStatsShouldReturnMinimumAge() {
        final var stats = getStats(collection);

        assertThat(requireNonNull(stats).getMin()).isEqualTo(4);
    }

    @Test
    void getStatsShouldReturnSumOfAllAges() {
        final var stats = getStats(collection);

        assertThat(requireNonNull(stats).getSum()).isEqualTo(40 + 42 + 4);
    }

}
