package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.m */
/* loaded from: classes.dex */
public final class C1297m extends AbstractC1292h {

    /* renamed from: c */
    public final ArrayList f6290c;

    /* renamed from: d */
    public final ArrayList f6291d;

    /* renamed from: e */
    public final C0919n f6292e;

    public C1297m(C1297m c1297m) {
        super(c1297m.f6222a);
        ArrayList arrayList = new ArrayList(c1297m.f6290c.size());
        this.f6290c = arrayList;
        arrayList.addAll(c1297m.f6290c);
        ArrayList arrayList2 = new ArrayList(c1297m.f6291d.size());
        this.f6291d = arrayList2;
        arrayList2.addAll(c1297m.f6291d);
        this.f6292e = c1297m.f6292e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1292h
    /* renamed from: d */
    public final InterfaceC1298n mo3299d(C0919n c0919n, List list) {
        C1302r c1302r;
        C0919n c0919nM2661g = this.f6292e.m2661g();
        C1304t c1304t = (C1304t) c0919nM2661g.f5599b;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f6290c;
            int size = arrayList.size();
            c1302r = InterfaceC1298n.f6309i;
            if (i11 >= size) {
                break;
            }
            if (i11 < list.size()) {
                c0919nM2661g.m2665k((String) arrayList.get(i11), ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(i11)));
            } else {
                c0919nM2661g.m2665k((String) arrayList.get(i11), c1302r);
            }
            i11++;
        }
        ArrayList arrayList2 = this.f6291d;
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj = arrayList2.get(i10);
            i10++;
            InterfaceC1298n interfaceC1298n = (InterfaceC1298n) obj;
            InterfaceC1298n interfaceC1298nM3666c = c1304t.m3666c(c0919nM2661g, interfaceC1298n);
            if (interfaceC1298nM3666c instanceof C1299o) {
                interfaceC1298nM3666c = c1304t.m3666c(c0919nM2661g, interfaceC1298n);
            }
            if (interfaceC1298nM3666c instanceof C1290f) {
                return ((C1290f) interfaceC1298nM3666c).f6181a;
            }
        }
        return c1302r;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1292h, com.google.android.gms.internal.measurement.InterfaceC1298n
    /* renamed from: q */
    public final InterfaceC1298n mo3217q() {
        return new C1297m(this);
    }

    public C1297m(String str, ArrayList arrayList, List list, C0919n c0919n) {
        super(str);
        this.f6290c = new ArrayList();
        this.f6292e = c0919n;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                this.f6290c.add(((InterfaceC1298n) obj).mo3210b());
            }
        }
        this.f6291d = new ArrayList(list);
    }
}
