package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import e1.C1903e;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import p004e.C1866a;
import p8.AbstractC5857r;
import x5.C8305a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public final class C0349n extends g2 {

    /* renamed from: c */
    public final ArrayList f2629c;

    /* renamed from: d */
    public final h2 f2630d;

    /* renamed from: e */
    public final h2 f2631e;

    /* renamed from: f */
    public final c2 f2632f;

    /* renamed from: g */
    public final Object f2633g;

    /* renamed from: h */
    public final ArrayList f2634h;

    /* renamed from: i */
    public final ArrayList f2635i;

    /* renamed from: j */
    public final C1903e f2636j;

    /* renamed from: k */
    public final ArrayList f2637k;

    /* renamed from: l */
    public final ArrayList f2638l;

    /* renamed from: m */
    public final C1903e f2639m;

    /* renamed from: n */
    public final C1903e f2640n;

    /* renamed from: o */
    public final boolean f2641o;

    /* renamed from: p */
    public final C8305a f2642p = new C8305a();

    public C0349n(ArrayList arrayList, h2 h2Var, h2 h2Var2, c2 c2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, C1903e c1903e, ArrayList arrayList4, ArrayList arrayList5, C1903e c1903e2, C1903e c1903e3, boolean z6) {
        this.f2629c = arrayList;
        this.f2630d = h2Var;
        this.f2631e = h2Var2;
        this.f2632f = c2Var;
        this.f2633g = obj;
        this.f2634h = arrayList2;
        this.f2635i = arrayList3;
        this.f2636j = c1903e;
        this.f2637k = arrayList4;
        this.f2638l = arrayList5;
        this.f2639m = c1903e2;
        this.f2640n = c1903e3;
        this.f2641o = z6;
    }

    /* renamed from: f */
    public static void m1208f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = c6.x0.f5535a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                m1208f(childAt, arrayList);
            }
        }
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: a */
    public final boolean mo1134a() {
        this.f2632f.mo1102i();
        return false;
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: b */
    public final void mo1130b(ViewGroup container) {
        AbstractC4154l.m8923f(container, "container");
        C8305a c8305a = this.f2642p;
        synchronized (c8305a) {
            try {
                if (c8305a.f39851a) {
                    return;
                }
                c8305a.f39851a = true;
                c8305a.f39853c = true;
                l4.d0 d0Var = c8305a.f39852b;
                if (d0Var != null) {
                    try {
                        ((AbstractC5857r) d0Var.f21881b).cancel();
                    } catch (Throwable th2) {
                        synchronized (c8305a) {
                            c8305a.f39853c = false;
                            c8305a.notifyAll();
                            throw th2;
                        }
                    }
                }
                synchronized (c8305a) {
                    c8305a.f39853c = false;
                    c8305a.notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ef  */
    /* JADX WARN: Type inference failed for: r12v5, types: [e1.u0] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // androidx.fragment.app.g2
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1131c(android.view.ViewGroup r35) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0349n.mo1131c(android.view.ViewGroup):void");
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: d */
    public final void mo1135d(C1866a backEvent, ViewGroup container) {
        AbstractC4154l.m8923f(backEvent, "backEvent");
        AbstractC4154l.m8923f(container, "container");
    }

    @Override // androidx.fragment.app.g2
    /* renamed from: e */
    public final void mo1136e(ViewGroup container) {
        boolean z6;
        Object obj;
        AbstractC4154l.m8923f(container, "container");
        if (!container.isLaidOut()) {
            ArrayList arrayList = this.f2629c;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                h2 h2Var = ((C0350o) obj2).f2605a;
                if (j1.m1152K(2)) {
                    container.toString();
                    Objects.toString(h2Var);
                }
            }
            return;
        }
        ArrayList arrayList2 = this.f2629c;
        if (arrayList2.isEmpty()) {
            z6 = true;
        } else {
            int size2 = arrayList2.size();
            z6 = false;
            int i11 = 0;
            while (i11 < size2) {
                Object obj3 = arrayList2.get(i11);
                i11++;
                if (!((C0350o) obj3).f2605a.f2547c.mTransitioning) {
                    break;
                }
            }
            z6 = true;
        }
        if (z6 && (obj = this.f2633g) != null) {
            mo1134a();
            Objects.toString(obj);
            Objects.toString(this.f2630d);
            Objects.toString(this.f2631e);
        }
        mo1134a();
    }
}
