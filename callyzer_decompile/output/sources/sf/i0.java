package sf;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.internal.zzaj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import pf.C5902b;
import zf.AbstractC8951f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements ServiceConnection {

    /* renamed from: a */
    public final HashMap f32436a = new HashMap();

    /* renamed from: b */
    public int f32437b = 2;

    /* renamed from: c */
    public boolean f32438c;

    /* renamed from: d */
    public IBinder f32439d;

    /* renamed from: e */
    public final h0 f32440e;

    /* renamed from: f */
    public ComponentName f32441f;

    /* renamed from: g */
    public final /* synthetic */ k0 f32442g;

    public i0(k0 k0Var, h0 h0Var) {
        this.f32442g = k0Var;
        this.f32440e = h0Var;
    }

    /* renamed from: a */
    public static C5902b m13015a(i0 i0Var, String str, Executor executor) throws RemoteException {
        try {
            Intent intentM13014a = i0Var.f32440e.m13014a(i0Var.f32442g.f32460b);
            i0Var.f32437b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(AbstractC8951f.m16434a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                k0 k0Var = i0Var.f32442g;
                boolean zM15967d = k0Var.f32462d.m15967d(k0Var.f32460b, str, intentM13014a, i0Var, 4225, executor);
                i0Var.f32438c = zM15967d;
                if (zM15967d) {
                    i0Var.f32442g.f32461c.sendMessageDelayed(i0Var.f32442g.f32461c.obtainMessage(1, i0Var.f32440e), i0Var.f32442g.f32464f);
                    C5902b c5902b = C5902b.f28734e;
                    StrictMode.setVmPolicy(vmPolicy);
                    return c5902b;
                }
                i0Var.f32437b = 2;
                try {
                    k0 k0Var2 = i0Var.f32442g;
                    k0Var2.f32462d.m15966c(k0Var2.f32460b, i0Var);
                } catch (IllegalArgumentException unused) {
                }
                C5902b c5902b2 = new C5902b(16);
                StrictMode.setVmPolicy(vmPolicy);
                return c5902b2;
            } catch (Throwable th2) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th2;
            }
        } catch (zzaj e2) {
            return e2.f6022a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f32442g.f32459a) {
            try {
                this.f32442g.f32461c.removeMessages(1, this.f32440e);
                this.f32439d = iBinder;
                this.f32441f = componentName;
                Iterator it = this.f32436a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f32437b = 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f32442g.f32459a) {
            try {
                this.f32442g.f32461c.removeMessages(1, this.f32440e);
                this.f32439d = null;
                this.f32441f = componentName;
                Iterator it = this.f32436a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f32437b = 2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
