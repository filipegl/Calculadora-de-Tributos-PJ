/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 21:44:45 GMT 2018
 */

package com.actionbarsherlock.internal.view.menu;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.content.Context;
import com.actionbarsherlock.internal.view.menu.ListMenuItemView;
import com.xtremelabs.robolectric.tester.android.util.TestAttributeSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListMenuItemView_ESTest extends ListMenuItemView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestAttributeSet testAttributeSet0 = new TestAttributeSet();
      ListMenuItemView listMenuItemView0 = null;
      try {
        listMenuItemView0 = new ListMenuItemView((Context) null, testAttributeSet0);
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
      TestAttributeSet testAttributeSet0 = new TestAttributeSet();
      ListMenuItemView listMenuItemView0 = null;
      try {
        listMenuItemView0 = new ListMenuItemView((Context) null, testAttributeSet0, 2877);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }
}
