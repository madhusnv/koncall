package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mm.AbstractC4801l;
import og.gg;
import p004e.DialogC1879n;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.w */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0358w extends j0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a */
    public Handler f2726a;

    /* renamed from: k */
    public boolean f2735k;

    /* renamed from: m */
    public Dialog f2737m;

    /* renamed from: n */
    public boolean f2738n;

    /* renamed from: p */
    public boolean f2739p;

    /* renamed from: q */
    public boolean f2740q;

    /* renamed from: b */
    public final RunnableC0353r f2727b = new RunnableC0353r(0, this);

    /* renamed from: c */
    public final DialogInterfaceOnCancelListenerC0354s f2728c = new DialogInterfaceOnCancelListenerC0354s(this);

    /* renamed from: d */
    public final DialogInterfaceOnDismissListenerC0355t f2729d = new DialogInterfaceOnDismissListenerC0355t(this);

    /* renamed from: e */
    public int f2730e = 0;

    /* renamed from: f */
    public int f2731f = 0;

    /* renamed from: g */
    public boolean f2732g = true;

    /* renamed from: h */
    public boolean f2733h = true;

    /* renamed from: j */
    public int f2734j = -1;

    /* renamed from: l */
    public final C0356u f2736l = new C0356u(this);

    /* renamed from: r */
    public boolean f2741r = false;

    @Override // androidx.fragment.app.j0
    public final r0 createFragmentContainer() {
        return new C0357v(this, super.createFragmentContainer());
    }

    /* renamed from: i */
    public final void m1270i(boolean z6, boolean z10) {
        if (this.f2739p) {
            return;
        }
        this.f2739p = true;
        this.f2740q = false;
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2737m.dismiss();
            if (!z10) {
                if (Looper.myLooper() == this.f2726a.getLooper()) {
                    onDismiss(this.f2737m);
                } else {
                    this.f2726a.post(this.f2727b);
                }
            }
        }
        this.f2738n = true;
        if (this.f2734j >= 0) {
            j1 parentFragmentManager = getParentFragmentManager();
            int i10 = this.f2734j;
            parentFragmentManager.getClass();
            if (i10 < 0) {
                throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Bad id: "));
            }
            parentFragmentManager.m1199x(new g1(parentFragmentManager, null, i10), z6);
            this.f2734j = -1;
            return;
        }
        j1 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C0336a c0336a = new C0336a(parentFragmentManager2);
        c0336a.f2449p = true;
        j1 j1Var = this.mFragmentManager;
        if (j1Var != null && j1Var != c0336a.f2451r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0336a.m1087b(new u1(this, 3));
        if (z6) {
            c0336a.m1091f(true, true);
        } else {
            c0336a.m1090e();
        }
    }

    /* renamed from: j */
    public Dialog mo1271j() {
        if (j1.m1152K(3)) {
            toString();
        }
        return new DialogC1879n(requireContext(), this.f2731f);
    }

    /* renamed from: k */
    public final Dialog m1272k() {
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* renamed from: l */
    public void m1273l(j1 j1Var, String str) {
        this.f2739p = false;
        this.f2740q = true;
        j1Var.getClass();
        C0336a c0336a = new C0336a(j1Var);
        c0336a.f2449p = true;
        c0336a.m1092g(0, this, str, 1);
        c0336a.m1090e();
    }

    @Override // androidx.fragment.app.j0
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().m5316f(this.f2736l);
        if (this.f2740q) {
            return;
        }
        this.f2739p = false;
    }

    @Override // androidx.fragment.app.j0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2726a = new Handler();
        this.f2733h = this.mContainerId == 0;
        if (bundle != null) {
            this.f2730e = bundle.getInt("android:style", 0);
            this.f2731f = bundle.getInt("android:theme", 0);
            this.f2732g = bundle.getBoolean("android:cancelable", true);
            this.f2733h = bundle.getBoolean("android:showsDialog", this.f2733h);
            this.f2734j = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            this.f2738n = true;
            dialog.setOnDismissListener(null);
            this.f2737m.dismiss();
            if (!this.f2739p) {
                onDismiss(this.f2737m);
            }
            this.f2737m = null;
            this.f2741r = false;
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onDetach() {
        super.onDetach();
        if (!this.f2740q && !this.f2739p) {
            this.f2739p = true;
        }
        getViewLifecycleOwnerLiveData().mo5320j(this.f2736l);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2738n) {
            return;
        }
        if (j1.m1152K(3)) {
            toString();
        }
        m1270i(true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x0018, B:14:0x0024, B:24:0x003c, B:26:0x0044, B:29:0x004e, B:20:0x002e, B:22:0x0034, B:23:0x0039, B:30:0x0066), top: B:45:0x0018 }] */
    @Override // androidx.fragment.app.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r7) {
        /*
            r6 = this;
            android.view.LayoutInflater r7 = super.onGetLayoutInflater(r7)
            boolean r0 = r6.f2733h
            r1 = 2
            if (r0 == 0) goto L85
            boolean r2 = r6.f2735k
            if (r2 == 0) goto Lf
            goto L85
        Lf:
            if (r0 != 0) goto L12
            goto L6f
        L12:
            boolean r0 = r6.f2741r
            if (r0 != 0) goto L6f
            r0 = 0
            r2 = 1
            r6.f2735k = r2     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r3 = r6.mo1271j()     // Catch: java.lang.Throwable -> L4c
            r6.f2737m = r3     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r6.f2733h     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L66
            int r4 = r6.f2730e     // Catch: java.lang.Throwable -> L4c
            if (r4 == r2) goto L39
            if (r4 == r1) goto L39
            r5 = 3
            if (r4 == r5) goto L2e
            goto L3c
        L2e:
            android.view.Window r4 = r3.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L39
            r5 = 24
            r4.addFlags(r5)     // Catch: java.lang.Throwable -> L4c
        L39:
            r3.requestWindowFeature(r2)     // Catch: java.lang.Throwable -> L4c
        L3c:
            android.content.Context r3 = r6.getContext()     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r3 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r4 = r6.f2737m     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r3 = (android.app.Activity) r3     // Catch: java.lang.Throwable -> L4c
            r4.setOwnerActivity(r3)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r7 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r3 = r6.f2737m     // Catch: java.lang.Throwable -> L4c
            boolean r4 = r6.f2732g     // Catch: java.lang.Throwable -> L4c
            r3.setCancelable(r4)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r3 = r6.f2737m     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.s r4 = r6.f2728c     // Catch: java.lang.Throwable -> L4c
            r3.setOnCancelListener(r4)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r3 = r6.f2737m     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.t r4 = r6.f2729d     // Catch: java.lang.Throwable -> L4c
            r3.setOnDismissListener(r4)     // Catch: java.lang.Throwable -> L4c
            r6.f2741r = r2     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r2 = 0
            r6.f2737m = r2     // Catch: java.lang.Throwable -> L4c
        L69:
            r6.f2735k = r0
            goto L6f
        L6c:
            r6.f2735k = r0
            throw r7
        L6f:
            boolean r0 = androidx.fragment.app.j1.m1152K(r1)
            if (r0 == 0) goto L78
            r6.toString()
        L78:
            android.app.Dialog r0 = r6.f2737m
            if (r0 == 0) goto L8e
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r7 = r7.cloneInContext(r0)
            return r7
        L85:
            boolean r0 = androidx.fragment.app.j1.m1152K(r1)
            if (r0 == 0) goto L8e
            r6.toString()
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC0358w.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.j0
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f2730e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2731f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z6 = this.f2732g;
        if (!z6) {
            bundle.putBoolean("android:cancelable", z6);
        }
        boolean z10 = this.f2733h;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f2734j;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.j0
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            this.f2738n = false;
            dialog.show();
            View decorView = this.f2737m.getWindow().getDecorView();
            d7.q0.m5341h(decorView, this);
            d7.q0.m5342i(decorView, this);
            gg.m10676c(decorView, this);
        }
    }

    @Override // androidx.fragment.app.j0
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f2737m;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.j0
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f2737m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2737m.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.j0
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f2737m == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2737m.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
