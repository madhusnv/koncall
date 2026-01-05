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
public final /* synthetic */ class l5 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f1063a;

    /* renamed from: b */
    public final /* synthetic */ boolean f1064b;

    /* renamed from: c */
    public final /* synthetic */ LocalDateTime f1065c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f1066d;

    /* renamed from: e */
    public final /* synthetic */ String f1067e;

    public /* synthetic */ l5(boolean z6, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str, int i10) {
        this.f1063a = i10;
        this.f1064b = z6;
        this.f1065c = localDateTime;
        this.f1066d = localDateTime2;
        this.f1067e = str;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        String strM16212u;
        int iM10878b;
        String strM16212u2;
        int i10 = this.f1063a;
        String strM16212u3 = null;
        String str = this.f1067e;
        LocalDateTime localDateTime = this.f1066d;
        LocalDateTime localDateTime2 = this.f1065c;
        boolean z6 = this.f1064b;
        InterfaceC4024a _connection = (InterfaceC4024a) obj;
        switch (i10) {
            case 0:
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY0 = _connection.y0("UPDATE UserSimDetails SET is_connect = ?,sync_subscription_start_time = ?, sync_subscription_end_time = ? WHERE sim_number = ?");
                try {
                    interfaceC4026cY0.mo1778g(1, z6 ? 1L : 0L);
                    if (localDateTime2 != null) {
                        C8800o c8800o = C8800o.f42459a;
                        strM16212u = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u = null;
                    }
                    if (strM16212u == null) {
                        interfaceC4026cY0.mo1779i(2);
                    } else {
                        interfaceC4026cY0.mo1776B(2, strM16212u);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o2 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime);
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(3);
                    } else {
                        interfaceC4026cY0.mo1776B(3, strM16212u3);
                    }
                    interfaceC4026cY0.mo1776B(4, str);
                    interfaceC4026cY0.r0();
                    iM10878b = re.m10878b(_connection);
                    interfaceC4026cY0.close();
                    break;
                } finally {
                }
            default:
                AbstractC4154l.m8923f(_connection, "_connection");
                InterfaceC4026c interfaceC4026cY02 = _connection.y0("UPDATE UserSimDetails SET is_call_recording = ?, call_recording_subscription_start_time = ?, call_recording_subscription_end_time = ? where sim_number = ?");
                try {
                    interfaceC4026cY02.mo1778g(1, z6 ? 1L : 0L);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u2 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u2 = null;
                    }
                    if (strM16212u2 == null) {
                        interfaceC4026cY02.mo1779i(2);
                    } else {
                        interfaceC4026cY02.mo1776B(2, strM16212u2);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime);
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY02.mo1779i(3);
                    } else {
                        interfaceC4026cY02.mo1776B(3, strM16212u3);
                    }
                    interfaceC4026cY02.mo1776B(4, str);
                    interfaceC4026cY02.r0();
                    iM10878b = re.m10878b(_connection);
                    interfaceC4026cY02.close();
                    break;
                } finally {
                }
        }
        return Integer.valueOf(iM10878b);
    }
}
