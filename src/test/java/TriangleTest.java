import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle testTriangle = new Triangle (5, 5, 5);
    assertEquals(true, testTriangle instanceof Triangle);
  }

  @Test
  public void newTriangle_setsSideOne() {
    Triangle testTriangle = new Triangle(5, 5, 5);
    assertEquals(5, testTriangle.getSideOne());
  }

  @Test
  public void newTriangle_setsSideTwo() {
    Triangle testTriangle = new Triangle(5, 5, 5);
    assertEquals(5, testTriangle.getSideTwo());
  }

  @Test
  public void newTriangle_setsSideThree() {
    Triangle testTriangle = new Triangle(5, 5, 5);
    assertEquals(5, testTriangle.getSideThree());
  }

  @Test
  public void isEquilateral_ifTriangleSidesAreEqual_true() {
    Triangle testTriangle = new Triangle(5, 5, 5);
    assertEquals(true, testTriangle.isEquilateral());
  }

  @Test
  public void isIsosceles_ifTwoTriangleSidesAreEqual_true() {
    Triangle testTriangle = new Triangle(4, 5, 5);
    assertEquals(true, testTriangle.isIsosceles());
  }

  @Test
  public void isScalene_ifNoSidesAreEqual_true() {
    Triangle testTriangle = new Triangle(4, 5, 6);
    assertEquals(true, testTriangle.isScalene());
  }

  @Test
  public void isNotTriangle_ifSumOfTwoSidesIsLessThanThirdSide_true() {
    Triangle testTriangle = new Triangle(2, 3, 7);
    assertEquals(true, testTriangle.isNotTriangle());
  }
}
