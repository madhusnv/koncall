package p001o;

import java.util.Arrays;
import org.apache.http.message.TokenParser;

/* loaded from: classes6.dex */
public final class xh1 implements Cloneable {

    /* renamed from: a */
    public int[] f53783a;

    /* renamed from: b */
    public int f53784b;

    public xh1() {
        this.f53784b = 0;
        this.f53783a = new int[1];
    }

    /* renamed from: k */
    public static int[] m56299k(int i) {
        return new int[(i + 31) / 32];
    }

    /* renamed from: a */
    public void m56300a(boolean z) {
        m56304g(this.f53784b + 1);
        if (z) {
            int[] iArr = this.f53783a;
            int i = this.f53784b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f53784b++;
    }

    /* renamed from: b */
    public void m56301b(xh1 xh1Var) {
        int i = xh1Var.f53784b;
        m56304g(this.f53784b + i);
        for (int i2 = 0; i2 < i; i2++) {
            m56300a(xh1Var.m56305h(i2));
        }
    }

    /* renamed from: c */
    public void m56302c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m56304g(this.f53784b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m56300a(z);
            i2--;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof xh1)) {
            return false;
        }
        xh1 xh1Var = (xh1) obj;
        return this.f53784b == xh1Var.f53784b && Arrays.equals(this.f53783a, xh1Var.f53783a);
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public xh1 clone() {
        return new xh1((int[]) this.f53783a.clone(), this.f53784b);
    }

    /* renamed from: g */
    public final void m56304g(int i) {
        if (i > (this.f53783a.length << 5)) {
            int[] iArrM56299k = m56299k(i);
            int[] iArr = this.f53783a;
            System.arraycopy(iArr, 0, iArrM56299k, 0, iArr.length);
            this.f53783a = iArrM56299k;
        }
    }

    /* renamed from: h */
    public boolean m56305h(int i) {
        return ((1 << (i & 31)) & this.f53783a[i / 32]) != 0;
    }

    public int hashCode() {
        return (this.f53784b * 31) + Arrays.hashCode(this.f53783a);
    }

    /* renamed from: i */
    public int m56306i() {
        return this.f53784b;
    }

    /* renamed from: j */
    public int m56307j() {
        return (this.f53784b + 7) / 8;
    }

    /* renamed from: l */
    public void m56308l(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (m56305h(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    /* renamed from: m */
    public void m56309m(xh1 xh1Var) {
        if (this.f53784b != xh1Var.f53784b) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f53783a;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ xh1Var.f53783a[i];
            i++;
        }
    }

    public String toString() {
        int i = this.f53784b;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f53784b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(TokenParser.SP);
            }
            sb.append(m56305h(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public xh1(int[] iArr, int i) {
        this.f53783a = iArr;
        this.f53784b = i;
    }
}
