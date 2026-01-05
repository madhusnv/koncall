package ug;

import ai.AbstractC0151h;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.p8;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.m */
/* loaded from: classes.dex */
public final class C7442m extends SQLiteOpenHelper {

    /* renamed from: a */
    public final /* synthetic */ int f35606a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0151h f35607b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7442m(C7443n c7443n, Context context) {
        this(context, "google_app_measurement.db");
        this.f35606a = 0;
        this.f35607b = c7443n;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.f35606a) {
            case 0:
                C7443n c7443n = (C7443n) this.f35607b;
                n1 n1Var = (n1) c7443n.f482a;
                n1 n1Var2 = (n1) c7443n.f482a;
                n1Var.getClass();
                k1.j2 j2Var = c7443n.f35640e;
                if (j2Var.f20150b != 0) {
                    ((C8946a) j2Var.f20151c).getClass();
                    if (SystemClock.elapsedRealtime() - j2Var.f20150b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((C8946a) j2Var.f20151c).getClass();
                    j2Var.f20150b = SystemClock.elapsedRealtime();
                    v0 v0Var = n1Var2.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14140a("Opening the database failed, dropping and recreating it");
                    if (!n1Var2.f35664a.getDatabasePath("google_app_measurement.db").delete()) {
                        v0 v0Var2 = n1Var2.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14141b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        j2Var.f20150b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e2) {
                        v0 v0Var3 = n1Var2.f35669f;
                        n1.m14085m(v0Var3);
                        v0Var3.f35862f.m14141b(e2, "Failed to open freshly created database");
                        throw e2;
                    }
                }
            default:
                p0 p0Var = (p0) this.f35607b;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                } catch (SQLiteException unused2) {
                    n1 n1Var3 = (n1) p0Var.f482a;
                    v0 v0Var4 = n1Var3.f35669f;
                    n1.m14085m(v0Var4);
                    v0Var4.f35862f.m14140a("Opening the local database failed, dropping and recreating it");
                    if (!n1Var3.f35664a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        v0 v0Var5 = n1Var3.f35669f;
                        n1.m14085m(v0Var5);
                        v0Var5.f35862f.m14141b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e11) {
                        v0 v0Var6 = ((n1) p0Var.f482a).f35669f;
                        n1.m14085m(v0Var6);
                        v0Var6.f35862f.m14141b(e11, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.f35606a) {
            case 0:
                v0 v0Var = ((n1) ((C7443n) this.f35607b).f482a).f35669f;
                n1.m14085m(v0Var);
                z1.m14268f(v0Var, sQLiteDatabase);
                break;
            default:
                v0 v0Var2 = ((n1) ((p0) this.f35607b).f482a).f35669f;
                n1.m14085m(v0Var2);
                z1.m14268f(v0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.f35606a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        switch (this.f35606a) {
            case 0:
                n1 n1Var = (n1) ((C7443n) this.f35607b).f482a;
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                z1.m14266d(v0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C7443n.f35628f);
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C7443n.f35630h);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C7443n.f35631j);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C7443n.f35633l);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C7443n.f35632k);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C7443n.f35634m);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C7443n.f35635n);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C7443n.f35636p);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C7443n.f35637q);
                p8.m3595a();
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C7443n.f35638r);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C7443n.f35629g);
                n1.m14085m(v0Var2);
                z1.m14266d(v0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                v0 v0Var3 = ((n1) ((p0) this.f35607b).f482a).f35669f;
                n1.m14085m(v0Var3);
                z1.m14266d(v0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", p0.f35749e);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        int i12 = this.f35606a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7442m(p0 p0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f35606a = 1;
        this.f35607b = p0Var;
    }

    public C7442m(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: h */
    private final void m14038h(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: j */
    private final void m14039j(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: n */
    private final void m14040n(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    /* renamed from: u */
    private final void m14041u(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
