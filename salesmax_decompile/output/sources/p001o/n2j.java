package p001o;

import com.google.firebase.perf.util.Constants;

/* loaded from: classes2.dex */
public final class n2j {

    /* renamed from: a */
    public final byte[] f36286a;

    /* renamed from: b */
    public final int f36287b;

    /* renamed from: c */
    public int f36288c;

    /* renamed from: d */
    public int f36289d;

    public n2j(byte[] bArr) {
        this.f36286a = bArr;
        this.f36287b = bArr.length;
    }

    /* renamed from: a */
    public final void m40024a() {
        int i;
        int i2 = this.f36288c;
        op0.m42517g(i2 >= 0 && (i2 < (i = this.f36287b) || (i2 == i && this.f36289d == 0)));
    }

    /* renamed from: b */
    public int m40025b() {
        return (this.f36288c * 8) + this.f36289d;
    }

    /* renamed from: c */
    public boolean m40026c() {
        boolean z = (((this.f36286a[this.f36288c] & 255) >> this.f36289d) & 1) == 1;
        m40028e(1);
        return z;
    }

    /* renamed from: d */
    public int m40027d(int i) {
        int i2 = this.f36288c;
        int iMin = Math.min(i, 8 - this.f36289d);
        int i3 = i2 + 1;
        int i4 = ((this.f36286a[i2] & 255) >> this.f36289d) & (Constants.MAX_HOST_LENGTH >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f36286a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m40028e(i);
        return i5;
    }

    /* renamed from: e */
    public void m40028e(int i) {
        int i2 = i / 8;
        int i3 = this.f36288c + i2;
        this.f36288c = i3;
        int i4 = this.f36289d + (i - (i2 * 8));
        this.f36289d = i4;
        if (i4 > 7) {
            this.f36288c = i3 + 1;
            this.f36289d = i4 - 8;
        }
        m40024a();
    }
}
