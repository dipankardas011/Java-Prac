/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static java.time.Duration.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static org.junit.jupiter.api.condition.OS.*;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.condition.*;

class AppTest {
    static App obj;

    @BeforeAll
    static void initAll() {
        obj = new App();
    }

    @Test
    @DisplayName("Nice Work")
    void appHasAGreeting() {
        assertNotNull(obj.getGreeting(), "app should have a greeting");
    }

    @Test
    @DisplayName("Addition Checks")
    void apppHasAddition() {
        assertEquals(3 + 2, obj.addition(3, 2));
    }

    @Test
    void checkNumber() {
        assertEquals(false, obj.Positive(-1));
        assertEquals(true, obj.Positive(9));
        assertEquals(false, obj.Positive(-44));

        assertAll("Properties", () -> {
                    String ret = obj.getGreeting();
                    assertNotNull(ret);

                    assertAll("Order Checks",
                            () -> assertTrue(ret.startsWith("H")),
                            () -> assertTrue(ret.endsWith("!")));
                },
                () -> {
                    String ret = obj.getGreeting();
                    assertNotNull(ret);
                });
    }

    @Test
    void dividionChecks() {
        Exception e = assertThrows(ArithmeticException.class, () -> obj.divide(3, 0));
        // assertEquals("/ by zero", e.getMessage());
    }

    @Test
    void timeoutNotExceededWithResult() {
        // The following assertion succeeds, and returns the supplied object.
        String actualResult = assertTimeout(ofMinutes(20000), () -> {
            return "a result";
        });
        assertEquals("a result", actualResult);
    }

    @Test
    void timeoutExceeded() {
        // The following assertion fails with an error message similar to:
        // execution exceeded timeout of 10 ms by 91 ms
        assertTimeout(ofMillis(10), () -> {
            // Simulate task that takes more than 10 ms.
            Thread.sleep(1);
        });
    }

    @Test
    void timeoutExceededWithPreemptiveTermination() {
        // The following assertion fails with an error message similar to:
        // execution timed out after 10 ms
        assertTimeoutPreemptively(ofMillis(10), () -> {
            // use new CountDownLatch(0).await(); 
            // Simulate task that takes more than 10 ms.
            new CountDownLatch(0).await();
        });
    }
}

@Disabled("Waiting for #1 gets resolved")
class AssumptionsDemo {
    private final App calculator = new App();
    @Test
    void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getenv("ENV")));
// remainder of test
    }
    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getenv("ENV")),
                () -> "Aborting test: not on developer workstation");
// remainder of test
    }
    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
// perform these assertions only on the CI server
                    assertEquals(2, calculator.divide(4, 2));
                });
// perform these assertions in all environments
        assertEquals(42, calculator.multiply(6, 7));
    }
}

class OsChecks {
    @Test
    @EnabledOnOs(MAC)
    void onlyOnMacOs() {
// ...
    }
    @TestOnMac
    void testOnMac() {
// ...
    }
    @Test
    @EnabledOnOs({ LINUX, MAC })
    void onLinuxOrMac() {
// ...
    }
    @Test
    @DisabledOnOs(WINDOWS)
    void notOnWindows() {
// ...
    }
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Test
    @EnabledOnOs(MAC)
    @interface TestOnMac {
    }


    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_17})
    void nice() {
        System.out.println("Supported Java Version");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_13)
    void minSpec() {
        System.out.println("Your PC does not meet the min system requirements");
    }
}


class ExternalCustomConditionDemo {
    @Test
    @EnabledIf("demo.ExternalCondition#customCondition")
    void enabled() {
// ...
    }
}
class ExternalCondition {
    static boolean customCondition() {
        return true;
    }
}