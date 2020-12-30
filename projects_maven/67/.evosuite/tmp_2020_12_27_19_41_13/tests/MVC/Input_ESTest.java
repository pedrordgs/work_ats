/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 27 20:03:05 GMT 2020
 */

package MVC;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Input;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Input_ESTest extends Input_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SystemInUtil.addInputLine("(bK=D[F}|>");
      // Undeclared exception!
      try { 
        Input.lerShort();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SystemInUtil.addInputLine("Inteiro Invalido");
      // Undeclared exception!
      try { 
        Input.lerInt();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SystemInUtil.addInputLine("F~%O)nBp6");
      // Undeclared exception!
      try { 
        Input.lerFloat();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SystemInUtil.addInputLine("9<1hr3t]{");
      // Undeclared exception!
      try { 
        Input.lerDouble();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SystemInUtil.addInputLine("=3]80/bc");
      // Undeclared exception!
      try { 
        Input.lerBoolean();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SystemInUtil.addInputLine("");
      String string0 = Input.lerString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SystemInUtil.addInputLine("0");
      short short0 = Input.lerShort();
      assertEquals((short)0, short0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        Input.lerString();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // No line found
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SystemInUtil.addInputLine("6");
      short short0 = Input.lerShort();
      assertEquals((short)6, short0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SystemInUtil.addInputLine("6.");
      float float0 = Input.lerFloat();
      assertEquals(6.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SystemInUtil.addInputLine("6.");
      double double0 = Input.lerDouble();
      assertEquals(6.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SystemInUtil.addInputLine("6");
      int int0 = Input.lerInt();
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SystemInUtil.addInputLine("h,r I6vlitOdo");
      String string0 = Input.lerString();
      assertEquals("h,r I6vlitOdo", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Input input0 = new Input();
  }
}