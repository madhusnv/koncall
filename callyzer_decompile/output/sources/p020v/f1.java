package p020v;

import android.hardware.camera2.CameraCaptureSession;
import java.util.LinkedHashSet;
import og.y0;
import z1.C8849i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36539a;

    /* renamed from: b */
    public final /* synthetic */ g1 f36540b;

    public /* synthetic */ f1(g1 g1Var, int i10) {
        this.f36539a = i10;
        this.f36540b = g1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36539a) {
            case 0:
                g1 g1Var = this.f36540b;
                g1Var.mo14371g(g1Var);
                return;
            default:
                g1 g1Var2 = this.f36540b;
                g1Var2.m14380k("Session call super.close()");
                y0.m11055e(g1Var2.f36550g, "Need to call openCaptureSession before using this API.");
                x0 x0Var = g1Var2.f36545b;
                synchronized (x0Var.f36755c) {
                    ((LinkedHashSet) x0Var.f36757e).add(g1Var2);
                }
                ((CameraCaptureSession) ((C8849i) g1Var2.f36550g.f36778a).f42583b).close();
                g1Var2.f36547d.execute(new f1(g1Var2, 0));
                return;
        }
    }
}
