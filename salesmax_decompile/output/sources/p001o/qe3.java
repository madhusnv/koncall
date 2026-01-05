package p001o;

/* loaded from: classes6.dex */
public abstract class qe3 extends ncc {

    /* renamed from: a */
    public static final char[] f41755a = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: b */
    public static final int[] f41756b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: c */
    public static final char[] f41757c = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    public static boolean m45226a(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
