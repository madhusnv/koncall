package an;

import j$.time.LocalDateTime;
import java.util.EnumSet;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import mm.C4792c;
import mm.C4802m;
import mm.C4803n;
import og.mb;
import og.re;
import om.C5405g;
import pg.ea;
import ph.C5950e;
import yv.C8800o;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class r2 {

    /* renamed from: b */
    public static final /* synthetic */ int f1313b = 0;

    /* renamed from: a */
    public final /* synthetic */ int f1314a;

    public /* synthetic */ r2(int i10) {
        this.f1314a = i10;
    }

    /* renamed from: a */
    public final void m512a(InterfaceC4026c statement, Object obj) {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        String strM16212u7;
        String strM16212u8;
        String strM16212u9;
        String strM16212u10;
        String strM16212u11;
        String strM16212u12;
        switch (this.f1314a) {
            case 0:
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f((C4803n) obj, "entity");
                statement.mo1778g(1, r2.f23912a);
                break;
            case 1:
                C4791b entity = (C4791b) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity, "entity");
                long j6 = entity.f23832a;
                statement.mo1778g(1, j6);
                LocalDateTime localDateTime = entity.f23834c;
                if (localDateTime != null) {
                    C8800o c8800o = C8800o.f42459a;
                    strM16212u = C8800o.m16212u(localDateTime);
                } else {
                    strM16212u = null;
                }
                if (strM16212u == null) {
                    statement.mo1779i(2);
                } else {
                    statement.mo1776B(2, strM16212u);
                }
                EnumSet callLogSyncStatus = entity.f23835d;
                AbstractC4154l.m8923f(callLogSyncStatus, "callLogSyncStatus");
                statement.mo1778g(3, ea.m11608c(callLogSyncStatus));
                EnumC8993c enumC8993c = entity.f23836e;
                String strName = enumC8993c != null ? enumC8993c.name() : null;
                if (strName == null) {
                    statement.mo1779i(4);
                } else {
                    statement.mo1776B(4, strName);
                }
                String str = entity.f23837f;
                if (str == null) {
                    statement.mo1779i(5);
                } else {
                    statement.mo1776B(5, str);
                }
                String str2 = entity.f23838g;
                if (str2 == null) {
                    statement.mo1779i(6);
                } else {
                    statement.mo1776B(6, str2);
                }
                String str3 = entity.f23839h;
                if (str3 == null) {
                    statement.mo1779i(7);
                } else {
                    statement.mo1776B(7, str3);
                }
                String str4 = entity.f23840i;
                if (str4 == null) {
                    statement.mo1779i(8);
                } else {
                    statement.mo1776B(8, str4);
                }
                String str5 = entity.f23841j;
                if (str5 == null) {
                    statement.mo1779i(9);
                } else {
                    statement.mo1776B(9, str5);
                }
                statement.mo1778g(10, entity.f23842k ? 1L : 0L);
                LocalDateTime localDateTime2 = entity.f23843l;
                if (localDateTime2 != null) {
                    C8800o c8800o2 = C8800o.f42459a;
                    strM16212u2 = C8800o.m16212u(localDateTime2);
                } else {
                    strM16212u2 = null;
                }
                if (strM16212u2 == null) {
                    statement.mo1779i(11);
                } else {
                    statement.mo1776B(11, strM16212u2);
                }
                C4792c c4792c = entity.f23833b;
                statement.mo1776B(12, c4792c.f23844a);
                String str6 = c4792c.f23845b;
                if (str6 == null) {
                    statement.mo1779i(13);
                } else {
                    statement.mo1776B(13, str6);
                }
                statement.mo1776B(14, c4792c.f23846c);
                statement.mo1778g(15, c4792c.f23847d);
                EnumC8994d enumC8994d = c4792c.f23848e;
                if ((enumC8994d != null ? Integer.valueOf(enumC8994d.getTypeValue()) : null) == null) {
                    statement.mo1779i(16);
                } else {
                    statement.mo1778g(16, r3.intValue());
                }
                LocalDateTime localDateTime3 = c4792c.f23849f;
                if (localDateTime3 != null) {
                    C8800o c8800o3 = C8800o.f42459a;
                    strM16212u3 = C8800o.m16212u(localDateTime3);
                } else {
                    strM16212u3 = null;
                }
                if (strM16212u3 == null) {
                    statement.mo1779i(17);
                } else {
                    statement.mo1776B(17, strM16212u3);
                }
                String str7 = c4792c.f23850g;
                if (str7 == null) {
                    statement.mo1779i(18);
                } else {
                    statement.mo1776B(18, str7);
                }
                Long l9 = c4792c.f23851h;
                if (l9 == null) {
                    statement.mo1779i(19);
                } else {
                    statement.mo1778g(19, l9.longValue());
                }
                statement.mo1778g(20, c4792c.f23852j);
                statement.mo1778g(21, j6);
                break;
            case 2:
                C4803n entity2 = (C4803n) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity2, "entity");
                long j10 = entity2.f23912a;
                statement.mo1778g(1, j10);
                EnumSet callLogSyncStatus2 = entity2.f23914c;
                AbstractC4154l.m8923f(callLogSyncStatus2, "callLogSyncStatus");
                statement.mo1778g(2, ea.m11608c(callLogSyncStatus2));
                LocalDateTime localDateTime4 = entity2.f23915d;
                if (localDateTime4 != null) {
                    C8800o c8800o4 = C8800o.f42459a;
                    strM16212u4 = C8800o.m16212u(localDateTime4);
                } else {
                    strM16212u4 = null;
                }
                if (strM16212u4 == null) {
                    statement.mo1779i(3);
                } else {
                    statement.mo1776B(3, strM16212u4);
                }
                String str8 = entity2.f23916e;
                if (str8 == null) {
                    statement.mo1779i(4);
                } else {
                    statement.mo1776B(4, str8);
                }
                String str9 = entity2.f23917f;
                if (str9 == null) {
                    statement.mo1779i(5);
                } else {
                    statement.mo1776B(5, str9);
                }
                String str10 = entity2.f23918g;
                if (str10 == null) {
                    statement.mo1779i(6);
                } else {
                    statement.mo1776B(6, str10);
                }
                LocalDateTime localDateTime5 = entity2.f23919h;
                if (localDateTime5 != null) {
                    C8800o c8800o5 = C8800o.f42459a;
                    strM16212u5 = C8800o.m16212u(localDateTime5);
                } else {
                    strM16212u5 = null;
                }
                if (strM16212u5 == null) {
                    statement.mo1779i(7);
                } else {
                    statement.mo1776B(7, strM16212u5);
                }
                C4792c c4792c2 = entity2.f23913b;
                statement.mo1776B(8, c4792c2.f23844a);
                String str11 = c4792c2.f23845b;
                if (str11 == null) {
                    statement.mo1779i(9);
                } else {
                    statement.mo1776B(9, str11);
                }
                statement.mo1776B(10, c4792c2.f23846c);
                statement.mo1778g(11, c4792c2.f23847d);
                EnumC8994d enumC8994d2 = c4792c2.f23848e;
                if ((enumC8994d2 != null ? Integer.valueOf(enumC8994d2.getTypeValue()) : null) == null) {
                    statement.mo1779i(12);
                } else {
                    statement.mo1778g(12, r3.intValue());
                }
                LocalDateTime localDateTime6 = c4792c2.f23849f;
                if (localDateTime6 != null) {
                    C8800o c8800o6 = C8800o.f42459a;
                    strM16212u6 = C8800o.m16212u(localDateTime6);
                } else {
                    strM16212u6 = null;
                }
                if (strM16212u6 == null) {
                    statement.mo1779i(13);
                } else {
                    statement.mo1776B(13, strM16212u6);
                }
                String str12 = c4792c2.f23850g;
                if (str12 == null) {
                    statement.mo1779i(14);
                } else {
                    statement.mo1776B(14, str12);
                }
                Long l10 = c4792c2.f23851h;
                if (l10 == null) {
                    statement.mo1779i(15);
                } else {
                    statement.mo1778g(15, l10.longValue());
                }
                statement.mo1778g(16, c4792c2.f23852j);
                statement.mo1778g(17, j10);
                break;
            case 3:
                C5405g entity3 = (C5405g) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity3, "entity");
                long j11 = entity3.f27130a;
                statement.mo1778g(1, j11);
                statement.mo1776B(2, entity3.f27131b);
                statement.mo1776B(3, entity3.f27132c);
                statement.mo1778g(4, entity3.f27133d ? 1L : 0L);
                LocalDateTime localDateTime7 = entity3.f27134e;
                if (localDateTime7 != null) {
                    C8800o c8800o7 = C8800o.f42459a;
                    strM16212u7 = C8800o.m16212u(localDateTime7);
                } else {
                    strM16212u7 = null;
                }
                if (strM16212u7 == null) {
                    statement.mo1779i(5);
                } else {
                    statement.mo1776B(5, strM16212u7);
                }
                LocalDateTime localDateTime8 = entity3.f27135f;
                C8800o c8800o8 = C8800o.f42459a;
                statement.mo1776B(6, C8800o.m16212u(localDateTime8));
                statement.mo1778g(7, C5950e.m11978i(entity3.f27136g));
                statement.mo1778g(8, entity3.f27137h);
                statement.mo1776B(9, entity3.f27138i);
                statement.mo1776B(10, entity3.f27139j);
                statement.mo1778g(11, j11);
                break;
            default:
                C4802m entity4 = (C4802m) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity4, "entity");
                long j12 = entity4.f23889a;
                statement.mo1778g(1, j12);
                String str13 = entity4.f23890b;
                if (str13 == null) {
                    statement.mo1779i(2);
                } else {
                    statement.mo1776B(2, str13);
                }
                String str14 = entity4.f23891c;
                if (str14 == null) {
                    statement.mo1779i(3);
                } else {
                    statement.mo1776B(3, str14);
                }
                statement.mo1778g(4, entity4.f23892d);
                statement.mo1778g(5, entity4.f23893e);
                String str15 = entity4.f23894f;
                if (str15 == null) {
                    statement.mo1779i(6);
                } else {
                    statement.mo1776B(6, str15);
                }
                statement.mo1778g(7, entity4.f23895g);
                String str16 = entity4.f23896h;
                if (str16 == null) {
                    statement.mo1779i(8);
                } else {
                    statement.mo1776B(8, str16);
                }
                String str17 = entity4.f23897i;
                if (str17 == null) {
                    statement.mo1779i(9);
                } else {
                    statement.mo1776B(9, str17);
                }
                statement.mo1778g(10, entity4.f23898j ? 1L : 0L);
                LocalDateTime localDateTime9 = entity4.f23899k;
                if (localDateTime9 != null) {
                    C8800o c8800o9 = C8800o.f42459a;
                    strM16212u8 = C8800o.m16212u(localDateTime9);
                } else {
                    strM16212u8 = null;
                }
                if (strM16212u8 == null) {
                    statement.mo1779i(11);
                } else {
                    statement.mo1776B(11, strM16212u8);
                }
                LocalDateTime localDateTime10 = entity4.f23900l;
                if (localDateTime10 != null) {
                    C8800o c8800o10 = C8800o.f42459a;
                    strM16212u9 = C8800o.m16212u(localDateTime10);
                } else {
                    strM16212u9 = null;
                }
                if (strM16212u9 == null) {
                    statement.mo1779i(12);
                } else {
                    statement.mo1776B(12, strM16212u9);
                }
                LocalDateTime localDateTime11 = entity4.f23901m;
                if (localDateTime11 != null) {
                    C8800o c8800o11 = C8800o.f42459a;
                    strM16212u10 = C8800o.m16212u(localDateTime11);
                } else {
                    strM16212u10 = null;
                }
                if (strM16212u10 == null) {
                    statement.mo1779i(13);
                } else {
                    statement.mo1776B(13, strM16212u10);
                }
                statement.mo1778g(14, entity4.f23902n ? 1L : 0L);
                statement.mo1778g(15, entity4.f23903o ? 1L : 0L);
                statement.mo1776B(16, entity4.f23904p);
                statement.mo1778g(17, entity4.f23905q ? 1L : 0L);
                LocalDateTime localDateTime12 = entity4.f23906r;
                if (localDateTime12 != null) {
                    C8800o c8800o12 = C8800o.f42459a;
                    strM16212u11 = C8800o.m16212u(localDateTime12);
                } else {
                    strM16212u11 = null;
                }
                if (strM16212u11 == null) {
                    statement.mo1779i(18);
                } else {
                    statement.mo1776B(18, strM16212u11);
                }
                LocalDateTime localDateTime13 = entity4.f23907s;
                if (localDateTime13 != null) {
                    C8800o c8800o13 = C8800o.f42459a;
                    strM16212u12 = C8800o.m16212u(localDateTime13);
                } else {
                    strM16212u12 = null;
                }
                if (strM16212u12 == null) {
                    statement.mo1779i(19);
                } else {
                    statement.mo1776B(19, strM16212u12);
                }
                statement.mo1776B(20, entity4.f23908t);
                String str18 = entity4.f23909u;
                if (str18 == null) {
                    statement.mo1779i(21);
                } else {
                    statement.mo1776B(21, str18);
                }
                String str19 = entity4.f23910v;
                if (str19 == null) {
                    statement.mo1779i(22);
                } else {
                    statement.mo1776B(22, str19);
                }
                statement.mo1778g(23, entity4.f23911w);
                statement.mo1778g(24, j12);
                break;
        }
    }

    /* renamed from: b */
    public int m513b(InterfaceC4024a connection, Object obj) {
        String str;
        AbstractC4154l.m8923f(connection, "connection");
        if (obj == null) {
            return 0;
        }
        switch (this.f1314a) {
            case 0:
                str = "DELETE FROM `CallLogVerification` WHERE `id` = ?";
                break;
            case 1:
                str = "UPDATE OR ABORT `CallLog` SET `id` = ?,`modify_date_time` = ?,`call_log_sync_status` = ?,`call_record_sync_status` = ?,`call_record_source_path` = ?,`call_record_compress_path` = ?,`call_record_web_url` = ?,`call_record_file_id` = ?,`notes` = ?,`is_lead_call_log` = ?,`note_modified_date_time` = ?,`name` = ?,`name_in_contacts` = ?,`phone_number` = ?,`country_code` = ?,`call_type` = ?,`date_time` = ?,`sim_number` = ?,`duration` = ?,`calllog_id` = ? WHERE `id` = ?";
                break;
            case 2:
                str = "UPDATE OR ABORT `CallLogVerification` SET `id` = ?,`call_log_sync_status` = ?,`modify_date_time` = ?,`notes` = ?,`call_log_phone_account_id` = ?,`incomplete_call_reason` = ?,`note_modified_date_time` = ?,`name` = ?,`name_in_contacts` = ?,`phone_number` = ?,`country_code` = ?,`call_type` = ?,`date_time` = ?,`sim_number` = ?,`duration` = ?,`calllog_id` = ? WHERE `id` = ?";
                break;
            case 3:
                str = "UPDATE OR ABORT `CallNoteTemplate` SET `id` = ?,`title` = ?,`description` = ?,`is_master` = ?,`last_Modified_date_time` = ?,`create_date_time` = ?,`call_note_template_sync_status` = ?,`use_count` = ?,`note_template_id` = ?,`sim_number` = ? WHERE `id` = ?";
                break;
            default:
                str = "UPDATE OR REPLACE `UserSimDetails` SET `id` = ?,`carrier_name` = ?,`sim_number` = ?,`sim_country_code` = ?,`slot` = ?,`icc_id` = ?,`sub_id` = ?,`user_name` = ?,`device_connect_code` = ?,`is_connect` = ?,`last_call_sync` = ?,`sync_subscription_start_time` = ?,`sync_subscription_end_time` = ?,`is_lead` = ?,`is_sync_lead_numbers` = ?,`employee_code` = ?,`is_call_recording` = ?,`call_recording_subscription_start_time` = ?,`call_recording_subscription_end_time` = ?,`employee_id` = ?,`customer_name` = ?,`customer_country_name` = ?,`customer_country_code` = ? WHERE `id` = ?";
                break;
        }
        InterfaceC4026c interfaceC4026cY0 = connection.y0(str);
        try {
            m512a(interfaceC4026cY0, obj);
            interfaceC4026cY0.r0();
            mb.m10760a(interfaceC4026cY0, null);
            return re.m10878b(connection);
        } finally {
        }
    }

    public r2(m4 m4Var) {
        this.f1314a = 3;
    }
}
