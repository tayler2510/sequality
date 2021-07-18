package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    assertEquals(5, calculate.average(10, 2), 0);
  }

  @Test
  public void testSumRange() {
    Calculate calculate = new Calculate();
    assertEquals(55, calculate.sumRange(1, 10));
  }

  @Test
  public void testSumOdd() {
    Calculate calculate = new Calculate();
    assertEquals(25, calculate.sumOdd(1, 10));
  }

  @Test
  public void testSumEven() {
    Calculate calculate = new Calculate();
    assertEquals(30, calculate.sumEven(1, 10));
  }
}
