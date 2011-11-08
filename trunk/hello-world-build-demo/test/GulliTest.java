import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GulliTest {

    @Test
    public void should_say_hello_from_gulli() {
        assertEquals("Here is Gulli!", new Gulli().me());
    }

}
