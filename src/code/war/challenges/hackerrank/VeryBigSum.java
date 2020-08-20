package code.war.challenges.hackerrank;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VeryBigSum {

    public static long aVeryBigSum(long[] ar) {
        long result = 0;

        for (long temp : ar) {
            result += temp;
        }
        return result;
    }

    @Test
    public void test_aVeryBigSum() {
        long[] array = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        Assert.assertEquals(5000000015L, VeryBigSum.aVeryBigSum(array));
    }
}
