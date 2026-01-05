package p001o;

import android.content.res.Configuration;

/* loaded from: classes2.dex */
public abstract class ee0 {
    /* renamed from: c */
    public static final float m24831c(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    /* renamed from: d */
    public static final qh9 m24832d(Configuration configuration) {
        sq8.m48649h(configuration, "<this>");
        return m24833e(configuration.getLayoutDirection());
    }

    /* renamed from: e */
    public static final qh9 m24833e(int i) {
        return i != 0 ? i != 1 ? qh9.Ltr : qh9.Rtl : qh9.Ltr;
    }

    /* renamed from: f */
    public static final void m24834f(float[] fArr, float[] fArr2) {
        float fM24831c = m24831c(fArr2, 0, fArr, 0);
        float fM24831c2 = m24831c(fArr2, 0, fArr, 1);
        float fM24831c3 = m24831c(fArr2, 0, fArr, 2);
        float fM24831c4 = m24831c(fArr2, 0, fArr, 3);
        float fM24831c5 = m24831c(fArr2, 1, fArr, 0);
        float fM24831c6 = m24831c(fArr2, 1, fArr, 1);
        float fM24831c7 = m24831c(fArr2, 1, fArr, 2);
        float fM24831c8 = m24831c(fArr2, 1, fArr, 3);
        float fM24831c9 = m24831c(fArr2, 2, fArr, 0);
        float fM24831c10 = m24831c(fArr2, 2, fArr, 1);
        float fM24831c11 = m24831c(fArr2, 2, fArr, 2);
        float fM24831c12 = m24831c(fArr2, 2, fArr, 3);
        float fM24831c13 = m24831c(fArr2, 3, fArr, 0);
        float fM24831c14 = m24831c(fArr2, 3, fArr, 1);
        float fM24831c15 = m24831c(fArr2, 3, fArr, 2);
        float fM24831c16 = m24831c(fArr2, 3, fArr, 3);
        fArr[0] = fM24831c;
        fArr[1] = fM24831c2;
        fArr[2] = fM24831c3;
        fArr[3] = fM24831c4;
        fArr[4] = fM24831c5;
        fArr[5] = fM24831c6;
        fArr[6] = fM24831c7;
        fArr[7] = fM24831c8;
        fArr[8] = fM24831c9;
        fArr[9] = fM24831c10;
        fArr[10] = fM24831c11;
        fArr[11] = fM24831c12;
        fArr[12] = fM24831c13;
        fArr[13] = fM24831c14;
        fArr[14] = fM24831c15;
        fArr[15] = fM24831c16;
    }
}
