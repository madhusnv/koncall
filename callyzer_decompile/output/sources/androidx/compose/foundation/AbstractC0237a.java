package androidx.compose.foundation;

import android.view.KeyEvent;
import b2.j0;
import c9.AbstractC0911f;
import d3.l0;
import d4.C1580h;
import ex.InterfaceC2137a;
import i1.AbstractC3144w;
import i1.C3128g;
import i1.C3139r;
import i1.p0;
import i1.u0;
import k1.k0;
import k1.q1;
import k1.x0;
import m1.InterfaceC4630l;
import n3.AbstractC4947a;
import n3.AbstractC4949c;
import t1.C6985j;
import w2.AbstractC7862a;
import w2.C7876o;
import w2.InterfaceC7879r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.compose.foundation.a */
/* loaded from: classes.dex */
public abstract class AbstractC0237a {
    /* renamed from: a */
    public static final InterfaceC7879r m633a(InterfaceC7879r interfaceC7879r, long j6, l0 l0Var) {
        return interfaceC7879r.mo14852e(new BackgroundElement(j6, l0Var));
    }

    /* renamed from: c */
    public static final InterfaceC7879r m635c(InterfaceC7879r interfaceC7879r, InterfaceC4630l interfaceC4630l, p0 p0Var, boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a) {
        InterfaceC7879r interfaceC7879rMo14852e;
        if (p0Var instanceof u0) {
            interfaceC7879rMo14852e = new ClickableElement(interfaceC4630l, (u0) p0Var, z6, str, c1580h, interfaceC2137a);
        } else if (p0Var == null) {
            interfaceC7879rMo14852e = new ClickableElement(interfaceC4630l, null, z6, str, c1580h, interfaceC2137a);
        } else {
            C7876o c7876o = C7876o.f37669a;
            interfaceC7879rMo14852e = interfaceC4630l != null ? AbstractC0240d.m644a(c7876o, interfaceC4630l, p0Var).mo14852e(new ClickableElement(interfaceC4630l, null, z6, str, c1580h, interfaceC2137a)) : AbstractC7862a.m14843a(c7876o, new C0238b(p0Var, z6, str, c1580h, interfaceC2137a));
        }
        return interfaceC7879r.mo14852e(interfaceC7879rMo14852e);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC7879r m636d(InterfaceC7879r interfaceC7879r, InterfaceC4630l interfaceC4630l, p0 p0Var, boolean z6, C1580h c1580h, InterfaceC2137a interfaceC2137a, int i10) {
        if ((i10 & 4) != 0) {
            z6 = true;
        }
        boolean z10 = z6;
        if ((i10 & 16) != 0) {
            c1580h = null;
        }
        return m635c(interfaceC7879r, interfaceC4630l, p0Var, z10, null, c1580h, interfaceC2137a);
    }

    /* renamed from: e */
    public static InterfaceC7879r m637e(InterfaceC7879r interfaceC7879r, boolean z6, String str, C1580h c1580h, InterfaceC2137a interfaceC2137a, int i10) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            c1580h = null;
        }
        return AbstractC7862a.m14843a(interfaceC7879r, new C3139r(z6, str, c1580h, interfaceC2137a));
    }

    /* renamed from: f */
    public static final InterfaceC7879r m638f(InterfaceC7879r interfaceC7879r, InterfaceC4630l interfaceC4630l, p0 p0Var, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        InterfaceC7879r interfaceC7879rMo14852e;
        if (p0Var instanceof u0) {
            interfaceC7879rMo14852e = new CombinedClickableElement(interfaceC2137a2, interfaceC2137a, (u0) p0Var, interfaceC4630l);
        } else if (p0Var == null) {
            interfaceC7879rMo14852e = new CombinedClickableElement(interfaceC2137a2, interfaceC2137a, null, interfaceC4630l);
        } else {
            C7876o c7876o = C7876o.f37669a;
            interfaceC7879rMo14852e = interfaceC4630l != null ? AbstractC0240d.m644a(c7876o, interfaceC4630l, p0Var).mo14852e(new CombinedClickableElement(interfaceC2137a2, interfaceC2137a, null, interfaceC4630l)) : AbstractC7862a.m14843a(c7876o, new C0239c(p0Var, interfaceC2137a2, interfaceC2137a));
        }
        return interfaceC7879r.mo14852e(interfaceC7879rMo14852e);
    }

    /* renamed from: g */
    public static InterfaceC7879r m639g(InterfaceC7879r interfaceC7879r, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        return AbstractC7862a.m14843a(interfaceC7879r, new j0(3, interfaceC2137a, interfaceC2137a2));
    }

    /* renamed from: h */
    public static final InterfaceC7879r m640h(InterfaceC7879r interfaceC7879r, boolean z6, InterfaceC4630l interfaceC4630l) {
        return interfaceC7879r.mo14852e(z6 ? new FocusableElement(interfaceC4630l) : C7876o.f37669a);
    }

    /* renamed from: i */
    public static InterfaceC7879r m641i(InterfaceC7879r interfaceC7879r, InterfaceC4630l interfaceC4630l) {
        return interfaceC7879r.mo14852e(new HoverableElement(interfaceC4630l));
    }

    /* renamed from: j */
    public static final boolean m642j(KeyEvent keyEvent) {
        long jM9891c = AbstractC4949c.m9891c(keyEvent);
        int i10 = AbstractC4947a.f24633o;
        if (AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24624f) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24627i) ? true : AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24632n)) {
            return true;
        }
        return AbstractC4947a.m9888a(jM9891c, AbstractC4947a.f24626h);
    }

    /* renamed from: k */
    public static final InterfaceC7879r m643k(InterfaceC7879r interfaceC7879r, q1 q1Var, x0 x0Var, boolean z6, k0 k0Var, InterfaceC4630l interfaceC4630l, boolean z10, C3128g c3128g, C6985j c6985j) {
        float f6 = AbstractC3144w.f16999a;
        x0 x0Var2 = x0.Vertical;
        C7876o c7876o = C7876o.f37669a;
        return interfaceC7879r.mo14852e(x0Var == x0Var2 ? AbstractC0911f.m2617a(c7876o, i1.j0.f16890d) : AbstractC0911f.m2617a(c7876o, i1.j0.f16888b)).mo14852e(new ScrollingContainerElement(c3128g, c6985j, k0Var, x0Var, q1Var, interfaceC4630l, z6, z10));
    }
}
