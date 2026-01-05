package bk;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ji.C3773g;
import p020v.a1;
import rj.InterfaceC6558d;
import zf.C8946a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bk.p */
/* loaded from: classes.dex */
public final class C0685p {

    /* renamed from: r */
    public static final int[] f4293r = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: s */
    public static final Pattern f4294s = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final LinkedHashSet f4295a;

    /* renamed from: c */
    public int f4297c;

    /* renamed from: f */
    public HttpURLConnection f4300f;

    /* renamed from: g */
    public final ScheduledExecutorService f4301g;

    /* renamed from: h */
    public final C0681l f4302h;

    /* renamed from: i */
    public final C3773g f4303i;

    /* renamed from: j */
    public final InterfaceC6558d f4304j;

    /* renamed from: k */
    public final C0674e f4305k;

    /* renamed from: l */
    public final Context f4306l;

    /* renamed from: p */
    public final C0687r f4310p;

    /* renamed from: b */
    public boolean f4296b = false;

    /* renamed from: n */
    public final Random f4308n = new Random();

    /* renamed from: o */
    public final C8946a f4309o = C8946a.f42951a;

    /* renamed from: m */
    public final String f4307m = "firebase";

    /* renamed from: d */
    public boolean f4298d = false;

    /* renamed from: e */
    public boolean f4299e = false;

    /* renamed from: q */
    public final Object f4311q = new Object();

    public C0685p(C3773g c3773g, InterfaceC6558d interfaceC6558d, C0681l c0681l, C0674e c0674e, Context context, LinkedHashSet linkedHashSet, C0687r c0687r, ScheduledExecutorService scheduledExecutorService) {
        this.f4295a = linkedHashSet;
        this.f4301g = scheduledExecutorService;
        this.f4297c = Math.max(8 - c0687r.m1978c().f4312a, 1);
        this.f4303i = c3773g;
        this.f4302h = c0681l;
        this.f4304j = interfaceC6558d;
        this.f4305k = c0674e;
        this.f4306l = context;
        this.f4310p = c0687r;
    }

    /* renamed from: d */
    public static boolean m1965d(int i10) {
        return i10 == 408 || i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    /* renamed from: f */
    public static String m1966f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(line);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m1967a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f4295a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f4296b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f4298d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f4299e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.C0685p.m1967a():boolean");
    }

    /* renamed from: b */
    public final void m1968b(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.f4300f;
        if (httpURLConnection != null && !this.f4299e) {
            httpURLConnection.disconnect();
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* renamed from: c */
    public final String m1969c(String str) {
        C3773g c3773g = this.f4303i;
        c3773g.m8293a();
        Matcher matcher = f4294s.matcher(c3773g.f19664c.f19678b);
        return a1.m14333m("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* renamed from: e */
    public final synchronized void m1970e(long j6) {
        try {
            if (m1967a()) {
                int i10 = this.f4297c;
                if (i10 > 0) {
                    this.f4297c = i10 - 1;
                    this.f4301g.schedule(new RunnableC0683n(0, this), j6, TimeUnit.MILLISECONDS);
                } else if (!this.f4299e) {
                    FirebaseRemoteConfigException.EnumC1402a enumC1402a = FirebaseRemoteConfigException.EnumC1402a.UNKNOWN;
                    m1971g(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again."));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: g */
    public final synchronized void m1971g(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f4295a.iterator();
        while (it.hasNext()) {
            ((C0684o) it.next()).m1963a(firebaseRemoteConfigException);
        }
    }

    /* renamed from: h */
    public final synchronized void m1972h() {
        this.f4309o.getClass();
        m1970e(Math.max(0L, this.f4310p.m1978c().f4313b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1973i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            ji.g r9 = r6.f4303i
            r9.m8293a()
            ji.i r0 = r9.f19664c
            java.lang.String r1 = r0.f19677a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f4306l
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            r2 = 0
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            byte[] r3 = zf.AbstractC8947b.m16427d(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            if (r3 != 0) goto L33
            r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
        L31:
            r1 = r2
            goto L3c
        L33:
            java.lang.String r1 = zf.AbstractC8947b.m16424a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L38
            goto L3c
        L38:
            r1.getPackageName()
            goto L31
        L3c:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r3 = "true"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/json"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r3)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.m8293a()
            java.lang.String r3 = r0.f19678b
            java.util.regex.Pattern r4 = bk.C0685p.f4294s
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L76
            r2 = 1
            java.lang.String r2 = r3.group(r2)
        L76:
            java.lang.String r3 = "project"
            r1.put(r3, r2)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f4307m
            r1.put(r2, r3)
            bk.l r2 = r6.f4302h
            bk.r r2 = r2.f4283g
            android.content.SharedPreferences r2 = r2.f4316a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.m8293a()
            java.lang.String r9 = r0.f19678b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "23.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.C0685p.m1973i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* renamed from: j */
    public final synchronized C0672c m1974j(HttpURLConnection httpURLConnection) {
        return new C0672c(httpURLConnection, this.f4302h, this.f4305k, this.f4295a, new C0684o(0, this), this.f4301g, this.f4310p);
    }

    /* renamed from: k */
    public final void m1975k(Date date) {
        C0687r c0687r = this.f4310p;
        int i10 = c0687r.m1978c().f4312a + 1;
        c0687r.m1980e(i10, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f4293r[(i10 < 8 ? i10 : 8) - 1]) / 2) + this.f4308n.nextInt((int) r2)));
    }
}
