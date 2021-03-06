/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:48:16 GMT 2018
 */

package com.actionbarsherlock.internal.view.menu;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.actionbarsherlock.internal.view.menu.SubMenuWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SubMenuWrapper_ESTest extends SubMenuWrapper_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setIcon(any(android.graphics.drawable.Drawable.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setIcon(drawable0);
      assertEquals(89, subMenu2.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setIcon(any(android.graphics.drawable.Drawable.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setIcon(drawable0);
      assertSame(subMenu2, subMenuWrapper0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setIcon(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setIcon(312);
      assertSame(subMenuWrapper0, subMenu2);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setHeaderView(any(android.view.View.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      View view0 = mock(View.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setHeaderView(view0);
      assertSame(subMenuWrapper0, subMenu1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0, subMenu0).when(subMenu1).setHeaderIcon(anyInt());
      doReturn(subMenu0).when(subMenu1).setHeaderView(any(android.view.View.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      subMenuWrapper0.setHeaderIcon(0);
      subMenuWrapper0.setHeaderIcon(2899);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderView((View) null);
      assertSame(subMenu2, subMenuWrapper0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setHeaderView(any(android.view.View.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      View view0 = mock(View.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setHeaderView(view0);
      assertSame(subMenu1, subMenuWrapper0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu2 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu2).setHeaderIcon(anyInt());
      doReturn(subMenu0).when(subMenu2).setHeaderTitle(any(java.lang.CharSequence.class));
      doReturn(subMenu1).when(subMenu2).setHeaderTitle(anyInt());
      doReturn(subMenu0).when(subMenu2).setIcon(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu2);
      subMenuWrapper0.setHeaderTitle(864);
      subMenuWrapper0.setIcon(864);
      subMenuWrapper0.setHeaderIcon(199);
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu3 = subMenuWrapper0.setHeaderTitle(charSequence0);
      assertTrue(subMenu3.hasVisibleItems());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setHeaderTitle(any(java.lang.CharSequence.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderTitle((CharSequence) null);
      assertTrue(subMenu2.hasVisibleItems());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setHeaderTitle(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderTitle(103);
      assertSame(subMenuWrapper0, subMenu2);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setHeaderTitle(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderTitle(255);
      assertSame(subMenuWrapper0, subMenu2);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu2 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu2).setHeaderIcon(any(android.graphics.drawable.Drawable.class));
      doReturn(subMenu0).when(subMenu2).setHeaderIcon(anyInt());
      doReturn(subMenu1).when(subMenu2).setHeaderTitle(anyInt());
      doReturn(subMenu0).when(subMenu2).setIcon(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu2);
      subMenuWrapper0.setHeaderTitle(864);
      com.actionbarsherlock.view.SubMenu subMenu3 = subMenuWrapper0.setIcon(864);
      com.actionbarsherlock.view.SubMenu subMenu4 = subMenuWrapper0.setHeaderIcon(199);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu5 = subMenu3.setHeaderIcon(drawable0);
      assertSame(subMenu5, subMenu4);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setHeaderIcon(any(android.graphics.drawable.Drawable.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderIcon(drawable0);
      assertEquals((-11), subMenu2.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu1 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn(subMenu0).when(subMenu1).setHeaderIcon(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu1);
      com.actionbarsherlock.view.SubMenu subMenu2 = subMenuWrapper0.setHeaderIcon(333);
      assertEquals((-8), subMenu2.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MenuItem menuItem0 = mock(MenuItem.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((MenuItem) null).when(subMenu0).getItem();
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      // Undeclared exception!
      try { 
        subMenuWrapper0.getItem();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wrapped menu item cannot be null.
         //
         verifyException("com.actionbarsherlock.internal.view.menu.MenuItemWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        subMenuWrapper0.setIcon(drawable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.setIcon(1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      CharSequence charSequence0 = mock(CharSequence.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        subMenuWrapper0.setHeaderTitle(charSequence0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.setHeaderIcon((Drawable) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.setHeaderIcon(0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.getItem();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((MenuItem) null).when(subMenu0).getItem();
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      // Undeclared exception!
      try { 
        subMenuWrapper0.getItem();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wrapped menu item cannot be null.
         //
         verifyException("com.actionbarsherlock.internal.view.menu.MenuItemWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.clearHeader();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      MenuItem menuItem0 = mock(MenuItem.class, new ViolatedAssumptionAnswer());
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((MenuItem) null).when(subMenu0).getItem();
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      // Undeclared exception!
      try { 
        subMenuWrapper0.getItem();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Wrapped menu item cannot be null.
         //
         verifyException("com.actionbarsherlock.internal.view.menu.MenuItemWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setHeaderTitle(any(java.lang.CharSequence.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setHeaderTitle((CharSequence) null);
      assertEquals(0, subMenu1.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setHeaderIcon(any(android.graphics.drawable.Drawable.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setHeaderIcon(drawable0);
      assertSame(subMenu1, subMenuWrapper0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      // Undeclared exception!
      try { 
        subMenuWrapper0.setHeaderTitle(32768);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setIcon(anyInt());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setIcon(312);
      assertEquals(0, subMenu1.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      subMenuWrapper0.clearHeader();
      assertEquals(0, subMenuWrapper0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper((SubMenu) null);
      View view0 = mock(View.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        subMenuWrapper0.setHeaderView(view0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.actionbarsherlock.internal.view.menu.SubMenuWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SubMenu subMenu0 = mock(SubMenu.class, new ViolatedAssumptionAnswer());
      doReturn((SubMenu) null).when(subMenu0).setIcon(any(android.graphics.drawable.Drawable.class));
      SubMenuWrapper subMenuWrapper0 = new SubMenuWrapper(subMenu0);
      Drawable drawable0 = mock(Drawable.class, new ViolatedAssumptionAnswer());
      com.actionbarsherlock.view.SubMenu subMenu1 = subMenuWrapper0.setIcon(drawable0);
      assertSame(subMenuWrapper0, subMenu1);
  }
}
