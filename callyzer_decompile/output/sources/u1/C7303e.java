package u1;

import a3.C0043b;
import a4.InterfaceC0051a;
import androidx.fragment.app.C0348m;
import c3.C0848c;
import k1.C3934i;
import qw.a0;
import t3.InterfaceC7033t;
import tx.c0;
import uw.InterfaceC7559c;
import v3.AbstractC7634f;
import v3.InterfaceC7651w;
import v3.h1;
import vw.EnumC7794a;
import w2.AbstractC7878q;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u1.e */
/* loaded from: classes.dex */
public final class C7303e extends AbstractC7878q implements InterfaceC0051a, InterfaceC7651w {

    /* renamed from: q */
    public C3934i f34833q;

    /* renamed from: r */
    public boolean f34834r;

    public static final C0848c L0(C7303e c7303e, h1 h1Var, C0043b c0043b) {
        C0848c c0848c;
        if (c7303e.f37683p && c7303e.f34834r) {
            h1 h1VarM14562w = AbstractC7634f.m14562w(c7303e);
            if (!h1Var.T0().f37683p) {
                h1Var = null;
            }
            if (h1Var != null && (c0848c = (C0848c) c0043b.invoke()) != null) {
                return c0848c.m2287i(h1VarM14562w.mo13298S(h1Var, false).m2282d());
            }
        }
        return null;
    }

    @Override // w2.AbstractC7878q
    public final boolean A0() {
        return false;
    }

    @Override // v3.InterfaceC7651w
    public final void f0(InterfaceC7033t interfaceC7033t) {
        this.f34834r = true;
    }

    @Override // a4.InterfaceC0051a
    public final Object u0(h1 h1Var, C0043b c0043b, AbstractC8193c abstractC8193c) {
        Object objM13488k = c0.m13488k(new gm.c0(this, h1Var, c0043b, new C0348m(7, this, h1Var, c0043b), (InterfaceC7559c) null, 1), abstractC8193c);
        return objM13488k == EnumC7794a.COROUTINE_SUSPENDED ? objM13488k : a0.f30746a;
    }
}
