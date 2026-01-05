package wx;

import tx.C7251k;
import uw.InterfaceC7559c;
import xx.AbstractC8495a;
import xx.AbstractC8497c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d1 extends AbstractC8497c {

    /* renamed from: a */
    public long f39207a;

    /* renamed from: b */
    public C7251k f39208b;

    @Override // xx.AbstractC8497c
    /* renamed from: a */
    public final boolean mo15394a(AbstractC8495a abstractC8495a) {
        b1 b1Var = (b1) abstractC8495a;
        if (this.f39207a >= 0) {
            return false;
        }
        long j6 = b1Var.f39189j;
        if (j6 < b1Var.f39190k) {
            b1Var.f39190k = j6;
        }
        this.f39207a = j6;
        return true;
    }

    @Override // xx.AbstractC8497c
    /* renamed from: b */
    public final InterfaceC7559c[] mo15395b(AbstractC8495a abstractC8495a) {
        long j6 = this.f39207a;
        this.f39207a = -1L;
        this.f39208b = null;
        return ((b1) abstractC8495a).m15367u(j6);
    }
}
