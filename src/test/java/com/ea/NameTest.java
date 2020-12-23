package com.ea;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    @Test
    void sortingListOfUnsortedNames_ShouldProduceListOfNamesSortedByLastNameAndFirstName() {
        List<Name> names = Arrays.asList(new Name("John", "Smith"),
                                         new Name("Jake", "Smith"),
                                         new Name("David", "Jones"),
                                         new Name("Joe", "Jones"));
        List<Name> sortedNames = Arrays.asList(new Name("David", "Jones"),
                                               new Name("Joe", "Jones"),
                                               new Name("Jake", "Smith"),
                                               new Name("John", "Smith"));

        Collections.sort(names);

        assertEquals(sortedNames, names);
    }
}