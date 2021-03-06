/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 21:13:01 GMT 2018
 */

package com.actionbarsherlock.internal.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.app.Activity;
import android.app.Dialog;
import com.actionbarsherlock.internal.app.ActionBarImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionBarImpl_ESTest extends ActionBarImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionBarImpl actionBarImpl0 = null;
      try {
        actionBarImpl0 = new ActionBarImpl((Activity) null, (-559));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.os.Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionBarImpl actionBarImpl0 = null;
      try {
        actionBarImpl0 = new ActionBarImpl((Dialog) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.os.Handler", e);
      }
  }
}
