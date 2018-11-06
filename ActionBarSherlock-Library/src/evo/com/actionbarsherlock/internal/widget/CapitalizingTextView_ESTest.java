/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:41:33 GMT 2018
 */

package com.actionbarsherlock.internal.widget;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.content.Context;
import android.util.AttributeSet;
import com.actionbarsherlock.internal.widget.CapitalizingTextView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CapitalizingTextView_ESTest extends CapitalizingTextView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      AttributeSet attributeSet0 = mock(AttributeSet.class, new ViolatedAssumptionAnswer());
      CapitalizingTextView capitalizingTextView0 = null;
      try {
        capitalizingTextView0 = new CapitalizingTextView(context0, attributeSet0, 14);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      AttributeSet attributeSet0 = mock(AttributeSet.class, new ViolatedAssumptionAnswer());
      CapitalizingTextView capitalizingTextView0 = null;
      try {
        capitalizingTextView0 = new CapitalizingTextView(context0, attributeSet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }
}
