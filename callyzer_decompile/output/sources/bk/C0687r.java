package bk;

import android.content.SharedPreferences;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.r */
/* loaded from: classes.dex */
public final class C0687r {

    /* renamed from: e */
    public static final Date f4314e = new Date(-1);

    /* renamed from: f */
    public static final Date f4315f = new Date(-1);

    /* renamed from: a */
    public final SharedPreferences f4316a;

    /* renamed from: b */
    public final Object f4317b = new Object();

    /* renamed from: c */
    public final Object f4318c = new Object();

    /* renamed from: d */
    public final Object f4319d = new Object();

    public C0687r(SharedPreferences sharedPreferences) {
        this.f4316a = sharedPreferences;
    }

    /* renamed from: a */
    public final C0686q m1976a() {
        C0686q c0686q;
        synchronized (this.f4318c) {
            int i10 = this.f4316a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f4316a.getLong("backoff_end_time_in_millis", -1L));
            c0686q = new C0686q();
            c0686q.f4312a = i10;
            c0686q.f4313b = date;
        }
        return c0686q;
    }

    /* renamed from: b */
    public final HashMap m1977b() {
        try {
            JSONObject jSONObject = new JSONObject(this.f4316a.getString("customSignals", "{}"));
            HashMap map = new HashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
            return map;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* renamed from: c */
    public final C0686q m1978c() {
        C0686q c0686q;
        synchronized (this.f4319d) {
            int i10 = this.f4316a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f4316a.getLong("realtime_backoff_end_time_in_millis", -1L));
            c0686q = new C0686q();
            c0686q.f4312a = i10;
            c0686q.f4313b = date;
        }
        return c0686q;
    }

    /* renamed from: d */
    public final void m1979d(int i10, Date date) {
        synchronized (this.f4318c) {
            this.f4316a.edit().putInt("num_failed_fetches", i10).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    /* renamed from: e */
    public final void m1980e(int i10, Date date) {
        synchronized (this.f4319d) {
            this.f4316a.edit().putInt("num_failed_realtime_streams", i10).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
