package ds;

import aw.d0;
import com.websoptimization.callyzerbiz.data.model.response.lead.Leads;
import cs.C1485d;
import cs.C1488g;
import ex.InterfaceC2137a;
import fs.C2371b;
import gs.C2715a;
import gs.C2728n;
import qw.a0;
import tx.c0;
import uw.InterfaceC7559c;
import wx.m1;
import xm.r3;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ds.n */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1790n implements InterfaceC2137a {

    /* renamed from: a */
    public final /* synthetic */ int f8687a;

    /* renamed from: b */
    public final /* synthetic */ C2728n f8688b;

    public /* synthetic */ C1790n(C2728n c2728n, int i10) {
        this.f8687a = i10;
        this.f8688b = c2728n;
    }

    @Override // ex.InterfaceC2137a
    public final Object invoke() {
        Object value;
        Object value2;
        switch (this.f8687a) {
            case 0:
                this.f8688b.m6727e(C1488g.f7568a);
                break;
            case 1:
                this.f8688b.m6727e(C1485d.f7564a);
                break;
            default:
                C2728n c2728n = this.f8688b;
                C8810d c8810d = c2728n.f15222k;
                String str = c2728n.f15219h;
                m1 m1Var = c2728n.f15224m;
                InterfaceC7559c interfaceC7559c = null;
                if (str == null) {
                    return null;
                }
                do {
                    value = m1Var.getValue();
                } while (!m1Var.m15397i(value, C2371b.m6058a((C2371b) value, true, null, null, null, null, null, false, false, null, null, 4028)));
                r3 r3Var = c2728n.f15214c.f10663c;
                Leads leads = r3.f40778i;
                if (leads != null) {
                    c2728n.f15226o.m15398j(leads.m4919f());
                    return c0.m13502y(c8810d, null, null, new C2715a(c2728n, leads, interfaceC7559c, 3), 3);
                }
                String str2 = c2728n.f15220i;
                do {
                    value2 = m1Var.getValue();
                } while (!m1Var.m15397i(value2, C2371b.m6058a((C2371b) value2, true, null, null, null, null, null, false, false, null, null, 4094)));
                c0.m13502y(c8810d, null, null, new d0(c2728n, str, str2, interfaceC7559c, 5), 3);
                return a0.f30746a;
        }
        return a0.f30746a;
    }
}
