package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.Currency;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class y0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        String strC0 = c6564a.C0();
        try {
            return Currency.getInstance(strC0);
        } catch (IllegalArgumentException e2) {
            StringBuilder sbM7383p = i0.m0.m7383p("Failed parsing '", strC0, "' as Currency; at path ");
            sbM7383p.append(c6564a.mo10022P());
            throw new JsonSyntaxException(sbM7383p.toString(), e2);
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        c6566c.v0(((Currency) obj).getCurrencyCode());
    }
}
