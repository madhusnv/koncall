package th;

import h6.C2856l;
import l1.C4327p;
import l4.C4367l;
import l4.d0;
import uh.C7457b;
import uh.InterfaceC7458c;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: th.e */
/* loaded from: classes.dex */
public final class C7155e implements InterfaceC7458c {

    /* renamed from: a */
    public final InterfaceC7458c f34393a;

    public C7155e(InterfaceC7458c interfaceC7458c) {
        this.f34393a = interfaceC7458c;
    }

    @Override // uh.InterfaceC7458c
    public Object zza() {
        C7154d c7154d = (C7154d) this.f34393a.zza();
        if (c7154d != null) {
            return c7154d;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ C7155e(C2856l c2856l) {
        C4327p c4327p = new C4327p(25, c2856l);
        int i10 = 28;
        this.f34393a = C7457b.m14270a(new C7155e(C7457b.m14270a(new C4367l(i10, C7457b.m14270a(new C8849i(16, c4327p, C7457b.m14270a(new d0(19, c4327p)))), C7457b.m14270a(new C4327p(24, c4327p)), c4327p))));
    }
}
