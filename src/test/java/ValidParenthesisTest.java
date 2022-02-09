import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesisTest {

    @Test
    void isValid1() {
        Assertions.assertThat(ValidParenthesis.isValid("()")).isEqualTo(true);
    }

    @Test
    void isValid2() {
        Assertions.assertThat(ValidParenthesis.isValid("()[]{}")).isEqualTo(true);
    }

    @Test
    void isValid3() {
        Assertions.assertThat(ValidParenthesis.isValid("(]")).isEqualTo(false);
    }
}