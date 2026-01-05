package rr;

import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import hq.C3004i;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.t0;
import qw.a0;
import s2.AbstractC6740i;
import sq.g2;
import vs.AbstractC7766h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rr.h */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6608h implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f31749a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f31750b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC2137a f31751c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC2137a f31752d;

    public /* synthetic */ C6608h(String str, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2) {
        this.f31750b = str;
        this.f31751c = interfaceC2137a;
        this.f31752d = interfaceC2137a2;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31749a) {
            case 0:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g2.m13157i(null, null, true, t0.m10919b(R.string.select, new Object[]{this.f31750b}, c3966o), 0L, 0, false, AbstractC6740i.m12902d(-1819193907, new C3004i(3, this.f31752d), c3966o), this.f31751c, c3966o, 12583296, 115);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC7766h.m14748g(this.f31750b, this.f31751c, this.f31752d, (InterfaceC3962k) obj, C3953b.m8496A(385));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C6608h(String str, InterfaceC2137a interfaceC2137a, InterfaceC2137a interfaceC2137a2, int i10) {
        this.f31750b = str;
        this.f31751c = interfaceC2137a;
        this.f31752d = interfaceC2137a2;
    }
}
