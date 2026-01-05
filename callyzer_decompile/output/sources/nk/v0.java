package nk;

import com.google.gson.JsonIOException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class v0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        try {
            String strC0 = c6564a.C0();
            if (strC0.equals("null")) {
                return null;
            }
            return new URI(strC0);
        } catch (URISyntaxException e2) {
            throw new JsonIOException(e2);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        URI uri = (URI) obj;
        c6566c.v0(uri == null ? null : uri.toASCIIString());
    }
}
