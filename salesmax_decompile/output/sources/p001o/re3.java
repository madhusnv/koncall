package p001o;

/* loaded from: classes6.dex */
public final class re3 extends occ {

    /* renamed from: a */
    public static final char[] f43429a;

    /* renamed from: b */
    public static final char[] f43430b = {'T', 'N', '*', 'E'};

    /* renamed from: c */
    public static final char[] f43431c = {'/', ':', '+', '.'};

    /* renamed from: d */
    public static final char f43432d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f43429a = cArr;
        f43432d = cArr[0];
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int i;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c = f43432d;
            sb.append(c);
            sb.append(str);
            sb.append(c);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f43429a;
            boolean zM45226a = qe3.m45226a(cArr, upperCase);
            boolean zM45226a2 = qe3.m45226a(cArr, upperCase2);
            char[] cArr2 = f43430b;
            boolean zM45226a3 = qe3.m45226a(cArr2, upperCase);
            boolean zM45226a4 = qe3.m45226a(cArr2, upperCase2);
            if (zM45226a) {
                if (!zM45226a2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zM45226a3) {
                if (zM45226a2 || zM45226a4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c2 = f43432d;
                sb2.append(c2);
                sb2.append(str);
                sb2.append(c2);
                str = sb2.toString();
            } else if (!zM45226a4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i2 = 20;
        for (int i3 = 1; i3 < str.length() - 1; i3++) {
            if (Character.isDigit(str.charAt(i3)) || str.charAt(i3) == '-' || str.charAt(i3) == '$') {
                i2 += 9;
            } else {
                if (!qe3.m45226a(f43431c, str.charAt(i3))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i3) + '\'');
                }
                i2 += 10;
            }
        }
        boolean[] zArr = new boolean[i2 + (str.length() - 1)];
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i5));
            if (i5 == 0 || i5 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i6 = 0;
            while (true) {
                char[] cArr3 = qe3.f41755a;
                if (i6 >= cArr3.length) {
                    i = 0;
                    break;
                }
                if (upperCase3 == cArr3[i6]) {
                    i = qe3.f41756b[i6];
                    break;
                }
                i6++;
            }
            int i7 = 0;
            int i8 = 0;
            boolean z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i >> (6 - i7)) & 1) == 0 || i8 == 1) {
                    z = !z;
                    i7++;
                    i8 = 0;
                } else {
                    i8++;
                }
            }
            if (i5 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
