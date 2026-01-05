package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class j1 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        try {
            return Integer.valueOf(c6564a.o0());
        } catch (NumberFormatException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        if (((Number) obj) == null) {
            c6566c.mo10029J();
        } else {
            c6566c.f0(r4.intValue());
        }
    }
}
