/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:28:59 GMT 2021
 */

package MVC.Models.BaseModels;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Models.BaseModels.GPS;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GPS_ESTest extends GPS_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GPS gPS0 = new GPS();
      GPS gPS1 = gPS0.clone();
      gPS0.setX(4579.798);
      boolean boolean0 = gPS0.equals(gPS1);
      assertEquals(4579.798, gPS0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GPS gPS0 = new GPS();
      double double0 = gPS0.getY();
      assertEquals(0.0, gPS0.getX(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GPS gPS0 = new GPS((-3598.785060572695), 504.7750590649);
      double double0 = gPS0.getY();
      assertEquals(504.7750590649, double0, 0.01);
      assertEquals((-3598.785060572695), gPS0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GPS gPS0 = new GPS();
      double double0 = gPS0.getX();
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GPS gPS0 = new GPS(361.16038586, 361.16038586);
      double double0 = gPS0.getX();
      assertEquals(361.16038586, double0, 0.01);
      assertEquals(361.16038586, gPS0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GPS gPS0 = new GPS(0.0, 0.0);
      gPS0.setXY(0.0, 242.0261564094999);
      GPS gPS1 = new GPS();
      double double0 = gPS0.distancia(gPS1);
      assertEquals(242.0261564094999, gPS0.getY(), 0.01);
      assertEquals(242.0261564094999, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GPS gPS0 = new GPS((-1.0), (-1.0));
      GPS gPS1 = gPS0.clone();
      assertTrue(gPS1.equals((Object)gPS0));
      assertEquals((-1.0), gPS1.getX(), 0.01);
      assertEquals((-1.0), gPS0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GPS gPS0 = new GPS(1.0, 1.0);
      // Undeclared exception!
      try { 
        gPS0.distancia((GPS) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.GPS", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GPS gPS0 = null;
      try {
        gPS0 = new GPS((GPS) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Models.BaseModels.GPS", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GPS gPS0 = new GPS((-1.0), (-1.0));
      double double0 = gPS0.getX();
      assertEquals((-1.0), gPS0.getY(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GPS gPS0 = new GPS();
      GPS gPS1 = new GPS(gPS0);
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertEquals(0.0, gPS0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GPS gPS0 = new GPS((-1.0), (-1.0));
      double double0 = gPS0.getY();
      assertEquals((-1.0), gPS0.getX(), 0.01);
      assertEquals((-1.0), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GPS gPS0 = new GPS();
      gPS0.setX(1770.13040685);
      GPS gPS1 = new GPS(1770.13040685, 1770.13040685);
      boolean boolean0 = gPS0.equals(gPS1);
      assertEquals(1770.13040685, gPS0.getX(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GPS gPS0 = new GPS();
      GPS gPS1 = gPS0.clone();
      boolean boolean0 = gPS0.equals(gPS1);
      assertTrue(boolean0);
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertEquals(0.0, gPS0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GPS gPS0 = new GPS();
      boolean boolean0 = gPS0.equals("L7Gl");
      assertEquals(0.0, gPS0.getX(), 0.01);
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GPS gPS0 = new GPS();
      boolean boolean0 = gPS0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertEquals(0.0, gPS0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GPS gPS0 = new GPS(1770.13040685, 468.15356911);
      boolean boolean0 = gPS0.equals(gPS0);
      assertEquals(1770.13040685, gPS0.getX(), 0.01);
      assertTrue(boolean0);
      assertEquals(468.15356911, gPS0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      GPS gPS0 = new GPS();
      GPS gPS1 = new GPS(1770.13040685, 1770.13040685);
      boolean boolean0 = gPS0.equals(gPS1);
      assertFalse(boolean0);
      assertEquals(0.0, gPS0.getY(), 0.01);
      assertEquals(0.0, gPS0.getX(), 0.01);
      assertEquals(1770.13040685, gPS1.getY(), 0.01);
      assertEquals(1770.13040685, gPS1.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      GPS gPS0 = new GPS(1770.13040685, 468.15356911);
      assertEquals(1770.13040685, gPS0.getX(), 0.01);
      
      gPS0.setX(468.15356911);
      GPS gPS1 = new GPS(468.15356911, (-3530.24));
      boolean boolean0 = gPS0.equals(gPS1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      GPS gPS0 = new GPS(1770.13040685, 468.15356911);
      GPS gPS1 = gPS0.clone();
      assertEquals(1770.13040685, gPS1.getX(), 0.01);
      assertTrue(gPS1.equals((Object)gPS0));
      assertEquals(468.15356911, gPS1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      GPS gPS0 = new GPS(1770.13040685, 468.15356911);
      double double0 = gPS0.distancia(gPS0);
      assertEquals(468.15356911, gPS0.getY(), 0.01);
      assertEquals(1770.13040685, gPS0.getX(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      GPS gPS0 = new GPS(1770.13040685, 468.15356911);
      String string0 = gPS0.toString();
      assertEquals("GPS: (1770.13040685,468.15356911)", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      GPS gPS0 = new GPS();
      gPS0.setY((-2.2377271196791773));
      assertEquals((-2.2377271196791773), gPS0.getY(), 0.01);
  }
}