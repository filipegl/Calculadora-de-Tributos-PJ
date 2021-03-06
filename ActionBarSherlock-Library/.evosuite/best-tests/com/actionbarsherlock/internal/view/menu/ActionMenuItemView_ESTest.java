/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:07:14 GMT 2018
 */

package com.actionbarsherlock.internal.view.menu;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.content.Context;
import android.util.AttributeSet;
import com.actionbarsherlock.internal.view.menu.ActionMenuItemView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ActionMenuItemView_ESTest extends ActionMenuItemView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionMenuItemView actionMenuItemView0 = null;
      try {
        actionMenuItemView0 = new ActionMenuItemView((Context) null, (AttributeSet) null);
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
      ActionMenuItemView actionMenuItemView0 = null;
      try {
        actionMenuItemView0 = new ActionMenuItemView((Context) null, (AttributeSet) null, (-606));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionMenuItemView actionMenuItemView0 = null;
      try {
        actionMenuItemView0 = new ActionMenuItemView((Context) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }
}
