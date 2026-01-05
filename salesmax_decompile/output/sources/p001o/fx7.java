package p001o;

/* loaded from: classes3.dex */
public abstract class fx7 {
    /* renamed from: a */
    public static int m27709a(int i, double d) {
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax <= ((int) (d * iHighestOneBit))) {
            return iHighestOneBit;
        }
        int i2 = iHighestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    /* renamed from: b */
    public static int m27710b(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* renamed from: c */
    public static int m27711c(Object obj) {
        return m27710b(obj == null ? 0 : obj.hashCode());
    }
}
