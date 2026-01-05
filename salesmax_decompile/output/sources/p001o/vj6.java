package p001o;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

/* loaded from: classes5.dex */
public class vj6 implements Serializable, Cloneable, Comparable {

    /* renamed from: c */
    public static final char[] f50436c = "0123456789abcdefABCDEF".toCharArray();

    /* renamed from: d */
    public static Random f50437d;

    /* renamed from: a */
    public final long f50438a;

    /* renamed from: b */
    public volatile String f50439b;

    public vj6(byte[] bArr) {
        if (bArr.length != 6) {
            throw new NumberFormatException("Ethernet address has to consist of 6 bytes");
        }
        long j = bArr[0] & 255;
        for (int i = 1; i < 6; i++) {
            j = (j << 8) | (bArr[i] & 255);
        }
        this.f50438a = j;
    }

    /* renamed from: c */
    public static synchronized Random m52875c() {
        if (f50437d == null) {
            f50437d = new SecureRandom();
        }
        return f50437d;
    }

    /* renamed from: h */
    public static vj6 m52876h() {
        return m52877j(m52875c());
    }

    /* renamed from: j */
    public static vj6 m52877j(Random random) {
        byte[] bArr = new byte[6];
        synchronized (random) {
            random.nextBytes(bArr);
        }
        bArr[0] = (byte) (bArr[0] | 1);
        return new vj6(bArr);
    }

    /* renamed from: a */
    public final void m52878a(StringBuilder sb, int i) {
        char[] cArr = f50436c;
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public Object clone() {
        return new vj6(this.f50438a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == getClass() && ((vj6) obj).f50438a == this.f50438a;
    }

    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(vj6 vj6Var) {
        long j = this.f50438a - vj6Var.f50438a;
        if (j < 0) {
            return -1;
        }
        return j == 0 ? 0 : 1;
    }

    /* renamed from: m */
    public void m52880m(byte[] bArr, int i) {
        if (i < 0 || i + 6 > bArr.length) {
            throw new IllegalArgumentException("Illegal offset (" + i + "), need room for 6 bytes");
        }
        long j = this.f50438a;
        int i2 = (int) (j >> 32);
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >> 8);
        int i4 = i3 + 1;
        bArr[i3] = (byte) i2;
        int i5 = (int) j;
        int i6 = i4 + 1;
        bArr[i4] = (byte) (i5 >> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (i5 >> 16);
        bArr[i7] = (byte) (i5 >> 8);
        bArr[i7 + 1] = (byte) i5;
    }

    public String toString() {
        String str = this.f50439b;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(17);
        long j = this.f50438a;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        m52878a(sb, i >> 8);
        sb.append(':');
        m52878a(sb, i);
        sb.append(':');
        m52878a(sb, i2 >> 24);
        sb.append(':');
        m52878a(sb, i2 >> 16);
        sb.append(':');
        m52878a(sb, i2 >> 8);
        sb.append(':');
        m52878a(sb, i2);
        String string = sb.toString();
        this.f50439b = string;
        return string;
    }

    public vj6(long j) {
        this.f50438a = j;
    }
}
