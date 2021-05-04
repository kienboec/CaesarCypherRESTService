import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void test_Given_aWelcomeString_When_CallingTheMethodToGetTheWelcomeString_Then_TheStringShouldBeCorret(){
        // arrange

        // act
        var actual = Main.GetWelcomeString();

        // assert
        Assertions.assertEquals("hello cypher sample", actual);
    }
}
