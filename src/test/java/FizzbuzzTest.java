import org.junit.Test;
import static org.junit.Assert.*;
//import static org.junit.matchers.JUnitMatchers.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class FizzbuzzTest {
    @Test
    public void returnsTwoWhenTwo() {
        assertThat(Fizzbuzz.makeFizzbuzz(2), is("2"));
    }

    @Test
    public void returnsFizzWhenThree() {
        assertThat(Fizzbuzz.makeFizzbuzz(3), is("Fizz"));
    }

    @Test
    public void returnsBuzzWhenFive() {
        assertThat(Fizzbuzz.makeFizzbuzz(5), is("Buzz"));
    }
}
