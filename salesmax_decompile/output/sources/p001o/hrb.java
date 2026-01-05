package p001o;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hrb {

    /* renamed from: a */
    public final int f27394a;

    /* renamed from: b */
    public boolean f27395b;

    /* renamed from: c */
    public boolean f27396c;

    /* renamed from: d */
    public byte[] f27397d;

    /* renamed from: e */
    public int f27398e;

    public hrb(int i, int i2) {
        this.f27394a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f27397d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m31014a(byte[] bArr, int i, int i2) {
        if (this.f27395b) {
            int i3 = i2 - i;
            byte[] bArr2 = this.f27397d;
            int length = bArr2.length;
            int i4 = this.f27398e;
            if (length < i4 + i3) {
                this.f27397d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.f27397d, this.f27398e, i3);
            this.f27398e += i3;
        }
    }

    /* renamed from: b */
    public boolean m31015b(int i) {
        if (!this.f27395b) {
            return false;
        }
        this.f27398e -= i;
        this.f27395b = false;
        this.f27396c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m31016c() {
        return this.f27396c;
    }

    /* renamed from: d */
    public void m31017d() {
        this.f27395b = false;
        this.f27396c = false;
    }

    /* renamed from: e */
    public void m31018e(int i) {
        op0.m42517g(!this.f27395b);
        boolean z = i == this.f27394a;
        this.f27395b = z;
        if (z) {
            this.f27398e = 3;
            this.f27396c = false;
        }
    }
}
