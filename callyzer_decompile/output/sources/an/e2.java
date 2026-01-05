package an;

import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.EnumSet;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.ea;
import yv.C8800o;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f774a = 0;

    /* renamed from: b */
    public final /* synthetic */ EnumSet f775b;

    /* renamed from: c */
    public final /* synthetic */ String f776c;

    /* renamed from: d */
    public final /* synthetic */ LocalDateTime f777d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f778e;

    public /* synthetic */ e2(String str, EnumSet enumSet, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f776c = str;
        this.f775b = enumSet;
        this.f777d = localDateTime;
        this.f778e = localDateTime2;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        String strM16212u;
        String strM16212u2;
        int i10;
        String strM16212u3;
        String strM16212u4;
        int i11 = this.f774a;
        LocalDateTime localDateTime = this.f778e;
        LocalDateTime localDateTime2 = this.f777d;
        String str = this.f776c;
        EnumSet callLogSyncStatus = this.f775b;
        switch (i11) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT COUNT(*) FROM CallLogVerification WHERE sim_number = ? AND incomplete_call_reason IS NULL AND call_log_sync_status & ? = ? AND modify_date_time BETWEEN ? AND ?");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
                    interfaceC4026cY0.mo1778g(2, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1778g(3, ea.m11608c(callLogSyncStatus));
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
                    i10 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    break;
                } finally {
                }
            default:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT COUNT(*) FROM CallLog WHERE call_log_sync_status & ? = ? AND sim_number = ? AND modify_date_time BETWEEN ? AND ?");
                try {
                    AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
                    interfaceC4026cY0.mo1778g(1, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1778g(2, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1776B(3, str);
                    if (localDateTime2 != null) {
                        C8800o c8800o3 = C8800o.f42459a;
                        strM16212u3 = C8800o.m16212u(localDateTime2);
                    } else {
                        strM16212u3 = null;
                    }
                    if (strM16212u3 == null) {
                        interfaceC4026cY0.mo1779i(4);
                    } else {
                        interfaceC4026cY0.mo1776B(4, strM16212u3);
                    }
                    if (localDateTime != null) {
                        C8800o c8800o4 = C8800o.f42459a;
                        strM16212u4 = C8800o.m16212u(localDateTime);
                    } else {
                        strM16212u4 = null;
                    }
                    if (strM16212u4 == null) {
                        interfaceC4026cY0.mo1779i(5);
                    } else {
                        interfaceC4026cY0.mo1776B(5, strM16212u4);
                    }
                    i10 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    break;
                } finally {
                }
        }
        return Integer.valueOf(i10);
    }

    public /* synthetic */ e2(EnumSet enumSet, String str, LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        this.f775b = enumSet;
        this.f776c = str;
        this.f777d = localDateTime;
        this.f778e = localDateTime2;
    }
}
