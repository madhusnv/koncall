package nk;

import com.google.gson.JsonSyntaxException;
import com.sun.mail.util.AbstractC1452a;
import java.io.IOException;
import java.util.BitSet;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class c1 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException, NumberFormatException {
        BitSet bitSet = new BitSet();
        c6564a.mo10024h();
        EnumC6565b enumC6565bE0 = c6564a.E0();
        int i10 = 0;
        while (enumC6565bE0 != EnumC6565b.END_ARRAY) {
            int i11 = e1.f24914a[enumC6565bE0.ordinal()];
            boolean zA0 = true;
            if (i11 == 1 || i11 == 2) {
                int iO0 = c6564a.o0();
                if (iO0 == 0) {
                    zA0 = false;
                } else if (iO0 != 1) {
                    StringBuilder sbM4567n = AbstractC1452a.m4567n(iO0, "Invalid bitset value ", ", expected 0 or 1; at path ");
                    sbM4567n.append(c6564a.mo10022P());
                    throw new JsonSyntaxException(sbM4567n.toString());
                }
            } else {
                if (i11 != 3) {
                    throw new JsonSyntaxException("Invalid bitset value type: " + enumC6565bE0 + "; at path " + c6564a.mo10021H());
                }
                zA0 = c6564a.a0();
            }
            if (zA0) {
                bitSet.set(i10);
            }
            i10++;
            enumC6565bE0 = c6564a.E0();
        }
        c6564a.mo10026w();
        return bitSet;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        c6566c.mo10030j();
        int length = bitSet.length();
        for (int i10 = 0; i10 < length; i10++) {
            c6566c.f0(bitSet.get(i10) ? 1L : 0L);
        }
        c6566c.mo10032w();
    }
}
