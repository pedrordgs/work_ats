/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:44:52 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ComparaQuantidadePair_ESTest extends ComparaQuantidadePair_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ComparaQuantidadePair comparaQuantidadePair0 = new ComparaQuantidadePair();
      Pair pair0 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn((-620), (-620)).when(pair0).getSnd();
      Pair pair1 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(pair1).getSnd();
      int int0 = comparaQuantidadePair0.compare(pair0, pair1);
      assertEquals(620, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ComparaQuantidadePair comparaQuantidadePair0 = new ComparaQuantidadePair();
      Pair pair0 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn("h").when(pair0).getFst();
      doReturn(260).when(pair0).getSnd();
      Pair pair1 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn("").when(pair1).getFst();
      doReturn(260).when(pair1).getSnd();
      int int0 = comparaQuantidadePair0.compare(pair0, pair1);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ComparaQuantidadePair comparaQuantidadePair0 = new ComparaQuantidadePair();
      Pair pair0 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn("").when(pair0).getFst();
      doReturn(1).when(pair0).getSnd();
      Pair pair1 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn("x").when(pair1).getFst();
      doReturn(1).when(pair1).getSnd();
      int int0 = comparaQuantidadePair0.compare(pair0, pair1);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ComparaQuantidadePair comparaQuantidadePair0 = new ComparaQuantidadePair();
      Pair pair0 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null).when(pair0).getFst();
      doReturn(0, 0).when(pair0).getSnd();
      // Undeclared exception!
      try { 
        comparaQuantidadePair0.compare(pair0, pair0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("ComparaQuantidadePair", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ComparaQuantidadePair comparaQuantidadePair0 = new ComparaQuantidadePair();
      Pair pair0 = mock(Pair.class, new ViolatedAssumptionAnswer());
      doReturn(1, 0, 0, 0).when(pair0).getSnd();
      int int0 = comparaQuantidadePair0.compare(pair0, pair0);
      assertEquals(0, int0);
  }
}