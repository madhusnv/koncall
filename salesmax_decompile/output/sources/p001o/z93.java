package p001o;

/* loaded from: classes2.dex */
public final class z93 {

    /* renamed from: a */
    public int[] f56729a;

    /* renamed from: b */
    public int f56730b;

    /* renamed from: c */
    public int f56731c;

    /* renamed from: d */
    public int f56732d;

    public z93() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void m58966a(int i) {
        int[] iArr = this.f56729a;
        int i2 = this.f56731c;
        iArr[i2] = i;
        int i3 = this.f56732d & (i2 + 1);
        this.f56731c = i3;
        if (i3 == this.f56730b) {
            m58968c();
        }
    }

    /* renamed from: b */
    public final void m58967b() {
        this.f56731c = this.f56730b;
    }

    /* renamed from: c */
    public final void m58968c() {
        int[] iArr = this.f56729a;
        int length = iArr.length;
        int i = this.f56730b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i3];
        fp0.m27258g(iArr, iArr2, 0, i, length);
        fp0.m27258g(this.f56729a, iArr2, i2, 0, this.f56730b);
        this.f56729a = iArr2;
        this.f56730b = 0;
        this.f56731c = length;
        this.f56732d = i3 - 1;
    }

    /* renamed from: d */
    public final boolean m58969d() {
        return this.f56730b == this.f56731c;
    }

    /* renamed from: e */
    public final int m58970e() {
        int i = this.f56730b;
        if (i == this.f56731c) {
            wg3 wg3Var = wg3.f51930a;
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.f56729a[i];
        this.f56730b = (i + 1) & this.f56732d;
        return i2;
    }

    public z93(int i) {
        if (!(i >= 1)) {
            throw new IllegalArgumentException("capacity must be >= 1".toString());
        }
        if (!(i <= 1073741824)) {
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f56732d = i - 1;
        this.f56729a = new int[i];
    }

    public /* synthetic */ z93(int i, int i2, id5 id5Var) {
        this((i2 & 1) != 0 ? 8 : i);
    }
}
