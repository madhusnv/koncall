package p001o;

/* loaded from: classes2.dex */
public abstract class pke {
    /* renamed from: a */
    public static int m43810a(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (m43811b(i4, i2)) {
                return i4;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m43811b(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }
}
