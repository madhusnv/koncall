package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import om.C5400b;
import om.C5416r;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: an.p */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0209p implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1212a;

    /* renamed from: b */
    public final /* synthetic */ int f1213b;

    /* renamed from: c */
    public final /* synthetic */ String f1214c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f1215d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f1216e;

    public /* synthetic */ C0209p(int i10, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f1212a = 2;
        this.f1214c = str;
        this.f1213b = i10;
        this.f1215d = localDateTime;
        this.f1216e = localDateTime2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        int i10 = this.f1212a;
        LocalDateTime localDateTime = this.f1216e;
        LocalDateTime localDateTime2 = this.f1215d;
        int i11 = this.f1213b;
        String str = this.f1214c;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("select SUM(day_count) as count, SUM(new_duration) as duration from ( SELECT CASE WHEN COALESCE(SUM(duration), ?) > ? THEN 1 ELSE 0 END as day_count, COALESCE(SUM(duration), 0) as new_duration FROM CallLog WHERE sim_number = ? AND date_time BETWEEN ? AND ? and duration >? GROUP BY date(date_time))");
                long j6 = i11;
                try {
                    interfaceC4026cY0.mo1778g(1, j6);
                    interfaceC4026cY0.mo1778g(2, j6);
                    interfaceC4026cY0.mo1776B(3, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1776B(4, strM16212u);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY0.mo1779i(5);
                    } else {
                        interfaceC4026cY0.mo1776B(5, strM16212u2);
                    }
                    interfaceC4026cY0.mo1778g(6, j6);
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r = new C5416r((int) interfaceC4026cY0.getLong(0), interfaceC4026cY0.isNull(1) ? null : Long.valueOf(interfaceC4026cY0.getLong(1)));
                    interfaceC4026cY0.close();
                    return c5416r;
                } finally {
                    interfaceC4026cY0.close();
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("Select SUM(new_count) as count,SUM(new_duration) as  duration,call_type from (SELECT COUNT(date(date_time)) as new_count,COALESCE(SUM(duration),?) as new_duration ,call_type FROM CallLog  WHERE sim_number = ? AND duration > ?  AND date_time BETWEEN ? AND ?  group by date(date_time) , call_type) group by call_type");
                long j10 = i11;
                try {
                    interfaceC4026cY02.mo1778g(1, j10);
                    interfaceC4026cY02.mo1776B(2, str);
                    interfaceC4026cY02.mo1778g(3, j10);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY02.mo1779i(4);
                    } else {
                        interfaceC4026cY02.mo1776B(4, strM16212u3);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY02.mo1779i(5);
                    } else {
                        interfaceC4026cY02.mo1776B(5, strM16212u4);
                    }
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY02.r0()) {
                        int i12 = (int) interfaceC4026cY02.getLong(0);
                        long j11 = interfaceC4026cY02.getLong(1);
                        Integer numValueOf = interfaceC4026cY02.isNull(2) ? null : Integer.valueOf((int) interfaceC4026cY02.getLong(2));
                        EnumC8994d enumC8994d = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        arrayList.add(new C5400b(i12, j11, enumC8994d));
                    }
                    interfaceC4026cY02.close();
                    return arrayList;
                } finally {
                    interfaceC4026cY02.close();
                }
            default:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                interfaceC4026cY0 = _connection3.y0("SELECT COUNT(DISTINCT phone_number) as count FROM ViewCallLogUserSim WHERE phone_number IS NOT NULL AND sim_number = ? AND duration > ? AND date_time BETWEEN ? AND ?");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    interfaceC4026cY0.mo1778g(2, i11);
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1776B(3, strM16212u5);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1776B(4, strM16212u6);
                    }
                    if (!interfaceC4026cY0.r0()) {
                        throw new IllegalStateException("The query result was empty, but expected a single row to return a NON-NULL object of type <com.websoptimization.callyzerbiz.`data`.model.db.SummeryAnalyticsData>.");
                    }
                    C5416r c5416r2 = new C5416r((int) interfaceC4026cY0.getLong(0), null);
                    interfaceC4026cY0.close();
                    return c5416r2;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
    }

    public /* synthetic */ C0209p(int i10, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2, int i11) {
        this.f1212a = i11;
        this.f1213b = i10;
        this.f1214c = str;
        this.f1215d = localDateTime;
        this.f1216e = localDateTime2;
    }
}
