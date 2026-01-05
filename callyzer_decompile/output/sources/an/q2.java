package an;

import j$.time.LocalDateTime;
import java.util.EnumSet;
import k8.InterfaceC4024a;
import k8.InterfaceC4026c;
import kotlin.jvm.internal.AbstractC4154l;
import mm.C4791b;
import mm.C4792c;
import mm.C4795f;
import mm.C4800k;
import mm.C4802m;
import og.mb;
import og.re;
import om.C5405g;
import om.C5408j;
import pg.ea;
import ph.C5950e;
import qm.C6245a;
import qm.C6246b;
import qm.C6247c;
import qm.C6248d;
import qm.C6249e;
import qm.C6250f;
import rw.AbstractC6663m;
import yv.C8800o;
import zm.EnumC8993c;
import zm.EnumC8994d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q2 {

    /* renamed from: b */
    public static final /* synthetic */ int f1283b = 0;

    /* renamed from: a */
    public final /* synthetic */ int f1284a;

    public /* synthetic */ q2(int i10) {
        this.f1284a = i10;
    }

    /* renamed from: a */
    public final void m498a(InterfaceC4026c statement, Object obj) {
        String strM16212u;
        String strM16212u2;
        String strM16212u3;
        String strM16212u4;
        String strM16212u5;
        String strM16212u6;
        String strM16212u7;
        String strM16212u8 = null;
        switch (this.f1284a) {
            case 0:
                C4791b entity = (C4791b) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity, "entity");
                statement.mo1778g(1, entity.f23832a);
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
                    strM16212u8 = C8800o.m16212u(localDateTime3);
                }
                String str7 = strM16212u8;
                if (str7 == null) {
                    statement.mo1779i(17);
                } else {
                    statement.mo1776B(17, str7);
                }
                String str8 = c4792c.f23850g;
                if (str8 == null) {
                    statement.mo1779i(18);
                } else {
                    statement.mo1776B(18, str8);
                }
                Long l9 = c4792c.f23851h;
                if (l9 == null) {
                    statement.mo1779i(19);
                } else {
                    statement.mo1778g(19, l9.longValue());
                }
                statement.mo1778g(20, c4792c.f23852j);
                break;
            case 1:
                C5405g entity2 = (C5405g) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity2, "entity");
                statement.mo1778g(1, entity2.f27130a);
                statement.mo1776B(2, entity2.f27131b);
                statement.mo1776B(3, entity2.f27132c);
                statement.mo1778g(4, entity2.f27133d ? 1L : 0L);
                LocalDateTime localDateTime4 = entity2.f27134e;
                if (localDateTime4 != null) {
                    C8800o c8800o4 = C8800o.f42459a;
                    strM16212u8 = C8800o.m16212u(localDateTime4);
                }
                String str9 = strM16212u8;
                if (str9 == null) {
                    statement.mo1779i(5);
                } else {
                    statement.mo1776B(5, str9);
                }
                LocalDateTime localDateTime5 = entity2.f27135f;
                C8800o c8800o5 = C8800o.f42459a;
                statement.mo1776B(6, C8800o.m16212u(localDateTime5));
                statement.mo1778g(7, C5950e.m11978i(entity2.f27136g));
                statement.mo1778g(8, entity2.f27137h);
                statement.mo1776B(9, entity2.f27138i);
                statement.mo1776B(10, entity2.f27139j);
                break;
            case 2:
                C4795f entity3 = (C4795f) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity3, "entity");
                statement.mo1778g(1, 0);
                statement.mo1776B(2, entity3.f23867a);
                statement.mo1776B(3, entity3.f23868b);
                statement.mo1778g(4, entity3.f23869c.intValue());
                String str10 = entity3.f23870d;
                if (str10 != null) {
                    statement.mo1776B(5, str10);
                    break;
                } else {
                    statement.mo1779i(5);
                    break;
                }
            case 3:
                C5408j entity4 = (C5408j) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity4, "entity");
                statement.mo1778g(1, entity4.f27157a);
                statement.mo1776B(2, entity4.f27158b);
                statement.mo1776B(3, entity4.f27159c);
                statement.mo1776B(4, entity4.f27160d);
                break;
            case 4:
                C4800k entity5 = (C4800k) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity5, "entity");
                statement.mo1778g(1, entity5.f23885a);
                String str11 = entity5.f23886b;
                if (str11 == null) {
                    statement.mo1779i(2);
                } else {
                    statement.mo1776B(2, str11);
                }
                String str12 = entity5.f23887c;
                if (str12 == null) {
                    statement.mo1779i(3);
                } else {
                    statement.mo1776B(3, str12);
                }
                statement.mo1778g(4, entity5.f23888d ? 1L : 0L);
                break;
            case 5:
                C4802m entity6 = (C4802m) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity6, "entity");
                statement.mo1778g(1, entity6.f23889a);
                String str13 = entity6.f23890b;
                if (str13 == null) {
                    statement.mo1779i(2);
                } else {
                    statement.mo1776B(2, str13);
                }
                String str14 = entity6.f23891c;
                if (str14 == null) {
                    statement.mo1779i(3);
                } else {
                    statement.mo1776B(3, str14);
                }
                statement.mo1778g(4, entity6.f23892d);
                statement.mo1778g(5, entity6.f23893e);
                String str15 = entity6.f23894f;
                if (str15 == null) {
                    statement.mo1779i(6);
                } else {
                    statement.mo1776B(6, str15);
                }
                statement.mo1778g(7, entity6.f23895g);
                String str16 = entity6.f23896h;
                if (str16 == null) {
                    statement.mo1779i(8);
                } else {
                    statement.mo1776B(8, str16);
                }
                String str17 = entity6.f23897i;
                if (str17 == null) {
                    statement.mo1779i(9);
                } else {
                    statement.mo1776B(9, str17);
                }
                statement.mo1778g(10, entity6.f23898j ? 1L : 0L);
                LocalDateTime localDateTime6 = entity6.f23899k;
                if (localDateTime6 != null) {
                    C8800o c8800o6 = C8800o.f42459a;
                    strM16212u3 = C8800o.m16212u(localDateTime6);
                } else {
                    strM16212u3 = null;
                }
                if (strM16212u3 == null) {
                    statement.mo1779i(11);
                } else {
                    statement.mo1776B(11, strM16212u3);
                }
                LocalDateTime localDateTime7 = entity6.f23900l;
                if (localDateTime7 != null) {
                    C8800o c8800o7 = C8800o.f42459a;
                    strM16212u4 = C8800o.m16212u(localDateTime7);
                } else {
                    strM16212u4 = null;
                }
                if (strM16212u4 == null) {
                    statement.mo1779i(12);
                } else {
                    statement.mo1776B(12, strM16212u4);
                }
                LocalDateTime localDateTime8 = entity6.f23901m;
                if (localDateTime8 != null) {
                    C8800o c8800o8 = C8800o.f42459a;
                    strM16212u5 = C8800o.m16212u(localDateTime8);
                } else {
                    strM16212u5 = null;
                }
                if (strM16212u5 == null) {
                    statement.mo1779i(13);
                } else {
                    statement.mo1776B(13, strM16212u5);
                }
                statement.mo1778g(14, entity6.f23902n ? 1L : 0L);
                statement.mo1778g(15, entity6.f23903o ? 1L : 0L);
                statement.mo1776B(16, entity6.f23904p);
                statement.mo1778g(17, entity6.f23905q ? 1L : 0L);
                LocalDateTime localDateTime9 = entity6.f23906r;
                if (localDateTime9 != null) {
                    C8800o c8800o9 = C8800o.f42459a;
                    strM16212u6 = C8800o.m16212u(localDateTime9);
                } else {
                    strM16212u6 = null;
                }
                if (strM16212u6 == null) {
                    statement.mo1779i(18);
                } else {
                    statement.mo1776B(18, strM16212u6);
                }
                LocalDateTime localDateTime10 = entity6.f23907s;
                if (localDateTime10 != null) {
                    C8800o c8800o10 = C8800o.f42459a;
                    strM16212u8 = C8800o.m16212u(localDateTime10);
                }
                String str18 = strM16212u8;
                if (str18 == null) {
                    statement.mo1779i(19);
                } else {
                    statement.mo1776B(19, str18);
                }
                statement.mo1776B(20, entity6.f23908t);
                String str19 = entity6.f23909u;
                if (str19 == null) {
                    statement.mo1779i(21);
                } else {
                    statement.mo1776B(21, str19);
                }
                String str20 = entity6.f23910v;
                if (str20 == null) {
                    statement.mo1779i(22);
                } else {
                    statement.mo1776B(22, str20);
                }
                statement.mo1778g(23, entity6.f23911w);
                break;
            case 6:
                C6245a entity7 = (C6245a) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity7, "entity");
                statement.mo1778g(1, entity7.f30268a);
                statement.mo1776B(2, entity7.f30269b);
                statement.mo1776B(3, entity7.f30270c);
                String str21 = entity7.f30271d;
                if (str21 == null) {
                    statement.mo1779i(4);
                } else {
                    statement.mo1776B(4, str21);
                }
                statement.mo1776B(5, entity7.f30272e);
                statement.mo1776B(6, entity7.f30273f);
                LocalDateTime localDateTime11 = entity7.f30274g;
                if (localDateTime11 != null) {
                    C8800o c8800o11 = C8800o.f42459a;
                    strM16212u8 = C8800o.m16212u(localDateTime11);
                }
                String str22 = strM16212u8;
                if (str22 != null) {
                    statement.mo1776B(7, str22);
                    break;
                } else {
                    statement.mo1779i(7);
                    break;
                }
            case 7:
                C6246b entity8 = (C6246b) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity8, "entity");
                statement.mo1778g(1, entity8.f30275a);
                statement.mo1776B(2, entity8.f30276b);
                LocalDateTime localDateTime12 = entity8.f30277c;
                if (localDateTime12 != null) {
                    C8800o c8800o12 = C8800o.f42459a;
                    strM16212u7 = C8800o.m16212u(localDateTime12);
                } else {
                    strM16212u7 = null;
                }
                if (strM16212u7 == null) {
                    statement.mo1779i(3);
                } else {
                    statement.mo1776B(3, strM16212u7);
                }
                LocalDateTime localDateTime13 = entity8.f30278d;
                if (localDateTime13 != null) {
                    C8800o c8800o13 = C8800o.f42459a;
                    strM16212u8 = C8800o.m16212u(localDateTime13);
                }
                String str23 = strM16212u8;
                if (str23 == null) {
                    statement.mo1779i(4);
                } else {
                    statement.mo1776B(4, str23);
                }
                statement.mo1776B(5, entity8.f30279e);
                break;
            case 8:
                C6247c entity9 = (C6247c) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity9, "entity");
                statement.mo1778g(1, entity9.f30280a);
                statement.mo1776B(2, entity9.f30281b);
                statement.mo1776B(3, entity9.f30282c);
                statement.mo1776B(4, entity9.f30283d);
                break;
            case 9:
                C6248d entity10 = (C6248d) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity10, "entity");
                statement.mo1778g(1, entity10.f30284a);
                statement.mo1776B(2, entity10.f30285b);
                String strM12748L = AbstractC6663m.m12748L(entity10.f30286c, ",", null, null, null, 62);
                if (strM12748L == null) {
                    strM12748L = "";
                }
                statement.mo1776B(3, strM12748L);
                statement.mo1776B(4, entity10.f30287d);
                break;
            case 10:
                C6249e entity11 = (C6249e) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity11, "entity");
                statement.mo1778g(1, entity11.f30288a);
                statement.mo1776B(2, entity11.f30289b);
                statement.mo1776B(3, entity11.f30290c);
                break;
            default:
                C6250f entity12 = (C6250f) obj;
                AbstractC4154l.m8923f(statement, "statement");
                AbstractC4154l.m8923f(entity12, "entity");
                statement.mo1778g(1, entity12.f30291a);
                statement.mo1776B(2, entity12.f30292b);
                break;
        }
    }

    /* renamed from: b */
    public final String m499b() {
        switch (this.f1284a) {
            case 0:
                return "INSERT OR IGNORE INTO `CallLog` (`id`,`modify_date_time`,`call_log_sync_status`,`call_record_sync_status`,`call_record_source_path`,`call_record_compress_path`,`call_record_web_url`,`call_record_file_id`,`notes`,`is_lead_call_log`,`note_modified_date_time`,`name`,`name_in_contacts`,`phone_number`,`country_code`,`call_type`,`date_time`,`sim_number`,`duration`,`calllog_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `CallNoteTemplate` (`id`,`title`,`description`,`is_master`,`last_Modified_date_time`,`create_date_time`,`call_note_template_sync_status`,`use_count`,`note_template_id`,`sim_number`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `Contact` (`id`,`name`,`phone_number`,`country_code`,`photo_uri`) VALUES (nullif(?, 0),?,?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `quick_call_extensions` (`id`,`extension_code`,`extension_name`,`last_active_time`) VALUES (nullif(?, 0),?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `LeadStatus` (`id`,`status`,`description`,`is_reminder_mandatory`) VALUES (nullif(?, 0),?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `UserSimDetails` (`id`,`carrier_name`,`sim_number`,`sim_country_code`,`slot`,`icc_id`,`sub_id`,`user_name`,`device_connect_code`,`is_connect`,`last_call_sync`,`sync_subscription_start_time`,`sync_subscription_end_time`,`is_lead`,`is_sync_lead_numbers`,`employee_code`,`is_call_recording`,`call_recording_subscription_start_time`,`call_recording_subscription_end_time`,`employee_id`,`customer_name`,`customer_country_name`,`customer_country_code`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `message_sub_template` (`id`,`title`,`description`,`instruction`,`message_sub_template_id`,`message_template_id`,`create_date_time`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `message_template` (`id`,`title`,`create_date_time`,`modify_date_time`,`message_template_id`) VALUES (nullif(?, 0),?,?,?,?)";
            case 8:
                return "INSERT OR ABORT INTO `Message_template_documents` (`id`,`name`,`message_template_document_url`,`message_template_id`) VALUES (nullif(?, 0),?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `Message_template_dynamic_fields` (`id`,`title`,`message_sub_template_value_type`,`message_sub_template_id`) VALUES (nullif(?, 0),?,?,?)";
            case 10:
                return "INSERT OR ABORT INTO `Message_templateId_tag_Id` (`id`,`message_template_id`,`tag_id`) VALUES (nullif(?, 0),?,?)";
            default:
                return "INSERT OR IGNORE INTO `message_template_tag` (`id`,`tag_name`) VALUES (nullif(?, 0),?)";
        }
    }

    /* renamed from: c */
    public void m500c(InterfaceC4024a connection, Iterable iterable) {
        AbstractC4154l.m8923f(connection, "connection");
        if (iterable == null) {
            return;
        }
        InterfaceC4026c interfaceC4026cY0 = connection.y0(m499b());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    m498a(interfaceC4026cY0, obj);
                    interfaceC4026cY0.r0();
                    interfaceC4026cY0.reset();
                }
            }
            mb.m10760a(interfaceC4026cY0, null);
        } finally {
        }
    }

    /* renamed from: d */
    public long m501d(InterfaceC4024a connection, Object obj) {
        AbstractC4154l.m8923f(connection, "connection");
        if (obj == null) {
            return -1L;
        }
        InterfaceC4026c interfaceC4026cY0 = connection.y0(m499b());
        try {
            m498a(interfaceC4026cY0, obj);
            interfaceC4026cY0.r0();
            mb.m10760a(interfaceC4026cY0, null);
            return re.m10877a(connection);
        } finally {
        }
    }

    public q2(m4 m4Var) {
        this.f1284a = 1;
    }
}
