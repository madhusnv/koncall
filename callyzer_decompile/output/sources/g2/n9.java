package g2;

import androidx.compose.foundation.layout.AbstractC0242a;
import androidx.compose.foundation.layout.AbstractC0245d;
import androidx.compose.foundation.selection.AbstractC0252b;
import androidx.compose.material3.MinimumInteractiveModifier;
import aq.C0408k;
import d3.C1565s;
import d4.C1580h;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import h1.AbstractC2773d;
import h1.AbstractC2774e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class n9 {

    /* renamed from: a */
    public static final float f12206a;

    /* renamed from: b */
    public static final float f12207b = 12;

    /* renamed from: c */
    public static final float f12208c;

    static {
        float f6 = 2;
        f12206a = f6;
        f12208c = f6;
    }

    /* renamed from: a */
    public static final void m6221a(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC7879r interfaceC7879r, boolean z10, l9 l9Var, InterfaceC3962k interfaceC3962k, int i10) {
        l9 l9Var2;
        boolean z11;
        l9 l9Var3;
        InterfaceC7879r interfaceC7879r2;
        Object objM8520w;
        Object obj;
        boolean z12;
        InterfaceC7879r interfaceC7879rM697a;
        InterfaceC7879r interfaceC7879r3;
        l9 l9Var4;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(408580840);
        if (((i10 | (c3966o.m8615h(z6) ? 4 : 2) | (c3966o.m8616i(interfaceC2137a) ? 32 : 16) | 208256) & 74899) == 74898 && c3966o.m8586C()) {
            c3966o.m8601S();
            interfaceC7879r3 = interfaceC7879r;
            z12 = z10;
            l9Var4 = l9Var;
        } else {
            c3966o.m8603U();
            int i11 = i10 & 1;
            InterfaceC7879r interfaceC7879r4 = C7876o.f37669a;
            if (i11 == 0 || c3966o.m8584A()) {
                v1 v1Var = (v1) c3966o.m8618k(y1.f13286a);
                l9 l9Var5 = v1Var.f44230a0;
                if (l9Var5 == null) {
                    l9Var2 = new l9(y1.m6344c(v1Var, j2.e0.f18545d), y1.m6344c(v1Var, j2.e0.f18547f), C1565s.m5186b(0.38f, 14, y1.m6344c(v1Var, j2.e0.f18542a)), C1565s.m5186b(0.38f, 14, y1.m6344c(v1Var, j2.e0.f18543b)));
                    v1Var.f44230a0 = l9Var2;
                } else {
                    l9Var2 = l9Var5;
                }
                z11 = true;
                l9Var3 = l9Var2;
                interfaceC7879r2 = interfaceC7879r4;
            } else {
                c3966o.m8601S();
                interfaceC7879r2 = interfaceC7879r;
                z11 = z10;
                l9Var3 = l9Var;
            }
            c3966o.m8624q();
            k2.h2 h2VarM6798a = AbstractC2774e.m6798a(z6 ? f12207b / 2 : 0, AbstractC2773d.m6795r(100, 0, null, 6), c3966o);
            l9Var3.getClass();
            long j6 = (z11 && z6) ? l9Var3.f12012a : (!z11 || z6) ? (z11 || !z6) ? l9Var3.f12015d : l9Var3.f12014c : l9Var3.f12013b;
            if (z11) {
                c3966o.m8607Y(350067971);
                objM8520w = g1.b1.m6085a(j6, AbstractC2773d.m6795r(100, 0, null, 6), c3966o, 48);
                c3966o.m8623p(false);
            } else {
                c3966o.m8607Y(350170674);
                objM8520w = C3953b.m8520w(new C1565s(j6), c3966o);
                c3966o.m8623p(false);
            }
            c3966o.m8607Y(1327106656);
            if (interfaceC2137a != null) {
                obj = objM8520w;
                z12 = z11;
                interfaceC7879rM697a = AbstractC0252b.m697a(interfaceC7879r4, z6, null, q9.m6291c(false, j2.e0.f18546e / 2, 0L, c3966o, 54, 4), z12, new C1580h(3), interfaceC2137a);
            } else {
                obj = objM8520w;
                z12 = z11;
                interfaceC7879rM697a = interfaceC7879r4;
            }
            c3966o.m8623p(false);
            if (interfaceC2137a != null) {
                k2.i2 i2Var = g6.f11636a;
                interfaceC7879r4 = MinimumInteractiveModifier.f2066a;
            }
            InterfaceC7879r interfaceC7879rM674k = AbstractC0245d.m674k(AbstractC0242a.m656j(AbstractC0245d.m686w(interfaceC7879r2.mo14852e(interfaceC7879r4).mo14852e(interfaceC7879rM697a), C7864c.f37646e, 2), f12206a), j2.e0.f18544c);
            Object obj2 = obj;
            boolean zM8614g = c3966o.m8614g(obj2) | c3966o.m8614g(h2VarM6798a);
            Object objM8596M = c3966o.m8596M();
            if (zM8614g || objM8596M == C3961j.f20408a) {
                objM8596M = new C0408k(15, obj2, h2VarM6798a);
                c3966o.j0(objM8596M);
            }
            pg.e0.m11594a(0, (InterfaceC2139c) objM8596M, c3966o, interfaceC7879rM674k);
            interfaceC7879r3 = interfaceC7879r2;
            l9Var4 = l9Var3;
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new m9(z6, interfaceC2137a, interfaceC7879r3, z12, l9Var4, i10, 0);
        }
    }
}
