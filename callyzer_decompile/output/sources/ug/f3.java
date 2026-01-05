package ug;

import android.os.RemoteException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35439a;

    /* renamed from: b */
    public final /* synthetic */ n4 f35440b;

    /* renamed from: c */
    public final /* synthetic */ k3 f35441c;

    public /* synthetic */ f3(k3 k3Var, n4 n4Var, int i10) {
        this.f35439a = i10;
        this.f35440b = n4Var;
        this.f35441c = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35439a) {
            case 0:
                k3 k3Var = this.f35441c;
                i0 i0Var = k3Var.f35570d;
                n1 n1Var = (n1) k3Var.f482a;
                if (i0Var != null) {
                    try {
                        i0Var.mo13914x(this.f35440b);
                    } catch (RemoteException e2) {
                        v0 v0Var = n1Var.f35669f;
                        n1.m14085m(v0Var);
                        v0Var.f35862f.m14141b(e2, "Failed to reset data on the service: remote exception");
                    }
                    k3Var.m14026Z();
                    break;
                } else {
                    v0 v0Var2 = n1Var.f35669f;
                    n1.m14085m(v0Var2);
                    v0Var2.f35862f.m14140a("Failed to reset data on the service: not connected to service");
                    break;
                }
            case 1:
                k3 k3Var2 = this.f35441c;
                i0 i0Var2 = k3Var2.f35570d;
                n1 n1Var2 = (n1) k3Var2.f482a;
                if (i0Var2 == null) {
                    v0 v0Var3 = n1Var2.f35669f;
                    n1.m14085m(v0Var3);
                    v0Var3.f35865j.m14140a("Failed to send app backgrounded");
                    break;
                } else {
                    try {
                        i0Var2.mo13913w(this.f35440b);
                        k3Var2.m14026Z();
                        break;
                    } catch (RemoteException e10) {
                        v0 v0Var4 = n1Var2.f35669f;
                        n1.m14085m(v0Var4);
                        v0Var4.f35862f.m14141b(e10, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
            default:
                k3 k3Var3 = this.f35441c;
                i0 i0Var3 = k3Var3.f35570d;
                n1 n1Var3 = (n1) k3Var3.f482a;
                if (i0Var3 == null) {
                    v0 v0Var5 = n1Var3.f35669f;
                    n1.m14085m(v0Var5);
                    v0Var5.f35862f.m14140a("Failed to send measurementEnabled to service");
                    break;
                } else {
                    try {
                        i0Var3.mo13897G(this.f35440b);
                        k3Var3.m14026Z();
                        break;
                    } catch (RemoteException e11) {
                        v0 v0Var6 = n1Var3.f35669f;
                        n1.m14085m(v0Var6);
                        v0Var6.f35862f.m14141b(e11, "Failed to send measurementEnabled to the service");
                    }
                }
        }
    }
}
