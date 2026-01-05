package bm;

import androidx.compose.foundation.layout.AbstractC0245d;
import com.websoptimization.callyzerbiz.R;
import ex.InterfaceC2141e;
import g2.e6;
import k2.C3953b;
import k2.C3966o;
import k2.InterfaceC3962k;
import og.jc;
import og.r0;
import og.wb;
import qw.a0;
import sq.b1;
import w2.C7876o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bm.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C0694e implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f4347a;

    /* renamed from: b */
    public final /* synthetic */ long f4348b;

    public /* synthetic */ C0694e(int i10, long j6) {
        this.f4347a = 4;
        this.f4348b = j6;
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3962k interfaceC3962k = (InterfaceC3962k) obj;
        Integer num = (Integer) obj2;
        switch (this.f4347a) {
            case 0:
                int iIntValue = num.intValue();
                C3966o c3966o = (C3966o) interfaceC3962k;
                if (c3966o.m8598P(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e6.m6133b(jc.m10712a(), "search", AbstractC0245d.m678o(C7876o.f37669a, 20), this.f4348b, c3966o, 432, 0);
                } else {
                    c3966o.m8601S();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                C3966o c3966o2 = (C3966o) interfaceC3962k;
                if (c3966o2.m8598P(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    e6.m6133b(wb.m11029b(), null, AbstractC0245d.m678o(C7876o.f37669a, 20), this.f4348b, c3966o2, 432, 0);
                } else {
                    c3966o2.m8601S();
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                C3966o c3966o3 = (C3966o) interfaceC3962k;
                if (c3966o3.m8598P(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e6.m6132a(r0.m10866b(R.drawable.ic_copy, 0, c3966o3), "copy", AbstractC0245d.m678o(C7876o.f37669a, 25), this.f4348b, c3966o3, 3504, 0);
                } else {
                    c3966o3.m8601S();
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                C3966o c3966o4 = (C3966o) interfaceC3962k;
                if (c3966o4.m8598P(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    e6.m6132a(r0.m10866b(R.drawable.ic_wp, 0, c3966o4), "whatsApp", AbstractC0245d.m678o(C7876o.f37669a, 25), this.f4348b, c3966o4, 3504, 0);
                } else {
                    c3966o4.m8601S();
                }
                break;
            default:
                num.getClass();
                b1.m13080J(this.f4348b, interfaceC3962k, C3953b.m8496A(1));
                break;
        }
        return a0.f30746a;
    }

    public /* synthetic */ C0694e(long j6, int i10, byte b10) {
        this.f4347a = i10;
        this.f4348b = j6;
    }
}
