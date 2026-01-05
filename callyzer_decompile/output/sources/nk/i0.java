package nk;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kk.AbstractC4103w;
import rk.C6564a;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public class i0 extends AbstractC4103w {
    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        ArrayList arrayList = new ArrayList();
        c6564a.mo10024h();
        while (c6564a.mo10023R()) {
            try {
                arrayList.add(Integer.valueOf(c6564a.o0()));
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }
        c6564a.mo10026w();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final void mo8852c(C6566c c6566c, Object obj) throws IOException {
        c6566c.mo10030j();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i10 = 0; i10 < length; i10++) {
            c6566c.f0(r6.get(i10));
        }
        c6566c.mo10032w();
    }
}
