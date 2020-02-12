package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingGameTest {

    @DisplayName("입력받은 문자를 trim 후 쉼표기준으로 하나씩 자르기")
    @Test
    void splitTest() {
        InputDTO input = new InputDTO("pobi,crong,  honux  ");
        assertThat(input.getNames()).isEqualTo(Arrays.asList("pobi", "crong", "honux"));
    }
}
