package g2;

import d3.C1565s;
import d3.InterfaceC1566t;
import v3.AbstractC7634f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x4 implements InterfaceC1566t {

    /* renamed from: a */
    public final /* synthetic */ int f13212a;

    /* renamed from: b */
    public final /* synthetic */ Object f13213b;

    public /* synthetic */ x4(int i10, Object obj) {
        this.f13212a = i10;
        this.f13213b = obj;
    }

    @Override // d3.InterfaceC1566t
    /* renamed from: a */
    public final long mo5194a() {
        switch (this.f13212a) {
            case 0:
                z4 z4Var = (z4) this.f13213b;
                long jMo5194a = z4Var.f13366w.mo5194a();
                if (jMo5194a != 16) {
                    return jMo5194a;
                }
                o9 o9Var = (o9) AbstractC7634f.m14548i(z4Var, q9.f12511b);
                if (o9Var != null) {
                    long j6 = o9Var.f12307a;
                    if (j6 != 16) {
                        return j6;
                    }
                }
                return ((C1565s) AbstractC7634f.m14548i(z4Var, k2.f11902a)).f7819a;
            default:
                return ((r9) this.f13213b).f12612c;
        }
    }
}
