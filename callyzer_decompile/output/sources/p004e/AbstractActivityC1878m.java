package p004e;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.a1;
import aw.C0465e;
import b6.InterfaceC0600a;
import c6.C0885o;
import c6.C0886p;
import c6.C0887q;
import c6.InterfaceC0883m;
import c6.InterfaceC0888r;
import com.websoptimization.callyzerbiz.R;
import d7.AbstractC1646r;
import d7.C1651w;
import d7.EnumC1644p;
import d7.EnumC1645q;
import d7.InterfaceC1637j;
import d7.InterfaceC1647s;
import d7.InterfaceC1649u;
import d7.b1;
import d7.c1;
import d7.k0;
import d7.m0;
import d7.q0;
import d7.x0;
import d7.y0;
import ex.InterfaceC2137a;
import g7.AbstractC2538c;
import g7.C2539d;
import g8.C2542b;
import g8.C2545e;
import g8.C2546f;
import g8.InterfaceC2547g;
import i8.C3182a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.d0;
import og.gg;
import og.nd;
import og.oa;
import p006g.C2409a;
import p006g.InterfaceC2410b;
import p007h.AbstractC2751c;
import p007h.AbstractC2757i;
import p007h.InterfaceC2750b;
import p007h.InterfaceC2758j;
import p008i.AbstractC3064a;
import q5.AbstractActivityC6110c;
import q5.C6111d;
import q5.C6126s;
import q5.InterfaceC6124q;
import q5.InterfaceC6125r;
import qw.InterfaceC6353c;
import qw.InterfaceC6357g;
import r5.InterfaceC6470e;
import r5.InterfaceC6471f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: e.m */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1878m extends AbstractActivityC6110c implements c1, InterfaceC1637j, InterfaceC2547g, e0, InterfaceC2758j, InterfaceC6470e, InterfaceC6471f, InterfaceC6124q, InterfaceC6125r, InterfaceC0883m {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C1872g Companion = new C1872g();
    private b1 _viewModelStore;
    private final AbstractC2757i activityResultRegistry;
    private int contentLayoutId;
    private final InterfaceC6357g defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC6357g fullyDrawnReporter$delegate;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC6357g onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC0600a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0600a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0600a> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC0600a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC0600a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC1874i reportFullyDrawnExecutor;
    private final C2546f savedStateRegistryController;
    private final C2409a contextAwareHelper = new C2409a();
    private final C0887q menuHostHelper = new C0887q(new RunnableC1868c(this, 0));

    public AbstractActivityC1878m() {
        C2546f c2546f = new C2546f(new C3182a(this, new C0465e(9, this)));
        this.savedStateRegistryController = c2546f;
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC1875j(this);
        this.fullyDrawnReporter$delegate = nd.m10782c(new C1877l(this, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C1876k(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i10 = 0;
        getLifecycle().mo5343a(new InterfaceC1647s(this) { // from class: e.d

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1878m f8875b;

            {
                this.f8875b = this;
            }

            @Override // d7.InterfaceC1647s
            /* renamed from: u */
            public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
                Window window;
                View viewPeekDecorView;
                switch (i10) {
                    case 0:
                        if (enumC1644p == EnumC1644p.ON_STOP && (window = this.f8875b.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1878m.m5508c(this.f8875b, interfaceC1649u, enumC1644p);
                        break;
                }
            }
        });
        final int i11 = 1;
        getLifecycle().mo5343a(new InterfaceC1647s(this) { // from class: e.d

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC1878m f8875b;

            {
                this.f8875b = this;
            }

            @Override // d7.InterfaceC1647s
            /* renamed from: u */
            public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
                Window window;
                View viewPeekDecorView;
                switch (i11) {
                    case 0:
                        if (enumC1644p == EnumC1644p.ON_STOP && (window = this.f8875b.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC1878m.m5508c(this.f8875b, interfaceC1649u, enumC1644p);
                        break;
                }
            }
        });
        getLifecycle().mo5343a(new C2542b(i11, this));
        c2546f.m6567a();
        q0.m5336c(this);
        getSavedStateRegistry().m6565c(ACTIVITY_RESULT_TAG, new C1870e(0, this));
        addOnContextAvailableListener(new InterfaceC2410b() { // from class: e.f
            @Override // p006g.InterfaceC2410b
            /* renamed from: a */
            public final void mo1206a(AbstractActivityC1878m abstractActivityC1878m) {
                AbstractActivityC1878m.m5507b(this.f8880a, abstractActivityC1878m);
            }
        });
        this.defaultViewModelProviderFactory$delegate = nd.m10782c(new C1877l(this, 0));
        this.onBackPressedDispatcher$delegate = nd.m10782c(new C1877l(this, 3));
    }

    public static final void access$ensureViewModelStore(AbstractActivityC1878m abstractActivityC1878m) {
        if (abstractActivityC1878m._viewModelStore == null) {
            C1873h c1873h = (C1873h) abstractActivityC1878m.getLastNonConfigurationInstance();
            if (c1873h != null) {
                abstractActivityC1878m._viewModelStore = c1873h.f8885b;
            }
            if (abstractActivityC1878m._viewModelStore == null) {
                abstractActivityC1878m._viewModelStore = new b1();
            }
        }
    }

    /* renamed from: b */
    public static void m5507b(AbstractActivityC1878m abstractActivityC1878m, Context it) {
        AbstractC4154l.m8923f(it, "it");
        Bundle bundleM6563a = abstractActivityC1878m.getSavedStateRegistry().m6563a(ACTIVITY_RESULT_TAG);
        if (bundleM6563a != null) {
            AbstractC2757i abstractC2757i = abstractActivityC1878m.activityResultRegistry;
            LinkedHashMap linkedHashMap = abstractC2757i.f15309b;
            LinkedHashMap linkedHashMap2 = abstractC2757i.f15308a;
            Bundle bundle = abstractC2757i.f15314g;
            ArrayList<Integer> integerArrayList = bundleM6563a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleM6563a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleM6563a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                abstractC2757i.f15311d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleM6563a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = stringArrayList.get(i10);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        d0.m8906c(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i10);
                AbstractC4154l.m8922e(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i10);
                AbstractC4154l.m8922e(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                abstractC2757i.f15309b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    /* renamed from: c */
    public static void m5508c(AbstractActivityC1878m abstractActivityC1878m, InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
        if (enumC1644p == EnumC1644p.ON_DESTROY) {
            abstractActivityC1878m.contextAwareHelper.f10901b = null;
            if (!abstractActivityC1878m.isChangingConfigurations()) {
                abstractActivityC1878m.getViewModelStore().m5307a();
            }
            ViewTreeObserverOnDrawListenerC1875j viewTreeObserverOnDrawListenerC1875j = (ViewTreeObserverOnDrawListenerC1875j) abstractActivityC1878m.reportFullyDrawnExecutor;
            AbstractActivityC1878m abstractActivityC1878m2 = viewTreeObserverOnDrawListenerC1875j.f8889d;
            abstractActivityC1878m2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC1875j);
            abstractActivityC1878m2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC1875j);
        }
    }

    /* renamed from: d */
    public static Bundle m5509d(AbstractActivityC1878m abstractActivityC1878m) {
        Bundle bundle = new Bundle();
        AbstractC2757i abstractC2757i = abstractActivityC1878m.activityResultRegistry;
        abstractC2757i.getClass();
        LinkedHashMap linkedHashMap = abstractC2757i.f15309b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(abstractC2757i.f15311d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(abstractC2757i.f15314g));
        return bundle;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC1874i interfaceExecutorC1874i = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC1875j) interfaceExecutorC1874i).m5505a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // c6.InterfaceC0883m
    public void addMenuProvider(InterfaceC0888r provider) {
        AbstractC4154l.m8923f(provider, "provider");
        C0887q c0887q = this.menuHostHelper;
        c0887q.f5508b.add(provider);
        c0887q.f5507a.run();
    }

    @Override // r5.InterfaceC6470e
    public final void addOnConfigurationChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC2410b listener) {
        AbstractC4154l.m8923f(listener, "listener");
        C2409a c2409a = this.contextAwareHelper;
        c2409a.getClass();
        AbstractActivityC1878m abstractActivityC1878m = c2409a.f10901b;
        if (abstractActivityC1878m != null) {
            listener.mo1206a(abstractActivityC1878m);
        }
        c2409a.f10900a.add(listener);
    }

    @Override // q5.InterfaceC6124q
    public final void addOnMultiWindowModeChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // q5.InterfaceC6125r
    public final void addOnPictureInPictureModeChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // r5.InterfaceC6471f
    public final void addOnTrimMemoryListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    @Override // p007h.InterfaceC2758j
    public final AbstractC2757i getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // d7.InterfaceC1637j
    public AbstractC2538c getDefaultViewModelCreationExtras() {
        C2539d c2539d = new C2539d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c2539d.f13868a;
        if (application != null) {
            Application application2 = getApplication();
            AbstractC4154l.m8922e(application2, "application");
            linkedHashMap.put(x0.f8158d, application2);
        }
        linkedHashMap.put(q0.f8124a, this);
        linkedHashMap.put(q0.f8125b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(q0.f8126c, extras);
        }
        return c2539d;
    }

    public y0 getDefaultViewModelProviderFactory() {
        return (y0) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C1886u getFullyDrawnReporter() {
        return (C1886u) this.fullyDrawnReporter$delegate.getValue();
    }

    @InterfaceC6353c
    public Object getLastCustomNonConfigurationInstance() {
        C1873h c1873h = (C1873h) getLastNonConfigurationInstance();
        if (c1873h != null) {
            return c1873h.f8884a;
        }
        return null;
    }

    @Override // q5.AbstractActivityC6110c, d7.InterfaceC1649u
    public AbstractC1646r getLifecycle() {
        return super.getLifecycle();
    }

    @Override // p004e.e0
    public final c0 getOnBackPressedDispatcher() {
        return (c0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        return this.savedStateRegistryController.f13877b;
    }

    @Override // d7.c1
    public b1 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C1873h c1873h = (C1873h) getLastNonConfigurationInstance();
            if (c1873h != null) {
                this._viewModelStore = c1873h.f8885b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new b1();
            }
        }
        b1 b1Var = this._viewModelStore;
        AbstractC4154l.m8920c(b1Var);
        return b1Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        q0.m5341h(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView2, "window.decorView");
        q0.m5342i(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView3, "window.decorView");
        gg.m10676c(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.activityResultRegistry.m6750a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void onBackPressed() {
        getOnBackPressedDispatcher().m5502c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC4154l.m8923f(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<InterfaceC0600a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // q5.AbstractActivityC6110c, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.m6568b(bundle);
        C2409a c2409a = this.contextAwareHelper;
        c2409a.getClass();
        c2409a.f10901b = this;
        Iterator it = c2409a.f10900a.iterator();
        while (it.hasNext()) {
            ((InterfaceC2410b) it.next()).mo1206a(this);
        }
        super.onCreate(bundle);
        int i10 = m0.f8117a;
        k0.m5324b(this);
        int i11 = this.contentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        AbstractC4154l.m8923f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        C0887q c0887q = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = c0887q.f5508b.iterator();
        while (it.hasNext()) {
            ((a1) ((InterfaceC0888r) it.next())).f2456a.m1186k(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem item) {
        AbstractC4154l.m8923f(item, "item");
        if (super.onMenuItemSelected(i10, item)) {
            return true;
        }
        if (i10 == 0) {
            return this.menuHostHelper.m2486a(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void onMultiWindowModeChanged(boolean z6) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC0600a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C6111d(z6));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC4154l.m8923f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC0600a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        AbstractC4154l.m8923f(menu, "menu");
        Iterator it = this.menuHostHelper.f5508b.iterator();
        while (it.hasNext()) {
            ((a1) ((InterfaceC0888r) it.next())).f2456a.m1192q(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void onPictureInPictureModeChanged(boolean z6) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC0600a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C6126s(z6));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        AbstractC4154l.m8923f(menu, "menu");
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator it = this.menuHostHelper.f5508b.iterator();
        while (it.hasNext()) {
            ((a1) ((InterfaceC0888r) it.next())).f2456a.m1195t(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC4154l.m8923f(permissions, "permissions");
        AbstractC4154l.m8923f(grantResults, "grantResults");
        if (this.activityResultRegistry.m6750a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i10, permissions, grantResults);
    }

    @InterfaceC6353c
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C1873h c1873h;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b1 b1Var = this._viewModelStore;
        if (b1Var == null && (c1873h = (C1873h) getLastNonConfigurationInstance()) != null) {
            b1Var = c1873h.f8885b;
        }
        if (b1Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C1873h c1873h2 = new C1873h();
        c1873h2.f8884a = objOnRetainCustomNonConfigurationInstance;
        c1873h2.f8885b = b1Var;
        return c1873h2;
    }

    @Override // q5.AbstractActivityC6110c, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        AbstractC4154l.m8923f(outState, "outState");
        if (getLifecycle() instanceof C1651w) {
            AbstractC1646r lifecycle = getLifecycle();
            AbstractC4154l.m8921d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((C1651w) lifecycle).m5357i(EnumC1645q.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.m6569c(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<InterfaceC0600a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f10901b;
    }

    public final <I, O> AbstractC2751c registerForActivityResult(AbstractC3064a contract, AbstractC2757i registry, InterfaceC2750b callback) {
        AbstractC4154l.m8923f(contract, "contract");
        AbstractC4154l.m8923f(registry, "registry");
        AbstractC4154l.m8923f(callback, "callback");
        return registry.m6751c("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // c6.InterfaceC0883m
    public void removeMenuProvider(InterfaceC0888r provider) {
        AbstractC4154l.m8923f(provider, "provider");
        this.menuHostHelper.m2487b(provider);
    }

    @Override // r5.InterfaceC6470e
    public final void removeOnConfigurationChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC2410b listener) {
        AbstractC4154l.m8923f(listener, "listener");
        C2409a c2409a = this.contextAwareHelper;
        c2409a.getClass();
        c2409a.f10900a.remove(listener);
    }

    @Override // q5.InterfaceC6124q
    public final void removeOnMultiWindowModeChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // q5.InterfaceC6125r
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // r5.InterfaceC6471f
    public final void removeOnTrimMemoryListener(InterfaceC0600a listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        AbstractC4154l.m8923f(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (oa.m10793c()) {
                Trace.beginSection(oa.m10795e("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            C1886u fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f8898a) {
                try {
                    fullyDrawnReporter.f8899b = true;
                    ArrayList arrayList = fullyDrawnReporter.f8900c;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((InterfaceC2137a) obj).invoke();
                    }
                    fullyDrawnReporter.f8900c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        InterfaceExecutorC1874i interfaceExecutorC1874i = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC1875j) interfaceExecutorC1874i).m5505a(decorView);
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void startActivityForResult(Intent intent, int i10) {
        AbstractC4154l.m8923f(intent, "intent");
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        AbstractC4154l.m8923f(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        AbstractC4154l.m8923f(intent, "intent");
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC6353c
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        AbstractC4154l.m8923f(intent, "intent");
        super.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
    }

    public final <I, O> AbstractC2751c registerForActivityResult(AbstractC3064a contract, InterfaceC2750b callback) {
        AbstractC4154l.m8923f(contract, "contract");
        AbstractC4154l.m8923f(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z6, Configuration newConfig) {
        AbstractC4154l.m8923f(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z6, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC0600a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C6111d(z6));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z6, Configuration newConfig) {
        AbstractC4154l.m8923f(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z6, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC0600a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C6126s(z6));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC1874i interfaceExecutorC1874i = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC1875j) interfaceExecutorC1874i).m5505a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0888r provider, InterfaceC1649u owner) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(owner, "owner");
        C0887q c0887q = this.menuHostHelper;
        c0887q.f5508b.add(provider);
        c0887q.f5507a.run();
        AbstractC1646r lifecycle = owner.getLifecycle();
        HashMap map = c0887q.f5509c;
        C0886p c0886p = (C0886p) map.remove(provider);
        if (c0886p != null) {
            c0886p.f5494a.mo5346d(c0886p.f5495b);
            c0886p.f5495b = null;
        }
        map.put(provider, new C0886p(lifecycle, new C0885o(0, c0887q, provider)));
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC1874i interfaceExecutorC1874i = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        AbstractC4154l.m8922e(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC1875j) interfaceExecutorC1874i).m5505a(decorView);
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final InterfaceC0888r provider, InterfaceC1649u owner, final EnumC1645q state) {
        AbstractC4154l.m8923f(provider, "provider");
        AbstractC4154l.m8923f(owner, "owner");
        AbstractC4154l.m8923f(state, "state");
        final C0887q c0887q = this.menuHostHelper;
        c0887q.getClass();
        AbstractC1646r lifecycle = owner.getLifecycle();
        HashMap map = c0887q.f5509c;
        C0886p c0886p = (C0886p) map.remove(provider);
        if (c0886p != null) {
            c0886p.f5494a.mo5346d(c0886p.f5495b);
            c0886p.f5495b = null;
        }
        map.put(provider, new C0886p(lifecycle, new InterfaceC1647s() { // from class: c6.n
            @Override // d7.InterfaceC1647s
            /* renamed from: u */
            public final void mo1120u(InterfaceC1649u interfaceC1649u, EnumC1644p enumC1644p) {
                C0887q c0887q2 = c0887q;
                c0887q2.getClass();
                Runnable runnable = c0887q2.f5507a;
                CopyOnWriteArrayList copyOnWriteArrayList = c0887q2.f5508b;
                EnumC1645q enumC1645q = state;
                EnumC1644p enumC1644pUpTo = EnumC1644p.upTo(enumC1645q);
                InterfaceC0888r interfaceC0888r = provider;
                if (enumC1644p == enumC1644pUpTo) {
                    copyOnWriteArrayList.add(interfaceC0888r);
                    runnable.run();
                } else if (enumC1644p == EnumC1644p.ON_DESTROY) {
                    c0887q2.m2487b(interfaceC0888r);
                } else if (enumC1644p == EnumC1644p.downFrom(enumC1645q)) {
                    copyOnWriteArrayList.remove(interfaceC0888r);
                    runnable.run();
                }
            }
        }));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
