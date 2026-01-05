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
public final /* synthetic */ class o4 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1199a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f1200b;

    /* renamed from: c */
    public final /* synthetic */ String f1201c;

    /* renamed from: d */
    public final /* synthetic */ List f1202d;

    /* renamed from: e */
    public final /* synthetic */ int f1203e;

    /* renamed from: f */
    public final /* synthetic */ List f1204f;

    /* renamed from: g */
    public final /* synthetic */ int f1205g;

    /* renamed from: h */
    public final /* synthetic */ LocalDateTime f1206h;

    /* renamed from: j */
    public final /* synthetic */ LocalDateTime f1207j;

    /* renamed from: k */
    public final /* synthetic */ int f1208k;

    public /* synthetic */ o4(String str, String str2, List list, int i10, List list2, int i11, int i12, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f1200b = str;
        this.f1201c = str2;
        this.f1202d = list;
        this.f1203e = i10;
        this.f1204f = list2;
        this.f1205g = i11;
        this.f1208k = i12;
        this.f1206h = localDateTime;
        this.f1207j = localDateTime2;
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
        Iterator it;
        int i10 = this.f1199a;
        int i11 = this.f1208k;
        LocalDateTime localDateTime = this.f1207j;
        LocalDateTime localDateTime2 = this.f1206h;
        int i12 = this.f1205g;
        List<EnumC8994d> list = this.f1204f;
        int i13 = this.f1203e;
        List list2 = this.f1202d;
        String str = this.f1201c;
        String str2 = this.f1200b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0(str2);
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    Iterator it2 = list2.iterator();
                    int i14 = 2;
                    while (it2.hasNext()) {
                        interfaceC4026cY0.mo1776B(i14, (String) it2.next());
                        i14++;
                    }
                    int i15 = i13 + 2;
                    int i16 = i15;
                    for (EnumC8994d enumC8994d : list) {
                        if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                            interfaceC4026cY0.mo1779i(i16);
                        } else {
                            interfaceC4026cY0.mo1778g(i16, r7.intValue());
                        }
                        i16++;
                    }
                    interfaceC4026cY0.mo1778g(i15 + i12, i11);
                    int i17 = i13 + 3 + i12;
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
                    int i18 = i13 + 4 + i12;
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
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0(str2);
                try {
                    interfaceC4026cY02.mo1776B(1, str);
                    Iterator it3 = list2.iterator();
                    int i19 = 2;
                    while (it3.hasNext()) {
                        interfaceC4026cY02.mo1776B(i19, (String) it3.next());
                        i19++;
                    }
                    int i20 = i13 + 2;
                    Iterator it4 = list.iterator();
                    int i21 = i20;
                    while (it4.hasNext()) {
                        EnumC8994d enumC8994d2 = (EnumC8994d) it4.next();
                        if ((enumC8994d2 != null ? Integer.valueOf(enumC8994d2.getTypeValue()) : null) == null) {
                            interfaceC4026cY02.mo1779i(i21);
                            it = it4;
                        } else {
                            it = it4;
                            interfaceC4026cY02.mo1778g(i21, r12.intValue());
                        }
                        i21++;
                        it4 = it;
                    }
                    int i22 = i20 + i12;
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY02.mo1779i(i22);
                    } else {
                        interfaceC4026cY02.mo1776B(i22, strM16212u3);
                    }
                    int i23 = i13 + 3 + i12;
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY02.mo1779i(i23);
                    } else {
                        interfaceC4026cY02.mo1776B(i23, strM16212u4);
                    }
                    long j6 = i11;
                    interfaceC4026cY02.mo1778g(i13 + 4 + i12, j6);
                    interfaceC4026cY02.mo1776B(i13 + 5 + i12, str);
                    int i24 = i13 + 6 + i12;
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY02.mo1779i(i24);
                    } else {
                        interfaceC4026cY02.mo1776B(i24, strM16212u5);
                    }
                    int i25 = i13 + 7 + i12;
                    if (localDateTime != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY02.mo1779i(i25);
                    } else {
                        interfaceC4026cY02.mo1776B(i25, strM16212u6);
                    }
                    interfaceC4026cY02.mo1778g(i13 + 8 + i12, j6);
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

    public /* synthetic */ o4(String str, String str2, List list, int i10, List list2, int i11, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i12) {
        this.f1200b = str;
        this.f1201c = str2;
        this.f1202d = list;
        this.f1203e = i10;
        this.f1204f = list2;
        this.f1205g = i11;
        this.f1206h = localDateTime;
        this.f1207j = localDateTime2;
        this.f1208k = i12;
    }
}
