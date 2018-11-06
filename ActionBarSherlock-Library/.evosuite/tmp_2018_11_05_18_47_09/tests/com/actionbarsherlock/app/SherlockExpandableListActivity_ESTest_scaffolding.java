/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 05 22:30:57 GMT 2018
 */

package com.actionbarsherlock.app;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SherlockExpandableListActivity_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.actionbarsherlock.app.SherlockExpandableListActivity"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SherlockExpandableListActivity_ESTest_scaffolding.class.getClassLoader() ,
      "com.actionbarsherlock.ActionBarSherlock$OnPreparePanelListener",
      "android.content.Context",
      "com.actionbarsherlock.ActionBarSherlock$OnActionModeStartedListener",
      "android.widget.ExpandableListView$OnChildClickListener",
      "android.view.KeyEvent$Callback",
      "android.view.LayoutInflater$Factory",
      "com.actionbarsherlock.ActionBarSherlock$OnMenuItemSelectedListener",
      "android.content.ComponentCallbacks",
      "android.app.ExpandableListActivity",
      "com.actionbarsherlock.app.SherlockExpandableListActivity",
      "android.view.Window$Callback",
      "android.widget.ExpandableListView$OnGroupCollapseListener",
      "android.widget.ExpandableListView$OnGroupExpandListener",
      "android.content.ComponentCallbacks2",
      "android.view.ContextThemeWrapper",
      "com.actionbarsherlock.ActionBarSherlock$OnActionModeFinishedListener",
      "com.actionbarsherlock.ActionBarSherlock$OnCreatePanelMenuListener",
      "android.view.LayoutInflater$Factory2",
      "android.content.ContextWrapper",
      "android.app.Activity",
      "android.view.View$OnCreateContextMenuListener"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SherlockExpandableListActivity_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "android.content.Context",
      "android.content.ContextWrapper",
      "android.view.ContextThemeWrapper",
      "android.app.Activity",
      "android.app.ExpandableListActivity",
      "com.actionbarsherlock.app.SherlockExpandableListActivity",
      "com.actionbarsherlock.ActionBarSherlock",
      "android.os.Build$VERSION"
    );
  }
}
