package ug;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class b0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f35274a = 1;

    /* renamed from: b */
    public final /* synthetic */ long f35275b;

    /* renamed from: c */
    public final /* synthetic */ d0 f35276c;

    public b0(c0 c0Var, long j6) {
        this.f35275b = j6;
        Objects.requireNonNull(c0Var);
        this.f35276c = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35274a) {
            case 0:
                ((c0) this.f35276c).m13855S(this.f35275b);
                break;
            default:
                b3 b3Var = (b3) this.f35276c;
                c0 c0Var = ((n1) b3Var.f482a).f35677p;
                n1.m14082h(c0Var);
                c0Var.m13852P(this.f35275b);
                b3Var.f35291e = null;
                break;
        }
    }

    public b0(b3 b3Var, long j6) {
        this.f35275b = j6;
        Objects.requireNonNull(b3Var);
        this.f35276c = b3Var;
    }
}
