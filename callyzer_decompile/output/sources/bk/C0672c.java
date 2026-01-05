package bk;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.sun.mail.util.AbstractC1452a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.c */
/* loaded from: classes.dex */
public final class C0672c {

    /* renamed from: a */
    public final LinkedHashSet f4235a;

    /* renamed from: b */
    public final HttpURLConnection f4236b;

    /* renamed from: c */
    public final C0681l f4237c;

    /* renamed from: d */
    public final C0674e f4238d;

    /* renamed from: e */
    public final C0684o f4239e;

    /* renamed from: f */
    public final ScheduledExecutorService f4240f;

    /* renamed from: g */
    public final Random f4241g = new Random();

    /* renamed from: h */
    public final C8946a f4242h = C8946a.f42951a;

    /* renamed from: i */
    public final C0687r f4243i;

    public C0672c(HttpURLConnection httpURLConnection, C0681l c0681l, C0674e c0674e, LinkedHashSet linkedHashSet, C0684o c0684o, ScheduledExecutorService scheduledExecutorService, C0687r c0687r) {
        this.f4236b = httpURLConnection;
        this.f4237c = c0681l;
        this.f4238d = c0674e;
        this.f4235a = linkedHashSet;
        this.f4239e = c0684o;
        this.f4240f = scheduledExecutorService;
        this.f4243i = c0687r;
    }

    /* renamed from: a */
    public final void m1942a(int i10, long j6) {
        if (i10 == 0) {
            FirebaseRemoteConfigException.EnumC1402a enumC1402a = FirebaseRemoteConfigException.EnumC1402a.UNKNOWN;
            m1944c(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f4240f.schedule(new RunnableC0671b(this, i10, j6), this.f4241g.nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public final void m1943b(InputStream inputStream) throws JSONException, IOException {
        JSONObject jSONObject;
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strM4561h = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strM4561h = AbstractC1452a.m4561h(strM4561h, line);
            if (line.contains("}")) {
                int iIndexOf = strM4561h.indexOf(123);
                int iLastIndexOf = strM4561h.lastIndexOf(125);
                strM4561h = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strM4561h.substring(iIndexOf, iLastIndexOf + 1);
                if (!strM4561h.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(strM4561h);
                    } catch (JSONException e2) {
                        Throwable cause = e2.getCause();
                        FirebaseRemoteConfigException.EnumC1402a enumC1402a = FirebaseRemoteConfigException.EnumC1402a.UNKNOWN;
                        m1944c(new FirebaseRemoteConfigClientException("Unable to parse config update message.", cause));
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        C0684o c0684o = this.f4239e;
                        FirebaseRemoteConfigException.EnumC1402a enumC1402a2 = FirebaseRemoteConfigException.EnumC1402a.UNKNOWN;
                        c0684o.m1963a(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                        break;
                    }
                    synchronized (this) {
                        zIsEmpty = this.f4235a.isEmpty();
                    }
                    if (zIsEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j6 = this.f4237c.f4283g.f4316a.getLong("last_template_version", 0L);
                        long j10 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j10 > j6) {
                            m1942a(3, j10);
                        }
                    }
                    if (jSONObject.has("retryIntervalSeconds")) {
                        m1945d(jSONObject.getInt("retryIntervalSeconds"));
                    }
                    strM4561h = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
    }

    /* renamed from: c */
    public final synchronized void m1944c(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f4235a.iterator();
        while (it.hasNext()) {
            ((C0684o) it.next()).m1963a(firebaseRemoteConfigException);
        }
    }

    /* renamed from: d */
    public final synchronized void m1945d(int i10) {
        this.f4242h.getClass();
        Date date = new Date(new Date(System.currentTimeMillis()).getTime() + (i10 * 1000));
        C0687r c0687r = this.f4243i;
        synchronized (c0687r.f4319d) {
            c0687r.f4316a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
