package com.google.android.gms.internal.measurement;

import a1.C0005d;
import c9.C0919n;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import og.sa;
import og.ta;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class l4 extends AbstractC1292h {

    /* renamed from: c */
    public final /* synthetic */ int f6282c = 0;

    /* renamed from: d */
    public final Object f6283d;

    public l4(C0005d c0005d) {
        super("internal.eventLogger");
        this.f6283d = c0005d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1292h
    /* renamed from: d */
    public final InterfaceC1298n mo3299d(C0919n c0919n, List list) {
        TreeMap treeMap;
        switch (this.f6282c) {
            case 0:
                sa.m10888a(3, this.f6222a, list);
                String strMo3210b = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(0)).mo3210b();
                InterfaceC1298n interfaceC1298n = (InterfaceC1298n) list.get(1);
                C1304t c1304t = (C1304t) c0919n.f5599b;
                long jM10899l = (long) sa.m10899l(c1304t.m3666c(c0919n, interfaceC1298n).mo3212e().doubleValue());
                InterfaceC1298n interfaceC1298nM3666c = c1304t.m3666c(c0919n, (InterfaceC1298n) list.get(2));
                HashMap mapM10901n = interfaceC1298nM3666c instanceof C1295k ? sa.m10901n((C1295k) interfaceC1298nM3666c) : new HashMap();
                C0005d c0005d = (C0005d) this.f6283d;
                c0005d.getClass();
                HashMap map = new HashMap();
                for (String str : mapM10901n.keySet()) {
                    HashMap map2 = ((C1286b) c0005d.f25c).f6070c;
                    map.put(str, C1286b.m3132b(str, map2.containsKey(str) ? map2.get(str) : null, mapM10901n.get(str)));
                }
                ((ArrayList) c0005d.f24b).add(new C1286b(strMo3210b, jM10899l, map));
                return InterfaceC1298n.f6309i;
            case 1:
                sa.m10888a(2, "getValue", list);
                InterfaceC1298n interfaceC1298nM3666c2 = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(0));
                InterfaceC1298n interfaceC1298nM3666c3 = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(1));
                String strMo3210b2 = interfaceC1298nM3666c2.mo3210b();
                C8849i c8849i = (C8849i) this.f6283d;
                Map map3 = (Map) ((ug.i1) c8849i.f42584c).f35510d.get((String) c8849i.f42583b);
                String str2 = (map3 == null || !map3.containsKey(strMo3210b2)) ? null : (String) map3.get(strMo3210b2);
                return str2 != null ? new C1301q(str2) : interfaceC1298nM3666c3;
            case 2:
                return InterfaceC1298n.f6309i;
            case 3:
                try {
                    return ta.m10926b(((ug.h1) this.f6283d).call());
                } catch (Exception unused) {
                    return InterfaceC1298n.f6309i;
                }
            default:
                sa.m10888a(3, this.f6222a, list);
                ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(0)).mo3210b();
                InterfaceC1298n interfaceC1298n2 = (InterfaceC1298n) list.get(1);
                C1304t c1304t2 = (C1304t) c0919n.f5599b;
                InterfaceC1298n interfaceC1298nM3666c4 = c1304t2.m3666c(c0919n, interfaceC1298n2);
                if (!(interfaceC1298nM3666c4 instanceof C1297m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC1298n interfaceC1298nM3666c5 = c1304t2.m3666c(c0919n, (InterfaceC1298n) list.get(2));
                if (!(interfaceC1298nM3666c5 instanceof C1295k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C1295k c1295k = (C1295k) interfaceC1298nM3666c5;
                HashMap map4 = c1295k.f6262a;
                if (!map4.containsKey(TransferTable.COLUMN_TYPE)) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strMo3210b3 = c1295k.mo3213h(TransferTable.COLUMN_TYPE).mo3210b();
                int iM10898k = map4.containsKey("priority") ? sa.m10898k(c1295k.mo3213h("priority").mo3212e().doubleValue()) : IMAPStore.RESPONSE;
                C1304t c1304t3 = (C1304t) this.f6283d;
                C1297m c1297m = (C1297m) interfaceC1298nM3666c4;
                c1304t3.getClass();
                if ("create".equals(strMo3210b3)) {
                    treeMap = (TreeMap) c1304t3.f6377b;
                } else {
                    if (!"edit".equals(strMo3210b3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strMo3210b3)));
                    }
                    treeMap = (TreeMap) c1304t3.f6376a;
                }
                if (treeMap.containsKey(Integer.valueOf(iM10898k))) {
                    iM10898k = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iM10898k), c1297m);
                return InterfaceC1298n.f6309i;
        }
    }

    public l4(C1304t c1304t) {
        super("internal.registerCallback");
        this.f6283d = c1304t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(t5 t5Var, C8849i c8849i) {
        super("getValue");
        this.f6283d = c8849i;
    }

    public l4(l4.d0 d0Var) {
        super("internal.logger");
        this.f6283d = d0Var;
        this.f6223b.put("log", new t9(this, false, true));
        this.f6223b.put("silent", new t5("silent", 1));
        ((AbstractC1292h) this.f6223b.get("silent")).mo3215k("log", new t9(this, true, true));
        this.f6223b.put("unmonitored", new t5("unmonitored", 2));
        ((AbstractC1292h) this.f6223b.get("unmonitored")).mo3215k("log", new t9(this, false, false));
    }

    public l4(ug.h1 h1Var) {
        super("internal.appMetadata");
        this.f6283d = h1Var;
    }
}
