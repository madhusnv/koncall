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
/* renamed from: an.s */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0212s implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1332a = 0;

    /* renamed from: b */
    public final /* synthetic */ String f1333b;

    /* renamed from: c */
    public final /* synthetic */ String f1334c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f1335d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f1336e;

    /* renamed from: f */
    public final /* synthetic */ EnumC8994d f1337f;

    /* renamed from: g */
    public final /* synthetic */ int f1338g;

    public /* synthetic */ C0212s(int i10, String str, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f1338g = i10;
        this.f1333b = str;
        this.f1334c = str2;
        this.f1337f = enumC8994d;
        this.f1335d = localDateTime;
        this.f1336e = localDateTime2;
    }

    /* JADX WARN: Finally extract failed */
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
        int i10 = this.f1332a;
        LocalDateTime localDateTime = this.f1336e;
        LocalDateTime localDateTime2 = this.f1335d;
        EnumC8994d enumC8994d = this.f1337f;
        String str = this.f1334c;
        int i11 = this.f1338g;
        String str2 = this.f1333b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection.y0("SELECT `count`, `duration` FROM (Select COUNT(call_type) as count,COALESCE(SUM(duration),?) as duration ,phone_number from ViewCallLogContactUserSim where sim_number =? AND phone_number LIKE '%'|| ? ||'%'  and call_type = ? and date_time BETWEEN ? AND ?)");
                try {
                    interfaceC4026cY02.mo1778g(1, i11);
                    interfaceC4026cY02.mo1776B(2, str2);
                    interfaceC4026cY02.mo1776B(3, str);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY02.mo1779i(4);
                    } else {
                        interfaceC4026cY02.mo1778g(4, r3.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY02.mo1779i(5);
                    } else {
                        interfaceC4026cY02.mo1776B(5, strM16212u);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY02.mo1779i(6);
                    } else {
                        interfaceC4026cY02.mo1776B(6, strM16212u2);
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
                interfaceC4026cY0 = _connection2.y0("SELECT CallLog.phone_number,CallLog.call_type,CallLog.date_time,CallLog.sim_number,slot FROM ViewCallLogContactUserSim AS CallLog  WHERE CallLog.phone_number=? AND CallLog.sim_number = ? AND CallLog.date_time BETWEEN ? AND ? AND call_type = ? AND duration <= ? AND NOT EXISTS (SELECT * FROM ViewCallLogContactUserSim Contact WHERE CallLog.phone_number = Contact.phone_number AND Contact.sim_number = ? AND Contact.date_time BETWEEN ? AND ? AND CallLog.date_time < Contact.date_time AND Contact.duration > ?)  ORDER BY date_time DESC");
                try {
                    interfaceC4026cY0.mo1776B(1, str2);
                    interfaceC4026cY0.mo1776B(2, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1776B(3, strM16212u3);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1776B(4, strM16212u4);
                    }
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(5);
                    } else {
                        interfaceC4026cY0.mo1778g(5, r3.intValue());
                    }
                    long j6 = i11;
                    interfaceC4026cY0.mo1778g(6, j6);
                    interfaceC4026cY0.mo1776B(7, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY0.mo1779i(8);
                    } else {
                        interfaceC4026cY0.mo1776B(8, strM16212u5);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY0.mo1779i(9);
                    } else {
                        interfaceC4026cY0.mo1776B(9, strM16212u6);
                    }
                    interfaceC4026cY0.mo1778g(10, j6);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        Integer numValueOf = interfaceC4026cY0.isNull(1) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(1));
                        EnumC8994d enumC8994d2 = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d2 == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        String strMo1777W = interfaceC4026cY0.isNull(2) ? null : interfaceC4026cY0.mo1777W(2);
                        if (strMo1777W != null) {
                            C8800o c8800o7 = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        if (localDateTimeM16183G == null) {
                            throw new IllegalStateException("Expected NON-NULL 'java.time.LocalDateTime', but it was NULL.");
                        }
                        arrayList.add(new C5412n(localDateTimeM16183G, enumC8994d2, (int) interfaceC4026cY0.getLong(4)));
                    }
                    interfaceC4026cY0.close();
                    return arrayList;
                } finally {
                    interfaceC4026cY0.close();
                }
            default:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                interfaceC4026cY0 = _connection3.y0("SELECT COUNT(call_type) as count,COALESCE(SUM(duration),0) as duration FROM CallLog WHERE sim_number = ? AND  country_code = ? AND phone_number = ? AND call_type = ? AND date_time BETWEEN ? AND ?");
                try {
                    interfaceC4026cY0.mo1776B(1, str2);
                    interfaceC4026cY0.mo1778g(2, i11);
                    interfaceC4026cY0.mo1776B(3, str);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1778g(4, r3.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o8 = C8800o.f42459a;
                        strM16212u7 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u7 = null;
                    }
                    if (strM16212u7 == null) {
                        interfaceC4026cY0.mo1779i(5);
                    } else {
                        interfaceC4026cY0.mo1776B(5, strM16212u7);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o9 = C8800o.f42459a;
                        strM16212u8 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u8 = null;
                    }
                    if (strM16212u8 == null) {
                        interfaceC4026cY0.mo1779i(6);
                    } else {
                        interfaceC4026cY0.mo1776B(6, strM16212u8);
                    }
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r2 = new C5416r((int) interfaceC4026cY0.getLong(0), interfaceC4026cY0.isNull(1) ? null : Long.valueOf(interfaceC4026cY0.getLong(1)));
                    interfaceC4026cY0.close();
                    return c5416r2;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }

    public /* synthetic */ C0212s(String str, int i10, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f1333b = str;
        this.f1338g = i10;
        this.f1334c = str2;
        this.f1337f = enumC8994d;
        this.f1335d = localDateTime;
        this.f1336e = localDateTime2;
    }

    public /* synthetic */ C0212s(String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumC8994d enumC8994d, int i10) {
        this.f1333b = str;
        this.f1334c = str2;
        this.f1335d = localDateTime;
        this.f1336e = localDateTime2;
        this.f1337f = enumC8994d;
        this.f1338g = i10;
    }
}
