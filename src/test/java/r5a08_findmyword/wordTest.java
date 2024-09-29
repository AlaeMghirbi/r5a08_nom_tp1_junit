package r5a08_findmyword;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class wordTest {
    @Test
    public void should_check_one_correct_letter(){
        // Arrange
        Word word = new Word("e"); // Le mot a déviner fait une lettre
        /*word.guess("B"); // tentative du joueur*/

        //act

        Letter expected= Letter.CORRECT;
        Letter actual = (word.guess("e")).letter(0);

        //assert
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void should_check_one_incorrect_letter(){
        // Arrange
        Word word = new Word("e"); // Le mot a déviner fait une lettre
        /*word.guess("B"); // tentative du joueur*/

        //act

        Letter expected= Letter.INCORRECT;
        Letter actual = (word.guess("a")).letter(0);

        //assert
        Assertions.assertEquals(expected,actual);
    }

}
