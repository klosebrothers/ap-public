package de.klosebrothers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.klosebrothers.streams.OldestPerson.getOldestPerson;
import static de.klosebrothers.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class OldestPersonTest {

    @Test
    void getOldestPersonShouldReturnOldestPerson() {
        final var collection = List.of(SARA, EVA, VIKTOR);

        final var result = getOldestPerson(collection);

        assertThat(result).isEqualTo(EVA);
    }

}
