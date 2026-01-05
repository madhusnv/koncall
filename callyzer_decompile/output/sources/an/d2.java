package an;

import com.websoptimization.callyzerbiz.data.model.db.SyncCallLogNote;
import ex.InterfaceC2139c;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.EnumSet;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import pg.ea;
import yv.C8800o;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d2 implements InterfaceC2139c {

    /* renamed from: a */
    public final /* synthetic */ int f736a;

    /* renamed from: b */
    public final /* synthetic */ EnumSet f737b;

    /* renamed from: c */
    public final /* synthetic */ String f738c;

    public /* synthetic */ d2(String str, EnumSet enumSet) {
        this.f736a = 0;
        this.f738c = str;
        this.f737b = enumSet;
    }

    @Override // ex.InterfaceC2139c
    public final Object invoke(Object obj) throws Exception {
        InterfaceC4026c interfaceC4026cY0;
        int i10;
        LocalDateTime localDateTimeM16183G;
        int i11 = this.f736a;
        String str = this.f738c;
        EnumSet callLogSyncStatus = this.f737b;
        switch (i11) {
            case 0:
                InterfaceC4024a _connection = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection, "_connection");
                interfaceC4026cY0 = _connection.y0("SELECT COUNT(*) FROM CallLogVerification WHERE sim_number = ? AND call_log_sync_status & ? = ? AND incomplete_call_reason IS NULL");
                try {
                    interfaceC4026cY0.mo1776B(1, str);
                    AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
                    interfaceC4026cY0.mo1778g(2, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1778g(3, ea.m11608c(callLogSyncStatus));
                    i10 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    interfaceC4026cY0.close();
                    break;
                } finally {
                }
            case 1:
                InterfaceC4024a _connection2 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection2, "_connection");
                interfaceC4026cY0 = _connection2.y0("SELECT COUNT(*) FROM CallLog WHERE call_log_sync_status & ? = ? AND sim_number = ?");
                try {
                    AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
                    interfaceC4026cY0.mo1778g(1, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1778g(2, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1776B(3, str);
                    i10 = interfaceC4026cY0.r0() ? (int) interfaceC4026cY0.getLong(0) : 0;
                    break;
                } finally {
                }
            default:
                InterfaceC4024a _connection3 = (InterfaceC4024a) obj;
                AbstractC4154l.m8923f(_connection3, "_connection");
                interfaceC4026cY0 = _connection3.y0("SELECT phone_number,sim_number,country_code,call_type,date_time,duration,notes,id,note_modified_date_time FROM CallLog WHERE call_log_sync_status & ? = ? AND sim_number = ? ORDER BY modify_date_time ASC LIMIT 1000");
                try {
                    interfaceC4026cY0.mo1778g(1, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1778g(2, ea.m11608c(callLogSyncStatus));
                    interfaceC4026cY0.mo1776B(3, str);
                    ArrayList arrayList = new ArrayList();
                    while (interfaceC4026cY0.r0()) {
                        String strMo1777W = interfaceC4026cY0.mo1777W(0);
                        String strMo1777W2 = interfaceC4026cY0.mo1777W(1);
                        int i12 = (int) interfaceC4026cY0.getLong(2);
                        Integer numValueOf = interfaceC4026cY0.isNull(3) ? null : Integer.valueOf((int) interfaceC4026cY0.getLong(3));
                        EnumC8994d enumC8994d = (numValueOf != null && numValueOf.intValue() == 1) ? EnumC8994d.INCOMING : (numValueOf != null && numValueOf.intValue() == 2) ? EnumC8994d.OUTGOING : (numValueOf != null && numValueOf.intValue() == 3) ? EnumC8994d.MISSED : (numValueOf != null && numValueOf.intValue() == 4) ? EnumC8994d.REJECTED : null;
                        if (enumC8994d == null) {
                            throw new IllegalStateException("Expected NON-NULL 'com.websoptimization.callyzerbiz.`data`.room.CallType', but it was NULL.");
                        }
                        String strMo1777W3 = interfaceC4026cY0.mo1777W(4);
                        long j6 = interfaceC4026cY0.getLong(5);
                        String strMo1777W4 = interfaceC4026cY0.isNull(6) ? null : interfaceC4026cY0.mo1777W(6);
                        int i13 = (int) interfaceC4026cY0.getLong(7);
                        String strMo1777W5 = interfaceC4026cY0.isNull(8) ? null : interfaceC4026cY0.mo1777W(8);
                        if (strMo1777W5 != null) {
                            C8800o c8800o = C8800o.f42459a;
                            localDateTimeM16183G = C8800o.m16183G(strMo1777W5);
                        } else {
                            localDateTimeM16183G = null;
                        }
                        arrayList.add(new SyncCallLogNote(strMo1777W, strMo1777W2, enumC8994d, strMo1777W3, j6, i12, strMo1777W4, localDateTimeM16183G, i13));
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    throw th2;
                }
        }
        return Integer.valueOf(i10);
    }

    public /* synthetic */ d2(EnumSet enumSet, String str, int i10) {
        this.f736a = i10;
        this.f737b = enumSet;
        this.f738c = str;
    }
}
