package com.google.android.gms.internal.measurement;

import c9.C0919n;
import com.sun.mail.util.AbstractC1452a;
import java.util.ArrayList;
import og.sa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.j */
/* loaded from: classes.dex */
public interface InterfaceC1294j {
    /* renamed from: g */
    static InterfaceC1298n m3343g(InterfaceC1294j interfaceC1294j, C1301q c1301q, C0919n c0919n, ArrayList arrayList) {
        String str = c1301q.f6347a;
        if (interfaceC1294j.mo3216m(str)) {
            InterfaceC1298n interfaceC1298nMo3213h = interfaceC1294j.mo3213h(str);
            if (interfaceC1298nMo3213h instanceof AbstractC1292h) {
                return ((AbstractC1292h) interfaceC1298nMo3213h).mo3299d(c0919n, arrayList);
            }
            throw new IllegalArgumentException(AbstractC1452a.m4561h(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(i0.m0.m7378k("Object has no function ", str));
        }
        sa.m10888a(1, "hasOwnProperty", arrayList);
        return interfaceC1294j.mo3216m(((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(0)).mo3210b()) ? InterfaceC1298n.f6306P : InterfaceC1298n.f6307Q;
    }

    /* renamed from: h */
    InterfaceC1298n mo3213h(String str);

    /* renamed from: k */
    void mo3215k(String str, InterfaceC1298n interfaceC1298n);

    /* renamed from: m */
    boolean mo3216m(String str);
}
