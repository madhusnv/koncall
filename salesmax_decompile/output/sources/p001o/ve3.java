package p001o;

import java.util.Map;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public final class ve3 extends occ {
    /* renamed from: f */
    public static void m52653f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m52654g(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == 0) {
                sb.append("%U");
            } else if (cCharAt == ' ') {
                sb.append(cCharAt);
            } else if (cCharAt == '@') {
                sb.append("%V");
            } else if (cCharAt == '`') {
                sb.append("%W");
            } else if (cCharAt != '-' && cCharAt != '.') {
                if (cCharAt <= 26) {
                    sb.append('$');
                    sb.append((char) ((cCharAt - 1) + 65));
                } else if (cCharAt < ' ') {
                    sb.append('%');
                    sb.append((char) ((cCharAt - 27) + 65));
                } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                    sb.append('/');
                    sb.append((char) ((cCharAt - '!') + 65));
                } else if (cCharAt <= '9') {
                    sb.append((char) ((cCharAt - '0') + 48));
                } else if (cCharAt <= '?') {
                    sb.append('%');
                    sb.append((char) ((cCharAt - ';') + 70));
                } else if (cCharAt <= 'Z') {
                    sb.append((char) ((cCharAt - 'A') + 65));
                } else if (cCharAt <= '_') {
                    sb.append('%');
                    sb.append((char) ((cCharAt - '[') + 75));
                } else if (cCharAt <= 'z') {
                    sb.append('+');
                    sb.append((char) ((cCharAt - 'a') + 65));
                } else {
                    if (cCharAt > 127) {
                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                    }
                    sb.append('%');
                    sb.append((char) ((cCharAt - '{') + 80));
                }
            }
        }
        return sb.toString();
    }

    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.CODE_39) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = m52654g(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i++;
            }
        }
        int[] iArr = new int[9];
        int i2 = length + 25;
        for (int i3 = 0; i3 < length; i3++) {
            m52653f(ue3.f48753a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            for (int i4 = 0; i4 < 9; i4++) {
                i2 += iArr[i4];
            }
        }
        boolean[] zArr = new boolean[i2];
        m52653f(Opcodes.LCMP, iArr);
        int iM41970b = occ.m41970b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iM41970b2 = iM41970b + occ.m41970b(zArr, iM41970b, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            m52653f(ue3.f48753a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
            int iM41970b3 = iM41970b2 + occ.m41970b(zArr, iM41970b2, iArr, true);
            iM41970b2 = iM41970b3 + occ.m41970b(zArr, iM41970b3, iArr2, false);
        }
        m52653f(Opcodes.LCMP, iArr);
        occ.m41970b(zArr, iM41970b2, iArr, true);
        return zArr;
    }
}
