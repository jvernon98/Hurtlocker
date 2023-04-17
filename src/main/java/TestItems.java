import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestItems {
    Item item;
    @Test
    public void getName() throws Exception{
        String expected = "Milk";
        String actual = item.getName();
        assertEquals(expected, actual);
    }
}
