package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5412n;
import om.C5416r;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: an.g */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0200g implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f833a;

    /* renamed from: b */
    public final /* synthetic */ String f834b;

    /* renamed from: c */
    public final /* synthetic */ LocalDateTime f835c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f836d;

    /* renamed from: e */
    public final /* synthetic */ EnumC8994d f837e;

    /* renamed from: f */
    public final /* synthetic */ int f838f;

    public /* synthetic */ C0200g(int i10, String str, EnumC8994d enumC8994d, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i11) {
        this.f833a = i11;
        this.f838f = i10;
        this.f834b = str;
        this.f837e = enumC8994d;
        this.f835c = localDateTime;
        this.f836d = localDateTime2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        InterfaceC4026c interfaceC4026cY0;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        LocalDateTime localDateTimeM16183G;
        String strM16212u7;
        String strM16212u8;
        String strM16212u9;
        String strM16212u10;
        String strM16212u11;
        String strM16212u12;
        int i10 = this.f833a;
        LocalDateTime localDateTime = this.f836d;
        LocalDateTime localDateTime2 = this.f835c;
        EnumC8994d enumC8994d = this.f837e;
        String str = this.f834b;
        int i11 = this.f838f;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection.y0("SELECT `count`, `duration` FROM (Select COUNT(call_type) as count,COALESCE(SUM(duration),?) as duration ,phone_number from CallLog where phone_number LIKE '%'|| ? ||'%'  and call_type = ? and date_time BETWEEN ? AND ?)");
                try {
                    interfaceC4026cY02.mo1778g(1, i11);
                    interfaceC4026cY02.mo1776B(2, str);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY02.mo1779i(3);
                    } else {
                        interfaceC4026cY02.mo1778g(3, r0.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY02.mo1779i(4);
                    } else {
                        interfaceC4026cY02.mo1776B(4, strM16212u);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY02.mo1779i(5);
                    } else {
                        interfaceC4026cY02.mo1776B(5, strM16212u2);
                    }
                    if (!interfaceC4026cY02.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r = new C5416r((int) interfaceC4026cY02.getLong(0), interfaceC4026cY02.isNull(1) ? null : Long.valueOf(interfaceC4026cY02.getLong(1)));
                    interfaceC4026cY02.close();
                    return c5416r;
                } finally {
                    interfaceC4026cY02.close();
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT `call_type`, `date_time`, `slot` FROM (SELECT CallLog.phone_number,CallLog.call_type,CallLog.date_time,CallLog.sim_number,CallLog.slot FROM ViewCallLogContactUserSim AS CallLog WHERE CallLog.phone_number=? AND  CallLog.date_time BETWEEN ? AND ? AND call_type = ? AND duration <= ? AND NOT EXISTS (SELECT * FROM ViewCallLogContactUserSim Contact WHERE CallLog.phone_number = Contact.phone_number AND Contact.date_time BETWEEN ? AND ? AND CallLog.date_time < Contact.date_time AND Contact.duration > ?)  ORDER BY date_time DESC)");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(2);
                    } else {
                        interfaceC4026cY0.mo1776B(2, strM16212u3);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1776B(3, strM16212u4);
                    }
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1778g(4, r2.intValue());
                    }
                    long j6 = i11;
                    interfaceC4026cY0.mo1778g(5, j6);
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY0.mo1779i(6);
                    } else {
                        interfaceC4026cY0.mo1776B(6, strM16212u5);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY0.mo1779i(7);
                    } else {
                        interfaceC4026cY0.mo1776B(7, strM16212u6);
                    }
                    interfaceC4026cY0.mo1778g(8, j6);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        Integer numValueOf = interfaceC4026cY0.isNull(0) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(0));
                        EnumC8994d enumC8994d2 = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        String strMo1777W = interfaceC4026cY0.isNull(1) ? null : interfaceC4026cY0.mo1777W(1);
                        if (strMo1777W != null) {
                            C8800o c8800o7 = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        if (localDateTimeM16183G == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        arrayList.add(new C5412n(localDateTimeM16183G, enumC8994d2, (int) interfaceC4026cY0.getLong(2)));
                    }
                    interfaceC4026cY0.close();
                    return arrayList;
                } finally {
                    interfaceC4026cY0.close();
                }
            case 2:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                InterfaceC4026c interfaceC4026cY03 = _connection3.y0("SELECT COUNT(DISTINCT CallLog.phone_number) as count FROM CallLog AS CallLog WHERE CallLog.sim_number = ? AND CallLog.call_type = ? AND CallLog.date_time BETWEEN ? AND ? AND CallLog.duration <= ? AND NOT EXISTS (SELECT * FROM CallLog Contact WHERE  CallLog.phone_number = Contact.phone_number AND Contact.sim_number = ? AND Contact.date_time BETWEEN ? AND ?  AND CallLog.date_time < Contact.date_time AND Contact.duration > ?)");
                try {
                    interfaceC4026cY03.mo1776B(1, str);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY03.mo1779i(2);
                    } else {
                        interfaceC4026cY03.mo1778g(2, r7.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o8 = C8800o.f42459a;
                        strM16212u7 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u7 = null;
                    }
                    if (strM16212u7 == null) {
                        interfaceC4026cY03.mo1779i(3);
                    } else {
                        interfaceC4026cY03.mo1776B(3, strM16212u7);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o9 = C8800o.f42459a;
                        strM16212u8 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u8 = null;
                    }
                    if (strM16212u8 == null) {
                        interfaceC4026cY03.mo1779i(4);
                    } else {
                        interfaceC4026cY03.mo1776B(4, strM16212u8);
                    }
                    long j10 = i11;
                    interfaceC4026cY03.mo1778g(5, j10);
                    interfaceC4026cY03.mo1776B(6, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o10 = C8800o.f42459a;
                        strM16212u9 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u9 = null;
                    }
                    if (strM16212u9 == null) {
                        interfaceC4026cY03.mo1779i(7);
                    } else {
                        interfaceC4026cY03.mo1776B(7, strM16212u9);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o11 = C8800o.f42459a;
                        strM16212u10 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u10 = null;
                    }
                    if (strM16212u10 == null) {
                        interfaceC4026cY03.mo1779i(8);
                    } else {
                        interfaceC4026cY03.mo1776B(8, strM16212u10);
                    }
                    interfaceC4026cY03.mo1778g(9, j10);
                    if (!interfaceC4026cY03.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r2 = new C5416r((int) interfaceC4026cY03.getLong(0), null);
                    interfaceC4026cY03.close();
                    return c5416r2;
                } finally {
                }
            default:
                InterfaceC4024a _connection4 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection4, "_connection");
                interfaceC4026cY0 = _connection4.y0("SELECT COUNT(call_type) as count,COALESCE(SUM(duration),0) as duration FROM CallLog WHERE  country_code  = ? AND phone_number  = ? AND call_type  = ? AND  date_time BETWEEN ? AND ? ");
                try {
                    interfaceC4026cY0.mo1778g(1, i11);
                    interfaceC4026cY0.mo1776B(2, str);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1778g(3, r2.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o12 = C8800o.f42459a;
                        strM16212u11 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u11 = null;
                    }
                    if (strM16212u11 == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1776B(4, strM16212u11);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o13 = C8800o.f42459a;
                        strM16212u12 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u12 = null;
                    }
                    if (strM16212u12 == null) {
                        interfaceC4026cY0.mo1779i(5);
                    } else {
                        interfaceC4026cY0.mo1776B(5, strM16212u12);
                    }
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r3 = new C5416r((int) interfaceC4026cY0.getLong(0), interfaceC4026cY0.isNull(1) ? null : Long.valueOf(interfaceC4026cY0.getLong(1)));
                    interfaceC4026cY0.close();
                    return c5416r3;
                } finally {
                }
        }
    }

    public /* synthetic */ C0200g(String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC8994d enumC8994d, int i10) {
        this.f833a = 1;
        this.f834b = str;
        this.f835c = localDateTime;
        this.f836d = localDateTime2;
        this.f837e = enumC8994d;
        this.f838f = i10;
    }

    public /* synthetic */ C0200g(String str, EnumC8994d enumC8994d, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i10) {
        this.f833a = 2;
        this.f834b = str;
        this.f837e = enumC8994d;
        this.f835c = localDateTime;
        this.f836d = localDateTime2;
        this.f838f = i10;
    }
}
