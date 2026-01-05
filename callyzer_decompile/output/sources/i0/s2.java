package i0;

import com.google.crypto.tink.shaded.protobuf.C1377d;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class s2 implements c0.m1 {

    /* renamed from: b */
    public final long f16578b;

    /* renamed from: c */
    public final c0.m1 f16579c;

    public s2(long j6, c0.m1 m1Var) {
        og.y0.m11051a("Timeout must be non-negative.", j6 >= 0);
        this.f16578b = j6;
        this.f16579c = m1Var;
    }

    @Override // c0.m1
    /* renamed from: a */
    public final long mo2220a() {
        return this.f16578b;
    }

    @Override // c0.m1
    /* renamed from: b */
    public final c0.l1 mo2221b(C1377d c1377d) {
        c0.l1 l1VarMo2221b = this.f16579c.mo2221b(c1377d);
        long j6 = this.f16578b;
        return (j6 <= 0 || c1377d.f7028b < j6 - l1VarMo2221b.f5152a) ? l1VarMo2221b : c0.l1.f5149d;
    }
}
