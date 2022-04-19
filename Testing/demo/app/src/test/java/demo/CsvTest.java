package demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/file.csv", numLinesToSkip = 1)
    void testWithCsvFileSourceFromClasspath(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/file.csv", numLinesToSkip = 1)
    void testWithCsvFileSourceFromFile(String country, int reference) {
        assertNotNull(country);
        assertNotEquals(0, reference);
    }
//    @ParameterizedTest(name = "[{index}] {arguments}")
//    @CsvFileSource(resources = "/file.csv", useHeadersInDisplayName = true)
//    void testWithCsvFileSourceAndHeaders(String country, int reference) {
//        assertNotNull(country);
//        assertNotEquals(0, reference);
//    }
}
