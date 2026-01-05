package cv;

import ex.InterfaceC2141e;
import g2.p9;
import g2.ta;
import k2.C3966o;
import k2.InterfaceC3962k;
import qw.a0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: cv.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1522r implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f7666a;

    /* renamed from: b */
    public final /* synthetic */ ta f7667b;

    public /* synthetic */ C1522r(ta taVar, int i10) {
        this.f7666a = i10;
        this.f7667b = taVar;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7666a;
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9.m6250n(this.f7667b, null, null, c3966o, 6);
                } else {
                    c3966o.m8601S();
                }
                break;
            default:
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p9.m6250n(this.f7667b, null, null, c3966o2, 6);
                } else {
                    c3966o2.m8601S();
                }
                break;
        }
        return a0.f30746a;
    }
}
