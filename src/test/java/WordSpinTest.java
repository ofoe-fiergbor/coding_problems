import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class WordSpinTest {

    @Test
    void wordSpinningTest1() {
        Assertions.assertThat(WordSpin.spinWords("Hey fellow warriors")).isEqualTo("Hey wollef sroirraw");
    }

    @Test
    void wordSpinningTest2() {
        Assertions.assertThat(WordSpin.spinWords("This is a test")).isEqualTo( "This is a test");
    }

    @Test
    void wordSpinningTest3() {
        Assertions.assertThat(WordSpin.spinWords("This is another test")).isEqualTo("This is rehtona test");
    }
}