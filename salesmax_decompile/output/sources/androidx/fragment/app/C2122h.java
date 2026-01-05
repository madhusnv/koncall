package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.AbstractC2126l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC2139h;
import p001o.bh7;
import p001o.hi7;
import p001o.lxi;
import p001o.wvi;
import p001o.y8e;

/* renamed from: androidx.fragment.app.h */
/* loaded from: classes2.dex */
public class C2122h {

    /* renamed from: a */
    public final C2120f f7567a;

    /* renamed from: b */
    public final C2123i f7568b;

    /* renamed from: c */
    public final Fragment f7569c;

    /* renamed from: d */
    public boolean f7570d = false;

    /* renamed from: e */
    public int f7571e = -1;

    /* renamed from: androidx.fragment.app.h$a */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ View f7572a;

        public a(View view) {
            this.f7572a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f7572a.removeOnAttachStateChangeListener(this);
            wvi.j0(this.f7572a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.fragment.app.h$b */
    public static /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7574a;

        static {
            int[] iArr = new int[AbstractC2139h.b.values().length];
            f7574a = iArr;
            try {
                iArr[AbstractC2139h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7574a[AbstractC2139h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7574a[AbstractC2139h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7574a[AbstractC2139h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public C2122h(C2120f c2120f, C2123i c2123i, Fragment fragment) {
        this.f7567a = c2120f;
        this.f7568b = c2123i;
        this.f7569c = fragment;
    }

    /* renamed from: a */
    public void m6368a() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f7569c);
        }
        Bundle bundle = this.f7569c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        this.f7569c.performActivityCreated(bundle2);
        this.f7567a.m6335a(this.f7569c, bundle2, false);
    }

    /* renamed from: b */
    public void m6369b() {
        Fragment fragmentP0 = FragmentManager.p0(this.f7569c.mContainer);
        Fragment parentFragment = this.f7569c.getParentFragment();
        if (fragmentP0 != null && !fragmentP0.equals(parentFragment)) {
            Fragment fragment = this.f7569c;
            hi7.m30621o(fragment, fragmentP0, fragment.mContainerId);
        }
        int iM6401j = this.f7568b.m6401j(this.f7569c);
        Fragment fragment2 = this.f7569c;
        fragment2.mContainer.addView(fragment2.mView, iM6401j);
    }

    /* renamed from: c */
    public void m6370c() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f7569c);
        }
        Fragment fragment = this.f7569c;
        Fragment fragment2 = fragment.mTarget;
        C2122h c2122hM6405n = null;
        if (fragment2 != null) {
            C2122h c2122hM6405n2 = this.f7568b.m6405n(fragment2.mWho);
            if (c2122hM6405n2 == null) {
                throw new IllegalStateException("Fragment " + this.f7569c + " declared target fragment " + this.f7569c.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f7569c;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            c2122hM6405n = c2122hM6405n2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c2122hM6405n = this.f7568b.m6405n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f7569c + " declared target fragment " + this.f7569c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c2122hM6405n != null) {
            c2122hM6405n.m6380m();
        }
        Fragment fragment4 = this.f7569c;
        fragment4.mHost = fragment4.mFragmentManager.C0();
        Fragment fragment5 = this.f7569c;
        fragment5.mParentFragment = fragment5.mFragmentManager.F0();
        this.f7567a.m6341g(this.f7569c, false);
        this.f7569c.performAttach();
        this.f7567a.m6336b(this.f7569c, false);
    }

    /* renamed from: d */
    public int m6371d() {
        Fragment fragment = this.f7569c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f7571e;
        int i = b.f7574a[fragment.mMaxState.ordinal()];
        if (i != 1) {
            iMin = i != 2 ? i != 3 ? i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment2 = this.f7569c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                iMin = Math.max(this.f7571e, 2);
                View view = this.f7569c.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f7571e < 4 ? Math.min(iMin, fragment2.mState) : Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f7569c;
        if (fragment3.mInDynamicContainer && fragment3.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!this.f7569c.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        Fragment fragment4 = this.f7569c;
        ViewGroup viewGroup = fragment4.mContainer;
        AbstractC2126l.d.a aVarM6460s = viewGroup != null ? AbstractC2126l.m6441u(viewGroup, fragment4.getParentFragmentManager()).m6460s(this) : null;
        if (aVarM6460s == AbstractC2126l.d.a.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (aVarM6460s == AbstractC2126l.d.a.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment5 = this.f7569c;
            if (fragment5.mRemoving) {
                iMin = fragment5.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment6 = this.f7569c;
        if (fragment6.mDeferStart && fragment6.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (this.f7569c.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(iMin);
            sb.append(" for ");
            sb.append(this.f7569c);
        }
        return iMin;
    }

    /* renamed from: e */
    public void m6372e() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f7569c);
        }
        Bundle bundle = this.f7569c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        Fragment fragment = this.f7569c;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            this.f7567a.m6342h(fragment, bundle2, false);
            this.f7569c.performCreate(bundle2);
            this.f7567a.m6337c(this.f7569c, bundle2, false);
        }
    }

    /* renamed from: f */
    public void m6373f() throws Resources.NotFoundException {
        String resourceName;
        if (this.f7569c.mFromLayout) {
            return;
        }
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f7569c);
        }
        Bundle bundle = this.f7569c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = this.f7569c.performGetLayoutInflater(bundle2);
        Fragment fragment = this.f7569c;
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.mContainerId;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f7569c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.w0().mo6142c(this.f7569c.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment2 = this.f7569c;
                    if (!fragment2.mRestored && !fragment2.mInDynamicContainer) {
                        try {
                            resourceName = fragment2.getResources().getResourceName(this.f7569c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f7569c.mContainerId) + " (" + resourceName + ") for fragment " + this.f7569c);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    hi7.m30620n(this.f7569c, viewGroup);
                }
            }
        }
        Fragment fragment3 = this.f7569c;
        fragment3.mContainer = viewGroup;
        fragment3.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (this.f7569c.mView != null) {
            if (FragmentManager.P0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("moveto VIEW_CREATED: ");
                sb2.append(this.f7569c);
            }
            this.f7569c.mView.setSaveFromParentEnabled(false);
            Fragment fragment4 = this.f7569c;
            fragment4.mView.setTag(y8e.fragment_container_view_tag, fragment4);
            if (viewGroup != null) {
                m6369b();
            }
            Fragment fragment5 = this.f7569c;
            if (fragment5.mHidden) {
                fragment5.mView.setVisibility(8);
            }
            if (this.f7569c.mView.isAttachedToWindow()) {
                wvi.j0(this.f7569c.mView);
            } else {
                View view = this.f7569c.mView;
                view.addOnAttachStateChangeListener(new a(view));
            }
            this.f7569c.performViewCreated();
            C2120f c2120f = this.f7567a;
            Fragment fragment6 = this.f7569c;
            c2120f.m6347m(fragment6, fragment6.mView, bundle2, false);
            int visibility = this.f7569c.mView.getVisibility();
            this.f7569c.setPostOnViewCreatedAlpha(this.f7569c.mView.getAlpha());
            Fragment fragment7 = this.f7569c;
            if (fragment7.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment7.mView.findFocus();
                if (viewFindFocus != null) {
                    this.f7569c.setFocusedView(viewFindFocus);
                    if (FragmentManager.P0(2)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("requestFocus: Saved focused view ");
                        sb3.append(viewFindFocus);
                        sb3.append(" for Fragment ");
                        sb3.append(this.f7569c);
                    }
                }
                this.f7569c.mView.setAlpha(0.0f);
            }
        }
        this.f7569c.mState = 2;
    }

    /* renamed from: g */
    public void m6374g() {
        Fragment fragmentM6397f;
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f7569c);
        }
        Fragment fragment = this.f7569c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.mRemoving && !fragment.isInBackStack();
        if (z) {
            Fragment fragment2 = this.f7569c;
            if (!fragment2.mBeingSaved) {
                this.f7568b.m6391B(fragment2.mWho, null);
            }
        }
        if (!(z || this.f7568b.m6407p().m6366r(this.f7569c))) {
            String str = this.f7569c.mTargetWho;
            if (str != null && (fragmentM6397f = this.f7568b.m6397f(str)) != null && fragmentM6397f.mRetainInstance) {
                this.f7569c.mTarget = fragmentM6397f;
            }
            this.f7569c.mState = 0;
            return;
        }
        bh7 bh7Var = this.f7569c.mHost;
        if (bh7Var instanceof lxi) {
            zIsChangingConfigurations = this.f7568b.m6407p().m6363o();
        } else if (bh7Var.m18966f() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) bh7Var.m18966f()).isChangingConfigurations();
        }
        if ((z && !this.f7569c.mBeingSaved) || zIsChangingConfigurations) {
            this.f7568b.m6407p().m6356g(this.f7569c, false);
        }
        this.f7569c.performDestroy();
        this.f7567a.m6338d(this.f7569c, false);
        for (C2122h c2122h : this.f7568b.m6402k()) {
            if (c2122h != null) {
                Fragment fragmentM6378k = c2122h.m6378k();
                if (this.f7569c.mWho.equals(fragmentM6378k.mTargetWho)) {
                    fragmentM6378k.mTarget = this.f7569c;
                    fragmentM6378k.mTargetWho = null;
                }
            }
        }
        Fragment fragment3 = this.f7569c;
        String str2 = fragment3.mTargetWho;
        if (str2 != null) {
            fragment3.mTarget = this.f7568b.m6397f(str2);
        }
        this.f7568b.m6410s(this);
    }

    /* renamed from: h */
    public void m6375h() {
        View view;
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f7569c);
        }
        Fragment fragment = this.f7569c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f7569c.performDestroyView();
        this.f7567a.m6348n(this.f7569c, false);
        Fragment fragment2 = this.f7569c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f7569c.mInLayout = false;
    }

    /* renamed from: i */
    public void m6376i() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f7569c);
        }
        this.f7569c.performDetach();
        boolean z = false;
        this.f7567a.m6339e(this.f7569c, false);
        Fragment fragment = this.f7569c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f7568b.m6407p().m6366r(this.f7569c)) {
            if (FragmentManager.P0(3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("initState called for fragment: ");
                sb2.append(this.f7569c);
            }
            this.f7569c.initState();
        }
    }

    /* renamed from: j */
    public void m6377j() {
        Fragment fragment = this.f7569c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.P0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f7569c);
            }
            Bundle bundle = this.f7569c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            Fragment fragment2 = this.f7569c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f7569c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f7569c;
                fragment3.mView.setTag(y8e.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f7569c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f7569c.performViewCreated();
                C2120f c2120f = this.f7567a;
                Fragment fragment5 = this.f7569c;
                c2120f.m6347m(fragment5, fragment5.mView, bundle2, false);
                this.f7569c.mState = 2;
            }
        }
    }

    /* renamed from: k */
    public Fragment m6378k() {
        return this.f7569c;
    }

    /* renamed from: l */
    public final boolean m6379l(View view) {
        if (view == this.f7569c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f7569c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void m6380m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f7570d) {
            if (FragmentManager.P0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(m6378k());
                return;
            }
            return;
        }
        try {
            this.f7570d = true;
            boolean z = false;
            while (true) {
                int iM6371d = m6371d();
                Fragment fragment = this.f7569c;
                int i = fragment.mState;
                if (iM6371d == i) {
                    if (!z && i == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f7569c.mBeingSaved) {
                        if (FragmentManager.P0(3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Cleaning up state of never attached fragment: ");
                            sb2.append(this.f7569c);
                        }
                        this.f7568b.m6407p().m6356g(this.f7569c, true);
                        this.f7568b.m6410s(this);
                        if (FragmentManager.P0(3)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("initState called for fragment: ");
                            sb3.append(this.f7569c);
                        }
                        this.f7569c.initState();
                    }
                    Fragment fragment2 = this.f7569c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            AbstractC2126l abstractC2126lM6441u = AbstractC2126l.m6441u(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f7569c.mHidden) {
                                abstractC2126lM6441u.m6452k(this);
                            } else {
                                abstractC2126lM6441u.m6454m(this);
                            }
                        }
                        Fragment fragment3 = this.f7569c;
                        FragmentManager fragmentManager = fragment3.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.N0(fragment3);
                        }
                        Fragment fragment4 = this.f7569c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f7569c.mChildFragmentManager.m6182L();
                    }
                    return;
                }
                if (iM6371d <= i) {
                    switch (i - 1) {
                        case -1:
                            m6376i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved && this.f7568b.m6408q(fragment.mWho) == null) {
                                this.f7568b.m6391B(this.f7569c.mWho, m6385r());
                            }
                            m6374g();
                            break;
                        case 1:
                            m6375h();
                            this.f7569c.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.P0(3)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("movefrom ACTIVITY_CREATED: ");
                                sb4.append(this.f7569c);
                            }
                            Fragment fragment5 = this.f7569c;
                            if (fragment5.mBeingSaved) {
                                this.f7568b.m6391B(fragment5.mWho, m6385r());
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                m6386s();
                            }
                            Fragment fragment6 = this.f7569c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                AbstractC2126l.m6441u(viewGroup2, fragment6.getParentFragmentManager()).m6453l(this);
                            }
                            this.f7569c.mState = 3;
                            break;
                        case 4:
                            m6389v();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            m6381n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m6370c();
                            break;
                        case 1:
                            m6372e();
                            break;
                        case 2:
                            m6377j();
                            m6373f();
                            break;
                        case 3:
                            m6368a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                AbstractC2126l.m6441u(viewGroup3, fragment.getParentFragmentManager()).m6451j(AbstractC2126l.d.b.from(this.f7569c.mView.getVisibility()), this);
                            }
                            this.f7569c.mState = 4;
                            break;
                        case 5:
                            m6388u();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m6383p();
                            break;
                    }
                }
                z = true;
            }
        } finally {
            this.f7570d = false;
        }
    }

    /* renamed from: n */
    public void m6381n() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f7569c);
        }
        this.f7569c.performPause();
        this.f7567a.m6340f(this.f7569c, false);
    }

    /* renamed from: o */
    public void m6382o(ClassLoader classLoader) {
        Bundle bundle = this.f7569c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f7569c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f7569c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            Fragment fragment = this.f7569c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            Fragment fragment2 = this.f7569c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) this.f7569c.mSavedFragmentState.getParcelable("state");
            if (fragmentState != null) {
                Fragment fragment3 = this.f7569c;
                fragment3.mTargetWho = fragmentState.f7470H;
                fragment3.mTargetRequestCode = fragmentState.f7471L;
                Boolean bool = fragment3.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment3.mUserVisibleHint = bool.booleanValue();
                    this.f7569c.mSavedUserVisibleHint = null;
                } else {
                    fragment3.mUserVisibleHint = fragmentState.f7472M;
                }
            }
            Fragment fragment4 = this.f7569c;
            if (fragment4.mUserVisibleHint) {
                return;
            }
            fragment4.mDeferStart = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + m6378k(), e);
        }
    }

    /* renamed from: p */
    public void m6383p() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f7569c);
        }
        View focusedView = this.f7569c.getFocusedView();
        if (focusedView != null && m6379l(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.P0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f7569c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f7569c.mView.findFocus());
            }
        }
        this.f7569c.setFocusedView(null);
        this.f7569c.performResume();
        this.f7567a.m6343i(this.f7569c, false);
        this.f7568b.m6391B(this.f7569c.mWho, null);
        Fragment fragment = this.f7569c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* renamed from: q */
    public Fragment.SavedState m6384q() {
        if (this.f7569c.mState > -1) {
            return new Fragment.SavedState(m6385r());
        }
        return null;
    }

    /* renamed from: r */
    public Bundle m6385r() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f7569c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new FragmentState(this.f7569c));
        if (this.f7569c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f7569c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f7567a.m6344j(this.f7569c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f7569c.mSavedStateRegistryController.m27979e(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleX0 = this.f7569c.mChildFragmentManager.X0();
            if (!bundleX0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleX0);
            }
            if (this.f7569c.mView != null) {
                m6386s();
            }
            SparseArray<Parcelable> sparseArray = this.f7569c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f7569c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f7569c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    /* renamed from: s */
    public void m6386s() {
        if (this.f7569c.mView == null) {
            return;
        }
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Saving view state for fragment ");
            sb.append(this.f7569c);
            sb.append(" with view ");
            sb.append(this.f7569c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f7569c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f7569c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f7569c.mViewLifecycleOwner.m6435e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f7569c.mSavedViewRegistryState = bundle;
    }

    /* renamed from: t */
    public void m6387t(int i) {
        this.f7571e = i;
    }

    /* renamed from: u */
    public void m6388u() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f7569c);
        }
        this.f7569c.performStart();
        this.f7567a.m6345k(this.f7569c, false);
    }

    /* renamed from: v */
    public void m6389v() {
        if (FragmentManager.P0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f7569c);
        }
        this.f7569c.performStop();
        this.f7567a.m6346l(this.f7569c, false);
    }

    public C2122h(C2120f c2120f, C2123i c2123i, ClassLoader classLoader, AbstractC2118d abstractC2118d, Bundle bundle) {
        this.f7567a = c2120f;
        this.f7568b = c2123i;
        Fragment fragmentM6242a = ((FragmentState) bundle.getParcelable("state")).m6242a(abstractC2118d, classLoader);
        this.f7569c = fragmentM6242a;
        fragmentM6242a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentM6242a.setArguments(bundle2);
        if (FragmentManager.P0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(fragmentM6242a);
        }
    }

    public C2122h(C2120f c2120f, C2123i c2123i, Fragment fragment, Bundle bundle) {
        this.f7567a = c2120f;
        this.f7568b = c2123i;
        this.f7569c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
