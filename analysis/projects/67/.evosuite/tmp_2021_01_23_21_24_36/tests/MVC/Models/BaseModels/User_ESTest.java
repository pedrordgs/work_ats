/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:31:25 GMT 2021
 */

package MVC.Models.BaseModels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.GPS;
import MVC.Models.BaseModels.Loja;
import MVC.Models.BaseModels.TransportadoraMed;
import MVC.Models.BaseModels.User;
import MVC.Models.BaseModels.Utilizador;
import MVC.Models.BaseModels.Voluntario;
import MVC.Models.BaseModels.VoluntarioMed;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class User_ESTest extends User_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", "83H", 1131.530037424188, 1131.530037424188);
      boolean boolean0 = utilizador0.equals(utilizador0);
      assertEquals("83H", utilizador0.getName());
      assertTrue(boolean0);
      assertEquals("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", utilizador0.getPass());
      assertEquals("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", utilizador0.getCod());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Loja loja0 = new Loja("NHDha<1N' J^:i,", "C\u00F3digo: ", (-1505.8363), (-1505.8363));
      loja0.isSenha("bg`j|.|b)~6y");
      assertEquals("NHDha<1N' J^:i,", loja0.getCod());
      assertEquals("C\u00F3digo: ", loja0.getName());
      assertEquals("NHDha<1N' J^:i,", loja0.getPass());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TransportadoraMed transportadoraMed0 = new TransportadoraMed("59H0whq27wwa+\"", "", 0.0, 0.0, "59H0whq27wwa+\"", 2144.969834032337, 0.0, false, (-4105));
      assertEquals("59H0whq27wwa+\"", transportadoraMed0.getPass());
      
      transportadoraMed0.setPass((String) null);
      transportadoraMed0.getPass();
      assertEquals("", transportadoraMed0.getName());
      assertEquals("59H0whq27wwa+\"", transportadoraMed0.getCod());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      String string0 = voluntarioMed0.getPass();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed("bg`j|.|b)~6y", (String) null, 0.0, 0.0, 0.0, true);
      String string0 = voluntarioMed0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario((String) null, "D.", 26.8588625, 2465.2416051325035, 0.0);
      String string0 = voluntario0.getName();
      assertEquals("D.", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TransportadoraMed transportadoraMed0 = new TransportadoraMed("", "5gtIEAIo5f<a", 177.89126528767, 177.89126528767, "", 0.0, 177.89126528767, false);
      GPS gPS0 = transportadoraMed0.getGPS();
      assertEquals("5gtIEAIo5f<a", transportadoraMed0.getName());
      assertEquals("", transportadoraMed0.getPass());
      assertEquals(177.89126528767, gPS0.getY(), 0.01);
      assertEquals("", transportadoraMed0.getCod());
      assertEquals(177.89126528767, gPS0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("KGGs!", "+:vgB<aQRf,f8ZD.", (-1.0), (-1.0));
      GPS gPS0 = utilizador0.getGPS();
      assertEquals("+:vgB<aQRf,f8ZD.", utilizador0.getName());
      assertEquals("KGGs!", utilizador0.getCod());
      assertEquals((-1.0), gPS0.getY(), 0.01);
      assertEquals((-1.0), gPS0.getX(), 0.01);
      assertEquals("KGGs!", utilizador0.getPass());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("KGGs!", "+:vgB<aQRf,f8ZD.", (-1.0), (-1.0));
      utilizador0.classificaEncomenda("7UG3:.';(]feab!bj{d");
      utilizador0.getCodencomendas();
      assertEquals("KGGs!", utilizador0.getPass());
      assertEquals("KGGs!", utilizador0.getCod());
      assertEquals("+:vgB<aQRf,f8ZD.", utilizador0.getName());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.setCod((String) null);
      String string0 = voluntarioMed0.getCod();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario();
      String string0 = voluntario0.getCod();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("", "", 0.0, 0.0);
      double double0 = utilizador0.distanciaUser(utilizador0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TransportadoraMed transportadoraMed0 = new TransportadoraMed("59H0whq27wwa+\"", "", 0.0, 0.0, "59H0whq27wwa+\"", 2144.969834032337, 0.0, false, (-4105));
      Voluntario voluntario0 = new Voluntario("l]SY\"<:^w}qm3+oVo", "59H0whq27wwa+\"", 0.0, 0.0, (-1266.1));
      transportadoraMed0.setGps(829.537708853, 0.0);
      double double0 = transportadoraMed0.distanciaUser(voluntario0);
      assertEquals("l]SY\"<:^w}qm3+oVo", voluntario0.getCod());
      assertEquals(829.537708853, double0, 0.01);
      assertEquals("l]SY\"<:^w}qm3+oVo", voluntario0.getPass());
      assertEquals("59H0whq27wwa+\"", voluntario0.getName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      // Undeclared exception!
      try { 
        utilizador0.setGps((GPS) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.User", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed((String) null, "`;M%O", (-1.0), (-1.0), (-1.0), false);
      // Undeclared exception!
      try { 
        voluntarioMed0.isSenha("`;M%O");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Voluntario voluntario0 = new Voluntario("l]SY\"<:^w}qm3+oVo", "59H0whq27wwa+\"", 0.0, 0.0, (-1266.1));
      String string0 = voluntario0.getCod();
      assertEquals("59H0whq27wwa+\"", voluntario0.getName());
      assertEquals("l]SY\"<:^w}qm3+oVo", string0);
      assertEquals("l]SY\"<:^w}qm3+oVo", voluntario0.getPass());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TransportadoraMed transportadoraMed0 = new TransportadoraMed("7-@76L\ncV}7?H7nX`", "7-@76L\ncV}7?H7nX`", 3621.62195257782, 2.0, (String) null, 16.5, (-864.018761021), true);
      List<String> list0 = transportadoraMed0.getCodencomendas();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TransportadoraMed transportadoraMed0 = new TransportadoraMed("59H0whq27wwa+\"", "", 0.0, 0.0, "59H0whq27wwa+\"", 2144.969834032337, 0.0, false, (-4105));
      String string0 = transportadoraMed0.getPass();
      assertEquals("", transportadoraMed0.getName());
      assertEquals("59H0whq27wwa+\"", string0);
      assertEquals("59H0whq27wwa+\"", transportadoraMed0.getCod());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador();
      String string0 = utilizador0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      Utilizador utilizador0 = new Utilizador();
      boolean boolean0 = voluntarioMed0.equals(utilizador0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      boolean boolean0 = voluntarioMed0.equals("83H");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      voluntarioMed0.addEncomenda("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n");
      assertFalse(voluntarioMed0.aceitoTrasnporteMedicamentos());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      GPS gPS0 = voluntarioMed0.getGPS();
      voluntarioMed0.setGps(gPS0);
      assertEquals(0.0, voluntarioMed0.getNota(), 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", "83H", 1131.530037424188, 1131.530037424188);
      assertEquals("83H", utilizador0.getName());
      
      utilizador0.setName("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n");
      assertEquals("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", utilizador0.getPass());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed("`;M%O", "`;M%O", (-1.0), (-1.0), (-1.0), true);
      boolean boolean0 = voluntarioMed0.isSenha("`;M%O");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed();
      String string0 = voluntarioMed0.toString();
      assertEquals("Voluntario{\nC\u00F3digo: \nNome: \nGPS: (0.0,0.0)\nRaio: 0.0\nClassificacao:0.00\n}Transporta Medicamentos: false\n", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      VoluntarioMed voluntarioMed0 = new VoluntarioMed("C\u00F3digo: ", "C\u00F3digo: ", 97.50153, 97.50153, 984.2229137469338, true);
      VoluntarioMed voluntarioMed1 = voluntarioMed0.clone();
      assertTrue(voluntarioMed1.equals((Object)voluntarioMed0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Utilizador utilizador0 = new Utilizador("Fqj", "}rU!)?L", 0.0, 1577.8258511352724);
      // Undeclared exception!
      try { 
        utilizador0.distanciaUser((User) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.User", e);
      }
  }
}
