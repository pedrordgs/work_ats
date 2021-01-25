/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 17:53:28 GMT 2021
 */

package MVC.Models.BaseModels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.Produto;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Produto_ESTest extends Produto_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Produto produto0 = new Produto(">", ">", 1062.5175, true);
      boolean boolean0 = produto0.isMedicamento();
      assertTrue(boolean0);
      assertEquals(1062.5175, produto0.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setPrecoPorQuant(1129.5);
      double double0 = produto0.getPrecoPorQuant();
      assertEquals(1129.5, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Produto produto0 = new Produto("", "", (-1.0));
      double double0 = produto0.getPrecoPorQuant();
      assertEquals((-1.0), double0, 0.01);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setNome((String) null);
      produto0.getNome();
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Produto produto0 = new Produto("$l\"mSdB}%]Ncz,2", "$l\"mSdB}%]Ncz,2", 0.0, true);
      produto0.getNome();
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertTrue(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Produto produto0 = new Produto((String) null, (String) null, 2710.977846444, true);
      produto0.getCod();
      assertEquals(2710.977846444, produto0.getPrecoPorQuant(), 0.01);
      assertTrue(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Produto produto0 = new Produto("U~UBvws1_/}N", "U~UBvws1_/}N", 0.0, true);
      produto0.getCod();
      assertTrue(produto0.isMedicamento());
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Produto produto0 = new Produto(">", ">", 1062.5175, true);
      Produto produto1 = produto0.clone();
      assertTrue(produto1.isMedicamento());
      assertEquals(1062.5175, produto1.getPrecoPorQuant(), 0.01);
      assertEquals(1062.5175, produto0.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Produto produto0 = new Produto("", "", (-1414.0), false);
      Produto produto1 = produto0.clone();
      assertEquals((-1414.0), produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto1.isMedicamento());
      assertEquals((-1414.0), produto1.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Produto produto0 = null;
      try {
        produto0 = new Produto((Produto) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.Produto", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.getCod();
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.getNome();
      assertFalse(produto0.isMedicamento());
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Produto produto0 = new Produto();
      boolean boolean0 = produto0.isMedicamento();
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Produto produto0 = new Produto();
      double double0 = produto0.getPrecoPorQuant();
      assertFalse(produto0.isMedicamento());
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Produto produto0 = new Produto();
      Produto produto1 = new Produto(produto0);
      produto1.setCod((String) null);
      // Undeclared exception!
      try { 
        produto1.equals(produto0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Produto produto0 = new Produto();
      Produto produto1 = new Produto();
      produto1.equals(produto0);
      assertEquals(0.0, produto1.getPrecoPorQuant(), 0.01);
      assertFalse(produto1.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Produto produto0 = new Produto();
      boolean boolean0 = produto0.equals(produto0);
      assertTrue(boolean0);
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Produto produto0 = new Produto();
      boolean boolean0 = produto0.equals("");
      assertFalse(produto0.isMedicamento());
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Produto produto0 = new Produto();
      String string0 = produto0.toString();
      assertEquals("\nCodigo: \nProduto: \nPreco por quantidade: 0.0", string0);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Produto produto0 = new Produto();
      produto0.setMedicamento(false);
      assertFalse(produto0.isMedicamento());
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Produto produto0 = new Produto((String) null, (String) null, (-3428.0), false);
      boolean boolean0 = produto0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals((-3428.0), produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto0.isMedicamento());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Produto produto0 = new Produto();
      Produto produto1 = produto0.clone();
      assertEquals(0.0, produto0.getPrecoPorQuant(), 0.01);
      assertFalse(produto1.isMedicamento());
  }
}