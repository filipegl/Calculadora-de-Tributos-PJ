/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:46:34 GMT 2018
 */

package com.actionbarsherlock.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.app.Activity;
import android.view.MenuItem;
import com.actionbarsherlock.app.SherlockDialogFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.xtremelabs.robolectric.tester.android.view.TestMenuItem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SherlockDialogFragment_ESTest extends SherlockDialogFragment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      // Undeclared exception!
      try { 
        sherlockDialogFragment0.onOptionsItemSelected((MenuItem) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wrapped menu item cannot be null.
         //
         verifyException("com.actionbarsherlock.internal.view.menu.MenuItemWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      com.actionbarsherlock.view.MenuItem menuItem0 = mock(com.actionbarsherlock.view.MenuItem.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = sherlockDialogFragment0.onOptionsItemSelected(menuItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      // Undeclared exception!
      try { 
        sherlockDialogFragment0.onAttach((Activity) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // SherlockDialogFragment must be attached to a SherlockFragmentActivity.
         //
         verifyException("com.actionbarsherlock.app.SherlockDialogFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      Menu menu0 = mock(Menu.class, new ViolatedAssumptionAnswer());
      MenuInflater menuInflater0 = mock(MenuInflater.class, new ViolatedAssumptionAnswer());
      sherlockDialogFragment0.onCreateOptionsMenu(menu0, menuInflater0);
      assertTrue(sherlockDialogFragment0.getUserVisibleHint());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      sherlockDialogFragment0.onDetach();
      assertFalse(sherlockDialogFragment0.getRetainInstance());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      android.view.Menu menu0 = mock(android.view.Menu.class, new ViolatedAssumptionAnswer());
      sherlockDialogFragment0.onPrepareOptionsMenu(menu0);
      assertFalse(sherlockDialogFragment0.isResumed());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      android.view.Menu menu0 = mock(android.view.Menu.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sherlockDialogFragment0.onCreateOptionsMenu(menu0, (android.view.MenuInflater) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.app.SherlockDialogFragment", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      SherlockFragmentActivity sherlockFragmentActivity0 = sherlockDialogFragment0.getSherlockActivity();
      assertNull(sherlockFragmentActivity0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      TestMenuItem testMenuItem0 = new TestMenuItem(3);
      boolean boolean0 = sherlockDialogFragment0.onOptionsItemSelected((MenuItem) testMenuItem0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SherlockDialogFragment sherlockDialogFragment0 = new SherlockDialogFragment();
      Menu menu0 = mock(Menu.class, new ViolatedAssumptionAnswer());
      sherlockDialogFragment0.onPrepareOptionsMenu(menu0);
      assertFalse(sherlockDialogFragment0.isHidden());
  }
}
