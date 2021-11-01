import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class RectangleTest {
    private static final double EPSILON = 1e-8;

    @Test
    public void testComputeArea_WHEN_width_4_AND_height_5_EXPECT_20(){
        Rectangle rectangle = new Rectangle(4, 5);
        double area = rectangle.computeArea();
        Assert.assertEquals(20, area, EPSILON);
    }

    @Test
    public void testComputeArea_WHEN_width_3dot2_AND_height_5dot6_EXPECT_17dot92(){
        Rectangle rectangle = new Rectangle(3.2, 5.6);
        double area = rectangle.computeArea();
        Assert.assertEquals(17.92, area, EPSILON);
    }
}
