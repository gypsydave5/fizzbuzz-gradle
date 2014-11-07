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
}
