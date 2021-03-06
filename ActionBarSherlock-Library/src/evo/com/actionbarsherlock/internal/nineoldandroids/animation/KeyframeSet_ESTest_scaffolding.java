/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 05 22:01:10 GMT 2018
 */

package com.actionbarsherlock.internal.nineoldandroids.animation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class KeyframeSet_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(KeyframeSet_ESTest_scaffolding.class.getClassLoader() ,
      "android.app.NativeActivity",
      "android.view.View$AccessibilityDelegate",
      "android.content.ComponentCallbacks",
      "android.webkit.WebSettings$RenderPriority",
      "android.view.MenuItem$OnActionExpandListener",
      "android.graphics.Bitmap$Config",
      "android.widget.ExpandableListView$OnGroupCollapseListener",
      "android.content.res.ColorStateList",
      "android.view.Display",
      "android.view.DragEvent",
      "android.accounts.Account",
      "android.webkit.WebChromeClient$CustomViewCallback",
      "android.widget.ExpandableListView$OnGroupClickListener",
      "android.view.View$OnGenericMotionListener",
      "android.content.ContentProvider$PipeDataWriter",
      "android.graphics.Paint",
      "android.content.DialogInterface$OnShowListener",
      "android.widget.AdapterView$OnItemSelectedListener",
      "android.app.FragmentManager",
      "android.graphics.Path",
      "android.app.TimePickerDialog",
      "android.content.IntentSender$OnFinished",
      "android.widget.ExpandableListAdapter",
      "android.webkit.WebStorage$QuotaUpdater",
      "android.webkit.WebSettings",
      "android.view.ViewTreeObserver$OnPreDrawListener",
      "android.widget.LinearLayout$LayoutParams",
      "android.widget.ImageSwitcher",
      "android.graphics.Bitmap$CompressFormat",
      "android.graphics.ColorFilter",
      "android.os.Parcelable",
      "android.graphics.Path$FillType",
      "android.text.method.KeyListener",
      "android.content.ComponentName",
      "android.view.Surface$OutOfResourcesException",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe",
      "android.widget.ArrayAdapter",
      "android.content.SharedPreferences",
      "android.animation.Animator$AnimatorListener",
      "android.view.animation.ScaleAnimation",
      "android.graphics.Region$Op",
      "android.os.IBinder$DeathRecipient",
      "android.view.ActionMode",
      "android.widget.GridView",
      "android.graphics.drawable.Drawable$Callback",
      "android.text.style.ClickableSpan",
      "android.animation.Animator",
      "android.webkit.WebSettings$TextSize",
      "android.view.animation.AccelerateDecelerateInterpolator",
      "android.animation.TypeEvaluator",
      "android.webkit.WebViewClient",
      "android.database.DatabaseErrorHandler",
      "android.webkit.WebBackForwardList",
      "android.widget.AdapterView",
      "android.database.DataSetObserver",
      "android.view.View$OnLongClickListener",
      "android.widget.ViewSwitcher",
      "android.animation.IntEvaluator",
      "android.content.pm.ComponentInfo",
      "com.actionbarsherlock.view.MenuItem$OnActionExpandListener",
      "android.view.LayoutInflater$Filter",
      "android.widget.BaseAdapter",
      "android.app.Application",
      "android.view.accessibility.AccessibilityRecord",
      "android.widget.Filterable",
      "android.widget.ListView",
      "android.view.LayoutInflater$Factory2",
      "android.view.inputmethod.EditorInfo",
      "android.content.res.AssetFileDescriptor",
      "android.widget.CalendarView",
      "android.content.SharedPreferences$Editor",
      "android.widget.CalendarView$OnDateChangeListener",
      "android.webkit.DownloadListener",
      "android.widget.Filter$FilterListener",
      "android.text.GetChars",
      "android.widget.AbsoluteLayout",
      "android.view.SurfaceHolder$Callback",
      "android.graphics.MaskFilter",
      "android.widget.Scroller",
      "android.widget.RadioGroup$LayoutParams",
      "android.view.InputQueue$Callback",
      "android.content.pm.PackageItemInfo",
      "android.database.sqlite.SQLiteDatabase$CursorFactory",
      "android.graphics.Bitmap",
      "android.view.ViewTreeObserver",
      "android.text.style.CharacterStyle",
      "android.view.View$OnHoverListener",
      "android.view.animation.AnticipateInterpolator",
      "android.content.DialogInterface$OnClickListener",
      "android.webkit.WebSettings$ZoomDensity",
      "android.net.Uri",
      "android.graphics.Rasterizer",
      "android.graphics.drawable.Drawable",
      "android.database.sqlite.SQLiteCursorDriver",
      "com.actionbarsherlock.view.SubMenu",
      "android.os.Looper",
      "android.content.SyncStatusObserver",
      "android.graphics.Canvas",
      "android.view.accessibility.AccessibilityEvent",
      "android.net.Uri$Builder",
      "android.widget.TextView$BufferType",
      "android.view.animation.Interpolator",
      "android.graphics.Region",
      "android.view.ActionProvider",
      "android.view.ViewTreeObserver$OnGlobalLayoutListener",
      "android.view.View$OnLayoutChangeListener",
      "android.graphics.Paint$Cap",
      "android.content.BroadcastReceiver$PendingResult",
      "android.os.Message",
      "android.view.animation.LayoutAnimationController",
      "android.text.TextPaint",
      "android.text.TextWatcher",
      "android.webkit.WebResourceResponse",
      "android.animation.LayoutTransition$TransitionListener",
      "android.animation.TimeInterpolator",
      "android.graphics.PathEffect",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$FloatKeyframe",
      "android.app.FragmentTransaction",
      "android.os.Parcel",
      "android.app.FragmentManager$OnBackStackChangedListener",
      "android.text.Spannable$Factory",
      "android.content.SearchRecentSuggestionsProvider",
      "android.content.res.AssetManager",
      "android.content.Loader$OnLoadCompleteListener",
      "com.xtremelabs.robolectric.util.I18nException",
      "android.view.animation.AccelerateInterpolator",
      "android.text.ParcelableSpan",
      "android.webkit.WebViewFragment",
      "android.webkit.JsPromptResult",
      "android.view.ViewGroup$OnHierarchyChangeListener",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$ObjectKeyframe",
      "android.database.DefaultDatabaseErrorHandler",
      "android.widget.AbsListView$OnScrollListener",
      "android.text.Layout$Alignment",
      "android.view.InputQueue",
      "android.util.TypedValue",
      "android.webkit.ConsoleMessage",
      "android.text.Spannable",
      "android.widget.RemoteViews$RemoteView",
      "android.content.res.XmlResourceParser",
      "android.webkit.WebSettings$LayoutAlgorithm",
      "android.os.IBinder",
      "android.graphics.Paint$FontMetrics",
      "android.view.ContextThemeWrapper",
      "android.view.ViewTreeObserver$OnTouchModeChangeListener",
      "android.view.animation.Animation",
      "android.graphics.Matrix",
      "android.webkit.WebView",
      "android.text.method.MovementMethod",
      "android.content.ContentProviderResult",
      "android.content.SharedPreferences$OnSharedPreferenceChangeListener",
      "android.view.ViewGroup$LayoutParams",
      "android.text.InputType",
      "android.content.BroadcastReceiver",
      "android.view.animation.Animation$AnimationListener",
      "android.os.PatternMatcher",
      "android.accounts.AccountAuthenticatorActivity",
      "android.widget.TimePicker",
      "android.widget.TimePicker$OnTimeChangedListener",
      "android.view.animation.DecelerateInterpolator",
      "android.graphics.BitmapFactory$Options",
      "android.content.Context",
      "android.view.ContextMenu",
      "android.widget.Adapter",
      "com.actionbarsherlock.view.ActionProvider",
      "android.widget.Filter",
      "android.content.SyncAdapterType",
      "android.widget.ViewSwitcher$ViewFactory",
      "android.app.ListFragment",
      "android.graphics.Paint$FontMetricsInt",
      "android.app.ActionBar$TabListener",
      "com.actionbarsherlock.view.Menu",
      "android.content.res.TypedArray",
      "android.view.animation.CycleInterpolator",
      "android.view.ActionMode$Callback",
      "android.graphics.Paint$Style",
      "android.widget.AdapterView$OnItemLongClickListener",
      "com.actionbarsherlock.view.ActionProvider$SubUiVisibilityListener",
      "android.database.Cursor",
      "android.widget.RadioGroup$OnCheckedChangeListener",
      "android.app.ActionBar",
      "android.view.View$OnKeyListener",
      "android.os.IInterface",
      "android.widget.Filter$FilterResults",
      "android.widget.AbsListView",
      "android.graphics.Point",
      "android.database.SQLException",
      "android.view.animation.RotateAnimation",
      "android.content.pm.ResolveInfo",
      "android.view.View$DragShadowBuilder",
      "android.graphics.Picture",
      "android.view.ContextMenu$ContextMenuInfo",
      "android.widget.ViewFlipper",
      "android.os.Bundle",
      "android.view.MotionEvent$PointerProperties",
      "android.view.TouchDelegate",
      "org.xmlpull.v1.XmlSerializer",
      "android.widget.DatePicker",
      "android.graphics.Paint$Align",
      "android.database.sqlite.SQLiteDatabase",
      "android.animation.LayoutTransition",
      "android.webkit.SslErrorHandler",
      "android.view.View$OnSystemUiVisibilityChangeListener",
      "android.view.inputmethod.ExtractedTextRequest",
      "android.os.Handler",
      "android.graphics.Shader",
      "com.actionbarsherlock.internal.view.ActionProviderWrapper",
      "org.xmlpull.v1.XmlPullParser",
      "android.database.CharArrayBuffer",
      "android.view.Surface",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "android.text.TextUtils$TruncateAt",
      "android.content.IntentFilter",
      "android.app.PendingIntent$CanceledException",
      "android.view.SubMenu",
      "android.content.MutableContextWrapper",
      "android.content.IntentFilter$AuthorityEntry",
      "android.content.pm.FeatureInfo",
      "android.content.pm.PathPermission",
      "android.graphics.Canvas$EdgeType",
      "android.view.InflateException",
      "android.text.Layout",
      "android.graphics.Matrix$ScaleToFit",
      "android.view.View$OnAttachStateChangeListener",
      "android.widget.AbsListView$LayoutParams",
      "android.view.animation.AlphaAnimation",
      "android.graphics.Paint$Join",
      "android.view.View$OnClickListener",
      "android.content.pm.PackageManager$NameNotFoundException",
      "android.os.RemoteException",
      "android.content.IntentFilter$MalformedMimeTypeException",
      "android.database.sqlite.SQLiteTransactionListener",
      "android.widget.AbsListView$MultiChoiceModeListener",
      "android.view.inputmethod.CorrectionInfo",
      "android.view.InputDevice",
      "android.view.MenuInflater",
      "android.view.Menu",
      "android.widget.AdapterView$OnItemClickListener",
      "android.app.ActionBar$OnMenuVisibilityListener",
      "android.content.ContextWrapper",
      "android.content.res.Resources$Theme",
      "android.app.ListActivity",
      "android.webkit.ConsoleMessage$MessageLevel",
      "android.text.style.URLSpan",
      "android.widget.ExpandableListView$OnChildClickListener",
      "android.app.ActionBar$OnNavigationListener",
      "android.content.SyncInfo",
      "android.app.ProgressDialog",
      "android.graphics.PorterDuff$Mode",
      "android.view.Window$Callback",
      "android.webkit.WebHistoryItem",
      "android.widget.ViewAnimator",
      "android.view.animation.Transformation",
      "android.util.Printer",
      "android.view.View$OnCreateContextMenuListener",
      "android.webkit.WebView$PictureListener",
      "android.view.inputmethod.CompletionInfo",
      "android.graphics.Rect",
      "android.widget.LinearLayout",
      "android.content.pm.PackageManager",
      "android.view.WindowManager",
      "android.content.pm.ProviderInfo",
      "com.actionbarsherlock.view.MenuItem",
      "android.widget.ExpandableListView$OnGroupExpandListener",
      "android.app.DatePickerDialog",
      "android.content.ContentResolver",
      "android.content.pm.ActivityInfo",
      "android.widget.Button",
      "android.content.pm.InstrumentationInfo",
      "android.graphics.Canvas$VertexMode",
      "android.content.DialogInterface$OnDismissListener",
      "android.graphics.RectF",
      "android.content.pm.PermissionGroupInfo",
      "android.util.AndroidException",
      "android.view.InputEvent",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "android.app.PendingIntent$OnFinished",
      "android.util.DisplayMetrics",
      "android.os.MessageQueue$IdleHandler",
      "org.xmlpull.v1.XmlPullParserException",
      "android.app.AliasActivity",
      "android.view.animation.LinearInterpolator",
      "android.content.DialogInterface$OnCancelListener",
      "android.content.Loader",
      "android.net.http.SslCertificate$DName",
      "android.content.ContentValues",
      "android.view.Window",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "com.actionbarsherlock.view.MenuItem$OnMenuItemClickListener",
      "android.text.Spanned",
      "android.widget.AbsListView$RecyclerListener",
      "android.app.LoaderManager$LoaderCallbacks",
      "android.os.Parcelable$Creator",
      "android.content.pm.PackageInfo",
      "android.view.MenuItem",
      "android.graphics.Path$Direction",
      "android.widget.FrameLayout$LayoutParams",
      "android.view.WindowManager$LayoutParams",
      "android.view.MotionEvent$PointerCoords",
      "android.view.LayoutInflater",
      "android.view.animation.LayoutAnimationController$AnimationParameters",
      "android.view.InputDevice$MotionRange",
      "android.view.inputmethod.ExtractedText",
      "android.view.animation.AnticipateOvershootInterpolator",
      "android.view.animation.OvershootInterpolator",
      "android.view.KeyCharacterMap",
      "android.content.ClipDescription",
      "android.content.pm.ServiceInfo",
      "android.app.Activity",
      "android.content.res.Resources",
      "android.view.ViewManager",
      "android.view.View$OnDragListener",
      "android.content.pm.PermissionInfo",
      "android.text.Editable$Factory",
      "android.os.ParcelFileDescriptor",
      "android.widget.ZoomControls",
      "android.webkit.JsResult",
      "android.content.IntentSender$SendIntentException",
      "android.widget.FrameLayout",
      "android.view.ViewTreeObserver$OnScrollChangedListener",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "android.text.method.TransformationMethod",
      "android.graphics.drawable.Drawable$ConstantState",
      "android.app.FragmentManager$BackStackEntry",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "android.view.animation.BounceInterpolator",
      "android.content.res.Resources$NotFoundException",
      "android.view.KeyCharacterMap$KeyData",
      "android.webkit.WebSettings$PluginState",
      "android.graphics.Xfermode",
      "android.text.InputFilter",
      "android.view.accessibility.AccessibilityEventSource",
      "android.view.ViewParent",
      "android.text.NoCopySpan",
      "android.database.sqlite.SQLiteProgram",
      "android.app.Dialog",
      "android.widget.RadioGroup",
      "android.text.Editable",
      "android.graphics.Movie",
      "android.content.IntentSender",
      "android.text.style.UpdateAppearance",
      "android.view.ViewTreeObserver$OnGlobalFocusChangeListener",
      "android.app.DialogFragment",
      "android.webkit.WebChromeClient",
      "android.webkit.ValueCallback",
      "android.app.Fragment",
      "android.widget.SpinnerAdapter",
      "android.net.http.SslError",
      "android.view.KeyEvent$Callback",
      "android.webkit.WebView$HitTestResult",
      "android.content.OperationApplicationException",
      "android.content.ComponentCallbacks2",
      "android.util.SparseBooleanArray",
      "android.content.res.Configuration",
      "android.view.ViewGroup$MarginLayoutParams",
      "android.net.http.SslCertificate",
      "android.widget.DatePicker$OnDateChangedListener",
      "android.app.Application$ActivityLifecycleCallbacks",
      "com.actionbarsherlock.internal.nineoldandroids.animation.IntEvaluator",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "android.app.PendingIntent",
      "android.view.KeyEvent$DispatcherState",
      "android.util.AttributeSet",
      "android.content.ServiceConnection",
      "android.view.View",
      "android.app.ActionBar$LayoutParams",
      "android.view.SurfaceHolder",
      "android.database.sqlite.SQLiteQuery",
      "android.webkit.HttpAuthHandler",
      "android.app.ActionBar$Tab",
      "com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet",
      "android.view.MenuItem$OnMenuItemClickListener",
      "android.content.DialogInterface$OnKeyListener",
      "android.content.ClipData$Item",
      "android.view.ViewGroup",
      "android.database.ContentObserver",
      "android.app.AlertDialog",
      "android.util.SparseArray",
      "android.os.MessageQueue",
      "android.widget.TextView",
      "android.widget.ListAdapter",
      "android.webkit.GeolocationPermissions$Callback",
      "android.graphics.DrawFilter",
      "com.actionbarsherlock.internal.nineoldandroids.animation.TypeEvaluator",
      "android.content.ContentProviderClient",
      "android.view.ViewPropertyAnimator",
      "android.content.pm.ApplicationInfo",
      "android.widget.TextView$OnEditorActionListener",
      "android.graphics.Typeface",
      "android.view.accessibility.AccessibilityNodeInfo",
      "android.view.KeyEvent",
      "com.actionbarsherlock.internal.nineoldandroids.animation.IntKeyframeSet",
      "android.view.LayoutInflater$Factory",
      "android.view.inputmethod.InputConnection",
      "android.content.Intent",
      "android.app.ExpandableListActivity",
      "android.content.ClipData",
      "com.actionbarsherlock.internal.nineoldandroids.animation.FloatKeyframeSet",
      "android.view.MotionEvent",
      "android.database.sqlite.SQLiteStatement",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$IntKeyframe",
      "android.app.LoaderManager",
      "android.content.DialogInterface",
      "android.app.Fragment$SavedState",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu",
      "android.content.ContentProvider",
      "android.text.Layout$Directions",
      "android.view.View$OnFocusChangeListener",
      "android.database.sqlite.SQLiteClosable",
      "android.widget.ExpandableListView",
      "android.view.View$OnTouchListener",
      "android.view.SurfaceHolder$Callback2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(KeyframeSet_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.actionbarsherlock.internal.nineoldandroids.animation.KeyframeSet",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$IntKeyframe",
      "com.actionbarsherlock.internal.nineoldandroids.animation.IntKeyframeSet",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$FloatKeyframe",
      "com.actionbarsherlock.internal.nineoldandroids.animation.FloatKeyframeSet",
      "com.actionbarsherlock.internal.nineoldandroids.animation.IntEvaluator",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Keyframe$ObjectKeyframe",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "android.view.animation.AnticipateOvershootInterpolator",
      "android.view.animation.OvershootInterpolator",
      "android.os.Parcel",
      "android.view.inputmethod.ExtractedTextRequest",
      "android.view.animation.AccelerateDecelerateInterpolator",
      "android.content.Context",
      "android.content.ContextWrapper",
      "android.content.MutableContextWrapper",
      "android.view.animation.CycleInterpolator",
      "android.view.ContextThemeWrapper",
      "android.app.Activity",
      "android.app.ListActivity",
      "android.app.NativeActivity",
      "android.view.animation.AccelerateInterpolator",
      "android.app.ExpandableListActivity",
      "android.view.animation.AnticipateInterpolator",
      "android.app.AliasActivity",
      "android.view.animation.LinearInterpolator",
      "android.animation.IntEvaluator",
      "android.view.View",
      "android.view.ViewGroup",
      "android.widget.FrameLayout",
      "android.widget.TimePicker",
      "android.view.animation.DecelerateInterpolator",
      "android.content.ContentValues",
      "android.view.animation.BounceInterpolator",
      "android.app.Fragment",
      "android.app.DialogFragment",
      "android.view.animation.Animation",
      "android.view.animation.ScaleAnimation",
      "android.content.ContentProvider",
      "android.content.SearchRecentSuggestionsProvider",
      "android.accounts.AccountAuthenticatorActivity",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "android.widget.AdapterView",
      "android.widget.AbsListView",
      "android.widget.GridView",
      "android.view.animation.RotateAnimation",
      "android.database.sqlite.SQLiteClosable",
      "android.database.sqlite.SQLiteDatabase",
      "android.view.animation.AlphaAnimation",
      "android.content.Loader",
      "android.database.DefaultDatabaseErrorHandler",
      "android.webkit.WebViewFragment",
      "android.app.Dialog",
      "android.app.AlertDialog",
      "android.app.ProgressDialog",
      "android.widget.BaseAdapter",
      "android.widget.ArrayAdapter",
      "android.app.TimePickerDialog",
      "android.widget.ViewAnimator",
      "android.widget.ViewFlipper",
      "android.widget.LinearLayout",
      "android.widget.ZoomControls",
      "android.widget.ViewSwitcher",
      "android.widget.ImageSwitcher",
      "android.widget.RadioGroup",
      "android.webkit.WebChromeClient",
      "android.app.DatePickerDialog",
      "android.app.ListFragment",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu"
    );
  }
}
