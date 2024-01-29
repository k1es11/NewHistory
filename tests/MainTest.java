import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void firstLessThanSecond() {
        long[] res = Main.solve((long) 980, 2, 12, 10, 30, 1,
                980, 3, 1, 10, 31, 37);
        Assertions.assertEquals(17, res[0]);
        Assertions.assertEquals(96, res[1]);
    }

    @Test
    public void firstMoreThanSecond() {
        long[] res = Main.solve(9009, 9, 11, 12, 21, 11,
                1001, 5, 20, 14, 15, 16);

        Assertions.assertEquals(2923033, res[0]);
        Assertions.assertEquals(79555, res[1]);
    }

    @Test
    public void firstEqualsSecond() {
        long[] res = Main.solve(9009, 9, 11, 12, 21, 11,
                9009, 9, 11, 12, 21, 11);

        Assertions.assertEquals(0, res[0]);
        Assertions.assertEquals(0, res[1]);
    }
}
