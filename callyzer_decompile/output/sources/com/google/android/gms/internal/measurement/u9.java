package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import og.sa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class u9 extends AbstractC1292h {

    /* renamed from: c */
    public final v5 f6415c;

    /* renamed from: d */
    public final HashMap f6416d;

    public u9(v5 v5Var) {
        super("require");
        this.f6416d = new HashMap();
        this.f6415c = v5Var;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1292h
    /* renamed from: d */
    public final InterfaceC1298n mo3299d(C0919n c0919n, List list) {
        InterfaceC1298n interfaceC1298n;
        sa.m10888a(1, "require", list);
        String strMo3210b = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(0)).mo3210b();
        HashMap map = this.f6416d;
        if (map.containsKey(strMo3210b)) {
            return (InterfaceC1298n) map.get(strMo3210b);
        }
        HashMap map2 = (HashMap) this.f6415c.f6423a;
        if (map2.containsKey(strMo3210b)) {
            try {
                interfaceC1298n = (InterfaceC1298n) ((Callable) map2.get(strMo3210b)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strMo3210b)));
            }
        } else {
            interfaceC1298n = InterfaceC1298n.f6309i;
        }
        if (interfaceC1298n instanceof AbstractC1292h) {
            map.put(strMo3210b, (AbstractC1292h) interfaceC1298n);
        }
        return interfaceC1298n;
    }
}
