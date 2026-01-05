package p001o;

/* loaded from: classes2.dex */
public final class bpb extends n37 {

    /* renamed from: e */
    public int f16671e;

    public bpb(int i) {
        super(null);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        m19549g(v4f.m52318c(i));
    }

    /* renamed from: e */
    public final void m19547e() {
        this.f16671e = v4f.m52316a(m40036b()) - this.f36310d;
    }

    /* renamed from: f */
    public final void m19548f(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = v4f.f49867a;
        } else {
            jArr = new long[((((i + 1) + 7) + 7) & (-8)) >> 3];
            fp0.m27272u(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f36307a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        m19547e();
    }

    /* renamed from: g */
    public final void m19549g(int i) {
        int iMax = i > 0 ? Math.max(7, v4f.m52317b(i)) : 0;
        this.f36309c = iMax;
        m19548f(iMax);
        this.f36308b = new float[iMax];
    }
}
