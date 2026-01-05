package ke;

import a1.C0005d;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import ee.C2035c;
import ee.C2039g;
import fe.InterfaceC2281e;
import java.lang.ref.WeakReference;
import ng.C5070u;
import r5.AbstractC6468c;
import wd.C7998f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ke.l */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C4071l implements ComponentCallbacks2 {

    /* renamed from: a */
    public final WeakReference f20935a;

    /* renamed from: b */
    public Context f20936b;

    /* renamed from: c */
    public InterfaceC2281e f20937c;

    /* renamed from: d */
    public boolean f20938d;

    /* renamed from: e */
    public boolean f20939e = true;

    public ComponentCallbacks2C4071l(C7998f c7998f) {
        this.f20935a = new WeakReference(c7998f);
    }

    /* renamed from: a */
    public final synchronized void m8844a() {
        InterfaceC2281e c5070u;
        try {
            C7998f c7998f = (C7998f) this.f20935a.get();
            if (c7998f == null) {
                m8845b();
            } else if (this.f20937c == null) {
                if (c7998f.f38449d.f20929b) {
                    Context context = c7998f.f38446a;
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
                    if (connectivityManager == null || AbstractC6468c.m12450a(context, "android.permission.ACCESS_NETWORK_STATE") != 0) {
                        c5070u = new C5070u(13);
                    } else {
                        try {
                            c5070u = new C0005d(connectivityManager, this);
                        } catch (Exception unused) {
                            c5070u = new C5070u(13);
                        }
                    }
                } else {
                    c5070u = new C5070u(13);
                }
                this.f20937c = c5070u;
                this.f20939e = c5070u.mo59a();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public final synchronized void m8845b() {
        try {
            if (this.f20938d) {
                return;
            }
            this.f20938d = true;
            Context context = this.f20936b;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC2281e interfaceC2281e = this.f20937c;
            if (interfaceC2281e != null) {
                interfaceC2281e.shutdown();
            }
            this.f20935a.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C7998f) this.f20935a.get()) == null) {
            m8845b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        C7998f c7998f = (C7998f) this.f20935a.get();
        if (c7998f != null) {
            C2035c c2035c = (C2035c) c7998f.f38448c.getValue();
            if (c2035c != null) {
                c2035c.f9593a.mo2557V(i10);
                C2039g c2039g = c2035c.f9594b;
                synchronized (c2039g) {
                    if (i10 >= 10 && i10 != 20) {
                        c2039g.m5759h();
                    }
                }
            }
        } else {
            m8845b();
        }
    }
}
