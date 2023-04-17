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

    @Test
    public void setName() throws Exception{
        String expected = "Jennifer";
        item.setName("Jennifer");
        String actual = item.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPrice() throws Exception{
        String expected = "5.50";
        String actual = item.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void setPrice() throws Exception{
        String expected = "7.85";
        item.setPrice("7.85");
        String actual = item.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    public void getType() throws Exception{
        String expected = "Food";
        String actual = item.getType();
        assertEquals(expected, actual);
    }

    @Test
    public void setType() throws Exception{
        String expected = "Drink";
        item.setType("Drink");
        String actual = item.getType();
        assertEquals(expected, actual);
    }

    @Test
    public void getExpiration() throws Exception{
        String expected = "01/05/1995";
        String actual = item.getExpiration();
        assertEquals(expected, actual);
    }

    @Test
    public void setExpiration() throws Exception{
        String expected = "02/06/1996";
        item.setExpiration("01/06/1996");
        String actual = item.getExpiration();
        assertEquals(expected, actual);
    }



}
