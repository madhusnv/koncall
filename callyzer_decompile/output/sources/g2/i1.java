package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.selection.AbstractC0252b;
import androidx.compose.material3.MinimumInteractiveModifier;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import f4.EnumC2203a;
import j2.AbstractC3522b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: a */
    public static final float f11778a;

    /* renamed from: b */
    public static final float f11779b = 20;

    /* renamed from: c */
    public static final float f11780c;

    /* renamed from: d */
    public static final float f11781d;

    static {
        float f6 = 2;
        f11778a = f6;
        f11780c = f6;
        f11781d = f6;
    }

    /* renamed from: a */
    public static final void m6172a(boolean z6, InterfaceC2139c interfaceC2139c, InterfaceC7879r interfaceC7879r, boolean z10, b1 b1Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        boolean z11;
        InterfaceC2137a interfaceC2137a;
        boolean z12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1406741137);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8615h(z6) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2139c) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        int i12 = i11 | 3072;
        if ((i10 & 24576) == 0) {
            i12 |= c3966o.m8614g(b1Var) ? 16384 : 8192;
        }
        int i13 = i12 | 196608;
        if ((74899 & i13) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            z12 = z10;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                z11 = true;
            } else {
                c3966o.m8601S();
                z11 = z10;
            }
            c3966o.m8624q();
            EnumC2203a enumC2203a = z6 ? EnumC2203a.On : EnumC2203a.Off;
            c3966o.m8607Y(1046936362);
            if (interfaceC2139c != null) {
                boolean z13 = ((i13 & 112) == 32) | ((i13 & 14) == 4);
                Object objM8596M = c3966o.m8596M();
                if (z13 || objM8596M == C3961j.f20408a) {
                    objM8596M = new c1(interfaceC2139c, z6, 0);
                    c3966o.j0(objM8596M);
                }
                interfaceC2137a = (InterfaceC2137a) objM8596M;
            } else {
                interfaceC2137a = null;
            }
            InterfaceC2137a interfaceC2137a2 = interfaceC2137a;
            c3966o.m8623p(false);
            m6174c(enumC2203a, interfaceC2137a2, interfaceC7879r, z11, b1Var, c3966o, i13 & 524160);
            z12 = z11;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new d1(z6, interfaceC2139c, interfaceC7879r, z12, b1Var, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01be  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6173b(boolean r28, f4.EnumC2203a r29, w2.InterfaceC7879r r30, g2.b1 r31, k2.InterfaceC3962k r32, int r33) {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.i1.m6173b(boolean, f4.a, w2.r, g2.b1, k2.k, int):void");
    }

    /* renamed from: c */
    public static final void m6174c(EnumC2203a enumC2203a, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z6, b1 b1Var, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        EnumC2203a enumC2203a2;
        boolean z10;
        b1 b1Var2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1608358065);
        if ((i10 & 6) == 0) {
            i11 = (c3966o.m8614g(enumC2203a) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(interfaceC2137a) ? 32 : 16;
        }
        if ((i10 & KyberEngine.KyberPolyBytes) == 0) {
            i11 |= c3966o.m8614g(interfaceC7879r) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c3966o.m8615h(z6) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c3966o.m8614g(b1Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c3966o.m8614g(null) ? 131072 : 65536;
        }
        if ((74899 & i11) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            enumC2203a2 = enumC2203a;
            b1Var2 = b1Var;
            z10 = z6;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            c3966o.m8607Y(-97239746);
            InterfaceC7879r interfaceC7879r2 = C7876o.f37669a;
            InterfaceC7879r interfaceC7879rM699c = interfaceC2137a != null ? AbstractC0252b.m699c(new C1580h(1), interfaceC2137a, enumC2203a, q9.m6291c(false, AbstractC3522b.f18447d / 2, 0L, c3966o, 54, 4), z6) : interfaceC7879r2;
            c3966o.m8623p(false);
            if (interfaceC2137a != null) {
                k2.i2 i2Var = g6.f11636a;
                interfaceC7879r2 = MinimumInteractiveModifier.f2066a;
            }
            enumC2203a2 = enumC2203a;
            m6173b(z6, enumC2203a2, AbstractC0242a.m656j(interfaceC7879r.mo14852e(interfaceC7879r2).mo14852e(interfaceC7879rM699c), f11778a), b1Var, c3966o, ((i11 >> 9) & 14) | ((i11 << 3) & 112) | ((i11 >> 3) & 7168));
            z10 = z6;
            b1Var2 = b1Var;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g1(enumC2203a2, interfaceC2137a, interfaceC7879r, z10, b1Var2, i10);
        }
    }
}
