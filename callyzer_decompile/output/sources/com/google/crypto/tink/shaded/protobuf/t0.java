package com.google.crypto.tink.shaded.protobuf;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class t0 {
    /* renamed from: a */
    public static void m4397a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (!m4415u(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !m4415u(b12) && !m4415u(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.m4149a();
    }

    /* renamed from: b */
    public static void m4398b(byte b10, byte b11, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (b10 < -62 || m4415u(b11)) {
            throw InvalidProtocolBufferException.m4149a();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    /* renamed from: c */
    public static void m4399c(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
        if (m4415u(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m4415u(b12)))) {
            throw InvalidProtocolBufferException.m4149a();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    /* renamed from: d */
    public static final String m4400d(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    /* renamed from: e */
    public static int m4401e(byte[] bArr, int i10, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4411p = m4411p(bArr, i10, c1377d);
        int i11 = c1377d.f7027a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        if (i11 > bArr.length - iM4411p) {
            throw InvalidProtocolBufferException.m4154f();
        }
        if (i11 == 0) {
            c1377d.f7029c = AbstractC1382i.f7044b;
            return iM4411p;
        }
        c1377d.f7029c = AbstractC1382i.m4277c(iM4411p, i11, bArr);
        return iM4411p + i11;
    }

    /* renamed from: f */
    public static int m4402f(int i10, byte[] bArr) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: g */
    public static long m4403g(int i10, byte[] bArr) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* renamed from: h */
    public static int m4404h(f1 f1Var, byte[] bArr, int i10, int i11, int i12, C1377d c1377d) {
        u0 u0Var = (u0) f1Var;
        Object objMo4216c = u0Var.mo4216c();
        int iM4431F = u0Var.m4431F(objMo4216c, bArr, i10, i11, i12, c1377d);
        u0Var.mo4214a(objMo4216c);
        c1377d.f7029c = objMo4216c;
        return iM4431F;
    }

    /* renamed from: i */
    public static int m4405i(f1 f1Var, byte[] bArr, int i10, int i11, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4410o = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM4410o = m4410o(i12, bArr, iM4410o, c1377d);
            i12 = c1377d.f7027a;
        }
        int i13 = iM4410o;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.m4154f();
        }
        Object objMo4216c = f1Var.mo4216c();
        int i14 = i13 + i12;
        f1Var.mo4220g(objMo4216c, bArr, i13, i14, c1377d);
        f1Var.mo4214a(objMo4216c);
        c1377d.f7029c = objMo4216c;
        return i14;
    }

    /* renamed from: j */
    public static int m4406j(f1 f1Var, int i10, byte[] bArr, int i11, int i12, f0 f0Var, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4405i = m4405i(f1Var, bArr, i11, i12, c1377d);
        f0Var.add(c1377d.f7029c);
        while (iM4405i < i12) {
            int iM4411p = m4411p(bArr, iM4405i, c1377d);
            if (i10 != c1377d.f7027a) {
                break;
            }
            iM4405i = m4405i(f1Var, bArr, iM4411p, i12, c1377d);
            f0Var.add(c1377d.f7029c);
        }
        return iM4405i;
    }

    /* renamed from: k */
    public static int m4407k(byte[] bArr, int i10, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4411p = m4411p(bArr, i10, c1377d);
        int i11 = c1377d.f7027a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        if (i11 == 0) {
            c1377d.f7029c = "";
            return iM4411p;
        }
        c1377d.f7029c = new String(bArr, iM4411p, i11, g0.f7037a);
        return iM4411p + i11;
    }

    /* renamed from: l */
    public static int m4408l(byte[] bArr, int i10, C1377d c1377d) throws InvalidProtocolBufferException {
        int iM4411p = m4411p(bArr, i10, c1377d);
        int i11 = c1377d.f7027a;
        if (i11 < 0) {
            throw InvalidProtocolBufferException.m4152d();
        }
        if (i11 == 0) {
            c1377d.f7029c = "";
            return iM4411p;
        }
        c1377d.f7029c = u1.f7121a.mo4394n(iM4411p, i11, bArr);
        return iM4411p + i11;
    }

    /* renamed from: m */
    public static int m4409m(int i10, byte[] bArr, int i11, int i12, i1 i1Var, C1377d c1377d) throws InvalidProtocolBufferException {
        if ((i10 >>> 3) == 0) {
            throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM4413r = m4413r(bArr, i11, c1377d);
            i1Var.m4285c(i10, Long.valueOf(c1377d.f7028b));
            return iM4413r;
        }
        if (i13 == 1) {
            i1Var.m4285c(i10, Long.valueOf(m4403g(i11, bArr)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM4411p = m4411p(bArr, i11, c1377d);
            int i14 = c1377d.f7027a;
            if (i14 < 0) {
                throw InvalidProtocolBufferException.m4152d();
            }
            if (i14 > bArr.length - iM4411p) {
                throw InvalidProtocolBufferException.m4154f();
            }
            if (i14 == 0) {
                i1Var.m4285c(i10, AbstractC1382i.f7044b);
            } else {
                i1Var.m4285c(i10, AbstractC1382i.m4277c(iM4411p, i14, bArr));
            }
            return iM4411p + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
            }
            i1Var.m4285c(i10, Integer.valueOf(m4402f(i11, bArr)));
            return i11 + 4;
        }
        i1 i1VarM4283b = i1.m4283b();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iM4411p2 = m4411p(bArr, i11, c1377d);
            int i17 = c1377d.f7027a;
            if (i17 == i15) {
                i16 = i17;
                i11 = iM4411p2;
                break;
            }
            i11 = m4409m(i17, bArr, iM4411p2, i12, i1VarM4283b, c1377d);
            i16 = i17;
        }
        if (i11 > i12 || i16 != i15) {
            throw InvalidProtocolBufferException.m4153e();
        }
        i1Var.m4285c(i10, i1VarM4283b);
        return i11;
    }

    /* renamed from: o */
    public static int m4410o(int i10, byte[] bArr, int i11, C1377d c1377d) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            c1377d.f7027a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            c1377d.f7027a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            c1377d.f7027a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            c1377d.f7027a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c1377d.f7027a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* renamed from: p */
    public static int m4411p(byte[] bArr, int i10, C1377d c1377d) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m4410o(b10, bArr, i11, c1377d);
        }
        c1377d.f7027a = b10;
        return i11;
    }

    /* renamed from: q */
    public static int m4412q(int i10, byte[] bArr, int i11, int i12, f0 f0Var, C1377d c1377d) {
        b0 b0Var = (b0) f0Var;
        int iM4411p = m4411p(bArr, i11, c1377d);
        b0Var.m4168b(c1377d.f7027a);
        while (iM4411p < i12) {
            int iM4411p2 = m4411p(bArr, iM4411p, c1377d);
            if (i10 != c1377d.f7027a) {
                break;
            }
            iM4411p = m4411p(bArr, iM4411p2, c1377d);
            b0Var.m4168b(c1377d.f7027a);
        }
        return iM4411p;
    }

    /* renamed from: r */
    public static int m4413r(byte[] bArr, int i10, C1377d c1377d) {
        int i11 = i10 + 1;
        long j6 = bArr[i10];
        if (j6 >= 0) {
            c1377d.f7028b = j6;
            return i11;
        }
        int i12 = i10 + 2;
        byte b10 = bArr[i11];
        long j10 = (j6 & 127) | ((b10 & 127) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            i13 += 7;
            j10 |= (r10 & 127) << i13;
            b10 = bArr[i12];
            i12 = i14;
        }
        c1377d.f7028b = j10;
        return i12;
    }

    /* renamed from: t */
    public static String m4414t(AbstractC1382i abstractC1382i) {
        StringBuilder sb2 = new StringBuilder(abstractC1382i.size());
        for (int i10 = 0; i10 < abstractC1382i.size(); i10++) {
            byte bMo4224a = abstractC1382i.mo4224a(i10);
            if (bMo4224a == 34) {
                sb2.append("\\\"");
            } else if (bMo4224a == 39) {
                sb2.append("\\'");
            } else if (bMo4224a != 92) {
                switch (bMo4224a) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bMo4224a < 32 || bMo4224a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((bMo4224a >>> 6) & 3) + 48));
                            sb2.append((char) (((bMo4224a >>> 3) & 7) + 48));
                            sb2.append((char) ((bMo4224a & 7) + 48));
                            break;
                        } else {
                            sb2.append((char) bMo4224a);
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* renamed from: u */
    public static boolean m4415u(byte b10) {
        return b10 > -65;
    }

    /* renamed from: x */
    public static final void m4416x(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m4416x(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m4416x(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            C1381h c1381h = AbstractC1382i.f7044b;
            sb2.append(m4414t(new C1381h(((String) obj).getBytes(g0.f7037a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof AbstractC1382i) {
            sb2.append(": \"");
            sb2.append(m4414t((AbstractC1382i) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof a0) {
            sb2.append(" {");
            m4417y((a0) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj.toString());
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        m4416x(sb2, i13, TransferTable.COLUMN_KEY, entry.getKey());
        m4416x(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b1  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m4417y(com.google.crypto.tink.shaded.protobuf.a0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.t0.m4417y(com.google.crypto.tink.shaded.protobuf.a0, java.lang.StringBuilder, int):void");
    }

    /* renamed from: n */
    public abstract String mo4394n(int i10, int i11, byte[] bArr);

    /* renamed from: s */
    public abstract int mo4395s(String str, byte[] bArr, int i10, int i11);

    /* renamed from: v */
    public boolean m4418v(int i10, int i11, byte[] bArr) {
        return mo4396w(i10, i11, bArr) == 0;
    }

    /* renamed from: w */
    public abstract int mo4396w(int i10, int i11, byte[] bArr);
}
