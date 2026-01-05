package wr;

import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import g2.p9;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import ls.C4512c;
import qw.a0;
import s2.AbstractC6740i;
import uv.AbstractC7554g;
import w1.AbstractC7861e;
import zr.C9032b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wr.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8145a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f39021a;

    /* renamed from: b */
    public final /* synthetic */ C9032b f39022b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2139c f39023c;

    public /* synthetic */ C8145a(C9032b c9032b, InterfaceC2139c interfaceC2139c) {
        this.f39021a = 1;
        this.f39022b = c9032b;
        this.f39023c = interfaceC2139c;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f39021a) {
            case 0:
                num.getClass();
                AbstractC8154j.m15335n(this.f39022b, this.f39023c, interfaceC3962k, C3953b.m8496A(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9.m6240d(null, AbstractC7861e.m14840a(6), p9.m6253q(AbstractC7554g.m14301b(c3966o).f36406r, c3966o, 0), null, null, AbstractC6740i.m12902d(-2065798452, new C4512c(16, this.f39022b, this.f39023c), c3966o), c3966o, 196608, 25);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            default:
                num.getClass();
                AbstractC8154j.m15332k(this.f39022b, this.f39023c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C8145a(C9032b c9032b, InterfaceC2139c interfaceC2139c, int i10, int i11) {
        this.f39021a = i11;
        this.f39022b = c9032b;
        this.f39023c = interfaceC2139c;
    }
}
