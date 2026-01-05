package p001o;

import androidx.media3.common.C2181a;

/* loaded from: classes2.dex */
public abstract class yd1 extends j1b {

    /* renamed from: k */
    public final long f55283k;

    /* renamed from: l */
    public final long f55284l;

    /* renamed from: m */
    public ae1 f55285m;

    /* renamed from: n */
    public int[] f55286n;

    public yd1(dz4 dz4Var, iz4 iz4Var, C2181a c2181a, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dz4Var, iz4Var, c2181a, i, obj, j, j2, j5);
        this.f55283k = j3;
        this.f55284l = j4;
    }

    /* renamed from: g */
    public final int m57614g(int i) {
        return ((int[]) op0.m42519i(this.f55286n))[i];
    }

    /* renamed from: h */
    public final ae1 m57615h() {
        return (ae1) op0.m42519i(this.f55285m);
    }

    /* renamed from: i */
    public void m57616i(ae1 ae1Var) {
        this.f55285m = ae1Var;
        this.f55286n = ae1Var.m16938a();
    }
}
