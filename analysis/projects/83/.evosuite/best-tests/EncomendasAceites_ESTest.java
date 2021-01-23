/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:44:54 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EncomendasAceites_ESTest extends EncomendasAceites_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      // Undeclared exception!
      try { 
        encomendasAceites0.setAceites((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("EncomendasAceites", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = null;
      try {
        encomendasAceites0 = new EncomendasAceites((List<String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("EncomendasAceites", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = null;
      try {
        encomendasAceites0 = new EncomendasAceites((EncomendasAceites) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("EncomendasAceites", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      encomendasAceites0.updateAceites("6@u:V#\"dYW#)pNf");
      List<String> list0 = encomendasAceites0.getAceites();
      encomendasAceites0.setAceites(list0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      EncomendasAceites encomendasAceites1 = new EncomendasAceites(encomendasAceites0);
      assertTrue(encomendasAceites1.equals((Object)encomendasAceites0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      List<String> list0 = encomendasAceites0.getAceites();
      encomendasAceites0.updateAceites(",<UM~EoQE");
      EncomendasAceites encomendasAceites1 = new EncomendasAceites(list0);
      boolean boolean0 = encomendasAceites0.equals(encomendasAceites1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      boolean boolean0 = encomendasAceites0.equals(encomendasAceites0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      boolean boolean0 = encomendasAceites0.equals(",<UM~EoQE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      boolean boolean0 = encomendasAceites0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      encomendasAceites0.updateAceites("6@u:V#\"dYW#)pNf");
      EncomendasAceites encomendasAceites1 = encomendasAceites0.clone();
      assertTrue(encomendasAceites1.equals((Object)encomendasAceites0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      String string0 = encomendasAceites0.toString();
      assertEquals("C\u00F3digos de encomendas aceites: \n\n", string0);
  }
}
