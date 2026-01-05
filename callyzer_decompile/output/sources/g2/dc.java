package g2;

import androidx.compose.foundation.layout.AbstractC0245d;
import au.C0446j;
import c9.AbstractC0911f;
import com.skydoves.balloon.internals.DefinitionKt;
import d4.AbstractC1586n;
import h1.AbstractC2773d;
import h1.AbstractC2793x;
import h1.C2788s;
import k2.C3966o;
import k2.InterfaceC3962k;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;
import v1.C7623a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class dc {

    /* renamed from: a */
    public static final float f11411a = 90;

    /* renamed from: b */
    public static final h1.w1 f11412b;

    /* renamed from: c */
    public static final h1.w1 f11413c;

    static {
        C2788s c2788s = AbstractC2793x.f15639a;
        f11412b = AbstractC2773d.m6795r(250, 0, c2788s, 2);
        f11413c = AbstractC2773d.m6795r(250, 0, c2788s, 2);
    }

    /* renamed from: a */
    public static final void m6124a(float f6, int i10, int i11, long j6, long j10, i1.p1 p1Var, InterfaceC3962k interfaceC3962k, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC7879r interfaceC7879r) {
        long jM6345d;
        long jM6345d2;
        int i12;
        i1.p1 p1Var2;
        InterfaceC7879r interfaceC7879r2;
        long j11;
        long j12;
        i1.p1 p1Var3;
        InterfaceC7879r interfaceC7879r3;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1763241113);
        int i13 = i11 | (c3966o.m8612e(i10) ? 4 : 2) | 9392;
        if ((38347923 & i13) == 38347922 && c3966o.m8586C()) {
            c3966o.m8601S();
            j11 = j6;
            j12 = j10;
            p1Var3 = p1Var;
            interfaceC7879r3 = interfaceC7879r;
        } else {
            c3966o.m8603U();
            if ((i11 & 1) == 0 || c3966o.m8584A()) {
                i1.p1 p1VarM11707b = pg.j0.m11707b(c3966o);
                int i14 = tb.f12801a;
                jM6345d = y1.m6345d(j2.c0.f18498b, c3966o);
                jM6345d2 = y1.m6345d(j2.c0.f18500d, c3966o);
                i12 = i13 & (-65409);
                p1Var2 = p1VarM11707b;
                interfaceC7879r2 = C7876o.f37669a;
            } else {
                c3966o.m8601S();
                i12 = i13 & (-65409);
                jM6345d = j6;
                jM6345d2 = j10;
                p1Var2 = p1Var;
                interfaceC7879r2 = interfaceC7879r;
            }
            c3966o.m8624q();
            m6126c(f6, i10, (i12 & 126) | 114843648, jM6345d, jM6345d2, p1Var2, c3966o, c6734c, c6734c2, c6734c3, interfaceC7879r2);
            j11 = jM6345d;
            j12 = jM6345d2;
            p1Var3 = p1Var2;
            interfaceC7879r3 = interfaceC7879r2;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new ub(f6, i10, i11, j11, j12, p1Var3, c6734c, c6734c2, c6734c3, interfaceC7879r3);
        }
    }

    /* renamed from: b */
    public static final void m6125b(int i10, InterfaceC7879r interfaceC7879r, long j6, long j10, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC3962k interfaceC3962k, int i11) {
        int i12;
        long jM6345d;
        long jM6345d2;
        int i13;
        long j11;
        long j12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1884787284);
        if ((i11 & 6) == 0) {
            i12 = (c3966o.m8612e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o.m8616i(c6734c) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c3966o.m8616i(c6734c2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c3966o.m8616i(c6734c3) ? 1048576 : 524288;
        }
        if ((599187 & i12) == 599186 && c3966o.m8586C()) {
            c3966o.m8601S();
            j12 = j6;
            j11 = j10;
        } else {
            c3966o.m8603U();
            if ((i11 & 1) == 0 || c3966o.m8584A()) {
                int i14 = tb.f12801a;
                jM6345d = y1.m6345d(j2.c0.f18498b, c3966o);
                jM6345d2 = y1.m6345d(j2.c0.f18500d, c3966o);
                i13 = i12 & (-8065);
            } else {
                c3966o.m8601S();
                i13 = i12 & (-8065);
                jM6345d = j6;
                jM6345d2 = j10;
            }
            c3966o.m8624q();
            m6127d(interfaceC7879r, jM6345d, jM6345d2, c6734c, c6734c2, c6734c3, c3966o, 524286 & (i13 >> 3));
            j11 = jM6345d2;
            j12 = jM6345d;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new vb(i10, interfaceC7879r, j12, j11, c6734c, c6734c2, c6734c3, i11);
        }
    }

    /* renamed from: c */
    public static final void m6126c(float f6, int i10, int i11, long j6, long j10, i1.p1 p1Var, InterfaceC3962k interfaceC3962k, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC7879r interfaceC7879r) {
        int i12;
        C6734c c6734c4;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(-1594140035);
        if ((i11 & 6) == 0) {
            i12 = (c3966o2.m8612e(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c3966o2.m8614g(interfaceC7879r) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= c3966o2.m8613f(j6) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= c3966o2.m8613f(j10) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= c3966o2.m8611d(f6) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= c3966o2.m8614g(p1Var) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= c3966o2.m8616i(c6734c) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= c3966o2.m8616i(c6734c2) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            c6734c4 = c6734c3;
            i12 |= c3966o2.m8616i(c6734c4) ? 67108864 : 33554432;
        } else {
            c6734c4 = c6734c3;
        }
        if ((i12 & 38347923) == 38347922 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            c3966o = c3966o2;
            fb.m6164a(AbstractC0911f.m2618b(AbstractC1586n.m5204b(pg.j0.m11708c(AbstractC0245d.m686w(AbstractC0245d.m668e(interfaceC7879r, 1.0f), C7864c.f37645d, 2), p1Var, true, false), false, C7623a.f36779a)), null, j6, j10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(1556158104, new zb(p1Var, c6734c4, c6734c2, f6, i10, c6734c), c3966o2), c3966o, (i12 & 896) | 12582912 | (i12 & 7168), 114);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new ac(f6, i10, i11, j6, j10, p1Var, c6734c, c6734c2, c6734c3, interfaceC7879r);
        }
    }

    /* renamed from: d */
    public static final void m6127d(InterfaceC7879r interfaceC7879r, long j6, long j10, C6734c c6734c, C6734c c6734c2, C6734c c6734c3, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o;
        C3966o c3966o2 = (C3966o) interfaceC3962k;
        c3966o2.a0(1757425411);
        if ((i10 & 6) == 0) {
            i11 = (c3966o2.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o2.m8613f(j6) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o2.m8613f(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o2.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o2.m8616i(c6734c2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o2.m8616i(c6734c3) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c3966o2.m8586C()) {
            c3966o2.m8601S();
            c3966o = c3966o2;
        } else {
            int i12 = i11 << 3;
            c3966o = c3966o2;
            fb.m6164a(AbstractC1586n.m5204b(interfaceC7879r, false, C7623a.f36779a), null, j6, j10, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, null, AbstractC6740i.m12902d(-65106680, new C0446j(5, c6734c3, c6734c2, c6734c), c3966o2), c3966o, (i12 & 896) | 12582912 | (i12 & 7168), 114);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new va(interfaceC7879r, j6, j10, c6734c, c6734c2, c6734c3, i10);
        }
    }
}
