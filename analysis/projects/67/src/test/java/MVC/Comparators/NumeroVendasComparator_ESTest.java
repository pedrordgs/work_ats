/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 17:55:44 GMT 2021
 */

package MVC.Comparators;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Comparators.NumeroVendasComparator;
import MVC.Models.BaseModels.Utilizador;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumeroVendasComparator_ESTest extends NumeroVendasComparator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumeroVendasComparator numeroVendasComparator0 = new NumeroVendasComparator();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(861, (-2319), (-1), (-950)).when(utilizador0).getNumeroEncomendas();
      int int0 = numeroVendasComparator0.compare(utilizador0, utilizador0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumeroVendasComparator numeroVendasComparator0 = new NumeroVendasComparator();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(utilizador0).getCod();
      doReturn(0, 0).when(utilizador0).getNumeroEncomendas();
      Utilizador utilizador1 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(utilizador1).getCod();
      doReturn(0, 0).when(utilizador1).getNumeroEncomendas();
      // Undeclared exception!
      try { 
        numeroVendasComparator0.compare(utilizador0, utilizador1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Comparators.NumeroVendasComparator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NumeroVendasComparator numeroVendasComparator0 = new NumeroVendasComparator();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(" gf@U3i", " gf@U3i").when(utilizador0).getCod();
      doReturn((-1650), (-1650), 1, 529).when(utilizador0).getNumeroEncomendas();
      int int0 = numeroVendasComparator0.compare(utilizador0, utilizador0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumeroVendasComparator numeroVendasComparator0 = new NumeroVendasComparator();
      Utilizador utilizador0 = mock(Utilizador.class, new ViolatedAssumptionAnswer());
      doReturn(1214, 2886).when(utilizador0).getNumeroEncomendas();
      int int0 = numeroVendasComparator0.compare(utilizador0, utilizador0);
      assertEquals(1, int0);
  }
}
