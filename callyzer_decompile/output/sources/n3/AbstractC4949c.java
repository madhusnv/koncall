package n3;

import android.view.KeyEvent;
import b2.p0;
import b2.q0;
import com.sun.mail.util.AbstractC1452a;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.i1;
import k2.n1;
import kotlin.jvm.internal.AbstractC4154l;
import mb.f1;
import mb.g1;
import mb.h1;
import og.k1;
import s2.C6734c;
import v3.C7636h;
import v3.C7637i;
import v3.C7638j;
import v3.InterfaceC7639k;
import w2.AbstractC7862a;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: n3.c */
/* loaded from: classes.dex */
public abstract class AbstractC4949c {
    /* renamed from: a */
    public static final void m9889a(InterfaceC7879r interfaceC7879r, C6734c c6734c, InterfaceC3962k interfaceC3962k, int i10) {
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(-2105228848);
        int i11 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        if (c3966o.m8598P(i11 & 1, (i11 & 19) != 18)) {
            int i12 = c3966o.f20462P;
            i1 i1VarM8620m = c3966o.m8620m();
            InterfaceC7879r interfaceC7879rM14845c = AbstractC7862a.m14845c(c3966o, interfaceC7879r);
            InterfaceC7639k.V0.getClass();
            C7637i c7637i = C7638j.f36921b;
            c3966o.c0();
            if (c3966o.f20461O) {
                c3966o.m8619l(c7637i);
            } else {
                c3966o.m0();
            }
            C3953b.m8521x(C7638j.f36925f, p0.f3799a, c3966o);
            C3953b.m8521x(C7638j.f36924e, i1VarM8620m, c3966o);
            C7636h c7636h = C7638j.f36926g;
            if (c3966o.f20461O || !AbstractC4154l.m8918a(c3966o.m8596M(), Integer.valueOf(i12))) {
                AbstractC1452a.m4577x(i12, c3966o, i12, c7636h);
            }
            C3953b.m8521x(C7638j.f36923d, interfaceC7879rM14845c, c3966o);
            c6734c.invoke(c3966o, 6);
            c3966o.m8623p(true);
        } else {
            c3966o.m8601S();
        }
        n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new q0(interfaceC7879r, c6734c, i10);
        }
    }

    /* renamed from: b */
    public static mb.i1 m9890b(String str) {
        return str.equals("COMPLIANCE") ? f1.f23239b : str.equals("GOVERNANCE") ? g1.f23244b : new h1(str);
    }

    /* renamed from: c */
    public static final long m9891c(KeyEvent keyEvent) {
        return k1.m10726a(keyEvent.getKeyCode());
    }

    /* renamed from: d */
    public static final int m9892d(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }
}
