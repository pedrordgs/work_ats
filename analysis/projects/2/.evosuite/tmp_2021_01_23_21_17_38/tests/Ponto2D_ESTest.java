/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:19:19 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ponto2D_ESTest extends Ponto2D_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D0.setY((-2916.6155));
      boolean boolean0 = ponto2D1.equals(ponto2D0);
      assertEquals((-2916.6155), ponto2D0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(44.83041659595, 44.83041659595);
      Ponto2D ponto2D1 = new Ponto2D();
      boolean boolean0 = ponto2D0.equals(ponto2D1);
      assertFalse(boolean0);
      assertEquals(0.0, ponto2D1.getX(), 0.01);
      assertEquals(0.0, ponto2D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.move(ponto2D0);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY((-2271.38));
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      Ponto2D ponto2D2 = new Ponto2D();
      linkedList0.add(ponto2D1);
      ponto2D0.setY(0.0);
      linkedList0.add(ponto2D0);
      assertFalse(ponto2D0.equals((Object)ponto2D1));
      
      Ponto2D ponto2D3 = ponto2D2.closest(linkedList0);
      assertTrue(ponto2D3.equals((Object)ponto2D2));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(2674.0, 2674.0);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D0);
      Ponto2D ponto2D1 = new Ponto2D(2674.0, 0.0);
      linkedList0.add(ponto2D1);
      assertEquals(2674.0, ponto2D1.getX(), 0.01);
      
      Ponto2D ponto2D2 = ponto2D0.closest(linkedList0);
      assertFalse(ponto2D2.equals((Object)ponto2D1));
      assertEquals(2674.0, ponto2D2.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(2674.0, 2674.0);
      double double0 = ponto2D0.getY();
      assertEquals(2674.0, double0, 0.01);
      assertEquals(2674.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY((-2271.38));
      double double0 = ponto2D0.getY();
      assertEquals((-2271.38), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(2674.0, 2674.0);
      double double0 = ponto2D0.getX();
      assertEquals(2674.0, double0, 0.01);
      assertEquals(2674.0, ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(2674.0, 2674.0);
      ponto2D0.setX((-728.6090852069506));
      double double0 = ponto2D0.getX();
      assertEquals((-728.6090852069506), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D0.setY((-2916.6155));
      double double0 = ponto2D1.distance(ponto2D0);
      assertEquals((-2916.6155), ponto2D0.getY(), 0.01);
      assertEquals(2916.6155, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1.0, 1.0);
      double double0 = ponto2D0.distance(1.0, 1.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      ponto2D0.setY((-2916.6155));
      ponto2D0.clone();
      assertEquals((-2916.6155), ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      ponto2D0.clone();
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setX((-2271.38));
      ponto2D0.clone();
      assertEquals((-2271.38), ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      // Undeclared exception!
      try { 
        ponto2D0.move((Ponto2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      // Undeclared exception!
      try { 
        ponto2D0.distance((Ponto2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      // Undeclared exception!
      try { 
        ponto2D0.closest((List<Ponto2D>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-1531.8642), (-1531.8642));
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      // Undeclared exception!
      try { 
        ponto2D0.closest(linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ponto2D ponto2D0 = null;
      try {
        ponto2D0 = new Ponto2D((Ponto2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      double double0 = ponto2D0.getX();
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      double double0 = ponto2D0.getY();
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      double double0 = ponto2D0.distance(3212.216401303001, 0.0);
      assertEquals(3212.216401303001, double0, 0.01);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1.0, 1.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      assertEquals(1.0, ponto2D1.getY(), 0.01);
      
      ponto2D1.move(1.0, 0.0);
      boolean boolean0 = ponto2D1.equals(ponto2D0);
      assertEquals(0.0, ponto2D1.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1.0, 1.0);
      Ponto2D ponto2D1 = new Ponto2D();
      boolean boolean0 = ponto2D1.equals(ponto2D0);
      assertEquals(0.0, ponto2D1.getX(), 0.01);
      assertFalse(boolean0);
      assertEquals(0.0, ponto2D1.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      boolean boolean0 = ponto2D0.equals((Object) null);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(2.0, 0.0);
      boolean boolean0 = ponto2D0.equals(ponto2D0);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(2.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Object object0 = new Object();
      boolean boolean0 = ponto2D0.equals(object0);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      ponto2D0.setX((-2271.38));
      linkedList0.add(ponto2D0);
      ponto2D0.closest(linkedList0);
      assertEquals((-2271.38), ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY((-2271.38));
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D0);
      ponto2D0.closest(linkedList0);
      assertEquals((-2271.38), ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      double double0 = ponto2D0.distance(ponto2D0);
      assertEquals(0.0, double0, 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1.0, 1.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      boolean boolean0 = ponto2D1.equals(ponto2D0);
      assertEquals(1.0, ponto2D0.getY(), 0.01);
      assertTrue(boolean0);
      assertEquals(1.0, ponto2D0.getX(), 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      String string0 = ponto2D0.toString();
      assertEquals("(0.0,0.0)", string0);
  }
}
