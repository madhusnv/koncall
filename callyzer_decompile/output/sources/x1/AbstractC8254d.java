package x1;

import androidx.compose.foundation.layout.AbstractC0245d;
import b2.InterfaceC0557o;
import d4.AbstractC1586n;
import ex.InterfaceC2139c;
import g2.y5;
import hz.AbstractC3063b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import o1.AbstractC5244c;
import s1.C6725t;
import s2.AbstractC6740i;
import w2.AbstractC7862a;
import w2.C7864c;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: x1.d */
/* loaded from: classes.dex */
public abstract class AbstractC8254d {

    /* renamed from: a */
    public static final float f39465a;

    /* renamed from: b */
    public static final float f39466b;

    static {
        float f6 = 25;
        f39465a = f6;
        f39466b = (f6 * 2.0f) / 2.4142137f;
    }

    /* renamed from: a */
    public static final void m15431a(InterfaceC0557o interfaceC0557o, InterfaceC7879r interfaceC7879r, long j6, InterfaceC3962k interfaceC3962k, int i10) {
        int i11;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(1776202187);
        int i12 = (c3966o.m8614g(interfaceC0557o) ? 4 : 2) | i10 | (c3966o.m8614g(interfaceC7879r) ? 32 : 16) | 128;
        if (c3966o.m8598P(i12 & 1, (i12 & 147) != 146)) {
            c3966o.m8603U();
            if ((i10 & 1) == 0 || c3966o.m8584A()) {
                i11 = i12 & (-897);
                j6 = 9205357640488583168L;
            } else {
                c3966o.m8601S();
                i11 = i12 & (-897);
            }
            c3966o.m8624q();
            int i13 = i11 & 14;
            boolean z6 = i13 == 4;
            Object objM8596M = c3966o.m8596M();
            if (z6 || objM8596M == C3961j.f20408a) {
                objM8596M = new C6725t(14, interfaceC0557o);
                c3966o.j0(objM8596M);
            }
            AbstractC3063b.m7287a(interfaceC0557o, C7864c.f37643b, AbstractC6740i.m12902d(-1653527038, new y5(1, j6, AbstractC1586n.m5204b(interfaceC7879r, false, (InterfaceC2139c) objM8596M)), c3966o), c3966o, i13 | 432);
        } else {
            c3966o.m8601S();
        }
        long j10 = j6;
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new g2.q0(interfaceC0557o, interfaceC7879r, j10, i10);
        }
    }

    /* renamed from: b */
    public static final void m15432b(int i10, int i11, InterfaceC3962k interfaceC3962k, InterfaceC7879r interfaceC7879r) {
        int i12;
        C3966o c3966o = (C3966o) interfaceC3962k;
        c3966o.a0(694251107);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c3966o.m8614g(interfaceC7879r) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if (c3966o.m8598P(i12 & 1, (i12 & 3) != 2)) {
            if (i13 != 0) {
                interfaceC7879r = C7876o.f37669a;
            }
            AbstractC5244c.m10322f(c3966o, AbstractC7862a.m14843a(AbstractC0245d.m679p(interfaceC7879r, f39466b, f39465a), C8253c.f39448b));
        } else {
            c3966o.m8601S();
        }
        k2.n1 n1VarM8628u = c3966o.m8628u();
        if (n1VarM8628u != null) {
            n1VarM8628u.f20443d = new C8251a(i10, i11, interfaceC7879r);
        }
    }
}
