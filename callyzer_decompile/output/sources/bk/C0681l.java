package bk;

import a1.C0004c;
import android.text.format.DateUtils;
import com.google.android.gms.internal.measurement.l1;
import com.google.firebase.installations.C1401a;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import ni.C5074c;
import ni.InterfaceC5073b;
import org.json.JSONException;
import pg.l8;
import qj.InterfaceC6237b;
import rj.InterfaceC6558d;
import yg.C8656m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.l */
/* loaded from: classes.dex */
public final class C0681l {

    /* renamed from: i */
    public static final long f4275i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j */
    public static final int[] f4276j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a */
    public final InterfaceC6558d f4277a;

    /* renamed from: b */
    public final InterfaceC6237b f4278b;

    /* renamed from: c */
    public final Executor f4279c;

    /* renamed from: d */
    public final Random f4280d;

    /* renamed from: e */
    public final C0674e f4281e;

    /* renamed from: f */
    public final ConfigFetchHttpClient f4282f;

    /* renamed from: g */
    public final C0687r f4283g;

    /* renamed from: h */
    public final Map f4284h;

    public C0681l(InterfaceC6558d interfaceC6558d, InterfaceC6237b interfaceC6237b, Executor executor, Random random, C0674e c0674e, ConfigFetchHttpClient configFetchHttpClient, C0687r c0687r, HashMap map) {
        this.f4277a = interfaceC6558d;
        this.f4278b = interfaceC6237b;
        this.f4279c = executor;
        this.f4280d = random;
        this.f4281e = c0674e;
        this.f4282f = configFetchHttpClient;
        this.f4283g = c0687r;
        this.f4284h = map;
    }

    /* renamed from: a */
    public final C0679j m1956a(String str, String str2, Date date, HashMap map) throws JSONException, NoSuchAlgorithmException, IOException, FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionM4494b = this.f4282f.m4494b();
            ConfigFetchHttpClient configFetchHttpClient = this.f4282f;
            HashMap mapM1959d = m1959d();
            String string = this.f4283g.f4316a.getString("last_fetch_etag", null);
            InterfaceC5073b interfaceC5073b = (InterfaceC5073b) this.f4278b.get();
            C0679j c0679jFetch = configFetchHttpClient.fetch(httpURLConnectionM4494b, str, str2, mapM1959d, string, map, interfaceC5073b != null ? (Long) ((l1) ((C5074c) interfaceC5073b).f24884a.f20704b).m3480a(null, null, true).get("_fot") : null, date, this.f4283g.m1977b());
            C0676g c0676g = c0679jFetch.f4273b;
            if (c0676g != null) {
                C0687r c0687r = this.f4283g;
                long j6 = c0676g.f4262f;
                synchronized (c0687r.f4317b) {
                    c0687r.f4316a.edit().putLong("last_template_version", j6).apply();
                }
            }
            String str4 = c0679jFetch.f4274c;
            if (str4 != null) {
                C0687r c0687r2 = this.f4283g;
                synchronized (c0687r2.f4317b) {
                    c0687r2.f4316a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f4283g.m1979d(0, C0687r.f4315f);
            return c0679jFetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            int i10 = e2.f7174a;
            C0687r c0687r3 = this.f4283g;
            if (i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504) {
                int i11 = c0687r3.m1976a().f4312a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f4276j;
                c0687r3.m1979d(i11, new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i11, iArr.length) - 1]) / 2) + this.f4280d.nextInt((int) r3)));
            }
            C0686q c0686qM1976a = c0687r3.m1976a();
            int i12 = e2.f7174a;
            if (c0686qM1976a.f4312a > 1 || i12 == 429) {
                c0686qM1976a.f4313b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i12 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i12 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i12 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i12 != 500) {
                    switch (i12) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e2.f7174a, "Fetch failed: ".concat(str3), e2);
        }
    }

    /* renamed from: b */
    public final C8656m m1957b(C8656m c8656m, long j6, HashMap map) {
        C8656m c8656mM15981h;
        Date date = new Date(System.currentTimeMillis());
        boolean zM15985l = c8656m.m15985l();
        C0687r c0687r = this.f4283g;
        if (zM15985l) {
            Date date2 = new Date(c0687r.f4316a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(C0687r.f4314e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j6) + date2.getTime()))) {
                return l8.m11765f(new C0679j(2, null, null));
            }
        }
        Date date3 = c0687r.m1976a().f4313b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f4279c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            c8656mM15981h = l8.m11764e(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            C1401a c1401a = (C1401a) this.f4277a;
            C8656m c8656mM4471c = c1401a.m4471c();
            C8656m c8656mM4472d = c1401a.m4472d();
            c8656mM15981h = l8.m11767h(c8656mM4471c, c8656mM4472d).m15981h(executor, new C0678i(this, c8656mM4471c, c8656mM4472d, date, map));
        }
        return c8656mM15981h.m15981h(executor, new C0004c(5, this, date));
    }

    /* renamed from: c */
    public final C8656m m1958c(EnumC0680k enumC0680k, int i10) {
        HashMap map = new HashMap(this.f4284h);
        map.put("X-Firebase-RC-Fetch-Type", enumC0680k.getValue() + "/" + i10);
        return this.f4281e.m1948b().m15981h(this.f4279c, new C0004c(4, this, map));
    }

    /* renamed from: d */
    public final HashMap m1959d() {
        HashMap map = new HashMap();
        InterfaceC5073b interfaceC5073b = (InterfaceC5073b) this.f4278b.get();
        if (interfaceC5073b != null) {
            for (Map.Entry entry : ((l1) ((C5074c) interfaceC5073b).f24884a.f20704b).m3480a(null, null, false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
