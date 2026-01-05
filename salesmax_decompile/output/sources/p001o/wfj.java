package p001o;

import com.google.firebase.perf.util.Constants;
import java.io.EOFException;
import org.objectweb.asm.Opcodes;

/* loaded from: classes6.dex */
public abstract class wfj {

    /* renamed from: a */
    public static final mge f51912a = new mge("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: a */
    public static final boolean m54337a(String str) {
        sq8.m48649h(str, "<this>");
        return f51912a.m38995g(str);
    }

    /* renamed from: b */
    public static final byte[] m54338b(byte[] bArr) {
        sq8.m48649h(bArr, "address");
        return m54346j(bArr) ? gp0.v0(bArr, bce.m18616s(12, 16)) : bArr;
    }

    /* renamed from: c */
    public static final boolean m54339c(String str) {
        sq8.m48649h(str, "<this>");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (sq8.m48651j(cCharAt, 31) <= 0 || sq8.m48651j(cCharAt, Opcodes.LAND) >= 0 || f9g.a0(" #%/:?@[\\]", cCharAt, 0, false, 6, null) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m54340d(String str) {
        sq8.m48649h(str, "<this>");
        int length = str.length();
        if (!(1 <= length && length < 254)) {
            return true;
        }
        int i = 0;
        while (true) {
            int iA0 = f9g.a0(str, '.', i, false, 4, null);
            int length2 = iA0 == -1 ? str.length() - i : iA0 - i;
            if (!(1 <= length2 && length2 < 64)) {
                return true;
            }
            if (iA0 == -1 || iA0 == str.length() - 1) {
                break;
            }
            i = iA0 + 1;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m54341e(String str, int i, int i2, byte[] bArr, int i3) {
        sq8.m48649h(str, "input");
        sq8.m48649h(bArr, "address");
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char cCharAt = str.charAt(i5);
                if (sq8.m48651j(cCharAt, 48) < 0 || sq8.m48651j(cCharAt, 57) > 0) {
                    break;
                }
                if ((i6 == 0 && i != i5) || (i6 = ((i6 * 10) + cCharAt) - 48) > 255) {
                    return false;
                }
                i5++;
            }
            if (i5 - i == 0) {
                return false;
            }
            bArr[i4] = (byte) i6;
            i4++;
            i = i5;
        }
        return i4 == i3 + 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r13 == 16) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r14 != (-1)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a0, code lost:
    
        p001o.fp0.m27256e(r9, r9, 16 - (r13 - r14), r14, r13);
        p001o.fp0.m27267p(r9, (byte) 0, r14, (16 - r13) + r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] m54342f(String str, int i, int i2) {
        int i3;
        sq8.m48649h(str, "input");
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = -1;
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i4 < i2) {
                if (i7 != 16) {
                    int i8 = i4 + 2;
                    if (i8 <= i2 && e9g.m24596J(str, "::", i4, false, 4, null)) {
                        if (i5 == -1) {
                            i7 += 2;
                            if (i8 != i2) {
                                i6 = i8;
                                i5 = i7;
                                i4 = i6;
                                int i9 = 0;
                                while (i4 < i2) {
                                }
                                i3 = i4 - i6;
                                if (i3 == 0) {
                                    break;
                                }
                                break;
                                break;
                            }
                            i5 = i7;
                            break;
                        }
                        return null;
                    }
                    if (i7 != 0) {
                        if (e9g.m24596J(str, ":", i4, false, 4, null)) {
                            i4++;
                        } else {
                            if (!e9g.m24596J(str, ".", i4, false, 4, null) || !m54341e(str, i6, i2, bArr, i7 - 2)) {
                                return null;
                            }
                            i7 += 2;
                        }
                    }
                    i6 = i4;
                    i4 = i6;
                    int i92 = 0;
                    while (i4 < i2) {
                        int iM28612A = ggj.m28612A(str.charAt(i4));
                        if (iM28612A == -1) {
                            break;
                        }
                        i92 = (i92 << 4) + iM28612A;
                        i4++;
                    }
                    i3 = i4 - i6;
                    if (i3 == 0 || i3 > 4) {
                        break;
                    }
                    int i10 = i7 + 1;
                    bArr[i7] = (byte) ((i92 >>> 8) & Constants.MAX_HOST_LENGTH);
                    i7 = i10 + 1;
                    bArr[i10] = (byte) (i92 & Constants.MAX_HOST_LENGTH);
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final String m54343g(String str) throws EOFException {
        sq8.m48649h(str, "host");
        rl1 rl1VarN0 = new rl1().n0(str);
        rl1 rl1Var = new rl1();
        while (!rl1VarN0.mo32311n()) {
            if (!ub8.m51334a().m49691c(rl1VarN0.m46910X(), rl1Var)) {
                return null;
            }
        }
        rl1VarN0.n0(zfj.m59381a(rl1Var.m46909T()));
        h3e h3eVar = h3e.f26175a;
        String strM29780c = h3eVar.m29780c(rl1VarN0.m46909T());
        if (strM29780c != null && sq8.m48644c(strM29780c, zfj.m59381a(strM29780c))) {
            return h3eVar.m29782e(strM29780c);
        }
        return null;
    }

    /* renamed from: h */
    public static final String m54344h(byte[] bArr) {
        sq8.m48649h(bArr, "address");
        if (bArr.length == 4) {
            return new rl1().I0(ggj.m28622b(bArr[0], Constants.MAX_HOST_LENGTH)).T1(46).I0(ggj.m28622b(bArr[1], Constants.MAX_HOST_LENGTH)).T1(46).I0(ggj.m28622b(bArr[2], Constants.MAX_HOST_LENGTH)).T1(46).I0(ggj.m28622b(bArr[3], Constants.MAX_HOST_LENGTH)).m46909T();
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: i */
    public static final String m54345i(byte[] bArr) {
        sq8.m48649h(bArr, "address");
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i3;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        rl1 rl1Var = new rl1();
        while (i2 < bArr.length) {
            if (i2 == i) {
                rl1Var.T1(58);
                i2 += i4;
                if (i2 == 16) {
                    rl1Var.T1(58);
                }
            } else {
                if (i2 > 0) {
                    rl1Var.T1(58);
                }
                rl1Var.t2((ggj.m28622b(bArr[i2], Constants.MAX_HOST_LENGTH) << 8) | ggj.m28622b(bArr[i2 + 1], Constants.MAX_HOST_LENGTH));
                i2 += 2;
            }
        }
        return rl1Var.m46909T();
    }

    /* renamed from: j */
    public static final boolean m54346j(byte[] bArr) {
        if (bArr.length != 16) {
            return false;
        }
        for (int i = 0; i < 10; i++) {
            if (bArr[i] != 0) {
                return false;
            }
        }
        return bArr[10] == -1 && bArr[11] == -1;
    }

    /* renamed from: k */
    public static final String m54347k(String str) {
        sq8.m48649h(str, "<this>");
        if (!f9g.m26306P(str, ":", false, 2, null)) {
            String strM54343g = m54343g(str);
            if (strM54343g == null) {
                return null;
            }
            if ((strM54343g.length() == 0) || m54339c(strM54343g) || m54340d(strM54343g)) {
                return null;
            }
            return strM54343g;
        }
        byte[] bArrM54342f = (e9g.m24597K(str, "[", false, 2, null) && e9g.m24605w(str, "]", false, 2, null)) ? m54342f(str, 1, str.length() - 1) : m54342f(str, 0, str.length());
        if (bArrM54342f == null) {
            return null;
        }
        byte[] bArrM54338b = m54338b(bArrM54342f);
        if (bArrM54338b.length == 16) {
            return m54345i(bArrM54338b);
        }
        if (bArrM54338b.length == 4) {
            return m54344h(bArrM54338b);
        }
        throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
    }
}
