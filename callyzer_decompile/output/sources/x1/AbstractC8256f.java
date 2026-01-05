package x1;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2142f;
import g2.v3;
import g4.C2490f;
import g4.C2492h;
import java.util.List;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import kotlin.jvm.internal.AbstractC4154l;
import qw.C6361k;
import rw.C6668r;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.f */
/* loaded from: classes.dex */
public abstract class AbstractC8256f {

    /* renamed from: a */
    public static final C6361k f39487a;

    static {
        C6668r c6668r = C6668r.f31943a;
        f39487a = new C6361k(c6668r, c6668r);
    }

    /* renamed from: a */
    public static final void m15433a(C2492h c2492h, List list, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-1794596951);
        int i11 = (i10 & 6) == 0 ? (c3966o.m8614g(c2492h) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= c3966o.m8616i(list) ? 32 : 16;
        }
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                C2490f c2490f = (C2490f) list.get(i12);
                InterfaceC2142f interfaceC2142f = (InterfaceC2142f) c2490f.f13595a;
                int i13 = c2490f.f13596b;
                int i14 = c2490f.f13597c;
                C8255e c8255e = C8255e.f39477b;
                int i15 = c3966o.f20462P;
                k2.i1 i1VarM8620m = c3966o.m8620m();
                InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, C7876o.f37669a);
                InterfaceC7639k.V0.getClass();
                C7637i c7637i = C7638j.f36921b;
                c3966o.c0();
                if (c3966o.f20461O) {
                    c3966o.m8619l(c7637i);
                } else {
                    c3966o.m0();
                }
                C3953b.m8521x(C7638j.f36925f, c8255e, c3966o);
                C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
                C7636h c7636h = C7638j.f36926g;
                if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i15))) {
                    AbstractC1452a.m4577x(i15, c3966o, i15, c7636h);
                }
                C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
                interfaceC2142f.invoke(c2492h.subSequence(i13, i14).f13620b, c3966o, 0);
                c3966o.m8623p(true);
            }
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new v3(c2492h, list, i10, 10);
        }
    }
}
