package my.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorApplicationTests {
    MainService mainService = new MainService();

    @Test
    void test_sum() {
        assertEquals(3, mainService.sum(1, 2));
    }

}
