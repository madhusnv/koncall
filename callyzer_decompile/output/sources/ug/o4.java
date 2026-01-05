package ug;

import com.google.android.gms.internal.measurement.u7;
import e1.C1900b;
import e1.C1903e;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: a */
    public final String f35735a;

    /* renamed from: b */
    public final boolean f35736b;

    /* renamed from: c */
    public final com.google.android.gms.internal.measurement.n3 f35737c;

    /* renamed from: d */
    public final BitSet f35738d;

    /* renamed from: e */
    public final BitSet f35739e;

    /* renamed from: f */
    public final C1903e f35740f;

    /* renamed from: g */
    public final C1903e f35741g;

    /* renamed from: h */
    public final /* synthetic */ C7432c f35742h;

    public o4(C7432c c7432c, String str, com.google.android.gms.internal.measurement.n3 n3Var, BitSet bitSet, BitSet bitSet2, C1903e c1903e, C1903e c1903e2) {
        this.f35742h = c7432c;
        this.f35735a = str;
        this.f35738d = bitSet;
        this.f35739e = bitSet2;
        this.f35740f = c1903e;
        this.f35741g = new C1903e(0);
        Iterator it = ((C1900b) c1903e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1903e2.get(num));
            this.f35741g.put(num, arrayList);
        }
        this.f35736b = false;
        this.f35737c = n3Var;
    }

    /* renamed from: a */
    public final void m14099a(C7431b c7431b) {
        int iM3543q;
        boolean z6;
        boolean zM3548v;
        switch (c7431b.f35271g) {
            case 0:
                iM3543q = ((com.google.android.gms.internal.measurement.p1) c7431b.f35273i).m3543q();
                break;
            default:
                iM3543q = ((com.google.android.gms.internal.measurement.w1) c7431b.f35273i).m3733q();
                break;
        }
        if (c7431b.f35267c != null) {
            this.f35739e.set(iM3543q, true);
        }
        Boolean bool = c7431b.f35268d;
        if (bool != null) {
            this.f35738d.set(iM3543q, bool.booleanValue());
        }
        if (c7431b.f35269e != null) {
            Integer numValueOf = Integer.valueOf(iM3543q);
            C1903e c1903e = this.f35740f;
            Long l9 = (Long) c1903e.get(numValueOf);
            long jLongValue = c7431b.f35269e.longValue() / 1000;
            if (l9 == null || jLongValue > l9.longValue()) {
                c1903e.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (c7431b.f35270f != null) {
            Integer numValueOf2 = Integer.valueOf(iM3543q);
            C1903e c1903e2 = this.f35741g;
            List arrayList = (List) c1903e2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1903e2.put(numValueOf2, arrayList);
            }
            switch (c7431b.f35271g) {
                case 0:
                    z6 = false;
                    break;
                default:
                    z6 = true;
                    break;
            }
            if (z6) {
                arrayList.clear();
            }
            u7.m3722a();
            n1 n1Var = (n1) this.f35742h.f482a;
            C7436g c7436g = n1Var.f35667d;
            e0 e0Var = f0.F0;
            String str = this.f35735a;
            if (c7436g.m13889W(str, e0Var)) {
                switch (c7431b.f35271g) {
                    case 0:
                        zM3548v = ((com.google.android.gms.internal.measurement.p1) c7431b.f35273i).m3548v();
                        break;
                    default:
                        zM3548v = false;
                        break;
                }
                if (zM3548v) {
                    arrayList.clear();
                }
            }
            u7.m3722a();
            if (!n1Var.f35667d.m13889W(str, e0Var)) {
                arrayList.add(Long.valueOf(c7431b.f35270f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(c7431b.f35270f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* renamed from: b */
    public final com.google.android.gms.internal.measurement.u2 m14100b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.t2 t2VarM3685w = com.google.android.gms.internal.measurement.u2.m3685w();
        t2VarM3685w.m3303b();
        ((com.google.android.gms.internal.measurement.u2) t2VarM3685w.f6231b).m3694x(i10);
        t2VarM3685w.m3303b();
        ((com.google.android.gms.internal.measurement.u2) t2VarM3685w.f6231b).m3686A(this.f35736b);
        com.google.android.gms.internal.measurement.n3 n3Var = this.f35737c;
        if (n3Var != null) {
            t2VarM3685w.m3303b();
            ((com.google.android.gms.internal.measurement.u2) t2VarM3685w.f6231b).m3696z(n3Var);
        }
        com.google.android.gms.internal.measurement.m3 m3VarM3510x = com.google.android.gms.internal.measurement.n3.m3510x();
        ArrayList arrayListU0 = y0.u0(this.f35738d);
        m3VarM3510x.m3303b();
        ((com.google.android.gms.internal.measurement.n3) m3VarM3510x.f6231b).m3513B(arrayListU0);
        ArrayList arrayListU02 = y0.u0(this.f35739e);
        m3VarM3510x.m3303b();
        ((com.google.android.gms.internal.measurement.n3) m3VarM3510x.f6231b).m3527z(arrayListU02);
        C1903e c1903e = this.f35740f;
        if (c1903e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c1903e.f9065c);
            Iterator it = ((C1900b) c1903e.keySet()).iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                Long l9 = (Long) c1903e.get(num);
                if (l9 != null) {
                    com.google.android.gms.internal.measurement.z2 z2VarM3104t = com.google.android.gms.internal.measurement.a3.m3104t();
                    z2VarM3104t.m3303b();
                    ((com.google.android.gms.internal.measurement.a3) z2VarM3104t.f6231b).m3109u(iIntValue);
                    long jLongValue = l9.longValue();
                    z2VarM3104t.m3303b();
                    ((com.google.android.gms.internal.measurement.a3) z2VarM3104t.f6231b).m3110v(jLongValue);
                    arrayList2.add((com.google.android.gms.internal.measurement.a3) z2VarM3104t.m3306e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            m3VarM3510x.m3303b();
            ((com.google.android.gms.internal.measurement.n3) m3VarM3510x.f6231b).m3515D(arrayList);
        }
        C1903e c1903e2 = this.f35741g;
        if (c1903e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c1903e2.f9065c);
            Iterator it2 = ((C1900b) c1903e2.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num2 = (Integer) it2.next();
                com.google.android.gms.internal.measurement.o3 o3VarM3587u = com.google.android.gms.internal.measurement.p3.m3587u();
                int iIntValue2 = num2.intValue();
                o3VarM3587u.m3303b();
                ((com.google.android.gms.internal.measurement.p3) o3VarM3587u.f6231b).m3593v(iIntValue2);
                List list2 = (List) c1903e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    o3VarM3587u.m3303b();
                    ((com.google.android.gms.internal.measurement.p3) o3VarM3587u.f6231b).m3594w(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.p3) o3VarM3587u.m3306e());
            }
            list = arrayList3;
        }
        m3VarM3510x.m3303b();
        ((com.google.android.gms.internal.measurement.n3) m3VarM3510x.f6231b).m3517F(list);
        t2VarM3685w.m3303b();
        ((com.google.android.gms.internal.measurement.u2) t2VarM3685w.f6231b).m3695y((com.google.android.gms.internal.measurement.n3) m3VarM3510x.m3306e());
        return (com.google.android.gms.internal.measurement.u2) t2VarM3685w.m3306e();
    }

    public o4(C7432c c7432c, String str) {
        this.f35742h = c7432c;
        this.f35735a = str;
        this.f35736b = true;
        this.f35738d = new BitSet();
        this.f35739e = new BitSet();
        this.f35740f = new C1903e(0);
        this.f35741g = new C1903e(0);
    }
}
