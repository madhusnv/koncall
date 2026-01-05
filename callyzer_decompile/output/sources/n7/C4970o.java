package n7;

import java.util.Iterator;
import java.util.List;
import l7.AbstractC4422v;
import l7.C4409i;
import l7.d0;
import l7.m0;
import l7.n0;
import og.pe;
import rw.AbstractC6663m;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
@m0("dialog")
/* renamed from: n7.o */
/* loaded from: classes.dex */
public final class C4970o extends n0 {
    @Override // l7.n0
    /* renamed from: a */
    public final AbstractC4422v mo9193a() {
        C6734c c6734c = AbstractC4960e.f24649a;
        return new C4969n(this);
    }

    @Override // l7.n0
    /* renamed from: d */
    public final void mo9226d(List list, d0 d0Var) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m9225b().m9222h((C4409i) it.next());
        }
    }

    @Override // l7.n0
    /* renamed from: i */
    public final void mo9231i(C4409i c4409i, boolean z6) {
        m9225b().m9220f(c4409i, z6);
        int iM12745I = AbstractC6663m.m12745I((Iterable) m9225b().f22081f.f39340a.getValue(), c4409i);
        int i10 = 0;
        for (Object obj : (Iterable) m9225b().f22081f.f39340a.getValue()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                pe.m10842q();
                throw null;
            }
            C4409i c4409i2 = (C4409i) obj;
            if (i10 > iM12745I) {
                m9225b().m9217c(c4409i2);
            }
            i10 = i11;
        }
    }
}
