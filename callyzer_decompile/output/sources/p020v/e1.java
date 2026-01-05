package p020v;

import java.util.LinkedHashSet;
import java.util.Objects;
import og.u1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36532a;

    /* renamed from: b */
    public final /* synthetic */ g1 f36533b;

    /* renamed from: c */
    public final /* synthetic */ g1 f36534c;

    public /* synthetic */ e1(g1 g1Var, g1 g1Var2, int i10) {
        this.f36532a = i10;
        this.f36533b = g1Var;
        this.f36534c = g1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36532a) {
            case 0:
                g1 g1Var = this.f36533b;
                g1 g1Var2 = this.f36534c;
                x0 x0Var = g1Var.f36545b;
                synchronized (x0Var.f36755c) {
                    ((LinkedHashSet) x0Var.f36756d).remove(g1Var);
                    ((LinkedHashSet) x0Var.f36757e).remove(g1Var);
                }
                g1Var.mo14371g(g1Var2);
                if (g1Var.f36550g == null) {
                    u1.m10951j("SyncCaptureSessionBase");
                    return;
                } else {
                    Objects.requireNonNull(g1Var.f36549f);
                    g1Var.f36549f.mo14367c(g1Var2);
                    return;
                }
            default:
                g1 g1Var3 = this.f36533b;
                g1 g1Var4 = this.f36534c;
                Objects.requireNonNull(g1Var3.f36549f);
                g1Var3.f36549f.mo14371g(g1Var4);
                return;
        }
    }
}
