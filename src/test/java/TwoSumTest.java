import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class TwoSumTest {

    @Test
    void solutionTest1() {
        int[] testArray = {2,7,11,15};
        int target = 9;
        Assertions.assertThat(TwoSum.twoSum(testArray, target)).containsExactly(0, 1);
    }

    @Test
    void solutionTest2() {
        int[] testArray = {3,2,4};
        int target = 6;
        Assertions.assertThat(TwoSum.twoSum(testArray, target)).containsExactly(1, 2);
    }

}