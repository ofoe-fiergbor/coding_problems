import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class ReverseIntegerTest {

    @Test
    void reverse1() {
        assertThat(ReverseInteger.reverse(123)).isEqualTo(321);
    }

    @Test
    void reverse2() {
        assertThat(ReverseInteger.reverse(-123)).isEqualTo(-321);
    }

    @Test
    void reverse3() {
        assertThat(ReverseInteger.reverse(120)).isEqualTo(21);
    }
}