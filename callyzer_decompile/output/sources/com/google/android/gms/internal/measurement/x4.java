package com.google.android.gms.internal.measurement;

import a1.C0005d;
import c9.C0919n;
import java.util.ArrayList;
import java.util.HashMap;
import og.sa;
import og.ta;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class x4 extends C1295k {

    /* renamed from: b */
    public final C0005d f6445b;

    public x4(C0005d c0005d) {
        this.f6445b = c0005d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.C1295k, com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: j */
    public final InterfaceC1298n mo3214j(String str, C0919n c0919n, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        C0005d c0005d = this.f6445b;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    sa.m10888a(0, "getEventName", arrayList);
                    return new C1301q(((C1286b) c0005d.f26d).f6068a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    sa.m10888a(0, "getTimestamp", arrayList);
                    return new C1291g(Double.valueOf(((C1286b) c0005d.f26d).f6069b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    sa.m10888a(1, "getParamValue", arrayList);
                    String strMo3210b = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(0)).mo3210b();
                    HashMap map = ((C1286b) c0005d.f26d).f6070c;
                    return ta.m10926b(map.containsKey(strMo3210b) ? map.get(strMo3210b) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    sa.m10888a(0, "getParams", arrayList);
                    HashMap map2 = ((C1286b) c0005d.f26d).f6070c;
                    C1295k c1295k = new C1295k();
                    for (String str2 : map2.keySet()) {
                        c1295k.mo3215k(str2, ta.m10926b(map2.get(str2)));
                    }
                    return c1295k;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    sa.m10888a(2, "setParamValue", arrayList);
                    String strMo3210b2 = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(0)).mo3210b();
                    InterfaceC1298n interfaceC1298nM3666c = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(1));
                    C1286b c1286b = (C1286b) c0005d.f26d;
                    Object objM10900m = sa.m10900m(interfaceC1298nM3666c);
                    HashMap map3 = c1286b.f6070c;
                    if (objM10900m == null) {
                        map3.remove(strMo3210b2);
                        return interfaceC1298nM3666c;
                    }
                    map3.put(strMo3210b2, C1286b.m3132b(strMo3210b2, map3.get(strMo3210b2), objM10900m));
                    return interfaceC1298nM3666c;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    sa.m10888a(1, "setEventName", arrayList);
                    InterfaceC1298n interfaceC1298nM3666c2 = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) arrayList.get(0));
                    if (InterfaceC1298n.f6309i.equals(interfaceC1298nM3666c2) || InterfaceC1298n.f6310o.equals(interfaceC1298nM3666c2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((C1286b) c0005d.f26d).f6068a = interfaceC1298nM3666c2.mo3210b();
                    return new C1301q(interfaceC1298nM3666c2.mo3210b());
                }
                break;
        }
        return super.mo3214j(str, c0919n, arrayList);
    }
}
