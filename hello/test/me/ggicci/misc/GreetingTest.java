import me.ggicci.misc.Greeting;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingTest {
    @Test
    public void testHello() {
        assertEquals("Hello, world!", Greeting.hello("world!"));
        assertEquals("Hello, Ggicci", Greeting.hello("Ggicci"));
    }
}
