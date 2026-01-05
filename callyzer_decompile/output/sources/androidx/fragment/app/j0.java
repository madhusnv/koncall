package androidx.fragment.app;

import a2.AbstractC0030c;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import aw.C0465e;
import com.sun.mail.util.AbstractC1452a;
import d7.AbstractC1646r;
import d7.C1651w;
import d7.EnumC1644p;
import d7.EnumC1645q;
import d7.InterfaceC1637j;
import d7.InterfaceC1649u;
import g7.AbstractC2538c;
import g7.C2539d;
import g8.C2545e;
import g8.C2546f;
import g8.InterfaceC2547g;
import i8.C3182a;
import j7.AbstractC3594a;
import j7.C3595b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4154l;
import og.gg;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import p007h.AbstractC2751c;
import p007h.AbstractC2757i;
import p007h.C2759k;
import p007h.InterfaceC2750b;
import p008i.AbstractC3064a;
import p016r.InterfaceC6409a;
import q5.AbstractC6127t;
import y6.AbstractC8565c;
import y6.C8564b;
import y6.EnumC8563a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class j0 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1649u, d7.c1, InterfaceC1637j, InterfaceC2547g {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    f0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    d7.y0 mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    j1 mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    u0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C1651w mLifecycleRegistry;
    j0 mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C2546f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    j0 mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    d2 mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    j1 mChildFragmentManager = new k1();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC0361z(this, 0);
    EnumC1645q mMaxState = EnumC1645q.RESUMED;
    d7.g0 mViewLifecycleOwnerLiveData = new d7.g0();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<g0> mOnPreAttachedListeners = new ArrayList<>();
    private final g0 mSavedStateAttachListener = new a0(this);

    public j0() {
        m1148g();
    }

    @Deprecated
    public static j0 instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* renamed from: c */
    public Activity m1144c() {
        return getActivity();
    }

    public void callStartTransitionListener(boolean z6) {
        ViewGroup viewGroup;
        j1 j1Var;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var != null) {
            f0Var.f2527s = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (j1Var = this.mFragmentManager) == null) {
            return;
        }
        C0352q c0352qM1232j = C0352q.m1232j(viewGroup, j1Var);
        c0352qM1232j.m1242l();
        if (z6) {
            this.mHost.f2709c.post(new RunnableC0353r(1, c0352qM1232j));
        } else {
            c0352qM1232j.m1238e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public r0 createFragmentContainer() {
        return new b0(this);
    }

    /* renamed from: d */
    public final f0 m1145d() {
        if (this.mAnimationInfo == null) {
            f0 f0Var = new f0();
            f0Var.f2517i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            f0Var.f2518j = obj;
            f0Var.f2519k = null;
            f0Var.f2520l = obj;
            f0Var.f2521m = null;
            f0Var.f2522n = obj;
            f0Var.f2525q = 1.0f;
            f0Var.f2526r = null;
            this.mAnimationInfo = f0Var;
        }
        return this.mAnimationInfo;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        j0 j0VarM1147f = m1147f(false);
        if (j0VarM1147f != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(j0VarM1147f);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC3594a.m8158a(this).m8160b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m1197v(AbstractC1452a.m4561h(str, "  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: e */
    public final int m1146e() {
        EnumC1645q enumC1645q = this.mMaxState;
        return (enumC1645q == EnumC1645q.INITIALIZED || this.mParentFragment == null) ? enumC1645q.ordinal() : Math.min(enumC1645q.ordinal(), this.mParentFragment.m1146e());
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final j0 m1147f(boolean z6) {
        String str;
        if (z6) {
            C8564b c8564b = AbstractC8565c.f41561a;
            AbstractC8565c.m15832b(new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this));
            AbstractC8565c.m15831a(this).getClass();
            EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        }
        j0 j0Var = this.mTarget;
        if (j0Var != null) {
            return j0Var;
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return j1Var.f2581c.m1261b(str);
    }

    public j0 findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f2581c.m1262c(str);
    }

    /* renamed from: g */
    public final void m1148g() {
        this.mLifecycleRegistry = new C1651w(this);
        this.mSavedStateRegistryController = new C2546f(new C3182a(this, new C0465e(9, this)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        g0 g0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            g0Var.mo1095a();
        } else {
            this.mOnPreAttachedListeners.add(g0Var);
        }
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final o0 getActivity() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f2707a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null || (bool = f0Var.f2524p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null || (bool = f0Var.f2523o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final j1 getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f2708b;
    }

    @Override // d7.InterfaceC1637j
    public AbstractC2538c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && j1.m1152K(3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        C2539d c2539d = new C2539d(0);
        LinkedHashMap linkedHashMap = c2539d.f13868a;
        if (application != null) {
            linkedHashMap.put(d7.x0.f8158d, application);
        }
        linkedHashMap.put(d7.q0.f8124a, this);
        linkedHashMap.put(d7.q0.f8125b, this);
        if (getArguments() != null) {
            linkedHashMap.put(d7.q0.f8126c, getArguments());
        }
        return c2539d;
    }

    @Override // d7.InterfaceC1637j
    public d7.y0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && j1.m1152K(3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new d7.t0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f2510b;
    }

    public Object getEnterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f2517i;
    }

    public AbstractC6127t getEnterTransitionCallback() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public int getExitAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f2511c;
    }

    public Object getExitTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f2519k;
    }

    public AbstractC6127t getExitTransitionCallback() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        f0Var.getClass();
        return null;
    }

    public View getFocusedView() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f2526r;
    }

    @Deprecated
    public final j1 getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return ((n0) u0Var).f2643e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // d7.InterfaceC1649u
    public AbstractC1646r getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public AbstractC3594a getLoaderManager() {
        return AbstractC3594a.m8158a(this);
    }

    public int getNextTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f2514f;
    }

    public final j0 getParentFragment() {
        return this.mParentFragment;
    }

    public final j1 getParentFragmentManager() {
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return false;
        }
        return f0Var.f2509a;
    }

    public int getPopEnterAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f2512d;
    }

    public int getPopExitAnim() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 0;
        }
        return f0Var.f2513e;
    }

    public float getPostOnViewCreatedAlpha() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return 1.0f;
        }
        return f0Var.f2525q;
    }

    public Object getReenterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f2520l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        C8564b c8564b = AbstractC8565c.f41561a;
        AbstractC8565c.m15832b(new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this));
        AbstractC8565c.m15831a(this).getClass();
        EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f2518j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // g8.InterfaceC2547g
    public final C2545e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f13877b;
    }

    public Object getSharedElementEnterTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f2521m;
    }

    public Object getSharedElementReturnTransition() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return null;
        }
        Object obj = f0Var.f2522n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        f0 f0Var = this.mAnimationInfo;
        return (f0Var == null || (arrayList = f0Var.f2515g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        f0 f0Var = this.mAnimationInfo;
        return (f0Var == null || (arrayList = f0Var.f2516h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final j0 getTargetFragment() {
        return m1147f(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        C8564b c8564b = AbstractC8565c.f41561a;
        AbstractC8565c.m15832b(new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this));
        AbstractC8565c.m15831a(this).getClass();
        EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public InterfaceC1649u getViewLifecycleOwner() {
        d2 d2Var = this.mViewLifecycleOwner;
        if (d2Var != null) {
            return d2Var;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public d7.d0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // d7.c1
    public d7.b1 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m1146e() == EnumC1645q.INITIALIZED.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.mFragmentManager.f2577O.f2647d;
        d7.b1 b1Var = (d7.b1) map.get(this.mWho);
        if (b1Var != null) {
            return b1Var;
        }
        d7.b1 b1Var2 = new d7.b1();
        map.put(this.mWho, b1Var2);
        return b1Var2;
    }

    /* renamed from: h */
    public final C0360y m1149h(AbstractC3064a abstractC3064a, InterfaceC6409a interfaceC6409a, InterfaceC2750b interfaceC2750b) {
        if (this.mState > 1) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        e0 e0Var = new e0(this, interfaceC6409a, atomicReference, abstractC3064a, interfaceC2750b);
        if (this.mState >= 0) {
            e0Var.mo1095a();
        } else {
            this.mOnPreAttachedListeners.add(e0Var);
        }
        return new C0360y(atomicReference);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m1148g();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new k1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            j0 j0Var = this.mParentFragment;
            j1Var.getClass();
            if (j0Var == null ? false : j0Var.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            j0 j0Var = this.mParentFragment;
            if (!(j0Var == null ? true : j0Var.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        f0 f0Var = this.mAnimationInfo;
        if (f0Var == null) {
            return false;
        }
        return f0Var.f2527s;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null) {
            return false;
        }
        return j1Var.m1164O();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m1166Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (j1.m1152K(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        o0 o0Var = u0Var == null ? null : u0Var.f2707a;
        if (o0Var != null) {
            this.mCalled = false;
            onAttach((Activity) o0Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        j1 j1Var = this.mChildFragmentManager;
        if (j1Var.f2600v >= 1) {
            return;
        }
        j1Var.f2570H = false;
        j1Var.f2571I = false;
        j1Var.f2577O.f2650g = false;
        j1Var.m1196u(1);
    }

    public Animation onCreateAnimation(int i10, boolean z6, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z6, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        o0 o0Var = u0Var == null ? null : u0Var.f2707a;
        if (o0Var != null) {
            this.mCalled = false;
            onInflate((Activity) o0Var, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m1166Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (j1.m1152K(3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        j1 j1Var = this.mChildFragmentManager;
        j1Var.f2570H = false;
        j1Var.f2571I = false;
        j1Var.f2577O.f2650g = false;
        j1Var.m1196u(4);
    }

    public void performAttach() {
        ArrayList<g0> arrayList = this.mOnPreAttachedListeners;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            g0 g0Var = arrayList.get(i10);
            i10++;
            g0Var.mo1095a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m1177b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f2708b);
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onAttach()"));
        }
        j1 j1Var = this.mFragmentManager;
        Iterator it = j1Var.f2594p.iterator();
        while (it.hasNext()) {
            ((o1) it.next()).mo1121a(j1Var, this);
        }
        j1 j1Var2 = this.mChildFragmentManager;
        j1Var2.f2570H = false;
        j1Var2.f2571I = false;
        j1Var2.f2577O.f2650g = false;
        j1Var2.m1196u(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m1185j(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m1166Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo5343a(new c0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.m5355g(EnumC1644p.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z6 = true;
        }
        return this.mChildFragmentManager.m1186k(menu, menuInflater) | z6;
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m1166Q();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new d2(this, getViewModelStore(), new RunnableC0359x(0, this));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f2495e != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m1129b();
        if (j1.m1152K(3)) {
            Objects.toString(this.mView);
            toString();
        }
        d7.q0.m5341h(this.mView, this.mViewLifecycleOwner);
        d7.q0.m5342i(this.mView, this.mViewLifecycleOwner);
        gg.m10676c(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.m5321k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m1187l();
        this.mLifecycleRegistry.m5355g(EnumC1644p.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m1196u(1);
        if (this.mView != null) {
            d2 d2Var = this.mViewLifecycleOwner;
            d2Var.m1129b();
            if (d2Var.f2495e.f8148c.isAtLeast(EnumC1645q.CREATED)) {
                this.mViewLifecycleOwner.m1128a(EnumC1644p.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        e1.v0 v0Var = AbstractC3594a.m8158a(this).f19223b.f19220b;
        int iM5649f = v0Var.m5649f();
        for (int i10 = 0; i10 < iM5649f; i10++) {
            ((C3595b) v0Var.m5650g(i10)).m8159l();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onDetach()"));
        }
        j1 j1Var = this.mChildFragmentManager;
        if (j1Var.f2572J) {
            return;
        }
        j1Var.m1187l();
        this.mChildFragmentManager = new k1();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z6) {
        onMultiWindowModeChanged(z6);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m1191p(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m1192q(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m1196u(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1128a(EnumC1644p.ON_PAUSE);
        }
        this.mLifecycleRegistry.m5355g(EnumC1644p.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z6) {
        onPictureInPictureModeChanged(z6);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z6 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z6 = true;
        }
        return this.mChildFragmentManager.m1195t(menu) | z6;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zM1154N = j1.m1154N(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zM1154N) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zM1154N);
            onPrimaryNavigationFragmentChanged(zM1154N);
            j1 j1Var = this.mChildFragmentManager;
            j1Var.e0();
            j1Var.m1193r(j1Var.f2604z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m1166Q();
        this.mChildFragmentManager.m1201z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onResume()"));
        }
        C1651w c1651w = this.mLifecycleRegistry;
        EnumC1644p enumC1644p = EnumC1644p.ON_RESUME;
        c1651w.m5355g(enumC1644p);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f2495e.m5355g(enumC1644p);
        }
        j1 j1Var = this.mChildFragmentManager;
        j1Var.f2570H = false;
        j1Var.f2571I = false;
        j1Var.f2577O.f2650g = false;
        j1Var.m1196u(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.m1166Q();
        this.mChildFragmentManager.m1201z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onStart()"));
        }
        C1651w c1651w = this.mLifecycleRegistry;
        EnumC1644p enumC1644p = EnumC1644p.ON_START;
        c1651w.m5355g(enumC1644p);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f2495e.m5355g(enumC1644p);
        }
        j1 j1Var = this.mChildFragmentManager;
        j1Var.f2570H = false;
        j1Var.f2571I = false;
        j1Var.f2577O.f2650g = false;
        j1Var.m1196u(5);
    }

    public void performStop() {
        j1 j1Var = this.mChildFragmentManager;
        j1Var.f2571I = true;
        j1Var.f2577O.f2650g = true;
        j1Var.m1196u(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1128a(EnumC1644p.ON_STOP);
        }
        this.mLifecycleRegistry.m5355g(EnumC1644p.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.m1196u(2);
    }

    public void postponeEnterTransition() {
        m1145d().f2527s = true;
    }

    public final <I, O> AbstractC2751c registerForActivityResult(AbstractC3064a abstractC3064a, InterfaceC2750b interfaceC2750b) {
        return m1149h(abstractC3064a, new d0(0, this), interfaceC2750b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to Activity"));
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f2567E == null) {
            parentFragmentManager.f2601w.getClass();
            AbstractC4154l.m8923f(permissions, "permissions");
        } else {
            parentFragmentManager.f2568F.addLast(new e1(this.mWho, i10));
            parentFragmentManager.f2567E.mo1274a(permissions);
        }
    }

    public final o0 requireActivity() {
        o0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final j1 requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to a host."));
    }

    public final j0 requireParentFragment() {
        j0 parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.m1172W(bundle);
        j1 j1Var = this.mChildFragmentManager;
        j1Var.f2570H = false;
        j1Var.f2571I = false;
        j1Var.f2577O.f2650g = false;
        j1Var.m1196u(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new o2(AbstractC0030c.m119j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m1128a(EnumC1644p.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z6) {
        m1145d().f2524p = Boolean.valueOf(z6);
    }

    public void setAllowReturnTransitionOverlap(boolean z6) {
        m1145d().f2523o = Boolean.valueOf(z6);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        m1145d().f2510b = i10;
        m1145d().f2511c = i11;
        m1145d().f2512d = i12;
        m1145d().f2513e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(AbstractC6127t abstractC6127t) {
        m1145d().getClass();
    }

    public void setEnterTransition(Object obj) {
        m1145d().f2517i = obj;
    }

    public void setExitSharedElementCallback(AbstractC6127t abstractC6127t) {
        m1145d().getClass();
    }

    public void setExitTransition(Object obj) {
        m1145d().f2519k = obj;
    }

    public void setFocusedView(View view) {
        m1145d().f2526r = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z6) {
        if (this.mHasMenu != z6) {
            this.mHasMenu = z6;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((n0) this.mHost).f2643e.invalidateMenu();
        }
    }

    public void setInitialSavedState(i0 i0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (i0Var == null || (bundle = i0Var.f2558a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z6) {
        if (this.mMenuVisible != z6) {
            this.mMenuVisible = z6;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((n0) this.mHost).f2643e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        m1145d();
        this.mAnimationInfo.f2514f = i10;
    }

    public void setPopDirection(boolean z6) {
        if (this.mAnimationInfo == null) {
            return;
        }
        m1145d().f2509a = z6;
    }

    public void setPostOnViewCreatedAlpha(float f6) {
        m1145d().f2525q = f6;
    }

    public void setReenterTransition(Object obj) {
        m1145d().f2520l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z6) {
        C8564b c8564b = AbstractC8565c.f41561a;
        AbstractC8565c.m15832b(new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this));
        AbstractC8565c.m15831a(this).getClass();
        EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        this.mRetainInstance = z6;
        j1 j1Var = this.mFragmentManager;
        if (j1Var == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z6) {
            j1Var.f2577O.m1210e(this);
        } else {
            j1Var.f2577O.m1212g(this);
        }
    }

    public void setReturnTransition(Object obj) {
        m1145d().f2518j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        m1145d().f2521m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        m1145d();
        f0 f0Var = this.mAnimationInfo;
        f0Var.f2515g = arrayList;
        f0Var.f2516h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        m1145d().f2522n = obj;
    }

    @Deprecated
    public void setTargetFragment(j0 j0Var, int i10) {
        if (j0Var != null) {
            C8564b c8564b = AbstractC8565c.f41561a;
            AbstractC8565c.m15832b(new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + j0Var + " with request code " + i10 + " for fragment " + this));
            AbstractC8565c.m15831a(this).getClass();
            EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        }
        j1 j1Var = this.mFragmentManager;
        j1 j1Var2 = j0Var != null ? j0Var.mFragmentManager : null;
        if (j1Var != null && j1Var2 != null && j1Var != j1Var2) {
            throw new IllegalArgumentException(AbstractC0030c.m119j("Fragment ", j0Var, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (j0 j0VarM1147f = j0Var; j0VarM1147f != null; j0VarM1147f = j0VarM1147f.m1147f(false)) {
            if (j0VarM1147f.equals(this)) {
                throw new IllegalArgumentException("Setting " + j0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (j0Var == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || j0Var.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = j0Var;
        } else {
            this.mTargetWho = j0Var.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z6) {
        C8564b c8564b = AbstractC8565c.f41561a;
        AbstractC8565c.m15832b(new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z6 + " for fragment " + this));
        AbstractC8565c.m15831a(this).getClass();
        EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        boolean z10 = false;
        if (!this.mUserVisibleHint && z6 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            j1 j1Var = this.mFragmentManager;
            s1 s1VarM1182g = j1Var.m1182g(this);
            j0 j0Var = s1VarM1182g.f2696c;
            if (j0Var.mDeferStart) {
                if (j1Var.f2580b) {
                    j1Var.f2573K = true;
                } else {
                    j0Var.mDeferStart = false;
                    s1VarM1182g.m1254i();
                }
            }
        }
        this.mUserVisibleHint = z6;
        if (this.mState < 5 && !z6) {
            z10 = true;
        }
        this.mDeferStart = z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z6);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return false;
        }
        o0 o0Var = ((n0) u0Var).f2643e;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i10 >= 32) {
            return o0Var.shouldShowRequestPermissionRationale(str);
        }
        if (i10 != 31) {
            return o0Var.shouldShowRequestPermissionRationale(str);
        }
        try {
            return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(o0Var.getApplication().getPackageManager(), str)).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return o0Var.shouldShowRequestPermissionRationale(str);
        }
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int i10, Intent intent2, int i11, int i12, int i13, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to Activity"));
        }
        if (j1.m1152K(2)) {
            toString();
            Objects.toString(intent);
            Objects.toString(intent2);
            Objects.toString(bundle);
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f2566D == null) {
            u0 u0Var = parentFragmentManager.f2601w;
            u0Var.getClass();
            AbstractC4154l.m8923f(intent, "intent");
            if (i10 != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            o0 o0Var = u0Var.f2707a;
            if (o0Var == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            o0Var.startIntentSenderForResult(intent, i10, intent2, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (j1.m1152K(2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        AbstractC4154l.m8923f(intent, "intentSender");
        C2759k c2759k = new C2759k(intent, intent2, i11, i12);
        parentFragmentManager.f2568F.addLast(new e1(this.mWho, i10));
        if (j1.m1152K(2)) {
            toString();
        }
        parentFragmentManager.f2566D.mo1274a(c2759k);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !m1145d().f2527s) {
            return;
        }
        if (this.mHost == null) {
            m1145d().f2527s = false;
        } else if (Looper.myLooper() != this.mHost.f2709c.getLooper()) {
            this.mHost.f2709c.postAtFrontOfQueue(new RunnableC0361z(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static j0 instantiate(Context context, String str, Bundle bundle) {
        try {
            j0 j0Var = (j0) b1.m1118c(str, context.getClassLoader()).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return j0Var;
            }
            bundle.setClassLoader(j0Var.getClass().getClassLoader());
            j0Var.setArguments(bundle);
            return j0Var;
        } catch (IllegalAccessException e2) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e10) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (NoSuchMethodException e11) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e11);
        } catch (InvocationTargetException e12) {
            throw new Fragment$InstantiationException(AbstractC5601a.m11238i("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e12);
        }
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final void postponeEnterTransition(long j6, TimeUnit timeUnit) {
        m1145d().f2527s = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null) {
            this.mPostponedHandler = j1Var.f2601w.f2709c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j6));
    }

    public final <I, O> AbstractC2751c registerForActivityResult(AbstractC3064a abstractC3064a, AbstractC2757i abstractC2757i, InterfaceC2750b interfaceC2750b) {
        return m1149h(abstractC3064a, new d0(1, abstractC2757i), interfaceC2750b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to Activity"));
        }
        AbstractC4154l.m8923f(intent, "intent");
        u0Var.f2708b.startActivity(intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(AbstractC0030c.m119j("Fragment ", this, " not attached to Activity"));
        }
        j1 parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f2565C != null) {
            parentFragmentManager.f2568F.addLast(new e1(this.mWho, i10));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f2565C.mo1274a(intent);
            return;
        }
        u0 u0Var = parentFragmentManager.f2601w;
        u0Var.getClass();
        AbstractC4154l.m8923f(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        u0Var.f2708b.startActivity(intent, bundle);
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var != null) {
            o0 o0Var = ((n0) u0Var).f2643e;
            LayoutInflater layoutInflaterCloneInContext = o0Var.getLayoutInflater().cloneInContext(o0Var);
            layoutInflaterCloneInContext.setFactory2(this.mChildFragmentManager.f2584f);
            return layoutInflaterCloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public void onAttachFragment(j0 j0Var) {
    }

    public void onHiddenChanged(boolean z6) {
    }

    public void onMultiWindowModeChanged(boolean z6) {
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z6) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z6) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }
}
