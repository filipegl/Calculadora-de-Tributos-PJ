/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 22:35:54 GMT 2018
 */

package com.actionbarsherlock.internal.nineoldandroids.animation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator;
import com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Animator_ESTest extends Animator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.start();
      assertEquals(0L, animatorSet0.getStartDelay());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.setupStartValues();
      assertEquals(0L, animatorSet0.getStartDelay());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.setupEndValues();
      assertEquals((-1L), animatorSet0.getDuration());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.setTarget(animatorSet0);
      assertFalse(animatorSet0.isStarted());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.setStartDelay(746L);
      assertEquals((-1L), animatorSet0.getDuration());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.end();
      assertEquals(0L, animatorSet0.getStartDelay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.cancel();
      assertFalse(animatorSet0.isStarted());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      Animator animator0 = animatorSet0.setDuration(8L);
      assertSame(animatorSet0, animator0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      boolean boolean0 = animatorSet0.isStarted();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      boolean boolean0 = animatorSet0.isRunning();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.addListener((Animator.AnimatorListener) null);
      ArrayList<Animator.AnimatorListener> arrayList0 = animatorSet0.getListeners();
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.setDuration(0L);
      long long0 = animatorSet0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      AnimatorSet animatorSet1 = animatorSet0.setDuration(376L);
      long long0 = animatorSet1.getDuration();
      assertEquals(376L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      long long0 = animatorSet0.getDuration();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      Animator animator0 = animatorSet0.clone();
      assertNotSame(animator0, animatorSet0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      // Undeclared exception!
      try { 
        animatorSet0.setDuration((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // duration must be a value of zero or greater
         //
         verifyException("com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.addListener((Animator.AnimatorListener) null);
      AnimatorSet animatorSet1 = animatorSet0.clone();
      assertNotSame(animatorSet1, animatorSet0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.addListener((Animator.AnimatorListener) null);
      animatorSet0.removeAllListeners();
      assertEquals(0L, animatorSet0.getStartDelay());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.removeAllListeners();
      assertEquals(0L, animatorSet0.getStartDelay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.addListener((Animator.AnimatorListener) null);
      animatorSet0.removeListener((Animator.AnimatorListener) null);
      assertEquals((-1L), animatorSet0.getDuration());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      animatorSet0.addListener((Animator.AnimatorListener) null);
      animatorSet0.addListener((Animator.AnimatorListener) null);
      animatorSet0.removeListener((Animator.AnimatorListener) null);
      assertFalse(animatorSet0.isStarted());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      AnimatorSet animatorSet0 = new AnimatorSet();
      ArrayList<Animator.AnimatorListener> arrayList0 = animatorSet0.getListeners();
      assertNull(arrayList0);
  }
}
