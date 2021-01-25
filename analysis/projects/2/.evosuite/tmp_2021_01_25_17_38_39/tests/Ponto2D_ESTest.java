/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 17:40:46 GMT 2021
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
      Ponto2D ponto2D0 = new Ponto2D(850.0122584, 2460.6176002987545);
      ponto2D0.move(1.0, 1.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      ponto2D1.toString();
      ponto2D1.move(2460.6176002987545, 1.0);
      ponto2D1.move(ponto2D0);
      ponto2D0.equals(ponto2D1);
      ponto2D1.toString();
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      Ponto2D ponto2D2 = ponto2D1.closest(linkedList0);
      ponto2D0.equals("(1.0,1.0)");
      ponto2D0.toString();
      ponto2D0.distance(1.0, 1.0);
      Object object0 = new Object();
      ponto2D1.equals(object0);
      ponto2D0.equals(object0);
      ponto2D1.equals(ponto2D2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D();
      ponto2D0.move(ponto2D1);
      ponto2D1.move(ponto2D0);
      Ponto2D ponto2D2 = new Ponto2D(776.730309451, 776.730309451);
      ponto2D2.clone();
      ponto2D1.setX(776.730309451);
      ponto2D2.move(776.730309451, 776.730309451);
      Ponto2D ponto2D3 = ponto2D2.clone();
      ponto2D1.equals(ponto2D2);
      ponto2D1.toString();
      ponto2D3.clone();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(472.27323407, (-2114.2932822095113));
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D0.toString();
      ponto2D1.move(472.27323407, 0.0);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      ponto2D1.closest(linkedList0);
      ponto2D0.move((-1.0), 0.0);
      ponto2D0.setX((-2114.2932822095113));
      ponto2D1.move(ponto2D0);
      Ponto2D ponto2D2 = ponto2D1.clone();
      ponto2D2.clone();
      ponto2D2.setY((-2114.2932822095113));
      Ponto2D ponto2D3 = ponto2D0.clone();
      ponto2D3.setX((-3048.6));
      ponto2D0.equals((Object) null);
      ponto2D0.toString();
      Ponto2D ponto2D4 = ponto2D1.clone();
      ponto2D4.setX((-1109.0));
      Ponto2D ponto2D5 = new Ponto2D();
      Ponto2D ponto2D6 = new Ponto2D(ponto2D5);
      ponto2D3.equals(ponto2D6);
      ponto2D5.distance(0.0, (-3048.6));
      ponto2D6.getY();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-2443.870202860126), (-2443.870202860126));
      ponto2D0.setY(1.0);
      ponto2D0.toString();
      ponto2D0.move((-1.0), 0.0);
      Ponto2D ponto2D1 = new Ponto2D((-2443.870202860126), 0.0);
      ponto2D1.setY(0.0);
      ponto2D0.distance(ponto2D1);
      Ponto2D ponto2D2 = ponto2D1.clone();
      ponto2D2.toString();
      ponto2D2.distance(0.0, (-995.54837501354));
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D0);
      Ponto2D ponto2D3 = ponto2D1.closest(linkedList0);
      Ponto2D ponto2D4 = ponto2D3.clone();
      ponto2D4.setY((-1.0));
      ponto2D1.distance(ponto2D2);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.clear();
      linkedList0.add(ponto2D0);
      Ponto2D ponto2D1 = ponto2D0.closest(linkedList0);
      ponto2D0.equals("");
      Ponto2D ponto2D2 = new Ponto2D(ponto2D1);
      linkedList0.add(ponto2D2);
      ponto2D0.equals("");
      Ponto2D ponto2D3 = ponto2D1.closest(linkedList0);
      ponto2D3.setY((-1.0));
      ponto2D1.setX(772.29950951587);
      ponto2D1.setY((-694.138));
      ponto2D0.move(ponto2D1);
      Ponto2D ponto2D4 = ponto2D1.closest(linkedList0);
      ponto2D4.setX((-694.138));
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList0.removeAll(linkedList1);
      ponto2D4.setY(1937.941749);
      ponto2D1.toString();
      ponto2D4.distance(ponto2D3);
      ponto2D2.clone();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1755.420632, 1755.420632);
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.setX(1755.420632);
      ponto2D1.setY(1755.420632);
      Ponto2D ponto2D2 = ponto2D0.clone();
      ponto2D2.setX(1.0);
      ponto2D2.move(ponto2D1);
      ponto2D0.setX(1755.420632);
      ponto2D0.distance(ponto2D1);
      ponto2D1.move(0.0, 1755.420632);
      ponto2D1.toString();
      ponto2D0.setX(0.0);
      ponto2D0.setY(1755.420632);
      ponto2D2.clone();
      ponto2D1.setX(0.0);
      ponto2D1.move(1755.420632, 0.0);
      ponto2D1.setX(0.0);
      ponto2D0.equals(ponto2D1);
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
  public void test06()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = null;
      ponto2D0.toString();
      Ponto2D ponto2D2 = ponto2D0.clone();
      double double0 = 4386.108732230569;
      ponto2D2.move(4386.108732230569, 4386.108732230569);
      ponto2D0.toString();
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
  public void test07()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.getX();
      Ponto2D ponto2D1 = null;
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
  public void test08()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
      
      ponto2D1.setX(0.0);
      ponto2D1.setX((-1696.0));
      ponto2D1.setX(3067.579);
      Ponto2D ponto2D2 = ponto2D1.clone();
      ponto2D2.equals(ponto2D0);
      ponto2D1.getY();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      Ponto2D ponto2D1 = new Ponto2D();
      linkedList0.add(0, ponto2D1);
      Ponto2D ponto2D2 = ponto2D0.closest(linkedList0);
      ponto2D2.distance(0.0, 0.0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-2912.63), 1330.856524082396);
      ponto2D0.move(1.0, 1.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      ponto2D1.setY((-2912.63));
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
  public void test11()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(1.0, (-1.0));
      ponto2D0.clone();
      Ponto2D ponto2D1 = ponto2D0.clone();
      ponto2D0.move((-1.0), (-4249.5698579));
      Ponto2D ponto2D2 = new Ponto2D(ponto2D0);
      Ponto2D ponto2D3 = new Ponto2D(ponto2D2);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      Ponto2D ponto2D4 = ponto2D2.closest(linkedList0);
      ponto2D4.move(1.0, 1.0);
      ponto2D4.setY(843.3589085027);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setX(0.0);
      ponto2D0.setY(1.0);
      ponto2D0.setX(1.0);
      ponto2D0.getX();
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D0);
      ponto2D0.closest(linkedList0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.move((-554.9627984), 3716.62816);
      ponto2D0.distance(0.0, 3117.5);
      ponto2D0.move(3117.5, (-1.0));
      ponto2D0.equals((Object) null);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY(6310.19472);
      ponto2D0.getY();
      ponto2D0.getX();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-1.0), (-1.0));
      ponto2D0.getY();
      ponto2D0.getX();
      Object object0 = new Object();
      ponto2D0.equals(object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY((-1.0));
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.move((-1.0), (-1.0));
      ponto2D1.distance(ponto2D0);
      ponto2D0.distance((-424.722234), 667.64);
      ponto2D0.setY((-2153.0));
      Ponto2D ponto2D2 = ponto2D0.clone();
      ponto2D2.setY((-2153.0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setX(0.0);
      ponto2D0.clone();
      ponto2D0.move(854.5275815995388, 854.5275815995388);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-3934.42), 0.0);
      ponto2D0.setY(0.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      Ponto2D ponto2D2 = new Ponto2D(ponto2D0);
      ponto2D2.getY();
      ponto2D1.distance(ponto2D0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-614.8680152635), (-614.8680152635));
      Integer integer0 = new Integer((-230));
      ponto2D0.equals(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Ponto2D ponto2D0 = null;
      Ponto2D ponto2D1 = null;
      try {
        ponto2D1 = new Ponto2D((Ponto2D) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("Ponto2D", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-1.0), 825.9249);
      double double0 = (-1745.38325342674);
      ponto2D0.distance((-1745.38325342674), 825.9249);
      ponto2D0.toString();
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
  public void test22()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.clone();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(0.0, 0.0);
      Ponto2D ponto2D1 = new Ponto2D();
      ponto2D0.equals(ponto2D1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-1.0), (-1.0));
      Ponto2D ponto2D1 = new Ponto2D();
      ponto2D0.move(ponto2D1);
      ponto2D0.getX();
      ponto2D1.move(ponto2D0);
      ponto2D1.setY((-1.0));
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
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
  public void test26()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D((-798.2354246063312), (-798.2354246063312));
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.setX((-1.0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.distance(269.835, (-1911.207374151422));
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.getY();
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.move(2184.2128753, 0.0);
      ponto2D0.setY(3133.0);
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.toString();
      ponto2D0.distance(ponto2D1);
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
  public void test30()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D1.toString();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.move((-1523.0017623234621), (-1523.0017623234621));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      ponto2D0.setY(0.0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(850.0122584, 2460.6176002987545);
      ponto2D0.move(1.0, 1.0);
      Ponto2D ponto2D1 = ponto2D0.clone();
      ponto2D1.toString();
      ponto2D1.move(2460.6176002987545, 1.0);
      ponto2D1.move(ponto2D0);
      ponto2D0.equals(ponto2D1);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      Ponto2D ponto2D2 = ponto2D1.closest(linkedList0);
      ponto2D0.equals("(1.0,1.0)");
      ponto2D0.toString();
      ponto2D0.distance(1.0, 1.0);
      Object object0 = new Object();
      ponto2D1.equals(object0);
      ponto2D0.equals(object0);
      ponto2D1.equals(ponto2D2);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D(472.27323407, (-2114.2932822095113));
      Ponto2D ponto2D1 = new Ponto2D(ponto2D0);
      ponto2D0.toString();
      ponto2D1.move(472.27323407, 0.0);
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      linkedList0.add(ponto2D1);
      ponto2D1.closest(linkedList0);
      ponto2D0.move((-1.0), 0.0);
      ponto2D0.setX((-2114.2932822095113));
      ponto2D1.move(ponto2D0);
      ponto2D0.clone();
      ponto2D1.setY((-2114.2932822095113));
      Ponto2D ponto2D2 = ponto2D0.clone();
      ponto2D2.setX((-3048.6));
      ponto2D0.equals((Object) null);
      ponto2D0.toString();
      Ponto2D ponto2D3 = ponto2D1.clone();
      ponto2D3.setX((-1109.0));
      Ponto2D ponto2D4 = new Ponto2D();
      Ponto2D ponto2D5 = new Ponto2D(ponto2D4);
      ponto2D2.equals(ponto2D5);
      assertEquals((-2114.2932822095113), ponto2D0.getX(), 0.01);
      
      ponto2D4.distance(0.0, (-3048.6));
      double double0 = ponto2D5.getY();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      LinkedList<Ponto2D> linkedList0 = new LinkedList<Ponto2D>();
      Ponto2D ponto2D1 = new Ponto2D(469.907, 741.581);
      Ponto2D ponto2D2 = new Ponto2D(ponto2D1);
      linkedList0.add(ponto2D2);
      assertEquals(469.907, ponto2D2.getX(), 0.01);
      assertEquals(741.581, ponto2D2.getY(), 0.01);
      
      Ponto2D ponto2D3 = new Ponto2D(ponto2D0);
      linkedList0.add(ponto2D3);
      Ponto2D ponto2D4 = ponto2D0.closest(linkedList0);
      assertSame(ponto2D4, ponto2D3);
      assertEquals(0.0, ponto2D0.getX(), 0.01);
      assertEquals(0.0, ponto2D0.getY(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Ponto2D ponto2D0 = new Ponto2D();
      Ponto2D ponto2D1 = new Ponto2D(776.730309451, 776.730309451);
      Ponto2D ponto2D2 = new Ponto2D();
      ponto2D0.setX(776.730309451);
      ponto2D1.move(776.730309451, 776.730309451);
      Ponto2D ponto2D3 = ponto2D1.clone();
      ponto2D0.equals(ponto2D1);
      ponto2D0.toString();
      assertEquals(776.730309451, ponto2D0.getX(), 0.01);
      
      ponto2D3.clone();
      assertFalse(ponto2D1.equals((Object)ponto2D0));
  }
}