package p001o;

/* loaded from: classes6.dex */
public abstract class x0i extends ncc {

    /* renamed from: a */
    public static final int[] f53036a = {1, 1, 1};

    /* renamed from: b */
    public static final int[] f53037b = {1, 1, 1, 1, 1};

    /* renamed from: c */
    public static final int[] f53038c = {1, 1, 1, 1, 1, 1};

    /* renamed from: d */
    public static final int[][] f53039d;

    /* renamed from: e */
    public static final int[][] f53040e;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f53039d = iArr;
        int[][] iArr2 = new int[20][];
        f53040e = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f53039d[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f53040e[i] = iArr4;
        }
    }

    /* renamed from: a */
    public static boolean m55542a(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        return m55543b(charSequence.subSequence(0, i)) == Character.digit(charSequence.charAt(i), 10);
    }

    /* renamed from: b */
    public static int m55543b(CharSequence charSequence) throws hf7 {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int iCharAt = charSequence.charAt(i2) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw hf7.m30357a();
            }
            i += iCharAt;
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int iCharAt2 = charSequence.charAt(i4) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw hf7.m30357a();
            }
            i3 += iCharAt2;
        }
        return (1000 - i3) % 10;
    }
}
