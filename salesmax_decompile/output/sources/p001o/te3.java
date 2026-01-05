package p001o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
public final class te3 extends occ {

    /* renamed from: o.te3$a */
    public enum EnumC17064a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: f */
    public static int m49762f(CharSequence charSequence, int i, int i2) {
        EnumC17064a enumC17064aM49763g;
        EnumC17064a enumC17064aM49763g2;
        char cCharAt;
        EnumC17064a enumC17064aM49763g3 = m49763g(charSequence, i);
        EnumC17064a enumC17064a = EnumC17064a.ONE_DIGIT;
        if (enumC17064aM49763g3 == enumC17064a) {
            return 100;
        }
        EnumC17064a enumC17064a2 = EnumC17064a.UNCODABLE;
        if (enumC17064aM49763g3 == enumC17064a2) {
            return (i >= charSequence.length() || ((cCharAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || cCharAt >= '`'))) ? 100 : 101;
        }
        if (i2 == 99) {
            return 99;
        }
        if (i2 != 100) {
            if (enumC17064aM49763g3 == EnumC17064a.FNC_1) {
                enumC17064aM49763g3 = m49763g(charSequence, i + 1);
            }
            return enumC17064aM49763g3 == EnumC17064a.TWO_DIGITS ? 99 : 100;
        }
        EnumC17064a enumC17064a3 = EnumC17064a.FNC_1;
        if (enumC17064aM49763g3 == enumC17064a3 || (enumC17064aM49763g = m49763g(charSequence, i + 2)) == enumC17064a2 || enumC17064aM49763g == enumC17064a) {
            return 100;
        }
        if (enumC17064aM49763g == enumC17064a3) {
            return m49763g(charSequence, i + 3) == EnumC17064a.TWO_DIGITS ? 99 : 100;
        }
        int i3 = i + 4;
        while (true) {
            enumC17064aM49763g2 = m49763g(charSequence, i3);
            if (enumC17064aM49763g2 != EnumC17064a.TWO_DIGITS) {
                break;
            }
            i3 += 2;
        }
        return enumC17064aM49763g2 == EnumC17064a.ONE_DIGIT ? 100 : 99;
    }

    /* renamed from: g */
    public static EnumC17064a m49763g(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return EnumC17064a.UNCODABLE;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == 241) {
            return EnumC17064a.FNC_1;
        }
        if (cCharAt < '0' || cCharAt > '9') {
            return EnumC17064a.UNCODABLE;
        }
        int i2 = i + 1;
        if (i2 >= length) {
            return EnumC17064a.ONE_DIGIT;
        }
        char cCharAt2 = charSequence.charAt(i2);
        return (cCharAt2 < '0' || cCharAt2 > '9') ? EnumC17064a.ONE_DIGIT : EnumC17064a.TWO_DIGITS;
    }

    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.CODE_128) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) throws NumberFormatException {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int iM41970b = 0;
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(cCharAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (true) {
            int i6 = 103;
            if (i2 >= length) {
                int[][] iArr = se3.f45309a;
                arrayList.add(iArr[i3 % 103]);
                arrayList.add(iArr[106]);
                int i7 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i8 : iArr2) {
                        i7 += i8;
                    }
                }
                boolean[] zArr = new boolean[i7];
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    iM41970b += occ.m41970b(zArr, iM41970b, (int[]) it.next(), true);
                }
                return zArr;
            }
            int iM49762f = m49762f(str, i2, i4);
            int iCharAt = 100;
            if (iM49762f == i4) {
                switch (str.charAt(i2)) {
                    case 241:
                        iCharAt = 102;
                        break;
                    case 242:
                        iCharAt = 97;
                        break;
                    case 243:
                        iCharAt = 96;
                        break;
                    case 244:
                        if (i4 == 101) {
                            iCharAt = 101;
                            break;
                        }
                        break;
                    default:
                        if (i4 != 100) {
                            if (i4 != 101) {
                                iCharAt = Integer.parseInt(str.substring(i2, i2 + 2));
                                i2++;
                                break;
                            } else {
                                iCharAt = str.charAt(i2) - ' ';
                                if (iCharAt < 0) {
                                    iCharAt += 96;
                                    break;
                                }
                            }
                        } else {
                            iCharAt = str.charAt(i2) - ' ';
                            break;
                        }
                        break;
                }
                i2++;
            } else {
                if (i4 != 0) {
                    i6 = iM49762f;
                } else if (iM49762f == 100) {
                    i6 = 104;
                } else if (iM49762f != 101) {
                    i6 = 105;
                }
                iCharAt = i6;
                i4 = iM49762f;
            }
            arrayList.add(se3.f45309a[iCharAt]);
            i3 += iCharAt * i5;
            if (i2 != 0) {
                i5++;
            }
        }
    }
}
