/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 25 17:59:11 GMT 2021
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
      InvalidInputException invalidInputException0 = new InvalidInputException("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InvalidInputException invalidInputException0 = new InvalidInputException();
  }
}
