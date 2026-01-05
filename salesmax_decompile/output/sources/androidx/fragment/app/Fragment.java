package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
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
import androidx.lifecycle.AbstractC2139h;
import androidx.lifecycle.AbstractC2145n;
import androidx.lifecycle.AbstractC2154w;
import androidx.lifecycle.C2144m;
import androidx.lifecycle.C2155x;
import androidx.lifecycle.InterfaceC2137f;
import androidx.lifecycle.InterfaceC2142k;
import androidx.lifecycle.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p001o.aha;
import p001o.bh7;
import p001o.f1f;
import p001o.g1f;
import p001o.h1f;
import p001o.hi7;
import p001o.hpb;
import p001o.ks;
import p001o.kxi;
import p001o.lxi;
import p001o.ns;
import p001o.oh7;
import p001o.os;
import p001o.qg7;
import p001o.rzi;
import p001o.sh9;
import p001o.tzi;
import p001o.ucg;
import p001o.uzi;
import p001o.wob;
import p001o.ws;
import p001o.xca;
import p001o.xs;
import p001o.ya4;
import p001o.ylf;
import p001o.ys;
import p001o.zl7;

/* loaded from: classes2.dex */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, xca, lxi, InterfaceC2137f, h1f {
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
    C2088k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    b0.InterfaceC2131c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    bh7 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    LayoutInflater mLayoutInflater;
    C2144m mLifecycleRegistry;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    g1f mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    boolean mTransitioning;
    View mView;
    C2125k mViewLifecycleOwner;
    int mState = -1;
    String mWho = UUID.randomUUID().toString();
    String mTargetWho = null;
    private Boolean mIsPrimaryNavigationFragment = null;
    FragmentManager mChildFragmentManager = new oh7();
    boolean mMenuVisible = true;
    boolean mUserVisibleHint = true;
    Runnable mPostponedDurationRunnable = new RunnableC2079b();
    AbstractC2139h.b mMaxState = AbstractC2139h.b.RESUMED;
    hpb mViewLifecycleOwnerLiveData = new hpb();
    private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
    private final ArrayList<AbstractC2090m> mOnPreAttachedListeners = new ArrayList<>();
    private final AbstractC2090m mSavedStateAttachListener = new C2080c();

    /* renamed from: androidx.fragment.app.Fragment$a */
    public class C2078a extends ws {

        /* renamed from: a */
        public final /* synthetic */ AtomicReference f7349a;

        /* renamed from: b */
        public final /* synthetic */ os f7350b;

        public C2078a(AtomicReference atomicReference, os osVar) {
            this.f7349a = atomicReference;
            this.f7350b = osVar;
        }

        @Override // p001o.ws
        /* renamed from: a */
        public os mo6147a() {
            return this.f7350b;
        }

        @Override // p001o.ws
        /* renamed from: c */
        public void mo6148c(Object obj, ks ksVar) {
            ws wsVar = (ws) this.f7349a.get();
            if (wsVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            wsVar.mo6148c(obj, ksVar);
        }

        @Override // p001o.ws
        /* renamed from: d */
        public void mo6149d() {
            ws wsVar = (ws) this.f7349a.getAndSet(null);
            if (wsVar != null) {
                wsVar.mo6149d();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    public class RunnableC2079b implements Runnable {
        public RunnableC2079b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    public class C2080c extends AbstractC2090m {
        public C2080c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.AbstractC2090m
        /* renamed from: a */
        public void mo6150a() {
            Fragment.this.mSavedStateRegistryController.m27977c();
            AbstractC2154w.m6598c(Fragment.this);
            Bundle bundle = Fragment.this.mSavedFragmentState;
            Fragment.this.mSavedStateRegistryController.m27978d(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    public class RunnableC2081d implements Runnable {
        public RunnableC2081d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public class RunnableC2082e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC2126l f7355a;

        public RunnableC2082e(AbstractC2126l abstractC2126l) {
            this.f7355a = abstractC2126l;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7355a.m6464y()) {
                this.f7355a.m6455n();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    public class C2083f extends qg7 {
        public C2083f() {
        }

        @Override // p001o.qg7
        /* renamed from: c */
        public View mo6142c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // p001o.qg7
        /* renamed from: d */
        public boolean mo6143d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    public class C2084g implements InterfaceC2142k {
        public C2084g() {
        }

        @Override // androidx.lifecycle.InterfaceC2142k
        /* renamed from: o */
        public void mo3717o(xca xcaVar, AbstractC2139h.a aVar) {
            View view;
            if (aVar != AbstractC2139h.a.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    public class C2085h implements zl7 {
        public C2085h() {
        }

        @Override // p001o.zl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public xs apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof ys ? ((ys) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    public class C2086i implements zl7 {

        /* renamed from: a */
        public final /* synthetic */ xs f7360a;

        public C2086i(xs xsVar) {
            this.f7360a = xsVar;
        }

        @Override // p001o.zl7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public xs apply(Void r1) {
            return this.f7360a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$j */
    public class C2087j extends AbstractC2090m {

        /* renamed from: a */
        public final /* synthetic */ zl7 f7362a;

        /* renamed from: b */
        public final /* synthetic */ AtomicReference f7363b;

        /* renamed from: c */
        public final /* synthetic */ os f7364c;

        /* renamed from: d */
        public final /* synthetic */ ns f7365d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2087j(zl7 zl7Var, AtomicReference atomicReference, os osVar, ns nsVar) {
            super(null);
            this.f7362a = zl7Var;
            this.f7363b = atomicReference;
            this.f7364c = osVar;
            this.f7365d = nsVar;
        }

        @Override // androidx.fragment.app.Fragment.AbstractC2090m
        /* renamed from: a */
        public void mo6150a() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f7363b.set(((xs) this.f7362a.apply(null)).m56741j(strGenerateActivityResultKey, Fragment.this, this.f7364c, this.f7365d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$k */
    public static class C2088k {

        /* renamed from: a */
        public View f7367a;

        /* renamed from: b */
        public boolean f7368b;

        /* renamed from: c */
        public int f7369c;

        /* renamed from: d */
        public int f7370d;

        /* renamed from: e */
        public int f7371e;

        /* renamed from: f */
        public int f7372f;

        /* renamed from: g */
        public int f7373g;

        /* renamed from: h */
        public ArrayList f7374h;

        /* renamed from: i */
        public ArrayList f7375i;

        /* renamed from: j */
        public Object f7376j = null;

        /* renamed from: k */
        public Object f7377k;

        /* renamed from: l */
        public Object f7378l;

        /* renamed from: m */
        public Object f7379m;

        /* renamed from: n */
        public Object f7380n;

        /* renamed from: o */
        public Object f7381o;

        /* renamed from: p */
        public Boolean f7382p;

        /* renamed from: q */
        public Boolean f7383q;

        /* renamed from: r */
        public float f7384r;

        /* renamed from: s */
        public View f7385s;

        /* renamed from: t */
        public boolean f7386t;

        public C2088k() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f7377k = obj;
            this.f7378l = null;
            this.f7379m = obj;
            this.f7380n = null;
            this.f7381o = obj;
            this.f7384r = 1.0f;
            this.f7385s = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$l */
    public static class C2089l extends RuntimeException {
        public C2089l(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$m */
    public static abstract class AbstractC2090m {
        public AbstractC2090m() {
        }

        public /* synthetic */ AbstractC2090m(RunnableC2079b runnableC2079b) {
            this();
        }

        /* renamed from: a */
        public abstract void mo6150a();
    }

    public Fragment() {
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B0() {
        this.mViewLifecycleOwner.m6434d(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    public final void A0() {
        this.mLifecycleRegistry = new C2144m(this);
        this.mSavedStateRegistryController = g1f.m27975a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        D0(this.mSavedStateAttachListener);
    }

    public final ws C0(os osVar, zl7 zl7Var, ns nsVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            D0(new C2087j(zl7Var, atomicReference, osVar, nsVar));
            return new C2078a(atomicReference, osVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    public final void D0(AbstractC2090m abstractC2090m) {
        if (this.mState >= 0) {
            abstractC2090m.mo6150a();
        } else {
            this.mOnPreAttachedListeners.add(abstractC2090m);
        }
    }

    public final void E0() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k != null) {
            c2088k.f7386t = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        AbstractC2126l abstractC2126lM6441u = AbstractC2126l.m6441u(viewGroup, fragmentManager);
        abstractC2126lM6441u.m6465z();
        if (z) {
            this.mHost.m18968h().post(new RunnableC2082e(abstractC2126lM6441u));
        } else {
            abstractC2126lM6441u.m6455n();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public qg7 createFragmentContainer() {
        return new C2083f();
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
        Fragment fragmentZ0 = z0(false);
        if (fragmentZ0 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentZ0);
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
            aha.m17056b(this).mo17057a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.m6196Z(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.n0(str);
    }

    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        bh7 bh7Var = this.mHost;
        if (bh7Var == null) {
            return null;
        }
        return (FragmentActivity) bh7Var.m18965e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null || (bool = c2088k.f7383q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null || (bool = c2088k.f7382p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        return c2088k.f7367a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        bh7 bh7Var = this.mHost;
        if (bh7Var == null) {
            return null;
        }
        return bh7Var.m18966f();
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public ya4 getDefaultViewModelCreationExtras() {
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
        if (application == null && FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Application instance from Context ");
            sb.append(requireContext().getApplicationContext());
            sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        wob wobVar = new wob();
        if (application != null) {
            wobVar.m54753c(b0.C2129a.f7658h, application);
        }
        wobVar.m54753c(AbstractC2154w.f7762a, this);
        wobVar.m54753c(AbstractC2154w.f7763b, this);
        if (getArguments() != null) {
            wobVar.m54753c(AbstractC2154w.f7764c, getArguments());
        }
        return wobVar;
    }

    @Override // androidx.lifecycle.InterfaceC2137f
    public b0.InterfaceC2131c getDefaultViewModelProviderFactory() {
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
            if (application == null && FragmentManager.P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find Application instance from Context ");
                sb.append(requireContext().getApplicationContext());
                sb.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new C2155x(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 0;
        }
        return c2088k.f7369c;
    }

    public Object getEnterTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        return c2088k.f7376j;
    }

    public ylf getEnterTransitionCallback() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        c2088k.getClass();
        return null;
    }

    public int getExitAnim() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 0;
        }
        return c2088k.f7370d;
    }

    public Object getExitTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        return c2088k.f7378l;
    }

    public ylf getExitTransitionCallback() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        c2088k.getClass();
        return null;
    }

    public View getFocusedView() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        return c2088k.f7385s;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        bh7 bh7Var = this.mHost;
        if (bh7Var == null) {
            return null;
        }
        return bh7Var.mo6155j();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // p001o.xca
    public AbstractC2139h getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public aha getLoaderManager() {
        return aha.m17056b(this);
    }

    public int getNextTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 0;
        }
        return c2088k.f7373g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return false;
        }
        return c2088k.f7368b;
    }

    public int getPopEnterAnim() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 0;
        }
        return c2088k.f7371e;
    }

    public int getPopExitAnim() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 0;
        }
        return c2088k.f7372f;
    }

    public float getPostOnViewCreatedAlpha() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return 1.0f;
        }
        return c2088k.f7384r;
    }

    public Object getReenterTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        Object obj = c2088k.f7379m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        hi7.m30614h(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        Object obj = c2088k.f7377k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // p001o.h1f
    public final f1f getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m27976b();
    }

    public Object getSharedElementEnterTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        return c2088k.f7380n;
    }

    public Object getSharedElementReturnTransition() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return null;
        }
        Object obj = c2088k.f7381o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C2088k c2088k = this.mAnimationInfo;
        return (c2088k == null || (arrayList = c2088k.f7374h) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C2088k c2088k = this.mAnimationInfo;
        return (c2088k == null || (arrayList = c2088k.f7375i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return z0(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        hi7.m30615i(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public xca getViewLifecycleOwner() {
        C2125k c2125k = this.mViewLifecycleOwner;
        if (c2125k != null) {
            return c2125k;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public AbstractC2145n getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // p001o.lxi
    public kxi getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (y0() != AbstractC2139h.b.INITIALIZED.ordinal()) {
            return this.mFragmentManager.K0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        A0();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new oh7();
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
        FragmentManager fragmentManager;
        return this.mHidden || ((fragmentManager = this.mFragmentManager) != null && fragmentManager.S0(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.T0(this.mParentFragment));
    }

    public boolean isPostponed() {
        C2088k c2088k = this.mAnimationInfo;
        if (c2088k == null) {
            return false;
        }
        return c2088k.f7386t;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.W0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.h1();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        bh7 bh7Var = this.mHost;
        Activity activityM18965e = bh7Var == null ? null : bh7Var.m18965e();
        if (activityM18965e != null) {
            this.mCalled = false;
            onAttach(activityM18965e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
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
        if (this.mChildFragmentManager.V0(1)) {
            return;
        }
        this.mChildFragmentManager.m6175E();
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
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

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        bh7 bh7Var = this.mHost;
        Activity activityM18965e = bh7Var == null ? null : bh7Var.m18965e();
        if (activityM18965e != null) {
            this.mCalled = false;
            onInflate(activityM18965e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            E0();
            this.mChildFragmentManager.m6171A();
        } else {
            throw new ucg("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public void performAttach() {
        Iterator<AbstractC2090m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo6150a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m6203o(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m18966f());
        if (this.mCalled) {
            this.mFragmentManager.m6181K(this);
            this.mChildFragmentManager.m6172B();
        } else {
            throw new ucg("Fragment " + this + " did not call through to super.onAttach()");
        }
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
        return this.mChildFragmentManager.m6174D(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo6521a(new C2084g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m6538i(AbstractC2139h.a.ON_CREATE);
            return;
        }
        throw new ucg("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m6176F(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.h1();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new C2125k(this, getViewModelStore(), new Runnable() { // from class: o.wf7
            @Override // java.lang.Runnable
            public final void run() {
                this.f51902a.B0();
            }
        });
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.m6433c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.m6432b();
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting ViewLifecycleOwner on View ");
            sb.append(this.mView);
            sb.append(" for Fragment ");
            sb.append(this);
        }
        rzi.m47366b(this.mView, this.mViewLifecycleOwner);
        uzi.m52200a(this.mView, this.mViewLifecycleOwner);
        tzi.m50817b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m6177G();
        this.mLifecycleRegistry.m6538i(AbstractC2139h.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new ucg("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m6178H();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo6522b().isAtLeast(AbstractC2139h.b.CREATED)) {
            this.mViewLifecycleOwner.m6431a(AbstractC2139h.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            aha.m17056b(this).mo17059d();
            this.mPerformedCreateView = false;
        } else {
            throw new ucg("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.O0()) {
                return;
            }
            this.mChildFragmentManager.m6177G();
            this.mChildFragmentManager = new oh7();
            return;
        }
        throw new ucg("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.m6183M(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.m6184N(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.m6186P();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m6431a(AbstractC2139h.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.m6538i(AbstractC2139h.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new ucg("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m6188R(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean zU0 = this.mFragmentManager.U0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zU0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zU0);
            onPrimaryNavigationFragmentChanged(zU0);
            this.mChildFragmentManager.m6189S();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.d0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new ucg("Fragment " + this + " did not call through to super.onResume()");
        }
        C2144m c2144m = this.mLifecycleRegistry;
        AbstractC2139h.a aVar = AbstractC2139h.a.ON_RESUME;
        c2144m.m6538i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m6431a(aVar);
        }
        this.mChildFragmentManager.m6190T();
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.h1();
        this.mChildFragmentManager.d0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new ucg("Fragment " + this + " did not call through to super.onStart()");
        }
        C2144m c2144m = this.mLifecycleRegistry;
        AbstractC2139h.a aVar = AbstractC2139h.a.ON_START;
        c2144m.m6538i(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m6431a(aVar);
        }
        this.mChildFragmentManager.m6191U();
    }

    public void performStop() {
        this.mChildFragmentManager.m6193W();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m6431a(AbstractC2139h.a.ON_STOP);
        }
        this.mLifecycleRegistry.m6538i(AbstractC2139h.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new ucg("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.m6194X();
    }

    public void postponeEnterTransition() {
        x0().f7386t = true;
    }

    public final <I, O> ws registerForActivityResult(os osVar, ns nsVar) {
        return C0(osVar, new C2085h(), nsVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().d1(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.B1(bundle);
        this.mChildFragmentManager.m6175E();
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m6431a(AbstractC2139h.a.ON_CREATE);
            }
        } else {
            throw new ucg("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        x0().f7383q = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        x0().f7382p = Boolean.valueOf(z);
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        x0().f7369c = i;
        x0().f7370d = i2;
        x0().f7371e = i3;
        x0().f7372f = i4;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(ylf ylfVar) {
        x0().getClass();
    }

    public void setEnterTransition(Object obj) {
        x0().f7376j = obj;
    }

    public void setExitSharedElementCallback(ylf ylfVar) {
        x0().getClass();
    }

    public void setExitTransition(Object obj) {
        x0().f7378l = obj;
    }

    public void setFocusedView(View view) {
        x0().f7385s = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.mo6158p();
        }
    }

    public void setInitialSavedState(SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f7348a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo6158p();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        x0();
        this.mAnimationInfo.f7373g = i;
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        x0().f7368b = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        x0().f7384r = f;
    }

    public void setReenterTransition(Object obj) {
        x0().f7379m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        hi7.m30617k(this);
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z) {
            fragmentManager.m6201m(this);
        } else {
            fragmentManager.x1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        x0().f7377k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        x0().f7380n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        x0();
        C2088k c2088k = this.mAnimationInfo;
        c2088k.f7374h = arrayList;
        c2088k.f7375i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        x0().f7381o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        if (fragment != null) {
            hi7.m30618l(this, fragment, i);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragmentZ0 = fragment; fragmentZ0 != null; fragmentZ0 = fragmentZ0.z0(false)) {
            if (fragmentZ0.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        hi7.m30619m(this, z);
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.j1(fragmentManager.m6213y(this));
        }
        this.mUserVisibleHint = z;
        this.mDeferStart = this.mState < 5 && !z;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        bh7 bh7Var = this.mHost;
        if (bh7Var != null) {
            return bh7Var.mo6157m(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            sb.append(bundle);
        }
        getParentFragmentManager().f1(this, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !x0().f7386t) {
            return;
        }
        if (this.mHost == null) {
            x0().f7386t = false;
        } else if (Looper.myLooper() != this.mHost.m18968h().getLooper()) {
            this.mHost.m18968h().postAtFrontOfQueue(new RunnableC2081d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    public final C2088k x0() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C2088k();
        }
        return this.mAnimationInfo;
    }

    public final int y0() {
        AbstractC2139h.b bVar = this.mMaxState;
        return (bVar == AbstractC2139h.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.y0());
    }

    public final Fragment z0(boolean z) {
        String str;
        if (z) {
            hi7.m30616j(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.i0(str);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2077a();

        /* renamed from: a */
        public final Bundle f7348a;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        public class C2077a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Bundle bundle) {
            this.f7348a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f7348a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f7348a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) AbstractC2118d.m6334d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(bundle);
            }
            return fragment;
        } catch (IllegalAccessException e) {
            throw new C2089l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C2089l("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C2089l("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C2089l("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        x0().f7386t = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.C0().m18968h();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> ws registerForActivityResult(os osVar, xs xsVar, ns nsVar) {
        return C0(osVar, new C2086i(xsVar), nsVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        bh7 bh7Var = this.mHost;
        if (bh7Var != null) {
            bh7Var.m18970n(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().e1(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        bh7 bh7Var = this.mHost;
        if (bh7Var != null) {
            LayoutInflater layoutInflaterMo6156k = bh7Var.mo6156k();
            sh9.m48351a(layoutInflaterMo6156k, this.mChildFragmentManager.D0());
            return layoutInflaterMo6156k;
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
}
