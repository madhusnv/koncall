package p001o;

/* loaded from: classes2.dex */
public final class xpb extends u4f {

    /* renamed from: f */
    public int f54040f;

    public xpb(int i) {
        super(null);
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Capacity must be a positive value.".toString());
        }
        m56573h(v4f.m52318c(i));
    }

    /* renamed from: f */
    public final void m56571f() {
        this.f54040f = v4f.m52316a(m50938c()) - this.f48329e;
    }

    /* renamed from: g */
    public final void m56572g(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = v4f.f49867a;
        } else {
            jArr = new long[((((i + 1) + 7) + 7) & (-8)) >> 3];
            fp0.m27272u(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.f48325a = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        m56571f();
    }

    /* renamed from: h */
    public final void m56573h(int i) {
        int iMax = i > 0 ? Math.max(7, v4f.m52317b(i)) : 0;
        this.f48328d = iMax;
        m56572g(iMax);
        this.f48326b = new Object[iMax];
        this.f48327c = new Object[iMax];
    }
}
