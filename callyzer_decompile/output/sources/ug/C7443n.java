package ug;

import a2.AbstractC0030c;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.p8;
import com.sun.mail.imap.IMAPStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import mm.AbstractC4801l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import sf.AbstractC6840z;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ug.n */
/* loaded from: classes.dex */
public final class C7443n extends c4 {

    /* renamed from: f */
    public static final String[] f35628f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f35629g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: h */
    public static final String[] f35630h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: j */
    public static final String[] f35631j = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};

    /* renamed from: k */
    public static final String[] f35632k = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: l */
    public static final String[] f35633l = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: m */
    public static final String[] f35634m = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: n */
    public static final String[] f35635n = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: p */
    public static final String[] f35636p = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: q */
    public static final String[] f35637q = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: r */
    public static final String[] f35638r = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d */
    public final C7442m f35639d;

    /* renamed from: e */
    public final k1.j2 f35640e;

    public C7443n(h4 h4Var) {
        super(h4Var);
        this.f35640e = new k1.j2(((n1) this.f482a).f35674l);
        ((n1) this.f482a).getClass();
        this.f35639d = new C7442m(this, ((n1) this.f482a).f35664a);
    }

    public static final String p0(List list) {
        return list.isEmpty() ? "" : AbstractC5601a.m11238i(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void v0(ContentValues contentValues, Object obj) {
        AbstractC6840z.m13033d("value");
        AbstractC6840z.m13036g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final void A0() {
        m13858N();
        B0().endTransaction();
    }

    public final SQLiteDatabase B0() {
        mo325M();
        try {
            return this.f35639d.getWritableDatabase();
        } catch (SQLiteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14141b(e2, "Error opening database");
            throw e2;
        }
    }

    public final void C0(String str) {
        C7447r c7447rK0;
        m0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = B0().query("events", (String[]) Collections.singletonList(IMAPStore.ID_NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (c7447rK0 = k0("events", str, string)) != null) {
                            l0("events_snapshot", c7447rK0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e2) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14142c("Error creating snapshot. appId", v0.m14157U(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D0(java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.D0(java.lang.String):void");
    }

    public final void E0(String str, String str2) {
        AbstractC6840z.m13033d(str);
        AbstractC6840z.m13033d(str2);
        mo325M();
        m13858N();
        try {
            B0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            n1 n1Var = (n1) this.f482a;
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14143d("Error deleting user property. appId", v0.m14157U(str), n1Var.f35673k.m14115c(str2), e2);
        }
    }

    public final boolean F0(k4 k4Var) {
        n1 n1Var = (n1) this.f482a;
        String str = k4Var.f35578b;
        mo325M();
        m13858N();
        String str2 = k4Var.f35577a;
        String str3 = k4Var.f35579c;
        if (G0(str2, str3) == null) {
            if (l4.L0(str3)) {
                if (w0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(n1Var.f35667d.m13887U(str2, f0.f35401V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jW0 = w0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                n1Var.getClass();
                if (jW0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put(IMAPStore.ID_NAME, str3);
        contentValues.put("set_timestamp", Long.valueOf(k4Var.f35580d));
        v0(contentValues, k4Var.f35581e);
        try {
            if (B0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(v0.m14157U(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Error storing user property. appId", v0.m14157U(str2), e2);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.k4 G0(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f482a
            r1 = r0
            ug.n1 r1 = (ug.n1) r1
            sf.AbstractC6840z.m13033d(r12)
            sf.AbstractC6840z.m13033d(r13)
            r11.mo325M()
            r11.m13858N()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.B0()     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r4 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r5 = "value"
            java.lang.String r6 = "origin"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            java.lang.String r6 = "app_id=? and name=?"
            java.lang.String[] r7 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L77 android.database.sqlite.SQLiteException -> L7a
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L37
            goto L95
        L37:
            r0 = 0
            long r8 = r3.getLong(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r10 = r11.m14077Z(r3, r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            if (r10 != 0) goto L44
            goto L95
        L44:
            r0 = 2
            java.lang.String r6 = r3.getString(r0)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            ug.k4 r4 = new ug.k4     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L71
            r5 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            boolean r12 = r3.moveToNext()     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            if (r12 == 0) goto L6d
            ug.v0 r12 = r1.f35669f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ug.n1.m14085m(r12)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            ug.t0 r12 = r12.f35862f     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r13 = "Got multiple records for user property, expected one. appId"
            ug.u0 r0 = ug.v0.m14157U(r5)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            r12.m14141b(r0, r13)     // Catch: java.lang.Throwable -> L67 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L67:
            r0 = move-exception
            r12 = r0
            goto L75
        L6a:
            r0 = move-exception
        L6b:
            r12 = r0
            goto L7f
        L6d:
            r3.close()
            return r4
        L71:
            r0 = move-exception
            r5 = r12
            r7 = r13
            goto L6b
        L75:
            r2 = r3
            goto L9b
        L77:
            r0 = move-exception
            r12 = r0
            goto L9b
        L7a:
            r0 = move-exception
            r5 = r12
            r7 = r13
            r12 = r0
            r3 = r2
        L7f:
            ug.v0 r13 = r1.f35669f     // Catch: java.lang.Throwable -> L67
            ug.n1.m14085m(r13)     // Catch: java.lang.Throwable -> L67
            ug.t0 r13 = r13.f35862f     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "Error querying user property. appId"
            ug.u0 r4 = ug.v0.m14157U(r5)     // Catch: java.lang.Throwable -> L67
            ug.q0 r1 = r1.f35673k     // Catch: java.lang.Throwable -> L67
            java.lang.String r1 = r1.m14115c(r7)     // Catch: java.lang.Throwable -> L67
            r13.m14143d(r0, r4, r1, r12)     // Catch: java.lang.Throwable -> L67
        L95:
            if (r3 == 0) goto L9a
            r3.close()
        L9a:
            return r2
        L9b:
            if (r2 == 0) goto La0
            r2.close()
        La0:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.G0(java.lang.String, java.lang.String):ug.k4");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H0(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.f482a
            r1 = r0
            ug.n1 r1 = (ug.n1) r1
            sf.AbstractC6840z.m13033d(r13)
            r12.mo325M()
            r12.m13858N()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r10 = "1000"
            r11 = 0
            android.database.sqlite.SQLiteDatabase r2 = r12.B0()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r3 = "user_attributes"
            java.lang.String r4 = "name"
            java.lang.String r5 = "origin"
            java.lang.String r6 = "set_timestamp"
            java.lang.String r7 = "value"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r5 = "app_id=?"
            java.lang.String[] r6 = new java.lang.String[]{r13}     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            java.lang.String r9 = "rowid"
            r1.getClass()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            r7 = 0
            r8 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L87
            boolean r2 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 == 0) goto L9c
        L3f:
            r2 = 0
            java.lang.String r6 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 1
            java.lang.String r2 = r11.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r2 != 0) goto L4d
            java.lang.String r2 = ""
        L4d:
            r5 = r2
            goto L52
        L4f:
            r0 = move-exception
            r4 = r13
            goto L8a
        L52:
            r2 = 2
            long r7 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2 = 3
            java.lang.Object r9 = r12.m14077Z(r11, r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            if (r9 != 0) goto L73
            ug.v0 r2 = r1.f35669f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            ug.n1.m14085m(r2)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            ug.t0 r2 = r2.f35862f     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            java.lang.String r3 = "Read invalid user property value, ignoring it. appId"
            ug.u0 r4 = ug.v0.m14157U(r13)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r2.m14141b(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            goto L7c
        L70:
            r0 = move-exception
            r13 = r0
            goto La2
        L73:
            ug.k4 r3 = new ug.k4     // Catch: android.database.sqlite.SQLiteException -> L4f java.lang.Throwable -> L70
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            r0.add(r3)     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
        L7c:
            boolean r13 = r11.moveToNext()     // Catch: java.lang.Throwable -> L70 android.database.sqlite.SQLiteException -> L85
            if (r13 != 0) goto L83
            goto L9c
        L83:
            r13 = r4
            goto L3f
        L85:
            r0 = move-exception
            goto L8a
        L87:
            r0 = move-exception
            r4 = r13
            r13 = r0
        L8a:
            ug.v0 r13 = r1.f35669f     // Catch: java.lang.Throwable -> L70
            ug.n1.m14085m(r13)     // Catch: java.lang.Throwable -> L70
            ug.t0 r13 = r13.f35862f     // Catch: java.lang.Throwable -> L70
            java.lang.String r1 = "Error querying user properties. appId"
            ug.u0 r2 = ug.v0.m14157U(r4)     // Catch: java.lang.Throwable -> L70
            r13.m14142c(r1, r2, r0)     // Catch: java.lang.Throwable -> L70
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L70
        L9c:
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r0
        La2:
            if (r11 == 0) goto La7
            r11.close()
        La7:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.H0(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        ug.n1.m14085m(r13);
        r13.f35862f.m14141b(java.lang.Integer.valueOf(com.sun.mail.imap.IMAPStore.RESPONSE), "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List I0(java.lang.String r23, java.lang.String r24, java.lang.String r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.I0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final boolean J0(C7434e c7434e) {
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        String str = c7434e.f35357a;
        AbstractC6840z.m13036g(str);
        if (G0(str, c7434e.f35359c.f35549b) == null) {
            long jW0 = w0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            n1Var.getClass();
            if (jW0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c7434e.f35358b);
        contentValues.put(IMAPStore.ID_NAME, c7434e.f35359c.f35549b);
        Object objM14016b = c7434e.f35359c.m14016b();
        AbstractC6840z.m13036g(objM14016b);
        v0(contentValues, objM14016b);
        contentValues.put("active", Boolean.valueOf(c7434e.f35361e));
        contentValues.put("trigger_event_name", c7434e.f35362f);
        contentValues.put("trigger_timeout", Long.valueOf(c7434e.f35364h));
        C7449t c7449t = c7434e.f35363g;
        l4 l4Var = n1Var.f35672j;
        v0 v0Var = n1Var.f35669f;
        n1.m14083i(l4Var);
        contentValues.put("timed_out_event", l4.r0(c7449t));
        contentValues.put("creation_timestamp", Long.valueOf(c7434e.f35360d));
        n1.m14083i(l4Var);
        contentValues.put("triggered_event", l4.r0(c7434e.f35365j));
        contentValues.put("triggered_timestamp", Long.valueOf(c7434e.f35359c.f35550c));
        contentValues.put("time_to_live", Long.valueOf(c7434e.f35366k));
        contentValues.put("expired_event", l4.r0(c7434e.f35367l));
        try {
            if (B0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(v0.m14157U(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e2) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Error storing conditional user property", v0.m14157U(str), e2);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:29:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.C7434e K0(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.K0(java.lang.String, java.lang.String):ug.e");
    }

    public final void L0(String str, String str2) {
        AbstractC6840z.m13033d(str);
        AbstractC6840z.m13033d(str2);
        mo325M();
        m13858N();
        try {
            B0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e2) {
            n1 n1Var = (n1) this.f482a;
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14143d("Error deleting conditional property", v0.m14157U(str), n1Var.f35673k.m14115c(str2), e2);
        }
    }

    public final List M0(String str, String str2, String str3) {
        AbstractC6840z.m13033d(str);
        mo325M();
        m13858N();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return N0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0056, code lost:
    
        r3 = r2.f35669f;
        ug.n1.m14085m(r3);
        r3.f35862f.m14141b(java.lang.Integer.valueOf(com.sun.mail.imap.IMAPStore.RESPONSE), "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List N0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.N0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.z0 O0(java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.O0(java.lang.String):ug.z0");
    }

    public final void P0(z0 z0Var, boolean z6) {
        n1 n1Var = (n1) this.f482a;
        n1 n1Var2 = z0Var.f35999a;
        mo325M();
        m13858N();
        String strM14221D = z0Var.m14221D();
        AbstractC6840z.m13036g(strM14221D);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM14221D);
        h4 h4Var = this.f35959b;
        if (z6) {
            contentValues.put("app_instance_id", (String) null);
        } else if (h4Var.m13964d(strM14221D).m14213i(x1.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", z0Var.m14222E());
        }
        contentValues.put("gmp_app_id", z0Var.m14224G());
        if (h4Var.m13964d(strM14221D).m14213i(x1.AD_STORAGE)) {
            m1 m1Var = n1Var2.f35670g;
            n1.m14085m(m1Var);
            m1Var.mo325M();
            contentValues.put("resettable_device_id_hash", z0Var.f36003e);
        }
        m1 m1Var2 = n1Var2.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.mo325M();
        contentValues.put("last_bundle_index", Long.valueOf(z0Var.f36005g));
        m1 m1Var3 = n1Var2.f35670g;
        n1.m14085m(m1Var3);
        m1Var3.mo325M();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(z0Var.f36006h));
        m1 m1Var4 = n1Var2.f35670g;
        n1.m14085m(m1Var4);
        m1Var4.mo325M();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(z0Var.f36007i));
        contentValues.put("app_version", z0Var.m14231N());
        m1 m1Var5 = n1Var2.f35670g;
        n1.m14085m(m1Var5);
        m1Var5.mo325M();
        contentValues.put("app_store", z0Var.f36010l);
        m1 m1Var6 = n1Var2.f35670g;
        n1.m14085m(m1Var6);
        m1Var6.mo325M();
        contentValues.put("gmp_version", Long.valueOf(z0Var.f36011m));
        m1 m1Var7 = n1Var2.f35670g;
        n1.m14085m(m1Var7);
        m1Var7.mo325M();
        contentValues.put("dev_cert_hash", Long.valueOf(z0Var.f36012n));
        m1 m1Var8 = n1Var2.f35670g;
        n1.m14085m(m1Var8);
        m1Var8.mo325M();
        contentValues.put("measurement_enabled", Boolean.valueOf(z0Var.f36013o));
        m1 m1Var9 = n1Var2.f35670g;
        m1 m1Var10 = n1Var2.f35670g;
        n1.m14085m(m1Var9);
        m1Var9.mo325M();
        contentValues.put("day", Long.valueOf(z0Var.f35989J));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_public_events_count", Long.valueOf(z0Var.f35990K));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_events_count", Long.valueOf(z0Var.f35991L));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_conversions_count", Long.valueOf(z0Var.f35992M));
        m1 m1Var11 = n1Var2.f35670g;
        n1.m14085m(m1Var11);
        m1Var11.mo325M();
        contentValues.put("config_fetched_time", Long.valueOf(z0Var.f35997R));
        m1 m1Var12 = n1Var2.f35670g;
        n1.m14085m(m1Var12);
        m1Var12.mo325M();
        contentValues.put("failed_config_fetch_time", Long.valueOf(z0Var.f35998S));
        contentValues.put("app_version_int", Long.valueOf(z0Var.m14233P()));
        contentValues.put("firebase_instance_id", z0Var.m14227J());
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_error_events_count", Long.valueOf(z0Var.f35993N));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_realtime_events_count", Long.valueOf(z0Var.f35994O));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("health_monitor_sample", z0Var.f35995P);
        contentValues.put("android_id", (Long) 0L);
        m1 m1Var13 = n1Var2.f35670g;
        n1.m14085m(m1Var13);
        m1Var13.mo325M();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(z0Var.f36014p));
        contentValues.put("dynamite_version", Long.valueOf(z0Var.m14238b()));
        if (h4Var.m13964d(strM14221D).m14213i(x1.ANALYTICS_STORAGE)) {
            m1 m1Var14 = n1Var2.f35670g;
            n1.m14085m(m1Var14);
            m1Var14.mo325M();
            contentValues.put("session_stitching_token", z0Var.f36018t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(z0Var.m14261y()));
        m1 m1Var15 = n1Var2.f35670g;
        n1.m14085m(m1Var15);
        m1Var15.mo325M();
        contentValues.put("target_os_version", Long.valueOf(z0Var.f36020v));
        m1 m1Var16 = n1Var2.f35670g;
        n1.m14085m(m1Var16);
        m1Var16.mo325M();
        contentValues.put("session_stitching_token_hash", Long.valueOf(z0Var.f36021w));
        p8.m3595a();
        C7436g c7436g = n1Var.f35667d;
        v0 v0Var = n1Var.f35669f;
        if (c7436g.m13889W(strM14221D, f0.P0)) {
            m1 m1Var17 = n1Var2.f35670g;
            n1.m14085m(m1Var17);
            m1Var17.mo325M();
            contentValues.put("ad_services_version", Integer.valueOf(z0Var.f36022x));
            m1 m1Var18 = n1Var2.f35670g;
            n1.m14085m(m1Var18);
            m1Var18.mo325M();
            contentValues.put("attribution_eligibility_status", Long.valueOf(z0Var.f35981B));
        }
        m1 m1Var19 = n1Var2.f35670g;
        n1.m14085m(m1Var19);
        m1Var19.mo325M();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(z0Var.f36023y));
        contentValues.put("npa_metadata_value", z0Var.m14259w());
        m1 m1Var20 = n1Var2.f35670g;
        n1.m14085m(m1Var20);
        m1Var20.mo325M();
        contentValues.put("bundle_delivery_index", Long.valueOf(z0Var.f35985F));
        contentValues.put("sgtm_preview_key", z0Var.m14220C());
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("dma_consent_state", Integer.valueOf(z0Var.f35983D));
        n1.m14085m(m1Var10);
        m1Var10.mo325M();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(z0Var.f35984E));
        contentValues.put("serialized_npa_metadata", z0Var.m14255s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(z0Var.m14256t()));
        m1 m1Var21 = n1Var2.f35670g;
        n1.m14085m(m1Var21);
        m1Var21.mo325M();
        ArrayList arrayList = z0Var.f36017s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                n1.m14085m(v0Var);
                v0Var.f35865j.m14141b(strM14221D, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (n1Var.f35667d.m13889W(null, f0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        m1 m1Var22 = n1Var2.f35670g;
        n1.m14085m(m1Var22);
        m1Var22.mo325M();
        contentValues.put("unmatched_pfo", z0Var.f36024z);
        m1 m1Var23 = n1Var2.f35670g;
        n1.m14085m(m1Var23);
        m1Var23.mo325M();
        contentValues.put("unmatched_uwa", z0Var.f35980A);
        m1 m1Var24 = n1Var2.f35670g;
        n1.m14085m(m1Var24);
        m1Var24.mo325M();
        contentValues.put("ad_campaign_info", z0Var.f35987H);
        try {
            SQLiteDatabase sQLiteDatabaseB0 = B0();
            if (sQLiteDatabaseB0.update("apps", contentValues, "app_id = ?", new String[]{strM14221D}) == 0 && sQLiteDatabaseB0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14141b(v0.m14157U(strM14221D), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e2) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Error storing app. appId", v0.m14157U(strM14221D), e2);
        }
    }

    /* renamed from: Q */
    public final long m14068Q(String str, com.google.android.gms.internal.measurement.i3 i3Var, String str2, Map map, w2 w2Var, Long l9) {
        int iDelete;
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        AbstractC6840z.m13036g(i3Var);
        AbstractC6840z.m13033d(str);
        mo325M();
        m13858N();
        if (t0()) {
            h4 h4Var = this.f35959b;
            long jM13856a = h4Var.f35494j.f35621f.m13856a();
            C8946a c8946a = n1Var.f35674l;
            v0 v0Var = n1Var.f35669f;
            c8946a.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM13856a) > ((Long) f0.f35392M.m13872a(null)).longValue()) {
                h4Var.f35494j.f35621f.m13857b(jElapsedRealtime);
                mo325M();
                m13858N();
                if (t0() && (iDelete = B0().delete("upload_queue", o0(), new String[0])) > 0) {
                    n1.m14085m(v0Var);
                    v0Var.f35870p.m14141b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                AbstractC6840z.m13033d(str);
                mo325M();
                m13858N();
                try {
                    int iM13887U = n1Var.f35667d.m13887U(str, f0.f35380A);
                    if (iM13887U > 0) {
                        B0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM13887U)});
                    }
                } catch (SQLiteException e2) {
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14142c("Error deleting over the limit queued batches. appId", v0.m14157U(str), e2);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb2.append(str3);
            sb2.append("=");
            sb2.append(str4);
            arrayList.add(sb2.toString());
        }
        byte[] bArrM3669a = i3Var.m3669a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM3669a);
        contentValues.put("upload_uri", str2);
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) "\r\n");
            }
        }
        contentValues.put("upload_headers", sb3.toString());
        contentValues.put("upload_type", Integer.valueOf(w2Var.zza()));
        C8946a c8946a2 = n1Var.f35674l;
        v0 v0Var2 = n1Var.f35669f;
        c8946a2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l9 != null) {
            contentValues.put("associated_row_id", l9);
        }
        try {
            long jInsert = B0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e10) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Error storing MeasurementBatch to upload_queue. appId", str, e10);
            return -1L;
        }
    }

    public final C7440k Q0(long j6, String str, boolean z6, boolean z10, boolean z11, boolean z12) {
        return R0(j6, str, 1L, false, false, z6, false, z10, z11, z12);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m14069R(java.lang.String r19, ug.a4 r20, int r21) {
        /*
            r18 = this;
            sf.AbstractC6840z.m13033d(r19)
            r18.mo325M()
            r18.m13858N()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.B0()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r6 = r20
            java.util.List r6 = r6.f35264a     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = p0(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r7 = r18.o0()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r6.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L66
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r11 = r0
            goto L67
        L66:
            r11 = r2
        L67:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r0.<init>()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
        L72:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto Lb9
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            r3 = r18
            r4 = r19
            ug.i4 r1 = r3.n0(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            if (r1 == 0) goto L72
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb5 android.database.sqlite.SQLiteException -> Lb7
            goto L72
        Lb5:
            r0 = move-exception
            goto Lbc
        Lb7:
            r0 = move-exception
            goto Lbf
        Lb9:
            r3 = r18
            goto Ld5
        Lbc:
            r3 = r18
            goto Ldc
        Lbf:
            r3 = r18
            java.lang.Object r1 = r3.f482a     // Catch: java.lang.Throwable -> Ldb
            ug.n1 r1 = (ug.n1) r1     // Catch: java.lang.Throwable -> Ldb
            ug.v0 r1 = r1.f35669f     // Catch: java.lang.Throwable -> Ldb
            ug.n1.m14085m(r1)     // Catch: java.lang.Throwable -> Ldb
            ug.t0 r1 = r1.f35862f     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r1.m14142c(r4, r5, r0)     // Catch: java.lang.Throwable -> Ldb
            java.util.List r0 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r2 == 0) goto Lda
            r2.close()
        Lda:
            return r0
        Ldb:
            r0 = move-exception
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.m14069R(java.lang.String, ug.a4, int):java.util.List");
    }

    public final C7440k R0(long j6, String str, long j10, boolean z6, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        n1 n1Var = (n1) this.f482a;
        AbstractC6840z.m13033d(str);
        mo325M();
        m13858N();
        String[] strArr = {str};
        C7440k c7440k = new C7440k();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseB0 = B0();
                cursorQuery = sQLiteDatabaseB0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j6) {
                        c7440k.f35556b = cursorQuery.getLong(1);
                        c7440k.f35555a = cursorQuery.getLong(2);
                        c7440k.f35557c = cursorQuery.getLong(3);
                        c7440k.f35558d = cursorQuery.getLong(4);
                        c7440k.f35559e = cursorQuery.getLong(5);
                        c7440k.f35560f = cursorQuery.getLong(6);
                        c7440k.f35561g = cursorQuery.getLong(7);
                    }
                    if (z6) {
                        c7440k.f35556b += j10;
                    }
                    if (z10) {
                        c7440k.f35555a += j10;
                    }
                    if (z11) {
                        c7440k.f35557c += j10;
                    }
                    if (z12) {
                        c7440k.f35558d += j10;
                    }
                    if (z13) {
                        c7440k.f35559e += j10;
                    }
                    if (z14) {
                        c7440k.f35560f += j10;
                    }
                    if (z15) {
                        c7440k.f35561g += j10;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j6));
                    contentValues.put("daily_public_events_count", Long.valueOf(c7440k.f35555a));
                    contentValues.put("daily_events_count", Long.valueOf(c7440k.f35556b));
                    contentValues.put("daily_conversions_count", Long.valueOf(c7440k.f35557c));
                    contentValues.put("daily_error_events_count", Long.valueOf(c7440k.f35558d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(c7440k.f35559e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(c7440k.f35560f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(c7440k.f35561g));
                    sQLiteDatabaseB0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35865j.m14141b(v0.m14157U(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e2) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14142c("Error updating daily counts. appId", v0.m14157U(str), e2);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return c7440k;
        } catch (Throwable th2) {
            if (0 != 0) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* renamed from: S */
    public final boolean m14070S(String str) {
        w2[] w2VarArr = {w2.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(w2VarArr[0].zza()));
        String strP0 = p0(arrayList);
        String strO0 = o0();
        return w0(AbstractC0030c.m124o(new StringBuilder((strP0.length() + 61) + strO0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strP0, " AND NOT ", strO0), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:19:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.C7439j S0(java.lang.String r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f482a
            r1 = r0
            ug.n1 r1 = (ug.n1) r1
            sf.AbstractC6840z.m13033d(r12)
            r11.mo325M()
            r11.m13858N()
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.B0()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r4 = "apps"
            java.lang.String r0 = "remote_config"
            java.lang.String r5 = "config_last_modified_time"
            java.lang.String r6 = "e_tag"
            java.lang.String[] r5 = new java.lang.String[]{r0, r5, r6}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            r9 = 0
            r10 = 0
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L70
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r0 != 0) goto L33
            goto L82
        L33:
            r0 = 0
            byte[] r0 = r3.getBlob(r0)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r4 = 1
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r5 = 2
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            boolean r6 = r3.moveToNext()     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            if (r6 == 0) goto L5e
            ug.v0 r6 = r1.f35669f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            ug.n1.m14085m(r6)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            ug.t0 r6 = r6.f35862f     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            java.lang.String r7 = "Got multiple records for app config, expected one. appId"
            ug.u0 r8 = ug.v0.m14157U(r12)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r6.m14141b(r8, r7)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            goto L5e
        L59:
            r0 = move-exception
            r12 = r0
            goto L6b
        L5c:
            r0 = move-exception
            goto L72
        L5e:
            if (r0 != 0) goto L61
            goto L82
        L61:
            ug.j r6 = new ug.j     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r7 = 0
            r6.<init>(r7, r0, r4, r5)     // Catch: java.lang.Throwable -> L59 android.database.sqlite.SQLiteException -> L5c
            r3.close()
            return r6
        L6b:
            r2 = r3
            goto L88
        L6d:
            r0 = move-exception
            r12 = r0
            goto L88
        L70:
            r0 = move-exception
            r3 = r2
        L72:
            ug.v0 r1 = r1.f35669f     // Catch: java.lang.Throwable -> L59
            ug.n1.m14085m(r1)     // Catch: java.lang.Throwable -> L59
            ug.t0 r1 = r1.f35862f     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = "Error querying remote config. appId"
            ug.u0 r12 = ug.v0.m14157U(r12)     // Catch: java.lang.Throwable -> L59
            r1.m14142c(r4, r12, r0)     // Catch: java.lang.Throwable -> L59
        L82:
            if (r3 == 0) goto L87
            r3.close()
        L87:
            return r2
        L88:
            if (r2 == 0) goto L8d
            r2.close()
        L8d:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.S0(java.lang.String):ug.j");
    }

    /* renamed from: T */
    public final void m14071T(Long l9) {
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        try {
            if (B0().delete("upload_queue", "rowid=?", new String[]{l9.toString()}) != 1) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14140a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(e2, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e2;
        }
    }

    public final void T0(com.google.android.gms.internal.measurement.k3 k3Var, boolean z6) {
        mo325M();
        m13858N();
        AbstractC6840z.m13033d(k3Var.m3459p());
        AbstractC6840z.m13039j(k3Var.b2());
        m14074W();
        n1 n1Var = (n1) this.f482a;
        C8946a c8946a = n1Var.f35674l;
        v0 v0Var = n1Var.f35669f;
        c8946a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jC2 = k3Var.c2();
        e0 e0Var = f0.f35397R;
        if (jC2 < jCurrentTimeMillis - ((Long) e0Var.m13872a(null)).longValue() || k3Var.c2() > ((Long) e0Var.m13872a(null)).longValue() + jCurrentTimeMillis) {
            n1.m14085m(v0Var);
            v0Var.f35865j.m14143d("Storing bundle outside of the max uploading time span. appId, now, timestamp", v0.m14157U(k3Var.m3459p()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(k3Var.c2()));
        }
        byte[] bArrM3669a = k3Var.m3669a();
        try {
            y0 y0Var = this.f35959b.f35492g;
            h4.m13944U(y0Var);
            byte[] bArrY0 = y0Var.y0(bArrM3669a);
            n1.m14085m(v0Var);
            v0Var.f35870p.m14141b(Integer.valueOf(bArrY0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", k3Var.m3459p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(k3Var.c2()));
            contentValues.put("data", bArrY0);
            contentValues.put("has_realtime", Integer.valueOf(z6 ? 1 : 0));
            if (k3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(k3Var.q0()));
            }
            try {
                if (B0().insert("queue", null, contentValues) == -1) {
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14141b(v0.m14157U(k3Var.m3459p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e2) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14142c("Error storing bundle. appId", v0.m14157U(k3Var.m3459p()), e2);
            }
        } catch (IOException e10) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Data loss. Failed to serialize bundle. appId", v0.m14157U(k3Var.m3459p()), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m14072U() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.B0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L37
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3d
        L22:
            r0 = move-exception
            goto L3d
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            java.lang.Object r3 = r6.f482a     // Catch: java.lang.Throwable -> L1a
            ug.n1 r3 = (ug.n1) r3     // Catch: java.lang.Throwable -> L1a
            ug.v0 r3 = r3.f35669f     // Catch: java.lang.Throwable -> L1a
            ug.n1.m14085m(r3)     // Catch: java.lang.Throwable -> L1a
            ug.t0 r3 = r3.f35862f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m14141b(r2, r4)     // Catch: java.lang.Throwable -> L1a
        L37:
            if (r0 == 0) goto L3c
            r0.close()
        L3c:
            return r1
        L3d:
            if (r1 == 0) goto L42
            r1.close()
        L42:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.m14072U():java.lang.String");
    }

    /* renamed from: V */
    public final void m14073V(long j6) {
        mo325M();
        m13858N();
        try {
            if (B0().delete("queue", "rowid=?", new String[]{String.valueOf(j6)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14141b(e2, "Failed to delete a bundle in a queue table");
            throw e2;
        }
    }

    /* renamed from: W */
    public final void m14074W() {
        mo325M();
        m13858N();
        if (t0()) {
            h4 h4Var = this.f35959b;
            long jM13856a = h4Var.f35494j.f35620e.m13856a();
            n1 n1Var = (n1) this.f482a;
            n1Var.f35674l.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM13856a) > ((Long) f0.f35392M.m13872a(null)).longValue()) {
                h4Var.f35494j.f35620e.m13857b(jElapsedRealtime);
                mo325M();
                m13858N();
                if (t0()) {
                    SQLiteDatabase sQLiteDatabaseB0 = B0();
                    n1Var.f35674l.getClass();
                    int iDelete = sQLiteDatabaseB0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) f0.f35397R.m13872a(null)).longValue())});
                    if (iDelete > 0) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35870p.m14141b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* renamed from: X */
    public final void m14075X(ArrayList arrayList) throws SQLException {
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        AbstractC6840z.m13036g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (t0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM14335o = p020v.a1.m14335o(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (w0(p020v.a1.m14335o(new StringBuilder(strM14335o.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM14335o, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14140a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseB0 = B0();
                StringBuilder sb2 = new StringBuilder(strM14335o.length() + 127);
                sb2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb2.append(strM14335o);
                sb2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseB0.execSQL(sb2.toString());
            } catch (SQLiteException e2) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14141b(e2, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: Y */
    public final void m14076Y(Long l9) {
        n1 n1Var = (n1) this.f482a;
        mo325M();
        m13858N();
        if (t0()) {
            StringBuilder sb2 = new StringBuilder(l9.toString().length() + 86);
            sb2.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb2.append(l9);
            sb2.append(" AND retry_count =  2147483647 LIMIT 1");
            if (w0(sb2.toString(), null) > 0) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35865j.m14140a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseB0 = B0();
                n1Var.f35674l.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb3 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb3.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb3.append(jCurrentTimeMillis);
                String string = sb3.toString();
                StringBuilder sb4 = new StringBuilder(string.length() + 34 + l9.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(string);
                sb4.append(" WHERE rowid = ");
                sb4.append(l9);
                sb4.append(" AND retry_count < 2147483647");
                sQLiteDatabaseB0.execSQL(sb4.toString());
            } catch (SQLiteException e2) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14141b(e2, "Error incrementing retry count. error");
            }
        }
    }

    /* renamed from: Z */
    public final Object m14077Z(Cursor cursor, int i10) {
        n1 n1Var = (n1) this.f482a;
        int type = cursor.getType(i10);
        if (type == 0) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14140a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14141b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        v0 v0Var3 = n1Var.f35669f;
        n1.m14085m(v0Var3);
        v0Var3.f35862f.m14140a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a0(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f482a
            ug.n1 r0 = (ug.n1) r0
            java.lang.String r1 = "select first_open_count from app2 where app_id=?"
            sf.AbstractC6840z.m13033d(r14)
            java.lang.String r2 = "first_open_count"
            sf.AbstractC6840z.m13033d(r2)
            r13.mo325M()
            r13.m13858N()
            android.database.sqlite.SQLiteDatabase r3 = r13.B0()
            r3.beginTransaction()
            r4 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = 48
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r6.append(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String[] r6 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r7 = -1
            long r9 = r13.x0(r1, r6, r7)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            java.lang.String r6 = "app2"
            java.lang.String r11 = "app_id"
            if (r1 != 0) goto L72
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.put(r2, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r10 = "previous_install_count"
            r1.put(r10, r9)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r9 = 0
            r10 = 5
            long r9 = r3.insertWithOnConflict(r6, r9, r1, r10)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 != 0) goto L71
            ug.v0 r1 = r0.f35669f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            ug.n1.m14085m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            ug.t0 r1 = r1.f35862f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            java.lang.String r6 = "Failed to insert column (got -1). appId"
            ug.u0 r9 = ug.v0.m14157U(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            r1.m14142c(r6, r9, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> L6f
            goto Lbd
        L6d:
            r14 = move-exception
            goto Lc1
        L6f:
            r1 = move-exception
            goto Lac
        L71:
            r9 = r4
        L72:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r11, r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r11 = 1
            long r11 = r11 + r9
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.put(r2, r11)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r11 = "app_id = ?"
            java.lang.String[] r12 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = r3.update(r6, r1, r11, r12)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            long r11 = (long) r1     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 != 0) goto La6
            ug.v0 r1 = r0.f35669f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            ug.n1.m14085m(r1)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            ug.t0 r1 = r1.f35862f     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            java.lang.String r4 = "Failed to update column (got 0). appId"
            ug.u0 r5 = ug.v0.m14157U(r14)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r1.m14142c(r4, r5, r2)     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            goto Lbd
        La4:
            r1 = move-exception
            goto Lab
        La6:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6d android.database.sqlite.SQLiteException -> La4
            r7 = r9
            goto Lbd
        Lab:
            r4 = r9
        Lac:
            ug.v0 r0 = r0.f35669f     // Catch: java.lang.Throwable -> L6d
            ug.n1.m14085m(r0)     // Catch: java.lang.Throwable -> L6d
            ug.t0 r0 = r0.f35862f     // Catch: java.lang.Throwable -> L6d
            java.lang.String r6 = "Error inserting column. appId"
            ug.u0 r14 = ug.v0.m14157U(r14)     // Catch: java.lang.Throwable -> L6d
            r0.m14143d(r6, r14, r2, r1)     // Catch: java.lang.Throwable -> L6d
            r7 = r4
        Lbd:
            r3.endTransaction()
            return r7
        Lc1:
            r3.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.a0(java.lang.String):long");
    }

    public final boolean b0(String str, String str2) {
        return w0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long c0(String str) {
        AbstractC6840z.m13033d(str);
        return x0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void d0(String str, Long l9, long j6, com.google.android.gms.internal.measurement.c3 c3Var) {
        mo325M();
        m13858N();
        AbstractC6840z.m13036g(c3Var);
        AbstractC6840z.m13033d(str);
        n1 n1Var = (n1) this.f482a;
        byte[] bArrM3669a = c3Var.m3669a();
        v0 v0Var = n1Var.f35669f;
        v0 v0Var2 = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35870p.m14142c("Saving complex main event, appId, data size", n1Var.f35673k.m14113a(str), Integer.valueOf(bArrM3669a.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l9);
        contentValues.put("children_to_process", Long.valueOf(j6));
        contentValues.put("main_event", bArrM3669a);
        try {
            if (B0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14141b(v0.m14157U(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e2) {
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Error storing complex main event. appId", v0.m14157U(str), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:94:0x0281, B:96:0x029c), top: B:107:0x0281 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.e0(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.y1 f0(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f482a
            ug.n1 r0 = (ug.n1) r0
            sf.AbstractC6840z.m13036g(r5)
            r4.mo325M()
            r4.m13858N()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r1 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r4.B0()     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            android.database.Cursor r5 = r3.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> L47 android.database.sqlite.SQLiteException -> L4a
            boolean r1 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            if (r1 != 0) goto L36
            ug.v0 r1 = r0.f35669f     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ug.n1.m14085m(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ug.t0 r1 = r1.f35870p     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            java.lang.String r3 = "No data found"
            r1.m14140a(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
        L2e:
            r5.close()
            goto L5c
        L32:
            r0 = move-exception
            goto L45
        L34:
            r1 = move-exception
            goto L4d
        L36:
            r1 = 0
            java.lang.String r1 = r5.getString(r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            r3 = 1
            int r3 = r5.getInt(r3)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            ug.y1 r2 = ug.y1.m14206c(r3, r1)     // Catch: java.lang.Throwable -> L32 android.database.sqlite.SQLiteException -> L34
            goto L2e
        L45:
            r2 = r5
            goto L62
        L47:
            r5 = move-exception
            r0 = r5
            goto L62
        L4a:
            r5 = move-exception
            r1 = r5
            r5 = r2
        L4d:
            ug.v0 r0 = r0.f35669f     // Catch: java.lang.Throwable -> L32
            ug.n1.m14085m(r0)     // Catch: java.lang.Throwable -> L32
            ug.t0 r0 = r0.f35862f     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "Error querying database."
            r0.m14141b(r1, r3)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L5c
            goto L2e
        L5c:
            if (r2 != 0) goto L61
            ug.y1 r5 = ug.y1.f35951c
            return r5
        L61:
            return r2
        L62:
            if (r2 == 0) goto L67
            r2.close()
        L67:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.f0(java.lang.String):ug.y1");
    }

    public final void g0(String str, w3 w3Var) {
        mo325M();
        m13858N();
        AbstractC6840z.m13033d(str);
        n1 n1Var = (n1) this.f482a;
        C8946a c8946a = n1Var.f35674l;
        v0 v0Var = n1Var.f35669f;
        c8946a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        e0 e0Var = f0.f44830v0;
        long jLongValue = jCurrentTimeMillis - ((Long) e0Var.m13872a(null)).longValue();
        long j6 = w3Var.f35893b;
        if (j6 < jLongValue || j6 > ((Long) e0Var.m13872a(null)).longValue() + jCurrentTimeMillis) {
            n1.m14085m(v0Var);
            v0Var.f35865j.m14143d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", v0.m14157U(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j6));
        }
        n1.m14085m(v0Var);
        v0Var.f35870p.m14140a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", w3Var.f35892a);
        contentValues.put("source", Integer.valueOf(w3Var.f35894c));
        contentValues.put("timestamp_millis", Long.valueOf(j6));
        try {
            if (B0().insert("trigger_uris", null, contentValues) == -1) {
                n1.m14085m(v0Var);
                v0Var.f35862f.m14141b(v0.m14157U(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e2) {
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Error storing trigger URI. appId", v0.m14157U(str), e2);
        }
    }

    public final void h0(String str, y1 y1Var) {
        AbstractC6840z.m13036g(str);
        AbstractC6840z.m13036g(y1Var);
        mo325M();
        m13858N();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", y1Var.m14212g());
        contentValues.put("consent_source", Integer.valueOf(y1Var.f35953b));
        j0(contentValues);
    }

    public final String i0(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e2) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14142c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void j0(ContentValues contentValues) {
        n1 n1Var = (n1) this.f482a;
        try {
            SQLiteDatabase sQLiteDatabaseB0 = B0();
            if (contentValues.getAsString("app_id") == null) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35864h.m14141b(v0.m14157U("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (sQLiteDatabaseB0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && sQLiteDatabaseB0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                v0 v0Var2 = n1Var.f35669f;
                n1.m14085m(v0Var2);
                v0Var2.f35862f.m14142c("Failed to insert/update table (got -1). key", v0.m14157U("consent_settings"), v0.m14157U("app_id"));
            }
        } catch (SQLiteException e2) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35862f.m14143d("Error storing into table. key", v0.m14157U("consent_settings"), v0.m14157U("app_id"), e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ug.C7447r k0(java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.k0(java.lang.String, java.lang.String, java.lang.String):ug.r");
    }

    public final void l0(String str, C7447r c7447r) {
        n1 n1Var = (n1) this.f482a;
        AbstractC6840z.m13036g(c7447r);
        mo325M();
        m13858N();
        ContentValues contentValues = new ContentValues();
        String str2 = c7447r.f35794a;
        contentValues.put("app_id", str2);
        contentValues.put(IMAPStore.ID_NAME, c7447r.f35795b);
        contentValues.put("lifetime_count", Long.valueOf(c7447r.f35796c));
        contentValues.put("current_bundle_count", Long.valueOf(c7447r.f35797d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c7447r.f35799f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c7447r.f35800g));
        contentValues.put("last_bundled_day", c7447r.f35801h);
        contentValues.put("last_sampled_complex_event_id", c7447r.f35802i);
        contentValues.put("last_sampling_rate", c7447r.f35803j);
        contentValues.put("current_session_count", Long.valueOf(c7447r.f35798e));
        Boolean bool = c7447r.f35804k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (B0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                v0 v0Var = n1Var.f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14141b(v0.m14157U(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e2) {
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35862f.m14142c("Error storing event aggregates. appId", v0.m14157U(str2), e2);
        }
    }

    public final void m0(String str, String str2) {
        AbstractC6840z.m13033d(str2);
        mo325M();
        m13858N();
        try {
            B0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e2) {
            v0 v0Var = ((n1) this.f482a).f35669f;
            n1.m14085m(v0Var);
            v0Var.f35862f.m14142c("Error deleting snapshot. appId", v0.m14157U(str2), e2);
        }
    }

    public final i4 n0(String str, long j6, byte[] bArr, String str2, String str3, int i10, int i11, long j10, long j11, long j12) {
        n1 n1Var = (n1) this.f482a;
        if (TextUtils.isEmpty(str2)) {
            v0 v0Var = n1Var.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35869n.m14140a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.h3 h3Var = (com.google.android.gms.internal.measurement.h3) y0.z0(com.google.android.gms.internal.measurement.i3.m3315w(), bArr);
            w2 w2VarZzb = w2.zzb(i10);
            if (w2VarZzb != w2.GOOGLE_SIGNAL && w2VarZzb != w2.GOOGLE_SIGNAL_PENDING && i11 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.i3) h3Var.f6231b).m3322p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.j3 j3Var = (com.google.android.gms.internal.measurement.j3) ((com.google.android.gms.internal.measurement.k3) it.next()).m3340i();
                    j3Var.m3303b();
                    ((com.google.android.gms.internal.measurement.k3) j3Var.f6231b).T0(i11);
                    arrayList.add((com.google.android.gms.internal.measurement.k3) j3Var.m3306e());
                }
                h3Var.m3303b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f6231b).m3318B();
                h3Var.m3303b();
                ((com.google.android.gms.internal.measurement.i3) h3Var.f6231b).m3317A(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                String[] strArrSplit = str3.split("\r\n");
                int length = strArrSplit.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    String str4 = strArrSplit[i12];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit2 = str4.split("=", 2);
                    if (strArrSplit2.length != 2) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14141b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit2[0], strArrSplit2[1]);
                    i12++;
                }
            }
            return new i4(j6, (com.google.android.gms.internal.measurement.i3) h3Var.m3306e(), str2, map, w2VarZzb, j10, j11, j12, i11);
        } catch (IOException e2) {
            v0 v0Var3 = n1Var.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35862f.m14142c("Failed to queued MeasurementBatch from upload_queue. appId", str, e2);
            return null;
        }
    }

    public final String o0() {
        ((n1) this.f482a).f35674l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        w2 w2Var = w2.GOOGLE_SIGNAL;
        int iZza = w2Var.zza();
        Long l9 = (Long) f0.f35398S.m13872a(null);
        l9.getClass();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l9 + ")";
        String str2 = "(upload_type != " + w2Var.zza() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) f0.f35397R.m13872a(null)).longValue() + ")";
        StringBuilder sb2 = new StringBuilder(AbstractC4801l.m9725C(str.length(), 5, str2.length(), 1));
        p020v.a1.m14319B(sb2, "(", str, " OR ", str2);
        sb2.append(")");
        return sb2.toString();
    }

    public final void q0(String str, y1 y1Var) {
        AbstractC6840z.m13036g(str);
        mo325M();
        m13858N();
        h0(str, f0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", y1Var.m14212g());
        j0(contentValues);
    }

    public final y1 r0(String str) {
        AbstractC6840z.m13036g(str);
        mo325M();
        m13858N();
        return y1.m14206c(100, i0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final C7447r s0(String str, com.google.android.gms.internal.measurement.c3 c3Var, String str2) {
        C7447r c7447rK0 = k0("events", str, c3Var.m3201s());
        if (c7447rK0 != null) {
            long j6 = c7447rK0.f35798e + 1;
            long j10 = c7447rK0.f35797d + 1;
            return new C7447r(c7447rK0.f35794a, c7447rK0.f35795b, c7447rK0.f35796c + 1, j10, j6, c7447rK0.f35799f, c7447rK0.f35800g, c7447rK0.f35801h, c7447rK0.f35802i, c7447rK0.f35803j, c7447rK0.f35804k);
        }
        n1 n1Var = (n1) this.f482a;
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35865j.m14142c("Event aggregate wasn't created during raw event logging. appId, event", v0.m14157U(str), n1Var.f35673k.m14113a(str2));
        return new C7447r(str, c3Var.m3201s(), 1L, 1L, 1L, c3Var.m3203u(), 0L, null, null, null, null);
    }

    public final boolean t0() {
        return ((n1) this.f482a).f35664a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: all -> 0x007a, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #7 {all -> 0x007a, blocks: (B:15:0x0066, B:18:0x006e, B:19:0x0072, B:45:0x00d0, B:47:0x00f8, B:48:0x010a, B:49:0x010e, B:50:0x011e, B:52:0x0124, B:53:0x0134, B:56:0x0147, B:68:0x016e, B:71:0x0176, B:77:0x0195, B:61:0x015d, B:75:0x0187, B:76:0x0190, B:98:0x0221, B:40:0x00c0, B:43:0x00c8), top: B:121:0x0026 }] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(java.lang.String r21, long r22, long r24, ia.C3220l r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.C7443n.u0(java.lang.String, long, long, ia.l):void");
    }

    public final long w0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = B0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j6 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j6;
            } catch (SQLiteException e2) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14142c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    public final long x0(String str, String[] strArr, long j6) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = B0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j6 = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j6;
            } catch (SQLiteException e2) {
                v0 v0Var = ((n1) this.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14142c("Database error", str, e2);
                throw e2;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    public final void y0() {
        m13858N();
        B0().beginTransaction();
    }

    public final void z0() {
        m13858N();
        B0().setTransactionSuccessful();
    }

    @Override // ug.c4
    /* renamed from: P */
    public final void mo13847P() {
    }
}
