/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 05 21:49:31 GMT 2018
 */

package com.actionbarsherlock.internal.widget;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import android.content.Context;
import android.view.View;
import com.actionbarsherlock.internal.widget.IcsSpinner;
import com.xtremelabs.robolectric.res.AttrResourceLoader;
import com.xtremelabs.robolectric.res.ResourceExtractor;
import com.xtremelabs.robolectric.tester.android.util.TestAttributeSet;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IcsSpinner_ESTest extends IcsSpinner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TestAttributeSet testAttributeSet0 = new TestAttributeSet((Map<String, String>) null);
      assertNotNull(testAttributeSet0);
      
      IcsSpinner icsSpinner0 = null;
      try {
        icsSpinner0 = new IcsSpinner((Context) null, testAttributeSet0, 0);
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
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      assertNotNull(hashMap0);
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      
      ResourceExtractor resourceExtractor0 = new ResourceExtractor();
      assertNotNull(resourceExtractor0);
      
      AttrResourceLoader attrResourceLoader0 = new AttrResourceLoader(resourceExtractor0);
      assertNotNull(attrResourceLoader0);
      
      Class<View> class0 = View.class;
      TestAttributeSet testAttributeSet0 = new TestAttributeSet(hashMap0, resourceExtractor0, attrResourceLoader0, class0, false);
      assertNotNull(testAttributeSet0);
      assertEquals(0, hashMap0.size());
      assertTrue(hashMap0.isEmpty());
      
      IcsSpinner icsSpinner0 = null;
      try {
        icsSpinner0 = new IcsSpinner((Context) null, testAttributeSet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Stub!
         //
         verifyException("android.view.View", e);
      }
  }
}
