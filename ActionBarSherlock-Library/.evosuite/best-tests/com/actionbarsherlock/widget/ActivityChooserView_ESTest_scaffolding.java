/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 05 22:05:17 GMT 2018
 */

package com.actionbarsherlock.widget;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ActivityChooserView_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.actionbarsherlock.widget.ActivityChooserView"; 
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

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Thiago\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Thiago\\Documents\\Calculadora\\Calculadora-de-Tributos-PJ\\ActionBarSherlock-Library"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Thiago"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Thiago"); 
    java.lang.System.setProperty("user.timezone", "America/Sao_Paulo"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActivityChooserView_ESTest_scaffolding.class.getClassLoader() ,
      "android.app.NativeActivity",
      "android.view.View$AccessibilityDelegate",
      "android.content.ComponentCallbacks",
      "android.view.MenuItem$OnActionExpandListener",
      "android.view.View$MeasureSpec",
      "android.graphics.Bitmap$Config",
      "android.widget.ExpandableListView$OnGroupCollapseListener",
      "android.content.res.ColorStateList",
      "android.support.v4.app.BackStackRecord$Op",
      "android.view.Display",
      "android.support.v4.app.LoaderManagerImpl",
      "android.view.DragEvent",
      "android.accounts.Account",
      "android.support.v4.app.Fragment",
      "android.widget.ExpandableListView$OnGroupClickListener",
      "android.view.View$OnGenericMotionListener",
      "android.content.ContentProvider$PipeDataWriter",
      "com.actionbarsherlock.internal.app.ActionBarWrapper",
      "android.graphics.Paint",
      "com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener",
      "android.content.DialogInterface$OnShowListener",
      "android.widget.AdapterView$OnItemSelectedListener",
      "android.app.FragmentManager",
      "android.graphics.Path",
      "android.app.TimePickerDialog",
      "com.actionbarsherlock.R$id",
      "android.content.IntentSender$OnFinished",
      "com.actionbarsherlock.app.ActionBar",
      "android.widget.ExpandableListAdapter",
      "com.actionbarsherlock.widget.ShareActionProvider$OnShareTargetSelectedListener",
      "android.view.ViewTreeObserver$OnPreDrawListener",
      "android.widget.LinearLayout$LayoutParams",
      "android.graphics.Bitmap$CompressFormat",
      "android.graphics.ColorFilter",
      "android.os.Parcelable",
      "com.actionbarsherlock.widget.ShareActionProvider",
      "android.graphics.Path$FillType",
      "android.text.method.KeyListener",
      "android.graphics.drawable.DrawableContainer$DrawableContainerState",
      "android.content.ComponentName",
      "com.actionbarsherlock.R$styleable",
      "android.view.Surface$OutOfResourcesException",
      "android.widget.ArrayAdapter",
      "android.graphics.drawable.PaintDrawable",
      "android.support.v4.app.FragmentManager",
      "android.content.SharedPreferences",
      "com.actionbarsherlock.R$integer",
      "android.animation.Animator$AnimatorListener",
      "com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet",
      "android.view.View$BaseSavedState",
      "android.view.animation.ScaleAnimation",
      "android.graphics.Region$Op",
      "android.os.IBinder$DeathRecipient",
      "android.widget.ImageButton",
      "android.view.ActionMode",
      "android.graphics.drawable.Drawable$Callback",
      "com.actionbarsherlock.R$drawable",
      "android.text.style.ClickableSpan",
      "android.animation.Animator",
      "android.support.v4.app.LoaderManager$LoaderCallbacks",
      "android.util.AndroidRuntimeException",
      "android.view.animation.AccelerateDecelerateInterpolator",
      "android.database.DatabaseErrorHandler",
      "android.widget.AdapterView",
      "android.database.DataSetObserver",
      "android.view.View$OnLongClickListener",
      "android.content.pm.ComponentInfo",
      "com.actionbarsherlock.internal.view.View_HasStateListenerSupport",
      "android.support.v4.content.Loader$OnLoadCompleteListener",
      "com.actionbarsherlock.widget.ActivityChooserView$Callbacks",
      "com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup",
      "com.actionbarsherlock.view.MenuItem$OnActionExpandListener",
      "android.view.LayoutInflater$Filter",
      "android.widget.BaseAdapter",
      "android.app.Application",
      "android.content.ActivityNotFoundException",
      "com.actionbarsherlock.internal.widget.ScrollingTabContainerView$TabView",
      "android.view.accessibility.AccessibilityRecord",
      "android.gesture.OrientedBoundingBox",
      "android.widget.Filterable",
      "com.actionbarsherlock.internal.widget.IcsAbsSpinner",
      "android.widget.ListView",
      "com.actionbarsherlock.internal.view.menu.MenuView",
      "android.view.LayoutInflater$Factory2",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView",
      "android.view.inputmethod.EditorInfo",
      "android.content.res.AssetFileDescriptor",
      "android.widget.CalendarView",
      "android.content.SharedPreferences$Editor",
      "com.actionbarsherlock.internal.widget.IcsListPopupWindow$PopupDataSetObserver",
      "android.widget.CalendarView$OnDateChangeListener",
      "android.widget.Filter$FilterListener",
      "com.actionbarsherlock.internal.widget.CapitalizingTextView",
      "com.actionbarsherlock.internal.view.menu.MenuItemImpl",
      "android.text.GetChars",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$OnItemLongClickListener",
      "android.view.SurfaceHolder$Callback",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder$ItemInvoker",
      "android.os.Build",
      "android.text.SpannableStringInternal",
      "android.graphics.drawable.DrawableContainer",
      "android.graphics.MaskFilter",
      "android.widget.Scroller",
      "android.view.InputQueue$Callback",
      "android.support.v4.util.LogWriter",
      "android.content.pm.PackageItemInfo",
      "android.database.sqlite.SQLiteDatabase$CursorFactory",
      "android.graphics.Bitmap",
      "android.view.ViewTreeObserver",
      "android.text.style.CharacterStyle",
      "android.view.View$OnHoverListener",
      "com.actionbarsherlock.widget.ShareActionProvider$ShareAcitivityChooserModelPolicy",
      "android.content.DialogInterface$OnClickListener",
      "com.actionbarsherlock.R$dimen",
      "android.net.Uri",
      "android.graphics.Rasterizer",
      "android.graphics.drawable.Drawable",
      "android.database.sqlite.SQLiteCursorDriver",
      "com.actionbarsherlock.view.MenuInflater",
      "com.actionbarsherlock.widget.ActivityChooserView$3",
      "android.os.Build$VERSION",
      "com.actionbarsherlock.view.SubMenu",
      "com.actionbarsherlock.widget.ActivityChooserView$2",
      "com.actionbarsherlock.widget.ActivityChooserView$1",
      "android.widget.PopupWindow$OnDismissListener",
      "android.os.Looper",
      "android.content.SyncStatusObserver",
      "android.graphics.Canvas",
      "android.view.accessibility.AccessibilityEvent",
      "android.net.Uri$Builder",
      "android.widget.TextView$BufferType",
      "android.view.animation.Interpolator",
      "com.actionbarsherlock.internal.widget.ActionBarContainer",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OpenOverflowRunnable",
      "com.actionbarsherlock.internal.view.menu.BaseMenuPresenter",
      "android.graphics.Region",
      "android.view.ActionProvider",
      "android.view.ViewTreeObserver$OnGlobalLayoutListener",
      "android.view.View$OnLayoutChangeListener",
      "android.graphics.Paint$Cap",
      "android.content.BroadcastReceiver$PendingResult",
      "android.os.Message",
      "android.view.animation.LayoutAnimationController",
      "com.actionbarsherlock.internal.widget.ScrollingTabContainerView",
      "android.text.TextPaint",
      "android.text.TextWatcher",
      "com.actionbarsherlock.internal.widget.ActionBarContextView",
      "android.animation.LayoutTransition$TransitionListener",
      "android.text.SpannedString",
      "android.animation.TimeInterpolator",
      "android.graphics.PathEffect",
      "com.actionbarsherlock.widget.ActivityChooserView$SetActivated",
      "android.app.FragmentTransaction",
      "android.graphics.drawable.AnimationDrawable",
      "android.os.Parcel",
      "android.app.FragmentManager$OnBackStackChangedListener",
      "android.text.Spannable$Factory",
      "android.content.SearchRecentSuggestionsProvider",
      "android.content.res.AssetManager",
      "android.content.Loader$OnLoadCompleteListener",
      "com.xtremelabs.robolectric.util.I18nException",
      "com.actionbarsherlock.internal.view.menu.ActionMenuItemView",
      "com.actionbarsherlock.widget.ActivityChooserModel$SerialExecutor",
      "android.text.ParcelableSpan",
      "android.view.ViewGroup$OnHierarchyChangeListener",
      "android.text.SpannableString",
      "com.actionbarsherlock.widget.ActivityChooserModel$ActivityChooserModelClient",
      "android.database.DefaultDatabaseErrorHandler",
      "android.widget.AbsListView$OnScrollListener",
      "android.text.Layout$Alignment",
      "android.view.InputQueue",
      "android.util.TypedValue",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout",
      "com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Animator$AnimatorListener",
      "android.text.Spannable",
      "android.widget.RemoteViews$RemoteView",
      "android.content.res.XmlResourceParser",
      "com.actionbarsherlock.internal.app.ActionBarWrapper$TabWrapper",
      "android.os.IBinder",
      "android.graphics.Paint$FontMetrics",
      "android.view.ContextThemeWrapper",
      "android.view.ViewTreeObserver$OnTouchModeChangeListener",
      "android.view.animation.Animation",
      "com.actionbarsherlock.internal.view.menu.MenuPopupHelper$MenuAdapter",
      "android.graphics.Matrix",
      "android.text.method.MovementMethod",
      "android.content.ContentProviderResult",
      "com.actionbarsherlock.internal.view.menu.MenuView$ItemView",
      "android.content.SharedPreferences$OnSharedPreferenceChangeListener",
      "android.view.ViewGroup$LayoutParams",
      "android.text.InputType",
      "android.content.BroadcastReceiver",
      "android.view.animation.Animation$AnimationListener",
      "android.os.PatternMatcher",
      "android.accounts.AccountAuthenticatorActivity",
      "android.widget.TimePicker",
      "android.widget.TimePicker$OnTimeChangedListener",
      "android.support.v4.app.FragmentManagerImpl",
      "android.view.animation.DecelerateInterpolator",
      "android.graphics.BitmapFactory$Options",
      "android.content.Context",
      "android.view.ContextMenu",
      "android.widget.Adapter",
      "com.actionbarsherlock.view.ActionProvider",
      "android.widget.Filter",
      "android.content.SyncAdapterType",
      "android.app.ActionBar$TabListener",
      "android.graphics.Paint$FontMetricsInt",
      "com.actionbarsherlock.view.Menu",
      "android.content.res.TypedArray",
      "android.view.ActionMode$Callback",
      "com.actionbarsherlock.internal.widget.ActionBarView",
      "android.graphics.Paint$Style",
      "com.actionbarsherlock.widget.ActivityChooserModel$HistoryPersister",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView",
      "android.widget.AdapterView$OnItemLongClickListener",
      "com.actionbarsherlock.view.ActionProvider$SubUiVisibilityListener",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder$Callback",
      "android.database.Cursor",
      "android.app.ActionBar",
      "android.view.View$OnKeyListener",
      "android.os.IInterface",
      "android.widget.Filter$FilterResults",
      "android.graphics.Point",
      "android.database.DataSetObservable",
      "android.widget.AbsListView",
      "android.database.SQLException",
      "android.gesture.Gesture",
      "android.content.pm.ResolveInfo",
      "android.view.View$DragShadowBuilder",
      "android.graphics.Picture",
      "com.actionbarsherlock.app.ActionBar$OnMenuVisibilityListener",
      "android.view.ContextMenu$ContextMenuInfo",
      "android.gesture.GestureStroke",
      "android.os.Bundle",
      "com.actionbarsherlock.widget.ActivityChooserModel$HistoryLoader",
      "android.view.MotionEvent$PointerProperties",
      "android.view.TouchDelegate",
      "org.xmlpull.v1.XmlSerializer",
      "android.widget.DatePicker",
      "android.graphics.Paint$Align",
      "android.database.sqlite.SQLiteDatabase",
      "android.widget.HorizontalScrollView",
      "android.animation.LayoutTransition",
      "android.view.View$OnSystemUiVisibilityChangeListener",
      "android.os.Handler",
      "android.view.inputmethod.ExtractedTextRequest",
      "android.graphics.Shader",
      "com.actionbarsherlock.internal.view.ActionProviderWrapper",
      "org.xmlpull.v1.XmlPullParser",
      "android.database.CharArrayBuffer",
      "com.xtremelabs.robolectric.tester.android.content.pm.StubPackageManager",
      "com.actionbarsherlock.R",
      "android.view.Surface",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "android.text.TextUtils$TruncateAt",
      "android.content.IntentFilter",
      "android.app.PendingIntent$CanceledException",
      "com.actionbarsherlock.widget.ActivityChooserModel$OnChooseActivityListener",
      "android.view.SubMenu",
      "android.content.MutableContextWrapper",
      "android.content.pm.FeatureInfo",
      "android.content.IntentFilter$AuthorityEntry",
      "android.content.pm.PathPermission",
      "android.graphics.Canvas$EdgeType",
      "android.view.InflateException",
      "android.text.Layout",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder",
      "android.graphics.Matrix$ScaleToFit",
      "com.actionbarsherlock.internal.app.ActionBarImpl",
      "android.view.View$OnAttachStateChangeListener",
      "android.widget.AbsListView$LayoutParams",
      "android.view.animation.AlphaAnimation",
      "android.graphics.Paint$Join",
      "android.view.View$OnClickListener",
      "android.content.pm.PackageManager$NameNotFoundException",
      "com.actionbarsherlock.app.ActionBar$LayoutParams",
      "android.os.RemoteException",
      "android.content.IntentFilter$MalformedMimeTypeException",
      "android.database.sqlite.SQLiteTransactionListener",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView$ActionMenuChildView",
      "com.actionbarsherlock.internal.app.ActionBarImpl$TabImpl",
      "android.text.SpannableStringBuilder",
      "android.view.inputmethod.CorrectionInfo",
      "android.widget.AbsListView$MultiChoiceModeListener",
      "android.view.InputDevice",
      "android.view.MenuInflater",
      "android.view.Menu",
      "android.graphics.drawable.shapes.Shape",
      "android.widget.AdapterView$OnItemClickListener",
      "android.app.ActionBar$OnMenuVisibilityListener",
      "android.content.ContextWrapper",
      "android.content.res.Resources$Theme",
      "android.app.ListActivity",
      "android.graphics.drawable.ShapeDrawable",
      "android.text.style.URLSpan",
      "android.widget.ExpandableListView$OnChildClickListener",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$OnItemSelectedListener",
      "android.app.ActionBar$OnNavigationListener",
      "android.content.SyncInfo",
      "android.app.ProgressDialog",
      "com.actionbarsherlock.internal.view.menu.MenuPopupHelper",
      "android.graphics.PorterDuff$Mode",
      "android.view.Window$Callback",
      "com.actionbarsherlock.view.ActionMode",
      "android.view.animation.Transformation",
      "android.util.Printer",
      "android.view.View$OnCreateContextMenuListener",
      "android.view.inputmethod.CompletionInfo",
      "android.graphics.Rect",
      "android.widget.LinearLayout",
      "android.content.pm.PackageManager",
      "android.view.WindowManager",
      "android.graphics.drawable.LevelListDrawable",
      "android.content.pm.ProviderInfo",
      "com.actionbarsherlock.view.MenuItem",
      "android.widget.ExpandableListView$OnGroupExpandListener",
      "android.app.DatePickerDialog",
      "android.content.ContentResolver",
      "com.actionbarsherlock.R$layout",
      "android.content.pm.ActivityInfo",
      "android.widget.Button",
      "android.content.pm.InstrumentationInfo",
      "android.graphics.Canvas$VertexMode",
      "android.content.DialogInterface$OnDismissListener",
      "android.graphics.RectF",
      "com.actionbarsherlock.R$string",
      "android.content.pm.PermissionGroupInfo",
      "com.actionbarsherlock.internal.widget.IcsListPopupWindow$DropDownListView",
      "android.util.AndroidException",
      "android.view.InputEvent",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "com.actionbarsherlock.internal.view.menu.SubMenuBuilder",
      "android.app.PendingIntent$OnFinished",
      "android.util.DisplayMetrics",
      "android.os.MessageQueue$IdleHandler",
      "org.xmlpull.v1.XmlPullParserException",
      "android.app.AliasActivity",
      "android.content.DialogInterface$OnCancelListener",
      "android.support.v4.app.FragmentManager$OnBackStackChangedListener",
      "com.xtremelabs.robolectric.RobolectricConfig",
      "android.content.Loader",
      "android.content.ContentValues",
      "com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$Builder",
      "android.view.Window",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "com.actionbarsherlock.view.MenuItem$OnMenuItemClickListener",
      "android.text.Spanned",
      "android.app.LoaderManager$LoaderCallbacks",
      "android.widget.AbsListView$RecyclerListener",
      "android.support.v4.app.Fragment$SavedState$1",
      "com.actionbarsherlock.internal.view.menu.MenuPresenter",
      "com.actionbarsherlock.app.ActionBar$TabListener",
      "android.os.Parcelable$Creator",
      "android.content.pm.PackageInfo",
      "android.view.MenuItem",
      "android.graphics.Path$Direction",
      "android.widget.FrameLayout$LayoutParams",
      "android.view.WindowManager$LayoutParams",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$5",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$3",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$4",
      "android.view.MotionEvent$PointerCoords",
      "android.view.LayoutInflater",
      "android.support.v4.app.Fragment$InstantiationException",
      "android.view.animation.LayoutAnimationController$AnimationParameters",
      "android.view.InputDevice$MotionRange",
      "android.view.inputmethod.ExtractedText",
      "com.actionbarsherlock.R$style",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$1",
      "com.actionbarsherlock.view.ActionMode$Callback",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$2",
      "android.view.KeyCharacterMap",
      "android.content.ClipDescription",
      "android.content.pm.ServiceInfo",
      "android.app.Activity",
      "android.support.v4.app.FragmentTransaction",
      "com.actionbarsherlock.widget.ActivityChooserModel$ActivityResolveInfo",
      "android.view.ViewManager",
      "android.content.res.Resources",
      "android.view.View$OnDragListener",
      "android.content.pm.PermissionInfo",
      "android.text.Editable$Factory",
      "android.os.ParcelFileDescriptor",
      "android.content.IntentSender$SendIntentException",
      "android.widget.FrameLayout",
      "android.widget.ImageView",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$AdapterDataSetObserver",
      "android.view.ViewTreeObserver$OnScrollChangedListener",
      "com.actionbarsherlock.internal.widget.IcsListPopupWindow$ResizePopupRunnable",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "android.text.method.TransformationMethod",
      "com.actionbarsherlock.app.ActionBar$OnNavigationListener",
      "android.graphics.drawable.Drawable$ConstantState",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$ActionButtonSubmenu",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowPopup",
      "com.actionbarsherlock.widget.ActivityChooserView",
      "android.app.FragmentManager$BackStackEntry",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "android.content.res.Resources$NotFoundException",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter",
      "com.actionbarsherlock.internal.app.ActionBarImpl$ActionModeImpl",
      "android.view.KeyCharacterMap$KeyData",
      "android.graphics.drawable.RotateDrawable",
      "com.actionbarsherlock.internal.widget.IcsListPopupWindow",
      "android.text.InputFilter",
      "android.graphics.Xfermode",
      "android.view.accessibility.AccessibilityEventSource",
      "android.view.ViewParent",
      "android.text.NoCopySpan",
      "com.actionbarsherlock.app.ActionBar$Tab",
      "com.actionbarsherlock.widget.ActivityChooserModel$HistoricalRecord",
      "android.support.v4.app.Fragment$SavedState",
      "android.database.sqlite.SQLiteProgram",
      "com.actionbarsherlock.widget.ActivityChooserModel",
      "android.app.Dialog",
      "android.text.Editable",
      "com.actionbarsherlock.internal.widget.IcsSpinner",
      "android.graphics.Movie",
      "android.content.IntentSender",
      "android.text.style.UpdateAppearance",
      "android.graphics.drawable.GradientDrawable",
      "android.view.ViewTreeObserver$OnGlobalFocusChangeListener",
      "android.app.DialogFragment",
      "android.widget.SpinnerAdapter",
      "android.app.Fragment",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager",
      "android.view.KeyEvent$Callback",
      "android.content.OperationApplicationException",
      "android.content.ComponentCallbacks2",
      "android.util.SparseBooleanArray",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView$LayoutParams",
      "android.view.ViewGroup$MarginLayoutParams",
      "android.content.res.Configuration",
      "com.actionbarsherlock.internal.widget.IcsSpinner$SpinnerPopup",
      "com.actionbarsherlock.widget.ShareActionProvider$ShareMenuItemOnMenuItemClickListener",
      "android.widget.DatePicker$OnDateChangedListener",
      "android.app.Application$ActivityLifecycleCallbacks",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "android.app.PendingIntent",
      "android.view.KeyEvent$DispatcherState",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Animator",
      "android.util.AttributeSet",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowMenuButton",
      "android.view.animation.AnimationSet",
      "android.view.View",
      "android.content.ServiceConnection",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator",
      "com.actionbarsherlock.widget.ActivityChooserModel$ActivitySorter",
      "android.app.ActionBar$LayoutParams",
      "android.view.SurfaceHolder",
      "android.database.sqlite.SQLiteQuery",
      "android.support.v4.app.LoaderManager",
      "android.app.ActionBar$Tab",
      "android.os.Build$VERSION_CODES",
      "android.view.MenuItem$OnMenuItemClickListener",
      "android.content.DialogInterface$OnKeyListener",
      "android.content.ClipData$Item",
      "com.actionbarsherlock.internal.widget.AbsActionBarView",
      "android.view.ViewGroup",
      "android.graphics.drawable.Animatable",
      "android.database.ContentObserver",
      "android.app.AlertDialog",
      "android.util.SparseArray",
      "android.os.MessageQueue",
      "android.widget.TextView",
      "com.actionbarsherlock.widget.ActivityChooserModel$DefaultSorter",
      "android.widget.ListAdapter",
      "android.graphics.DrawFilter",
      "android.support.v4.app.FragmentActivity",
      "android.content.ContentProviderClient",
      "android.support.v4.app.FragmentManager$BackStackEntry",
      "android.view.ViewPropertyAnimator",
      "android.content.pm.ApplicationInfo",
      "android.database.Observable",
      "android.widget.TextView$OnEditorActionListener",
      "android.graphics.Typeface",
      "android.view.accessibility.AccessibilityNodeInfo",
      "android.view.KeyEvent",
      "com.actionbarsherlock.internal.widget.IcsAdapterView",
      "android.support.v4.app.SuperNotCalledException",
      "android.view.inputmethod.InputConnection",
      "android.view.LayoutInflater$Factory",
      "android.graphics.drawable.ShapeDrawable$ShaderFactory",
      "android.content.Intent",
      "android.app.ExpandableListActivity",
      "com.actionbarsherlock.internal.view.menu.MenuPresenter$Callback",
      "com.xtremelabs.robolectric.tester.android.view.TestSubMenu",
      "android.content.ClipData",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager$ComponentState",
      "android.view.MotionEvent",
      "android.support.v4.app.LoaderManagerImpl$LoaderInfo",
      "android.database.sqlite.SQLiteStatement",
      "android.app.LoaderManager",
      "android.content.DialogInterface",
      "android.app.Fragment$SavedState",
      "android.support.v4.content.Loader",
      "com.actionbarsherlock.widget.ActivityChooserView$ActivityChooserViewAdapter",
      "android.view.AbsSavedState",
      "android.widget.ImageView$ScaleType",
      "android.widget.PopupWindow",
      "android.support.v4.app.BackStackRecord",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu",
      "android.support.v4.app.FragmentActivity$1",
      "android.content.ContentProvider",
      "android.text.Layout$Directions",
      "com.actionbarsherlock.internal.widget.IcsLinearLayout",
      "android.view.View$OnFocusChangeListener",
      "android.database.sqlite.SQLiteClosable",
      "android.widget.ExpandableListView",
      "android.view.View$OnTouchListener",
      "android.view.SurfaceHolder$Callback2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActivityChooserView_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "android.view.View",
      "android.view.ViewGroup",
      "android.os.Build$VERSION",
      "com.actionbarsherlock.widget.ActivityChooserView",
      "android.database.DataSetObserver",
      "com.actionbarsherlock.widget.ActivityChooserView$1",
      "com.actionbarsherlock.widget.ActivityChooserView$2",
      "com.actionbarsherlock.widget.ActivityChooserView$Callbacks",
      "android.widget.BaseAdapter",
      "com.actionbarsherlock.widget.ActivityChooserView$ActivityChooserViewAdapter",
      "com.actionbarsherlock.widget.ActivityChooserView$3",
      "com.actionbarsherlock.widget.ActivityChooserView$SetActivated",
      "com.actionbarsherlock.R$styleable",
      "com.actionbarsherlock.R$layout",
      "com.actionbarsherlock.R$id",
      "com.actionbarsherlock.R$dimen",
      "com.actionbarsherlock.R$string",
      "android.content.ContentProvider",
      "android.content.SearchRecentSuggestionsProvider",
      "android.content.Context",
      "android.content.ContextWrapper",
      "android.view.ContextThemeWrapper",
      "android.app.Activity",
      "android.accounts.AccountAuthenticatorActivity",
      "android.app.ListActivity",
      "android.app.AliasActivity",
      "android.app.NativeActivity",
      "com.actionbarsherlock.app.ActionBar",
      "com.actionbarsherlock.internal.app.ActionBarImpl",
      "android.os.Handler",
      "android.app.Fragment",
      "android.app.DialogFragment",
      "android.app.ExpandableListActivity",
      "android.content.MutableContextWrapper",
      "android.widget.ArrayAdapter",
      "android.app.Dialog",
      "android.app.AlertDialog",
      "android.app.ProgressDialog",
      "android.content.pm.PackageItemInfo",
      "android.content.pm.ComponentInfo",
      "android.content.pm.ProviderInfo",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "android.database.sqlite.SQLiteClosable",
      "android.database.sqlite.SQLiteDatabase",
      "com.actionbarsherlock.internal.app.ActionBarWrapper",
      "android.database.DefaultDatabaseErrorHandler",
      "android.content.Loader",
      "android.text.SpannableStringInternal",
      "android.text.SpannableString",
      "com.xtremelabs.robolectric.RobolectricConfig",
      "android.content.pm.PackageInfo",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu",
      "com.xtremelabs.robolectric.tester.android.view.TestSubMenu",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "android.graphics.Picture",
      "android.content.pm.ApplicationInfo",
      "android.content.res.Resources",
      "android.graphics.drawable.Drawable",
      "android.graphics.drawable.DrawableContainer",
      "android.graphics.drawable.AnimationDrawable",
      "android.content.res.Configuration",
      "android.view.accessibility.AccessibilityRecord",
      "android.view.accessibility.AccessibilityEvent",
      "android.content.pm.PackageManager",
      "com.xtremelabs.robolectric.tester.android.content.pm.StubPackageManager",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager",
      "android.view.View$AccessibilityDelegate",
      "android.graphics.drawable.LevelListDrawable",
      "android.text.SpannableStringBuilder",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder",
      "android.view.View$MeasureSpec",
      "android.view.ViewGroup$LayoutParams",
      "android.content.Intent",
      "android.gesture.Gesture",
      "android.app.DatePickerDialog",
      "android.app.TimePickerDialog",
      "android.graphics.drawable.RotateDrawable",
      "android.content.pm.PermissionInfo",
      "android.graphics.drawable.GradientDrawable",
      "com.actionbarsherlock.view.ActionProvider",
      "com.actionbarsherlock.widget.ShareActionProvider",
      "com.actionbarsherlock.widget.ShareActionProvider$ShareMenuItemOnMenuItemClickListener",
      "android.text.SpannedString",
      "android.database.Observable",
      "android.database.DataSetObservable",
      "com.actionbarsherlock.widget.ActivityChooserModel$SerialExecutor",
      "com.actionbarsherlock.widget.ActivityChooserModel",
      "android.util.DisplayMetrics",
      "android.widget.LinearLayout",
      "com.actionbarsherlock.internal.view.menu.ActionMenuItemView",
      "android.graphics.drawable.ShapeDrawable",
      "android.graphics.drawable.PaintDrawable",
      "com.actionbarsherlock.widget.ShareActionProvider$ShareAcitivityChooserModelPolicy",
      "android.view.inputmethod.EditorInfo"
    );
  }
}
