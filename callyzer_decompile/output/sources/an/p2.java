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
public final /* synthetic */ class p2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ String f1231a;

    /* renamed from: b */
    public final /* synthetic */ int f1232b;

    /* renamed from: c */
    public final /* synthetic */ String f1233c;

    /* renamed from: d */
    public final /* synthetic */ String f1234d;

    /* renamed from: e */
    public final /* synthetic */ EnumC8994d f1235e;

    /* renamed from: f */
    public final /* synthetic */ LocalDateTime f1236f;

    /* renamed from: g */
    public final /* synthetic */ long f1237g;

    /* renamed from: h */
    public final /* synthetic */ long f1238h;

    /* renamed from: j */
    public final /* synthetic */ String f1239j;

    /* renamed from: k */
    public final /* synthetic */ String f1240k;

    /* renamed from: l */
    public final /* synthetic */ boolean f1241l;

    /* renamed from: m */
    public final /* synthetic */ LocalDateTime f1242m;

    /* renamed from: n */
    public final /* synthetic */ int f1243n;

    public /* synthetic */ p2(String str, int i10, String str2, String str3, EnumC8994d enumC8994d, LocalDateTime localDateTime, long j6, long j10, String str4, String str5, boolean z6, LocalDateTime localDateTime2, int i11) {
        this.f1231a = str;
        this.f1232b = i10;
        this.f1233c = str2;
        this.f1234d = str3;
        this.f1235e = enumC8994d;
        this.f1236f = localDateTime;
        this.f1237g = j6;
        this.f1238h = j10;
        this.f1239j = str4;
        this.f1240k = str5;
        this.f1241l = z6;
        this.f1242m = localDateTime2;
        this.f1243n = i11;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String str = this.f1231a;
        int i10 = this.f1232b;
        String str2 = this.f1233c;
        long j6 = this.f1237g;
        long j10 = this.f1238h;
        String str3 = this.f1239j;
        boolean z6 = this.f1241l;
        int i11 = this.f1243n;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        AbstractC4154l.m8923f(_connection, "_connection");
        InterfaceC4026c interfaceC4026cY0 = _connection.y0("INSERT INTO CallLog ( phone_number, country_code, name, name_in_contacts, call_type, date_time, duration, calllog_id, sim_number, notes, is_lead_call_log, modify_date_time, call_log_sync_status) SELECT ?, ?, IFNULL((SELECT name FROM Contact WHERE phone_number = ?), ?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ? WHERE NOT (EXISTS (SELECT * FROM CallLog WHERE call_type = ? AND duration = ? AND date_time = ?) OR EXISTS (SELECT * FROM FakeCallLog WHERE call_type = ? AND duration = ? AND date_time = ?) OR EXISTS (SELECT * FROM CorruptCallLog WHERE call_type = ? AND duration = ? AND date_time = ?) OR EXISTS (SELECT * FROM CallLogVerification WHERE call_type = ? AND duration = ? AND date_time = ?))");
        try {
            interfaceC4026cY0.mo1776B(1, str);
            interfaceC4026cY0.mo1778g(2, i10);
            interfaceC4026cY0.mo1776B(3, str);
            interfaceC4026cY0.mo1776B(4, str2);
            String str4 = this.f1234d;
            if (str4 == null) {
                interfaceC4026cY0.mo1779i(5);
            } else {
                interfaceC4026cY0.mo1776B(5, str4);
            }
            EnumC8994d enumC8994d = this.f1235e;
            String strM16212u6 = null;
            if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                interfaceC4026cY0.mo1779i(6);
            } else {
                interfaceC4026cY0.mo1778g(6, r2.intValue());
            }
            LocalDateTime localDateTime = this.f1236f;
            if (localDateTime != null) {
                C8800o c8800o = C8800o.f42459a;
                strM16212u = C8800o.m16212u(localDateTime);
            } else {
                strM16212u = null;
            }
            if (strM16212u == null) {
                interfaceC4026cY0.mo1779i(7);
            } else {
                interfaceC4026cY0.mo1776B(7, strM16212u);
            }
            interfaceC4026cY0.mo1778g(8, j6);
            interfaceC4026cY0.mo1778g(9, j10);
            interfaceC4026cY0.mo1776B(10, str3);
            String str5 = this.f1240k;
            if (str5 == null) {
                interfaceC4026cY0.mo1779i(11);
            } else {
                interfaceC4026cY0.mo1776B(11, str5);
            }
            interfaceC4026cY0.mo1778g(12, z6 ? 1L : 0L);
            LocalDateTime localDateTime2 = this.f1242m;
            if (localDateTime2 != null) {
                C8800o c8800o2 = C8800o.f42459a;
                strM16212u2 = C8800o.m16212u(localDateTime2);
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
                interfaceC4026cY0.mo1778g(15, r5.intValue());
            }
            interfaceC4026cY0.mo1778g(16, j6);
            if (localDateTime != null) {
                C8800o c8800o3 = C8800o.f42459a;
                strM16212u3 = C8800o.m16212u(localDateTime);
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
                interfaceC4026cY0.mo1778g(18, r5.intValue());
            }
            interfaceC4026cY0.mo1778g(19, j6);
            if (localDateTime != null) {
                C8800o c8800o4 = C8800o.f42459a;
                strM16212u4 = C8800o.m16212u(localDateTime);
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
                interfaceC4026cY0.mo1778g(21, r5.intValue());
            }
            interfaceC4026cY0.mo1778g(22, j6);
            if (localDateTime != null) {
                C8800o c8800o5 = C8800o.f42459a;
                strM16212u5 = C8800o.m16212u(localDateTime);
            } else {
                strM16212u5 = null;
            }
            if (strM16212u5 == null) {
                interfaceC4026cY0.mo1779i(23);
            } else {
                interfaceC4026cY0.mo1776B(23, strM16212u5);
            }
            if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                interfaceC4026cY0.mo1779i(24);
            } else {
                interfaceC4026cY0.mo1778g(24, r0.intValue());
            }
            interfaceC4026cY0.mo1778g(25, j6);
            if (localDateTime != null) {
                C8800o c8800o6 = C8800o.f42459a;
                strM16212u6 = C8800o.m16212u(localDateTime);
            }
            if (strM16212u6 == null) {
                interfaceC4026cY0.mo1779i(26);
            } else {
                interfaceC4026cY0.mo1776B(26, strM16212u6);
            }
            interfaceC4026cY0.r0();
            long jM10877a = re.m10877a(_connection);
            interfaceC4026cY0.close();
            return Long.valueOf(jM10877a);
        } catch (Throwable th2) {
            interfaceC4026cY0.close();
            throw th2;
        }
    }
}
