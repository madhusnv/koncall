package kk;

import java.io.IOException;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kk.v */
/* loaded from: classes.dex */
public final class C4102v extends AbstractC4103w {

    /* renamed from: a */
    public final /* synthetic */ AbstractC4103w f21000a;

    public C4102v(AbstractC4103w abstractC4103w) {
        this.f21000a = abstractC4103w;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        if (c6564a.E0() != EnumC6565b.NULL) {
            return this.f21000a.mo8851b(c6564a);
        }
        c6564a.A0();
        return null;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        if (obj == null) {
            c6566c.mo10029J();
        } else {
            this.f21000a.mo8852c(c6566c, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.f21000a + "]";
    }
}
