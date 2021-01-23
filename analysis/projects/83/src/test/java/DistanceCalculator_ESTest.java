/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:46:00 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DistanceCalculator_ESTest extends DistanceCalculator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double double0 = DistanceCalculator.distance(0.0, (-496.2682953173), (-496.2682953173), 0.0);
      assertEquals(701.8293538135019, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = DistanceCalculator.distance((-1204.7141556922), (-1204.7141556922), (-1204.7141556922), (-1204.7141556922));
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double double0 = DistanceCalculator.distance(772.0, (-700.10466440891), 772.0, (-700.10466440891));
      assertEquals(2081.870381639774, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DistanceCalculator distanceCalculator0 = new DistanceCalculator();
  }
}
