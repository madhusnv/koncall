package od;

import ai.AbstractC0151h;
import f00.InterfaceC2173b;
import g00.EnumC2418c;
import h00.InterfaceC2766b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import l4.d0;
import nd.EnumC5011b;
import nd.InterfaceC5014e;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: od.g */
/* loaded from: classes.dex */
public final class C5343g extends AbstractC0151h {
    @Override // nd.InterfaceC5016g
    /* renamed from: n */
    public final InterfaceC5014e mo9134n(EnumC5011b level) {
        EnumC2418c enumC2418c;
        AbstractC4154l.m8923f(level, "level");
        InterfaceC2173b interfaceC2173b = (InterfaceC2173b) this.f482a;
        int i10 = AbstractC5344h.f26258a[level.ordinal()];
        if (i10 == 1) {
            enumC2418c = EnumC2418c.ERROR;
        } else if (i10 == 2) {
            enumC2418c = EnumC2418c.WARN;
        } else if (i10 == 3) {
            enumC2418c = EnumC2418c.INFO;
        } else if (i10 == 4) {
            enumC2418c = EnumC2418c.DEBUG;
        } else {
            if (i10 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            enumC2418c = EnumC2418c.TRACE;
        }
        InterfaceC2766b interfaceC2766bMo5850z = interfaceC2173b.mo5850z(enumC2418c);
        AbstractC4154l.m8922e(interfaceC2766bMo5850z, "atLevel(...)");
        return new d0(8, interfaceC2766bMo5850z);
    }
}
