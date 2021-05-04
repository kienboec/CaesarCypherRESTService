package at.kienboeck.swlcm.cypher;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CaesarCypherControllerTest {
    @Test
    public void test_Given_ARequestToMakeCaesarCypherString_When_IEnterTheStringSTORY_Then_IExpectTheValueTUPSZ() {
        // arrange
        CaesarCypherController controller = new CaesarCypherController();

        // act
        String actual = controller.GetCaesarCode("STORY");

        // assert
        Assertions.assertEquals("TUPSZ", actual);
    }
}
