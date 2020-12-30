/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 27 20:20:07 GMT 2020
 */

package MVC.Models.BaseModels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.VoluntarioMed;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class VoluntarioMed_ESTest extends VoluntarioMed_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.setVelocidadeMed((-436.121));
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed("jwPZ!u`.}4a", "jwPZ!u`.}4a", 1834.360483768213, 1.0, 1834.360483768213, false);
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.classificaVoluntario(2738);
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.classificaVoluntario((-1));
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.setEstaLivre(false);
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed((String) null, (String) null, 448.641835, 424.053928622696, (-2298.479211918472), true);
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertTrue(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      boolean boolean0 = voluntarioMed0.aceitoTrasnporteMedicamentos();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed(":hA-", ":hA-", (-3408.4922), 0.0, (-3408.4922), true);
      boolean boolean0 = voluntarioMed0.aceitoTrasnporteMedicamentos();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      VoluntarioMed voluntarioMed1 = new VoluntarioMed(voluntarioMed0);
      assertFalse(voluntarioMed1.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      String string0 = voluntarioMed0.toString();
      assertEquals("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.aceitaMedicamentos(false);
      assertFalse(voluntarioMed0.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = null;
      try {
        voluntarioMed0 = new VoluntarioMed((VoluntarioMed) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.User", e);
      }
  }
}