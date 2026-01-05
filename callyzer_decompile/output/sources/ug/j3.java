package ug;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import bk.RunnableC0683n;
import l0.RunnableC4307g;
import pf.C5902b;
import sf.AbstractC6840z;
import sf.InterfaceC6816b;
import sf.InterfaceC6817c;
import yf.C8643a;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class j3 implements ServiceConnection, InterfaceC6816b, InterfaceC6817c {

    /* renamed from: a */
    public volatile boolean f35545a;

    /* renamed from: b */
    public volatile r0 f35546b;

    /* renamed from: c */
    public final /* synthetic */ k3 f35547c;

    public j3(k3 k3Var) {
        this.f35547c = k3Var;
    }

    @Override // sf.InterfaceC6817c
    /* renamed from: d */
    public final void mo12992d(C5902b c5902b) {
        k3 k3Var = this.f35547c;
        m1 m1Var = ((n1) k3Var.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14043R();
        v0 v0Var = ((n1) k3Var.f482a).f35669f;
        if (v0Var == null || !v0Var.f35835b) {
            v0Var = null;
        }
        if (v0Var != null) {
            v0Var.f35870p.m14141b(c5902b, "Service connection failed");
        }
        synchronized (this) {
            this.f35545a = false;
            this.f35546b = null;
        }
        m1 m1Var2 = ((n1) this.f35547c.f482a).f35670g;
        n1.m14085m(m1Var2);
        m1Var2.m14047V(new RunnableC8956c(22, this, c5902b, false));
    }

    @Override // sf.InterfaceC6816b
    /* renamed from: f */
    public final void mo12990f(int i10) {
        n1 n1Var = (n1) this.f35547c.f482a;
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14043R();
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35869n.m14140a("Service connection suspended");
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.m14047V(new RunnableC0683n(16, this));
    }

    @Override // sf.InterfaceC6816b
    /* renamed from: g */
    public final void mo12991g() {
        m1 m1Var = ((n1) this.f35547c.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14043R();
        synchronized (this) {
            try {
                AbstractC6840z.m13036g(this.f35546b);
                i0 i0Var = (i0) this.f35546b.m13009t();
                m1 m1Var2 = ((n1) this.f35547c.f482a).f35670g;
                n1.m14085m(m1Var2);
                m1Var2.m14047V(new RunnableC4307g(22, this, i0Var, false));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f35546b = null;
                this.f35545a = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        m1 m1Var = ((n1) this.f35547c.f482a).f35670g;
        n1.m14085m(m1Var);
        m1Var.m14043R();
        synchronized (this) {
            if (iBinder == null) {
                this.f35545a = false;
                v0 v0Var = ((n1) this.f35547c.f482a).f35669f;
                n1.m14085m(v0Var);
                v0Var.f35862f.m14140a("Service connected with null binder");
                return;
            }
            Object g0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    g0Var = iInterfaceQueryLocalInterface instanceof i0 ? (i0) iInterfaceQueryLocalInterface : new g0(iBinder);
                    v0 v0Var2 = ((n1) this.f35547c.f482a).f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35870p.m14140a("Bound to IMeasurementService interface");
                } else {
                    v0 v0Var3 = ((n1) this.f35547c.f482a).f35669f;
                    n1.m14085m(v0Var3);
                    v0Var3.f35862f.m14141b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                v0 v0Var4 = ((n1) this.f35547c.f482a).f35669f;
                n1.m14085m(v0Var4);
                v0Var4.f35862f.m14140a("Service connect failed to get IMeasurementService");
            }
            if (g0Var == null) {
                this.f35545a = false;
                try {
                    C8643a c8643aM15964b = C8643a.m15964b();
                    k3 k3Var = this.f35547c;
                    c8643aM15964b.m15966c(((n1) k3Var.f482a).f35664a, k3Var.f35569c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                m1 m1Var2 = ((n1) this.f35547c.f482a).f35670g;
                n1.m14085m(m1Var2);
                m1Var2.m14047V(new RunnableC8956c(20, this, g0Var, false));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        n1 n1Var = (n1) this.f35547c.f482a;
        m1 m1Var = n1Var.f35670g;
        n1.m14085m(m1Var);
        m1Var.m14043R();
        v0 v0Var = n1Var.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35869n.m14140a("Service disconnected");
        m1 m1Var2 = n1Var.f35670g;
        n1.m14085m(m1Var2);
        m1Var2.m14047V(new RunnableC4307g(21, this, componentName, false));
    }
}
