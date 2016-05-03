import me.raymond.Helloworld;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by raymond on 5/3/16.
 */
public class HelloworldTest {

    private Helloworld helloworld;

    @Before
    public void setup() {
        helloworld = new Helloworld();
    }

    @Test
    public void first_unit_test() {
        helloworld.call("a");
        helloworld.call("b");
    }
}
