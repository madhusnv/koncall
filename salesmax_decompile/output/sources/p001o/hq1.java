package p001o;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class hq1 {

    /* renamed from: a */
    public final byte[][] f27361a;

    /* renamed from: b */
    public final int f27362b;

    /* renamed from: c */
    public final int f27363c;

    public hq1(int i, int i2) {
        this.f27361a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
        this.f27362b = i;
        this.f27363c = i2;
    }

    /* renamed from: a */
    public void m30981a(byte b) {
        for (byte[] bArr : this.f27361a) {
            Arrays.fill(bArr, b);
        }
    }

    /* renamed from: b */
    public byte m30982b(int i, int i2) {
        return this.f27361a[i2][i];
    }

    /* renamed from: c */
    public byte[][] m30983c() {
        return this.f27361a;
    }

    /* renamed from: d */
    public int m30984d() {
        return this.f27363c;
    }

    /* renamed from: e */
    public int m30985e() {
        return this.f27362b;
    }

    /* renamed from: f */
    public void m30986f(int i, int i2, int i3) {
        this.f27361a[i2][i] = (byte) i3;
    }

    /* renamed from: g */
    public void m30987g(int i, int i2, boolean z) {
        this.f27361a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f27362b * 2 * this.f27363c) + 2);
        for (int i = 0; i < this.f27363c; i++) {
            byte[] bArr = this.f27361a[i];
            for (int i2 = 0; i2 < this.f27362b; i2++) {
                byte b = bArr[i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
