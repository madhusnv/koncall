package p001o;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class fla {

    /* renamed from: a */
    public int f23613a;

    /* renamed from: b */
    public int f23614b;

    /* renamed from: c */
    public int f23615c;

    /* renamed from: d */
    public long[] f23616d;

    /* renamed from: e */
    public int f23617e;

    public fla() {
        this(16);
    }

    /* renamed from: a */
    public void m27023a() {
        this.f23613a = 0;
        this.f23614b = -1;
        this.f23615c = 0;
    }

    /* renamed from: b */
    public long m27024b() {
        if (this.f23615c != 0) {
            return this.f23616d[this.f23613a];
        }
        throw new NoSuchElementException();
    }

    /* renamed from: c */
    public boolean m27025c() {
        return this.f23615c == 0;
    }

    /* renamed from: d */
    public long m27026d() {
        int i = this.f23615c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f23616d;
        int i2 = this.f23613a;
        long j = jArr[i2];
        this.f23613a = this.f23617e & (i2 + 1);
        this.f23615c = i - 1;
        return j;
    }

    public fla(int i) {
        op0.m42511a(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.f23613a = 0;
        this.f23614b = -1;
        this.f23615c = 0;
        long[] jArr = new long[i];
        this.f23616d = jArr;
        this.f23617e = jArr.length - 1;
    }
}
