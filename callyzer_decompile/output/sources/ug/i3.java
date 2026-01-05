package ug;

import android.os.RemoteException;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class i3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35524a;

    /* renamed from: b */
    public final /* synthetic */ k3 f35525b;

    public /* synthetic */ i3(k3 k3Var, int i10) {
        this.f35524a = i10;
        this.f35525b = k3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35524a) {
            case 0:
                this.f35525b.m14019S();
                break;
            case 1:
                k3 k3Var = this.f35525b;
                n1 n1Var = (n1) k3Var.f482a;
                i0 i0Var = k3Var.f35570d;
                if (i0Var == null) {
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14140a("Failed to send Dma consent settings to service");
                    break;
                } else {
                    try {
                        i0Var.mo13898H(k3Var.c0(false));
                        k3Var.m14026Z();
                        break;
                    } catch (RemoteException e2) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14141b(e2, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
            default:
                k3 k3Var2 = this.f35525b;
                n1 n1Var2 = (n1) k3Var2.f482a;
                i0 i0Var2 = k3Var2.f35570d;
                if (i0Var2 == null) {
                    v0 v0Var3 = n1Var2.f35669f;
                    n1.m14085m(v0Var3);
                    v0Var3.f35862f.m14140a("Failed to send storage consent settings to service");
                    break;
                } else {
                    try {
                        i0Var2.mo13894C(k3Var2.c0(false));
                        k3Var2.m14026Z();
                        break;
                    } catch (RemoteException e10) {
                        v0 v0Var4 = n1Var2.f35669f;
                        n1.m14085m(v0Var4);
                        v0Var4.f35862f.m14141b(e10, "Failed to send storage consent settings to the service");
                    }
                }
        }
    }
}
