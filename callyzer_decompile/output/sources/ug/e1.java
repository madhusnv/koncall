package ug;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;
import zh.RunnableC8956c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class e1 implements ServiceConnection {

    /* renamed from: a */
    public final String f35374a;

    /* renamed from: b */
    public final /* synthetic */ f1 f35375b;

    public e1(f1 f1Var, String str) {
        Objects.requireNonNull(f1Var);
        this.f35375b = f1Var;
        this.f35374a = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        f1 f1Var = this.f35375b;
        if (iBinder == null) {
            v0 v0Var = f1Var.f35432a.f35669f;
            n1.m14085m(v0Var);
            v0Var.f35865j.m14140a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i10 = com.google.android.gms.internal.measurement.b0.f6071e;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.google.android.gms.internal.measurement.c0 a0Var = iInterfaceQueryLocalInterface instanceof com.google.android.gms.internal.measurement.c0 ? (com.google.android.gms.internal.measurement.c0) iInterfaceQueryLocalInterface : new com.google.android.gms.internal.measurement.a0(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
            n1 n1Var = f1Var.f35432a;
            v0 v0Var2 = n1Var.f35669f;
            n1.m14085m(v0Var2);
            v0Var2.f35870p.m14140a("Install Referrer Service connected");
            m1 m1Var = n1Var.f35670g;
            n1.m14085m(m1Var);
            m1Var.m14047V(new RunnableC8956c(this, a0Var, this));
        } catch (RuntimeException e2) {
            v0 v0Var3 = f1Var.f35432a.f35669f;
            n1.m14085m(v0Var3);
            v0Var3.f35865j.m14141b(e2, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v0 v0Var = this.f35375b.f35432a.f35669f;
        n1.m14085m(v0Var);
        v0Var.f35870p.m14140a("Install Referrer Service disconnected");
    }
}
