package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b2.C0558p;
import c6.v0;
import com.skydoves.balloon.internals.DefinitionKt;
import java.lang.reflect.Field;
import mm.AbstractC4801l;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import pg.h8;
import y7.AbstractC8586u;
import y7.C8580o;
import y7.C8581p;
import y7.C8582q;
import y7.C8583r;
import y7.C8584s;
import y7.e0;
import y7.f0;
import y7.g0;
import y7.l0;
import y7.p0;
import y7.q0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class LinearLayoutManager extends f0 implements p0 {

    /* renamed from: A */
    public final C8580o f2783A;

    /* renamed from: B */
    public final C8581p f2784B;

    /* renamed from: C */
    public final int f2785C;

    /* renamed from: D */
    public final int[] f2786D;

    /* renamed from: p */
    public int f2787p;

    /* renamed from: q */
    public C8582q f2788q;

    /* renamed from: r */
    public AbstractC8586u f2789r;

    /* renamed from: s */
    public boolean f2790s;

    /* renamed from: t */
    public final boolean f2791t;

    /* renamed from: u */
    public boolean f2792u;

    /* renamed from: v */
    public boolean f2793v;

    /* renamed from: w */
    public final boolean f2794w;

    /* renamed from: x */
    public int f2795x;

    /* renamed from: y */
    public int f2796y;

    /* renamed from: z */
    public C8583r f2797z;

    public LinearLayoutManager(int i10) {
        this.f2787p = 1;
        this.f2791t = false;
        this.f2792u = false;
        this.f2793v = false;
        this.f2794w = true;
        this.f2795x = -1;
        this.f2796y = Integer.MIN_VALUE;
        this.f2797z = null;
        this.f2783A = new C8580o();
        this.f2784B = new C8581p();
        this.f2785C = 2;
        this.f2786D = new int[2];
        U0(i10);
        mo1304c(null);
        if (this.f2791t) {
            this.f2791t = false;
            g0();
        }
    }

    public final int A0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f2787p == 1) ? 1 : Integer.MIN_VALUE : this.f2787p == 0 ? 1 : Integer.MIN_VALUE : this.f2787p == 1 ? -1 : Integer.MIN_VALUE : this.f2787p == 0 ? -1 : Integer.MIN_VALUE : (this.f2787p != 1 && N0()) ? -1 : 1 : (this.f2787p != 1 && N0()) ? 1 : -1;
    }

    public final void B0() {
        if (this.f2788q == null) {
            C8582q c8582q = new C8582q();
            c8582q.f41739a = true;
            c8582q.f41746h = 0;
            c8582q.f41747i = 0;
            c8582q.f41749k = null;
            this.f2788q = c8582q;
        }
    }

    public final int C0(l0 l0Var, C8582q c8582q, q0 q0Var, boolean z6) {
        int i10;
        int i11 = c8582q.f41741c;
        int i12 = c8582q.f41745g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                c8582q.f41745g = i12 + i11;
            }
            Q0(l0Var, c8582q);
        }
        int i13 = c8582q.f41741c + c8582q.f41746h;
        while (true) {
            if ((!c8582q.f41750l && i13 <= 0) || (i10 = c8582q.f41742d) < 0 || i10 >= q0Var.m15894b()) {
                break;
            }
            C8581p c8581p = this.f2784B;
            c8581p.f41735a = 0;
            c8581p.f41736b = false;
            c8581p.f41737c = false;
            c8581p.f41738d = false;
            O0(l0Var, q0Var, c8582q, c8581p);
            if (!c8581p.f41736b) {
                int i14 = c8582q.f41740b;
                int i15 = c8581p.f41735a;
                c8582q.f41740b = (c8582q.f41744f * i15) + i14;
                if (!c8581p.f41737c || c8582q.f41749k != null || !q0Var.f41757g) {
                    c8582q.f41741c -= i15;
                    i13 -= i15;
                }
                int i16 = c8582q.f41745g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    c8582q.f41745g = i17;
                    int i18 = c8582q.f41741c;
                    if (i18 < 0) {
                        c8582q.f41745g = i17 + i18;
                    }
                    Q0(l0Var, c8582q);
                }
                if (z6 && c8581p.f41738d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - c8582q.f41741c;
    }

    public final View D0(boolean z6) {
        return this.f2792u ? H0(0, m15858v(), z6) : H0(m15858v() - 1, -1, z6);
    }

    public final View E0(boolean z6) {
        return this.f2792u ? H0(m15858v() - 1, -1, z6) : H0(0, m15858v(), z6);
    }

    public final int F0() {
        View viewH0 = H0(m15858v() - 1, -1, false);
        if (viewH0 == null) {
            return -1;
        }
        return f0.m15843D(viewH0);
    }

    public final View G0(int i10, int i11) {
        int i12;
        int i13;
        B0();
        if (i11 <= i10 && i11 >= i10) {
            return m15857u(i10);
        }
        if (this.f2789r.mo15905g(m15857u(i10)) < this.f2789r.mo15911m()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f2787p == 0 ? this.f41621c.m2610t(i10, i11, i12, i13) : this.f41622d.m2610t(i10, i11, i12, i13);
    }

    @Override // y7.f0
    /* renamed from: H */
    public final boolean mo1298H() {
        return true;
    }

    public final View H0(int i10, int i11, boolean z6) {
        B0();
        int i12 = z6 ? 24579 : 320;
        return this.f2787p == 0 ? this.f41621c.m2610t(i10, i11, i12, DilithiumEngine.DilithiumPolyT1PackedBytes) : this.f41622d.m2610t(i10, i11, i12, DilithiumEngine.DilithiumPolyT1PackedBytes);
    }

    public View I0(l0 l0Var, q0 q0Var, int i10, int i11, int i12) {
        B0();
        int iMo15911m = this.f2789r.mo15911m();
        int iMo15907i = this.f2789r.mo15907i();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewM15857u = m15857u(i10);
            int iM15843D = f0.m15843D(viewM15857u);
            if (iM15843D >= 0 && iM15843D < i12) {
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

    public final int J0(int i10, l0 l0Var, q0 q0Var, boolean z6) {
        int iMo15907i;
        int iMo15907i2 = this.f2789r.mo15907i() - i10;
        if (iMo15907i2 <= 0) {
            return 0;
        }
        int i11 = -T0(-iMo15907i2, l0Var, q0Var);
        int i12 = i10 + i11;
        if (!z6 || (iMo15907i = this.f2789r.mo15907i() - i12) <= 0) {
            return i11;
        }
        this.f2789r.mo15915q(iMo15907i);
        return iMo15907i + i11;
    }

    public final int K0(int i10, l0 l0Var, q0 q0Var, boolean z6) {
        int iMo15911m;
        int iMo15911m2 = i10 - this.f2789r.mo15911m();
        if (iMo15911m2 <= 0) {
            return 0;
        }
        int i11 = -T0(iMo15911m2, l0Var, q0Var);
        int i12 = i10 + i11;
        if (!z6 || (iMo15911m = i12 - this.f2789r.mo15911m()) <= 0) {
            return i11;
        }
        this.f2789r.mo15915q(-iMo15911m);
        return i11 - iMo15911m;
    }

    public final View L0() {
        return m15857u(this.f2792u ? 0 : m15858v() - 1);
    }

    public final View M0() {
        return m15857u(this.f2792u ? m15858v() - 1 : 0);
    }

    @Override // y7.f0
    /* renamed from: N */
    public View mo1280N(View view, int i10, l0 l0Var, q0 q0Var) {
        int iA0;
        S0();
        if (m15858v() != 0 && (iA0 = A0(i10)) != Integer.MIN_VALUE) {
            B0();
            W0(iA0, (int) (this.f2789r.mo15912n() * 0.33333334f), false, q0Var);
            C8582q c8582q = this.f2788q;
            c8582q.f41745g = Integer.MIN_VALUE;
            c8582q.f41739a = false;
            C0(l0Var, c8582q, q0Var, true);
            View viewG0 = iA0 == -1 ? this.f2792u ? G0(m15858v() - 1, -1) : G0(0, m15858v()) : this.f2792u ? G0(0, m15858v()) : G0(m15858v() - 1, -1);
            View viewM0 = iA0 == -1 ? M0() : L0();
            if (!viewM0.hasFocusable()) {
                return viewG0;
            }
            if (viewG0 != null) {
                return viewM0;
            }
        }
        return null;
    }

    public final boolean N0() {
        RecyclerView recyclerView = this.f41620b;
        Field field = v0.f5527a;
        return recyclerView.getLayoutDirection() == 1;
    }

    @Override // y7.f0
    /* renamed from: O */
    public final void mo1300O(AccessibilityEvent accessibilityEvent) {
        super.mo1300O(accessibilityEvent);
        if (m15858v() > 0) {
            View viewH0 = H0(0, m15858v(), false);
            accessibilityEvent.setFromIndex(viewH0 == null ? -1 : f0.m15843D(viewH0));
            accessibilityEvent.setToIndex(F0());
        }
    }

    public void O0(l0 l0Var, q0 q0Var, C8582q c8582q, C8581p c8581p) {
        int iM15850A;
        int i10;
        int i11;
        int iMo15904f;
        View viewM15892b = c8582q.m15892b(l0Var);
        if (viewM15892b == null) {
            c8581p.f41736b = true;
            return;
        }
        g0 g0Var = (g0) viewM15892b.getLayoutParams();
        if (c8582q.f41749k == null) {
            if (this.f2792u == (c8582q.f41744f == -1)) {
                m15855b(viewM15892b, -1, false);
            } else {
                m15855b(viewM15892b, 0, false);
            }
        } else {
            if (this.f2792u == (c8582q.f41744f == -1)) {
                m15855b(viewM15892b, -1, true);
            } else {
                m15855b(viewM15892b, 0, true);
            }
        }
        g0 g0Var2 = (g0) viewM15892b.getLayoutParams();
        Rect rectM1325I = this.f41620b.m1325I(viewM15892b);
        int i12 = rectM1325I.left + rectM1325I.right;
        int i13 = rectM1325I.top + rectM1325I.bottom;
        int iM15848w = f0.m15848w(mo1305d(), this.f41632n, this.f41630l, m15851B() + m15850A() + ((ViewGroup.MarginLayoutParams) g0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) g0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) g0Var2).width);
        int iM15848w2 = f0.m15848w(mo1306e(), this.f41633o, this.f41631m, m15859z() + m15852C() + ((ViewGroup.MarginLayoutParams) g0Var2).topMargin + ((ViewGroup.MarginLayoutParams) g0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) g0Var2).height);
        if (p0(viewM15892b, iM15848w, iM15848w2, g0Var2)) {
            viewM15892b.measure(iM15848w, iM15848w2);
        }
        c8581p.f41735a = this.f2789r.mo15903e(viewM15892b);
        if (this.f2787p == 1) {
            if (N0()) {
                iMo15904f = this.f41632n - m15851B();
                iM15850A = iMo15904f - this.f2789r.mo15904f(viewM15892b);
            } else {
                iM15850A = m15850A();
                iMo15904f = this.f2789r.mo15904f(viewM15892b) + iM15850A;
            }
            if (c8582q.f41744f == -1) {
                i10 = c8582q.f41740b;
                i11 = i10 - c8581p.f41735a;
            } else {
                i11 = c8582q.f41740b;
                i10 = c8581p.f41735a + i11;
            }
        } else {
            int iM15852C = m15852C();
            int iMo15904f2 = this.f2789r.mo15904f(viewM15892b) + iM15852C;
            if (c8582q.f41744f == -1) {
                int i14 = c8582q.f41740b;
                int i15 = i14 - c8581p.f41735a;
                iMo15904f = i14;
                i10 = iMo15904f2;
                iM15850A = i15;
                i11 = iM15852C;
            } else {
                int i16 = c8582q.f41740b;
                int i17 = c8581p.f41735a + i16;
                iM15850A = i16;
                i10 = iMo15904f2;
                i11 = iM15852C;
                iMo15904f = i17;
            }
        }
        f0.m15846J(viewM15892b, iM15850A, i11, iMo15904f, i10);
        if (g0Var.f41639a.m15923h() || g0Var.f41639a.m15926k()) {
            c8581p.f41737c = true;
        }
        c8581p.f41738d = viewM15892b.hasFocusable();
    }

    public final void Q0(l0 l0Var, C8582q c8582q) {
        if (!c8582q.f41739a || c8582q.f41750l) {
            return;
        }
        int i10 = c8582q.f41745g;
        int i11 = c8582q.f41747i;
        if (c8582q.f41744f == -1) {
            int iM15858v = m15858v();
            if (i10 < 0) {
                return;
            }
            int iMo15906h = (this.f2789r.mo15906h() - i10) + i11;
            if (this.f2792u) {
                for (int i12 = 0; i12 < iM15858v; i12++) {
                    View viewM15857u = m15857u(i12);
                    if (this.f2789r.mo15905g(viewM15857u) < iMo15906h || this.f2789r.mo15914p(viewM15857u) < iMo15906h) {
                        R0(l0Var, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = iM15858v - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View viewM15857u2 = m15857u(i14);
                if (this.f2789r.mo15905g(viewM15857u2) < iMo15906h || this.f2789r.mo15914p(viewM15857u2) < iMo15906h) {
                    R0(l0Var, i13, i14);
                    return;
                }
            }
            return;
        }
        if (i10 < 0) {
            return;
        }
        int i15 = i10 - i11;
        int iM15858v2 = m15858v();
        if (!this.f2792u) {
            for (int i16 = 0; i16 < iM15858v2; i16++) {
                View viewM15857u3 = m15857u(i16);
                if (this.f2789r.mo15902d(viewM15857u3) > i15 || this.f2789r.mo15913o(viewM15857u3) > i15) {
                    R0(l0Var, 0, i16);
                    return;
                }
            }
            return;
        }
        int i17 = iM15858v2 - 1;
        for (int i18 = i17; i18 >= 0; i18--) {
            View viewM15857u4 = m15857u(i18);
            if (this.f2789r.mo15902d(viewM15857u4) > i15 || this.f2789r.mo15913o(viewM15857u4) > i15) {
                R0(l0Var, i17, i18);
                return;
            }
        }
    }

    public final void R0(l0 l0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewM15857u = m15857u(i10);
                e0(i10);
                l0Var.m15880f(viewM15857u);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewM15857u2 = m15857u(i12);
            e0(i12);
            l0Var.m15880f(viewM15857u2);
        }
    }

    public final void S0() {
        if (this.f2787p == 1 || !N0()) {
            this.f2792u = this.f2791t;
        } else {
            this.f2792u = !this.f2791t;
        }
    }

    public final int T0(int i10, l0 l0Var, q0 q0Var) {
        if (m15858v() != 0 && i10 != 0) {
            B0();
            this.f2788q.f41739a = true;
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            W0(i11, iAbs, true, q0Var);
            C8582q c8582q = this.f2788q;
            int iC0 = C0(l0Var, c8582q, q0Var, false) + c8582q.f41745g;
            if (iC0 >= 0) {
                if (iAbs > iC0) {
                    i10 = i11 * iC0;
                }
                this.f2789r.mo15915q(-i10);
                this.f2788q.f41748j = i10;
                return i10;
            }
        }
        return 0;
    }

    public final void U0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(AbstractC4801l.m9730d(i10, "invalid orientation:"));
        }
        mo1304c(null);
        if (i10 != this.f2787p || this.f2789r == null) {
            AbstractC8586u abstractC8586uM15932b = AbstractC8586u.m15932b(this, i10);
            this.f2789r = abstractC8586uM15932b;
            this.f2783A.f41724a = abstractC8586uM15932b;
            this.f2787p = i10;
            g0();
        }
    }

    public void V0(boolean z6) {
        mo1304c(null);
        if (this.f2793v == z6) {
            return;
        }
        this.f2793v = z6;
        g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0196  */
    @Override // y7.f0
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1287W(y7.l0 r18, y7.q0 r19) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo1287W(y7.l0, y7.q0):void");
    }

    public final void W0(int i10, int i11, boolean z6, q0 q0Var) {
        int iMo15911m;
        this.f2788q.f41750l = this.f2789r.mo15909k() == 0 && this.f2789r.mo15906h() == 0;
        this.f2788q.f41744f = i10;
        int[] iArr = this.f2786D;
        iArr[0] = 0;
        iArr[1] = 0;
        v0(q0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i10 == 1;
        C8582q c8582q = this.f2788q;
        int i12 = z10 ? iMax2 : iMax;
        c8582q.f41746h = i12;
        if (!z10) {
            iMax = iMax2;
        }
        c8582q.f41747i = iMax;
        if (z10) {
            c8582q.f41746h = this.f2789r.mo15908j() + i12;
            View viewL0 = L0();
            C8582q c8582q2 = this.f2788q;
            c8582q2.f41743e = this.f2792u ? -1 : 1;
            int iM15843D = f0.m15843D(viewL0);
            C8582q c8582q3 = this.f2788q;
            c8582q2.f41742d = iM15843D + c8582q3.f41743e;
            c8582q3.f41740b = this.f2789r.mo15902d(viewL0);
            iMo15911m = this.f2789r.mo15902d(viewL0) - this.f2789r.mo15907i();
        } else {
            View viewM0 = M0();
            C8582q c8582q4 = this.f2788q;
            c8582q4.f41746h = this.f2789r.mo15911m() + c8582q4.f41746h;
            C8582q c8582q5 = this.f2788q;
            c8582q5.f41743e = this.f2792u ? 1 : -1;
            int iM15843D2 = f0.m15843D(viewM0);
            C8582q c8582q6 = this.f2788q;
            c8582q5.f41742d = iM15843D2 + c8582q6.f41743e;
            c8582q6.f41740b = this.f2789r.mo15905g(viewM0);
            iMo15911m = (-this.f2789r.mo15905g(viewM0)) + this.f2789r.mo15911m();
        }
        C8582q c8582q7 = this.f2788q;
        c8582q7.f41741c = i11;
        if (z6) {
            c8582q7.f41741c = i11 - iMo15911m;
        }
        c8582q7.f41745g = iMo15911m;
    }

    @Override // y7.f0
    /* renamed from: X */
    public void mo1288X(q0 q0Var) {
        this.f2797z = null;
        this.f2795x = -1;
        this.f2796y = Integer.MIN_VALUE;
        this.f2783A.m15889d();
    }

    public final void X0(int i10, int i11) {
        this.f2788q.f41741c = this.f2789r.mo15907i() - i11;
        C8582q c8582q = this.f2788q;
        c8582q.f41743e = this.f2792u ? -1 : 1;
        c8582q.f41742d = i10;
        c8582q.f41744f = 1;
        c8582q.f41740b = i11;
        c8582q.f41745g = Integer.MIN_VALUE;
    }

    @Override // y7.f0
    /* renamed from: Y */
    public final void mo1301Y(Parcelable parcelable) {
        if (parcelable instanceof C8583r) {
            this.f2797z = (C8583r) parcelable;
            g0();
        }
    }

    public final void Y0(int i10, int i11) {
        this.f2788q.f41741c = i11 - this.f2789r.mo15911m();
        C8582q c8582q = this.f2788q;
        c8582q.f41742d = i10;
        c8582q.f41743e = this.f2792u ? 1 : -1;
        c8582q.f41744f = -1;
        c8582q.f41740b = i11;
        c8582q.f41745g = Integer.MIN_VALUE;
    }

    @Override // y7.f0
    /* renamed from: Z */
    public final Parcelable mo1302Z() {
        C8583r c8583r = this.f2797z;
        if (c8583r != null) {
            C8583r c8583r2 = new C8583r();
            c8583r2.f41765a = c8583r.f41765a;
            c8583r2.f41766b = c8583r.f41766b;
            c8583r2.f41767c = c8583r.f41767c;
            return c8583r2;
        }
        C8583r c8583r3 = new C8583r();
        if (m15858v() <= 0) {
            c8583r3.f41765a = -1;
            return c8583r3;
        }
        B0();
        boolean z6 = this.f2790s ^ this.f2792u;
        c8583r3.f41767c = z6;
        if (z6) {
            View viewL0 = L0();
            c8583r3.f41766b = this.f2789r.mo15907i() - this.f2789r.mo15902d(viewL0);
            c8583r3.f41765a = f0.m15843D(viewL0);
            return c8583r3;
        }
        View viewM0 = M0();
        c8583r3.f41765a = f0.m15843D(viewM0);
        c8583r3.f41766b = this.f2789r.mo15905g(viewM0) - this.f2789r.mo15911m();
        return c8583r3;
    }

    @Override // y7.p0
    /* renamed from: a */
    public final PointF mo1303a(int i10) {
        if (m15858v() == 0) {
            return null;
        }
        int i11 = (i10 < f0.m15843D(m15857u(0))) != this.f2792u ? -1 : 1;
        return this.f2787p == 0 ? new PointF(i11, DefinitionKt.NO_Float_VALUE) : new PointF(DefinitionKt.NO_Float_VALUE, i11);
    }

    @Override // y7.f0
    /* renamed from: c */
    public final void mo1304c(String str) {
        RecyclerView recyclerView;
        if (this.f2797z != null || (recyclerView = this.f41620b) == null) {
            return;
        }
        recyclerView.m1346h(str);
    }

    @Override // y7.f0
    /* renamed from: d */
    public final boolean mo1305d() {
        return this.f2787p == 0;
    }

    @Override // y7.f0
    /* renamed from: e */
    public final boolean mo1306e() {
        return this.f2787p == 1;
    }

    @Override // y7.f0
    /* renamed from: h */
    public final void mo1307h(int i10, int i11, q0 q0Var, C0558p c0558p) {
        if (this.f2787p != 0) {
            i10 = i11;
        }
        if (m15858v() == 0 || i10 == 0) {
            return;
        }
        B0();
        W0(i10 > 0 ? 1 : -1, Math.abs(i10), true, q0Var);
        w0(q0Var, this.f2788q, c0558p);
    }

    @Override // y7.f0
    public int h0(int i10, l0 l0Var, q0 q0Var) {
        if (this.f2787p == 1) {
            return 0;
        }
        return T0(i10, l0Var, q0Var);
    }

    @Override // y7.f0
    /* renamed from: i */
    public final void mo1308i(int i10, C0558p c0558p) {
        boolean z6;
        int i11;
        C8583r c8583r = this.f2797z;
        if (c8583r == null || (i11 = c8583r.f41765a) < 0) {
            S0();
            z6 = this.f2792u;
            i11 = this.f2795x;
            if (i11 == -1) {
                i11 = z6 ? i10 - 1 : 0;
            }
        } else {
            z6 = c8583r.f41767c;
        }
        int i12 = z6 ? -1 : 1;
        for (int i13 = 0; i13 < this.f2785C && i11 >= 0 && i11 < i10; i13++) {
            c0558p.m1654b(i11, 0);
            i11 += i12;
        }
    }

    @Override // y7.f0
    public final void i0(int i10) {
        this.f2795x = i10;
        this.f2796y = Integer.MIN_VALUE;
        C8583r c8583r = this.f2797z;
        if (c8583r != null) {
            c8583r.f41765a = -1;
        }
        g0();
    }

    @Override // y7.f0
    /* renamed from: j */
    public final int mo1309j(q0 q0Var) {
        return x0(q0Var);
    }

    @Override // y7.f0
    public int j0(int i10, l0 l0Var, q0 q0Var) {
        if (this.f2787p == 0) {
            return 0;
        }
        return T0(i10, l0Var, q0Var);
    }

    @Override // y7.f0
    /* renamed from: k */
    public int mo1290k(q0 q0Var) {
        return y0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: l */
    public int mo1291l(q0 q0Var) {
        return z0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: m */
    public final int mo1310m(q0 q0Var) {
        return x0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: n */
    public int mo1292n(q0 q0Var) {
        return y0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: o */
    public int mo1293o(q0 q0Var) {
        return z0(q0Var);
    }

    @Override // y7.f0
    /* renamed from: q */
    public final View mo1311q(int i10) {
        int iM15858v = m15858v();
        if (iM15858v == 0) {
            return null;
        }
        int iM15843D = i10 - f0.m15843D(m15857u(0));
        if (iM15843D >= 0 && iM15843D < iM15858v) {
            View viewM15857u = m15857u(iM15843D);
            if (f0.m15843D(viewM15857u) == i10) {
                return viewM15857u;
            }
        }
        return super.mo1311q(i10);
    }

    @Override // y7.f0
    public final boolean q0() {
        if (this.f41631m != 1073741824 && this.f41630l != 1073741824) {
            int iM15858v = m15858v();
            for (int i10 = 0; i10 < iM15858v; i10++) {
                ViewGroup.LayoutParams layoutParams = m15857u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y7.f0
    /* renamed from: r */
    public g0 mo1294r() {
        return new g0(-2, -2);
    }

    @Override // y7.f0
    public void s0(RecyclerView recyclerView, int i10) {
        C8584s c8584s = new C8584s(recyclerView.getContext());
        c8584s.f41768a = i10;
        t0(c8584s);
    }

    @Override // y7.f0
    public boolean u0() {
        return this.f2797z == null && this.f2790s == this.f2793v;
    }

    public void v0(q0 q0Var, int[] iArr) {
        int i10;
        int iMo15912n = q0Var.f41751a != -1 ? this.f2789r.mo15912n() : 0;
        if (this.f2788q.f41744f == -1) {
            i10 = 0;
        } else {
            i10 = iMo15912n;
            iMo15912n = 0;
        }
        iArr[0] = iMo15912n;
        iArr[1] = i10;
    }

    public void w0(q0 q0Var, C8582q c8582q, C0558p c0558p) {
        int i10 = c8582q.f41742d;
        if (i10 < 0 || i10 >= q0Var.m15894b()) {
            return;
        }
        c0558p.m1654b(i10, Math.max(0, c8582q.f41745g));
    }

    public final int x0(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        B0();
        AbstractC8586u abstractC8586u = this.f2789r;
        boolean z6 = !this.f2794w;
        return h8.m11683b(q0Var, abstractC8586u, E0(z6), D0(z6), this, this.f2794w);
    }

    public final int y0(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        B0();
        AbstractC8586u abstractC8586u = this.f2789r;
        boolean z6 = !this.f2794w;
        return h8.m11684c(q0Var, abstractC8586u, E0(z6), D0(z6), this, this.f2794w, this.f2792u);
    }

    public final int z0(q0 q0Var) {
        if (m15858v() == 0) {
            return 0;
        }
        B0();
        AbstractC8586u abstractC8586u = this.f2789r;
        boolean z6 = !this.f2794w;
        return h8.m11685d(q0Var, abstractC8586u, E0(z6), D0(z6), this, this.f2794w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2787p = 1;
        this.f2791t = false;
        this.f2792u = false;
        this.f2793v = false;
        this.f2794w = true;
        this.f2795x = -1;
        this.f2796y = Integer.MIN_VALUE;
        this.f2797z = null;
        this.f2783A = new C8580o();
        this.f2784B = new C8581p();
        this.f2785C = 2;
        this.f2786D = new int[2];
        e0 e0VarM15844E = f0.m15844E(context, attributeSet, i10, i11);
        U0(e0VarM15844E.f41609a);
        boolean z6 = e0VarM15844E.f41611c;
        mo1304c(null);
        if (z6 != this.f2791t) {
            this.f2791t = z6;
            g0();
        }
        V0(e0VarM15844E.f41612d);
    }

    @Override // y7.f0
    /* renamed from: M */
    public final void mo1299M(RecyclerView recyclerView) {
    }

    public void P0(l0 l0Var, q0 q0Var, C8580o c8580o, int i10) {
    }
}
