import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;

public class PasswordValidatorTest {
    PasswordValidator pv;

    @Before
    public void setUp() {
        pv = new PasswordValidator();
    }

    @Test
    public void shouldReturnFalseWhenPasswordIsEmpty() {
        boolean result = pv.isValid(" ");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenThereIsNoCapitalLetter() {
        boolean result = pv.isValid("aBc");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenThereIsNoSmallLetter() {
        boolean result = pv.isValid("ABNC");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenThereIsNoNumber() {
        boolean result = pv.isValid("ABCRT");

        assertFalse(result);
    }


    @Test
    public void shouldReturnFalseIfThereIsSpaceInThePassword() {
        boolean result = pv.isValid("a bcd");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfTheLengthIsMoreThanFifteenCharacters() {
        boolean result = pv.isValid("kartikeypokhriyalisanicon");

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseIfThePasswordIsLessThanEightCharacters() {
        boolean result = pv.isValid("abc");

        assertFalse(result);
    }
}