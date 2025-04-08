import org.junit.Test;
import static org.junit.Assert.*;

public class GestorArrayTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        GestorArray testGestor = new GestorArray();
        int[] array = {1, 2, 3,4};
        testGestor.getElement(array, 5);
    }
}