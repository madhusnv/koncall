package zm;

import com.sun.mail.imap.IMAPStore;
import com.websoptimization.callyzerbiz.data.room.CallyzerDatabase_Impl;
import f8.C2213h;
import f8.C2214i;
import f8.C2215j;
import f8.C2216k;
import f8.C2217l;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import jf.C3758a;
import k8.InterfaceC4024a;
import kotlin.jvm.internal.AbstractC4154l;
import og.pe;
import og.ve;
import og.ye;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pg.a9;
import y7.AbstractC8586u;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zm.g */
/* loaded from: classes3.dex */
public final class C8997g extends AbstractC8586u {

    /* renamed from: d */
    public final /* synthetic */ CallyzerDatabase_Impl f43343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8997g(CallyzerDatabase_Impl callyzerDatabase_Impl) {
        super(27, "2c50585b4ae0fdcaf6f507a285387751", "58425104209ae070d810327ad8531c50");
        this.f43343d = callyzerDatabase_Impl;
    }

    @Override // y7.AbstractC8586u
    /* renamed from: a */
    public final void mo15933a(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `UserSimDetails` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `carrier_name` TEXT, `sim_number` TEXT, `sim_country_code` INTEGER NOT NULL DEFAULT 0, `slot` INTEGER NOT NULL, `icc_id` TEXT, `sub_id` INTEGER NOT NULL, `user_name` TEXT, `device_connect_code` TEXT, `is_connect` INTEGER NOT NULL, `last_call_sync` TEXT DEFAULT '', `sync_subscription_start_time` TEXT, `sync_subscription_end_time` TEXT, `is_lead` INTEGER NOT NULL, `is_sync_lead_numbers` INTEGER NOT NULL, `employee_code` TEXT NOT NULL, `is_call_recording` INTEGER NOT NULL, `call_recording_subscription_start_time` TEXT, `call_recording_subscription_end_time` TEXT, `employee_id` TEXT NOT NULL DEFAULT '', `customer_name` TEXT, `customer_country_name` TEXT, `customer_country_code` INTEGER NOT NULL DEFAULT 0)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `CallLog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `modify_date_time` TEXT, `call_log_sync_status` INTEGER NOT NULL, `call_record_sync_status` TEXT, `call_record_source_path` TEXT, `call_record_compress_path` TEXT, `call_record_web_url` TEXT, `call_record_file_id` TEXT, `notes` TEXT, `is_lead_call_log` INTEGER NOT NULL, `note_modified_date_time` TEXT, `name` TEXT NOT NULL, `name_in_contacts` TEXT, `phone_number` TEXT NOT NULL, `country_code` INTEGER NOT NULL DEFAULT -1, `call_type` INTEGER, `date_time` TEXT NOT NULL, `sim_number` TEXT, `duration` INTEGER, `calllog_id` INTEGER NOT NULL DEFAULT 0)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_CallLog_phone_number` ON `CallLog` (`phone_number`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_CallLog_call_type` ON `CallLog` (`call_type`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_CallLog_duration` ON `CallLog` (`duration`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_CallLog_date_time` ON `CallLog` (`date_time`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_CallLog_sim_number` ON `CallLog` (`sim_number`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_calllog_never_attend_not_pop_up_subquery` ON `CallLog` (`phone_number`, `sim_number`, `date_time`, `duration`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_calllog_never_attend_not_pop_up_outer_query` ON `CallLog` (`sim_number`, `call_type`, `date_time`, `duration`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_call_log_pagination_query` ON `CallLog` (`date_time`, `id`)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `CorruptCallLog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `call_log_phone_account_id` TEXT, `incomplete_call_reason` TEXT, `name` TEXT NOT NULL, `name_in_contacts` TEXT, `phone_number` TEXT NOT NULL, `country_code` INTEGER NOT NULL DEFAULT -1, `call_type` INTEGER, `date_time` TEXT NOT NULL, `sim_number` TEXT, `duration` INTEGER, `calllog_id` INTEGER NOT NULL DEFAULT 0)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `FakeCallLog` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `name_in_contacts` TEXT, `phone_number` TEXT NOT NULL, `country_code` INTEGER NOT NULL DEFAULT -1, `call_type` TEXT, `date_time` TEXT NOT NULL, `sim_number` TEXT, `duration` INTEGER, `calllog_id` INTEGER NOT NULL DEFAULT 0)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `LeadStatus` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status` TEXT, `description` TEXT, `is_reminder_mandatory` INTEGER NOT NULL)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `Contact` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `phone_number` TEXT NOT NULL, `country_code` INTEGER DEFAULT -1, `photo_uri` TEXT)");
        a9.m11538a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_contact_number` ON `Contact` (`phone_number`)");
        a9.m11538a(connection, "CREATE INDEX IF NOT EXISTS `index_contact_name` ON `Contact` (`name`)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `CallLogVerification` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `call_log_sync_status` INTEGER NOT NULL, `modify_date_time` TEXT, `notes` TEXT, `call_log_phone_account_id` TEXT, `incomplete_call_reason` TEXT, `note_modified_date_time` TEXT, `name` TEXT NOT NULL, `name_in_contacts` TEXT, `phone_number` TEXT NOT NULL, `country_code` INTEGER NOT NULL DEFAULT -1, `call_type` INTEGER, `date_time` TEXT NOT NULL, `sim_number` TEXT, `duration` INTEGER, `calllog_id` INTEGER NOT NULL DEFAULT 0)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `CallNoteTemplate` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `is_master` INTEGER NOT NULL, `last_Modified_date_time` TEXT, `create_date_time` TEXT NOT NULL DEFAULT '2024-01-01 00:00:00', `call_note_template_sync_status` INTEGER NOT NULL, `use_count` INTEGER NOT NULL, `note_template_id` TEXT NOT NULL, `sim_number` TEXT NOT NULL)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `message_template` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `create_date_time` TEXT NOT NULL, `modify_date_time` TEXT, `message_template_id` TEXT NOT NULL)");
        a9.m11538a(connection, "CREATE UNIQUE INDEX IF NOT EXISTS `index_message_template_message_template_id` ON `message_template` (`message_template_id`)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `message_sub_template` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `instruction` TEXT, `message_sub_template_id` TEXT NOT NULL, `message_template_id` TEXT NOT NULL, `create_date_time` TEXT NOT NULL, FOREIGN KEY(`message_template_id`) REFERENCES `message_template`(`message_template_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `Message_template_documents` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `message_template_document_url` TEXT NOT NULL, `message_template_id` TEXT NOT NULL, FOREIGN KEY(`message_template_id`) REFERENCES `message_template`(`message_template_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `Message_template_dynamic_fields` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL, `message_sub_template_value_type` TEXT NOT NULL, `message_sub_template_id` TEXT NOT NULL, FOREIGN KEY(`id`) REFERENCES `message_sub_template`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `message_template_tag` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `tag_name` TEXT NOT NULL)");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `Message_templateId_tag_Id` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message_template_id` TEXT NOT NULL, `tag_id` TEXT NOT NULL, FOREIGN KEY(`message_template_id`) REFERENCES `message_template`(`message_template_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS `quick_call_extensions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `extension_code` TEXT NOT NULL, `extension_name` TEXT NOT NULL, `last_active_time` TEXT NOT NULL)");
        a9.m11538a(connection, "CREATE VIEW `ViewCallLogContactUserSim` AS SELECT CallLog.id,calllog_id,(CASE WHEN is_lead_call_log = '1' OR Contact.name ISNULL OR Contact.name='Unknown' THEN CallLog.name ELSE Contact.name END) AS name,CallLog.phone_number,CallLog.country_code,date_time,duration,call_type,notes,CASE         WHEN (SELECT is_lead FROM UserSimDetails WHERE sim_number = CallLog.sim_number) = 0        THEN '0'         ELSE is_lead_call_log     END AS is_lead_call_log,CallLog.sim_number,SIMDetail.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,photo_uri,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time,(SELECT COUNT(*) FROM UserSimDetails WHERE is_connect = 1) AS connected_sim_count FROM CallLog AS CallLog LEFT JOIN Contact AS Contact ON Contact.phone_number = CallLog.phone_number LEFT JOIN UserSimDetails AS SIMDetail ON SIMDetail.sim_number = CallLog.sim_number");
        a9.m11538a(connection, "CREATE VIEW `ViewContactCallHistUserSim` AS SELECT C1.id,calllog_id,C1.name ,C1.phone_number,C1.country_code,date_time,duration,call_type,notes,is_lead_call_log,C1.sim_number,S1.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time,(SELECT COUNT(*) FROM UserSimDetails WHERE is_connect = 1) AS connected_sim_count FROM CallLog AS C1 LEFT JOIN UserSimDetails AS S1 ON S1.sim_number = C1.sim_number");
        a9.m11538a(connection, "CREATE VIEW `ViewCallLogUserSim` AS SELECT CallLog.id,calllog_id, CallLog.name,CallLog.name_in_contacts,SIMDetail.user_name,CallLog.phone_number,CallLog.country_code,date_time,duration,call_type,notes,is_lead_call_log,CallLog.sim_number,SIMDetail.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time FROM CallLog AS CallLog LEFT JOIN UserSimDetails AS SIMDetail ON SIMDetail.sim_number = CallLog.sim_number");
        a9.m11538a(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        a9.m11538a(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2c50585b4ae0fdcaf6f507a285387751')");
    }

    @Override // y7.AbstractC8586u
    /* renamed from: c */
    public final void mo15934c(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `UserSimDetails`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `CallLog`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `CorruptCallLog`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `FakeCallLog`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `LeadStatus`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `Contact`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `CallLogVerification`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `CallNoteTemplate`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `message_template`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `message_sub_template`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `Message_template_documents`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `Message_template_dynamic_fields`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `message_template_tag`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `Message_templateId_tag_Id`");
        a9.m11538a(connection, "DROP TABLE IF EXISTS `quick_call_extensions`");
        a9.m11538a(connection, "DROP VIEW IF EXISTS `ViewCallLogContactUserSim`");
        a9.m11538a(connection, "DROP VIEW IF EXISTS `ViewContactCallHistUserSim`");
        a9.m11538a(connection, "DROP VIEW IF EXISTS `ViewCallLogUserSim`");
    }

    @Override // y7.AbstractC8586u
    /* renamed from: r */
    public final void mo15935r(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
    }

    @Override // y7.AbstractC8586u
    /* renamed from: s */
    public final void mo15936s(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        a9.m11538a(connection, "PRAGMA foreign_keys = ON");
        this.f43343d.m16396s(connection);
    }

    @Override // y7.AbstractC8586u
    /* renamed from: t */
    public final void mo15937t(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
    }

    @Override // y7.AbstractC8586u
    /* renamed from: u */
    public final void mo15938u(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        pe.m10830e(connection);
    }

    @Override // y7.AbstractC8586u
    /* renamed from: v */
    public final C3758a mo15939v(InterfaceC4024a connection) {
        AbstractC4154l.m8923f(connection, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("carrier_name", new C2213h("carrier_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sim_number", new C2213h("sim_number", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sim_country_code", new C2213h("sim_country_code", "INTEGER", true, 0, "0", 1));
        linkedHashMap.put("slot", new C2213h("slot", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("icc_id", new C2213h("icc_id", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sub_id", new C2213h("sub_id", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("user_name", new C2213h("user_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("device_connect_code", new C2213h("device_connect_code", "TEXT", false, 0, null, 1));
        linkedHashMap.put("is_connect", new C2213h("is_connect", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("last_call_sync", new C2213h("last_call_sync", "TEXT", false, 0, "''", 1));
        linkedHashMap.put("sync_subscription_start_time", new C2213h("sync_subscription_start_time", "TEXT", false, 0, null, 1));
        linkedHashMap.put("sync_subscription_end_time", new C2213h("sync_subscription_end_time", "TEXT", false, 0, null, 1));
        linkedHashMap.put("is_lead", new C2213h("is_lead", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("is_sync_lead_numbers", new C2213h("is_sync_lead_numbers", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("employee_code", new C2213h("employee_code", "TEXT", true, 0, null, 1));
        linkedHashMap.put("is_call_recording", new C2213h("is_call_recording", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("call_recording_subscription_start_time", new C2213h("call_recording_subscription_start_time", "TEXT", false, 0, null, 1));
        linkedHashMap.put("call_recording_subscription_end_time", new C2213h("call_recording_subscription_end_time", "TEXT", false, 0, null, 1));
        linkedHashMap.put("employee_id", new C2213h("employee_id", "TEXT", true, 0, "''", 1));
        linkedHashMap.put("customer_name", new C2213h("customer_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("customer_country_name", new C2213h("customer_country_name", "TEXT", false, 0, null, 1));
        linkedHashMap.put("customer_country_code", new C2213h("customer_country_code", "INTEGER", true, 0, "0", 1));
        C2216k c2216k = new C2216k("UserSimDetails", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b = ve.m11020b(connection, "UserSimDetails");
        if (!c2216k.equals(c2216kM11020b)) {
            return new C3758a(false, AbstractC5601a.m11236g("UserSimDetails(com.websoptimization.callyzerbiz.data.model.UserSimDetails).\n Expected:\n", c2216k, "\n Found:\n", c2216kM11020b), 2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("modify_date_time", new C2213h("modify_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("call_log_sync_status", new C2213h("call_log_sync_status", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("call_record_sync_status", new C2213h("call_record_sync_status", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("call_record_source_path", new C2213h("call_record_source_path", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("call_record_compress_path", new C2213h("call_record_compress_path", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("call_record_web_url", new C2213h("call_record_web_url", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("call_record_file_id", new C2213h("call_record_file_id", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("notes", new C2213h("notes", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("is_lead_call_log", new C2213h("is_lead_call_log", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("note_modified_date_time", new C2213h("note_modified_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap2.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap2.put("name_in_contacts", new C2213h("name_in_contacts", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("phone_number", new C2213h("phone_number", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("country_code", new C2213h("country_code", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("call_type", new C2213h("call_type", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("date_time", new C2213h("date_time", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("sim_number", new C2213h("sim_number", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("duration", new C2213h("duration", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("calllog_id", new C2213h("calllog_id", "INTEGER", true, 0, "0", 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new C2215j("index_CallLog_phone_number", false, pe.m10833h("phone_number"), pe.m10833h("ASC")));
        linkedHashSet2.add(new C2215j("index_CallLog_call_type", false, pe.m10833h("call_type"), pe.m10833h("ASC")));
        linkedHashSet2.add(new C2215j("index_CallLog_duration", false, pe.m10833h("duration"), pe.m10833h("ASC")));
        linkedHashSet2.add(new C2215j("index_CallLog_date_time", false, pe.m10833h("date_time"), pe.m10833h("ASC")));
        linkedHashSet2.add(new C2215j("index_CallLog_sim_number", false, pe.m10833h("sim_number"), pe.m10833h("ASC")));
        linkedHashSet2.add(new C2215j("index_calllog_never_attend_not_pop_up_subquery", false, pe.m10834i("phone_number", "sim_number", "date_time", "duration"), pe.m10834i("ASC", "ASC", "ASC", "ASC")));
        linkedHashSet2.add(new C2215j("index_calllog_never_attend_not_pop_up_outer_query", false, pe.m10834i("sim_number", "call_type", "date_time", "duration"), pe.m10834i("ASC", "ASC", "ASC", "ASC")));
        linkedHashSet2.add(new C2215j("index_call_log_pagination_query", false, pe.m10834i("date_time", "id"), pe.m10834i("ASC", "ASC")));
        C2216k c2216k2 = new C2216k("CallLog", linkedHashMap2, linkedHashSet, linkedHashSet2);
        C2216k c2216kM11020b2 = ve.m11020b(connection, "CallLog");
        if (!c2216k2.equals(c2216kM11020b2)) {
            return new C3758a(false, AbstractC5601a.m11236g("CallLog(com.websoptimization.callyzerbiz.data.model.CallLog).\n Expected:\n", c2216k2, "\n Found:\n", c2216kM11020b2), 2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("call_log_phone_account_id", new C2213h("call_log_phone_account_id", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("incomplete_call_reason", new C2213h("incomplete_call_reason", "TEXT", false, 0, null, 1));
        linkedHashMap3.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap3.put("name_in_contacts", new C2213h("name_in_contacts", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("phone_number", new C2213h("phone_number", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("country_code", new C2213h("country_code", "INTEGER", true, 0, "-1", 1));
        linkedHashMap3.put("call_type", new C2213h("call_type", "INTEGER", false, 0, null, 1));
        linkedHashMap3.put("date_time", new C2213h("date_time", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("sim_number", new C2213h("sim_number", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("duration", new C2213h("duration", "INTEGER", false, 0, null, 1));
        linkedHashMap3.put("calllog_id", new C2213h("calllog_id", "INTEGER", true, 0, "0", 1));
        C2216k c2216k3 = new C2216k("CorruptCallLog", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b3 = ve.m11020b(connection, "CorruptCallLog");
        if (!c2216k3.equals(c2216kM11020b3)) {
            return new C3758a(false, AbstractC5601a.m11236g("CorruptCallLog(com.websoptimization.callyzerbiz.data.model.CorruptCallLog).\n Expected:\n", c2216k3, "\n Found:\n", c2216kM11020b3), 2);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap4.put("name_in_contacts", new C2213h("name_in_contacts", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("phone_number", new C2213h("phone_number", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("country_code", new C2213h("country_code", "INTEGER", true, 0, "-1", 1));
        linkedHashMap4.put("call_type", new C2213h("call_type", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("date_time", new C2213h("date_time", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("sim_number", new C2213h("sim_number", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("duration", new C2213h("duration", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("calllog_id", new C2213h("calllog_id", "INTEGER", true, 0, "0", 1));
        C2216k c2216k4 = new C2216k("FakeCallLog", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b4 = ve.m11020b(connection, "FakeCallLog");
        if (!c2216k4.equals(c2216kM11020b4)) {
            return new C3758a(false, AbstractC5601a.m11236g("FakeCallLog(com.websoptimization.callyzerbiz.data.model.FakeCallLog).\n Expected:\n", c2216k4, "\n Found:\n", c2216kM11020b4), 2);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap5.put("status", new C2213h("status", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("description", new C2213h("description", "TEXT", false, 0, null, 1));
        linkedHashMap5.put("is_reminder_mandatory", new C2213h("is_reminder_mandatory", "INTEGER", true, 0, null, 1));
        C2216k c2216k5 = new C2216k("LeadStatus", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b5 = ve.m11020b(connection, "LeadStatus");
        if (!c2216k5.equals(c2216kM11020b5)) {
            return new C3758a(false, AbstractC5601a.m11236g("LeadStatus(com.websoptimization.callyzerbiz.data.model.LeadStatus).\n Expected:\n", c2216k5, "\n Found:\n", c2216kM11020b5), 2);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap6.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap6.put("phone_number", new C2213h("phone_number", "TEXT", true, 0, null, 1));
        linkedHashMap6.put("country_code", new C2213h("country_code", "INTEGER", false, 0, "-1", 1));
        linkedHashMap6.put("photo_uri", new C2213h("photo_uri", "TEXT", false, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new C2215j("index_contact_number", true, pe.m10833h("phone_number"), pe.m10833h("ASC")));
        linkedHashSet4.add(new C2215j("index_contact_name", false, pe.m10833h(IMAPStore.ID_NAME), pe.m10833h("ASC")));
        C2216k c2216k6 = new C2216k("Contact", linkedHashMap6, linkedHashSet3, linkedHashSet4);
        C2216k c2216kM11020b6 = ve.m11020b(connection, "Contact");
        if (!c2216k6.equals(c2216kM11020b6)) {
            return new C3758a(false, AbstractC5601a.m11236g("Contact(com.websoptimization.callyzerbiz.data.model.Contact).\n Expected:\n", c2216k6, "\n Found:\n", c2216kM11020b6), 2);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap7.put("call_log_sync_status", new C2213h("call_log_sync_status", "INTEGER", true, 0, null, 1));
        linkedHashMap7.put("modify_date_time", new C2213h("modify_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("notes", new C2213h("notes", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("call_log_phone_account_id", new C2213h("call_log_phone_account_id", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("incomplete_call_reason", new C2213h("incomplete_call_reason", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("note_modified_date_time", new C2213h("note_modified_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap7.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap7.put("name_in_contacts", new C2213h("name_in_contacts", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("phone_number", new C2213h("phone_number", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("country_code", new C2213h("country_code", "INTEGER", true, 0, "-1", 1));
        linkedHashMap7.put("call_type", new C2213h("call_type", "INTEGER", false, 0, null, 1));
        linkedHashMap7.put("date_time", new C2213h("date_time", "TEXT", true, 0, null, 1));
        linkedHashMap7.put("sim_number", new C2213h("sim_number", "TEXT", false, 0, null, 1));
        linkedHashMap7.put("duration", new C2213h("duration", "INTEGER", false, 0, null, 1));
        linkedHashMap7.put("calllog_id", new C2213h("calllog_id", "INTEGER", true, 0, "0", 1));
        C2216k c2216k7 = new C2216k("CallLogVerification", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b7 = ve.m11020b(connection, "CallLogVerification");
        if (!c2216k7.equals(c2216kM11020b7)) {
            return new C3758a(false, AbstractC5601a.m11236g("CallLogVerification(com.websoptimization.callyzerbiz.data.model.VerificationCallLog).\n Expected:\n", c2216k7, "\n Found:\n", c2216kM11020b7), 2);
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap8.put(MessageBundle.TITLE_ENTRY, new C2213h(MessageBundle.TITLE_ENTRY, "TEXT", true, 0, null, 1));
        linkedHashMap8.put("description", new C2213h("description", "TEXT", true, 0, null, 1));
        linkedHashMap8.put("is_master", new C2213h("is_master", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("last_Modified_date_time", new C2213h("last_Modified_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap8.put("create_date_time", new C2213h("create_date_time", "TEXT", true, 0, "'2024-01-01 00:00:00'", 1));
        linkedHashMap8.put("call_note_template_sync_status", new C2213h("call_note_template_sync_status", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("use_count", new C2213h("use_count", "INTEGER", true, 0, null, 1));
        linkedHashMap8.put("note_template_id", new C2213h("note_template_id", "TEXT", true, 0, null, 1));
        linkedHashMap8.put("sim_number", new C2213h("sim_number", "TEXT", true, 0, null, 1));
        C2216k c2216k8 = new C2216k("CallNoteTemplate", linkedHashMap8, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b8 = ve.m11020b(connection, "CallNoteTemplate");
        if (!c2216k8.equals(c2216kM11020b8)) {
            return new C3758a(false, AbstractC5601a.m11236g("CallNoteTemplate(com.websoptimization.callyzerbiz.data.model.db.CallNoteTemplate).\n Expected:\n", c2216k8, "\n Found:\n", c2216kM11020b8), 2);
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap9.put(MessageBundle.TITLE_ENTRY, new C2213h(MessageBundle.TITLE_ENTRY, "TEXT", true, 0, null, 1));
        linkedHashMap9.put("create_date_time", new C2213h("create_date_time", "TEXT", true, 0, null, 1));
        linkedHashMap9.put("modify_date_time", new C2213h("modify_date_time", "TEXT", false, 0, null, 1));
        linkedHashMap9.put("message_template_id", new C2213h("message_template_id", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new C2215j("index_message_template_message_template_id", true, pe.m10833h("message_template_id"), pe.m10833h("ASC")));
        C2216k c2216k9 = new C2216k("message_template", linkedHashMap9, linkedHashSet5, linkedHashSet6);
        C2216k c2216kM11020b9 = ve.m11020b(connection, "message_template");
        if (!c2216k9.equals(c2216kM11020b9)) {
            return new C3758a(false, AbstractC5601a.m11236g("message_template(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageTemplate).\n Expected:\n", c2216k9, "\n Found:\n", c2216kM11020b9), 2);
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap10.put(MessageBundle.TITLE_ENTRY, new C2213h(MessageBundle.TITLE_ENTRY, "TEXT", true, 0, null, 1));
        linkedHashMap10.put("description", new C2213h("description", "TEXT", true, 0, null, 1));
        linkedHashMap10.put("instruction", new C2213h("instruction", "TEXT", false, 0, null, 1));
        linkedHashMap10.put("message_sub_template_id", new C2213h("message_sub_template_id", "TEXT", true, 0, null, 1));
        linkedHashMap10.put("message_template_id", new C2213h("message_template_id", "TEXT", true, 0, null, 1));
        linkedHashMap10.put("create_date_time", new C2213h("create_date_time", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new C2214i("message_template", "CASCADE", "NO ACTION", pe.m10833h("message_template_id"), pe.m10833h("message_template_id")));
        C2216k c2216k10 = new C2216k("message_sub_template", linkedHashMap10, linkedHashSet7, new LinkedHashSet());
        C2216k c2216kM11020b10 = ve.m11020b(connection, "message_sub_template");
        if (!c2216k10.equals(c2216kM11020b10)) {
            return new C3758a(false, AbstractC5601a.m11236g("message_sub_template(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageSubTemplate).\n Expected:\n", c2216k10, "\n Found:\n", c2216kM11020b10), 2);
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap11.put(IMAPStore.ID_NAME, new C2213h(IMAPStore.ID_NAME, "TEXT", true, 0, null, 1));
        linkedHashMap11.put("message_template_document_url", new C2213h("message_template_document_url", "TEXT", true, 0, null, 1));
        linkedHashMap11.put("message_template_id", new C2213h("message_template_id", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new C2214i("message_template", "CASCADE", "NO ACTION", pe.m10833h("message_template_id"), pe.m10833h("message_template_id")));
        C2216k c2216k11 = new C2216k("Message_template_documents", linkedHashMap11, linkedHashSet8, new LinkedHashSet());
        C2216k c2216kM11020b11 = ve.m11020b(connection, "Message_template_documents");
        if (!c2216k11.equals(c2216kM11020b11)) {
            return new C3758a(false, AbstractC5601a.m11236g("Message_template_documents(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageTemplateDocuments).\n Expected:\n", c2216k11, "\n Found:\n", c2216kM11020b11), 2);
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap12.put(MessageBundle.TITLE_ENTRY, new C2213h(MessageBundle.TITLE_ENTRY, "TEXT", true, 0, null, 1));
        linkedHashMap12.put("message_sub_template_value_type", new C2213h("message_sub_template_value_type", "TEXT", true, 0, null, 1));
        linkedHashMap12.put("message_sub_template_id", new C2213h("message_sub_template_id", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new C2214i("message_sub_template", "CASCADE", "NO ACTION", pe.m10833h("id"), pe.m10833h("id")));
        C2216k c2216k12 = new C2216k("Message_template_dynamic_fields", linkedHashMap12, linkedHashSet9, new LinkedHashSet());
        C2216k c2216kM11020b12 = ve.m11020b(connection, "Message_template_dynamic_fields");
        if (!c2216k12.equals(c2216kM11020b12)) {
            return new C3758a(false, AbstractC5601a.m11236g("Message_template_dynamic_fields(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageTemplateDynamicFields).\n Expected:\n", c2216k12, "\n Found:\n", c2216kM11020b12), 2);
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap13.put("tag_name", new C2213h("tag_name", "TEXT", true, 0, null, 1));
        C2216k c2216k13 = new C2216k("message_template_tag", linkedHashMap13, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b13 = ve.m11020b(connection, "message_template_tag");
        if (!c2216k13.equals(c2216kM11020b13)) {
            return new C3758a(false, AbstractC5601a.m11236g("message_template_tag(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageTemplateTag).\n Expected:\n", c2216k13, "\n Found:\n", c2216kM11020b13), 2);
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap14.put("message_template_id", new C2213h("message_template_id", "TEXT", true, 0, null, 1));
        linkedHashMap14.put("tag_id", new C2213h("tag_id", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new C2214i("message_template", "CASCADE", "NO ACTION", pe.m10833h("message_template_id"), pe.m10833h("message_template_id")));
        C2216k c2216k14 = new C2216k("Message_templateId_tag_Id", linkedHashMap14, linkedHashSet10, new LinkedHashSet());
        C2216k c2216kM11020b14 = ve.m11020b(connection, "Message_templateId_tag_Id");
        if (!c2216k14.equals(c2216kM11020b14)) {
            return new C3758a(false, AbstractC5601a.m11236g("Message_templateId_tag_Id(com.websoptimization.callyzerbiz.data.model.db.message_template.MessageTemplateIdTagId).\n Expected:\n", c2216k14, "\n Found:\n", c2216kM11020b14), 2);
        }
        LinkedHashMap linkedHashMap15 = new LinkedHashMap();
        linkedHashMap15.put("id", new C2213h("id", "INTEGER", true, 1, null, 1));
        linkedHashMap15.put("extension_code", new C2213h("extension_code", "TEXT", true, 0, null, 1));
        linkedHashMap15.put("extension_name", new C2213h("extension_name", "TEXT", true, 0, null, 1));
        linkedHashMap15.put("last_active_time", new C2213h("last_active_time", "TEXT", true, 0, null, 1));
        C2216k c2216k15 = new C2216k("quick_call_extensions", linkedHashMap15, new LinkedHashSet(), new LinkedHashSet());
        C2216k c2216kM11020b15 = ve.m11020b(connection, "quick_call_extensions");
        if (!c2216k15.equals(c2216kM11020b15)) {
            return new C3758a(false, AbstractC5601a.m11236g("quick_call_extensions(com.websoptimization.callyzerbiz.data.model.db.ExtensionDetails).\n Expected:\n", c2216k15, "\n Found:\n", c2216kM11020b15), 2);
        }
        C2217l c2217l = new C2217l("ViewCallLogContactUserSim", "CREATE VIEW `ViewCallLogContactUserSim` AS SELECT CallLog.id,calllog_id,(CASE WHEN is_lead_call_log = '1' OR Contact.name ISNULL OR Contact.name='Unknown' THEN CallLog.name ELSE Contact.name END) AS name,CallLog.phone_number,CallLog.country_code,date_time,duration,call_type,notes,CASE         WHEN (SELECT is_lead FROM UserSimDetails WHERE sim_number = CallLog.sim_number) = 0        THEN '0'         ELSE is_lead_call_log     END AS is_lead_call_log,CallLog.sim_number,SIMDetail.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,photo_uri,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time,(SELECT COUNT(*) FROM UserSimDetails WHERE is_connect = 1) AS connected_sim_count FROM CallLog AS CallLog LEFT JOIN Contact AS Contact ON Contact.phone_number = CallLog.phone_number LEFT JOIN UserSimDetails AS SIMDetail ON SIMDetail.sim_number = CallLog.sim_number");
        C2217l c2217lM11070b = ye.m11070b(connection, "ViewCallLogContactUserSim");
        if (!c2217l.equals(c2217lM11070b)) {
            return new C3758a(false, "ViewCallLogContactUserSim(com.websoptimization.callyzerbiz.data.model.db.CallLogContactUserSimView).\n Expected:\n" + c2217l + "\n Found:\n" + c2217lM11070b, 2);
        }
        C2217l c2217l2 = new C2217l("ViewContactCallHistUserSim", "CREATE VIEW `ViewContactCallHistUserSim` AS SELECT C1.id,calllog_id,C1.name ,C1.phone_number,C1.country_code,date_time,duration,call_type,notes,is_lead_call_log,C1.sim_number,S1.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time,(SELECT COUNT(*) FROM UserSimDetails WHERE is_connect = 1) AS connected_sim_count FROM CallLog AS C1 LEFT JOIN UserSimDetails AS S1 ON S1.sim_number = C1.sim_number");
        C2217l c2217lM11070b2 = ye.m11070b(connection, "ViewContactCallHistUserSim");
        if (!c2217l2.equals(c2217lM11070b2)) {
            return new C3758a(false, "ViewContactCallHistUserSim(com.websoptimization.callyzerbiz.data.model.db.ContactDetailCallHistView).\n Expected:\n" + c2217l2 + "\n Found:\n" + c2217lM11070b2, 2);
        }
        C2217l c2217l3 = new C2217l("ViewCallLogUserSim", "CREATE VIEW `ViewCallLogUserSim` AS SELECT CallLog.id,calllog_id, CallLog.name,CallLog.name_in_contacts,SIMDetail.user_name,CallLog.phone_number,CallLog.country_code,date_time,duration,call_type,notes,is_lead_call_log,CallLog.sim_number,SIMDetail.slot,call_record_sync_status,call_record_source_path,call_record_compress_path,call_record_web_url,is_call_recording,sync_subscription_start_time,sync_subscription_end_time,call_recording_subscription_start_time,call_recording_subscription_end_time FROM CallLog AS CallLog LEFT JOIN UserSimDetails AS SIMDetail ON SIMDetail.sim_number = CallLog.sim_number");
        C2217l c2217lM11070b3 = ye.m11070b(connection, "ViewCallLogUserSim");
        if (c2217l3.equals(c2217lM11070b3)) {
            return new C3758a(true, (String) null, 2);
        }
        return new C3758a(false, "ViewCallLogUserSim(com.websoptimization.callyzerbiz.data.model.db.CallLogUserSimView).\n Expected:\n" + c2217l3 + "\n Found:\n" + c2217lM11070b3, 2);
    }
}
