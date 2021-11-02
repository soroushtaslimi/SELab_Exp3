import org.junit.Assert;
import org.junit.Test;

public class SquareTest {
    private static final double EPSILON = 1e-8;

    @Test
    public void testComputeArea_WHEN_width_2dot5_EXPECT_6dot25() {
        Square square = new Square(2.5);
        double area = square.computeArea();
        Assert.assertEquals(6.25, area, EPSILON);
    }

    @Test
    public void testGetSide_WHEN_side_3dot45_EXPECT_3dot45(){
        Square square = new Square(3.45);
        double side = square.getSide();
        Assert.assertEquals(3.45, side, EPSILON);
    }

    @Test
    public void testSetSide_WHEN_4dot5_AND_initially_4_EXPECT_4dot5(){
        Square square = new Square(4);
        square.setSide(4.5);
        double side = square.getSide();
        Assert.assertEquals(4.5, side, EPSILON);
        double area = square.computeArea();
        Assert.assertEquals(20.25, area, EPSILON);
    }

    @Test
    public void testSetSide_WHEN_negative_AND_initially_4dot3_EXPECT_IllegalArgumentException(){
        Square square = new Square(4.3);
        try {
            square.setSide(-7.4);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {
            double side = square.getSide();
            Assert.assertEquals(4.3, side, EPSILON);
        }
    }

    @Test
    public void testSetSide_WHEN_zero_AND_initially_4dot3_EXPECT_IllegalArgumentException(){
        Square square = new Square(4.3);
        try {
            square.setSide(0);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {
            double side = square.getSide();
            Assert.assertEquals(4.3, side, EPSILON);
        }
    }

    @Test
    public void testConstructor_WHEN_negative_side_EXPECT_IllegalArgumentException(){
        try {
            new Square(-1);
            Assert.fail();
        } catch (IllegalArgumentException ignored) {}
    }

}