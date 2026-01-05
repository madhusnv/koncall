package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class k1 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) {
        try {
            return new AtomicInteger(c6564a.o0());
        } catch (NumberFormatException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        c6566c.f0(((AtomicInteger) obj).get());
    }
}
