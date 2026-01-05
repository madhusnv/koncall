package g2;

import androidx.compose.foundation.AbstractC0240d;
import au.C0447k;
import com.skydoves.balloon.internals.DefinitionKt;
import cp.C1476g;
import d3.C1565s;
import f2.AbstractC2191n;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import s2.AbstractC6740i;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class u6 {
    static {
        new k2.r0(w1.f13084q);
    }

    /* renamed from: a */
    public static final void m6322a(v1 v1Var, ca caVar, vd vdVar, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        ca caVar2;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2127166334);
        if (((i10 | (c3966o.m8614g(v1Var) ? 4 : 2) | (c3966o.m8616i(c6734c) ? NewHope.SENDB_BYTES : 1024)) & 1171) == 1170 && c3966o.m8586C()) {
            c3966o.m8601S();
            caVar2 = caVar;
        } else {
            c3966o.m8603U();
            if ((i10 & 1) != 0 && !c3966o.m8584A()) {
                c3966o.m8601S();
            }
            c3966o.m8624q();
            i1.p0 p0VarM6291c = q9.m6291c(false, DefinitionKt.NO_Float_VALUE, 0L, c3966o, 0, 7);
            long j6 = v1Var.f12954a;
            boolean zM8613f = c3966o.m8613f(j6);
            Object objM8596M = c3966o.m8596M();
            if (zM8613f || objM8596M == C3961j.f20408a) {
                objM8596M = new b2.h1(j6, C1565s.m5186b(0.4f, 14, j6));
                c3966o.j0(objM8596M);
            }
            caVar2 = caVar;
            C3953b.m8499b(new k2.m1[]{y1.f13286a.mo8541a(v1Var), AbstractC0240d.f1925a.mo8541a(p0VarM6291c), AbstractC2191n.f10102a.mo8541a(z1.f13354a), ea.f11475a.mo8541a(caVar2), b2.i1.f3765a.mo8541a((b2.h1) objM8596M), xd.f13268a.mo8541a(vdVar)}, AbstractC6740i.m12902d(-1066563262, new C1476g(4, vdVar, c6734c), c3966o), c3966o, 56);
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C0447k(v1Var, caVar2, vdVar, c6734c, i10, 6);
        }
    }
}
