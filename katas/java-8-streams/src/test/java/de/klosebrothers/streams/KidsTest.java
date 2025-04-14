package de.klosebrothers.streams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static de.klosebrothers.streams.Kids.getKidNames;
import static de.klosebrothers.streams.util.TestData.*;
import static org.assertj.core.api.Assertions.assertThat;

class KidsTest {

    @Test
    void getKidNameShouldReturnNamesOfYoungerThan18() {
        final var collection = List.of(SARA, EVA, VIKTOR, ANNA);

        final var result = getKidNames(collection);

        assertThat(result)
                .contains("Sara", "Anna")
                .doesNotContain("Viktor", "Eva");
    }

}
