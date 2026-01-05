package androidx.fragment.app;

import a2.AbstractC0030c;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.imap.IMAPStore;
import com.sun.mail.util.AbstractC1452a;
import com.websoptimization.callyzerbiz.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import y6.AbstractC8565c;
import y6.C8564b;
import y6.EnumC8563a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a */
    public final p0 f2694a;

    /* renamed from: b */
    public final t1 f2695b;

    /* renamed from: c */
    public final j0 f2696c;

    /* renamed from: d */
    public boolean f2697d = false;

    /* renamed from: e */
    public int f2698e = -1;

    public s1(p0 p0Var, t1 t1Var, j0 j0Var) {
        this.f2694a = p0Var;
        this.f2695b = t1Var;
        this.f2696c = j0Var;
    }

    /* renamed from: a */
    public final void m1246a() {
        View view;
        View view2;
        j0 j0Var = this.f2696c;
        j0 j0VarM1150E = j1.m1150E(j0Var.mContainer);
        j0 parentFragment = j0Var.getParentFragment();
        if (j0VarM1150E != null && !j0VarM1150E.equals(parentFragment)) {
            int i10 = j0Var.mContainerId;
            C8564b c8564b = AbstractC8565c.f41561a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(j0Var);
            sb2.append(" within the view of parent fragment ");
            sb2.append(j0VarM1150E);
            sb2.append(" via container with ID ");
            AbstractC8565c.m15832b(new WrongNestedHierarchyViolation(j0Var, AbstractC5601a.m11233d(i10, " without using parent's childFragmentManager", sb2)));
            AbstractC8565c.m15831a(j0Var).getClass();
            EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
        }
        ArrayList arrayList = this.f2695b.f2702a;
        ViewGroup viewGroup = j0Var.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(j0Var);
            int i11 = iIndexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        j0 j0Var2 = (j0) arrayList.get(iIndexOf);
                        if (j0Var2.mContainer == viewGroup && (view = j0Var2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    j0 j0Var3 = (j0) arrayList.get(i11);
                    if (j0Var3.mContainer == viewGroup && (view2 = j0Var3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        j0Var.mContainer.addView(j0Var.mView, iIndexOfChild);
    }

    /* renamed from: b */
    public final void m1247b() {
        boolean zM1152K = j1.m1152K(3);
        j0 j0Var = this.f2696c;
        if (zM1152K) {
            Objects.toString(j0Var);
        }
        j0 j0Var2 = j0Var.mTarget;
        s1 s1Var = null;
        t1 t1Var = this.f2695b;
        if (j0Var2 != null) {
            s1 s1Var2 = (s1) t1Var.f2703b.get(j0Var2.mWho);
            if (s1Var2 == null) {
                throw new IllegalStateException("Fragment " + j0Var + " declared target fragment " + j0Var.mTarget + " that does not belong to this FragmentManager!");
            }
            j0Var.mTargetWho = j0Var.mTarget.mWho;
            j0Var.mTarget = null;
            s1Var = s1Var2;
        } else {
            String str = j0Var.mTargetWho;
            if (str != null && (s1Var = (s1) t1Var.f2703b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(j0Var);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1452a.m4564k(sb2, j0Var.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (s1Var != null) {
            s1Var.m1254i();
        }
        j1 j1Var = j0Var.mFragmentManager;
        j0Var.mHost = j1Var.f2601w;
        j0Var.mParentFragment = j1Var.f2603y;
        p0 p0Var = this.f2694a;
        p0Var.m1222g(j0Var, false);
        j0Var.performAttach();
        p0Var.m1217b(j0Var, false);
    }

    /* renamed from: c */
    public final int m1248c() {
        j0 j0Var = this.f2696c;
        if (j0Var.mFragmentManager == null) {
            return j0Var.mState;
        }
        int iMin = this.f2698e;
        int i10 = r1.f2688a[j0Var.mMaxState.ordinal()];
        if (i10 != 1) {
            iMin = i10 != 2 ? i10 != 3 ? i10 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (j0Var.mFromLayout) {
            if (j0Var.mInLayout) {
                iMin = Math.max(this.f2698e, 2);
                View view = j0Var.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f2698e < 4 ? Math.min(iMin, j0Var.mState) : Math.min(iMin, 1);
            }
        }
        if (j0Var.mInDynamicContainer && j0Var.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!j0Var.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null) {
            C0352q c0352qM1232j = C0352q.m1232j(viewGroup, j0Var.getParentFragmentManager());
            h2 h2VarM1239g = c0352qM1232j.m1239g(j0Var);
            i2 i2Var = h2VarM1239g != null ? h2VarM1239g.f2546b : null;
            h2 h2VarM1240h = c0352qM1232j.m1240h(j0Var);
            i2Var = h2VarM1240h != null ? h2VarM1240h.f2546b : null;
            int i11 = i2Var == null ? -1 : n2.f2651a[i2Var.ordinal()];
            if (i11 != -1 && i11 != 1) {
                i2Var = i2Var;
            }
        }
        if (i2Var == i2.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (i2Var == i2.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (j0Var.mRemoving) {
            iMin = j0Var.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (j0Var.mDeferStart && j0Var.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (j0Var.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (j1.m1152K(2)) {
            Objects.toString(j0Var);
        }
        return iMin;
    }

    /* renamed from: d */
    public final void m1249d() throws Resources.NotFoundException {
        String resourceName;
        j0 j0Var = this.f2696c;
        if (j0Var.mFromLayout) {
            return;
        }
        if (j1.m1152K(3)) {
            Objects.toString(j0Var);
        }
        Bundle bundle = j0Var.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = j0Var.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = j0Var.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    throw new IllegalArgumentException(AbstractC0030c.m119j("Cannot create fragment ", j0Var, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) j0Var.mFragmentManager.f2602x.mo1115b(i10);
                if (viewGroup == null) {
                    if (!j0Var.mRestored && !j0Var.mInDynamicContainer) {
                        try {
                            resourceName = j0Var.getResources().getResourceName(j0Var.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(j0Var.mContainerId) + " (" + resourceName + ") for fragment " + j0Var);
                    }
                } else if (!(viewGroup instanceof s0)) {
                    C8564b c8564b = AbstractC8565c.f41561a;
                    AbstractC8565c.m15832b(new WrongFragmentContainerViolation(j0Var, "Attempting to add fragment " + j0Var + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC8565c.m15831a(j0Var).getClass();
                    EnumC8563a enumC8563a = EnumC8563a.PENALTY_LOG;
                }
            }
        }
        j0Var.mContainer = viewGroup;
        j0Var.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (j0Var.mView != null) {
            if (j1.m1152K(3)) {
                Objects.toString(j0Var);
            }
            j0Var.mView.setSaveFromParentEnabled(false);
            j0Var.mView.setTag(R.id.fragment_container_view_tag, j0Var);
            if (viewGroup != null) {
                m1246a();
            }
            if (j0Var.mHidden) {
                j0Var.mView.setVisibility(8);
            }
            if (j0Var.mView.isAttachedToWindow()) {
                View view = j0Var.mView;
                Field field = c6.v0.f5527a;
                c6.l0.m2444c(view);
            } else {
                View view2 = j0Var.mView;
                view2.addOnAttachStateChangeListener(new q1(view2));
            }
            j0Var.performViewCreated();
            this.f2694a.m1228m(j0Var, j0Var.mView, false);
            int visibility = j0Var.mView.getVisibility();
            j0Var.setPostOnViewCreatedAlpha(j0Var.mView.getAlpha());
            if (j0Var.mContainer != null && visibility == 0) {
                View viewFindFocus = j0Var.mView.findFocus();
                if (viewFindFocus != null) {
                    j0Var.setFocusedView(viewFindFocus);
                    if (j1.m1152K(2)) {
                        viewFindFocus.toString();
                        Objects.toString(j0Var);
                    }
                }
                j0Var.mView.setAlpha(DefinitionKt.NO_Float_VALUE);
            }
        }
        j0Var.mState = 2;
    }

    /* renamed from: e */
    public final void m1250e() {
        j0 j0VarM1261b;
        boolean zM1152K = j1.m1152K(3);
        j0 j0Var = this.f2696c;
        if (zM1152K) {
            Objects.toString(j0Var);
        }
        boolean zIsChangingConfigurations = true;
        int i10 = 0;
        boolean z6 = j0Var.mRemoving && !j0Var.isInBackStack();
        t1 t1Var = this.f2695b;
        if (z6 && !j0Var.mBeingSaved) {
            t1Var.m1268i(j0Var.mWho, null);
        }
        if (!z6) {
            n1 n1Var = t1Var.f2705d;
            if (!((n1Var.f2645b.containsKey(j0Var.mWho) && n1Var.f2648e) ? n1Var.f2649f : true)) {
                String str = j0Var.mTargetWho;
                if (str != null && (j0VarM1261b = t1Var.m1261b(str)) != null && j0VarM1261b.mRetainInstance) {
                    j0Var.mTarget = j0VarM1261b;
                }
                j0Var.mState = 0;
                return;
            }
        }
        u0 u0Var = j0Var.mHost;
        if (u0Var instanceof d7.c1) {
            zIsChangingConfigurations = t1Var.f2705d.f2649f;
        } else {
            o0 o0Var = u0Var.f2708b;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if ((z6 && !j0Var.mBeingSaved) || zIsChangingConfigurations) {
            n1 n1Var2 = t1Var.f2705d;
            n1Var2.getClass();
            if (j1.m1152K(3)) {
                Objects.toString(j0Var);
            }
            n1Var2.m1211f(j0Var.mWho, false);
        }
        j0Var.performDestroy();
        this.f2694a.m1219d(j0Var, false);
        ArrayList arrayListM1263d = t1Var.m1263d();
        int size = arrayListM1263d.size();
        while (i10 < size) {
            Object obj = arrayListM1263d.get(i10);
            i10++;
            s1 s1Var = (s1) obj;
            if (s1Var != null) {
                j0 j0Var2 = s1Var.f2696c;
                if (j0Var.mWho.equals(j0Var2.mTargetWho)) {
                    j0Var2.mTarget = j0Var;
                    j0Var2.mTargetWho = null;
                }
            }
        }
        String str2 = j0Var.mTargetWho;
        if (str2 != null) {
            j0Var.mTarget = t1Var.m1261b(str2);
        }
        t1Var.m1267h(this);
    }

    /* renamed from: f */
    public final void m1251f() {
        View view;
        boolean zM1152K = j1.m1152K(3);
        j0 j0Var = this.f2696c;
        if (zM1152K) {
            Objects.toString(j0Var);
        }
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null && (view = j0Var.mView) != null) {
            viewGroup.removeView(view);
        }
        j0Var.performDestroyView();
        this.f2694a.m1229n(j0Var, false);
        j0Var.mContainer = null;
        j0Var.mView = null;
        j0Var.mViewLifecycleOwner = null;
        j0Var.mViewLifecycleOwnerLiveData.m5321k(null);
        j0Var.mInLayout = false;
    }

    /* renamed from: g */
    public final void m1252g() {
        boolean zM1152K = j1.m1152K(3);
        j0 j0Var = this.f2696c;
        if (zM1152K) {
            Objects.toString(j0Var);
        }
        j0Var.performDetach();
        this.f2694a.m1220e(j0Var, false);
        j0Var.mState = -1;
        j0Var.mHost = null;
        j0Var.mParentFragment = null;
        j0Var.mFragmentManager = null;
        if (!j0Var.mRemoving || j0Var.isInBackStack()) {
            n1 n1Var = this.f2695b.f2705d;
            if (!((n1Var.f2645b.containsKey(j0Var.mWho) && n1Var.f2648e) ? n1Var.f2649f : true)) {
                return;
            }
        }
        if (j1.m1152K(3)) {
            Objects.toString(j0Var);
        }
        j0Var.initState();
    }

    /* renamed from: h */
    public final void m1253h() {
        j0 j0Var = this.f2696c;
        if (j0Var.mFromLayout && j0Var.mInLayout && !j0Var.mPerformedCreateView) {
            if (j1.m1152K(3)) {
                Objects.toString(j0Var);
            }
            Bundle bundle = j0Var.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            j0Var.performCreateView(j0Var.performGetLayoutInflater(bundle2), null, bundle2);
            View view = j0Var.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                j0Var.mView.setTag(R.id.fragment_container_view_tag, j0Var);
                if (j0Var.mHidden) {
                    j0Var.mView.setVisibility(8);
                }
                j0Var.performViewCreated();
                this.f2694a.m1228m(j0Var, j0Var.mView, false);
                j0Var.mState = 2;
            }
        }
    }

    /* renamed from: i */
    public final void m1254i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z6 = this.f2697d;
        j0 j0Var = this.f2696c;
        if (z6) {
            if (j1.m1152K(2)) {
                Objects.toString(j0Var);
                return;
            }
            return;
        }
        try {
            this.f2697d = true;
            boolean z10 = false;
            while (true) {
                int iM1248c = m1248c();
                int i10 = j0Var.mState;
                t1 t1Var = this.f2695b;
                if (iM1248c == i10) {
                    if (!z10 && i10 == -1 && j0Var.mRemoving && !j0Var.isInBackStack() && !j0Var.mBeingSaved) {
                        if (j1.m1152K(3)) {
                            Objects.toString(j0Var);
                        }
                        n1 n1Var = t1Var.f2705d;
                        n1Var.getClass();
                        if (j1.m1152K(3)) {
                            Objects.toString(j0Var);
                        }
                        n1Var.m1211f(j0Var.mWho, true);
                        t1Var.m1267h(this);
                        if (j1.m1152K(3)) {
                            Objects.toString(j0Var);
                        }
                        j0Var.initState();
                    }
                    if (j0Var.mHiddenChanged) {
                        if (j0Var.mView != null && (viewGroup = j0Var.mContainer) != null) {
                            C0352q c0352qM1232j = C0352q.m1232j(viewGroup, j0Var.getParentFragmentManager());
                            if (j0Var.mHidden) {
                                if (j1.m1152K(2)) {
                                    Objects.toString(j0Var);
                                }
                                c0352qM1232j.m1237d(l2.GONE, i2.NONE, this);
                            } else {
                                if (j1.m1152K(2)) {
                                    Objects.toString(j0Var);
                                }
                                c0352qM1232j.m1237d(l2.VISIBLE, i2.NONE, this);
                            }
                        }
                        j1 j1Var = j0Var.mFragmentManager;
                        if (j1Var != null && j0Var.mAdded && j1.m1153L(j0Var)) {
                            j1Var.f2569G = true;
                        }
                        j0Var.mHiddenChanged = false;
                        j0Var.onHiddenChanged(j0Var.mHidden);
                        j0Var.mChildFragmentManager.m1190o();
                    }
                    this.f2697d = false;
                    return;
                }
                p0 p0Var = this.f2694a;
                if (iM1248c <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            m1252g();
                            break;
                        case 0:
                            if (j0Var.mBeingSaved) {
                                if (((Bundle) t1Var.f2704c.get(j0Var.mWho)) == null) {
                                    t1Var.m1268i(j0Var.mWho, m1257l());
                                }
                            }
                            m1250e();
                            break;
                        case 1:
                            m1251f();
                            j0Var.mState = 1;
                            break;
                        case 2:
                            j0Var.mInLayout = false;
                            j0Var.mState = 2;
                            break;
                        case 3:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            if (j0Var.mBeingSaved) {
                                t1Var.m1268i(j0Var.mWho, m1257l());
                            } else if (j0Var.mView != null && j0Var.mSavedViewState == null) {
                                m1258m();
                            }
                            if (j0Var.mView != null && (viewGroup2 = j0Var.mContainer) != null) {
                                C0352q c0352qM1232j2 = C0352q.m1232j(viewGroup2, j0Var.getParentFragmentManager());
                                if (j1.m1152K(2)) {
                                    Objects.toString(j0Var);
                                }
                                c0352qM1232j2.m1237d(l2.REMOVED, i2.REMOVING, this);
                            }
                            j0Var.mState = 3;
                            break;
                        case 4:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            j0Var.performStop();
                            p0Var.m1227l(j0Var, false);
                            break;
                        case 5:
                            j0Var.mState = 5;
                            break;
                        case 6:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            j0Var.performPause();
                            p0Var.m1221f(j0Var, false);
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            m1247b();
                            break;
                        case 1:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            Bundle bundle = j0Var.mSavedFragmentState;
                            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
                            if (!j0Var.mIsCreated) {
                                p0Var.m1223h(j0Var, false);
                                j0Var.performCreate(bundle2);
                                p0Var.m1218c(j0Var, false);
                                break;
                            } else {
                                j0Var.mState = 1;
                                j0Var.restoreChildFragmentState();
                                break;
                            }
                        case 2:
                            m1253h();
                            m1249d();
                            break;
                        case 3:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            Bundle bundle3 = j0Var.mSavedFragmentState;
                            j0Var.performActivityCreated(bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                            p0Var.m1216a(j0Var, false);
                            break;
                        case 4:
                            if (j0Var.mView != null && (viewGroup3 = j0Var.mContainer) != null) {
                                C0352q c0352qM1232j3 = C0352q.m1232j(viewGroup3, j0Var.getParentFragmentManager());
                                l2 finalState = l2.from(j0Var.mView.getVisibility());
                                AbstractC4154l.m8923f(finalState, "finalState");
                                if (j1.m1152K(2)) {
                                    Objects.toString(j0Var);
                                }
                                c0352qM1232j3.m1237d(finalState, i2.ADDING, this);
                            }
                            j0Var.mState = 4;
                            break;
                        case 5:
                            if (j1.m1152K(3)) {
                                Objects.toString(j0Var);
                            }
                            j0Var.performStart();
                            p0Var.m1226k(j0Var, false);
                            break;
                        case 6:
                            j0Var.mState = 6;
                            break;
                        case 7:
                            m1256k();
                            break;
                    }
                }
                z10 = true;
            }
        } catch (Throwable th2) {
            this.f2697d = false;
            throw th2;
        }
    }

    /* renamed from: j */
    public final void m1255j(ClassLoader classLoader) {
        j0 j0Var = this.f2696c;
        Bundle bundle = j0Var.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (j0Var.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            j0Var.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            j0Var.mSavedViewState = j0Var.mSavedFragmentState.getSparseParcelableArray("viewState");
            j0Var.mSavedViewRegistryState = j0Var.mSavedFragmentState.getBundle("viewRegistryState");
            p1 p1Var = (p1) j0Var.mSavedFragmentState.getParcelable(TransferTable.COLUMN_STATE);
            if (p1Var != null) {
                j0Var.mTargetWho = p1Var.f2671n;
                j0Var.mTargetRequestCode = p1Var.f2672p;
                Boolean bool = j0Var.mSavedUserVisibleHint;
                if (bool != null) {
                    j0Var.mUserVisibleHint = bool.booleanValue();
                    j0Var.mSavedUserVisibleHint = null;
                } else {
                    j0Var.mUserVisibleHint = p1Var.f2673q;
                }
            }
            if (j0Var.mUserVisibleHint) {
                return;
            }
            j0Var.mDeferStart = true;
        } catch (BadParcelableException e2) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + j0Var, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1256k() {
        /*
            r4 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.j1.m1152K(r0)
            androidx.fragment.app.j0 r1 = r4.f2696c
            if (r0 == 0) goto Lc
            java.util.Objects.toString(r1)
        Lc:
            android.view.View r0 = r1.getFocusedView()
            if (r0 == 0) goto L40
            android.view.View r2 = r1.mView
            if (r0 != r2) goto L17
            goto L21
        L17:
            android.view.ViewParent r2 = r0.getParent()
        L1b:
            if (r2 == 0) goto L40
            android.view.View r3 = r1.mView
            if (r2 != r3) goto L3b
        L21:
            r0.requestFocus()
            r2 = 2
            boolean r2 = androidx.fragment.app.j1.m1152K(r2)
            if (r2 == 0) goto L40
            r0.toString()
            java.util.Objects.toString(r1)
            android.view.View r0 = r1.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L40
        L3b:
            android.view.ViewParent r2 = r2.getParent()
            goto L1b
        L40:
            r0 = 0
            r1.setFocusedView(r0)
            r1.performResume()
            androidx.fragment.app.p0 r2 = r4.f2694a
            r3 = 0
            r2.m1224i(r1, r3)
            androidx.fragment.app.t1 r2 = r4.f2695b
            java.lang.String r3 = r1.mWho
            r2.m1268i(r3, r0)
            r1.mSavedFragmentState = r0
            r1.mSavedViewState = r0
            r1.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s1.m1256k():void");
    }

    /* renamed from: l */
    public final Bundle m1257l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        j0 j0Var = this.f2696c;
        if (j0Var.mState == -1 && (bundle = j0Var.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(TransferTable.COLUMN_STATE, new p1(j0Var));
        if (j0Var.mState > -1) {
            Bundle bundle3 = new Bundle();
            j0Var.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f2694a.m1225j(j0Var, bundle3, false);
            Bundle bundle4 = new Bundle();
            j0Var.mSavedStateRegistryController.m6569c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleM1173X = j0Var.mChildFragmentManager.m1173X();
            if (!bundleM1173X.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleM1173X);
            }
            if (j0Var.mView != null) {
                m1258m();
            }
            SparseArray<Parcelable> sparseArray = j0Var.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = j0Var.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = j0Var.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle(IMAPStore.ID_ARGUMENTS, bundle6);
        }
        return bundle2;
    }

    /* renamed from: m */
    public final void m1258m() {
        j0 j0Var = this.f2696c;
        if (j0Var.mView == null) {
            return;
        }
        if (j1.m1152K(2)) {
            Objects.toString(j0Var);
            Objects.toString(j0Var.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        j0Var.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            j0Var.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        j0Var.mViewLifecycleOwner.f2496f.m6569c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        j0Var.mSavedViewRegistryState = bundle;
    }

    public s1(p0 p0Var, t1 t1Var, ClassLoader classLoader, b1 b1Var, Bundle bundle) {
        this.f2694a = p0Var;
        this.f2695b = t1Var;
        j0 j0VarM1230a = ((p1) bundle.getParcelable(TransferTable.COLUMN_STATE)).m1230a(b1Var);
        this.f2696c = j0VarM1230a;
        j0VarM1230a.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle(IMAPStore.ID_ARGUMENTS);
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        j0VarM1230a.setArguments(bundle2);
        if (j1.m1152K(2)) {
            Objects.toString(j0VarM1230a);
        }
    }

    public s1(p0 p0Var, t1 t1Var, j0 j0Var, Bundle bundle) {
        this.f2694a = p0Var;
        this.f2695b = t1Var;
        this.f2696c = j0Var;
        j0Var.mSavedViewState = null;
        j0Var.mSavedViewRegistryState = null;
        j0Var.mBackStackNesting = 0;
        j0Var.mInLayout = false;
        j0Var.mAdded = false;
        j0 j0Var2 = j0Var.mTarget;
        j0Var.mTargetWho = j0Var2 != null ? j0Var2.mWho : null;
        j0Var.mTarget = null;
        j0Var.mSavedFragmentState = bundle;
        j0Var.mArguments = bundle.getBundle(IMAPStore.ID_ARGUMENTS);
    }
}
