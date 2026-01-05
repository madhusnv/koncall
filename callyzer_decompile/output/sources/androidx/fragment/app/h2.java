package androidx.fragment.app;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a */
    public l2 f2545a;

    /* renamed from: b */
    public i2 f2546b;

    /* renamed from: c */
    public final j0 f2547c;

    /* renamed from: d */
    public final ArrayList f2548d;

    /* renamed from: e */
    public boolean f2549e;

    /* renamed from: f */
    public boolean f2550f;

    /* renamed from: g */
    public boolean f2551g;

    /* renamed from: h */
    public boolean f2552h;

    /* renamed from: i */
    public boolean f2553i;

    /* renamed from: j */
    public final ArrayList f2554j;

    /* renamed from: k */
    public final ArrayList f2555k;

    /* renamed from: l */
    public final s1 f2556l;

    public h2(l2 finalState, i2 lifecycleImpact, s1 s1Var) {
        AbstractC4154l.m8923f(finalState, "finalState");
        AbstractC4154l.m8923f(lifecycleImpact, "lifecycleImpact");
        j0 fragment = s1Var.f2696c;
        AbstractC4154l.m8922e(fragment, "fragmentStateManager.fragment");
        AbstractC4154l.m8923f(finalState, "finalState");
        AbstractC4154l.m8923f(lifecycleImpact, "lifecycleImpact");
        AbstractC4154l.m8923f(fragment, "fragment");
        this.f2545a = finalState;
        this.f2546b = lifecycleImpact;
        this.f2547c = fragment;
        this.f2548d = new ArrayList();
        this.f2553i = true;
        ArrayList arrayList = new ArrayList();
        this.f2554j = arrayList;
        this.f2555k = arrayList;
        this.f2556l = s1Var;
    }

    /* renamed from: a */
    public final void m1137a(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        this.f2552h = false;
        if (this.f2549e) {
            return;
        }
        this.f2549e = true;
        if (this.f2554j.isEmpty()) {
            m1138b();
            return;
        }
        for (g2 g2Var : AbstractC6663m.c0(this.f2555k)) {
            g2Var.getClass();
            if (!g2Var.f2540b) {
                g2Var.mo1130b(container);
            }
            g2Var.f2540b = true;
        }
    }

    /* renamed from: b */
    public final void m1138b() {
        this.f2552h = false;
        if (!this.f2550f) {
            if (j1.m1152K(2)) {
                toString();
            }
            this.f2550f = true;
            ArrayList arrayList = this.f2548d;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((Runnable) obj).run();
            }
        }
        this.f2547c.mTransitioning = false;
        this.f2556l.m1254i();
    }

    /* renamed from: c */
    public final void m1139c(g2 effect) {
        AbstractC4154l.m8923f(effect, "effect");
        ArrayList arrayList = this.f2554j;
        if (arrayList.remove(effect) && arrayList.isEmpty()) {
            m1138b();
        }
    }

    /* renamed from: d */
    public final void m1140d(l2 finalState, i2 lifecycleImpact) {
        AbstractC4154l.m8923f(finalState, "finalState");
        AbstractC4154l.m8923f(lifecycleImpact, "lifecycleImpact");
        int i10 = m2.f2628a[lifecycleImpact.ordinal()];
        j0 j0Var = this.f2547c;
        if (i10 == 1) {
            if (this.f2545a == l2.REMOVED) {
                if (j1.m1152K(2)) {
                    Objects.toString(j0Var);
                    Objects.toString(this.f2546b);
                }
                this.f2545a = l2.VISIBLE;
                this.f2546b = i2.ADDING;
                this.f2553i = true;
                return;
            }
            return;
        }
        if (i10 == 2) {
            if (j1.m1152K(2)) {
                Objects.toString(j0Var);
                Objects.toString(this.f2545a);
                Objects.toString(this.f2546b);
            }
            this.f2545a = l2.REMOVED;
            this.f2546b = i2.REMOVING;
            this.f2553i = true;
            return;
        }
        if (i10 == 3 && this.f2545a != l2.REMOVED) {
            if (j1.m1152K(2)) {
                Objects.toString(j0Var);
                Objects.toString(this.f2545a);
                finalState.toString();
            }
            this.f2545a = finalState;
        }
    }

    public final String toString() {
        StringBuilder sbM7383p = i0.m0.m7383p("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbM7383p.append(this.f2545a);
        sbM7383p.append(" lifecycleImpact = ");
        sbM7383p.append(this.f2546b);
        sbM7383p.append(" fragment = ");
        sbM7383p.append(this.f2547c);
        sbM7383p.append('}');
        return sbM7383p.toString();
    }
}
