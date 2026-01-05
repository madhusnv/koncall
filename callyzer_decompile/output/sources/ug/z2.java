package ug;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class z2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f36036a;

    /* renamed from: b */
    public final /* synthetic */ b3 f36037b;

    public z2(b3 b3Var, int i10) {
        this.f36036a = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(b3Var);
                this.f36037b = b3Var;
                break;
            default:
                Objects.requireNonNull(b3Var);
                this.f36037b = b3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f36036a) {
            case 0:
                b3 b3Var = this.f36037b;
                b3Var.f35291e = b3Var.f35296k;
                break;
            default:
                this.f36037b.f35296k = null;
                break;
        }
    }
}
