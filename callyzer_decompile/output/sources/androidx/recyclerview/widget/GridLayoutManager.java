package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import b2.C0558p;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;
import d6.C1616f;
import d6.C1617g;
import java.lang.reflect.Field;
import java.util.Arrays;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import y7.C8578m;
import y7.C8580o;
import y7.C8581p;
import y7.C8582q;
import y7.f0;
import y7.g0;
import y7.l0;
import y7.q0;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f2775E;

    /* renamed from: F */
    public int f2776F;

    /* renamed from: G */
    public int[] f2777G;

    /* renamed from: H */
    public View[] f2778H;

    /* renamed from: I */
    public final SparseIntArray f2779I;

    /* renamed from: J */
    public final SparseIntArray f2780J;

    /* renamed from: K */
    public final C8849i f2781K;

    /* renamed from: L */
    public final Rect f2782L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2775E = false;
        this.f2776F = -1;
        this.f2779I = new SparseIntArray();
        this.f2780J = new SparseIntArray();
        this.f2781K = new C8849i(24);
        this.f2782L = new Rect();
        g1(f0.m15844E(context, attributeSet, i10, i11).f41610b);
    }

    @Override // y7.f0
    /* renamed from: F */
    public final int mo1279F(l0 l0Var, q0 q0Var) {
        if (this.f2787p == 0) {
            return this.f2776F;
        }
        if (q0Var.m15894b() < 1) {
            return 0;
        }
        return c1(q0Var.m15894b() - 1, l0Var, q0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View I0(l0 l0Var, q0 q0Var, int i10, int i11, int i12) {
        B0();
        int iMo15911m = this.f2789r.mo15911m();
        int iMo15907i = this.f2789r.mo15907i();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewM15857u = m15857u(i10);
            int iM15843D = f0.m15843D(viewM15857u);
            if (iM15843D >= 0 && iM15843D < i12 && d1(iM15843D, l0Var, q0Var) == 0) {
                if (((g0) viewM15857u.getLayoutParams()).f41639a.m15923h()) {
                    if (view2 == null) {
                        view2 = viewM15857u;
                    }
                } else {
                    if (this.f2789r.mo15905g(viewM15857u) < iMo15907i && this.f2789r.mo15902d(viewM15857u) >= iMo15911m) {
                        return viewM15857u;
                    }
                    if (view == null) {
                        view = viewM15857u;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e2, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0142, code lost:
    
        if (r16 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0144, code lost:
    
        return r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        return r17;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mo1280N(android.view.View r23, int r24, y7.l0 r25, y7.q0 r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo1280N(android.view.View, int, y7.l0, y7.q0):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void O0(l0 l0Var, q0 q0Var, C8582q c8582q, C8581p c8581p) {
        int i10;
        int i11;
        int i12;
        int iMo15904f;
        int iMo15904f2;
        int iM15850A;
        int i13;
        int iM15848w;
        int iM15848w2;
        ?? r12;
        int i14;
        View viewM15892b;
        int iMo15910l = this.f2789r.mo15910l();
        boolean z6 = iMo15910l != 1073741824;
        int i15 = m15858v() > 0 ? this.f2777G[this.f2776F] : 0;
        if (z6) {
            h1();
        }
        boolean z10 = c8582q.f41743e == 1;
        int iD1 = this.f2776F;
        if (!z10) {
            iD1 = d1(c8582q.f41742d, l0Var, q0Var) + e1(c8582q.f41742d, l0Var, q0Var);
        }
        int i16 = 0;
        while (i16 < this.f2776F && (i14 = c8582q.f41742d) >= 0 && i14 < q0Var.m15894b() && iD1 > 0) {
            int i17 = c8582q.f41742d;
            int iE1 = e1(i17, l0Var, q0Var);
            if (iE1 > this.f2776F) {
                throw new IllegalArgumentException(AbstractC5601a.m11233d(this.f2776F, " spans.", AbstractC1452a.m4566m(i17, iE1, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iD1 -= iE1;
            if (iD1 < 0 || (viewM15892b = c8582q.m15892b(l0Var)) == null) {
                break;
            }
            this.f2778H[i16] = viewM15892b;
            i16++;
        }
        if (i16 == 0) {
            c8581p.f41736b = true;
            return;
        }
        if (z10) {
            i12 = 1;
            i11 = i16;
            i10 = 0;
        } else {
            i10 = i16 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i18 = 0;
        while (i10 != i11) {
            View view = this.f2778H[i10];
            C8578m c8578m = (C8578m) view.getLayoutParams();
            int iE12 = e1(f0.m15843D(view), l0Var, q0Var);
            c8578m.f41713f = iE12;
            c8578m.f41712e = i18;
            i18 += iE12;
            i10 += i12;
        }
        float f6 = DefinitionKt.NO_Float_VALUE;
        int i19 = 0;
        for (int i20 = 0; i20 < i16; i20++) {
            View view2 = this.f2778H[i20];
            if (c8582q.f41749k != null) {
                r12 = 0;
                r12 = 0;
                if (z10) {
                    m15855b(view2, -1, true);
                } else {
                    m15855b(view2, 0, true);
                }
            } else if (z10) {
                r12 = 0;
                m15855b(view2, -1, false);
            } else {
                r12 = 0;
                m15855b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f41620b;
            Rect rect = this.f2782L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.m1325I(view2));
            }
            f1(view2, iMo15910l, r12);
            int iMo15903e = this.f2789r.mo15903e(view2);
            if (iMo15903e > i19) {
                i19 = iMo15903e;
            }
            float fMo15904f = (this.f2789r.mo15904f(view2) * 1.0f) / ((C8578m) view2.getLayoutParams()).f41713f;
            if (fMo15904f > f6) {
                f6 = fMo15904f;
            }
        }
        if (z6) {
            Z0(Math.max(Math.round(f6 * this.f2776F), i15));
            i19 = 0;
            for (int i21 = 0; i21 < i16; i21++) {
                View view3 = this.f2778H[i21];
                f1(view3, 1073741824, true);
                int iMo15903e2 = this.f2789r.mo15903e(view3);
                if (iMo15903e2 > i19) {
                    i19 = iMo15903e2;
                }
            }
        }
        for (int i22 = 0; i22 < i16; i22++) {
            View view4 = this.f2778H[i22];
            if (this.f2789r.mo15903e(view4) != i19) {
                C8578m c8578m2 = (C8578m) view4.getLayoutParams();
                Rect rect2 = c8578m2.f41640b;
                int i23 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c8578m2).topMargin + ((ViewGroup.MarginLayoutParams) c8578m2).bottomMargin;
                int i24 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c8578m2).leftMargin + ((ViewGroup.MarginLayoutParams) c8578m2).rightMargin;
                int iB1 = b1(c8578m2.f41712e, c8578m2.f41713f);
                if (this.f2787p == 1) {
                    iM15848w2 = f0.m15848w(false, iB1, 1073741824, i24, ((ViewGroup.MarginLayoutParams) c8578m2).width);
                    iM15848w = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    iM15848w = f0.m15848w(false, iB1, 1073741824, i23, ((ViewGroup.MarginLayoutParams) c8578m2).height);
                    iM15848w2 = iMakeMeasureSpec;
                }
                if (r0(view4, iM15848w2, iM15848w, (g0) view4.getLayoutParams())) {
                    view4.measure(iM15848w2, iM15848w);
                }
            }
        }
        c8581p.f41735a = i19;
        if (this.f2787p == 1) {
            if (c8582q.f41744f == -1) {
                int i25 = c8582q.f41740b;
                i13 = i25 - i19;
                iMo15904f2 = i25;
            } else {
                i13 = c8582q.f41740b;
                iMo15904f2 = i13 + i19;
            }
            iM15850A = 0;
            iMo15904f = 0;
        } else {
            if (c8582q.f41744f == -1) {
                int i26 = c8582q.f41740b;
                iM15850A = i26 - i19;
                iMo15904f2 = 0;
                iMo15904f = i26;
            } else {
                int i27 = c8582q.f41740b;
                iMo15904f = i27 + i19;
                iMo15904f2 = 0;
                iM15850A = i27;
            }
            i13 = iMo15904f2;
        }
        for (int i28 = 0; i28 < i16; i28++) {
            View view5 = this.f2778H[i28];
            C8578m c8578m3 = (C8578m) view5.getLayoutParams();
            if (this.f2787p != 1) {
                int iM15852C = m15852C() + this.f2777G[c8578m3.f41712e];
                i13 = iM15852C;
                iMo15904f2 = this.f2789r.mo15904f(view5) + iM15852C;
            } else if (N0()) {
                int iM15850A2 = m15850A() + this.f2777G[this.f2776F - c8578m3.f41712e];
                iMo15904f = iM15850A2;
                iM15850A = iM15850A2 - this.f2789r.mo15904f(view5);
            } else {
                iM15850A = m15850A() + this.f2777G[c8578m3.f41712e];
                iMo15904f = this.f2789r.mo15904f(view5) + iM15850A;
            }
            f0.m15846J(view5, iM15850A, i13, iMo15904f, iMo15904f2);
            if (c8578m3.f41639a.m15923h() || c8578m3.f41639a.m15926k()) {
                c8581p.f41737c = true;
            }
            c8581p.f41738d = view5.hasFocusable() | c8581p.f41738d;
        }
        Arrays.fill(this.f2778H, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(l0 l0Var, q0 q0Var, C8580o c8580o, int i10) {
        h1();
        if (q0Var.m15894b() > 0 && !q0Var.f41757g) {
            boolean z6 = i10 == 1;
            int iD1 = d1(c8580o.f41725b, l0Var, q0Var);
            if (z6) {
                while (iD1 > 0) {
                    int i11 = c8580o.f41725b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    c8580o.f41725b = i12;
                    iD1 = d1(i12, l0Var, q0Var);
                }
            } else {
                int iM15894b = q0Var.m15894b() - 1;
                int i13 = c8580o.f41725b;
                while (i13 < iM15894b) {
                    int i14 = i13 + 1;
                    int iD12 = d1(i14, l0Var, q0Var);
                    if (iD12 <= iD1) {
                        break;
                    }
                    i13 = i14;
                    iD1 = iD12;
                }
                c8580o.f41725b = i13;
            }
        }
        a1();
    }

    @Override // y7.f0
    /* renamed from: Q */
    public final void mo1281Q(l0 l0Var, q0 q0Var, View view, C1617g c1617g) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C8578m)) {
            m15854P(view, c1617g);
            return;
        }
        C8578m c8578m = (C8578m) layoutParams;
        int iC1 = c1(c8578m.f41639a.m15917b(), l0Var, q0Var);
        if (this.f2787p == 0) {
            c1617g.m5294m(C1616f.m5280a(false, c8578m.f41712e, c8578m.f41713f, iC1, 1));
        } else {
            c1617g.m5294m(C1616f.m5280a(false, iC1, 1, c8578m.f41712e, c8578m.f41713f));
        }
    }

    @Override // y7.f0
    /* renamed from: R */
    public final void mo1282R(int i10, int i11) {
        C8849i c8849i = this.f2781K;
        c8849i.m16324w();
        ((SparseIntArray) c8849i.f42584c).clear();
    }

    @Override // y7.f0
    /* renamed from: S */
    public final void mo1283S() {
        C8849i c8849i = this.f2781K;
        c8849i.m16324w();
        ((SparseIntArray) c8849i.f42584c).clear();
    }

    @Override // y7.f0
    /* renamed from: T */
    public final void mo1284T(int i10, int i11) {
        C8849i c8849i = this.f2781K;
        c8849i.m16324w();
        ((SparseIntArray) c8849i.f42584c).clear();
    }

    @Override // y7.f0
    /* renamed from: U */
    public final void mo1285U(int i10, int i11) {
        C8849i c8849i = this.f2781K;
        c8849i.m16324w();
        ((SparseIntArray) c8849i.f42584c).clear();
    }

    @Override // y7.f0
    /* renamed from: V */
    public final void mo1286V(int i10, int i11) {
        C8849i c8849i = this.f2781K;
        c8849i.m16324w();
        ((SparseIntArray) c8849i.f42584c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(boolean z6) {
        if (z6) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.V0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: W */
    public final void mo1287W(l0 l0Var, q0 q0Var) {
        boolean z6 = q0Var.f41757g;
        SparseIntArray sparseIntArray = this.f2780J;
        SparseIntArray sparseIntArray2 = this.f2779I;
        if (z6) {
            int iM15858v = m15858v();
            for (int i10 = 0; i10 < iM15858v; i10++) {
                C8578m c8578m = (C8578m) m15857u(i10).getLayoutParams();
                int iM15917b = c8578m.f41639a.m15917b();
                sparseIntArray2.put(iM15917b, c8578m.f41713f);
                sparseIntArray.put(iM15917b, c8578m.f41712e);
            }
        }
        super.mo1287W(l0Var, q0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: X */
    public final void mo1288X(q0 q0Var) {
        super.mo1288X(q0Var);
        this.f2775E = false;
    }

    public final void Z0(int i10) {
        int i11;
        int[] iArr = this.f2777G;
        int i12 = this.f2776F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.f2777G = iArr;
    }

    public final void a1() {
        View[] viewArr = this.f2778H;
        if (viewArr == null || viewArr.length != this.f2776F) {
            this.f2778H = new View[this.f2776F];
        }
    }

    public final int b1(int i10, int i11) {
        if (this.f2787p != 1 || !N0()) {
            int[] iArr = this.f2777G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.f2777G;
        int i12 = this.f2776F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int c1(int i10, l0 l0Var, q0 q0Var) {
        boolean z6 = q0Var.f41757g;
        C8849i c8849i = this.f2781K;
        if (!z6) {
            int i11 = this.f2776F;
            c8849i.getClass();
            return C8849i.m16310u(i10, i11);
        }
        int iM15876b = l0Var.m15876b(i10);
        if (iM15876b == -1) {
            return 0;
        }
        int i12 = this.f2776F;
        c8849i.getClass();
        return C8849i.m16310u(iM15876b, i12);
    }

    public final int d1(int i10, l0 l0Var, q0 q0Var) {
        boolean z6 = q0Var.f41757g;
        C8849i c8849i = this.f2781K;
        if (!z6) {
            int i11 = this.f2776F;
            c8849i.getClass();
            return i10 % i11;
        }
        int i12 = this.f2780J.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int iM15876b = l0Var.m15876b(i10);
        if (iM15876b == -1) {
            return 0;
        }
        int i13 = this.f2776F;
        c8849i.getClass();
        return iM15876b % i13;
    }

    public final int e1(int i10, l0 l0Var, q0 q0Var) {
        boolean z6 = q0Var.f41757g;
        C8849i c8849i = this.f2781K;
        if (!z6) {
            c8849i.getClass();
            return 1;
        }
        int i11 = this.f2779I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (l0Var.m15876b(i10) == -1) {
            return 1;
        }
        c8849i.getClass();
        return 1;
    }

    @Override // y7.f0
    /* renamed from: f */
    public final boolean mo1289f(g0 g0Var) {
        return g0Var instanceof C8578m;
    }

    public final void f1(View view, int i10, boolean z6) {
        int iM15848w;
        int iM15848w2;
        C8578m c8578m = (C8578m) view.getLayoutParams();
        Rect rect = c8578m.f41640b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c8578m).topMargin + ((ViewGroup.MarginLayoutParams) c8578m).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c8578m).leftMargin + ((ViewGroup.MarginLayoutParams) c8578m).rightMargin;
        int iB1 = b1(c8578m.f41712e, c8578m.f41713f);
        if (this.f2787p == 1) {
            iM15848w2 = f0.m15848w(false, iB1, i10, i12, ((ViewGroup.MarginLayoutParams) c8578m).width);
            iM15848w = f0.m15848w(true, this.f2789r.mo15912n(), this.f41631m, i11, ((ViewGroup.MarginLayoutParams) c8578m).height);
        } else {
            int iM15848w3 = f0.m15848w(false, iB1, i10, i11, ((ViewGroup.MarginLayoutParams) c8578m).height);
            int iM15848w4 = f0.m15848w(true, this.f2789r.mo15912n(), this.f41630l, i12, ((ViewGroup.MarginLayoutParams) c8578m).width);
            iM15848w = iM15848w3;
            iM15848w2 = iM15848w4;
        }
        g0 g0Var = (g0) view.getLayoutParams();
        if (z6 ? r0(view, iM15848w2, iM15848w, g0Var) : p0(view, iM15848w2, iM15848w, g0Var)) {
            view.measure(iM15848w2, iM15848w);
        }
    }

    public final void g1(int i10) {
        if (i10 == this.f2776F) {
            return;
        }
        this.f2775E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "Span count should be at least 1. Provided "));
        }
        this.f2776F = i10;
        this.f2781K.m16324w();
        g0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    public final int h0(int i10, l0 l0Var, q0 q0Var) {
        h1();
        a1();
        return super.h0(i10, l0Var, q0Var);
    }

    public final void h1() {
        int iM15859z;
        int iM15852C;
        if (this.f2787p == 1) {
            iM15859z = this.f41632n - m15851B();
            iM15852C = m15850A();
        } else {
            iM15859z = this.f41633o - m15859z();
            iM15852C = m15852C();
        }
        Z0(iM15859z - iM15852C);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    public final int j0(int i10, l0 l0Var, q0 q0Var) {
        h1();
        a1();
        return super.j0(i10, l0Var, q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: k */
    public final int mo1290k(q0 q0Var) {
        return y0(q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: l */
    public final int mo1291l(q0 q0Var) {
        return z0(q0Var);
    }

    @Override // y7.f0
    public final void m0(Rect rect, int i10, int i11) {
        int iM15847g;
        int iM15847g2;
        if (this.f2777G == null) {
            super.m0(rect, i10, i11);
        }
        int iM15851B = m15851B() + m15850A();
        int iM15859z = m15859z() + m15852C();
        if (this.f2787p == 1) {
            int iHeight = rect.height() + iM15859z;
            RecyclerView recyclerView = this.f41620b;
            Field field = v0.f5527a;
            iM15847g2 = f0.m15847g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.f2777G;
            iM15847g = f0.m15847g(i10, iArr[iArr.length - 1] + iM15851B, this.f41620b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iM15851B;
            RecyclerView recyclerView2 = this.f41620b;
            Field field2 = v0.f5527a;
            iM15847g = f0.m15847g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.f2777G;
            iM15847g2 = f0.m15847g(i11, iArr2[iArr2.length - 1] + iM15859z, this.f41620b.getMinimumHeight());
        }
        this.f41620b.setMeasuredDimension(iM15847g, iM15847g2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: n */
    public final int mo1292n(q0 q0Var) {
        return y0(q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: o */
    public final int mo1293o(q0 q0Var) {
        return z0(q0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    /* renamed from: r */
    public final g0 mo1294r() {
        return this.f2787p == 0 ? new C8578m(-2, -1) : new C8578m(-1, -2);
    }

    @Override // y7.f0
    /* renamed from: s */
    public final g0 mo1295s(Context context, AttributeSet attributeSet) {
        C8578m c8578m = new C8578m(context, attributeSet);
        c8578m.f41712e = -1;
        c8578m.f41713f = 0;
        return c8578m;
    }

    @Override // y7.f0
    /* renamed from: t */
    public final g0 mo1296t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            C8578m c8578m = new C8578m((ViewGroup.MarginLayoutParams) layoutParams);
            c8578m.f41712e = -1;
            c8578m.f41713f = 0;
            return c8578m;
        }
        C8578m c8578m2 = new C8578m(layoutParams);
        c8578m2.f41712e = -1;
        c8578m2.f41713f = 0;
        return c8578m2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, y7.f0
    public final boolean u0() {
        return this.f2797z == null && !this.f2775E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(q0 q0Var, C8582q c8582q, C0558p c0558p) {
        int i10;
        int i11 = this.f2776F;
        for (int i12 = 0; i12 < this.f2776F && (i10 = c8582q.f41742d) >= 0 && i10 < q0Var.m15894b() && i11 > 0; i12++) {
            c0558p.m1654b(c8582q.f41742d, Math.max(0, c8582q.f41745g));
            this.f2781K.getClass();
            i11--;
            c8582q.f41742d += c8582q.f41743e;
        }
    }

    @Override // y7.f0
    /* renamed from: x */
    public final int mo1297x(l0 l0Var, q0 q0Var) {
        if (this.f2787p == 1) {
            return this.f2776F;
        }
        if (q0Var.m15894b() < 1) {
            return 0;
        }
        return c1(q0Var.m15894b() - 1, l0Var, q0Var) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.f2775E = false;
        this.f2776F = -1;
        this.f2779I = new SparseIntArray();
        this.f2780J = new SparseIntArray();
        this.f2781K = new C8849i(24);
        this.f2782L = new Rect();
        g1(i10);
    }
}
