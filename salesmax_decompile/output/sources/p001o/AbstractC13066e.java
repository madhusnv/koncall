package p001o;

/* renamed from: o.e */
/* loaded from: classes6.dex */
public abstract class AbstractC13066e {
    /* renamed from: a */
    public static final int m23984a(int[] iArr, int i, int i2, int i3) {
        sq8.m48649h(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    /* renamed from: b */
    public static final int m23985b(mbf mbfVar, int i) {
        sq8.m48649h(mbfVar, "<this>");
        int iM23984a = m23984a(mbfVar.m38691T(), i + 1, 0, mbfVar.m38692U().length);
        return iM23984a >= 0 ? iM23984a : ~iM23984a;
    }
}
