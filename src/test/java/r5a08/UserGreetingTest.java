package r5a08.tp1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class UserGreetingTest {

    @Test
    public void should_return_correct_greeting_when_name_is_provided (){
        //arrange
        UserGreeting userg = new UserGreeting();

        // act
        String actual = userg.formatGreeting("Farida");
        String expected= "Bonjour , Farida";

        //assert

        Assertions.assertEquals(actual,expected);
    }

    @Test
    public void should_throw_exception_with_name_empty(){
        // arrange
        UserGreeting userg = new UserGreeting();

        // act


        assertThatExceptionOfType(UserGreatingFailureException.class)
                .isThrownBy(()->{
                    userg.formatGreeting("");
                });

    }
}
