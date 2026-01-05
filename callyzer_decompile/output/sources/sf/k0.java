package sf;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import pf.C5902b;
import yf.C8643a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: g */
    public static final Object f32456g = new Object();

    /* renamed from: h */
    public static k0 f32457h;

    /* renamed from: i */
    public static HandlerThread f32458i;

    /* renamed from: a */
    public final HashMap f32459a = new HashMap();

    /* renamed from: b */
    public final Context f32460b;

    /* renamed from: c */
    public volatile com.google.android.gms.internal.measurement.h0 f32461c;

    /* renamed from: d */
    public final C8643a f32462d;

    /* renamed from: e */
    public final long f32463e;

    /* renamed from: f */
    public final long f32464f;

    public k0(Context context, Looper looper) {
        j0 j0Var = new j0(this);
        this.f32460b = context.getApplicationContext();
        com.google.android.gms.internal.measurement.h0 h0Var = new com.google.android.gms.internal.measurement.h0(looper, j0Var, 4);
        Looper.getMainLooper();
        this.f32461c = h0Var;
        this.f32462d = C8643a.m15964b();
        this.f32463e = 5000L;
        this.f32464f = 300000L;
    }

    /* renamed from: a */
    public static k0 m13017a(Context context) {
        synchronized (f32456g) {
            try {
                if (f32457h == null) {
                    f32457h = new k0(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32457h;
    }

    /* renamed from: b */
    public final C5902b m13018b(h0 h0Var, c0 c0Var, String str, Executor executor) {
        synchronized (this.f32459a) {
            try {
                i0 i0Var = (i0) this.f32459a.get(h0Var);
                C5902b c5902bM13015a = null;
                if (executor == null) {
                    executor = null;
                }
                if (i0Var == null) {
                    i0Var = new i0(this, h0Var);
                    i0Var.f32436a.put(c0Var, c0Var);
                    c5902bM13015a = i0.m13015a(i0Var, str, executor);
                    this.f32459a.put(h0Var, i0Var);
                } else {
                    this.f32461c.removeMessages(0, h0Var);
                    if (i0Var.f32436a.containsKey(c0Var)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(h0Var.toString()));
                    }
                    i0Var.f32436a.put(c0Var, c0Var);
                    int i10 = i0Var.f32437b;
                    if (i10 == 1) {
                        c0Var.onServiceConnected(i0Var.f32441f, i0Var.f32439d);
                    } else if (i10 == 2) {
                        c5902bM13015a = i0.m13015a(i0Var, str, executor);
                    }
                }
                if (i0Var.f32438c) {
                    return C5902b.f28734e;
                }
                if (c5902bM13015a == null) {
                    c5902bM13015a = new C5902b(-1);
                }
                return c5902bM13015a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m13019c(String str, ServiceConnection serviceConnection, boolean z6) {
        h0 h0Var = new h0(str, z6);
        AbstractC6840z.m13037h(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f32459a) {
            try {
                i0 i0Var = (i0) this.f32459a.get(h0Var);
                if (i0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(h0Var.toString()));
                }
                if (!i0Var.f32436a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(h0Var.toString()));
                }
                i0Var.f32436a.remove(serviceConnection);
                if (i0Var.f32436a.isEmpty()) {
                    this.f32461c.sendMessageDelayed(this.f32461c.obtainMessage(0, h0Var), this.f32463e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
