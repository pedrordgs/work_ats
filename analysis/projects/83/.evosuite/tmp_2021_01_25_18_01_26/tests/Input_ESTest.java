/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 18:09:19 GMT 2021
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Input_ESTest extends Input_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SystemInUtil.addInputLine("3md^[%I");
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
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("Short Invalido");
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
  public void test2()  throws Throwable  {
      SystemInUtil.addInputLine("_x?B]");
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
  public void test3()  throws Throwable  {
      SystemInUtil.addInputLine("m<");
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
  public void test4()  throws Throwable  {
      SystemInUtil.addInputLine("@]~BdPyT b^Y");
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
  public void test5()  throws Throwable  {
      SystemInUtil.addInputLine("");
      String string0 = Input.lerString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
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
  public void test7()  throws Throwable  {
      SystemInUtil.addInputLine("_dT)<nLL#LH7+lX");
      String string0 = Input.lerString();
      assertEquals("_dT)<nLL#LH7+lX", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Input input0 = new Input();
  }
}