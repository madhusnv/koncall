package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class m0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (c6564a.E0() == EnumC6565b.NULL) {
            c6564a.A0();
            return null;
        }
        String strC0 = c6564a.C0();
        if (strC0.length() == 1) {
            return Character.valueOf(strC0.charAt(0));
        }
        StringBuilder sbM7383p = i0.m0.m7383p("Expecting character, got: ", strC0, "; at ");
        sbM7383p.append(c6564a.mo10022P());
        throw new JsonSyntaxException(sbM7383p.toString());
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        Character ch2 = (Character) obj;
        c6566c.v0(ch2 == null ? null : String.valueOf(ch2));
    }
}
