package qr;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.websoptimization.callyzerbiz.R;
import d3.k0;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.v1;
import g2.vd;
import g2.xd;
import g2.y1;
import g4.C2489e;
import g4.C2490f;
import g4.C2492h;
import g4.o0;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.l1;
import k4.AbstractC3988i;
import k4.C3994o;
import k4.C3995p;
import k4.C3998s;
import n4.C4953b;
import pg.f9;
import r4.C6446a;
import r4.C6457l;
import r4.C6462q;
import rw.AbstractC6663m;
import w2.C7876o;
import w2.InterfaceC7879r;
import x1.r0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qr.m */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6289m implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f30570a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC6297u f30571b;

    public /* synthetic */ C6289m(AbstractC6297u abstractC6297u, int i10) {
        this.f30570a = i10;
        this.f30571b = abstractC6297u;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        C2489e c2489e;
        int iM6427g;
        switch (this.f30570a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c3966o.m8607Y(2028633237);
                    c2489e = new C2489e();
                    c3966o.m8607Y(2028634209);
                    l1 l1Var = y1.f13286a;
                    iM6427g = c2489e.m6427g(new g4.g0(((v1) c3966o.m8618k(l1Var)).f12970q, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, (C6457l) null, (k0) null, 65534));
                    try {
                        c2489e.m6423c(f9.m11629c(c3966o, R.string.exclude_numbers_mentioned_in));
                        c2489e.m6425e(iM6427g);
                        c3966o.m8623p(false);
                        c3966o.m8607Y(2028645511);
                        iM6427g = c2489e.m6427g(new g4.g0(((v1) c3966o.m8618k(l1Var)).f12954a, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, C6457l.f31117c, (k0) null, 61438));
                        try {
                            c2489e.m6423c(f9.m11629c(c3966o, R.string.exclude_phone_numbers));
                            c2489e.m6425e(iM6427g);
                            c3966o.m8623p(false);
                            c2489e.m6421a(29, 50);
                            final C2492h c2492hM6428h = c2489e.m6428h();
                            c3966o.m8623p(false);
                            o0 o0Var = ((vd) c3966o.m8618k(xd.f13268a)).f13056l;
                            InterfaceC7879r interfaceC7879rM657k = AbstractC0242a.m657k(C7876o.f37669a, 20, 10);
                            boolean zM8614g = c3966o.m8614g(c2492hM6428h);
                            final AbstractC6297u abstractC6297u = this.f30571b;
                            boolean zM8616i = zM8614g | c3966o.m8616i(abstractC6297u);
                            Object objM8596M = c3966o.m8596M();
                            if (zM8616i || objM8596M == C3961j.f20408a) {
                                final int i10 = 0;
                                objM8596M = new InterfaceC2139c() { // from class: qr.o
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj3) {
                                        int i11 = i10;
                                        int iIntValue2 = ((Integer) obj3).intValue();
                                        switch (i11) {
                                            case 0:
                                                if (((C2490f) AbstractC6663m.m12743G(c2492hM6428h.m6435b(iIntValue2, iIntValue2))) != null) {
                                                    ((C6295s) abstractC6297u).f30601f.invoke();
                                                }
                                                break;
                                            default:
                                                if (((C2490f) AbstractC6663m.m12743G(c2492hM6428h.m6435b(iIntValue2, iIntValue2))) != null) {
                                                    ((C6295s) abstractC6297u).f30601f.invoke();
                                                }
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o.j0(objM8596M);
                            }
                            r0.m15445e(c2492hM6428h, interfaceC7879rM657k, o0Var, false, 0, 0, null, (InterfaceC2139c) objM8596M, c3966o, 48, 120);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            default:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c3966o2.m8607Y(-747132562);
                    c2489e = new C2489e();
                    c3966o2.m8607Y(-747131590);
                    l1 l1Var2 = y1.f13286a;
                    iM6427g = c2489e.m6427g(new g4.g0(((v1) c3966o2.m8618k(l1Var2)).f12970q, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, (C6457l) null, (k0) null, 65534));
                    try {
                        c2489e.m6423c(f9.m11629c(c3966o2, R.string.exclude_numbers_mentioned_in));
                        c2489e.m6425e(iM6427g);
                        c3966o2.m8623p(false);
                        c3966o2.m8607Y(-747120288);
                        iM6427g = c2489e.m6427g(new g4.g0(((v1) c3966o2.m8618k(l1Var2)).f12954a, 0L, (C3998s) null, (C3994o) null, (C3995p) null, (AbstractC3988i) null, (String) null, 0L, (C6446a) null, (C6462q) null, (C4953b) null, 0L, C6457l.f31117c, (k0) null, 61438));
                        try {
                            c2489e.m6423c(f9.m11629c(c3966o2, R.string.exclude_phone_numbers));
                            c2489e.m6425e(iM6427g);
                            c3966o2.m8623p(false);
                            c2489e.m6421a(29, 50);
                            final C2492h c2492hM6428h2 = c2489e.m6428h();
                            c3966o2.m8623p(false);
                            o0 o0Var2 = ((vd) c3966o2.m8618k(xd.f13268a)).f13056l;
                            InterfaceC7879r interfaceC7879rM657k2 = AbstractC0242a.m657k(C7876o.f37669a, 20, 10);
                            boolean zM8614g2 = c3966o2.m8614g(c2492hM6428h2);
                            final AbstractC6297u abstractC6297u2 = this.f30571b;
                            boolean zM8616i2 = zM8614g2 | c3966o2.m8616i(abstractC6297u2);
                            Object objM8596M2 = c3966o2.m8596M();
                            if (zM8616i2 || objM8596M2 == C3961j.f20408a) {
                                final int i11 = 1;
                                objM8596M2 = new InterfaceC2139c() { // from class: qr.o
                                    @Override // ex.InterfaceC2139c
                                    public final Object invoke(Object obj3) {
                                        int i112 = i11;
                                        int iIntValue22 = ((Integer) obj3).intValue();
                                        switch (i112) {
                                            case 0:
                                                if (((C2490f) AbstractC6663m.m12743G(c2492hM6428h2.m6435b(iIntValue22, iIntValue22))) != null) {
                                                    ((C6295s) abstractC6297u2).f30601f.invoke();
                                                }
                                                break;
                                            default:
                                                if (((C2490f) AbstractC6663m.m12743G(c2492hM6428h2.m6435b(iIntValue22, iIntValue22))) != null) {
                                                    ((C6295s) abstractC6297u2).f30601f.invoke();
                                                }
                                                break;
                                        }
                                        return qw.a0.f30746a;
                                    }
                                };
                                c3966o2.j0(objM8596M2);
                            }
                            r0.m15445e(c2492hM6428h2, interfaceC7879rM657k2, o0Var2, false, 0, 0, null, (InterfaceC2139c) objM8596M2, c3966o2, 48, 120);
                        } finally {
                        }
                    } finally {
                    }
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
        }
    }
}
