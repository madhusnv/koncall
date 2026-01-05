package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b2.C0558p;
import bk.RunnableC0683n;
import c6.v0;
import c9.C0908c;
import d6.C1616f;
import d6.C1617g;
import e1.C1917s;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import pg.h8;
import y7.AbstractC8586u;
import y7.C8579n;
import y7.C8584s;
import y7.a1;
import y7.e0;
import y7.f0;
import y7.g0;
import y7.l0;
import y7.p0;
import y7.q0;
import y7.x0;
import y7.y0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends f0 implements p0 {

    /* renamed from: B */
    public final C0908c f2837B;

    /* renamed from: C */
    public final int f2838C;

    /* renamed from: D */
    public boolean f2839D;

    /* renamed from: E */
    public boolean f2840E;

    /* renamed from: F */
    public a1 f2841F;

    /* renamed from: G */
    public final Rect f2842G;

    /* renamed from: H */
    public final x0 f2843H;

    /* renamed from: I */
    public final boolean f2844I;

    /* renamed from: J */
    public int[] f2845J;

    /* renamed from: K */
    public final RunnableC0683n f2846K;

    /* renamed from: p */
    public final int f2847p;

    /* renamed from: q */
    public final C1917s[] f2848q;

    /* renamed from: r */
    public final AbstractC8586u f2849r;

    /* renamed from: s */
    public final AbstractC8586u f2850s;

    /* renamed from: t */
    public final int f2851t;

    /* renamed from: u */
    public int f2852u;

    /* renamed from: v */
    public final C8579n f2853v;

    /* renamed from: w */
    public boolean f2854w;

    /* renamed from: y */
    public final BitSet f2856y;

    /* renamed from: x */
    public boolean f2855x = false;

    /* renamed from: z */
    public int f2857z = -1;

    /* renamed from: A */
    public int f2836A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2847p = -1;
        this.f2854w = false;
        C0908c c0908c = new C0908c(22, false);
        this.f2837B = c0908c;
        this.f2838C = 2;
        this.f2842G = new Rect();
        this.f2843H = new x0(this);
        this.f2844I = true;
        this.f2846K = new RunnableC0683n(26, this);
        e0 e0VarM15844E = f0.m15844E(context, attributeSet, i10, i11);
        int i12 = e0VarM15844E.f41609a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo1304c(null);
        if (i12 != this.f2851t) {
            this.f2851t = i12;
            AbstractC8586u abstractC8586u = this.f2849r;
            this.f2849r = this.f2850s;
            this.f2850s = abstractC8586u;
            g0();
        }
        int i13 = e0VarM15844E.f41610b;
        mo1304c(null);
        if (i13 != this.f2847p) {
            int[] iArr = (int[]) c0908c.f5574b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0908c.f5575c = null;
            g0();
            this.f2847p = i13;
            this.f2856y = new BitSet(this.f2847p);
            this.f2848q = new C1917s[this.f2847p];
            for (int i14 = 0; i14 < this.f2847p; i14++) {
                this.f2848q[i14] = new C1917s(this, i14);
            }
            g0();
        }
        boolean z6 = e0VarM15844E.f41611c;
        mo1304c(null);
        a1 a1Var = this.f2841F;
        if (a1Var != null && a1Var.f41572h != z6) {
            a1Var.f41572h = z6;
        }
        this.f2854w = z6;
        g0();
        C8579n c8579n = new C8579n();
        c8579n.f41714a = true;
        c8579n.f41719f = 0;
        c8579n.f41720g = 0;
        this.f2853v = c8579n;
        this.f2849r = AbstractC8586u.m15932b(this, this.f2851t);
        this.f2850s = AbstractC8586u.m15932b(this, 1 - this.f2851t);
    }

    public static int V0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final void A0(l0 l0Var, q0 q0Var, boolean z6) {
        int iMo15907i;
        int iE0 = E0(Integer.MIN_VALUE);
        if (iE0 != Integer.MIN_VALUE && (iMo15907i = this.f2849r.mo15907i() - iE0) > 0) {
            int i10 = iMo15907i - (-R0(-iMo15907i, l0Var, q0Var));
            if (!z6 || i10 <= 0) {
                return;
            }
            this.f2849r.mo15915q(i10);
        }
    }

    public final void B0(l0 l0Var, q0 q0Var, boolean z6) {
        int iMo15911m;
        int iF0 = F0(Integer.MAX_VALUE);
        if (iF0 != Integer.MAX_VALUE && (iMo15911m = iF0 - this.f2849r.mo15911m()) > 0) {
            int iR0 = iMo15911m - R0(iMo15911m, l0Var, q0Var);
            if (!z6 || iR0 <= 0) {
                return;
            }
            this.f2849r.mo15915q(-iR0);
        }
    }

    public final int C0() {
        if (m15858v() == 0) {
            return 0;
        }
        return f0.m15843D(m15857u(0));
    }

    public final int D0() {
        int iM15858v = m15858v();
        if (iM15858v == 0) {
            return 0;
        }
        return f0.m15843D(m15857u(iM15858v - 1));
    }

    public final int E0(int i10) {
        int iM5621i = this.f2848q[0].m5621i(i10);
        for (int i11 = 1; i11 < this.f2847p; i11++) {
            int iM5621i2 = this.f2848q[i11].m5621i(i10);
            if (iM5621i2 > iM5621i) {
                iM5621i = iM5621i2;
            }
        }
        return iM5621i;
    }

    @Override // y7.f0
    /* renamed from: F */
    public final int mo1279F(l0 l0Var, q0 q0Var) {
        return this.f2851t == 0 ? this.f2847p : super.mo1279F(l0Var, q0Var);
    }

    public final int F0(int i10) {
        int iM5623k = this.f2848q[0].m5623k(i10);
        for (int i11 = 1; i11 < this.f2847p; i11++) {
            int iM5623k2 = this.f2848q[i11].m5623k(i10);
            if (iM5623k2 < iM5623k) {
                iM5623k = iM5623k2;
            }
        }
        return iM5623k;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G0(int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.G0(int, int, int):void");
    }

    @Override // y7.f0
    /* renamed from: H */
    public final boolean mo1298H() {
        return this.f2838C != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View H0() {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.H0():android.view.View");
    }

    public final boolean I0() {
        RecyclerView recyclerView = this.f41620b;
        Field field = v0.f5527a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public final void J0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f41620b;
        Rect rect = this.f2842G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m1325I(view));
        }
        y0 y0Var = (y0) view.getLayoutParams();
        int iV0 = V0(i10, ((ViewGroup.MarginLayoutParams) y0Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) y0Var).rightMargin + rect.right);
        int iV02 = V0(i11, ((ViewGroup.MarginLayoutParams) y0Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) y0Var).bottomMargin + rect.bottom);
        if (p0(view, iV0, iV02, y0Var)) {
            view.measure(iV0, iV02);
        }
    }

    @Override // y7.f0
    /* renamed from: K */
    public final void mo1364K(int i10) {
        super.mo1364K(i10);
        for (int i11 = 0; i11 < this.f2847p; i11++) {
            C1917s c1917s = this.f2848q[i11];
            int i12 = c1917s.f9047b;
            if (i12 != Integer.MIN_VALUE) {
                c1917s.f9047b = i12 + i10;
            }
            int i13 = c1917s.f9048c;
            if (i13 != Integer.MIN_VALUE) {
                c1917s.f9048c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0421  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(y7.l0 r17, y7.q0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1084
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0(y7.l0, y7.q0, boolean):void");
    }

    @Override // y7.f0
    /* renamed from: L */
    public final void mo1365L(int i10) {
        super.mo1365L(i10);
        for (int i11 = 0; i11 < this.f2847p; i11++) {
            C1917s c1917s = this.f2848q[i11];
            int i12 = c1917s.f9047b;
            if (i12 != Integer.MIN_VALUE) {
                c1917s.f9047b = i12 + i10;
            }
            int i13 = c1917s.f9048c;
            if (i13 != Integer.MIN_VALUE) {
                c1917s.f9048c = i13 + i10;
            }
        }
    }

    public final boolean L0(int i10) {
        if (this.f2851t == 0) {
            return (i10 == -1) != this.f2855x;
        }
        return ((i10 == -1) == this.f2855x) == I0();
    }

    @Override // y7.f0
    /* renamed from: M */
    public final void mo1299M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f41620b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f2846K);
        }
        for (int i10 = 0; i10 < this.f2847p; i10++) {
            this.f2848q[i10].m5614b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(int i10, q0 q0Var) {
        int iC0;
        int i11;
        if (i10 > 0) {
            iC0 = D0();
            i11 = 1;
        } else {
            iC0 = C0();
            i11 = -1;
        }
        C8579n c8579n = this.f2853v;
        c8579n.f41714a = true;
        T0(iC0, q0Var);
        S0(i11);
        c8579n.f41716c = iC0 + c8579n.f41717d;
        c8579n.f41715b = Math.abs(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    @Override // y7.f0
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo1280N(android.view.View r9, int r10, y7.l0 r11, y7.q0 r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1280N(android.view.View, int, y7.l0, y7.q0):android.view.View");
    }

    public final void N0(l0 l0Var, C8579n c8579n) {
        if (!c8579n.f41714a || c8579n.f41722i) {
            return;
        }
        if (c8579n.f41715b == 0) {
            if (c8579n.f41718e == -1) {
                O0(l0Var, c8579n.f41720g);
                return;
            } else {
                P0(l0Var, c8579n.f41719f);
                return;
            }
        }
        int i10 = 1;
        if (c8579n.f41718e == -1) {
            int i11 = c8579n.f41719f;
            int iM5623k = this.f2848q[0].m5623k(i11);
            while (i10 < this.f2847p) {
                int iM5623k2 = this.f2848q[i10].m5623k(i11);
                if (iM5623k2 > iM5623k) {
                    iM5623k = iM5623k2;
                }
                i10++;
            }
            int i12 = i11 - iM5623k;
            O0(l0Var, i12 < 0 ? c8579n.f41720g : c8579n.f41720g - Math.min(i12, c8579n.f41715b));
            return;
        }
        int i13 = c8579n.f41720g;
        int iM5621i = this.f2848q[0].m5621i(i13);
        while (i10 < this.f2847p) {
            int iM5621i2 = this.f2848q[i10].m5621i(i13);
            if (iM5621i2 < iM5621i) {
                iM5621i = iM5621i2;
            }
            i10++;
        }
        int i14 = iM5621i - c8579n.f41720g;
        P0(l0Var, i14 < 0 ? c8579n.f41719f : Math.min(i14, c8579n.f41715b) + c8579n.f41719f);
    }

    @Override // y7.f0
    /* renamed from: O */
    public final void mo1300O(AccessibilityEvent accessibilityEvent) {
        super.mo1300O(accessibilityEvent);
        if (m15858v() > 0) {
            View viewZ0 = z0(false);
            View viewY0 = y0(false);
            if (viewZ0 == null || viewY0 == null) {
                return;
            }
            int iM15843D = f0.m15843D(viewZ0);
            int iM15843D2 = f0.m15843D(viewY0);
            if (iM15843D < iM15843D2) {
                accessibilityEvent.setFromIndex(iM15843D);
                accessibilityEvent.setToIndex(iM15843D2);
            } else {
                accessibilityEvent.setFromIndex(iM15843D2);
                accessibilityEvent.setToIndex(iM15843D);
            }
        }
    }

    public final void O0(l0 l0Var, int i10) {
        for (int iM15858v = m15858v() - 1; iM15858v >= 0; iM15858v--) {
            View viewM15857u = m15857u(iM15858v);
            if (this.f2849r.mo15905g(viewM15857u) < i10 || this.f2849r.mo15914p(viewM15857u) < i10) {
                return;
            }
            y0 y0Var = (y0) viewM15857u.getLayoutParams();
            y0Var.getClass();
            if (((ArrayList) y0Var.f41834e.f9051f).size() == 1) {
                return;
            }
            C1917s c1917s = y0Var.f41834e;
            ArrayList arrayList = (ArrayList) c1917s.f9051f;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            y0 y0Var2 = (y0) view.getLayoutParams();
            y0Var2.f41834e = null;
            if (y0Var2.f41639a.m15923h() || y0Var2.f41639a.m15926k()) {
                c1917s.f9049d -= ((StaggeredGridLayoutManager) c1917s.f9052g).f2849r.mo15903e(view);
            }
            if (size == 1) {
                c1917s.f9047b = Integer.MIN_VALUE;
            }
            c1917s.f9048c = Integer.MIN_VALUE;
            d0(viewM15857u, l0Var);
        }
    }

    public final void P0(l0 l0Var, int i10) {
        while (m15858v() > 0) {
            View viewM15857u = m15857u(0);
            if (this.f2849r.mo15902d(viewM15857u) > i10 || this.f2849r.mo15913o(viewM15857u) > i10) {
                return;
            }
            y0 y0Var = (y0) viewM15857u.getLayoutParams();
            y0Var.getClass();
            if (((ArrayList) y0Var.f41834e.f9051f).size() == 1) {
                return;
            }
            C1917s c1917s = y0Var.f41834e;
            ArrayList arrayList = (ArrayList) c1917s.f9051f;
            View view = (View) arrayList.remove(0);
            y0 y0Var2 = (y0) view.getLayoutParams();
            y0Var2.f41834e = null;
            if (arrayList.size() == 0) {
                c1917s.f9048c = Integer.MIN_VALUE;
            }
            if (y0Var2.f41639a.m15923h() || y0Var2.f41639a.m15926k()) {
                c1917s.f9049d -= ((StaggeredGridLayoutManager) c1917s.f9052g).f2849r.mo15903e(view);
            }
            c1917s.f9047b = Integer.MIN_VALUE;
            d0(viewM15857u, l0Var);
        }
    }

    @Override // y7.f0
    /* renamed from: Q */
    public final void mo1281Q(l0 l0Var, q0 q0Var, View view, C1617g c1617g) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof y0)) {
            m15854P(view, c1617g);
            return;
        }
        y0 y0Var = (y0) layoutParams;
        if (this.f2851t == 0) {
            C1917s c1917s = y0Var.f41834e;
            c1617g.m5294m(C1616f.m5280a(false, c1917s == null ? -1 : c1917s.f9050e, 1, -1, -1));
        } else {
            C1917s c1917s2 = y0Var.f41834e;
            c1617g.m5294m(C1616f.m5280a(false, -1, -1, c1917s2 == null ? -1 : c1917s2.f9050e, 1));
        }
    }

    public final void Q0() {
        if (this.f2851t == 1 || !I0()) {
            this.f2855x = this.f2854w;
        } else {
            this.f2855x = !this.f2854w;
        }
    }

    @Override // y7.f0
    /* renamed from: R */
    public final void mo1282R(int i10, int i11) {
        G0(i10, i11, 1);
    }

    public final int R0(int i10, l0 l0Var, q0 q0Var) {
        if (m15858v() == 0 || i10 == 0) {
            return 0;
        }
        M0(i10, q0Var);
        C8579n c8579n = this.f2853v;
        int iX0 = x0(l0Var, c8579n, q0Var);
        if (c8579n.f41715b >= iX0) {
            i10 = i10 < 0 ? -iX0 : iX0;
        }
        this.f2849r.mo15915q(-i10);
        this.f2839D = this.f2855x;
        c8579n.f41715b = 0;
        N0(l0Var, c8579n);
        return i10;
    }

    @Override // y7.f0
    /* renamed from: S */
    public final void mo1283S() {
        C0908c c0908c = this.f2837B;
        int[] iArr = (int[]) c0908c.f5574b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        c0908c.f5575c = null;
        g0();
    }

    public final void S0(int i10) {
        C8579n c8579n = this.f2853v;
        c8579n.f41718e = i10;
        c8579n.f41717d = this.f2855x != (i10 == -1) ? -1 : 1;
    }

    @Override // y7.f0
    /* renamed from: T */
    public final void mo1284T(int i10, int i11) {
        G0(i10, i11, 8);
    }

    public final void T0(int i10, q0 q0Var) {
        int iMo15912n;
        int iMo15912n2;
        int i11;
        C8579n c8579n = this.f2853v;
        boolean z6 = false;
        c8579n.f41715b = 0;
        c8579n.f41716c = i10;
        C8584s c8584s = this.f41623e;
        if (c8584s == null || !c8584s.f41772e || (i11 = q0Var.f41751a) == -1) {
            iMo15912n = 0;
            iMo15912n2 = 0;
        } else {
            if (this.f2855x == (i11 < i10)) {
                iMo15912n = this.f2849r.mo15912n();
                iMo15912n2 = 0;
            } else {
                iMo15912n2 = this.f2849r.mo15912n();
                iMo15912n = 0;
            }
        }
        RecyclerView recyclerView = this.f41620b;
        if (recyclerView == null || !recyclerView.f2819g) {
            c8579n.f41720g = this.f2849r.mo15906h() + iMo15912n;
            c8579n.f41719f = -iMo15912n2;
        } else {
            c8579n.f41719f = this.f2849r.mo15911m() - iMo15912n2;
            c8579n.f41720g = this.f2849r.mo15907i() + iMo15912n;
        }
        c8579n.f41721h = false;
        c8579n.f41714a = true;
        if (this.f2849r.mo15909k() == 0 && this.f2849r.mo15906h() == 0) {
            z6 = true;
        }
        c8579n.f41722i = z6;
    }

    @Override // y7.f0
    /* renamed from: U */
    public final void mo1285U(int i10, int i11) {
        G0(i10, i11, 2);
    }

    public final void U0(C1917s c1917s, int i10, int i11) {
        int i12 = c1917s.f9049d;
        int i13 = c1917s.f9050e;
        if (i10 != -1) {
            int i14 = c1917s.f9048c;
            if (i14 == Integer.MIN_VALUE) {
                c1917s.m5613a();
                i14 = c1917s.f9048c;
            }
            if (i14 - i12 >= i11) {
                this.f2856y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = c1917s.f9047b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) c1917s.f9051f).get(0);
            y0 y0Var = (y0) view.getLayoutParams();
            c1917s.f9047b = ((StaggeredGridLayoutManager) c1917s.f9052g).f2849r.mo15905g(view);
            y0Var.getClass();
            i15 = c1917s.f9047b;
        }
        if (i15 + i12 <= i11) {
            this.f2856y.set(i13, false);
        }
    }

    @Override // y7.f0
    /* renamed from: V */
    public final void mo1286V(int i10, int i11) {
        G0(i10, i11, 4);
    }

    @Override // y7.f0
    /* renamed from: W */
    public final void mo1287W(l0 l0Var, q0 q0Var) {
        K0(l0Var, q0Var, true);
    }

    @Override // y7.f0
    /* renamed from: X */
    public final void mo1288X(q0 q0Var) {
        this.f2857z = -1;
        this.f2836A = Integer.MIN_VALUE;
        this.f2841F = null;
        this.f2843H.m15948a();
    }

    @Override // y7.f0
    /* renamed from: Y */
    public final void mo1301Y(Parcelable parcelable) {
        if (parcelable instanceof a1) {
            this.f2841F = (a1) parcelable;
            g0();
        }
    }

    @Override // y7.f0
    /* renamed from: Z */
    public final Parcelable mo1302Z() {
        int iM5623k;
        int iMo15911m;
        int[] iArr;
        a1 a1Var = this.f2841F;
        if (a1Var != null) {
            a1 a1Var2 = new a1();
            a1Var2.f41567c = a1Var.f41567c;
            a1Var2.f41565a = a1Var.f41565a;
            a1Var2.f41566b = a1Var.f41566b;
            a1Var2.f41568d = a1Var.f41568d;
            a1Var2.f41569e = a1Var.f41569e;
            a1Var2.f41570f = a1Var.f41570f;
            a1Var2.f41572h = a1Var.f41572h;
            a1Var2.f41573j = a1Var.f41573j;
            a1Var2.f41574k = a1Var.f41574k;
            a1Var2.f41571g = a1Var.f41571g;
            return a1Var2;
        }
        a1 a1Var3 = new a1();
        a1Var3.f41572h = this.f2854w;
        a1Var3.f41573j = this.f2839D;
        a1Var3.f41574k = this.f2840E;
        C0908c c0908c = this.f2837B;
        if (c0908c == null || (iArr = (int[]) c0908c.f5574b) == null) {
            a1Var3.f41569e = 0;
        } else {
            a1Var3.f41570f = iArr;
            a1Var3.f41569e = iArr.length;
            a1Var3.f41571g = (ArrayList) c0908c.f5575c;
        }
        if (m15858v() <= 0) {
            a1Var3.f41565a = -1;
            a1Var3.f41566b = -1;
            a1Var3.f41567c = 0;
            return a1Var3;
        }
        a1Var3.f41565a = this.f2839D ? D0() : C0();
        View viewY0 = this.f2855x ? y0(true) : z0(true);
        a1Var3.f41566b = viewY0 != null ? f0.m15843D(viewY0) : -1;
        int i10 = this.f2847p;
        a1Var3.f41567c = i10;
        a1Var3.f41568d = new int[i10];
        for (int i11 = 0; i11 < this.f2847p; i11++) {
            if (this.f2839D) {
                iM5623k = this.f2848q[i11].m5621i(Integer.MIN_VALUE);
                if (iM5623k != Integer.MIN_VALUE) {
                    iMo15911m = this.f2849r.mo15907i();
                    iM5623k -= iMo15911m;
                }
            } else {
                iM5623k = this.f2848q[i11].m5623k(Integer.MIN_VALUE);
                if (iM5623k != Integer.MIN_VALUE) {
                    iMo15911m = this.f2849r.mo15911m();
                    iM5623k -= iMo15911m;
                }
            }
            a1Var3.f41568d[i11] = iM5623k;
        }
        return a1Var3;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // y7.p0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.PointF mo1303a(int r4) {
        /*
            r3 = this;
            int r0 = r3.m15858v()
            r1 = -1
            r2 = 1
            if (r0 != 0) goto Le
            boolean r4 = r3.f2855x
            if (r4 == 0) goto L1b
        Lc:
            r1 = r2
            goto L1b
        Le:
            int r0 = r3.C0()
            if (r4 >= r0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = 0
        L17:
            boolean r0 = r3.f2855x
            if (r4 == r0) goto Lc
        L1b:
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>()
            if (r1 != 0) goto L24
            r4 = 0
            return r4
        L24:
            int r0 = r3.f2851t
            r2 = 0
            if (r0 != 0) goto L2f
            float r0 = (float) r1
            r4.x = r0
            r4.y = r2
            return r4
        L2f:
            r4.x = r2
            float r0 = (float) r1
            r4.y = r0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo1303a(int):android.graphics.PointF");
    }

    @Override // y7.f0
    public final void a0(int i10) {
        if (i10 == 0) {
            v0();
        }
    }

    @Override // y7.f0
    /* renamed from: c */
    public final void mo1304c(String str) {
        RecyclerView recyclerView;
        if (this.f2841F != null || (recyclerView = this.f41620b) == null) {
            return;
        }
        recyclerView.m1346h(str);
    }

    @Override // y7.f0
    /* renamed from: d */
    public final boolean mo1305d() {
        return this.f2851t == 0;
    }

    @Override // y7.f0
    /* renamed from: e */
    public final boolean mo1306e() {
        return this.f2851t == 1;
    }

    @Override // y7.f0
    /* renamed from: f */
    public final boolean mo1289f(g0 g0Var) {
        return g0Var instanceof y0;
    }

    @Override // y7.f0
    /* renamed from: h */
    public final void mo1307h(int i10, int i11, q0 q0Var, C0558p c0558p) {
        C8579n c8579n;
        int iM5621i;
        int iM5623k;
        if (this.f2851t != 0) {
            i10 = i11;
        }
        if (m15858v() == 0 || i10 == 0) {
            return;
        }
        M0(i10, q0Var);
        int[] iArr = this.f2845J;
        if (iArr == null || iArr.length < this.f2847p) {
            this.f2845J = new int[this.f2847p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f2847p;
            c8579n = this.f2853v;
            if (i12 >= i14) {
                break;
            }
            if (c8579n.f41717d == -1) {
                iM5621i = c8579n.f41719f;
                iM5623k = this.f2848q[i12].m5623k(iM5621i);
            } else {
                iM5621i = this.f2848q[i12].m5621i(c8579n.f41720g);
                iM5623k = c8579n.f41720g;
            }
            int i15 = iM5621i - iM5623k;
            if (i15 >= 0) {
                this.f2845J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.f2845J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = c8579n.f41716c;
            if (i17 < 0 || i17 >= q0Var.m15894b()) {
                return;
            }
            c0558p.m1654b(c8579n.f41716c, this.f2845J[i16]);
            c8579n.f41716c += c8579n.f41717d;
        }
    }

    @Override // y7.f0
    public final int h0(int i10, l0 l0Var, q0 q0Var) {
        return R0(i10, l0Var, q0Var);
    }

    @Override // y7.f0
    public final void i0(int i10) {
        a1 a1Var = this.f2841F;
        if (a1Var != null && a1Var.f41565a != i10) {
            a1Var.f41568d = null;
            a1Var.f41567c = 0;
            a1Var.f41565a = -1;
            a1Var.f41566b = -1;
        }
        this.f2857z = i10;
        this.f2836A = Integer.MIN_VALUE;
        g0();
    }

    @Override // y7.f0
    /* renamed from: j */
    public final int mo1309j(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        boolean z6 = !this.f2844I;
        return h8.m11683b(q0Var, this.f2849r, z0(z6), y0(z6), this, this.f2844I);
    }

    @Override // y7.f0
    public final int j0(int i10, l0 l0Var, q0 q0Var) {
        return R0(i10, l0Var, q0Var);
    }

    @Override // y7.f0
    /* renamed from: k */
    public final int mo1290k(q0 q0Var) {
        return w0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: l */
    public final int mo1291l(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        boolean z6 = !this.f2844I;
        return h8.m11685d(q0Var, this.f2849r, z0(z6), y0(z6), this, this.f2844I);
    }

    @Override // y7.f0
    /* renamed from: m */
    public final int mo1310m(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        boolean z6 = !this.f2844I;
        return h8.m11683b(q0Var, this.f2849r, z0(z6), y0(z6), this, this.f2844I);
    }

    @Override // y7.f0
    public final void m0(Rect rect, int i10, int i11) {
        int iM15847g;
        int iM15847g2;
        int iM15851B = m15851B() + m15850A();
        int iM15859z = m15859z() + m15852C();
        int i12 = this.f2851t;
        int i13 = this.f2847p;
        if (i12 == 1) {
            int iHeight = rect.height() + iM15859z;
            RecyclerView recyclerView = this.f41620b;
            Field field = v0.f5527a;
            iM15847g2 = f0.m15847g(i11, iHeight, recyclerView.getMinimumHeight());
            iM15847g = f0.m15847g(i10, (this.f2852u * i13) + iM15851B, this.f41620b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM15851B;
            RecyclerView recyclerView2 = this.f41620b;
            Field field2 = v0.f5527a;
            iM15847g = f0.m15847g(i10, iWidth, recyclerView2.getMinimumWidth());
            iM15847g2 = f0.m15847g(i11, (this.f2852u * i13) + iM15859z, this.f41620b.getMinimumHeight());
        }
        this.f41620b.setMeasuredDimension(iM15847g, iM15847g2);
    }

    @Override // y7.f0
    /* renamed from: n */
    public final int mo1292n(q0 q0Var) {
        return w0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: o */
    public final int mo1293o(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        boolean z6 = !this.f2844I;
        return h8.m11685d(q0Var, this.f2849r, z0(z6), y0(z6), this, this.f2844I);
    }

    @Override // y7.f0
    /* renamed from: r */
    public final g0 mo1294r() {
        return this.f2851t == 0 ? new y0(-2, -1) : new y0(-1, -2);
    }

    @Override // y7.f0
    /* renamed from: s */
    public final g0 mo1295s(Context context, AttributeSet attributeSet) {
        return new y0(context, attributeSet);
    }

    @Override // y7.f0
    public final void s0(RecyclerView recyclerView, int i10) {
        C8584s c8584s = new C8584s(recyclerView.getContext());
        c8584s.f41768a = i10;
        t0(c8584s);
    }

    @Override // y7.f0
    /* renamed from: t */
    public final g0 mo1296t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new y0((ViewGroup.MarginLayoutParams) layoutParams) : new y0(layoutParams);
    }

    @Override // y7.f0
    public final boolean u0() {
        return this.f2841F == null;
    }

    public final boolean v0() {
        int iC0;
        if (m15858v() != 0 && this.f2838C != 0 && this.f41625g) {
            if (this.f2855x) {
                iC0 = D0();
                C0();
            } else {
                iC0 = C0();
                D0();
            }
            if (iC0 == 0 && H0() != null) {
                C0908c c0908c = this.f2837B;
                int[] iArr = (int[]) c0908c.f5574b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                c0908c.f5575c = null;
                this.f41624f = true;
                g0();
                return true;
            }
        }
        return false;
    }

    public final int w0(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        boolean z6 = !this.f2844I;
        return h8.m11684c(q0Var, this.f2849r, z0(z6), y0(z6), this, this.f2844I, this.f2855x);
    }

    @Override // y7.f0
    /* renamed from: x */
    public final int mo1297x(l0 l0Var, q0 q0Var) {
        return this.f2851t == 1 ? this.f2847p : super.mo1297x(l0Var, q0Var);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int x0(l0 l0Var, C8579n c8579n, q0 q0Var) {
        C1917s c1917s;
        ?? r82;
        int iM5623k;
        int iMo15903e;
        int iMo15911m;
        int iMo15903e2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f2856y.set(0, this.f2847p, true);
        C8579n c8579n2 = this.f2853v;
        int i15 = c8579n2.f41722i ? c8579n.f41718e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : c8579n.f41718e == 1 ? c8579n.f41720g + c8579n.f41715b : c8579n.f41719f - c8579n.f41715b;
        int i16 = c8579n.f41718e;
        for (int i17 = 0; i17 < this.f2847p; i17++) {
            if (!((ArrayList) this.f2848q[i17].f9051f).isEmpty()) {
                U0(this.f2848q[i17], i16, i15);
            }
        }
        int iMo15907i = this.f2855x ? this.f2849r.mo15907i() : this.f2849r.mo15911m();
        boolean z6 = false;
        while (true) {
            int i18 = c8579n.f41716c;
            if (i18 < 0 || i18 >= q0Var.m15894b() || (!c8579n2.f41722i && this.f2856y.isEmpty())) {
                break;
            }
            View view = l0Var.m15883i(c8579n.f41716c, Long.MAX_VALUE).f41792a;
            c8579n.f41716c += c8579n.f41717d;
            y0 y0Var = (y0) view.getLayoutParams();
            int iM15917b = y0Var.f41639a.m15917b();
            C0908c c0908c = this.f2837B;
            int[] iArr = (int[]) c0908c.f5574b;
            int i19 = (iArr == null || iM15917b >= iArr.length) ? -1 : iArr[iM15917b];
            if (i19 == -1) {
                if (L0(c8579n.f41718e)) {
                    i12 = this.f2847p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f2847p;
                    i12 = i13;
                }
                C1917s c1917s2 = null;
                if (c8579n.f41718e == i14) {
                    int iMo15911m2 = this.f2849r.mo15911m();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        C1917s c1917s3 = this.f2848q[i12];
                        int iM5621i = c1917s3.m5621i(iMo15911m2);
                        if (iM5621i < i20) {
                            i20 = iM5621i;
                            c1917s2 = c1917s3;
                        }
                        i12 += i10;
                    }
                } else {
                    int iMo15907i2 = this.f2849r.mo15907i();
                    int i21 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        C1917s c1917s4 = this.f2848q[i12];
                        int iM5623k2 = c1917s4.m5623k(iMo15907i2);
                        if (iM5623k2 > i21) {
                            c1917s2 = c1917s4;
                            i21 = iM5623k2;
                        }
                        i12 += i10;
                    }
                }
                c1917s = c1917s2;
                c0908c.m2564h(iM15917b);
                ((int[]) c0908c.f5574b)[iM15917b] = c1917s.f9050e;
            } else {
                c1917s = this.f2848q[i19];
            }
            y0Var.f41834e = c1917s;
            if (c8579n.f41718e == 1) {
                r82 = 0;
                m15855b(view, -1, false);
            } else {
                r82 = 0;
                m15855b(view, 0, false);
            }
            if (this.f2851t == 1) {
                J0(view, f0.m15848w(r82, this.f2852u, this.f41630l, r82, ((ViewGroup.MarginLayoutParams) y0Var).width), f0.m15848w(true, this.f41633o, this.f41631m, m15859z() + m15852C(), ((ViewGroup.MarginLayoutParams) y0Var).height));
            } else {
                J0(view, f0.m15848w(true, this.f41632n, this.f41630l, m15851B() + m15850A(), ((ViewGroup.MarginLayoutParams) y0Var).width), f0.m15848w(false, this.f2852u, this.f41631m, 0, ((ViewGroup.MarginLayoutParams) y0Var).height));
            }
            if (c8579n.f41718e == 1) {
                iMo15903e = c1917s.m5621i(iMo15907i);
                iM5623k = this.f2849r.mo15903e(view) + iMo15903e;
            } else {
                iM5623k = c1917s.m5623k(iMo15907i);
                iMo15903e = iM5623k - this.f2849r.mo15903e(view);
            }
            if (c8579n.f41718e == 1) {
                C1917s c1917s5 = y0Var.f41834e;
                c1917s5.getClass();
                y0 y0Var2 = (y0) view.getLayoutParams();
                y0Var2.f41834e = c1917s5;
                ArrayList arrayList = (ArrayList) c1917s5.f9051f;
                arrayList.add(view);
                c1917s5.f9048c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    c1917s5.f9047b = Integer.MIN_VALUE;
                }
                if (y0Var2.f41639a.m15923h() || y0Var2.f41639a.m15926k()) {
                    c1917s5.f9049d = ((StaggeredGridLayoutManager) c1917s5.f9052g).f2849r.mo15903e(view) + c1917s5.f9049d;
                }
            } else {
                C1917s c1917s6 = y0Var.f41834e;
                c1917s6.getClass();
                y0 y0Var3 = (y0) view.getLayoutParams();
                y0Var3.f41834e = c1917s6;
                ArrayList arrayList2 = (ArrayList) c1917s6.f9051f;
                arrayList2.add(0, view);
                c1917s6.f9047b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    c1917s6.f9048c = Integer.MIN_VALUE;
                }
                if (y0Var3.f41639a.m15923h() || y0Var3.f41639a.m15926k()) {
                    c1917s6.f9049d = ((StaggeredGridLayoutManager) c1917s6.f9052g).f2849r.mo15903e(view) + c1917s6.f9049d;
                }
            }
            if (I0() && this.f2851t == 1) {
                iMo15903e2 = this.f2850s.mo15907i() - (((this.f2847p - 1) - c1917s.f9050e) * this.f2852u);
                iMo15911m = iMo15903e2 - this.f2850s.mo15903e(view);
            } else {
                iMo15911m = this.f2850s.mo15911m() + (c1917s.f9050e * this.f2852u);
                iMo15903e2 = this.f2850s.mo15903e(view) + iMo15911m;
            }
            if (this.f2851t == 1) {
                f0.m15846J(view, iMo15911m, iMo15903e, iMo15903e2, iM5623k);
            } else {
                f0.m15846J(view, iMo15903e, iMo15911m, iM5623k, iMo15903e2);
            }
            U0(c1917s, c8579n2.f41718e, i15);
            N0(l0Var, c8579n2);
            if (c8579n2.f41721h && view.hasFocusable()) {
                this.f2856y.set(c1917s.f9050e, false);
            }
            i14 = 1;
            z6 = true;
            i13 = 0;
        }
        if (!z6) {
            N0(l0Var, c8579n2);
        }
        int iMo15911m3 = c8579n2.f41718e == -1 ? this.f2849r.mo15911m() - F0(this.f2849r.mo15911m()) : E0(this.f2849r.mo15907i()) - this.f2849r.mo15907i();
        if (iMo15911m3 > 0) {
            return Math.min(c8579n.f41715b, iMo15911m3);
        }
        return 0;
    }

    public final View y0(boolean z6) {
        int iMo15911m = this.f2849r.mo15911m();
        int iMo15907i = this.f2849r.mo15907i();
        View view = null;
        for (int iM15858v = m15858v() - 1; iM15858v >= 0; iM15858v--) {
            View viewM15857u = m15857u(iM15858v);
            int iMo15905g = this.f2849r.mo15905g(viewM15857u);
            int iMo15902d = this.f2849r.mo15902d(viewM15857u);
            if (iMo15902d > iMo15911m && iMo15905g < iMo15907i) {
                if (iMo15902d <= iMo15907i || !z6) {
                    return viewM15857u;
                }
                if (view == null) {
                    view = viewM15857u;
                }
            }
        }
        return view;
    }

    public final View z0(boolean z6) {
        int iMo15911m = this.f2849r.mo15911m();
        int iMo15907i = this.f2849r.mo15907i();
        int iM15858v = m15858v();
        View view = null;
        for (int i10 = 0; i10 < iM15858v; i10++) {
            View viewM15857u = m15857u(i10);
            int iMo15905g = this.f2849r.mo15905g(viewM15857u);
            if (this.f2849r.mo15902d(viewM15857u) > iMo15911m && iMo15905g < iMo15907i) {
                if (iMo15905g >= iMo15911m || !z6) {
                    return viewM15857u;
                }
                if (view == null) {
                    view = viewM15857u;
                }
            }
        }
        return view;
    }
}
