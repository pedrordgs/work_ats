/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 21:15:20 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Utilizador_ESTest extends Utilizador_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNome((String) null);
      String string0 = utilizador0.getNome();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setNome("Nome: ");
      String string0 = utilizador0.getNome();
      assertEquals("Nome: ", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador("", "ENCOMENDAS REALIZADAS PELO USER: ", "", "", 2940.80888994, 2940.80888994, arrayList0);
      double double0 = utilizador1.getLongitude();
      assertEquals(2940.80888994, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador("'A2]rUN= &<\"ewc!y", "'A2]rUN= &<\"ewc!y", "'A2]rUN= &<\"ewc!y", "Utilizador", (-1.0), (-1.0), arrayList0);
      double double0 = utilizador1.getLongitude();
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador("", "", "", "q]lK", (-1473.9), (-1473.9), arrayList0);
      double double0 = utilizador1.getLatitude();
      assertEquals((-1473.9), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador((String) null, (String) null, (String) null, "5l8`9(zC;4jD-EVl.", (-3986.4571608), (-3986.4571608), arrayList0);
      String string0 = utilizador1.getCodigo();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador("Pnq{", "", "]SXZZ^IXv|(J1", "Latitude: ", (-1.0), 1341.53759971916, arrayList0);
      String string0 = utilizador1.getCodigo();
      assertEquals("]SXZZ^IXv|(J1", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      boolean boolean0 = utilizador0.equals(arrayList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setLongitude((-1.0));
      Utilizador utilizador1 = utilizador0.clone();
      assertEquals((-1.0), utilizador1.getLongitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador("PCZw>I]@Ecq8zFt", "PCZw>I]@Ecq8zFt", "", "", 1.0, 1.0, arrayList0);
      Utilizador utilizador2 = utilizador1.clone();
      assertNotSame(utilizador2, utilizador1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setLatitude((-1.0));
      Utilizador utilizador1 = utilizador0.clone();
      assertEquals((-1.0), utilizador1.getLatitude(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.updateEncomendaPronta((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.updateEncomendaLoja((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.updateEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.setEncomendas((ArrayList<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      Utilizador utilizador1 = new Utilizador((String) null, (String) null, (String) null, "2X'+{.^7TN'", 0.0, 0.0, arrayList0);
      // Undeclared exception!
      try { 
        utilizador1.equals(utilizador0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("UtilizadorSistema", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((String) null, "2u5C'EXQ{N6{", "q{:^(%!_LukAO~>s", "P}HU", 600.08285, 600.08285, (ArrayList<Encomenda>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Utilizador utilizador0 = null;
      try {
        utilizador0 = new Utilizador((Utilizador) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("UtilizadorSistema", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      ArrayList<Encomenda> arrayList0 = utilizador0.getEncomendas();
      utilizador0.setEncomendas(arrayList0);
      assertEquals("", utilizador0.getEmail());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      double double0 = utilizador0.getLongitude();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getNome();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getCodigo();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      double double0 = utilizador0.getLatitude();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      try { 
        utilizador0.devolveEncomenda(" <--- O utilizador \u00E9: \n\n\nC\u00F3digo: \nNome: \nLatitude: 0.0\nLongitude: 0.0\n");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.printEncomendasPorEntregar();
      assertEquals("N\u00E3o existem encomendas por entregar\n", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.printEncomendasRecebidas();
      assertEquals("N\u00E3o existem encomendas recebidas\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.toString();
      assertEquals(" <--- O utilizador \u00E9: \n\n\nC\u00F3digo: \nNome: \nLatitude: 0.0\nLongitude: 0.0\n", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setLatitude(2159.877);
      double double0 = utilizador0.getLatitude();
      assertEquals(2159.877, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = utilizador0.equals(utilizador0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      Utilizador utilizador1 = new Utilizador(utilizador0);
      assertTrue(utilizador1.equals((Object)utilizador0));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.addEncomenda((Encomenda) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Utilizador", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      utilizador0.setCodigo("N\u00E3o existem encomendas por entregar\n");
      assertEquals("", utilizador0.getPassword());
  }
}
