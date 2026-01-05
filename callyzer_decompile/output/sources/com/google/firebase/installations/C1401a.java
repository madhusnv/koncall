package com.google.firebase.installations;

import android.net.TrafficStats;
import c9.C0927v;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import ji.C3773g;
import org.json.JSONException;
import org.json.JSONObject;
import pg.l8;
import qi.C6221d;
import qi.C6230m;
import qj.InterfaceC6237b;
import ri.ExecutorC6553k;
import rj.AbstractC6557c;
import rj.C6559e;
import rj.C6560f;
import rj.C6561g;
import rj.C6563i;
import rj.InterfaceC6558d;
import rj.InterfaceC6562h;
import rj.RunnableC6556b;
import sf.AbstractC6840z;
import sj.C6849a;
import sj.C6850b;
import sj.C6851c;
import sj.EnumC6852d;
import tj.C7165a;
import tj.C7166b;
import tj.C7167c;
import tj.C7169e;
import tj.EnumC7168d;
import tj.EnumC7170f;
import ug.C7455z;
import yg.C8650g;
import yg.C8656m;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.firebase.installations.a */
/* loaded from: classes.dex */
public final class C1401a implements InterfaceC6558d {

    /* renamed from: m */
    public static final Object f7144m = new Object();

    /* renamed from: a */
    public final C3773g f7145a;

    /* renamed from: b */
    public final C7167c f7146b;

    /* renamed from: c */
    public final C8849i f7147c;

    /* renamed from: d */
    public final C6563i f7148d;

    /* renamed from: e */
    public final C6230m f7149e;

    /* renamed from: f */
    public final C6561g f7150f;

    /* renamed from: g */
    public final Object f7151g;

    /* renamed from: h */
    public final ExecutorService f7152h;

    /* renamed from: i */
    public final ExecutorC6553k f7153i;

    /* renamed from: j */
    public String f7154j;

    /* renamed from: k */
    public final HashSet f7155k;

    /* renamed from: l */
    public final ArrayList f7156l;

    static {
        new AtomicInteger(1);
    }

    public C1401a(C3773g c3773g, InterfaceC6237b interfaceC6237b, ExecutorService executorService, ExecutorC6553k executorC6553k) {
        c3773g.m8293a();
        C7167c c7167c = new C7167c(c3773g.f19662a, interfaceC6237b);
        C8849i c8849i = new C8849i(c3773g);
        if (C7455z.f35978w == null) {
            C7455z.f35978w = new C7455z(18);
        }
        C7455z c7455z = C7455z.f35978w;
        if (C6563i.f31421d == null) {
            C6563i.f31421d = new C6563i(c7455z);
        }
        C6563i c6563i = C6563i.f31421d;
        C6230m c6230m = new C6230m(new C6221d(2, c3773g));
        C6561g c6561g = new C6561g();
        this.f7151g = new Object();
        this.f7155k = new HashSet();
        this.f7156l = new ArrayList();
        this.f7145a = c3773g;
        this.f7146b = c7167c;
        this.f7147c = c8849i;
        this.f7148d = c6563i;
        this.f7149e = c6230m;
        this.f7150f = c6561g;
        this.f7152h = executorService;
        this.f7153i = executorC6553k;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: a */
    public final void m4469a() {
        C6850b c6850bM16313D;
        synchronized (f7144m) {
            try {
                C3773g c3773g = this.f7145a;
                c3773g.m8293a();
                C0927v c0927vM2697d = C0927v.m2697d(c3773g.f19662a);
                try {
                    c6850bM16313D = this.f7147c.m16313D();
                    EnumC6852d enumC6852d = c6850bM16313D.f32523b;
                    if (enumC6852d == EnumC6852d.NOT_GENERATED || enumC6852d == EnumC6852d.ATTEMPT_MIGRATION) {
                        String strM4474f = m4474f(c6850bM16313D);
                        C8849i c8849i = this.f7147c;
                        C6849a c6849aM13049a = c6850bM16313D.m13049a();
                        c6849aM13049a.f32513a = strM4474f;
                        c6849aM13049a.m13048b(EnumC6852d.UNREGISTERED);
                        c6850bM16313D = c6849aM13049a.m13047a();
                        c8849i.m16323v(c6850bM16313D);
                    }
                    if (c0927vM2697d != null) {
                        c0927vM2697d.m2706o();
                    }
                } catch (Throwable th2) {
                    if (c0927vM2697d != null) {
                        c0927vM2697d.m2706o();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        m4477i(c6850bM16313D);
        this.f7153i.execute(new RunnableC6556b(this, 2));
    }

    /* renamed from: b */
    public final C6850b m4470b(C6850b c6850b) throws FirebaseInstallationsException {
        int i10;
        int responseCode;
        C7166b c7166b;
        C7166b c7166bM13430f;
        C7167c c7167c = this.f7146b;
        C3773g c3773g = this.f7145a;
        c3773g.m8293a();
        String str = c3773g.f19664c.f19677a;
        String str2 = c6850b.f32522a;
        C3773g c3773g2 = this.f7145a;
        c3773g2.m8293a();
        String str3 = c3773g2.f19664c.f19683g;
        String str4 = c6850b.f32525d;
        C7169e c7169e = c7167c.f34427c;
        if (!c7169e.m13435a()) {
            FirebaseInstallationsException.EnumC1400a enumC1400a = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM13426a = C7167c.m13426a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i11 = 0; i11 <= 1; i11 = i10 + 1) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM13434c = c7167c.m13434c(urlM13426a, str);
            try {
                try {
                    httpURLConnectionM13434c.setRequestMethod("POST");
                    httpURLConnectionM13434c.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionM13434c.setDoOutput(true);
                    C7167c.m13432h(httpURLConnectionM13434c);
                    responseCode = httpURLConnectionM13434c.getResponseCode();
                    c7169e.m13436b(responseCode);
                } finally {
                    httpURLConnectionM13434c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
                i10 = i11;
            }
            if (responseCode >= 200 && responseCode < 300) {
                c7166bM13430f = C7167c.m13430f(httpURLConnectionM13434c);
            } else {
                C7167c.m13427b(httpURLConnectionM13434c, null, str, str3);
                i10 = i11;
                if (responseCode == 401 || responseCode == 404) {
                    byte b10 = (byte) (0 | 1);
                    EnumC7170f enumC7170f = EnumC7170f.AUTH_ERROR;
                    if (b10 != 1) {
                        throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                    }
                    c7166b = new C7166b(null, 0L, enumC7170f);
                    httpURLConnectionM13434c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c7166bM13430f = c7166b;
                } else {
                    if (responseCode == 429) {
                        FirebaseInstallationsException.EnumC1400a enumC1400a2 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        byte b11 = (byte) (0 | 1);
                        EnumC7170f enumC7170f2 = EnumC7170f.BAD_CONFIG;
                        if (b11 != 1) {
                            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                        }
                        c7166b = new C7166b(null, 0L, enumC7170f2);
                        httpURLConnectionM13434c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c7166bM13430f = c7166b;
                    }
                }
            }
            int i12 = AbstractC6557c.f31413b[c7166bM13430f.f34422c.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    C6849a c6849aM13049a = c6850b.m13049a();
                    c6849aM13049a.f32519g = "BAD CONFIG";
                    c6849aM13049a.m13048b(EnumC6852d.REGISTER_ERROR);
                    return c6849aM13049a.m13047a();
                }
                if (i12 != 3) {
                    FirebaseInstallationsException.EnumC1400a enumC1400a3 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f7154j = null;
                }
                C6849a c6849aM13049a2 = c6850b.m13049a();
                c6849aM13049a2.m13048b(EnumC6852d.NOT_GENERATED);
                return c6849aM13049a2.m13047a();
            }
            String str5 = c7166bM13430f.f34420a;
            long j6 = c7166bM13430f.f34421b;
            C6563i c6563i = this.f7148d;
            c6563i.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c6563i.f31422a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C6849a c6849aM13049a3 = c6850b.m13049a();
            c6849aM13049a3.f32515c = str5;
            c6849aM13049a3.f32517e = j6;
            byte b12 = (byte) (c6849aM13049a3.f32520h | 1);
            c6849aM13049a3.f32518f = seconds;
            c6849aM13049a3.f32520h = (byte) (b12 | 2);
            return c6849aM13049a3.m13047a();
        }
        FirebaseInstallationsException.EnumC1400a enumC1400a4 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* renamed from: c */
    public final C8656m m4471c() {
        String str;
        m4473e();
        synchronized (this) {
            str = this.f7154j;
        }
        if (str != null) {
            return l8.m11765f(str);
        }
        C8650g c8650g = new C8650g();
        C6560f c6560f = new C6560f(c8650g);
        synchronized (this.f7151g) {
            this.f7156l.add(c6560f);
        }
        C8656m c8656m = c8650g.f41930a;
        this.f7152h.execute(new RunnableC6556b(this, 0));
        return c8656m;
    }

    /* renamed from: d */
    public final C8656m m4472d() {
        m4473e();
        C8650g c8650g = new C8650g();
        C6559e c6559e = new C6559e(this.f7148d, c8650g);
        synchronized (this.f7151g) {
            this.f7156l.add(c6559e);
        }
        C8656m c8656m = c8650g.f41930a;
        this.f7152h.execute(new RunnableC6556b(this, 1));
        return c8656m;
    }

    /* renamed from: e */
    public final void m4473e() {
        C3773g c3773g = this.f7145a;
        c3773g.m8293a();
        AbstractC6840z.m13034e(c3773g.f19664c.f19678b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3773g.m8293a();
        AbstractC6840z.m13034e(c3773g.f19664c.f19683g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3773g.m8293a();
        AbstractC6840z.m13034e(c3773g.f19664c.f19677a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c3773g.m8293a();
        String str = c3773g.f19664c.f19678b;
        Pattern pattern = C6563i.f31420c;
        AbstractC6840z.m13030a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        c3773g.m8293a();
        AbstractC6840z.m13030a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C6563i.f31420c.matcher(c3773g.f19664c.f19677a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m4474f(sj.C6850b r6) {
        /*
            r5 = this;
            ji.g r0 = r5.f7145a
            r0.m8293a()
            java.lang.String r0 = r0.f19663b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            ji.g r0 = r5.f7145a
            java.lang.String r1 = "[DEFAULT]"
            r0.m8293a()
            java.lang.String r0 = r0.f19663b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5d
        L1e:
            sj.d r6 = r6.f32523b
            sj.d r0 = sj.EnumC6852d.ATTEMPT_MIGRATION
            if (r6 != r0) goto L5d
            qi.m r6 = r5.f7149e
            java.lang.Object r6 = r6.get()
            sj.c r6 = (sj.C6851c) r6
            android.content.SharedPreferences r0 = r6.f32530a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f32530a     // Catch: java.lang.Throwable -> L40
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L40
            android.content.SharedPreferences r2 = r6.f32530a     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L42
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r6 = move-exception
            goto L5b
        L42:
            java.lang.String r2 = r6.m13050a()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
        L47:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L57
            rj.g r6 = r5.f7150f
            r6.getClass()
            java.lang.String r6 = rj.C6561g.m12574a()
            return r6
        L57:
            return r2
        L58:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r6     // Catch: java.lang.Throwable -> L40
        L5b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            throw r6
        L5d:
            rj.g r6 = r5.f7150f
            r6.getClass()
            java.lang.String r6 = rj.C6561g.m12574a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C1401a.m4474f(sj.b):java.lang.String");
    }

    /* renamed from: g */
    public final C6850b m4475g(C6850b c6850b) throws FirebaseInstallationsException {
        int responseCode;
        C7165a c7165aM13429e;
        String str = c6850b.f32522a;
        String string = null;
        if (str != null && str.length() == 11) {
            C6851c c6851c = (C6851c) this.f7149e.get();
            synchronized (c6851c.f32530a) {
                try {
                    String[] strArr = C6851c.f32529c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str2 = strArr[i10];
                            String string2 = c6851c.f32530a.getString("|T|" + c6851c.f32531b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i10++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString(AWSCognitoLegacyCredentialStore.TOKEN_KEY);
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        C7167c c7167c = this.f7146b;
        C3773g c3773g = this.f7145a;
        c3773g.m8293a();
        String str3 = c3773g.f19664c.f19677a;
        String str4 = c6850b.f32522a;
        C3773g c3773g2 = this.f7145a;
        c3773g2.m8293a();
        String str5 = c3773g2.f19664c.f19683g;
        C3773g c3773g3 = this.f7145a;
        c3773g3.m8293a();
        String str6 = c3773g3.f19664c.f19678b;
        C7169e c7169e = c7167c.f34427c;
        if (!c7169e.m13435a()) {
            FirebaseInstallationsException.EnumC1400a enumC1400a = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM13426a = C7167c.m13426a("projects/" + str5 + "/installations");
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM13434c = c7167c.m13434c(urlM13426a, str3);
            try {
                try {
                    httpURLConnectionM13434c.setRequestMethod("POST");
                    httpURLConnectionM13434c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM13434c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C7167c.m13431g(httpURLConnectionM13434c, str4, str6);
                    responseCode = httpURLConnectionM13434c.getResponseCode();
                    c7169e.m13436b(responseCode);
                } finally {
                    httpURLConnectionM13434c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                c7165aM13429e = C7167c.m13429e(httpURLConnectionM13434c);
                httpURLConnectionM13434c.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                C7167c.m13427b(httpURLConnectionM13434c, str6, str3, str5);
                if (responseCode == 429) {
                    FirebaseInstallationsException.EnumC1400a enumC1400a2 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    C7165a c7165a = new C7165a(null, null, null, null, EnumC7168d.BAD_CONFIG);
                    httpURLConnectionM13434c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c7165aM13429e = c7165a;
                }
                httpURLConnectionM13434c.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int i12 = AbstractC6557c.f31412a[c7165aM13429e.f34419e.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    FirebaseInstallationsException.EnumC1400a enumC1400a3 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
                    throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
                }
                C6849a c6849aM13049a = c6850b.m13049a();
                c6849aM13049a.f32519g = "BAD CONFIG";
                c6849aM13049a.m13048b(EnumC6852d.REGISTER_ERROR);
                return c6849aM13049a.m13047a();
            }
            String str7 = c7165aM13429e.f34416b;
            String str8 = c7165aM13429e.f34417c;
            C6563i c6563i = this.f7148d;
            c6563i.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c6563i.f31422a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C7166b c7166b = c7165aM13429e.f34418d;
            String str9 = c7166b.f34420a;
            long j6 = c7166b.f34421b;
            C6849a c6849aM13049a2 = c6850b.m13049a();
            c6849aM13049a2.f32513a = str7;
            c6849aM13049a2.m13048b(EnumC6852d.REGISTERED);
            c6849aM13049a2.f32515c = str9;
            c6849aM13049a2.f32516d = str8;
            c6849aM13049a2.f32517e = j6;
            byte b10 = (byte) (c6849aM13049a2.f32520h | 1);
            c6849aM13049a2.f32518f = seconds;
            c6849aM13049a2.f32520h = (byte) (b10 | 2);
            return c6849aM13049a2.m13047a();
        }
        FirebaseInstallationsException.EnumC1400a enumC1400a4 = FirebaseInstallationsException.EnumC1400a.BAD_CONFIG;
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* renamed from: h */
    public final void m4476h(Exception exc) {
        synchronized (this.f7151g) {
            try {
                Iterator it = this.f7156l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6562h) it.next()).mo12572a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: i */
    public final void m4477i(C6850b c6850b) {
        synchronized (this.f7151g) {
            try {
                Iterator it = this.f7156l.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6562h) it.next()).mo12573b(c6850b)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
