/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 21:01:21 GMT 2021
 */

package MVC.Models.Catalogs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.LinhaEncomenda;
import MVC.Models.BaseModels.Loja;
import MVC.Models.BaseModels.Produto;
import MVC.Models.Catalogs.Lojas;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Lojas_ESTest extends Lojas_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.addEncomendaLoja("uQmN8SN vBg9*/vo5^#", "`");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.setLojas((Map<String, Loja>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.isEncomendaMed((List<LinhaEncomenda>) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Lojas lojas0 = null;
      try {
        lojas0 = new Lojas((Map<String, Loja>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Lojas lojas0 = null;
      try {
        lojas0 = new Lojas((Lojas) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      Map<String, Loja> map0 = lojas0.getLojas();
      lojas0.setLojas(map0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      boolean boolean0 = lojas0.existeLoja(" , Quantidade: ");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      lojas0.addProdutosTodasLojas((Collection<Produto>) null);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      lojas0.addProdutoTodasLojas((Produto) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.addProdutoLoja((Produto) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      Loja loja0 = lojas0.getLoja("{zFO%oDspN+yNb`,c");
      assertNull(loja0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      lojas0.removeLoja("MVC.Models.BaseModels.Produto");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      Lojas lojas1 = lojas0.clone();
      assertNotSame(lojas0, lojas1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.addLoja((Loja) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      List<Loja> list0 = lojas0.getListaLojas();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      Map<String, Loja> map0 = lojas0.getLojas();
      Lojas lojas1 = new Lojas(map0);
      assertFalse(lojas1.equals((Object)lojas0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      String string0 = lojas0.toString();
      assertEquals("Lojas:\n[]", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      Lojas lojas1 = new Lojas(lojas0);
      assertFalse(lojas1.equals((Object)lojas0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.addProdutosLoja((Collection<Produto>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Lojas lojas0 = new Lojas();
      // Undeclared exception!
      try { 
        lojas0.getProdutoLoja("s3Ff@W>N'=", "Lojas:\n[]");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Lojas", e);
      }
  }
}
