package dr;

import ar.C0418h;
import ar.C0419i;
import br.C0739b;
import br.C0740c;
import ex.InterfaceC2139c;
import qw.C6361k;
import tx.c0;
import uw.C7565i;
import wx.m1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: dr.a */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1751a implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f8483a;

    /* renamed from: b */
    public final /* synthetic */ C1775y f8484b;

    public /* synthetic */ C1751a(C1775y c1775y, int i10) {
        this.f8483a = i10;
        this.f8484b = c1775y;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) {
        Object value;
        C0740c c0740c;
        Object value2;
        C0740c c0740c2;
        switch (this.f8483a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                m1 m1Var = this.f8484b.f8635r;
                do {
                    value = m1Var.getValue();
                    c0740c = (C0740c) value;
                } while (!m1Var.m15397i(value, C0740c.m2037a(c0740c, false, C0739b.m2036a(c0740c.f4669c, null, zBooleanValue, false, false, 0, false, false, false, null, 509), null, null, null, null, null, null, null, false, null, null, false, 1048571)));
                return qw.a0.f30746a;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                m1 m1Var2 = this.f8484b.f8635r;
                do {
                    value2 = m1Var2.getValue();
                    c0740c2 = (C0740c) value2;
                } while (!m1Var2.m15397i(value2, C0740c.m2037a(c0740c2, false, C0739b.m2036a(c0740c2.f4669c, null, false, zBooleanValue2, false, 0, false, false, false, null, 507), null, null, null, null, null, null, null, false, null, null, false, 1048571)));
                return qw.a0.f30746a;
            case 2:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                C1775y c1775y = this.f8484b;
                c1775y.getClass();
                c1775y.m5459s(new C0419i(new C6361k(num, (String) c0.m13468D(C7565i.f36440a, new C1758h(c1775y, iIntValue, null, 0)))));
                break;
            default:
                this.f8484b.m5459s(new C0418h(((Integer) obj).intValue()));
                break;
        }
        return qw.a0.f30746a;
    }
}
