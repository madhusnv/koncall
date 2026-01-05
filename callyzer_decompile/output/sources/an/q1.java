package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.re;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1270a;

    /* renamed from: b */
    public final /* synthetic */ String f1271b;

    /* renamed from: c */
    public final /* synthetic */ int f1272c;

    /* renamed from: d */
    public final /* synthetic */ String f1273d;

    /* renamed from: e */
    public final /* synthetic */ EnumC8994d f1274e;

    /* renamed from: f */
    public final /* synthetic */ LocalDateTime f1275f;

    /* renamed from: g */
    public final /* synthetic */ long f1276g;

    /* renamed from: h */
    public final /* synthetic */ long f1277h;

    /* renamed from: j */
    public final /* synthetic */ String f1278j;

    /* renamed from: k */
    public final /* synthetic */ String f1279k;

    /* renamed from: l */
    public final /* synthetic */ boolean f1280l;

    /* renamed from: m */
    public final /* synthetic */ LocalDateTime f1281m;

    /* renamed from: n */
    public final /* synthetic */ int f1282n;

    public /* synthetic */ q1(String str, int i10, String str2, EnumC8994d enumC8994d, LocalDateTime localDateTime, long j6, long j10, String str3, String str4, boolean z6, LocalDateTime localDateTime2, int i11, int i12) {
        this.f1270a = i12;
        this.f1271b = str;
        this.f1272c = i10;
        this.f1273d = str2;
        this.f1274e = enumC8994d;
        this.f1275f = localDateTime;
        this.f1276g = j6;
        this.f1277h = j10;
        this.f1278j = str3;
        this.f1279k = str4;
        this.f1280l = z6;
        this.f1281m = localDateTime2;
        this.f1282n = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        long jM10877a;
        String strM16212u6;
        String strM16212u7;
        int i10 = this.f1270a;
        int i11 = this.f1282n;
        LocalDateTime localDateTime = this.f1281m;
        boolean z6 = this.f1280l;
        String str = this.f1279k;
        String str2 = this.f1278j;
        long j6 = this.f1277h;
        long j10 = this.f1276g;
        LocalDateTime localDateTime2 = this.f1275f;
        EnumC8994d enumC8994d = this.f1274e;
        String str3 = this.f1273d;
        int i12 = this.f1272c;
        String str4 = this.f1271b;
        switch (i10) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("INSERT INTO CallLog ( phone_number, country_code, name, name_in_contacts, call_type, date_time, duration, calllog_id, sim_number, notes, is_lead_call_log, modify_date_time, call_log_sync_status) SELECT ?, ?, IFNULL((SELECT name FROM Contact WHERE phone_number = ?), ?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE NOT (EXISTS (SELECT * FROM CallLog WHERE call_type = ? AND duration = ? AND date_time = ?) OR EXISTS (SELECT * FROM FakeCallLog WHERE call_type = ? AND duration = ? AND date_time = ?) OR EXISTS (SELECT * FROM CorruptCallLog WHERE call_type = ? AND duration = ? AND date_time = ?))");
                try {
                    interfaceC4026cY0.mo1776B(1, str4);
                    interfaceC4026cY0.mo1778g(2, i12);
                    interfaceC4026cY0.mo1776B(3, str4);
                    interfaceC4026cY0.mo1776B(4, str3);
                    interfaceC4026cY0.mo1779i(5);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(6);
                    } else {
                        interfaceC4026cY0.mo1778g(6, r0.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(7);
                    } else {
                        interfaceC4026cY0.mo1776B(7, strM16212u);
                    }
                    interfaceC4026cY0.mo1778g(8, j10);
                    interfaceC4026cY0.mo1778g(9, j6);
                    interfaceC4026cY0.mo1776B(10, str2);
                    if (str == null) {
                        interfaceC4026cY0.mo1779i(11);
                    } else {
                        interfaceC4026cY0.mo1776B(11, str);
                    }
                    interfaceC4026cY0.mo1778g(12, z6 ? 1L : 0L);
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY0.mo1779i(13);
                    } else {
                        interfaceC4026cY0.mo1776B(13, strM16212u2);
                    }
                    interfaceC4026cY0.mo1778g(14, i11);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(15);
                    } else {
                        interfaceC4026cY0.mo1778g(15, r0.intValue());
                    }
                    interfaceC4026cY0.mo1778g(16, j10);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(17);
                    } else {
                        interfaceC4026cY0.mo1776B(17, strM16212u3);
                    }
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(18);
                    } else {
                        interfaceC4026cY0.mo1778g(18, r0.intValue());
                    }
                    interfaceC4026cY0.mo1778g(19, j10);
                    if (localDateTime2 != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY0.mo1779i(20);
                    } else {
                        interfaceC4026cY0.mo1776B(20, strM16212u4);
                    }
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY0.mo1779i(21);
                    } else {
                        interfaceC4026cY0.mo1778g(21, r0.intValue());
                    }
                    interfaceC4026cY0.mo1778g(22, j10);
                    if (localDateTime2 != null) {
                        C8800o c8800o5 = C8800o.f42459a;
                        strM16212u5 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u5 = null;
                    }
                    if (strM16212u5 == null) {
                        interfaceC4026cY0.mo1779i(23);
                    } else {
                        interfaceC4026cY0.mo1776B(23, strM16212u5);
                    }
                    interfaceC4026cY0.r0();
                    jM10877a = re.m10877a(_connection);
                    interfaceC4026cY0.close();
                    break;
                } finally {
                }
            default:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection2.y0("INSERT INTO CallLog (phone_number,country_code,name,call_type,date_time,duration,calllog_id,sim_number,notes,is_lead_call_log,modify_date_time,call_log_sync_status) SELECT ?,?,IFNULL((SELECT name FROM Contact WHERE phone_number = ?),?),?,?,?,?,?,?,?,?,? ");
                try {
                    interfaceC4026cY02.mo1776B(1, str4);
                    interfaceC4026cY02.mo1778g(2, i12);
                    interfaceC4026cY02.mo1776B(3, str4);
                    interfaceC4026cY02.mo1776B(4, str3);
                    if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                        interfaceC4026cY02.mo1779i(5);
                    } else {
                        interfaceC4026cY02.mo1778g(5, r0.intValue());
                    }
                    if (localDateTime2 != null) {
                        C8800o c8800o6 = C8800o.f42459a;
                        strM16212u6 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u6 = null;
                    }
                    if (strM16212u6 == null) {
                        interfaceC4026cY02.mo1779i(6);
                    } else {
                        interfaceC4026cY02.mo1776B(6, strM16212u6);
                    }
                    interfaceC4026cY02.mo1778g(7, j10);
                    interfaceC4026cY02.mo1778g(8, j6);
                    interfaceC4026cY02.mo1776B(9, str2);
                    if (str == null) {
                        interfaceC4026cY02.mo1779i(10);
                    } else {
                        interfaceC4026cY02.mo1776B(10, str);
                    }
                    interfaceC4026cY02.mo1778g(11, z6 ? 1L : 0L);
                    if (localDateTime != null) {
                        C8800o c8800o7 = C8800o.f42459a;
                        strM16212u7 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u7 = null;
                    }
                    if (strM16212u7 == null) {
                        interfaceC4026cY02.mo1779i(12);
                    } else {
                        interfaceC4026cY02.mo1776B(12, strM16212u7);
                    }
                    interfaceC4026cY02.mo1778g(13, i11);
                    interfaceC4026cY02.r0();
                    jM10877a = re.m10877a(_connection2);
                    interfaceC4026cY02.close();
                    break;
                } finally {
                }
        }
        return Long.valueOf(jM10877a);
    }
}
