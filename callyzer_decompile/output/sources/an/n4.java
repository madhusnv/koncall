package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5416r;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1150a = 1;

    /* renamed from: b */
    public final /* synthetic */ String f1151b;

    /* renamed from: c */
    public final /* synthetic */ List f1152c;

    /* renamed from: d */
    public final /* synthetic */ int f1153d;

    /* renamed from: e */
    public final /* synthetic */ List f1154e;

    /* renamed from: f */
    public final /* synthetic */ int f1155f;

    /* renamed from: g */
    public final /* synthetic */ int f1156g;

    /* renamed from: h */
    public final /* synthetic */ LocalDateTime f1157h;

    /* renamed from: j */
    public final /* synthetic */ LocalDateTime f1158j;

    public /* synthetic */ n4(String str, List list, int i10, List list2, int i11, int i12, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f1151b = str;
        this.f1152c = list;
        this.f1153d = i10;
        this.f1154e = list2;
        this.f1155f = i11;
        this.f1156g = i12;
        this.f1157h = localDateTime;
        this.f1158j = localDateTime2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        int i10 = this.f1150a;
        int i11 = 1;
        LocalDateTime localDateTime = this.f1158j;
        LocalDateTime localDateTime2 = this.f1157h;
        int i12 = this.f1156g;
        int i13 = this.f1155f;
        List<EnumC8994d> list = this.f1154e;
        int i14 = this.f1153d;
        List list2 = this.f1152c;
        String str = this.f1151b;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0(str);
                try {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        interfaceC4026cY0.mo1776B(i11, (String) it.next());
                        i11++;
                    }
                    int i15 = i14 + 1;
                    int i16 = i15;
                    for (EnumC8994d enumC8994d : list) {
                        if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                            interfaceC4026cY0.mo1779i(i16);
                        } else {
                            interfaceC4026cY0.mo1778g(i16, r10.intValue());
                        }
                        i16++;
                    }
                    int i17 = i15 + i13;
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(i17);
                    } else {
                        interfaceC4026cY0.mo1776B(i17, strM16212u);
                    }
                    int i18 = i14 + 2 + i13;
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY0.mo1779i(i18);
                    } else {
                        interfaceC4026cY0.mo1776B(i18, strM16212u2);
                    }
                    long j6 = i12;
                    interfaceC4026cY0.mo1778g(i14 + 3 + i13, j6);
                    int i19 = i14 + 4 + i13;
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(i19);
                    } else {
                        interfaceC4026cY0.mo1776B(i19, strM16212u3);
                    }
                    int i20 = i14 + 5 + i13;
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY0.mo1779i(i20);
                    } else {
                        interfaceC4026cY0.mo1776B(i20, strM16212u4);
                    }
                    interfaceC4026cY0.mo1778g(i14 + 6 + i13, j6);
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r = new C5416r((int) interfaceC4026cY0.getLong(0), null);
                    interfaceC4026cY0.close();
                    return c5416r;
                } catch (Throwable th2) {
                    interfaceC4026cY0.close();
                    throw th2;
                }
            default:
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection.y0(str);
                try {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        interfaceC4026cY02.mo1776B(i11, (String) it2.next());
                        i11++;
                    }
                    int i21 = i14 + 1;
                    int i22 = i21;
                    for (EnumC8994d enumC8994d2 : list) {
                        if ((enumC8994d2 != null ? Integer.valueOf(enumC8994d2.getTypeValue()) : null) == null) {
                            interfaceC4026cY02.mo1779i(i22);
                        } else {
                            interfaceC4026cY02.mo1778g(i22, r10.intValue());
                        }
                        i22++;
                    }
                    interfaceC4026cY02.mo1778g(i21 + i13, i12);
                    int i23 = i14 + 2 + i13;
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY02.mo1779i(i23);
                    } else {
                        interfaceC4026cY02.mo1776B(i23, strM16212u5);
                    }
                    int i24 = i14 + 3 + i13;
                    if (localDateTime != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY02.mo1779i(i24);
                    } else {
                        interfaceC4026cY02.mo1776B(i24, strM16212u6);
                    }
                    if (!interfaceC4026cY02.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r2 = new C5416r((int) interfaceC4026cY02.getLong(0), null);
                    interfaceC4026cY02.close();
                    return c5416r2;
                } catch (Throwable th3) {
                    interfaceC4026cY02.close();
                    throw th3;
                }
        }
    }

    public /* synthetic */ n4(String str, List list, int i10, List list2, int i11, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i12) {
        this.f1151b = str;
        this.f1152c = list;
        this.f1153d = i10;
        this.f1154e = list2;
        this.f1155f = i11;
        this.f1157h = localDateTime;
        this.f1158j = localDateTime2;
        this.f1156g = i12;
    }
}
