package cp;

import ex.InterfaceC2141e;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import l7.a0;
import og.fb;
import og.gb;
import qp.C6264a;
import sq.g2;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cp.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1470a implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7520a;

    /* renamed from: b */
    public final /* synthetic */ C6264a f7521b;

    /* renamed from: c */
    public final /* synthetic */ a0 f7522c;

    public /* synthetic */ C1470a(C6264a c6264a, a0 a0Var, int i10) {
        this.f7520a = i10;
        this.f7521b = c6264a;
        this.f7522c = a0Var;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f7520a) {
            case 0:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    C6264a c6264a = this.f7521b;
                    if (c6264a.f30360d) {
                        c3966o.m8607Y(1231837412);
                        g2.a0(c3966o, 6);
                        c3966o.m8623p(false);
                    } else {
                        c3966o.m8607Y(1231906108);
                        gb.m10666c(c6264a, this.f7522c, c3966o, 0);
                        c3966o.m8623p(false);
                    }
                } else {
                    c3966o.m8601S();
                }
                return qw.a0.f30746a;
            case 1:
                int iIntValue2 = num.intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fb.m10648b(this.f7521b, this.f7522c, c3966o2, 0);
                } else {
                    c3966o2.m8601S();
                }
                return qw.a0.f30746a;
            case 2:
                num.getClass();
                fb.m10648b(this.f7521b, this.f7522c, interfaceC3962k, C3953b.m8496A(1));
                break;
            default:
                num.getClass();
                gb.m10666c(this.f7521b, this.f7522c, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return qw.a0.f30746a;
    }

    public /* synthetic */ C1470a(C6264a c6264a, a0 a0Var, int i10, int i11) {
        this.f7520a = i11;
        this.f7521b = c6264a;
        this.f7522c = a0Var;
    }
}
