package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bla {

    /* renamed from: a */
    public int f16477a;

    /* renamed from: b */
    public long[] f16478b;

    public bla() {
        this(32);
    }

    /* renamed from: a */
    public void m19329a(long j) {
        int i = this.f16477a;
        long[] jArr = this.f16478b;
        if (i == jArr.length) {
            this.f16478b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f16478b;
        int i2 = this.f16477a;
        this.f16477a = i2 + 1;
        jArr2[i2] = j;
    }

    /* renamed from: b */
    public long m19330b(int i) {
        if (i >= 0 && i < this.f16477a) {
            return this.f16478b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f16477a);
    }

    /* renamed from: c */
    public int m19331c() {
        return this.f16477a;
    }

    public bla(int i) {
        this.f16478b = new long[i];
    }
}
