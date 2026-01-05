package com.websoptimization.callyzerbiz.services;

import ab.C0084b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.provider.CallLog;
import ao.c0;
import ap.AbstractServiceC0393f;
import ay.C0496f;
import ay.ExecutorC0495e;
import c4.C0861k;
import com.websoptimization.callyzerbiz.R;
import im.p1;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC4154l;
import ln.C4494g;
import og.wc;
import oo.C5431l;
import pg.x5;
import q5.C6118k;
import rn.h0;
import tx.m0;
import tx.u1;
import uo.C7476a;
import uo.C7481f;
import wm.C8114j;
import wo.C8134s;
import xm.C8418z;
import xm.y5;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;
import zo.C9000c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallMonitorService extends AbstractServiceC0393f {

    /* renamed from: d */
    public C8114j f7395d;

    /* renamed from: e */
    public C8810d f7396e;

    /* renamed from: f */
    public C8805t f7397f;

    /* renamed from: g */
    public h0 f7398g;

    /* renamed from: h */
    public C8134s f7399h;

    /* renamed from: j */
    public C9000c f7400j;

    /* renamed from: k */
    public C8803r f7401k;

    /* renamed from: l */
    public C7481f f7402l;

    /* renamed from: m */
    public C7476a f7403m;

    /* renamed from: n */
    public c0 f7404n;

    /* renamed from: p */
    public C8418z f7405p;

    /* renamed from: q */
    public y5 f7406q;

    /* renamed from: r */
    public C4494g f7407r;

    /* renamed from: s */
    public C5431l f7408s;

    /* renamed from: t */
    public C0861k f7409t;

    /* renamed from: v */
    public final C8810d f7410v;

    public CallMonitorService() {
        u1 u1VarM13481d = tx.c0.m13481d();
        C0496f c0496f = m0.f34659a;
        this.f7410v = tx.c0.m13479b(x5.m11928d(u1VarM13481d, ExecutorC0495e.f3538c));
    }

    /* renamed from: b */
    public final Notification m5032b() {
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("call_service_channel", getString(R.string.call_state), 2));
        }
        C6118k c6118k = new C6118k(this, "call_service_channel");
        c6118k.f29834e = C6118k.m12150b(getString(R.string.call_state_identifying));
        c6118k.f29852w.icon = 2131231076;
        Notification notificationM12151a = c6118k.m12151a();
        AbstractC4154l.m8922e(notificationM12151a, "build(...)");
        return notificationM12151a;
    }

    /* renamed from: c */
    public final C8805t m5033c() {
        C8805t c8805t = this.f7397f;
        if (c8805t != null) {
            return c8805t;
        }
        AbstractC4154l.m8928k("traceLog");
        throw null;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v2, types: [tx.b0, uw.c, uw.h] */
    @Override // ap.AbstractServiceC0393f, android.app.Service
    public final void onCreate() {
        ?? r32;
        super.onCreate();
        try {
            wc.m11032b(this, 766, m5032b());
        } catch (Exception e2) {
            m5033c().m16239n("CallMonitorService Exception-", e2);
        }
        String BRAND = Build.BRAND;
        AbstractC4154l.m8922e(BRAND, "BRAND");
        String lowerCase = BRAND.toLowerCase(Locale.ROOT);
        AbstractC4154l.m8922e(lowerCase, "toLowerCase(...)");
        if (lowerCase.contentEquals("tecno")) {
            C8810d c8810d = this.f7396e;
            if (c8810d == null) {
                AbstractC4154l.m8928k("mIoCoroutineScope");
                throw null;
            }
            C7481f c7481f = this.f7402l;
            if (c7481f == null) {
                AbstractC4154l.m8928k("simVerificationUseCase");
                throw null;
            }
            C8805t c8805tM5033c = m5033c();
            C7476a c7476a = this.f7403m;
            if (c7476a == null) {
                AbstractC4154l.m8928k("callDetailVerificationUseCase");
                throw null;
            }
            C8418z c8418z = this.f7405p;
            if (c8418z == null) {
                AbstractC4154l.m8928k("appPreferencesRepository");
                throw null;
            }
            y5 y5Var = this.f7406q;
            if (y5Var == null) {
                AbstractC4154l.m8928k("simDetailRepository");
                throw null;
            }
            c0 c0Var = this.f7404n;
            if (c0Var == null) {
                AbstractC4154l.m8928k("fetchCallLogUseCase");
                throw null;
            }
            h0 h0Var = this.f7398g;
            if (h0Var == null) {
                AbstractC4154l.m8928k("callRecordingUseCase");
                throw null;
            }
            C8134s c8134s = this.f7399h;
            if (c8134s == null) {
                AbstractC4154l.m8928k("syncCallLogUseCase");
                throw null;
            }
            C9000c c9000c = this.f7400j;
            if (c9000c == null) {
                AbstractC4154l.m8928k("workManagerUseCase");
                throw null;
            }
            C5431l c5431l = this.f7408s;
            if (c5431l == null) {
                AbstractC4154l.m8928k("notePopUpUseCase");
                throw null;
            }
            C4494g c4494g = this.f7407r;
            if (c4494g == null) {
                AbstractC4154l.m8928k("sessionConfigurationUseCase");
                throw null;
            }
            C8803r c8803r = this.f7401k;
            if (c8803r == null) {
                AbstractC4154l.m8928k("networkMonitorUtil");
                throw null;
            }
            C0861k c0861k = this.f7409t;
            if (c0861k == null) {
                AbstractC4154l.m8928k("callLogObserverUseCase");
                throw null;
            }
            this.f7395d = new C8114j(this, c8810d, c7481f, c8805tM5033c, c7476a, c8418z, y5Var, c0Var, h0Var, c8134s, c9000c, c5431l, c4494g, c8803r, c0861k);
            ContentResolver contentResolver = getContentResolver();
            Uri uri = CallLog.Calls.CONTENT_URI;
            C8114j c8114j = this.f7395d;
            if (c8114j == null) {
                AbstractC4154l.m8928k("callLogObserver");
                throw null;
            }
            contentResolver.registerContentObserver(uri, true, c8114j);
            r32 = 0;
        } else {
            r32 = 0;
        }
        tx.c0.m13502y(this.f7410v, r32, r32, new C0084b(this, r32, 1), 3);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C4494g c4494g = this.f7407r;
        if (c4494g == null) {
            AbstractC4154l.m8928k("sessionConfigurationUseCase");
            throw null;
        }
        c4494g.m9337b(p1.STOP_CALL_MONITOR_SERVICE, Boolean.FALSE);
        tx.c0.m13485h(this.f7410v, null);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        m5033c().m16231f("CallMonitorService onStartCommand");
        try {
            wc.m11032b(this, 766, m5032b());
            return 2;
        } catch (Exception e2) {
            m5033c().m16239n("CallMonitorService Exception-", e2);
            return 2;
        }
    }
}
