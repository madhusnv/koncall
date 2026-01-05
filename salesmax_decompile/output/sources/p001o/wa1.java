package p001o;

import java.lang.reflect.Array;

/* loaded from: classes6.dex */
public final class wa1 {

    /* renamed from: a */
    public final xa1[] f51675a;

    /* renamed from: b */
    public int f51676b;

    /* renamed from: c */
    public final int f51677c;

    /* renamed from: d */
    public final int f51678d;

    public wa1(int i, int i2) {
        xa1[] xa1VarArr = new xa1[i];
        this.f51675a = xa1VarArr;
        int length = xa1VarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f51675a[i3] = new xa1(((i2 + 4) * 17) + 1);
        }
        this.f51678d = i2 * 17;
        this.f51677c = i;
        this.f51676b = -1;
    }

    /* renamed from: a */
    public xa1 m54127a() {
        return this.f51675a[this.f51676b];
    }

    /* renamed from: b */
    public byte[][] m54128b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f51677c * i2, this.f51678d * i);
        int i3 = this.f51677c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f51675a[i4 / i2].m55885b(i);
        }
        return bArr;
    }

    /* renamed from: c */
    public void m54129c() {
        this.f51676b++;
    }
}
