package hq;

import an.o1;
import ex.InterfaceC2137a;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import k2.s0;
import kq.AbstractC4179i;
import kq.C4172b;
import kq.C4185o;
import lq.C4506a;
import og.pe;
import pg.f9;
import t1.C6979d;
import tx.InterfaceC7266z;
import uw.C7565i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hq.f */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3001f implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f16179a = 0;

    /* renamed from: b */
    public final /* synthetic */ C4506a f16180b;

    /* renamed from: c */
    public final /* synthetic */ C6979d f16181c;

    public /* synthetic */ C3001f(C4506a c4506a, C6979d c6979d) {
        this.f16180b = c4506a;
        this.f16181c = c6979d;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        AbstractC4179i abstractC4179i;
        boolean z6;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f16179a) {
            case 0:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objM8596M = c3966o.m8596M();
                    s0 s0Var = C3961j.f20408a;
                    if (objM8596M == s0Var) {
                        objM8596M = C3953b.m8510m(C7565i.f36440a, c3966o);
                        c3966o.j0(objM8596M);
                    }
                    InterfaceC7266z interfaceC7266z = (InterfaceC7266z) objM8596M;
                    Object objM8596M2 = c3966o.m8596M();
                    C6979d c6979d = this.f16181c;
                    if (objM8596M2 == s0Var) {
                        objM8596M2 = new o1(29, interfaceC7266z, c6979d);
                        c3966o.j0(objM8596M2);
                    }
                    InterfaceC2139c interfaceC2139c = (InterfaceC2139c) objM8596M2;
                    int i10 = 0;
                    for (Object obj3 : this.f16180b.f22414a) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            pe.m10842q();
                            throw null;
                        }
                        AbstractC4179i abstractC4179i2 = (AbstractC4179i) obj3;
                        String strM11629c = f9.m11629c(c3966o, abstractC4179i2.f21184a);
                        if (c6979d.m13263j() == i10) {
                            abstractC4179i = abstractC4179i2;
                            z6 = true;
                        } else {
                            abstractC4179i = abstractC4179i2;
                            z6 = false;
                        }
                        int i12 = i10;
                        boolean z10 = abstractC4179i instanceof C4172b;
                        C4185o c4185o = abstractC4179i.f21185b;
                        boolean zM8612e = c3966o.m8612e(i12);
                        Object objM8596M3 = c3966o.m8596M();
                        if (zM8612e || objM8596M3 == s0Var) {
                            objM8596M3 = new C2997b(i12, 0, interfaceC2139c);
                            c3966o.j0(objM8596M3);
                        }
                        a0.m7256b(strM11629c, z6, z10, c4185o, (InterfaceC2137a) objM8596M3, c3966o, 0);
                        i10 = i11;
                    }
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            default:
                num.getClass();
                a0.m7270p(this.f16180b, this.f16181c, interfaceC3962k, C3953b.m8496A(1));
                return qw.a0.f30746a;
        }
    }

    public /* synthetic */ C3001f(C4506a c4506a, C6979d c6979d, int i10) {
        this.f16180b = c4506a;
        this.f16181c = c6979d;
    }
}
