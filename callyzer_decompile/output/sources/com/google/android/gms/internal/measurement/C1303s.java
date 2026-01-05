package com.google.android.gms.internal.measurement;

import c9.C0919n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import og.sa;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.android.gms.internal.measurement.s */
/* loaded from: classes.dex */
public final class C1303s {

    /* renamed from: a */
    public final ArrayList f6370a = new ArrayList();

    /* renamed from: b */
    public final /* synthetic */ int f6371b;

    public C1303s(int i10) {
        this.f6371b = i10;
    }

    /* renamed from: c */
    public static C1297m m3632c(C0919n c0919n, List list) {
        sa.m10890c(2, EnumC1307w.FN.name(), list);
        InterfaceC1298n interfaceC1298nM3666c = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(0));
        InterfaceC1298n interfaceC1298nM3666c2 = ((C1304t) c0919n.f5599b).m3666c(c0919n, (InterfaceC1298n) list.get(1));
        if (!(interfaceC1298nM3666c2 instanceof C1288d)) {
            throw new IllegalArgumentException(i0.m0.m7378k("FN requires an ArrayValue of parameter names found ", interfaceC1298nM3666c2.getClass().getCanonicalName()));
        }
        List listM3218r = ((C1288d) interfaceC1298nM3666c2).m3218r();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C1297m(interfaceC1298nM3666c.mo3210b(), (ArrayList) listM3218r, arrayList, c0919n);
    }

    /* renamed from: d */
    public static boolean m3633d(InterfaceC1298n interfaceC1298n, InterfaceC1298n interfaceC1298n2) {
        if (interfaceC1298n instanceof InterfaceC1294j) {
            interfaceC1298n = new C1301q(interfaceC1298n.mo3210b());
        }
        if (interfaceC1298n2 instanceof InterfaceC1294j) {
            interfaceC1298n2 = new C1301q(interfaceC1298n2.mo3210b());
        }
        if ((interfaceC1298n instanceof C1301q) && (interfaceC1298n2 instanceof C1301q)) {
            return ((C1301q) interfaceC1298n).f6347a.compareTo(((C1301q) interfaceC1298n2).f6347a) < 0;
        }
        double dDoubleValue = interfaceC1298n.mo3212e().doubleValue();
        double dDoubleValue2 = interfaceC1298n2.mo3212e().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* renamed from: e */
    public static InterfaceC1298n m3634e(C1306v c1306v, InterfaceC1298n interfaceC1298n, InterfaceC1298n interfaceC1298n2) {
        if (interfaceC1298n instanceof Iterable) {
            return m3636g(c1306v, ((Iterable) interfaceC1298n).iterator(), interfaceC1298n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: f */
    public static boolean m3635f(InterfaceC1298n interfaceC1298n, InterfaceC1298n interfaceC1298n2) {
        if (interfaceC1298n.getClass().equals(interfaceC1298n2.getClass())) {
            if ((interfaceC1298n instanceof C1302r) || (interfaceC1298n instanceof C1296l)) {
                return true;
            }
            return interfaceC1298n instanceof C1291g ? (Double.isNaN(interfaceC1298n.mo3212e().doubleValue()) || Double.isNaN(interfaceC1298n2.mo3212e().doubleValue()) || interfaceC1298n.mo3212e().doubleValue() != interfaceC1298n2.mo3212e().doubleValue()) ? false : true : interfaceC1298n instanceof C1301q ? interfaceC1298n.mo3210b().equals(interfaceC1298n2.mo3210b()) : interfaceC1298n instanceof C1289e ? interfaceC1298n.mo3209a().equals(interfaceC1298n2.mo3209a()) : interfaceC1298n == interfaceC1298n2;
        }
        if (((interfaceC1298n instanceof C1302r) || (interfaceC1298n instanceof C1296l)) && ((interfaceC1298n2 instanceof C1302r) || (interfaceC1298n2 instanceof C1296l))) {
            return true;
        }
        boolean z6 = interfaceC1298n instanceof C1291g;
        if (z6 && (interfaceC1298n2 instanceof C1301q)) {
            return m3635f(interfaceC1298n, new C1291g(interfaceC1298n2.mo3212e()));
        }
        boolean z10 = interfaceC1298n instanceof C1301q;
        if (z10 && (interfaceC1298n2 instanceof C1291g)) {
            return m3635f(new C1291g(interfaceC1298n.mo3212e()), interfaceC1298n2);
        }
        if (interfaceC1298n instanceof C1289e) {
            return m3635f(new C1291g(interfaceC1298n.mo3212e()), interfaceC1298n2);
        }
        if (interfaceC1298n2 instanceof C1289e) {
            return m3635f(interfaceC1298n, new C1291g(interfaceC1298n2.mo3212e()));
        }
        if ((z10 || z6) && (interfaceC1298n2 instanceof InterfaceC1294j)) {
            return m3635f(interfaceC1298n, new C1301q(interfaceC1298n2.mo3210b()));
        }
        if ((interfaceC1298n instanceof InterfaceC1294j) && ((interfaceC1298n2 instanceof C1301q) || (interfaceC1298n2 instanceof C1291g))) {
            return m3635f(new C1301q(interfaceC1298n.mo3210b()), interfaceC1298n2);
        }
        return false;
    }

    /* renamed from: g */
    public static InterfaceC1298n m3636g(C1306v c1306v, Iterator it, InterfaceC1298n interfaceC1298n) {
        C0919n c0919nM2661g;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC1298n interfaceC1298n2 = (InterfaceC1298n) it.next();
                switch (c1306v.f6417a) {
                    case 0:
                        c0919nM2661g = c1306v.f6418b.m2661g();
                        String str = c1306v.f6419c;
                        c0919nM2661g.m2665k(str, interfaceC1298n2);
                        ((HashMap) c0919nM2661g.f5601d).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        c0919nM2661g = c1306v.f6418b.m2661g();
                        c0919nM2661g.m2665k(c1306v.f6419c, interfaceC1298n2);
                        break;
                    default:
                        c0919nM2661g = c1306v.f6418b;
                        c0919nM2661g.m2665k(c1306v.f6419c, interfaceC1298n2);
                        break;
                }
                InterfaceC1298n interfaceC1298nM2660f = c0919nM2661g.m2660f((C1288d) interfaceC1298n);
                if (interfaceC1298nM2660f instanceof C1290f) {
                    C1290f c1290f = (C1290f) interfaceC1298nM2660f;
                    String str2 = c1290f.f6182b;
                    if ("break".equals(str2)) {
                        return InterfaceC1298n.f6309i;
                    }
                    if ("return".equals(str2)) {
                        return c1290f;
                    }
                }
            }
        }
        return InterfaceC1298n.f6309i;
    }

    /* renamed from: h */
    public static boolean m3637h(InterfaceC1298n interfaceC1298n, InterfaceC1298n interfaceC1298n2) {
        if (interfaceC1298n instanceof InterfaceC1294j) {
            interfaceC1298n = new C1301q(interfaceC1298n.mo3210b());
        }
        if (interfaceC1298n2 instanceof InterfaceC1294j) {
            interfaceC1298n2 = new C1301q(interfaceC1298n2.mo3210b());
        }
        return (((interfaceC1298n instanceof C1301q) && (interfaceC1298n2 instanceof C1301q)) || !(Double.isNaN(interfaceC1298n.mo3212e().doubleValue()) || Double.isNaN(interfaceC1298n2.mo3212e().doubleValue()))) && !m3633d(interfaceC1298n2, interfaceC1298n);
    }

    /* JADX WARN: Removed duplicated region for block: B:504:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC1298n m3638a(java.lang.String r12, c9.C0919n r13, java.util.ArrayList r14) {
        /*
            Method dump skipped, instructions count: 3792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1303s.m3638a(java.lang.String, c9.n, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    /* renamed from: b */
    public final void m3639b(String str) {
        if (!this.f6370a.contains(sa.m10895h(str))) {
            throw new IllegalArgumentException("Command not supported");
        }
        throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
    }
}
