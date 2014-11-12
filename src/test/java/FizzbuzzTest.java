import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class FizzbuzzTest {
    @Test
    public void returnsTwoWhenTwo() {
       assertThat(Fizzbuzz.makeFizzbuzz(2), is("2"));
    }

    @Test
    public void returnsFourWhenFour() {
       assertThat(Fizzbuzz.makeFizzbuzz(4), is("4"));
    }

    @Test
    public void returnsFizzWhenThree() {
        assertThat(Fizzbuzz.makeFizzbuzz(3), is("Fizz"));
    }

    @Test
    public void returnsBuzzWhenFive() {
        assertThat(Fizzbuzz.makeFizzbuzz(5), is("Buzz"));
    }

    @Test
    public void returnsFizzBuzzWhenFifteen() {
        assertThat(Fizzbuzz.makeFizzbuzz(15), is("FizzBuzz"));
    }
}
