/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 21:08:03 GMT 2021
 */

package MVC.Exceptions;

import org.junit.Test;
import static org.junit.Assert.*;
import MVC.Exceptions.InvalidInputException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class InvalidInputException_ESTest extends InvalidInputException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvalidInputException invalidInputException0 = new InvalidInputException("OR!t");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidInputException invalidInputException0 = new InvalidInputException();
  }
}
