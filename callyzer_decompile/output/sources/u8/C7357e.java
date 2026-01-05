package u8;

import android.content.Context;
import android.content.SharedPreferences;
import com.sun.mail.util.AbstractC1452a;
import d8.AbstractC1655a;
import kotlin.jvm.internal.AbstractC4154l;
import l8.InterfaceC4427a;
import yv.C8805t;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: u8.e */
/* loaded from: classes.dex */
public final class C7357e extends AbstractC1655a {

    /* renamed from: c */
    public final /* synthetic */ int f35014c = 1;

    /* renamed from: d */
    public final Object f35015d;

    public C7357e(C8805t c8805t) {
        super(20, 21);
        this.f35015d = c8805t;
    }

    @Override // d8.AbstractC1655a
    /* renamed from: b */
    public final void mo5366b(InterfaceC4427a db2) {
        switch (this.f35014c) {
            case 0:
                AbstractC4154l.m8923f(db2, "db");
                if (this.f8165b >= 10) {
                    db2.mo9258E(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    ((Context) this.f35015d).getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            case 1:
                AbstractC4154l.m8923f(db2, "db");
                db2.mo9263p("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = (Context) this.f35015d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j6 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    db2.mo9262k();
                    try {
                        db2.mo9258E(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j6)});
                        db2.mo9258E(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        db2.mo9259F();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    db2.mo9262k();
                    try {
                        db2.mo9258E(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        db2.mo9258E(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        db2.mo9259F();
                        return;
                    } finally {
                    }
                }
                return;
            default:
                C8805t c8805t = (C8805t) this.f35015d;
                AbstractC4154l.m8923f(db2, "db");
                try {
                    db2.mo9263p("CREATE TABLE IF NOT EXISTS message_template_Temp \n(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n title TEXT NOT NULL, \n create_date_time TEXT NOT NULL,\n modify_date_time TEXT,\n message_template_id TEXT NOT NULL)");
                    db2.mo9263p("INSERT OR REPLACE INTO message_template_Temp (id,title,create_date_time,modify_date_time,message_template_id) \nSELECT id,title,create_date_time,`modifyDateTime`,message_template_id FROM message_template");
                    db2.mo9263p("DROP TABLE message_template");
                    db2.mo9263p("ALTER TABLE message_template_Temp RENAME TO message_template");
                    db2.mo9263p("CREATE UNIQUE INDEX IF NOT EXISTS `index_message_template_message_template_id` ON message_template (message_template_id)");
                    c8805t.m16231f("DBMigration from 20 to 21 successful");
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    e2.getMessage();
                    c8805t.m16235j(e2);
                    AbstractC1452a.m4579z("DBMigration error >>> ", e2.getMessage(), c8805t);
                    return;
                }
        }
    }

    public C7357e(Context context, int i10, int i11) {
        super(i10, i11);
        this.f35015d = context;
    }

    public C7357e(Context context) {
        super(9, 10);
        this.f35015d = context;
    }
}
