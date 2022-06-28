package demo;

import org.checkerframework.checker.signature.qual.ClassGetName;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.temporal.ChronoUnit;
import java.util.EnumSet;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedTest {
    static App cal;
    @BeforeAll
    static void initObject() {
        cal = new App();
    }

    @Test
    @org.junit.jupiter.api.RepeatedTest(value = 10, name = "Multiplication {currentRepetition} of {totalRepetitions}")
    void testingMultiplication() {
        assertEquals(10, cal.multiply(2,5));
    }

    @ParameterizedTest
    @ValueSource(strings = {"DipanapiD", "  ", "cAr", "madam", "xyz"})
    void testPalindromeChecker(String argv) {
        if (argv.equals("cAr") || argv.equals("xyz"))
            assertFalse(cal.isPalindrome(argv));
        else
            assertTrue(cal.isPalindrome(argv));
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = { " ", " ", "\t", "\n" })
    void nullEmptyAndBlankStrings(String text) {
        assertTrue(text == null || text.trim().isEmpty());
    }

    @ParameterizedTest
    @EnumSource(names = { "DAYS", "HOURS" })
    void testWithEnumSourceInclude(ChronoUnit unit) {
        assertTrue(EnumSet.of(ChronoUnit.DAYS, ChronoUnit.HOURS).contains(unit));
    }

    @ParameterizedTest
    @MethodSource("stringProvider")
    void testWithExplicitMethodSrc(String argument) {
        assertNotNull(argument);
    }

    static Stream<String> stringProvider() {
        return Stream.of("Dip", "DD");
    }

    @ParameterizedTest
    @CsvSource({
            "apple, 1",
            "banana, 2",
            "'lemon, lime', 0xF1",
            "strawberry, 700000"
    })
//    @CsvSource(delimiter = '|', quoteCharacter = '"', textBlock = """
//#-----------------------------
//# FRUIT | RANK
//#-----------------------------
//apple | 1
//#-----------------------------
//banana | 2
//#-----------------------------
//"lemon lime" | 0xF1
//#-----------------------------
//strawberry | 700_000
//#-----------------------------
//""")
    void testWithCsvSource(String fruit, int rank) {
        assertNotNull(fruit);
        assertNotEquals(0, rank);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void failsIfExecutionTimeExceeds100Milliseconds() {
//        int iii = new Scanner(System.in).nextInt();
        System.out.println(23);
    }

    @AfterAll
    static void dealloc() {
        cal = null;
    }
}


class testingBooks {
    @DisplayName("Testing Implicit conversion")
    @ParameterizedTest
    @ValueSource(strings = "nice one")
    void testTitle(Book x) {
        assertNotNull(x.getTitle());
        assertEquals("nice one", x.getTitle());
    }
}