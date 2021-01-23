/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 23 21:34:27 GMT 2021
 */

package MVC.Views;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import MVC.Views.ListView;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListView_ESTest extends ListView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListView<String> listView0 = new ListView<String>();
      listView0.setList((List<String>) null);
      // Undeclared exception!
      try { 
        listView0.show();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("MVC.Views.ListView", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ListView<Object> listView0 = new ListView<Object>();
      listView0.show();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListView<Object> listView0 = new ListView<Object>();
      listView0.show((Object) ".~:;*wt!5w@6e");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ListView<Object> listView0 = null;
      try {
        listView0 = new ListView<Object>((Collection<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}