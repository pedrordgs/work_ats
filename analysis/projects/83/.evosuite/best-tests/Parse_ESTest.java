/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:40:06 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Parse_ESTest extends Parse_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseEncomenda("#y^a3,27\"_k%nj");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseEmpresaTransportes(",s2lvX!X_G%6 P");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Parse parse0 = new Parse();
      parse0.parse();
      Parse parse1 = new Parse(parse0);
      assertFalse(parse1.equals((Object)parse0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.setEncomendas((List<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseVoluntarios((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseUtilizador((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseLojas("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseLinhaEncomenda((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseEncomendasAceites("W*|9~o-", (EncomendasAceites) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseEncomenda((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseEmpresaTransportes((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.lerFicheiro((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Parse parse0 = new Parse();
      EmpresaTransportes empresaTransportes0 = new EmpresaTransportes();
      ArrayList<Encomenda> arrayList0 = empresaTransportes0.getRota();
      arrayList0.add((Encomenda) null);
      // Undeclared exception!
      try { 
        parse0.addEncomendasVoluntariosETransportes(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.addEncomendasCliente((List<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.addEncomendas((List<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmpresaTransportes empresaTransportes0 = new EmpresaTransportes();
      ArrayList<Encomenda> arrayList0 = empresaTransportes0.getRota();
      Parse parse0 = null;
      try {
        parse0 = new Parse((BDGeral) null, arrayList0, (EncomendasAceites) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.getBaseGeral();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("BDGeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Parse parse0 = new Parse();
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Encomenda encomenda0 = new Encomenda();
      arrayList0.add(encomenda0);
      parse0.addEncomendasVoluntariosETransportes(arrayList0);
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Parse parse0 = new Parse();
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Encomenda encomenda0 = new Encomenda();
      arrayList0.add(encomenda0);
      parse0.addEncomendasCliente(arrayList0);
      assertTrue(arrayList0.contains(encomenda0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Parse parse0 = new Parse();
      parse0.parse();
      BDGeral bDGeral0 = parse0.getBaseGeral();
      assertNotNull(bDGeral0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Parse parse0 = new Parse();
      EmpresaTransportes empresaTransportes0 = new EmpresaTransportes();
      ArrayList<Encomenda> arrayList0 = empresaTransportes0.getRegistos();
      Encomenda encomenda0 = new Encomenda();
      arrayList0.add(encomenda0);
      parse0.setEncomendas(arrayList0);
      List<Encomenda> list0 = parse0.getEncomendas();
      assertTrue(list0.contains(encomenda0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BDGeral bDGeral0 = new BDGeral();
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      bDGeral0.setEncomendasAceites(encomendasAceites0);
      Parse parse0 = new Parse(bDGeral0, arrayList0, encomendasAceites0);
      // Undeclared exception!
      try { 
        parse0.parseUtilizador(";Zj7_W,");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Parse parse0 = new Parse();
      Parse parse1 = null;
      try {
        parse1 = new Parse(parse0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("BDGeral", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseLinhaEncomenda("]iYxg-/\"XbnrRLYaA");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Parse parse0 = new Parse();
      List<Encomenda> list0 = parse0.getEncomendas();
      parse0.addEncomendas(list0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Parse parse0 = new Parse();
      // Undeclared exception!
      try { 
        parse0.parseVoluntarios("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("Parse", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Parse parse0 = new Parse();
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      parse0.addEncomendasAceites(encomendasAceites0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Parse parse0 = new Parse();
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      parse0.setEa(encomendasAceites0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Parse parse0 = new Parse();
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      EncomendasAceites encomendasAceites1 = parse0.parseEncomendasAceites((String) null, encomendasAceites0);
      assertSame(encomendasAceites0, encomendasAceites1);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Parse parse0 = new Parse();
      EncomendasAceites encomendasAceites0 = parse0.getEa();
      assertNotNull(encomendasAceites0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Parse parse0 = new Parse();
      List<String> list0 = parse0.lerFicheiro("");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BDGeral bDGeral0 = new BDGeral();
      ArrayList<Encomenda> arrayList0 = new ArrayList<Encomenda>();
      EncomendasAceites encomendasAceites0 = new EncomendasAceites();
      bDGeral0.setEncomendasAceites(encomendasAceites0);
      Parse parse0 = new Parse(bDGeral0, arrayList0, encomendasAceites0);
      // Undeclared exception!
      try { 
        parse0.parseLojas((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Parse", e);
      }
  }
}
