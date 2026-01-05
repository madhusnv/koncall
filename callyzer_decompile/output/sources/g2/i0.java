package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import com.websoptimization.callyzerbiz.R;
import d4.AbstractC1586n;
import d4.C1587o;
import ex.InterfaceC2139c;
import h2.AbstractC2812q;
import j2.EnumC3525e;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import s2.AbstractC6740i;
import w1.C7860d;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a */
    public static final i0 f11776a = new i0();

    /* renamed from: b */
    public static final float f11777b;

    static {
        EnumC3525e enumC3525e = j2.i0.f18607a;
        float f6 = j2.i0.f18612f;
        f11777b = 640;
    }

    /* renamed from: a */
    public final void m6171a(InterfaceC7879r interfaceC7879r, float f6, float f10, d3.l0 l0Var, long j6, InterfaceC3962k interfaceC3962k, int i10) {
        float f11;
        float f12;
        InterfaceC7879r interfaceC7879r2;
        d3.l0 l0Var2;
        long j10;
        C3966o c3966o;
        float f13;
        float f14;
        InterfaceC7879r interfaceC7879r3;
        d3.l0 l0Var3;
        long j11;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1364277227);
        if (((i10 | 9654) & 9363) == 9362 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            f13 = f6;
            f14 = f10;
            l0Var3 = l0Var;
            j11 = j6;
            c3966o = c3966o2;
        } else {
            c3966o2.m8603U();
            if ((i10 & 1) == 0 || c3966o2.m8584A()) {
                f11 = j2.i0.f18611e;
                f12 = j2.i0.f18610d;
                C7860d c7860d = ((ca) c3966o2.m8618k(ea.f11475a)).f11322e;
                long jM6345d = y1.m6345d(j2.i0.f18609c, c3966o2);
                interfaceC7879r2 = C7876o.f37669a;
                l0Var2 = c7860d;
                j10 = jM6345d;
            } else {
                c3966o2.m8601S();
                interfaceC7879r2 = interfaceC7879r;
                f11 = f6;
                f12 = f10;
                l0Var2 = l0Var;
                j10 = j6;
            }
            c3966o2.m8624q();
            String strM6916h = AbstractC2812q.m6916h(c3966o2, R.string.m3c_bottom_sheet_drag_handle_description);
            InterfaceC7879r interfaceC7879rM658l = AbstractC0242a.m658l(interfaceC7879r2, DefinitionKt.NO_Float_VALUE, ha.f11741a, 1);
            boolean zM8614g = c3966o2.m8614g(strM6916h);
            Object objM8596M = c3966o2.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C1587o(strM6916h, 3);
                c3966o2.j0(objM8596M);
            }
            c3966o = c3966o2;
            fb.m6164a(AbstractC1586n.m5204b(interfaceC7879rM658l, false, (InterfaceC2139c) objM8596M), l0Var2, j10, 0L, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(-1039573072, new g0(f11, f12), c3966o2), c3966o, 12582912, 120);
            f13 = f11;
            f14 = f12;
            interfaceC7879r3 = interfaceC7879r2;
            l0Var3 = l0Var2;
            j11 = j10;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new h0(this, interfaceC7879r3, f13, f14, l0Var3, j11, i10);
        }
    }
}
