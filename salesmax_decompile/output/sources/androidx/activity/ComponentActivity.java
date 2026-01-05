package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.AbstractC2154w;
import androidx.lifecycle.C2144m;
import androidx.lifecycle.C2155x;
import androidx.lifecycle.FragmentC2150s;
import androidx.lifecycle.InterfaceC2137f;
import androidx.lifecycle.InterfaceC2142k;
import androidx.lifecycle.b0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p001o.bbb;
import p001o.ebc;
import p001o.f1f;
import p001o.g1f;
import p001o.h1f;
import p001o.hbc;
import p001o.hu3;
import p001o.kbc;
import p001o.kcc;
import p001o.kob;
import p001o.ks;
import p001o.kxi;
import p001o.lbc;
import p001o.lxi;
import p001o.mn;
import p001o.ns;
import p001o.os;
import p001o.qzi;
import p001o.rzi;
import p001o.s7d;
import p001o.sk7;
import p001o.szi;
import p001o.tab;
import p001o.tk7;
import p001o.tzi;
import p001o.uk7;
import p001o.uzi;
import p001o.vbc;
import p001o.vsh;
import p001o.wab;
import p001o.wob;
import p001o.ws;
import p001o.xca;
import p001o.xs;
import p001o.y3i;
import p001o.ya4;
import p001o.ys;
import p001o.z54;
import p001o.zbc;

/* loaded from: classes2.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements lxi, InterfaceC2137f, h1f, hbc, ys, kbc, kcc, vbc, zbc, tab, tk7 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final xs mActivityResultRegistry;
    private int mContentLayoutId;
    private b0.InterfaceC2131c mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    final sk7 mFullyDrawnReporter;
    private final AtomicInteger mNextLocalRequestCode;
    private ebc mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<hu3> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<hu3> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<hu3> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<hu3> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<hu3> mOnTrimMemoryListeners;
    final InterfaceExecutorC1748j mReportFullyDrawnExecutor;
    final g1f mSavedStateRegistryController;
    private kxi mViewModelStore;
    final z54 mContextAwareHelper = new z54();
    private final wab mMenuHostHelper = new wab(new Runnable() { // from class: o.ym3
        @Override // java.lang.Runnable
        public final void run() {
            this.f55697a.invalidateMenu();
        }
    });
    private final C2144m mLifecycleRegistry = new C2144m(this);

    /* renamed from: androidx.activity.ComponentActivity$a */
    public class C1739a extends xs {

        /* renamed from: androidx.activity.ComponentActivity$a$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f5248a;

            /* renamed from: b */
            public final /* synthetic */ os.C15882a f5249b;

            public a(int i, os.C15882a c15882a) {
                this.f5248a = i;
                this.f5249b = c15882a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1739a.this.m56735c(this.f5248a, this.f5249b.m42611a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$a$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f5251a;

            /* renamed from: b */
            public final /* synthetic */ IntentSender.SendIntentException f5252b;

            public b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f5251a = i;
                this.f5252b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C1739a.this.m56734b(this.f5251a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f5252b));
            }
        }

        public C1739a() {
        }

        @Override // p001o.xs
        /* renamed from: f */
        public void mo3716f(int i, os osVar, Object obj, ks ksVar) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            os.C15882a c15882aMo42610b = osVar.mo42610b(componentActivity, obj);
            if (c15882aMo42610b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, c15882aMo42610b));
                return;
            }
            Intent intentMo6230a = osVar.mo6230a(componentActivity, obj);
            if (intentMo6230a.getExtras() != null && intentMo6230a.getExtras().getClassLoader() == null) {
                intentMo6230a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo6230a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentMo6230a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo6230a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo6230a.getAction())) {
                String[] stringArrayExtra = intentMo6230a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                mn.m39367g(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo6230a.getAction())) {
                mn.m39372l(componentActivity, intentMo6230a, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo6230a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                mn.m39373m(componentActivity, intentSenderRequest.m3732d(), i, intentSenderRequest.m3729a(), intentSenderRequest.m3730b(), intentSenderRequest.m3731c(), 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new b(i, e));
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$b */
    public class C1740b implements InterfaceC2142k {
        public C1740b() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (aVar == AbstractC2139h.a.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    C1745g.m3718a(viewPeekDecorView);
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    public class C1741c implements InterfaceC2142k {
        public C1741c() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (aVar == AbstractC2139h.a.ON_DESTROY) {
                ComponentActivity.this.mContextAwareHelper.m58765b();
                if (!ComponentActivity.this.isChangingConfigurations()) {
                    ComponentActivity.this.getViewModelStore().m36299a();
                }
                ComponentActivity.this.mReportFullyDrawnExecutor.mo3720g();
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    public class C1742d implements InterfaceC2142k {
        public C1742d() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().mo6524d(this);
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    public class RunnableC1743e implements Runnable {
        public RunnableC1743e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$f */
    public class C1744f implements InterfaceC2142k {
        public C1744f() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            if (aVar != AbstractC2139h.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            ComponentActivity.this.mOnBackPressedDispatcher.m24718o(C1746h.m3719a((ComponentActivity) xcaVar));
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$g */
    public static class C1745g {
        /* renamed from: a */
        public static void m3718a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$h */
    public static class C1746h {
        /* renamed from: a */
        public static OnBackInvokedDispatcher m3719a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$i */
    public static final class C1747i {

        /* renamed from: a */
        public Object f5259a;

        /* renamed from: b */
        public kxi f5260b;
    }

    /* renamed from: androidx.activity.ComponentActivity$j */
    public interface InterfaceExecutorC1748j extends Executor {
        /* renamed from: g */
        void mo3720g();

        /* renamed from: u */
        void mo3721u(View view);
    }

    /* renamed from: androidx.activity.ComponentActivity$k */
    public class ViewTreeObserverOnDrawListenerC1749k implements InterfaceExecutorC1748j, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b */
        public Runnable f5262b;

        /* renamed from: a */
        public final long f5261a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c */
        public boolean f5263c = false;

        public ViewTreeObserverOnDrawListenerC1749k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m3723b() {
            Runnable runnable = this.f5262b;
            if (runnable != null) {
                runnable.run();
                this.f5262b = null;
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f5262b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f5263c) {
                decorView.postOnAnimation(new Runnable() { // from class: o.cn3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18367a.m3723b();
                    }
                });
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC1748j
        /* renamed from: g */
        public void mo3720g() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f5262b;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f5261a) {
                    this.f5263c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f5262b = null;
            if (ComponentActivity.this.mFullyDrawnReporter.m48445c()) {
                this.f5263c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.InterfaceExecutorC1748j
        /* renamed from: u */
        public void mo3721u(View view) {
            if (this.f5263c) {
                return;
            }
            this.f5263c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        g1f g1fVarM27975a = g1f.m27975a(this);
        this.mSavedStateRegistryController = g1fVarM27975a;
        this.mOnBackPressedDispatcher = null;
        InterfaceExecutorC1748j interfaceExecutorC1748jM3715E = m3715E();
        this.mReportFullyDrawnExecutor = interfaceExecutorC1748jM3715E;
        this.mFullyDrawnReporter = new sk7(interfaceExecutorC1748jM3715E, new uk7() { // from class: o.zm3
            @Override // p001o.uk7
            public final Object invoke() {
                return this.f57396a.m3711W();
            }
        });
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C1739a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().mo6521a(new C1740b());
        getLifecycle().mo6521a(new C1741c());
        getLifecycle().mo6521a(new C1742d());
        g1fVarM27975a.m27977c();
        AbstractC2154w.m6598c(this);
        getSavedStateRegistry().m25946h(ACTIVITY_RESULT_TAG, new f1f.InterfaceC13312c() { // from class: o.an3
            @Override // p001o.f1f.InterfaceC13312c
            /* renamed from: a */
            public final Bundle mo3785a() {
                return this.f15039a.w0();
            }
        });
        addOnContextAvailableListener(new lbc() { // from class: o.bn3
            @Override // p001o.lbc
            /* renamed from: a */
            public final void mo3786a(Context context) {
                this.f16564a.x0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ y3i m3711W() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle w0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.m56739h(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(Context context) {
        Bundle bundleM25941b = getSavedStateRegistry().m25941b(ACTIVITY_RESULT_TAG);
        if (bundleM25941b != null) {
            this.mActivityResultRegistry.m56738g(bundleM25941b);
        }
    }

    /* renamed from: E */
    public final InterfaceExecutorC1748j m3715E() {
        return new ViewTreeObserverOnDrawListenerC1749k();
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo3721u(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p001o.tab
    public void addMenuProvider(bbb bbbVar) {
        this.mMenuHostHelper.m54140c(bbbVar);
    }

    @Override // p001o.kbc
    public final void addOnConfigurationChangedListener(hu3 hu3Var) {
        this.mOnConfigurationChangedListeners.add(hu3Var);
    }

    public final void addOnContextAvailableListener(lbc lbcVar) {
        this.mContextAwareHelper.m58764a(lbcVar);
    }

    @Override // p001o.vbc
    public final void addOnMultiWindowModeChangedListener(hu3 hu3Var) {
        this.mOnMultiWindowModeChangedListeners.add(hu3Var);
    }

    public final void addOnNewIntentListener(hu3 hu3Var) {
        this.mOnNewIntentListeners.add(hu3Var);
    }

    @Override // p001o.zbc
    public final void addOnPictureInPictureModeChangedListener(hu3 hu3Var) {
        this.mOnPictureInPictureModeChangedListeners.add(hu3Var);
    }

    @Override // p001o.kcc
    public final void addOnTrimMemoryListener(hu3 hu3Var) {
        this.mOnTrimMemoryListeners.add(hu3Var);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C1747i c1747i = (C1747i) getLastNonConfigurationInstance();
            if (c1747i != null) {
                this.mViewModelStore = c1747i.f5260b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new kxi();
            }
        }
    }

    @Override // p001o.ys
    public final xs getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public ya4 getDefaultViewModelCreationExtras() {
        wob wobVar = new wob();
        if (getApplication() != null) {
            wobVar.m54753c(b0.C2129a.f7658h, getApplication());
        }
        wobVar.m54753c(AbstractC2154w.f7762a, this);
        wobVar.m54753c(AbstractC2154w.f7763b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            wobVar.m54753c(AbstractC2154w.f7764c, getIntent().getExtras());
        }
        return wobVar;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public b0.InterfaceC2131c getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C2155x(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public sk7 getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C1747i c1747i = (C1747i) getLastNonConfigurationInstance();
        if (c1747i != null) {
            return c1747i.f5259a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, p001o.xca
    public AbstractC2139h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // p001o.hbc
    public final ebc getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new ebc(new RunnableC1743e());
            getLifecycle().mo6521a(new C1744f());
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // p001o.h1f
    public final f1f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m27976b();
    }

    @Override // p001o.lxi
    public kxi getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        rzi.m47366b(getWindow().getDecorView(), this);
        uzi.m52200a(getWindow().getDecorView(), this);
        tzi.m50817b(getWindow().getDecorView(), this);
        szi.m49110a(getWindow().getDecorView(), this);
        qzi.m46009a(getWindow().getDecorView(), this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.mActivityResultRegistry.m56734b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().m24715l();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<hu3> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m27978d(bundle);
        this.mContextAwareHelper.m58766c(this);
        super.onCreate(bundle);
        FragmentC2150s.m6570e(this);
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        this.mMenuHostHelper.m54143h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m54145j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<hu3> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new kob(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<hu3> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.m54144i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<hu3> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s7d(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        this.mMenuHostHelper.m54146k(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.m56734b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1747i c1747i;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        kxi kxiVar = this.mViewModelStore;
        if (kxiVar == null && (c1747i = (C1747i) getLastNonConfigurationInstance()) != null) {
            kxiVar = c1747i.f5260b;
        }
        if (kxiVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C1747i c1747i2 = new C1747i();
        c1747i2.f5259a = objOnRetainCustomNonConfigurationInstance;
        c1747i2.f5260b = kxiVar;
        return c1747i2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC2139h lifecycle = getLifecycle();
        if (lifecycle instanceof C2144m) {
            ((C2144m) lifecycle).m6543n(AbstractC2139h.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m27979e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<hu3> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m58767d();
    }

    public final <I, O> ws registerForActivityResult(os osVar, xs xsVar, ns nsVar) {
        return xsVar.m56741j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, osVar, nsVar);
    }

    @Override // p001o.tab
    public void removeMenuProvider(bbb bbbVar) {
        this.mMenuHostHelper.m54147l(bbbVar);
    }

    @Override // p001o.kbc
    public final void removeOnConfigurationChangedListener(hu3 hu3Var) {
        this.mOnConfigurationChangedListeners.remove(hu3Var);
    }

    public final void removeOnContextAvailableListener(lbc lbcVar) {
        this.mContextAwareHelper.m58768e(lbcVar);
    }

    @Override // p001o.vbc
    public final void removeOnMultiWindowModeChangedListener(hu3 hu3Var) {
        this.mOnMultiWindowModeChangedListeners.remove(hu3Var);
    }

    public final void removeOnNewIntentListener(hu3 hu3Var) {
        this.mOnNewIntentListeners.remove(hu3Var);
    }

    @Override // p001o.zbc
    public final void removeOnPictureInPictureModeChangedListener(hu3 hu3Var) {
        this.mOnPictureInPictureModeChangedListeners.remove(hu3Var);
    }

    @Override // p001o.kcc
    public final void removeOnTrimMemoryListener(hu3 hu3Var) {
        this.mOnTrimMemoryListeners.remove(hu3Var);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (vsh.m53387d()) {
                vsh.m53384a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.m48444b();
        } finally {
            vsh.m53385b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo3721u(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(bbb bbbVar, xca xcaVar) {
        this.mMenuHostHelper.m54141d(bbbVar, xcaVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(bbb bbbVar, xca xcaVar, AbstractC2139h.b bVar) {
        this.mMenuHostHelper.m54142e(bbbVar, xcaVar, bVar);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<hu3> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new kob(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<hu3> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new s7d(z, configuration));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> ws registerForActivityResult(os osVar, ns nsVar) {
        return registerForActivityResult(osVar, this.mActivityResultRegistry, nsVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo3721u(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.mo3721u(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
