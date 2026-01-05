package nk;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kk.AbstractC4092l;
import kk.AbstractC4103w;
import kk.C4090j;
import kk.C4093m;
import kk.C4094n;
import kk.C4095o;
import mk.C4772k;
import mk.C4773l;
import mk.C4774m;
import mk.C4775n;
import rk.C6564a;
import rk.C6566c;
import rk.EnumC6565b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.n */
/* loaded from: classes.dex */
public class C5091n extends AbstractC4103w {

    /* renamed from: a */
    public static final C5091n f24968a = new C5091n();

    private C5091n() {
    }

    /* renamed from: d */
    public static AbstractC4092l m10018d(C6564a c6564a, EnumC6565b enumC6565b) {
        int i10 = AbstractC5090m.f24939a[enumC6565b.ordinal()];
        if (i10 == 3) {
            return new C4095o(c6564a.C0());
        }
        if (i10 == 4) {
            return new C4095o(new C4772k(c6564a.C0()));
        }
        if (i10 == 5) {
            return new C4095o(Boolean.valueOf(c6564a.a0()));
        }
        if (i10 == 6) {
            c6564a.A0();
            return C4093m.f20997a;
        }
        throw new IllegalStateException("Unexpected token: " + enumC6565b);
    }

    /* renamed from: e */
    public static AbstractC4092l m10019e(C6564a c6564a, EnumC6565b enumC6565b) throws IOException {
        int i10 = AbstractC5090m.f24939a[enumC6565b.ordinal()];
        if (i10 == 1) {
            c6564a.mo10024h();
            return new C4090j();
        }
        if (i10 != 2) {
            return null;
        }
        c6564a.mo10025j();
        return new C4094n();
    }

    /* renamed from: f */
    public static void m10020f(C6566c c6566c, AbstractC4092l abstractC4092l) {
        if (abstractC4092l == null || (abstractC4092l instanceof C4093m)) {
            c6566c.mo10029J();
            return;
        }
        boolean z6 = abstractC4092l instanceof C4095o;
        if (z6) {
            if (!z6) {
                throw new IllegalStateException("Not a JSON Primitive: " + abstractC4092l);
            }
            C4095o c4095o = (C4095o) abstractC4092l;
            Serializable serializable = c4095o.f20999a;
            if (serializable instanceof Number) {
                c6566c.t0(c4095o.m8875j());
                return;
            } else if (serializable instanceof Boolean) {
                c6566c.w0(c4095o.m8873g());
                return;
            } else {
                c6566c.v0(c4095o.mo8868c());
                return;
            }
        }
        boolean z10 = abstractC4092l instanceof C4090j;
        if (!z10) {
            if (!(abstractC4092l instanceof C4094n)) {
                throw new IllegalArgumentException("Couldn't write " + abstractC4092l.getClass());
            }
            c6566c.mo10031n();
            Iterator it = ((C4774m) abstractC4092l.m8870b().f20998a.entrySet()).iterator();
            while (((C4773l) it).hasNext()) {
                C4775n c4775nM9702b = ((C4773l) it).m9702b();
                c6566c.mo10028A((String) c4775nM9702b.getKey());
                m10020f(c6566c, (AbstractC4092l) c4775nM9702b.getValue());
            }
            c6566c.mo10033z();
            return;
        }
        c6566c.mo10030j();
        if (!z10) {
            throw new IllegalStateException("Not a JSON Array: " + abstractC4092l);
        }
        ArrayList arrayList = ((C4090j) abstractC4092l).f20996a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            m10020f(c6566c, (AbstractC4092l) obj);
        }
        c6566c.mo10032w();
    }

    @Override // kk.AbstractC4103w
    /* renamed from: b */
    public final Object mo8851b(C6564a c6564a) throws IOException {
        if (c6564a instanceof C5094q) {
            C5094q c5094q = (C5094q) c6564a;
            EnumC6565b enumC6565bE0 = c5094q.E0();
            if (enumC6565bE0 != EnumC6565b.NAME && enumC6565bE0 != EnumC6565b.END_ARRAY && enumC6565bE0 != EnumC6565b.END_OBJECT && enumC6565bE0 != EnumC6565b.END_DOCUMENT) {
                AbstractC4092l abstractC4092l = (AbstractC4092l) c5094q.S0();
                c5094q.L0();
                return abstractC4092l;
            }
            throw new IllegalStateException("Unexpected " + enumC6565bE0 + " when reading a JsonElement.");
        }
        EnumC6565b enumC6565bE02 = c6564a.E0();
        AbstractC4092l abstractC4092lM10019e = m10019e(c6564a, enumC6565bE02);
        if (abstractC4092lM10019e == null) {
            return m10018d(c6564a, enumC6565bE02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c6564a.mo10023R()) {
                String strV0 = abstractC4092lM10019e instanceof C4094n ? c6564a.v0() : null;
                EnumC6565b enumC6565bE03 = c6564a.E0();
                AbstractC4092l abstractC4092lM10019e2 = m10019e(c6564a, enumC6565bE03);
                boolean z6 = abstractC4092lM10019e2 != null;
                if (abstractC4092lM10019e2 == null) {
                    abstractC4092lM10019e2 = m10018d(c6564a, enumC6565bE03);
                }
                if (abstractC4092lM10019e instanceof C4090j) {
                    ((C4090j) abstractC4092lM10019e).f20996a.add(abstractC4092lM10019e2);
                } else {
                    ((C4094n) abstractC4092lM10019e).f20998a.put(strV0, abstractC4092lM10019e2);
                }
                if (z6) {
                    arrayDeque.addLast(abstractC4092lM10019e);
                    abstractC4092lM10019e = abstractC4092lM10019e2;
                }
            } else {
                if (abstractC4092lM10019e instanceof C4090j) {
                    c6564a.mo10026w();
                } else {
                    c6564a.mo10027z();
                }
                if (arrayDeque.isEmpty()) {
                    return abstractC4092lM10019e;
                }
                abstractC4092lM10019e = (AbstractC4092l) arrayDeque.removeLast();
            }
        }
    }

    @Override // kk.AbstractC4103w
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8852c(C6566c c6566c, Object obj) {
        m10020f(c6566c, (AbstractC4092l) obj);
    }
}
