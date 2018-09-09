import org.junit.Test;
import static org.junit.Assert.*;


/** 
 *  Use this file to test your implementation of Pixel.
 * 
 *  We will manually grade this file to give you feedback
 *  about the completeness of your test cases.
 */

public class MyPixelTest {

    /*
     * Remember, UNIT tests should ideally have one assert statement. Below we
     * give you a few examples of unit tests for the getRed(), getGreen(), and
     * getBlue() methods. These are not comprehensive so you must add your own
     * --if you want to add more global variables, feel free to do so.
     */

    private Pixel pixelLargeGreen = new Pixel(1, 256, 3);
    private Pixel black = new Pixel(-1, 0, 0);
    int[] c ={0,0,500};
    private Pixel blueArray = new Pixel(c);

    @Test
    public void getValidRedTest() {
        assertEquals(1, pixelLargeGreen.getRed());
    }

    @Test
    public void getInvalidGreenTest() {
        assertEquals(255, pixelLargeGreen.getGreen());
    }
    
    @Test
    public void getInvalidRedTest() {
        assertEquals(0, black.getRed());
    }
 
    @Test
    public void getValidBlueTest() {
        assertEquals(3, pixelLargeGreen.getBlue());
    }   
    @Test
    public void getBlueZeroInArray() {
        assertEquals(255, blueArray.getBlue());
    }   
    
    @Test
    public void equalsTest() {
        assertEquals(true, pixelLargeGreen.equals(pixelLargeGreen));
    }
    
    @Test
    public void distanceTest() {
        assertEquals(259, pixelLargeGreen.distance(black));
    }

}
