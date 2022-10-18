import org.junit.Test;

import static org.junit.Assert.*;

public class PalabrasTest {

    private Palabras palabra = new Palabras();

    @Test
    public void concatTest(){
        String result = palabra.concat("ho","la");
        assertEquals("hola",result);
    }

    @Test
    public void countTest(){
        int result = palabra.count("hola");
        assertEquals(4,result);
    }

    @Test
    public void splitTest(){
        String[] result = palabra.split("hola como estas");
        String[] expected = {"hola","como","estas"};
        assertEquals(expected.length,result.length);
        for(int i = 0; i< result.length; i++){
            assertEquals(expected[i],result[i]);
        }
    }

    @Test
    public void containsTest(){
        boolean result = palabra.containsLetter("hola", 'a');
        assertTrue(result);
    }

    @Test
    public void notContainsTest(){
        boolean result = palabra.containsLetter("hola", 'e');
        assertFalse(result);
    }
}
