/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:29:07 GMT 2021
 */

package MVC.Models;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.Encomenda;
import MVC.Models.BaseModels.LinhaEncomenda;
import MVC.Models.BaseModels.Loja;
import MVC.Models.BaseModels.Produto;
import MVC.Models.BaseModels.Transportadora;
import MVC.Models.BaseModels.Utilizador;
import MVC.Models.Model;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Model_ESTest extends Model_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.addProduto("c", "KSm{.K=qEx{", (-659.969330795296), true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addTransportadora("", 0.0, 4.0, "", 0.0, 0.0, 831, false);
      assertNotNull(string0);
      assertEquals("t1", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addTransportadora("", (-1094.90631423), (-1094.90631423), "d4p(]]i3", (-1094.90631423), (-1094.90631423), 1139, false);
      assertNotNull(string0);
      assertEquals("t1", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addVoluntario("T$)#Mq@)`#", 364.83, 3139.496072405052, 831.7367407, true);
      assertNotNull(string0);
      assertEquals("v1", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addVoluntario("", 0.0, 1264.4801613, 0.0, false);
      assertNotNull(string0);
      assertEquals("v1", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      Boolean boolean0 = Boolean.valueOf(false);
      assertNotNull(boolean0);
      assertFalse(boolean0);
      
      model0.setEstaLivreEntregador("y8W2", boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.getEncomendasEntregador("}\n");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Transportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      boolean boolean0 = model0.loginValido("y:xV2", "y:xV2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      try { 
        model0.utilizadorClassificaEncomenda("1e@0", "B(0r_", (-486));
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // B(0r_
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      Encomenda encomenda0 = new Encomenda();
      assertFalse(encomenda0.getMedica());
      assertEquals("", encomenda0.getCodEntregador());
      assertEquals("", encomenda0.getCodLoja());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0, encomenda0.getClassificacao());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals("", encomenda0.getCodEnc());
      assertEquals(0.0, encomenda0.getPreco(), 0.01);
      assertEquals(0.0, encomenda0.getDuracao(), 0.01);
      assertEquals("", encomenda0.getCodUser());
      assertNotNull(encomenda0);
      
      List<LinhaEncomenda> list0 = encomenda0.getLinhas();
      assertFalse(encomenda0.getMedica());
      assertEquals("", encomenda0.getCodEntregador());
      assertEquals("", encomenda0.getCodLoja());
      assertEquals(0.0, encomenda0.getPeso(), 0.01);
      assertEquals(0, encomenda0.getClassificacao());
      assertEquals(0.0, encomenda0.getDistancia(), 0.01);
      assertEquals("", encomenda0.getCodEnc());
      assertEquals(0.0, encomenda0.getPreco(), 0.01);
      assertEquals(0.0, encomenda0.getDuracao(), 0.01);
      assertEquals("", encomenda0.getCodUser());
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertNotNull(list0);
      
      // Undeclared exception!
      try { 
        model0.criaEncomenda("7sLUyQk}^lX,Da", "HZyp}RfZ", list0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addUtilizador((String) null, 610.5883381900721, 610.5883381900721);
      assertNotNull(string0);
      assertEquals("u1", string0);
      
      Utilizador utilizador0 = model0.getUtilizador("u1");
      assertEquals("u1", utilizador0.getCod());
      assertNull(utilizador0.getName());
      assertEquals(0, utilizador0.getNumeroEncomendas());
      assertEquals("u1", utilizador0.getPass());
      assertNotNull(utilizador0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addLoja("", (-2022.22723), (-2022.22723));
      assertNotNull(string0);
      assertEquals("l1", string0);
      
      List<Loja> list0 = model0.getListaLojas();
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addUtilizador("JO 4hc;D", 0.0, 0.0);
      assertNotNull(string0);
      assertEquals("u1", string0);
      
      List<Encomenda> list0 = model0.getListaEncomendasPorClassificar("u1");
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addVoluntario(", ", 0.0, 0.0, 0.0, false);
      assertNotNull(string0);
      assertEquals("v1", string0);
      
      List<Encomenda> list0 = model0.getEncomendasEntregador("v1");
      assertEquals(0, list0.size());
      assertTrue(list0.isEmpty());
      assertNotNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      Boolean boolean0 = Boolean.TRUE;
      assertNotNull(boolean0);
      assertTrue(boolean0);
      
      // Undeclared exception!
      try { 
        model0.setEstaLivreEntregador("", boolean0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.loginValido("", "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.loginValido((String) null, "MVC.Models.BaseModels.Voluntario");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.gravaEstado((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      try { 
        model0.gravaEstado("");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("dados");
      boolean boolean0 = FileSystemHandling.appendStringToFile(evoSuiteFile0, "nv0,~Ro9,TlZ4Y5Z");
      assertTrue(boolean0);
      
      try { 
        model0.gravaEstado();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.getFaturacao("ZsjhD^7S.b&");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Transportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.getEncomendasEntregador("");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.criaLinha("", "", 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      // Undeclared exception!
      try { 
        model0.carregaEstado((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("cQV5");
      boolean boolean0 = FileSystemHandling.appendLineToFile(evoSuiteFile0, "w4u;m1J\"a:");
      assertTrue(boolean0);
      
      try { 
        model0.carregaEstado("cQV5");
        fail("Expecting exception: StreamCorruptedException");
      
      } catch(StreamCorruptedException e) {
         //
         // invalid stream header: 7734753B
         //
         verifyException("java.io.ObjectInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      try { 
        model0.gravaEstado(":9'XPovDn*dj4");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      boolean boolean0 = model0.existeEntregador("l");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addLoja("", (-475.7508), (-475.7508));
      assertNotNull(string0);
      assertEquals("l1", string0);
      
      String string1 = model0.addLoja("u2", 0.0, 1606);
      assertFalse(string1.equals((Object)string0));
      assertNotNull(string1);
      assertEquals("l2", string1);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Model model0 = new Model();
      assertNotNull(model0);
      
      String string0 = model0.addTransportadora("l1", (-2307.0), 610.5883381900721, "l1", 483.9645766, 610.5883381900721, 0, false);
      assertNotNull(string0);
      assertEquals("t1", string0);
      
      double double0 = model0.getFaturacao("t1");
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Model model0 = new Model();
      String string0 = model0.addTransportadora("", (-475.7508), (-475.7508), "?", (-475.7508), 0.0, 1606, true);
      assertEquals("t1", string0);
      
      String string1 = model0.addTransportadora((String) null, 1486.6115671691, 1606, "", (-475.7508), 1486.6115671691, 1606, true);
      assertEquals("t2", string1);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Model model0 = new Model();
      String string0 = model0.addVoluntario(", ", 0.0, 0.0, 2595.96113, false);
      assertEquals("v1", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Model model0 = new Model();
      String string0 = model0.addVoluntario("p", 1606, (-475.7508), 1606, true);
      assertEquals("v1", string0);
      
      String string1 = model0.addVoluntario((String) null, 1606, 1486.6115671691, 1606, true);
      assertEquals("v2", string1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Model model0 = new Model();
      String string0 = model0.addUtilizador("t1", 0.0, 1486.6115671691);
      assertEquals("u1", string0);
      
      String string1 = model0.addUtilizador((String) null, (-475.7508), (-475.7508));
      assertEquals("u2", string1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Model model0 = new Model();
      Encomenda encomenda0 = new Encomenda();
      Boolean boolean0 = encomenda0.getMedica();
      // Undeclared exception!
      try { 
        model0.setEstaLivreEntregador("t", boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Transportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Model model0 = new Model();
      Boolean boolean0 = Boolean.FALSE;
      // Undeclared exception!
      try { 
        model0.setEstaLivreEntregador("v", boolean0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Voluntarios", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Model model0 = new Model();
      Boolean boolean0 = Boolean.valueOf("cQV5");
      model0.setEstaLivreEntregador(";rxUoY;<@muuIP[Um", boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Model model0 = new Model();
      model0.addLoja("x4oL#'ef6OH*1", (-475.7508), 0.0);
      List<Produto> list0 = model0.getProdutosLoja("l1");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Model model0 = new Model();
      try { 
        model0.getProdutosLoja("u1");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // u1
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Model model0 = new Model();
      // Undeclared exception!
      try { 
        model0.getEncomendasEntregador("l1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Catalogs.Transportadoras", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Model model0 = new Model();
      boolean boolean0 = model0.loginValido("t", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Model model0 = new Model();
      boolean boolean0 = model0.loginValido("MVC.Models.BaseModels.GPS", "");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Model model0 = new Model();
      try { 
        model0.utilizadorAceitaEncomenda("", "W'Kkc", true);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // W'Kkc
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Model model0 = new Model();
      model0.addLoja("@xMLrs;G#Wkq}gq8}", 2529.0231, 372.91468114182);
      try { 
        model0.criaLinha("l1", "Utilizadores: \n", 372.91468114182);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Utilizadores: 
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Model model0 = new Model();
      model0.carregaLog();
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Model model0 = new Model();
      Utilizador utilizador0 = model0.getUtilizador("x4oL#'ef6OH*1");
      assertNull(utilizador0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Model model0 = new Model();
      // Undeclared exception!
      try { 
        model0.getListaEncomendasPorClassificar("u1");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Model model0 = new Model();
      List<Utilizador> list0 = model0.getTop10Utilizadores();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Model model0 = new Model();
      List<Loja> list0 = model0.getListaLojas();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Model model0 = new Model();
      List<Transportadora> list0 = model0.getTop10Transportadoras();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Model model0 = new Model();
      // Undeclared exception!
      try { 
        model0.getListaEncomendasClassificadas("*}{_f");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Model model0 = new Model();
      // Undeclared exception!
      try { 
        model0.getListaEncomendasPorAceitar("nyUj;-Q");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.Model", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Model model0 = new Model();
      try { 
        model0.carregaEstado();
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Model model0 = new Model();
      try { 
        model0.gravaEstado();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Model model0 = new Model();
      try { 
        model0.carregaEstado("cQV5");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }
}
