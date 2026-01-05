package ug;

import android.os.RemoteException;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class g3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35452a;

    /* renamed from: b */
    public final /* synthetic */ n4 f35453b;

    /* renamed from: c */
    public final /* synthetic */ k3 f35454c;

    public g3(k3 k3Var, n4 n4Var, int i10) {
        this.f35452a = i10;
        switch (i10) {
            case 1:
                this.f35453b = n4Var;
                Objects.requireNonNull(k3Var);
                this.f35454c = k3Var;
                break;
            default:
                this.f35453b = n4Var;
                this.f35454c = k3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f35452a) {
            case 0:
                k3 k3Var = this.f35454c;
                i0 i0Var = k3Var.f35570d;
                n1 n1Var = (n1) k3Var.f482a;
                if (i0Var == null) {
                    v0 v0Var = n1Var.f35669f;
                    n1.m14085m(v0Var);
                    v0Var.f35862f.m14140a("Discarding data. Failed to send app launch");
                    break;
                } else {
                    try {
                        n4 n4Var = this.f35453b;
                        C7436g c7436g = n1Var.f35667d;
                        e0 e0Var = f0.f44801b1;
                        if (c7436g.m13889W(null, e0Var)) {
                            k3Var.e0(i0Var, null, n4Var);
                        }
                        i0Var.mo13901N(n4Var);
                        n1Var.m14092o().m14107R();
                        n1Var.f35667d.m13889W(null, e0Var);
                        k3Var.e0(i0Var, null, n4Var);
                        k3Var.m14026Z();
                        break;
                    } catch (RemoteException e2) {
                        v0 v0Var2 = n1Var.f35669f;
                        n1.m14085m(v0Var2);
                        v0Var2.f35862f.m14141b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
            default:
                k3 k3Var2 = this.f35454c;
                i0 i0Var2 = k3Var2.f35570d;
                n1 n1Var2 = (n1) k3Var2.f482a;
                if (i0Var2 == null) {
                    v0 v0Var3 = n1Var2.f35669f;
                    n1.m14085m(v0Var3);
                    v0Var3.f35862f.m14140a("Failed to send consent settings to service");
                    break;
                } else {
                    try {
                        i0Var2.mo13906l(this.f35453b);
                        k3Var2.m14026Z();
                        break;
                    } catch (RemoteException e10) {
                        v0 v0Var4 = n1Var2.f35669f;
                        n1.m14085m(v0Var4);
                        v0Var4.f35862f.m14141b(e10, "Failed to send consent settings to the service");
                    }
                }
        }
    }
}
