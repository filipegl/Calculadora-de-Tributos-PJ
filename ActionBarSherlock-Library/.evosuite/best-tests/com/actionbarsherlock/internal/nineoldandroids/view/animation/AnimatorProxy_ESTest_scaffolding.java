/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 05 22:15:05 GMT 2018
 */

package com.actionbarsherlock.internal.nineoldandroids.view.animation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AnimatorProxy_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AnimatorProxy_ESTest_scaffolding.class.getClassLoader() ,
      "android.app.NativeActivity",
      "android.view.View$AccessibilityDelegate",
      "android.content.ComponentCallbacks",
      "android.webkit.WebSettings$RenderPriority",
      "android.view.MenuItem$OnActionExpandListener",
      "android.view.View$MeasureSpec",
      "android.appwidget.AppWidgetProviderInfo",
      "android.graphics.Bitmap$Config",
      "android.widget.ExpandableListView$OnGroupCollapseListener",
      "android.widget.RelativeLayout$LayoutParams",
      "android.content.res.ColorStateList",
      "android.view.ViewStub$OnInflateListener",
      "android.animation.PropertyValuesHolder",
      "android.view.Display",
      "android.app.LocalActivityManager",
      "android.view.DragEvent",
      "android.accounts.Account",
      "android.webkit.WebChromeClient$CustomViewCallback",
      "android.support.v4.app.Fragment",
      "android.widget.ExpandableListView$OnGroupClickListener",
      "android.view.View$OnGenericMotionListener",
      "android.content.ContentProvider$PipeDataWriter",
      "com.actionbarsherlock.internal.app.ActionBarWrapper",
      "android.graphics.Paint",
      "com.actionbarsherlock.internal.view.View_OnAttachStateChangeListener",
      "android.content.DialogInterface$OnShowListener",
      "android.preference.Preference$OnPreferenceClickListener",
      "android.widget.AdapterView$OnItemSelectedListener",
      "android.app.FragmentManager",
      "android.graphics.Path",
      "android.app.TimePickerDialog",
      "android.content.IntentSender$OnFinished",
      "com.actionbarsherlock.app.ActionBar",
      "android.widget.ExpandableListAdapter",
      "android.webkit.WebStorage$QuotaUpdater",
      "android.widget.TabHost$TabContentFactory",
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
      "com.actionbarsherlock.R$styleable",
      "android.widget.ShareActionProvider$OnShareTargetSelectedListener",
      "android.widget.QuickContactBadge",
      "android.database.CrossProcessCursor",
      "android.view.TextureView$SurfaceTextureListener",
      "android.widget.ArrayAdapter",
      "android.content.SharedPreferences",
      "android.widget.TableRow",
      "android.animation.Animator$AnimatorListener",
      "com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet",
      "android.view.View$BaseSavedState",
      "android.widget.ImageButton",
      "android.graphics.Region$Op",
      "android.os.IBinder$DeathRecipient",
      "android.view.ActionMode",
      "android.widget.GridView",
      "android.graphics.drawable.Drawable$Callback",
      "android.text.style.ClickableSpan",
      "android.animation.Animator",
      "android.widget.TabHost$OnTabChangeListener",
      "android.webkit.WebSettings$TextSize",
      "android.util.AndroidRuntimeException",
      "android.view.animation.AccelerateDecelerateInterpolator",
      "android.animation.TypeEvaluator",
      "android.webkit.WebViewClient",
      "android.database.DatabaseErrorHandler",
      "android.webkit.WebBackForwardList",
      "android.widget.AdapterView",
      "android.preference.PreferenceManager",
      "android.database.DataSetObserver",
      "android.widget.GridLayout",
      "android.view.View$OnLongClickListener",
      "android.widget.ViewSwitcher",
      "android.content.pm.ComponentInfo",
      "com.actionbarsherlock.internal.view.View_HasStateListenerSupport",
      "android.widget.Checkable",
      "com.actionbarsherlock.view.MenuItem$OnActionExpandListener",
      "com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup",
      "android.view.LayoutInflater$Filter",
      "android.widget.BaseAdapter",
      "android.app.Application",
      "com.actionbarsherlock.internal.widget.ScrollingTabContainerView$TabView",
      "android.content.ActivityNotFoundException",
      "android.view.accessibility.AccessibilityRecord",
      "android.widget.Filterable",
      "com.actionbarsherlock.internal.widget.IcsAbsSpinner",
      "android.widget.ListView",
      "com.actionbarsherlock.internal.view.menu.MenuView",
      "android.view.LayoutInflater$Factory2",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView",
      "android.view.inputmethod.EditorInfo",
      "android.widget.NumberPicker",
      "android.content.res.AssetFileDescriptor",
      "android.widget.CalendarView",
      "android.content.SharedPreferences$Editor",
      "android.widget.SearchView$OnCloseListener",
      "android.widget.CalendarView$OnDateChangeListener",
      "android.webkit.DownloadListener",
      "android.widget.Filter$FilterListener",
      "android.media.MediaPlayer",
      "com.actionbarsherlock.internal.widget.CapitalizingTextView",
      "com.actionbarsherlock.internal.view.menu.MenuItemImpl",
      "android.text.GetChars",
      "android.renderscript.RenderScript$Priority",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$OnItemLongClickListener",
      "android.widget.AbsoluteLayout",
      "android.view.SurfaceHolder$Callback",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder$ItemInvoker",
      "android.os.Build",
      "android.text.SpannableStringInternal",
      "android.widget.MediaController$MediaPlayerControl",
      "android.widget.Scroller",
      "android.graphics.MaskFilter",
      "android.content.DialogInterface$OnMultiChoiceClickListener",
      "android.widget.RadioGroup$LayoutParams",
      "android.view.InputQueue$Callback",
      "android.content.pm.PackageItemInfo",
      "android.database.sqlite.SQLiteDatabase$CursorFactory",
      "android.widget.StackView",
      "android.graphics.Bitmap",
      "android.preference.Preference",
      "android.view.ViewTreeObserver",
      "android.text.style.CharacterStyle",
      "android.view.View$OnHoverListener",
      "android.database.MatrixCursor$RowBuilder",
      "android.content.DialogInterface$OnClickListener",
      "android.webkit.WebSettings$ZoomDensity",
      "android.net.Uri",
      "android.graphics.Rasterizer",
      "android.gesture.GestureOverlayView",
      "android.graphics.drawable.Drawable",
      "android.database.sqlite.SQLiteCursorDriver",
      "com.actionbarsherlock.view.MenuInflater",
      "android.os.Build$VERSION",
      "com.actionbarsherlock.view.SubMenu",
      "android.os.Looper",
      "android.widget.PopupWindow$OnDismissListener",
      "android.content.SyncStatusObserver",
      "android.graphics.Canvas",
      "android.view.accessibility.AccessibilityEvent",
      "android.widget.AdapterView$AdapterContextMenuInfo",
      "android.net.Uri$Builder",
      "android.widget.TextView$BufferType",
      "android.renderscript.Script",
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
      "android.webkit.WebResourceResponse",
      "com.actionbarsherlock.internal.widget.ActionBarContextView",
      "android.animation.LayoutTransition$TransitionListener",
      "android.animation.TimeInterpolator",
      "android.graphics.PathEffect",
      "com.actionbarsherlock.internal.view.menu.ListMenuItemView",
      "android.app.FragmentTransaction",
      "android.renderscript.RenderScript",
      "android.os.Parcel",
      "android.database.CursorWindow",
      "android.app.FragmentManager$OnBackStackChangedListener",
      "android.text.Spannable$Factory",
      "android.content.SearchRecentSuggestionsProvider",
      "android.content.res.AssetManager",
      "android.content.Loader$OnLoadCompleteListener",
      "com.xtremelabs.robolectric.util.I18nException",
      "com.actionbarsherlock.internal.view.menu.ActionMenuItemView",
      "android.text.ParcelableSpan",
      "android.webkit.WebViewFragment",
      "android.widget.TwoLineListItem",
      "android.webkit.JsPromptResult",
      "android.view.ViewGroup$OnHierarchyChangeListener",
      "android.text.SpannableString",
      "android.widget.TabHost",
      "android.database.DefaultDatabaseErrorHandler",
      "android.widget.AbsListView$OnScrollListener",
      "android.text.Layout$Alignment",
      "android.view.InputQueue",
      "android.util.TypedValue",
      "android.widget.ScrollView",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout",
      "com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Animator$AnimatorListener",
      "android.widget.SearchView$OnSuggestionListener",
      "android.view.SurfaceView",
      "android.webkit.ConsoleMessage",
      "android.text.Spannable",
      "android.widget.RemoteViews$RemoteView",
      "android.content.res.XmlResourceParser",
      "android.webkit.WebSettings$LayoutAlgorithm",
      "android.widget.TableLayout$LayoutParams",
      "android.preference.PreferenceScreen",
      "com.actionbarsherlock.internal.app.ActionBarWrapper$TabWrapper",
      "android.os.IBinder",
      "android.widget.ZoomButtonsController$OnZoomListener",
      "android.preference.EditTextPreference",
      "android.widget.CheckBox",
      "android.widget.ShareActionProvider",
      "android.graphics.Paint$FontMetrics",
      "android.view.ContextThemeWrapper",
      "android.view.ViewTreeObserver$OnTouchModeChangeListener",
      "android.view.animation.Animation",
      "com.actionbarsherlock.internal.view.menu.MenuPopupHelper$MenuAdapter",
      "android.graphics.Matrix",
      "android.webkit.WebView",
      "android.text.method.MovementMethod",
      "android.content.ContentProviderResult",
      "com.actionbarsherlock.internal.view.menu.MenuView$ItemView",
      "android.content.SharedPreferences$OnSharedPreferenceChangeListener",
      "android.view.ViewGroup$LayoutParams",
      "android.text.InputType",
      "android.widget.GridLayout$LayoutParams",
      "android.view.animation.Animation$AnimationListener",
      "android.content.BroadcastReceiver",
      "android.os.PatternMatcher",
      "android.widget.CursorAdapter",
      "android.accounts.AccountAuthenticatorActivity",
      "android.widget.RelativeLayout",
      "android.widget.TimePicker",
      "android.widget.TimePicker$OnTimeChangedListener",
      "android.view.animation.DecelerateInterpolator",
      "android.widget.GridLayout$Alignment",
      "android.graphics.BitmapFactory$Options",
      "android.content.Context",
      "android.view.ContextMenu",
      "android.widget.Adapter",
      "com.actionbarsherlock.view.ActionProvider",
      "android.widget.Filter",
      "android.content.SyncAdapterType",
      "android.app.ListFragment",
      "android.widget.ViewSwitcher$ViewFactory",
      "android.app.ActionBar$TabListener",
      "android.graphics.Paint$FontMetricsInt",
      "com.actionbarsherlock.view.Menu",
      "android.content.res.TypedArray",
      "android.view.ActionMode$Callback",
      "com.actionbarsherlock.internal.widget.ActionBarView",
      "android.graphics.Paint$Style",
      "android.renderscript.RenderScriptGL",
      "android.widget.AdapterView$OnItemLongClickListener",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView",
      "com.actionbarsherlock.view.ActionProvider$SubUiVisibilityListener",
      "android.widget.SlidingDrawer",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder$Callback",
      "android.database.Cursor",
      "android.widget.RadioGroup$OnCheckedChangeListener",
      "android.app.ActionBar",
      "android.graphics.SurfaceTexture",
      "android.view.View$OnKeyListener",
      "android.widget.CompoundButton",
      "android.os.IInterface",
      "android.widget.Filter$FilterResults",
      "android.graphics.Point",
      "android.widget.AbsListView",
      "android.database.SQLException",
      "android.widget.CompoundButton$OnCheckedChangeListener",
      "android.gesture.Gesture",
      "android.widget.Spinner",
      "android.content.pm.ResolveInfo",
      "android.view.View$DragShadowBuilder",
      "android.gesture.GestureOverlayView$OnGesturingListener",
      "android.graphics.Picture",
      "com.actionbarsherlock.app.ActionBar$OnMenuVisibilityListener",
      "android.view.ContextMenu$ContextMenuInfo",
      "android.widget.ViewFlipper",
      "android.widget.NumberPicker$Formatter",
      "android.gesture.GestureStroke",
      "android.os.Bundle",
      "android.view.MotionEvent$PointerProperties",
      "android.database.AbstractCursor",
      "android.view.TouchDelegate",
      "org.xmlpull.v1.XmlSerializer",
      "android.widget.DatePicker",
      "android.graphics.Paint$Align",
      "android.util.Property",
      "android.database.sqlite.SQLiteDatabase",
      "android.widget.HorizontalScrollView",
      "android.animation.LayoutTransition",
      "android.webkit.SslErrorHandler",
      "android.view.View$OnSystemUiVisibilityChangeListener",
      "android.os.Handler",
      "android.view.inputmethod.ExtractedTextRequest",
      "android.renderscript.RenderScriptGL$SurfaceConfig",
      "android.graphics.Shader",
      "com.actionbarsherlock.internal.view.ActionProviderWrapper",
      "org.xmlpull.v1.XmlPullParser",
      "android.database.CharArrayBuffer",
      "com.xtremelabs.robolectric.tester.android.content.pm.StubPackageManager",
      "com.actionbarsherlock.R",
      "android.widget.NumberPicker$OnValueChangeListener",
      "android.view.Surface",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "android.text.TextUtils$TruncateAt",
      "android.content.IntentFilter",
      "android.app.PendingIntent$CanceledException",
      "android.widget.NumberPicker$OnScrollListener",
      "android.view.SubMenu",
      "android.renderscript.Program",
      "android.content.MutableContextWrapper",
      "android.content.pm.FeatureInfo",
      "android.content.IntentFilter$AuthorityEntry",
      "android.content.pm.PathPermission",
      "android.graphics.Canvas$EdgeType",
      "android.text.Layout",
      "android.view.InflateException",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder",
      "android.graphics.Matrix$ScaleToFit",
      "com.actionbarsherlock.internal.app.ActionBarImpl",
      "android.view.View$OnAttachStateChangeListener",
      "android.widget.AbsListView$LayoutParams",
      "android.media.MediaPlayer$OnCompletionListener",
      "android.graphics.SurfaceTexture$OnFrameAvailableListener",
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
      "android.widget.AdapterViewFlipper",
      "android.webkit.ConsoleMessage$MessageLevel",
      "android.text.style.URLSpan",
      "android.widget.ExpandableListView$OnChildClickListener",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$OnItemSelectedListener",
      "android.app.ActionBar$OnNavigationListener",
      "android.content.SyncInfo",
      "android.app.ProgressDialog",
      "com.actionbarsherlock.internal.view.menu.MenuPopupHelper",
      "android.widget.SlidingDrawer$OnDrawerScrollListener",
      "android.graphics.PorterDuff$Mode",
      "android.view.Window$Callback",
      "android.webkit.WebHistoryItem",
      "android.view.CollapsibleActionView",
      "com.actionbarsherlock.view.ActionMode",
      "android.widget.ViewAnimator",
      "android.view.animation.Transformation",
      "android.util.Printer",
      "android.view.View$OnCreateContextMenuListener",
      "android.widget.EditText",
      "android.webkit.WebView$PictureListener",
      "android.view.inputmethod.CompletionInfo",
      "android.graphics.Rect",
      "android.widget.LinearLayout",
      "android.widget.DialerFilter",
      "android.content.pm.PackageManager",
      "android.view.WindowManager",
      "android.content.pm.ProviderInfo",
      "com.actionbarsherlock.view.MenuItem",
      "android.widget.ExpandableListView$OnGroupExpandListener",
      "android.app.DatePickerDialog",
      "android.preference.Preference$OnPreferenceChangeListener",
      "android.content.ContentResolver",
      "com.actionbarsherlock.R$layout",
      "android.content.pm.ActivityInfo",
      "android.renderscript.RenderScript$RSMessageHandler",
      "android.widget.Button",
      "android.content.pm.InstrumentationInfo",
      "android.graphics.Canvas$VertexMode",
      "android.content.DialogInterface$OnDismissListener",
      "android.graphics.RectF",
      "android.widget.RemoteViews",
      "android.widget.AdapterViewAnimator",
      "android.renderscript.BaseObj",
      "com.actionbarsherlock.R$string",
      "android.content.pm.PermissionGroupInfo",
      "android.renderscript.RSTextureView",
      "android.util.AndroidException",
      "android.widget.TableLayout",
      "android.view.InputEvent",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "com.actionbarsherlock.internal.view.menu.SubMenuBuilder",
      "android.app.PendingIntent$OnFinished",
      "android.util.DisplayMetrics",
      "org.xmlpull.v1.XmlPullParserException",
      "android.app.AliasActivity",
      "android.preference.PreferenceGroup",
      "android.content.DialogInterface$OnCancelListener",
      "android.app.AlertDialog$Builder",
      "com.xtremelabs.robolectric.RobolectricConfig",
      "android.widget.GridLayout$Spec",
      "android.widget.TabWidget",
      "android.content.Loader",
      "android.view.GestureDetector$OnGestureListener",
      "android.net.http.SslCertificate$DName",
      "android.content.ContentValues",
      "com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$Builder",
      "android.view.Window",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "com.actionbarsherlock.view.MenuItem$OnMenuItemClickListener",
      "android.text.Spanned",
      "android.widget.AbsListView$RecyclerListener",
      "android.app.LoaderManager$LoaderCallbacks",
      "com.actionbarsherlock.internal.view.menu.MenuPresenter",
      "com.actionbarsherlock.app.ActionBar$TabListener",
      "android.os.Parcelable$Creator",
      "android.content.pm.PackageInfo",
      "android.view.MenuItem",
      "android.renderscript.RenderScript$RSErrorHandler",
      "android.graphics.Path$Direction",
      "android.widget.FrameLayout$LayoutParams",
      "android.view.WindowManager$LayoutParams",
      "android.widget.TableRow$LayoutParams",
      "android.widget.Gallery",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$5",
      "android.widget.SlidingDrawer$OnDrawerOpenListener",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$3",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$4",
      "android.view.MotionEvent$PointerCoords",
      "android.view.LayoutInflater",
      "android.app.FragmentBreadCrumbs",
      "android.view.animation.LayoutAnimationController$AnimationParameters",
      "android.view.inputmethod.ExtractedText",
      "android.view.TextureView",
      "com.actionbarsherlock.R$style",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$1",
      "com.actionbarsherlock.view.ActionMode$Callback",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator$2",
      "android.view.KeyCharacterMap",
      "android.database.MatrixCursor",
      "android.content.ClipDescription",
      "android.content.pm.ServiceInfo",
      "android.app.Activity",
      "android.support.v4.app.FragmentTransaction",
      "android.renderscript.ProgramVertex",
      "android.content.res.Resources",
      "android.view.ViewManager",
      "android.view.View$OnDragListener",
      "android.content.pm.PermissionInfo",
      "android.text.Editable$Factory",
      "android.os.ParcelFileDescriptor",
      "android.webkit.JsResult",
      "android.widget.ZoomControls",
      "android.renderscript.ProgramFragment",
      "android.content.IntentSender$SendIntentException",
      "android.widget.FrameLayout",
      "com.actionbarsherlock.internal.widget.IcsAdapterView$AdapterDataSetObserver",
      "android.widget.ImageView",
      "android.widget.RadioButton",
      "android.view.ViewTreeObserver$OnScrollChangedListener",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "android.text.method.TransformationMethod",
      "com.actionbarsherlock.app.ActionBar$OnNavigationListener",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$ActionButtonSubmenu",
      "android.graphics.drawable.Drawable$ConstantState",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowPopup",
      "android.app.FragmentManager$BackStackEntry",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "android.content.res.Resources$NotFoundException",
      "android.widget.SimpleAdapter$ViewBinder",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter",
      "com.actionbarsherlock.internal.app.ActionBarImpl$ActionModeImpl",
      "android.view.KeyCharacterMap$KeyData",
      "android.webkit.WebSettings$PluginState",
      "android.media.MediaPlayer$OnErrorListener",
      "android.text.InputFilter",
      "android.graphics.Xfermode",
      "android.view.accessibility.AccessibilityEventSource",
      "android.view.ViewParent",
      "android.widget.FilterQueryProvider",
      "android.text.NoCopySpan",
      "com.actionbarsherlock.app.ActionBar$Tab",
      "android.database.sqlite.SQLiteProgram",
      "android.widget.MediaController",
      "android.app.Dialog",
      "android.widget.RadioGroup",
      "android.text.Editable",
      "com.actionbarsherlock.internal.widget.IcsSpinner",
      "android.graphics.Movie",
      "android.content.IntentSender",
      "android.text.style.UpdateAppearance",
      "android.appwidget.AppWidgetHostView",
      "android.view.ViewTreeObserver$OnGlobalFocusChangeListener",
      "android.app.DialogFragment",
      "android.webkit.WebChromeClient",
      "android.webkit.ValueCallback",
      "android.app.Fragment",
      "android.widget.SpinnerAdapter",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager",
      "android.net.http.SslError",
      "android.view.KeyEvent$Callback",
      "android.widget.SearchView",
      "android.media.MediaPlayer$OnPreparedListener",
      "android.webkit.WebView$HitTestResult",
      "android.content.OperationApplicationException",
      "android.content.ComponentCallbacks2",
      "android.util.SparseBooleanArray",
      "android.preference.PreferenceManager$OnActivityDestroyListener",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView$LayoutParams",
      "android.content.res.Configuration",
      "android.view.ViewGroup$MarginLayoutParams",
      "com.actionbarsherlock.internal.widget.IcsSpinner$SpinnerPopup",
      "android.net.http.SslCertificate",
      "android.gesture.GestureOverlayView$OnGestureListener",
      "android.widget.DatePicker$OnDateChangedListener",
      "android.animation.ValueAnimator",
      "android.app.Application$ActivityLifecycleCallbacks",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "android.app.PendingIntent",
      "android.widget.SearchView$OnQueryTextListener",
      "android.widget.TabHost$TabSpec",
      "android.view.KeyEvent$DispatcherState",
      "com.actionbarsherlock.internal.nineoldandroids.animation.Animator",
      "android.gesture.GestureOverlayView$OnGesturePerformedListener",
      "android.util.AttributeSet",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ObjectAnimator",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter$OverflowMenuButton",
      "android.widget.SlidingDrawer$OnDrawerCloseListener",
      "android.view.View",
      "android.content.ServiceConnection",
      "com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator",
      "android.widget.ZoomButtonsController",
      "android.app.ActionBar$LayoutParams",
      "android.view.SurfaceHolder",
      "android.webkit.HttpAuthHandler",
      "android.database.sqlite.SQLiteQuery",
      "android.app.ActionBar$Tab",
      "android.os.Build$VERSION_CODES",
      "android.view.MenuItem$OnMenuItemClickListener",
      "android.content.DialogInterface$OnKeyListener",
      "android.animation.ObjectAnimator",
      "android.renderscript.ProgramRaster",
      "android.app.SearchableInfo",
      "android.content.ClipData$Item",
      "com.actionbarsherlock.internal.widget.AbsActionBarView",
      "android.view.ViewGroup",
      "android.database.ContentObserver",
      "android.app.AlertDialog",
      "android.util.SparseArray",
      "android.widget.AbsSpinner",
      "android.os.MessageQueue",
      "android.widget.TextView",
      "android.app.FragmentBreadCrumbs$OnBreadCrumbClickListener",
      "android.widget.SimpleAdapter",
      "android.widget.ListAdapter",
      "android.webkit.GeolocationPermissions$Callback",
      "android.graphics.DrawFilter",
      "android.content.ContentProviderClient",
      "android.view.ViewPropertyAnimator",
      "android.content.pm.ApplicationInfo",
      "android.widget.TextView$OnEditorActionListener",
      "android.graphics.Typeface",
      "android.view.accessibility.AccessibilityNodeInfo",
      "android.view.KeyEvent",
      "com.actionbarsherlock.internal.widget.IcsAdapterView",
      "android.view.inputmethod.InputConnection",
      "android.view.LayoutInflater$Factory",
      "android.content.Intent",
      "android.app.ExpandableListActivity",
      "com.actionbarsherlock.internal.view.menu.MenuPresenter$Callback",
      "android.preference.DialogPreference",
      "com.xtremelabs.robolectric.tester.android.view.TestSubMenu",
      "android.content.ClipData",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager$ComponentState",
      "android.view.MotionEvent",
      "android.database.sqlite.SQLiteStatement",
      "android.widget.VideoView",
      "android.app.LoaderManager",
      "android.content.DialogInterface",
      "android.app.Fragment$SavedState",
      "android.widget.ZoomButton",
      "android.view.ViewStub",
      "android.animation.ValueAnimator$AnimatorUpdateListener",
      "android.view.AbsSavedState",
      "android.widget.ImageView$ScaleType",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu",
      "android.content.ContentProvider",
      "android.text.Layout$Directions",
      "com.actionbarsherlock.internal.widget.IcsLinearLayout",
      "android.view.View$OnFocusChangeListener",
      "android.database.sqlite.SQLiteClosable",
      "android.widget.ExpandableListView",
      "android.renderscript.ProgramStore",
      "android.view.View$OnTouchListener",
      "android.view.SurfaceHolder$Callback2"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AnimatorProxy_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "android.view.animation.Animation",
      "android.os.Build$VERSION",
      "com.actionbarsherlock.internal.nineoldandroids.view.animation.AnimatorProxy",
      "android.content.Context",
      "android.content.ContextWrapper",
      "android.view.ContextThemeWrapper",
      "android.app.Activity",
      "android.app.NativeActivity",
      "android.app.ListActivity",
      "android.content.ContentProvider",
      "android.content.SearchRecentSuggestionsProvider",
      "android.app.AliasActivity",
      "android.app.ExpandableListActivity",
      "android.accounts.AccountAuthenticatorActivity",
      "android.view.View",
      "android.view.ViewGroup",
      "android.widget.AdapterView",
      "android.widget.AbsListView",
      "android.widget.ListView",
      "android.app.Fragment",
      "android.app.DialogFragment",
      "android.widget.RelativeLayout",
      "android.database.sqlite.SQLiteClosable",
      "android.database.sqlite.SQLiteDatabase",
      "android.webkit.WebChromeClient",
      "android.widget.LinearLayout",
      "android.widget.ZoomControls",
      "android.widget.FrameLayout",
      "android.widget.ViewAnimator",
      "android.app.ListFragment",
      "android.widget.TabWidget",
      "com.xtremelabs.robolectric.tester.android.view.TestMenuItem",
      "com.actionbarsherlock.internal.view.menu.MenuItemWrapper",
      "android.widget.ViewSwitcher",
      "android.widget.ImageSwitcher",
      "com.actionbarsherlock.app.ActionBar",
      "com.actionbarsherlock.internal.app.ActionBarImpl",
      "android.os.Handler",
      "android.widget.MediaController",
      "android.content.Loader",
      "android.widget.RadioGroup",
      "com.actionbarsherlock.internal.app.ActionBarWrapper",
      "com.xtremelabs.robolectric.res.ResourceExtractor",
      "com.xtremelabs.robolectric.res.XmlLoader",
      "com.xtremelabs.robolectric.res.AttrResourceLoader",
      "com.xtremelabs.robolectric.tester.android.util.TestAttributeSet",
      "android.view.View$MeasureSpec",
      "android.view.ViewStub",
      "android.widget.AbsoluteLayout",
      "android.webkit.WebView",
      "android.os.Parcel",
      "android.view.animation.Transformation",
      "android.view.TextureView",
      "android.content.pm.PackageItemInfo",
      "android.content.pm.ApplicationInfo",
      "android.util.DisplayMetrics",
      "com.xtremelabs.robolectric.RobolectricConfig",
      "android.content.MutableContextWrapper",
      "android.database.AbstractCursor",
      "android.database.MatrixCursor",
      "android.webkit.WebViewFragment",
      "android.content.res.Resources",
      "android.widget.DatePicker",
      "android.widget.TabHost",
      "com.xtremelabs.robolectric.tester.android.view.TestMenu",
      "com.xtremelabs.robolectric.tester.android.view.TestSubMenu",
      "android.text.SpannableStringBuilder",
      "android.widget.SlidingDrawer",
      "android.widget.TimePicker",
      "android.widget.DialerFilter",
      "android.widget.RemoteViews",
      "android.widget.BaseAdapter",
      "android.widget.ArrayAdapter",
      "com.actionbarsherlock.internal.widget.IcsAdapterView",
      "com.actionbarsherlock.internal.widget.IcsAbsSpinner",
      "com.actionbarsherlock.internal.widget.IcsSpinner",
      "android.widget.ViewFlipper",
      "android.widget.AbsSpinner",
      "android.widget.Spinner",
      "android.widget.AdapterViewAnimator",
      "android.widget.StackView",
      "com.actionbarsherlock.internal.view.menu.ActionMenuItemView",
      "android.widget.NumberPicker",
      "com.actionbarsherlock.internal.view.menu.MenuBuilder",
      "android.widget.CalendarView",
      "android.app.Dialog",
      "android.app.AlertDialog",
      "android.app.TimePickerDialog",
      "android.widget.SearchView",
      "android.database.DefaultDatabaseErrorHandler",
      "android.gesture.GestureOverlayView",
      "android.renderscript.RSTextureView",
      "android.widget.TwoLineListItem",
      "android.widget.HorizontalScrollView",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineHorizontalScrollView",
      "android.view.animation.DecelerateInterpolator",
      "com.actionbarsherlock.internal.widget.ScrollingTabContainerView",
      "android.widget.AdapterViewFlipper",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineLinearLayout",
      "com.actionbarsherlock.internal.widget.IcsLinearLayout",
      "com.actionbarsherlock.internal.view.menu.ActionMenuView",
      "android.widget.ZoomButtonsController",
      "android.app.ProgressDialog",
      "android.widget.Gallery",
      "android.widget.ImageView",
      "android.app.DatePickerDialog",
      "android.view.SurfaceView",
      "android.app.FragmentBreadCrumbs",
      "android.text.SpannableStringInternal",
      "android.text.SpannableString",
      "android.widget.VideoView",
      "android.widget.SimpleAdapter",
      "android.content.pm.ComponentInfo",
      "android.content.pm.ProviderInfo",
      "android.widget.TableLayout",
      "android.content.pm.PackageManager",
      "com.xtremelabs.robolectric.tester.android.content.pm.StubPackageManager",
      "com.xtremelabs.robolectric.res.RobolectricPackageManager",
      "com.actionbarsherlock.internal.nineoldandroids.widget.NineFrameLayout",
      "com.actionbarsherlock.internal.widget.ActionBarContainer",
      "android.widget.GridView",
      "android.widget.TableRow",
      "android.widget.QuickContactBadge",
      "android.widget.ScrollView",
      "com.actionbarsherlock.internal.view.menu.ListMenuItemView",
      "com.actionbarsherlock.internal.nineoldandroids.view.NineViewGroup",
      "com.actionbarsherlock.internal.widget.AbsActionBarView",
      "android.widget.TextView",
      "android.preference.Preference",
      "android.preference.DialogPreference",
      "android.preference.EditTextPreference",
      "android.widget.ExpandableListView",
      "com.actionbarsherlock.internal.view.menu.BaseMenuPresenter",
      "com.actionbarsherlock.internal.view.menu.ActionMenuPresenter",
      "com.actionbarsherlock.R$layout",
      "android.view.LayoutInflater",
      "android.widget.GridLayout",
      "android.widget.ImageButton",
      "android.widget.ZoomButton",
      "android.view.ActionProvider",
      "android.widget.ShareActionProvider",
      "android.appwidget.AppWidgetHostView",
      "android.widget.AdapterView$AdapterContextMenuInfo",
      "android.content.ContentValues"
    );
  }
}
