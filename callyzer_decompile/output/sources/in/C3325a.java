package in;

import j$.time.LocalDate;
import kk.AbstractC4092l;
import kk.C4094n;
import kk.C4095o;
import kk.InterfaceC4091k;
import kk.InterfaceC4096p;
import mk.C4776o;
import og.od;
import qw.C6363m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: in.a */
/* loaded from: classes3.dex */
public final class C3325a implements InterfaceC4096p, InterfaceC4091k {

    /* renamed from: a */
    public static final C3325a f17598a = new C3325a();

    private C3325a() {
    }

    @Override // kk.InterfaceC4096p
    /* renamed from: a */
    public final C4095o mo7643a(Object obj) {
        LocalDate localDate = (LocalDate) obj;
        return new C4095o(localDate != null ? localDate.toString() : null);
    }

    @Override // kk.InterfaceC4091k
    /* renamed from: b */
    public final Object mo7644b(AbstractC4092l abstractC4092l) {
        Object objM10796a;
        Object objM10796a2;
        if (abstractC4092l == null) {
            return null;
        }
        if (abstractC4092l instanceof C4095o) {
            try {
                objM10796a = LocalDate.parse(abstractC4092l.mo8868c());
            } catch (Throwable th2) {
                objM10796a = od.m10796a(th2);
            }
            return (LocalDate) (objM10796a instanceof C6363m ? null : objM10796a);
        }
        if (!(abstractC4092l instanceof C4094n)) {
            return null;
        }
        C4776o c4776o = abstractC4092l.m8870b().f20998a;
        AbstractC4092l abstractC4092l2 = (AbstractC4092l) c4776o.get("day");
        Integer numValueOf = abstractC4092l2 != null ? Integer.valueOf(abstractC4092l2.mo8867a()) : null;
        AbstractC4092l abstractC4092l3 = (AbstractC4092l) c4776o.get("month");
        Integer numValueOf2 = abstractC4092l3 != null ? Integer.valueOf(abstractC4092l3.mo8867a()) : null;
        AbstractC4092l abstractC4092l4 = (AbstractC4092l) c4776o.get("year");
        Integer numValueOf3 = abstractC4092l4 != null ? Integer.valueOf(abstractC4092l4.mo8867a()) : null;
        if (numValueOf == null || numValueOf2 == null || numValueOf3 == null) {
            return null;
        }
        try {
            objM10796a2 = LocalDate.of(numValueOf3.intValue(), numValueOf2.intValue(), numValueOf.intValue());
        } catch (Throwable th3) {
            objM10796a2 = od.m10796a(th3);
        }
        return (LocalDate) (objM10796a2 instanceof C6363m ? null : objM10796a2);
    }
}
