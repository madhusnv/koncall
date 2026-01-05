package au;

import com.websoptimization.callyzerbiz.R;
import cv.AbstractC1505a;
import ex.InterfaceC2137a;
import ex.InterfaceC2141e;
import fb.AbstractC2250x;
import gv.AbstractC2730a;
import k2.C3953b;
import k2.C3961j;
import k2.C3966o;
import k2.InterfaceC3962k;
import lu.AbstractC4518d;
import og.d1;
import og.kf;
import og.t0;
import org.bouncycastle.iana.AEADAlgorithm;
import pg.AbstractC5937r;
import pg.f9;
import qv.AbstractC6327b;
import qw.a0;
import sq.b1;
import sq.g2;
import w2.C7876o;
import xt.AbstractC8450a;
import ys.AbstractC8768a;
import yu.AbstractC8775a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: au.c */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0439c implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f3214a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC2137a f3215b;

    public /* synthetic */ C0439c(int i10, int i11, InterfaceC2137a interfaceC2137a) {
        this.f3214a = i11;
        this.f3215b = interfaceC2137a;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3214a) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC2250x.m5947a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1505a.m5071k(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kf.m10736a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC2730a.m6729a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11843g(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 5:
                InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g2.m13157i(C7876o.f37669a, null, false, t0.m10920c(c3966o, R.string.contact_us), 0L, 0, false, null, this.f3215b, c3966o, 6, 246);
                } else {
                    c3966o.m8601S();
                }
                return a0.f30746a;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC5937r.m11837a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC4518d.m9366c(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                AbstractC4518d.m9364a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC4518d.m9367d(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 10:
                InterfaceC3962k interfaceC3962k2 = (InterfaceC3962k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k2;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strM11629c = f9.m11629c(c3966o2, R.string.troubleshooting);
                    InterfaceC2137a interfaceC2137a = this.f3215b;
                    boolean zM8614g = c3966o2.m8614g(interfaceC2137a);
                    Object objM8596M = c3966o2.m8596M();
                    if (zM8614g || objM8596M == C3961j.f20408a) {
                        objM8596M = new C0440d(23, interfaceC2137a);
                        c3966o2.j0(objM8596M);
                    }
                    g2.m13157i(null, null, false, strM11629c, 0L, 0, false, null, (InterfaceC2137a) objM8596M, c3966o2, 0, 247);
                } else {
                    c3966o2.m8601S();
                }
                return a0.f30746a;
            case 11:
                ((Integer) obj2).getClass();
                d1.m10596b(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12336a(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC6327b.m12352q(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                b1.a0(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                InterfaceC3962k interfaceC3962k3 = (InterfaceC3962k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k3;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g2.m13157i(null, null, false, t0.m10920c(c3966o3, R.string.add_contacts), 0L, R.drawable.icon_arrow_back, false, null, this.f3215b, c3966o3, 0, 215);
                } else {
                    c3966o3.m8601S();
                }
                return a0.f30746a;
            case 16:
                InterfaceC3962k interfaceC3962k4 = (InterfaceC3962k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                C3966o c3966o4 = (C3966o) interfaceC3962k4;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    g2.m13157i(null, null, false, t0.m10920c(c3966o4, R.string.compare), 0L, R.drawable.icon_arrow_back, false, null, this.f3215b, c3966o4, 0, 215);
                } else {
                    c3966o4.m8601S();
                }
                return a0.f30746a;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC8450a.m15764k(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC8450a.m15761h(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC8768a.m16126e(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC8775a.m16146q(this.f3215b, (InterfaceC3962k) obj, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C0439c(int i10, InterfaceC2137a interfaceC2137a) {
        this.f3214a = i10;
        this.f3215b = interfaceC2137a;
    }
}
