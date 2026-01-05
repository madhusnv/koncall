package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import og.re;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ String f704a;

    /* renamed from: b */
    public final /* synthetic */ int f705b;

    /* renamed from: c */
    public final /* synthetic */ String f706c;

    /* renamed from: d */
    public final /* synthetic */ Integer f707d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f708e;

    /* renamed from: f */
    public final /* synthetic */ Long f709f;

    /* renamed from: g */
    public final /* synthetic */ String f710g;

    /* renamed from: h */
    public final /* synthetic */ long f711h;

    /* renamed from: j */
    public final /* synthetic */ String f712j;

    /* renamed from: k */
    public final /* synthetic */ String f713k;

    public /* synthetic */ c5(String str, int i10, String str2, Integer num, LocalDateTime localDateTime, Long l9, String str3, long j6, String str4, String str5) {
        this.f704a = str;
        this.f705b = i10;
        this.f706c = str2;
        this.f707d = num;
        this.f708e = localDateTime;
        this.f709f = l9;
        this.f710g = str3;
        this.f711h = j6;
        this.f712j = str4;
        this.f713k = str5;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String str = this.f704a;
        int i10 = this.f705b;
        String str2 = this.f706c;
        long j6 = this.f711h;
        String str3 = this.f713k;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        AbstractC4154l.m8923f(_connection, "_connection");
        InterfaceC4026c interfaceC4026cY0 = _connection.y0("INSERT INTO CorruptCallLog (phone_number,country_code,name,call_type,date_time,duration,sim_number,calllog_id,call_log_phone_account_id,incomplete_call_reason) SELECT ?,?,?,?,?,?,?,?,?,? WHERE NOT (EXISTS (SELECT date_time FROM CorruptCallLog WHERE  call_type = ? AND duration = ? AND date_time = ?) OR  EXISTS (SELECT date_time FROM CallLog WHERE  call_type = ? AND duration = ? AND date_time = ?) OR  EXISTS (SELECT date_time FROM FakeCallLog WHERE  call_type = ? AND duration = ? AND date_time = ?)) ");
        try {
            interfaceC4026cY0.mo1776B(1, str);
            interfaceC4026cY0.mo1778g(2, i10);
            interfaceC4026cY0.mo1776B(3, str2);
            Integer num = this.f707d;
            if (num == null) {
                interfaceC4026cY0.mo1779i(4);
            } else {
                interfaceC4026cY0.mo1778g(4, num.intValue());
            }
            LocalDateTime localDateTime = this.f708e;
            String strM16212u4 = null;
            if (localDateTime != null) {
                C8800o c8800o = C8800o.f42459a;
                strM16212u = C8800o.m16212u(localDateTime);
            } else {
                strM16212u = null;
            }
            if (strM16212u == null) {
                interfaceC4026cY0.mo1779i(5);
            } else {
                interfaceC4026cY0.mo1776B(5, strM16212u);
            }
            Long l9 = this.f709f;
            if (l9 == null) {
                interfaceC4026cY0.mo1779i(6);
            } else {
                interfaceC4026cY0.mo1778g(6, l9.longValue());
            }
            String str4 = this.f710g;
            if (str4 == null) {
                interfaceC4026cY0.mo1779i(7);
            } else {
                interfaceC4026cY0.mo1776B(7, str4);
            }
            interfaceC4026cY0.mo1778g(8, j6);
            String str5 = this.f712j;
            if (str5 == null) {
                interfaceC4026cY0.mo1779i(9);
            } else {
                interfaceC4026cY0.mo1776B(9, str5);
            }
            interfaceC4026cY0.mo1776B(10, str3);
            if (num == null) {
                interfaceC4026cY0.mo1779i(11);
            } else {
                interfaceC4026cY0.mo1778g(11, num.intValue());
            }
            if (l9 == null) {
                interfaceC4026cY0.mo1779i(12);
            } else {
                interfaceC4026cY0.mo1778g(12, l9.longValue());
            }
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
            if (num == null) {
                interfaceC4026cY0.mo1779i(14);
            } else {
                interfaceC4026cY0.mo1778g(14, num.intValue());
            }
            if (l9 == null) {
                interfaceC4026cY0.mo1779i(15);
            } else {
                interfaceC4026cY0.mo1778g(15, l9.longValue());
            }
            if (localDateTime != null) {
                C8800o c8800o3 = C8800o.f42459a;
                strM16212u3 = C8800o.m16212u(localDateTime);
            } else {
                strM16212u3 = null;
            }
            if (strM16212u3 == null) {
                interfaceC4026cY0.mo1779i(16);
            } else {
                interfaceC4026cY0.mo1776B(16, strM16212u3);
            }
            if (num == null) {
                interfaceC4026cY0.mo1779i(17);
            } else {
                interfaceC4026cY0.mo1778g(17, num.intValue());
            }
            if (l9 == null) {
                interfaceC4026cY0.mo1779i(18);
            } else {
                interfaceC4026cY0.mo1778g(18, l9.longValue());
            }
            if (localDateTime != null) {
                C8800o c8800o4 = C8800o.f42459a;
                strM16212u4 = C8800o.m16212u(localDateTime);
            }
            if (strM16212u4 == null) {
                interfaceC4026cY0.mo1779i(19);
            } else {
                interfaceC4026cY0.mo1776B(19, strM16212u4);
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
