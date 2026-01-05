package hz;

import android.view.View;
import androidx.compose.foundation.layout.AbstractC0245d;
import b2.C0543a;
import b2.C0546d;
import b2.C0547e;
import b2.C0548f;
import b2.C0549g;
import b2.C0552j;
import b2.C0556n;
import b2.InterfaceC0557o;
import b2.g0;
import d4.AbstractC1586n;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.n1;
import o1.AbstractC5244c;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import r4.EnumC6455j;
import s2.AbstractC6740i;
import s2.C6734c;
import w2.AbstractC7862a;
import w2.C7868g;
import w2.InterfaceC7866e;
import w2.InterfaceC7879r;
import w3.k1;
import w3.t2;
import w4.AbstractC7917i;
import w4.C7931w;
import w4.EnumC7932x;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hz.b */
/* loaded from: classes3.dex */
public abstract class AbstractC3063b {
    /* renamed from: a */
    public static final void m7287a(InterfaceC0557o interfaceC0557o, InterfaceC7866e interfaceC7866e, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(476043083);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(interfaceC0557o) : c3966o.m8616i(interfaceC0557o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8614g(interfaceC7866e) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8616i(c6734c) ? 256 : 128;
        }
        boolean z6 = false;
        if (c3966o.m8598P(i11 & 1, (i11 & 147) != 146)) {
            boolean z10 = (i11 & 112) == 32;
            if ((i11 & 14) == 4 || ((i11 & 8) != 0 && c3966o.m8614g(interfaceC0557o))) {
                z6 = true;
            }
            boolean z11 = z10 | z6;
            Object objM8596M = c3966o.m8596M();
            if (z11 || objM8596M == C3961j.f20408a) {
                objM8596M = new C0556n(interfaceC7866e, interfaceC0557o);
                c3966o.j0(objM8596M);
            }
            AbstractC7917i.m15047a((C0556n) objM8596M, null, new C7931w(false, true, true, EnumC7932x.Inherit, false), c6734c, c3966o, ((i11 << 3) & 7168) | KyberEngine.KyberPolyBytes, 2);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0543a(interfaceC0557o, interfaceC7866e, c6734c, i10, 0);
        }
    }

    /* renamed from: b */
    public static final void m7288b(InterfaceC0557o interfaceC0557o, boolean z6, EnumC6455j enumC6455j, boolean z10, long j6, float f6, InterfaceC7879r interfaceC7879r, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        long j10;
        int i12;
        long j11;
        boolean z11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-466280168);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? c3966o.m8614g(interfaceC0557o) : c3966o.m8616i(interfaceC0557o) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8615h(z6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(enumC6455j) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(z10) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 1048576 : 524288;
        }
        if (c3966o.m8598P(i11 & 1, (533651 & i11) != 533650)) {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                i12 = i11 & (-57345);
                j11 = 9205357640488583168L;
            } else {
                c3966o.m8601S();
                i12 = i11 & (-57345);
                j11 = j6;
            }
            c3966o.m8624q();
            if (z6) {
                float f10 = g0.f3745a;
                z11 = (enumC6455j == EnumC6455j.Ltr && !z10) || (enumC6455j == EnumC6455j.Rtl && z10);
            } else {
                float f11 = g0.f3745a;
                z11 = !((enumC6455j == EnumC6455j.Ltr && !z10) || (enumC6455j == EnumC6455j.Rtl && z10));
            }
            C7868g c7868g = z11 ? AbstractC7862a.f37637b : AbstractC7862a.f37636a;
            int i13 = i12 & 14;
            boolean zM8615h = ((i12 & 112) == 32) | (i13 == 4 || ((i12 & 8) != 0 && c3966o.m8616i(interfaceC0557o))) | c3966o.m8615h(z11);
            Object objM8596M = c3966o.m8596M();
            if (zM8615h || objM8596M == C3961j.f20408a) {
                objM8596M = new C0548f(interfaceC0557o, z6, z11);
                c3966o.j0(objM8596M);
            }
            long j12 = j11;
            C7868g c7868g2 = c7868g;
            j10 = j12;
            m7287a(interfaceC0557o, c7868g2, AbstractC6740i.m12902d(1365123137, new C0546d((t2) c3966o.m8618k(k1.f37847s), j10, z11, AbstractC1586n.m5204b(interfaceC7879r, false, (InterfaceC2139c) objM8596M), interfaceC0557o), c3966o), c3966o, i13 | KyberEngine.KyberPolyBytes);
        } else {
            c3966o.m8601S();
            j10 = j6;
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0547e(interfaceC0557o, z6, enumC6455j, z10, j10, f6, interfaceC7879r, i10);
        }
    }

    /* renamed from: c */
    public static final void m7289c(InterfaceC7879r interfaceC7879r, InterfaceC2137a interfaceC2137a, boolean z6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(2111672474);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i12 = i11 | (c3966o.m8616i(interfaceC2137a) ? 32 : 16) | (c3966o.m8615h(z6) ? 256 : 128);
        if (c3966o.m8598P(i12 & 1, (i12 & 147) != 146)) {
            AbstractC5244c.m10322f(c3966o, AbstractC7862a.m14843a(AbstractC0245d.m679p(interfaceC7879r, g0.f3745a, g0.f3746b), new C0552j(interfaceC2137a, z6, 0)));
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0549g(interfaceC7879r, interfaceC2137a, z6, i10, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final d3.C1552f m7290f(a3.C0046e r30, float r31) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz.AbstractC3063b.m7290f(a3.e, float):d3.f");
    }

    /* renamed from: d */
    public abstract int mo5419d(int i10, View view);

    /* renamed from: e */
    public abstract int mo5420e(int i10, View view);

    /* renamed from: g */
    public int mo5421g(View view) {
        return 0;
    }

    /* renamed from: h */
    public int mo5965h() {
        return 0;
    }

    /* renamed from: j */
    public abstract void mo5423j(int i10);

    /* renamed from: k */
    public abstract void mo5424k(View view, int i10, int i11);

    /* renamed from: l */
    public abstract void mo5425l(View view, float f6, float f10);

    /* renamed from: m */
    public abstract boolean mo5426m(int i10, View view);

    /* renamed from: i */
    public void mo5422i(int i10, View view) {
    }
}
