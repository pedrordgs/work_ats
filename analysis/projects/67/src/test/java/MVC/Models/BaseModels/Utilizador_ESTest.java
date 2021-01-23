/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:34:06 GMT 2021
 */

package MVC.Models.BaseModels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.LinhaEncomenda;
import MVC.Models.BaseModels.Utilizador;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utilizador_ESTest extends Utilizador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.criaEncomenda("\nC\u00F3digo Encomenda: ", "", 805, (List<LinhaEncomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.Encomenda", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", (String) null, 0.0, 0.0);
      utilizador0.aceitaEncomenda((String) null, true);
      utilizador0.getPorClassificar();
      assertEquals(1, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.addKeyPorAceitar("r_AzAP(|dwBO'=.O7M");
      utilizador0.getPorAceitar();
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", (String) null, 0.0, 0.0);
      utilizador0.aceitaEncomenda((String) null, true);
      int int0 = utilizador0.getNumeroEncomendas();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", "", 2.0, 0.0);
      utilizador0.setNumeroEncomendas((-1791));
      int int0 = utilizador0.getNumeroEncomendas();
      assertEquals((-1791), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", "", (-1.0), (-1.0));
      utilizador0.setNumeroEncomendas(9);
      utilizador0.clone();
      assertEquals(9, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNumeroEncomendas((-831));
      utilizador0.clone();
      assertEquals((-831), utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", "", (-1.0), (-1.0));
      utilizador0.getPorClassificar();
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", "", 2.0, 0.0);
      utilizador0.getPorAceitar();
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("|i*", "J2p{Cxe\u0000C", 3623.7153081760825, 3623.7153081760825);
      utilizador0.addKeyPorClassificar("J2p{Cxe\u0000C");
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", (String) null, 0.0, 0.0);
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertEquals(0, utilizador1.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      int int0 = utilizador0.getNumeroEncomendas();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("\nNumero de encomendas: ", "\nNumero de encomendas: ", 9.489549229072104, 9.489549229072104);
      utilizador0.aceitaEncomenda("\nNumero de encomendas: ", false);
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.classificaEncomenda("\nC\u00F3digo Encomenda: ");
      assertEquals(0, utilizador0.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = utilizador0.clone();
      assertEquals(0, utilizador1.getNumeroEncomendas());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("\nNumero de encomendas: ", "\nNumero de encomendas: ", 9.489549229072104, 9.489549229072104);
      String string0 = utilizador0.toString();
      assertEquals("Utilizador{ \nC\u00F3digo: \nNumero de encomendas: \nNome: \nNumero de encomendas: \nGPS: (9.489549229072104,9.489549229072104)\nNumero de encomendas: 0\n}", string0);
  }
}
