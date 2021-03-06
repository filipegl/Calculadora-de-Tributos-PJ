/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:51:33 GMT 2018
 */

package com.actionbarsherlock.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.app.Activity;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.internal.app.ActionBarWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionBar_ESTest extends ActionBar_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionBar.LayoutParams actionBar_LayoutParams0 = null;
      try {
        actionBar_LayoutParams0 = new ActionBar.LayoutParams(21, 21, 21);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.ViewGroup$LayoutParams", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionBar.LayoutParams actionBar_LayoutParams0 = null;
      try {
        actionBar_LayoutParams0 = new ActionBar.LayoutParams((-3632), (-3632));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.ViewGroup$LayoutParams", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionBar.LayoutParams actionBar_LayoutParams0 = null;
      try {
        actionBar_LayoutParams0 = new ActionBar.LayoutParams((-260));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.ViewGroup$LayoutParams", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Activity activity0 = mock(Activity.class, new ViolatedAssumptionAnswer());
      doReturn((android.app.ActionBar) null).when(activity0).getActionBar();
      ActionBarWrapper actionBarWrapper0 = new ActionBarWrapper(activity0);
      android.app.ActionBar.Tab actionBar_Tab0 = mock(android.app.ActionBar.Tab.class, new ViolatedAssumptionAnswer());
      doReturn((android.app.ActionBar.Tab) null).when(actionBar_Tab0).setTag(any());
      ActionBarWrapper.TabWrapper actionBarWrapper_TabWrapper0 = actionBarWrapper0.new TabWrapper(actionBar_Tab0);
      assertEquals((-1), ActionBar.Tab.INVALID_POSITION);
  }
}
