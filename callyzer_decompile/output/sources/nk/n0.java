package nk;

import java.io.IOException;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class n0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        EnumC6565b enumC6565bE0 = c6564a.E0();
        if (enumC6565bE0 != EnumC6565b.NULL) {
            return enumC6565bE0 == EnumC6565b.BOOLEAN ? Boolean.toString(c6564a.a0()) : c6564a.C0();
        }
        c6564a.A0();
        return null;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        c6566c.v0((String) obj);
    }
}
