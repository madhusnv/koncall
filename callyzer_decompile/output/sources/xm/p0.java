package xm;

import a2.AbstractC0030c;
import ex.InterfaceC2139c;
import ex.InterfaceC2141e;
import j$.time.LocalDateTime;
import java.util.EnumSet;
import java.util.Objects;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4802m;
import nx.AbstractC5178p;
import og.od;
import og.pe;
import og.ue;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;
import yv.C8791f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class p0 extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public final /* synthetic */ int f40683a;

    /* renamed from: b */
    public int f40684b;

    /* renamed from: c */
    public final /* synthetic */ C4802m f40685c;

    /* renamed from: d */
    public final /* synthetic */ x1 f40686d;

    /* renamed from: e */
    public final /* synthetic */ LocalDateTime f40687e;

    /* renamed from: f */
    public final /* synthetic */ LocalDateTime f40688f;

    /* renamed from: g */
    public final /* synthetic */ EnumSet f40689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(C4802m c4802m, x1 x1Var, LocalDateTime localDateTime, LocalDateTime localDateTime2, EnumSet enumSet, InterfaceC7559c interfaceC7559c, int i10) {
        super(2, interfaceC7559c);
        this.f40683a = i10;
        this.f40685c = c4802m;
        this.f40686d = x1Var;
        this.f40687e = localDateTime;
        this.f40688f = localDateTime2;
        this.f40689g = enumSet;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        switch (this.f40683a) {
            case 0:
                return new p0(this.f40685c, this.f40686d, this.f40687e, this.f40688f, this.f40689g, interfaceC7559c, 0);
            default:
                return new p0(this.f40685c, this.f40686d, this.f40687e, this.f40688f, this.f40689g, interfaceC7559c, 1);
        }
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC7266z interfaceC7266z = (InterfaceC7266z) obj;
        InterfaceC7559c interfaceC7559c = (InterfaceC7559c) obj2;
        switch (this.f40683a) {
        }
        return ((p0) create(interfaceC7266z, interfaceC7559c)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) {
        Object objM10839n;
        int i10 = this.f40683a;
        x1 x1Var = this.f40686d;
        C4802m c4802m = this.f40685c;
        switch (i10) {
            case 0:
                EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
                int i11 = this.f40684b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8791f c8791f = C8791f.f42457a;
                if (C8791f.m16170c(c4802m.f23891c)) {
                    throw new NullPointerException("SIM number is empty or null");
                }
                gn.x2 x2Var = x1Var.f40991a;
                String str = c4802m.f23891c;
                AbstractC4154l.m8920c(str);
                boolean z6 = c4802m.f23903o;
                this.f40684b = 1;
                Object objM6703w = x2Var.m6703w(str, this.f40687e, this.f40688f, this.f40689g, z6, this);
                return objM6703w == enumC7794a ? enumC7794a : objM6703w;
            default:
                EnumC7794a enumC7794a2 = EnumC7794a.COROUTINE_SUSPENDED;
                int i12 = this.f40684b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    od.m10798c(obj);
                    return obj;
                }
                od.m10798c(obj);
                C8791f c8791f2 = C8791f.f42457a;
                if (C8791f.m16170c(c4802m.f23891c)) {
                    throw new NullPointerException("simNumber is empty or null");
                }
                gn.x2 x2Var2 = x1Var.f40991a;
                final String str2 = c4802m.f23891c;
                AbstractC4154l.m8920c(str2);
                this.f40684b = 1;
                final an.h3 h3Var = x2Var2.f14941a;
                if (AbstractC5178p.m10101L(str2)) {
                    throw new IllegalStateException("simNumber must be required");
                }
                final LocalDateTime localDateTime = this.f40687e;
                final LocalDateTime localDateTime2 = this.f40688f;
                final EnumSet enumSet = this.f40689g;
                if (localDateTime == null || localDateTime2 == null || str2.length() <= 0) {
                    int i13 = 2;
                    if (localDateTime != null && localDateTime2 != null) {
                        localDateTime.toString();
                        localDateTime2.toString();
                        h3Var.getClass();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SELECT `name`, `phone_number`, `country_code`, `call_type`, `date_time`, `sim_number`, `duration`, `call_log_sync_status`, `note_modified_date_time`, `call_record_sync_status`, `call_record_compress_path`, `call_record_web_url`, `call_record_file_id`, `notes`, `id`, `calllog_id`, `table_name`, `device_connect_code` FROM (SELECT SyncTable.*,device_connect_code FROM ( SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,note_modified_date_time,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb2);
                        sb2.append(") THEN NULL ELSE call_record_sync_status END AS call_record_sync_status,call_record_source_path,call_record_compress_path,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb2);
                        sb2.append(") THEN NULL ELSE call_record_web_url END AS call_record_web_url,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb2);
                        sb2.append(") THEN NULL ELSE call_record_file_id END AS call_record_file_id,notes,id,calllog_id,'CallLog' AS table_name FROM CallLog WHERE call_log_sync_status & ");
                        p020v.a1.m14319B(sb2, "?", " = ", "?", " AND modify_date_time BETWEEN ");
                        p020v.a1.m14319B(sb2, "?", " AND ", "?", " UNION ALL SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,NULL AS call_record_sync_status,NULL AS call_record_source_path,NULL AS call_record_compress_path,NULL AS call_record_web_url,NULL AS call_record_file_id,notes,note_modified_date_time,id,calllog_id,'CallLogVerification' AS table_name FROM CallLogVerification WHERE incomplete_call_reason IS NULL AND call_log_sync_status & ");
                        p020v.a1.m14319B(sb2, "?", " = ", "?", " AND modify_date_time BETWEEN ");
                        String strM124o = AbstractC0030c.m124o(sb2, "?", " AND ", "?", " ORDER BY date_time ASC LIMIT 1000) As SyncTable LEFT JOIN UserSimDetails AS SimTable ON SimTable.sim_number = SyncTable.sim_number)");
                        AbstractC4154l.m8922e(strM124o, "toString(...)");
                        objM10839n = pe.m10839n(this, h3Var.f899a, true, false, new an.g1(strM124o, new String[]{"UPLOAD_IN_PROGRESS", "COMPRESS_IN_PROGRESS"}, i13, enumSet, localDateTime, localDateTime2, h3Var));
                    } else if (str2.length() > 0) {
                        h3Var.getClass();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("SELECT `name`, `phone_number`, `country_code`, `call_type`, `date_time`, `sim_number`, `duration`, `call_log_sync_status`, `note_modified_date_time`, `call_record_sync_status`, `call_record_compress_path`, `call_record_web_url`, `call_record_file_id`, `notes`, `id`, `calllog_id`, `table_name`, `device_connect_code` FROM (SELECT SyncTable.*,device_connect_code FROM (SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,note_modified_date_time,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb3);
                        sb3.append(") THEN NULL ELSE call_record_sync_status END AS call_record_sync_status,call_record_source_path,call_record_compress_path,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb3);
                        sb3.append(") THEN NULL ELSE call_record_web_url END AS call_record_web_url,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb3);
                        sb3.append(") THEN NULL ELSE call_record_file_id END AS call_record_file_id,notes,id,calllog_id,'CallLog' AS table_name FROM CallLog WHERE call_log_sync_status & ");
                        p020v.a1.m14319B(sb3, "?", " = ", "?", " AND sim_number = ");
                        p020v.a1.m14319B(sb3, "?", " UNION ALL SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,NULL AS call_record_sync_status,NULL AS call_record_source_path,NULL AS call_record_compress_path,NULL AS call_record_web_url,NULL AS call_record_file_id,notes,note_modified_date_time,id,calllog_id,'CallLogVerification' AS table_name FROM CallLogVerification WHERE incomplete_call_reason IS NULL AND call_log_sync_status & ", "?", " = ");
                        String strM124o2 = AbstractC0030c.m124o(sb3, "?", " AND sim_number = ", "?", " ORDER BY date_time ASC LIMIT 1000) AS SyncTable LEFT JOIN UserSimDetails AS SimTable ON SimTable.sim_number = SyncTable.sim_number)");
                        AbstractC4154l.m8922e(strM124o2, "toString(...)");
                        objM10839n = pe.m10839n(this, h3Var.f899a, true, false, new an.j1(strM124o2, new String[]{"UPLOAD_IN_PROGRESS", "COMPRESS_IN_PROGRESS"}, i13, enumSet, str2, h3Var));
                    } else {
                        Objects.toString(localDateTime);
                        Objects.toString(localDateTime2);
                        h3Var.getClass();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("SELECT `name`, `phone_number`, `country_code`, `call_type`, `date_time`, `sim_number`, `duration`, `call_log_sync_status`, `note_modified_date_time`, `call_record_sync_status`, `call_record_compress_path`, `call_record_web_url`, `call_record_file_id`, `notes`, `id`, `calllog_id`, `table_name`, `device_connect_code` FROM (SELECT SyncTable.*,device_connect_code FROM (SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,note_modified_date_time,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb4);
                        sb4.append(") THEN NULL ELSE call_record_sync_status END AS call_record_sync_status,call_record_source_path,call_record_compress_path,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb4);
                        sb4.append(") THEN NULL ELSE call_record_web_url END AS call_record_web_url,CASE WHEN call_record_sync_status IN (");
                        ue.m10986b(2, sb4);
                        sb4.append(") THEN NULL ELSE call_record_file_id END AS call_record_file_id,notes,id,calllog_id,'CallLog' AS table_name FROM CallLog WHERE call_log_sync_status & ");
                        p020v.a1.m14319B(sb4, "?", " = ", "?", " UNION ALL SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,NULL AS call_record_sync_status,NULL AS call_record_source_path,NULL AS call_record_compress_path,NULL AS call_record_web_url,NULL AS call_record_file_id,notes,note_modified_date_time,id,calllog_id,'CallLogVerification' AS table_name FROM CallLogVerification WHERE incomplete_call_reason IS NULL AND call_log_sync_status & ");
                        String strM124o3 = AbstractC0030c.m124o(sb4, "?", " = ", "?", " ORDER BY date_time ASC LIMIT 1000) AS SyncTable LEFT JOIN UserSimDetails AS SimTable ON SimTable.sim_number = SyncTable.sim_number)");
                        AbstractC4154l.m8922e(strM124o3, "toString(...)");
                        objM10839n = pe.m10839n(this, h3Var.f899a, true, false, new an.a1(strM124o3, new String[]{"UPLOAD_IN_PROGRESS", "COMPRESS_IN_PROGRESS"}, i13, enumSet, h3Var, 0));
                    }
                } else {
                    localDateTime.toString();
                    localDateTime2.toString();
                    final String[] strArr = {"UPLOAD_IN_PROGRESS", "COMPRESS_IN_PROGRESS"};
                    h3Var.getClass();
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("SELECT `name`, `phone_number`, `country_code`, `call_type`, `date_time`, `sim_number`, `duration`, `call_log_sync_status`, `note_modified_date_time`, `call_record_sync_status`, `call_record_compress_path`, `call_record_web_url`, `call_record_file_id`, `notes`, `id`, `calllog_id`, `table_name`, `device_connect_code` FROM (SELECT SyncTable.*,device_connect_code FROM (SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,note_modified_date_time,CASE WHEN call_record_sync_status IN (");
                    final int i14 = 2;
                    ue.m10986b(2, sb5);
                    sb5.append(") THEN NULL ELSE call_record_sync_status END AS call_record_sync_status,call_record_source_path,call_record_compress_path,CASE WHEN call_record_sync_status IN (");
                    ue.m10986b(2, sb5);
                    sb5.append(") THEN NULL ELSE call_record_web_url END AS call_record_web_url,CASE WHEN call_record_sync_status IN (");
                    ue.m10986b(2, sb5);
                    sb5.append(") THEN NULL ELSE call_record_file_id END AS call_record_file_id,notes,id,calllog_id,'CallLog' AS table_name FROM CallLog WHERE call_log_sync_status & ");
                    p020v.a1.m14319B(sb5, "?", " = ", "?", " AND sim_number = ");
                    p020v.a1.m14319B(sb5, "?", " AND modify_date_time BETWEEN ", "?", " AND ");
                    p020v.a1.m14319B(sb5, "?", " UNION ALL SELECT name,phone_number,country_code,call_type,date_time,sim_number,duration,call_log_sync_status,NULL AS call_record_sync_status,NULL AS call_record_source_path,NULL AS call_record_compress_path,NULL AS call_record_web_url,NULL AS call_record_file_id,notes,note_modified_date_time,id,calllog_id,'CallLogVerification' AS table_name FROM CallLogVerification WHERE incomplete_call_reason IS NULL AND call_log_sync_status & ", "?", " = ");
                    p020v.a1.m14319B(sb5, "?", " AND sim_number = ", "?", " AND modify_date_time BETWEEN ");
                    final String strM124o4 = AbstractC0030c.m124o(sb5, "?", " AND ", "?", " ORDER BY date_time ASC LIMIT 1000) AS SyncTable LEFT JOIN UserSimDetails AS SimTable ON SimTable.sim_number = SyncTable.sim_number)");
                    AbstractC4154l.m8922e(strM124o4, "toString(...)");
                    objM10839n = pe.m10839n(this, h3Var.f899a, true, false, new InterfaceC2139c() { // from class: an.e1
                        /* JADX WARN: Removed duplicated region for block: B:122:0x02e4 A[SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:74:0x01e9 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:3:0x001d, B:5:0x0022, B:8:0x002f, B:10:0x0036, B:11:0x0040, B:13:0x0046, B:14:0x0050, B:17:0x0077, B:20:0x0081, B:24:0x0091, B:27:0x009d, B:29:0x00a4, B:32:0x00d1, B:35:0x00db, B:39:0x00ea, B:42:0x00f4, B:44:0x00fb, B:45:0x0178, B:47:0x017e, B:74:0x01e9, B:76:0x020e, B:78:0x0225, B:79:0x0228, B:80:0x022f, B:85:0x0242, B:87:0x024d, B:91:0x0263, B:95:0x0272, B:99:0x0281, B:104:0x0293, B:109:0x02a8, B:108:0x02a1, B:103:0x028c, B:98:0x027b, B:94:0x026c, B:90:0x0256, B:83:0x023c, B:110:0x02e4, B:111:0x02eb, B:69:0x01d9, B:71:0x01e0, B:64:0x01cb, B:66:0x01d2, B:59:0x01bd, B:61:0x01c4, B:53:0x01aa, B:55:0x01b3, B:50:0x0199, B:43:0x00f8, B:36:0x00df, B:28:0x00a1, B:21:0x0085), top: B:116:0x001d }] */
                        @Override // ex.InterfaceC2139c
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invoke(java.lang.Object r50) throws java.lang.Exception {
                            /*
                                Method dump skipped, instructions count: 756
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: an.e1.invoke(java.lang.Object):java.lang.Object");
                        }
                    });
                }
                return objM10839n == enumC7794a2 ? enumC7794a2 : objM10839n;
        }
    }
}
