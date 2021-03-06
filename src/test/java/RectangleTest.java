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

    @Test
    public void testComputeArea_WHEN_width_6dot1_AND_height_6dot1_EXPECT_37dot21(){
        Rectangle rectangle = new Rectangle(6.1, 6.1);
        double area = rectangle.computeArea();
        Assert.assertEquals(37.21, area, EPSILON);
    }

    @Test
    public void testGetWidth_WHEN_width_8_AND_height_5_EXPECT_8(){
        Rectangle rectangle = new Rectangle(8, 5);
        double width = rectangle.getWidth();
        Assert.assertEquals(8, width, EPSILON);
    }

    @Test
    public void testGetWidth_WHEN_width_2dot82_AND_height_3dot45_EXPECT_2dot82(){
        Rectangle rectangle = new Rectangle(2.82, 3.45);
        double width = rectangle.getWidth();
        Assert.assertEquals(2.82, width, EPSILON);
    }

    @Test
    public void testGetWidth_WHEN_width_4_AND_height_4_EXPECT_4(){
        Rectangle rectangle = new Rectangle(4, 4);
        double width = rectangle.getWidth();
        Assert.assertEquals(4, width, EPSILON);
    }

    @Test
    public void testSetWidth_WHEN_8_AND_initially_6_EXPECT_8(){
        Rectangle rectangle = new Rectangle(6, 11);
        rectangle.setWidth(8);
        double width = rectangle.getWidth();
        Assert.assertEquals(8, width, EPSILON);
    }

    @Test
    public void testSetWidth_WHEN_4dot67_AND_initially_4_EXPECT_4dot67(){
        Rectangle rectangle = new Rectangle(4, 9);
        rectangle.setWidth(4.67);
        double width = rectangle.getWidth();
        Assert.assertEquals(4.67, width, EPSILON);
    }

    @Test
    public void testSetWidth_WHEN_4dot67_AND_initially_4dot67_EXPECT_4dot67(){
        Rectangle rectangle = new Rectangle(4.67, 9);
        rectangle.setWidth(4.67);
        double width = rectangle.getWidth();
        Assert.assertEquals(4.67, width, EPSILON);
    }

    @Test
    public void testSetWidth_WHEN_0_AND_initially_4_EXPECT_IllegalArgumentException(){
        Rectangle rectangle = new Rectangle(4, 9);
        try {
            rectangle.setWidth(0);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void testSetWidth_WHEN_negative_AND_initially_4_EXPECT_IllegalArgumentException(){
        Rectangle rectangle = new Rectangle(4, 9);
        try {
            rectangle.setWidth(-7.4);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }




    @Test
    public void testGetHeight_WHEN_width_2dot82_AND_height_3dot45_EXPECT_3dot45(){
        Rectangle rectangle = new Rectangle(2.82, 3.45);
        double height = rectangle.getHeight();
        Assert.assertEquals(3.45, height, EPSILON);
    }

    @Test
    public void testGetHeight_WHEN_width_4_AND_height_4_EXPECT_4(){
        Rectangle rectangle = new Rectangle(4, 4);
        double height = rectangle.getHeight();
        Assert.assertEquals(4, height, EPSILON);
    }

    @Test
    public void testSetHeight_WHEN_8_AND_initially_6_EXPECT_8(){
        Rectangle rectangle = new Rectangle(11, 6);
        rectangle.setHeight(8);
        double height = rectangle.getHeight();
        Assert.assertEquals(8, height, EPSILON);
    }

    @Test
    public void testSetHeight_WHEN_4dot67_AND_initially_4_EXPECT_4dot67(){
        Rectangle rectangle = new Rectangle(9, 4);
        rectangle.setHeight(4.67);
        double height = rectangle.getHeight();
        Assert.assertEquals(4.67, height, EPSILON);
    }

    @Test
    public void testSetHeight_WHEN_4dot67_AND_initially_4dot67_EXPECT_4dot67(){
        Rectangle rectangle = new Rectangle(9, 4.67);
        rectangle.setHeight(4.67);
        double height = rectangle.getHeight();
        Assert.assertEquals(4.67, height, EPSILON);
    }

    @Test
    public void testSetHeight_WHEN_0_AND_initially_4_EXPECT_IllegalArgumentException(){
        Rectangle rectangle = new Rectangle(8.5, 4);
        try {
            rectangle.setHeight(0);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void testSetHeight_WHEN_negative_AND_initially_4dot3_EXPECT_IllegalArgumentException(){
        Rectangle rectangle = new Rectangle(8.89, 4.3);
        try {
            rectangle.setHeight(-7.4);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void testConstructor_When_negative_height_EXPECT_IllegalArgumentException(){
        try {
            new Rectangle(3.1, -2.3);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }

    @Test
    public void testConstructor_When_negative_width_EXPECT_IllegalArgumentException(){
        try {
            new Rectangle(-2.4, 1);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }
}
