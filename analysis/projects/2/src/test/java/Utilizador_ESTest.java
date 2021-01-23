/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:22:49 GMT 2021
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
public class Utilizador_ESTest extends Utilizador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.incNumEnc();
      int int0 = utilizador0.getNumEnc();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNum((-1));
      int int0 = utilizador0.getNumEnc();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.incNumEnc();
      utilizador0.clone();
      assertEquals(1, utilizador0.getNumEnc());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNum((-2969));
      utilizador0.clone();
      assertEquals((-2969), utilizador0.getNumEnc());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador((String) null, ">a5UR", "Ponto2D", (Ponto2D) null, (-26));
      // Undeclared exception!
      try { 
        utilizador0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Perfil", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Perfil", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      int int0 = utilizador0.getNumEnc();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Ponto2D ponto2D0 = mock(Ponto2D.class, new ViolatedAssumptionAnswer());
      doReturn("\n").when(ponto2D0).toString();
      Utilizador utilizador0 = new Utilizador("\n", "\n", "\n", ponto2D0, 20);
      String string0 = utilizador0.toString();
      assertEquals("Perfil: \n\n\n\n\n\n\n\nNumero de Encomenda: 0\n", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertEquals(0, utilizador1.getNumEnc());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Ponto2D ponto2D0 = mock(Ponto2D.class, new ViolatedAssumptionAnswer());
      doReturn("\n").when(ponto2D0).toString();
      Utilizador utilizador0 = new Utilizador("\n", "\n", "\n", ponto2D0, 20);
      Utilizador utilizador1 = utilizador0.clone();
      assertEquals(0, utilizador1.getNumEnc());
  }
}
