package com.websoptimization.callyzerbiz;

import a7.C0060a;
import a9.C0069h;
import al.C0182j;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin;
import com.amplifyframework.kotlin.core.Amplify;
import com.amplifyframework.storage.s3.AWSS3StoragePlugin;
import gm.AbstractApplicationC2654w;
import gm.C2651t;
import java.security.Provider;
import java.security.Security;
import jn.AbstractC3802a;
import jn.InterfaceC3803b;
import k4.C4001v;
import k9.C4032f;
import kotlin.jvm.internal.AbstractC4154l;
import og.fe;
import og.o1;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import rn.h0;
import rn.r0;
import t8.C7056b;
import tx.c0;
import u8.AbstractC7370r;
import u8.C7368p;
import ug.C7439j;
import uw.InterfaceC7559c;
import wx.m1;
import xm.y5;
import yv.C8801p;
import yv.C8802q;
import yv.C8803r;
import yv.C8805t;
import yx.C8810d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class CallyzerBizApp extends AbstractApplicationC2654w {

    /* renamed from: c */
    public C0060a f7253c;

    /* renamed from: d */
    public C7439j f7254d;

    /* renamed from: e */
    public C8803r f7255e;

    @Override // gm.AbstractApplicationC2654w, android.app.Application
    public final void onCreate() {
        Object value;
        super.onCreate();
        try {
            Provider provider = Security.getProvider("BC");
            if (provider == null || !provider.getClass().equals(BouncyCastleProvider.class)) {
                Security.removeProvider("BC");
                Security.insertProviderAt(new BouncyCastleProvider(), 1);
            }
        } catch (Exception e2) {
            Context applicationContext = getApplicationContext();
            AbstractC4154l.m8922e(applicationContext, "getApplicationContext(...)");
            new C8805t(applicationContext).m16239n("Failed to setup BouncyCastle", e2);
        }
        C4001v c4001v = new C4001v((byte) 0, 25);
        C0060a c0060a = this.f7253c;
        InterfaceC7559c interfaceC7559c = null;
        if (c0060a == null) {
            AbstractC4154l.m8928k("workerFactory");
            throw null;
        }
        c4001v.f20704b = c0060a;
        C7056b c7056b = new C7056b(c4001v);
        synchronized (C7368p.f35042m) {
            try {
                C7368p c7368p = C7368p.f35040k;
                if (c7368p != null && C7368p.f35041l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (c7368p == null) {
                    Context applicationContext2 = getApplicationContext();
                    if (C7368p.f35041l == null) {
                        C7368p.f35041l = AbstractC7370r.m13788a(applicationContext2, c7056b);
                    }
                    C7368p.f35040k = C7368p.f35041l;
                }
            } finally {
            }
        }
        C8803r c8803r = this.f7255e;
        if (c8803r == null) {
            AbstractC4154l.m8928k("networkMonitorUtil");
            throw null;
        }
        synchronized (c8803r) {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    if (c8803r.f42467b.getActiveNetwork() == null) {
                        m1 m1Var = c8803r.f42470e;
                        do {
                            value = m1Var.getValue();
                            ((C8801p) value).getClass();
                        } while (!m1Var.m15397i(value, new C8801p(false)));
                    }
                    C0069h c0069h = new C0069h(3, c8803r);
                    c8803r.f42468c = c0069h;
                    c8803r.f42467b.registerDefaultNetworkCallback(c0069h);
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    c8803r.f42466a.registerReceiver((C8802q) c8803r.f42469d.getValue(), intentFilter);
                }
                c8803r.f42472g = true;
            } finally {
            }
        }
        try {
            Amplify.Companion companion = Amplify.Companion;
            companion.addPlugin(new AWSCognitoAuthPlugin());
            companion.addPlugin(new AWSS3StoragePlugin());
            Context applicationContext3 = getApplicationContext();
            AbstractC4154l.m8922e(applicationContext3, "getApplicationContext(...)");
            companion.configure(applicationContext3);
        } catch (Exception e10) {
            e10.printStackTrace();
            Context applicationContext4 = getApplicationContext();
            AbstractC4154l.m8922e(applicationContext4, "getApplicationContext(...)");
            new C8805t(applicationContext4).m16234i("Can't configure Aws Services...", e10);
            e10.toString();
        }
        C2651t c2651t = (C2651t) ((InterfaceC3803b) o1.m10790b(InterfaceC3803b.class, fe.m10652b(getApplicationContext())));
        C8810d c8810dM8397a = AbstractC3802a.m8397a(c2651t.f14307e);
        h0 callRecordingUseCase = (h0) c2651t.f14302Z.get();
        y5 userSIMRepository = (y5) c2651t.f14281E.get();
        AbstractC4154l.m8923f(callRecordingUseCase, "callRecordingUseCase");
        AbstractC4154l.m8923f(userSIMRepository, "userSIMRepository");
        C0182j c0182j = new C0182j();
        c0182j.f555b = c8810dM8397a;
        c0182j.f556c = callRecordingUseCase;
        c0182j.f557d = userSIMRepository;
        c0.m13502y(c8810dM8397a, null, null, new r0(c0182j, null, 0), 3);
        if (!c0182j.f554a) {
            c0.m13502y(c8810dM8397a, null, null, new ps.c0(c0182j, interfaceC7559c, 14), 3);
        }
        C7439j c7439j = this.f7254d;
        if (c7439j != null) {
            c0.m13502y((C8810d) c7439j.f35539d, null, null, new C4032f(c7439j, (InterfaceC7559c) null, 15), 3);
        } else {
            AbstractC4154l.m8928k("remoteConfigUseCase");
            throw null;
        }
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        C8803r c8803r = this.f7255e;
        if (c8803r == null) {
            AbstractC4154l.m8928k("networkMonitorUtil");
            throw null;
        }
        synchronized (c8803r) {
            try {
                try {
                    if (Build.VERSION.SDK_INT >= 28) {
                        ConnectivityManager connectivityManager = c8803r.f42467b;
                        C0069h c0069h = c8803r.f42468c;
                        if (c0069h == null) {
                            AbstractC4154l.m8928k("networkCallback");
                            throw null;
                        }
                        connectivityManager.unregisterNetworkCallback(c0069h);
                    } else {
                        c8803r.f42466a.unregisterReceiver((C8802q) c8803r.f42469d.getValue());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                c8803r.f42472g = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
