import org.junit.Test;

public class ArrayManagerTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testGetOutOfBounds() {
        ArrayManager testarrayManager = new ArrayManager();
        int[] array = {1, 2, 3,4};
        testarrayManager.getElement(array, 5);
    }
}