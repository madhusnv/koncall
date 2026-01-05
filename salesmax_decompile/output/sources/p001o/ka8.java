package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class ka8 extends occ {

    /* renamed from: a */
    public static final int[] f31733a = {1, 1, 1, 1};

    /* renamed from: b */
    public static final int[] f31734b = {3, 1, 1};

    /* renamed from: c */
    public static final int[][] f31735c = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.ITF) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iM41970b = occ.m41970b(zArr, 0, f31733a, true);
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 10);
            int iDigit2 = Character.digit(str.charAt(i + 1), 10);
            int[] iArr = new int[10];
            for (int i2 = 0; i2 < 5; i2++) {
                int i3 = i2 * 2;
                int[][] iArr2 = f31735c;
                iArr[i3] = iArr2[iDigit][i2];
                iArr[i3 + 1] = iArr2[iDigit2][i2];
            }
            iM41970b += occ.m41970b(zArr, iM41970b, iArr, true);
        }
        occ.m41970b(zArr, iM41970b, f31734b, true);
        return zArr;
    }
}
