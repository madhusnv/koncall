package ug;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.sun.mail.imap.IMAPStore;
import java.util.ArrayDeque;
import java.util.Objects;
import ji.C3773g;
import ni.C5074c;
import ni.InterfaceC5073b;
import oi.AbstractC5387a;
import pg.v6;
import qi.RunnableC6224g;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class m2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    public final /* synthetic */ int f35617a;

    /* renamed from: b */
    public final Object f35618b;

    public m2(q2 q2Var) {
        this.f35617a = 0;
        this.f35618b = q2Var;
    }

    /* renamed from: a */
    public void m14060a(Intent intent) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f35618b;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    if (arrayDeque.contains(string)) {
                        return;
                    } else {
                        arrayDeque.add(string);
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException unused) {
        }
        if (bundle == null ? false : "1".equals(bundle.getString("google.c.a.e"))) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    InterfaceC5073b interfaceC5073b = (InterfaceC5073b) C3773g.m8291c().m8294b(InterfaceC5073b.class);
                    Log.isLoggable("FirebaseMessaging", 3);
                    if (interfaceC5073b != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        C5074c c5074c = (C5074c) interfaceC5073b;
                        if (AbstractC5387a.m11102a("fcm") && AbstractC5387a.m11104c("fcm", "_ln")) {
                            com.google.android.gms.internal.measurement.l1 l1Var = (com.google.android.gms.internal.measurement.l1) c5074c.f24884a.f20704b;
                            l1Var.m3482c(new com.google.android.gms.internal.measurement.x0(l1Var, string2, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        c5074c.m10007a("fcm", "_cmp", bundle2);
                    }
                } else {
                    Log.isLoggable("FirebaseMessaging", 3);
                }
            }
            v6.m11895c("_no", bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0005, B:5:0x0019, B:7:0x001f, B:22:0x0049, B:25:0x0050, B:27:0x0063, B:29:0x006b, B:35:0x007b, B:40:0x0088, B:15:0x002e, B:17:0x0035, B:19:0x0041), top: B:49:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m14061j(com.google.android.gms.internal.measurement.w0 r9, android.os.Bundle r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f35618b
            r1 = r0
            ug.q2 r1 = (ug.q2) r1
            java.lang.Object r0 = r1.f482a     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.n1 r0 = (ug.n1) r0     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.v0 r2 = r0.f35669f     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.n1.m14085m(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.t0 r2 = r2.f35870p     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "onActivityCreated"
            r2.m14140a(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            android.content.Intent r2 = r9.f6428c     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L97
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 == 0) goto L2e
            boolean r4 = r3.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r4 != 0) goto L26
            goto L2e
        L26:
            r5 = r3
            goto L47
        L28:
            r0 = move-exception
            goto Lb9
        L2b:
            r0 = move-exception
            goto La4
        L2e:
            android.os.Bundle r3 = r2.getExtras()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r4 = 0
            if (r3 == 0) goto L46
            java.lang.String r5 = "com.android.vending.referral_url"
            java.lang.String r3 = r3.getString(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r5 != 0) goto L46
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto L26
        L46:
            r5 = r4
        L47:
            if (r5 == 0) goto L97
            boolean r3 = r5.isHierarchical()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L50
            goto L97
        L50:
            ug.l4 r3 = r0.f35672j     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.n1.m14083i(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            java.lang.String r3 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "https://www.google.com"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r3 != 0) goto L78
            java.lang.String r3 = "android-app://com.google.appcrawler"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r2 == 0) goto L74
            goto L78
        L74:
            java.lang.String r2 = "auto"
        L76:
            r6 = r2
            goto L7b
        L78:
            java.lang.String r2 = "gs"
            goto L76
        L7b:
            java.lang.String r2 = "referrer"
            java.lang.String r7 = r5.getQueryParameter(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            if (r10 != 0) goto L86
            r2 = 1
        L84:
            r4 = r2
            goto L88
        L86:
            r2 = 0
            goto L84
        L88:
            ug.m1 r0 = r0.f35670g     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.n1.m14085m(r0)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            ug.f2 r2 = new ug.f2     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r3 = r8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            r0.m14047V(r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2b
            goto Lb4
        L97:
            java.lang.Object r0 = r1.f482a
            ug.n1 r0 = (ug.n1) r0
        L9b:
            ug.b3 r0 = r0.f35675m
            ug.n1.m14084k(r0)
            r0.m13844U(r9, r10)
            return
        La4:
            java.lang.Object r2 = r1.f482a     // Catch: java.lang.Throwable -> L28
            ug.n1 r2 = (ug.n1) r2     // Catch: java.lang.Throwable -> L28
            ug.v0 r2 = r2.f35669f     // Catch: java.lang.Throwable -> L28
            ug.n1.m14085m(r2)     // Catch: java.lang.Throwable -> L28
            ug.t0 r2 = r2.f35862f     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = "Throwable caught in onActivityCreated"
            r2.m14141b(r0, r3)     // Catch: java.lang.Throwable -> L28
        Lb4:
            java.lang.Object r0 = r1.f482a
            ug.n1 r0 = (ug.n1) r0
            goto L9b
        Lb9:
            java.lang.Object r1 = r1.f482a
            ug.n1 r1 = (ug.n1) r1
            ug.b3 r1 = r1.f35675m
            ug.n1.m14084k(r1)
            r1.m13844U(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ug.m2.m14061j(com.google.android.gms.internal.measurement.w0, android.os.Bundle):void");
    }

    /* renamed from: k */
    public void m14062k(com.google.android.gms.internal.measurement.w0 w0Var) {
        b3 b3Var = ((n1) ((q2) this.f35618b).f482a).f35675m;
        n1.m14084k(b3Var);
        synchronized (b3Var.f35298m) {
            try {
                if (Objects.equals(b3Var.f35293g, w0Var)) {
                    b3Var.f35293g = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((n1) b3Var.f482a).f35667d.a0()) {
            b3Var.f35292f.remove(Integer.valueOf(w0Var.f6426a));
        }
    }

    /* renamed from: l */
    public void m14063l(com.google.android.gms.internal.measurement.w0 w0Var) {
        n1 n1Var = (n1) ((q2) this.f35618b).f482a;
        b3 b3Var = n1Var.f35675m;
        n1.m14084k(b3Var);
        synchronized (b3Var.f35298m) {
            b3Var.f35297l = false;
            b3Var.f35294h = true;
        }
        n1 n1Var2 = (n1) b3Var.f482a;
        n1Var2.f35674l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (n1Var2.f35667d.a0()) {
            x2 x2VarM13841R = b3Var.m13841R(w0Var);
            b3Var.f35290d = b3Var.f35289c;
            b3Var.f35289c = null;
            m1 m1Var = n1Var2.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new a3(b3Var, x2VarM13841R, jElapsedRealtime));
        } else {
            b3Var.f35289c = null;
            m1 m1Var2 = n1Var2.f35670g;
            n1.m14085m(m1Var2);
            m1Var2.m14047V(new b0(b3Var, jElapsedRealtime));
        }
        s3 s3Var = n1Var.f35671h;
        n1.m14084k(s3Var);
        n1 n1Var3 = (n1) s3Var.f482a;
        n1Var3.f35674l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        m1 m1Var3 = n1Var3.f35670g;
        n1.m14085m(m1Var3);
        m1Var3.m14047V(new p3(s3Var, jElapsedRealtime2, 1));
    }

    /* renamed from: m */
    public void m14064m(com.google.android.gms.internal.measurement.w0 w0Var) {
        n1 n1Var = (n1) ((q2) this.f35618b).f482a;
        s3 s3Var = n1Var.f35671h;
        n1.m14084k(s3Var);
        n1 n1Var2 = (n1) s3Var.f482a;
        n1Var2.f35674l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m1 m1Var = n1Var2.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14047V(new p3(s3Var, jElapsedRealtime, 0));
        b3 b3Var = n1Var.f35675m;
        n1.m14084k(b3Var);
        Object obj = b3Var.f35298m;
        synchronized (obj) {
            b3Var.f35297l = true;
            if (!Objects.equals(w0Var, b3Var.f35293g)) {
                synchronized (obj) {
                    b3Var.f35293g = w0Var;
                    b3Var.f35294h = false;
                    n1 n1Var3 = (n1) b3Var.f482a;
                    if (n1Var3.f35667d.a0()) {
                        b3Var.f35295j = null;
                        m1 m1Var2 = n1Var3.f35670g;
                        n1.m14085m(m1Var2);
                        m1Var2.m14047V(new z2(b3Var, 1));
                    }
                }
            }
        }
        n1 n1Var4 = (n1) b3Var.f482a;
        if (!n1Var4.f35667d.a0()) {
            b3Var.f35289c = b3Var.f35295j;
            m1 m1Var3 = n1Var4.f35670g;
            n1.m14085m(m1Var3);
            m1Var3.m14047V(new z2(b3Var, 0));
            return;
        }
        b3Var.m13845V(w0Var.f6427b, b3Var.m13841R(w0Var), false);
        c0 c0Var = ((n1) b3Var.f482a).f35677p;
        n1.m14082h(c0Var);
        n1 n1Var5 = (n1) c0Var.f482a;
        n1Var5.f35674l.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        m1 m1Var4 = n1Var5.f35670g;
        n1.m14085m(m1Var4);
        m1Var4.m14047V(new b0(c0Var, jElapsedRealtime2));
    }

    /* renamed from: n */
    public void m14065n(com.google.android.gms.internal.measurement.w0 w0Var, Bundle bundle) {
        x2 x2Var;
        b3 b3Var = ((n1) ((q2) this.f35618b).f482a).f35675m;
        n1.m14084k(b3Var);
        if (!((n1) b3Var.f482a).f35667d.a0() || bundle == null || (x2Var = (x2) b3Var.f35292f.get(Integer.valueOf(w0Var.f6426a))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", x2Var.f35924c);
        bundle2.putString(IMAPStore.ID_NAME, x2Var.f35922a);
        bundle2.putString("referrer_name", x2Var.f35923b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f35617a) {
            case 0:
                m14061j(com.google.android.gms.internal.measurement.w0.m3730b(activity), bundle);
                break;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT > 25) {
                        m14060a(intent);
                        break;
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC6224g(19, this, intent));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f35617a) {
            case 0:
                m14062k(com.google.android.gms.internal.measurement.w0.m3730b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f35617a) {
            case 0:
                m14063l(com.google.android.gms.internal.measurement.w0.m3730b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.f35617a) {
            case 0:
                m14064m(com.google.android.gms.internal.measurement.w0.m3730b(activity));
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f35617a) {
            case 0:
                m14065n(com.google.android.gms.internal.measurement.w0.m3730b(activity), bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f35617a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i10 = this.f35617a;
    }

    public m2() {
        this.f35617a = 1;
        this.f35618b = new ArrayDeque(10);
    }

    /* renamed from: b */
    private final void m14052b(Activity activity) {
    }

    /* renamed from: c */
    private final void m14053c(Activity activity) {
    }

    /* renamed from: d */
    private final void m14054d(Activity activity) {
    }

    /* renamed from: f */
    private final void m14056f(Activity activity) {
    }

    /* renamed from: g */
    private final void m14057g(Activity activity) {
    }

    /* renamed from: h */
    private final void m14058h(Activity activity) {
    }

    /* renamed from: i */
    private final void m14059i(Activity activity) {
    }

    /* renamed from: e */
    private final void m14055e(Activity activity, Bundle bundle) {
    }
}
