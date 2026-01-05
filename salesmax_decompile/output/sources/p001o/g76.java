package p001o;

import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p001o.pti;

/* loaded from: classes6.dex */
public abstract class g76 {

    /* renamed from: a */
    public static final int[] f24677a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: o.g76$a */
    public static /* synthetic */ class C13632a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24678a;

        static {
            int[] iArr = new int[pgb.values().length];
            f24678a = iArr;
            try {
                iArr[pgb.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24678a[pgb.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24678a[pgb.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24678a[pgb.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m28115a(String str, xh1 xh1Var, String str2) throws UnsupportedEncodingException, fdj {
        try {
            for (byte b : str.getBytes(str2)) {
                xh1Var.m56302c(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new fdj(e);
        }
    }

    /* renamed from: b */
    public static void m28116b(CharSequence charSequence, xh1 xh1Var) throws fdj {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iM28130p = m28130p(charSequence.charAt(i));
            if (iM28130p == -1) {
                throw new fdj();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iM28130p2 = m28130p(charSequence.charAt(i2));
                if (iM28130p2 == -1) {
                    throw new fdj();
                }
                xh1Var.m56302c((iM28130p * 45) + iM28130p2, 11);
                i += 2;
            } else {
                xh1Var.m56302c(iM28130p, 6);
                i = i2;
            }
        }
    }

    /* renamed from: c */
    public static void m28117c(String str, pgb pgbVar, xh1 xh1Var, String str2) throws UnsupportedEncodingException, fdj {
        int i = C13632a.f24678a[pgbVar.ordinal()];
        if (i == 1) {
            m28122h(str, xh1Var);
            return;
        }
        if (i == 2) {
            m28116b(str, xh1Var);
        } else if (i == 3) {
            m28115a(str, xh1Var, str2);
        } else {
            if (i != 4) {
                throw new fdj("Invalid mode: ".concat(String.valueOf(pgbVar)));
            }
            m28119e(str, xh1Var);
        }
    }

    /* renamed from: d */
    public static void m28118d(nh2 nh2Var, xh1 xh1Var) {
        xh1Var.m56302c(pgb.ECI.getBits(), 4);
        xh1Var.m56302c(nh2Var.getValue(), 8);
    }

    /* renamed from: e */
    public static void m28119e(String str, xh1 xh1Var) throws UnsupportedEncodingException, fdj {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i == -1) {
                    throw new fdj("Invalid byte sequence");
                }
                xh1Var.m56302c(((i >> 8) * Opcodes.CHECKCAST) + (i & Constants.MAX_HOST_LENGTH), 13);
            }
        } catch (UnsupportedEncodingException e) {
            throw new fdj(e);
        }
    }

    /* renamed from: f */
    public static void m28120f(int i, pti ptiVar, pgb pgbVar, xh1 xh1Var) throws fdj {
        int characterCountBits = pgbVar.getCharacterCountBits(ptiVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            xh1Var.m56302c(i, characterCountBits);
            return;
        }
        throw new fdj(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: g */
    public static void m28121g(pgb pgbVar, xh1 xh1Var) {
        xh1Var.m56302c(pgbVar.getBits(), 4);
    }

    /* renamed from: h */
    public static void m28122h(CharSequence charSequence, xh1 xh1Var) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                xh1Var.m56302c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    xh1Var.m56302c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    xh1Var.m56302c(iCharAt, 4);
                }
            }
        }
    }

    /* renamed from: i */
    public static int m28123i(pgb pgbVar, xh1 xh1Var, xh1 xh1Var2, pti ptiVar) {
        return xh1Var.m56306i() + pgbVar.getCharacterCountBits(ptiVar) + xh1Var2.m56306i();
    }

    /* renamed from: j */
    public static int m28124j(hq1 hq1Var) {
        return xsa.m56775a(hq1Var) + xsa.m56777c(hq1Var) + xsa.m56778d(hq1Var) + xsa.m56779e(hq1Var);
    }

    /* renamed from: k */
    public static int m28125k(xh1 xh1Var, hj6 hj6Var, pti ptiVar, hq1 hq1Var) throws fdj {
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            uza.m52181a(xh1Var, hj6Var, ptiVar, i3, hq1Var);
            int iM28124j = m28124j(hq1Var);
            if (iM28124j < i) {
                i2 = i3;
                i = iM28124j;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static pgb m28126l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m28133s(str)) {
            return pgb.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (m28130p(cCharAt) == -1) {
                    return pgb.BYTE;
                }
                z = true;
            }
        }
        return z ? pgb.ALPHANUMERIC : z2 ? pgb.NUMERIC : pgb.BYTE;
    }

    /* renamed from: m */
    public static pti m28127m(int i, hj6 hj6Var) throws fdj {
        for (int i2 = 1; i2 <= 40; i2++) {
            pti ptiVarM44164e = pti.m44164e(i2);
            if (m28136v(i, ptiVarM44164e, hj6Var)) {
                return ptiVarM44164e;
            }
        }
        throw new fdj("Data too big");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static x3e m28128n(String str, hj6 hj6Var, Map map) throws UnsupportedEncodingException, fdj {
        pti ptiVarM28134t;
        nh2 characterSetECIByName;
        boolean z = map != null && map.containsKey(z66.CHARACTER_SET);
        String string = z ? map.get(z66.CHARACTER_SET).toString() : "ISO-8859-1";
        pgb pgbVarM28126l = m28126l(str, string);
        xh1 xh1Var = new xh1();
        pgb pgbVar = pgb.BYTE;
        if (pgbVarM28126l == pgbVar && z && (characterSetECIByName = nh2.getCharacterSetECIByName(string)) != null) {
            m28118d(characterSetECIByName, xh1Var);
        }
        if ((map != null && map.containsKey(z66.GS1_FORMAT)) && Boolean.valueOf(map.get(z66.GS1_FORMAT).toString()).booleanValue()) {
            m28121g(pgb.FNC1_FIRST_POSITION, xh1Var);
        }
        m28121g(pgbVarM28126l, xh1Var);
        xh1 xh1Var2 = new xh1();
        m28117c(str, pgbVarM28126l, xh1Var2, string);
        if (map != null) {
            z66 z66Var = z66.QR_VERSION;
            if (map.containsKey(z66Var)) {
                ptiVarM28134t = pti.m44164e(Integer.parseInt(map.get(z66Var).toString()));
                if (!m28136v(m28123i(pgbVarM28126l, xh1Var, xh1Var2, ptiVarM28134t), ptiVarM28134t, hj6Var)) {
                    throw new fdj("Data too big for requested version");
                }
            } else {
                ptiVarM28134t = m28134t(hj6Var, pgbVarM28126l, xh1Var, xh1Var2);
            }
        }
        xh1 xh1Var3 = new xh1();
        xh1Var3.m56301b(xh1Var);
        m28120f(pgbVarM28126l == pgbVar ? xh1Var2.m56307j() : str.length(), ptiVarM28134t, pgbVarM28126l, xh1Var3);
        xh1Var3.m56301b(xh1Var2);
        pti.C16190b c16190bM44166c = ptiVarM28134t.m44166c(hj6Var);
        int iM44167d = ptiVarM28134t.m44167d() - c16190bM44166c.m44174d();
        m28135u(iM44167d, xh1Var3);
        xh1 xh1VarM28132r = m28132r(xh1Var3, ptiVarM28134t.m44167d(), iM44167d, c16190bM44166c.m44173c());
        x3e x3eVar = new x3e();
        x3eVar.m55616c(hj6Var);
        x3eVar.m55619f(pgbVarM28126l);
        x3eVar.m55620g(ptiVarM28134t);
        int iM44165b = ptiVarM28134t.m44165b();
        hq1 hq1Var = new hq1(iM44165b, iM44165b);
        int iM28125k = m28125k(xh1VarM28132r, hj6Var, ptiVarM28134t, hq1Var);
        x3eVar.m55617d(iM28125k);
        uza.m52181a(xh1VarM28132r, hj6Var, ptiVarM28134t, iM28125k, hq1Var);
        x3eVar.m55618e(hq1Var);
        return x3eVar;
    }

    /* renamed from: o */
    public static byte[] m28129o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new cge(do7.f20337l).m21199b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: p */
    public static int m28130p(int i) {
        int[] iArr = f24677a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: q */
    public static void m28131q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws fdj {
        if (i4 >= i3) {
            throw new fdj("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new fdj("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new fdj("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new fdj("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    /* renamed from: r */
    public static xh1 m28132r(xh1 xh1Var, int i, int i2, int i3) throws fdj {
        if (xh1Var.m56307j() != i2) {
            throw new fdj("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            m28131q(i, i2, i3, i5, iArr, iArr2);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            xh1Var.m56308l(i4 << 3, bArr, 0, i6);
            byte[] bArrM28129o = m28129o(bArr, iArr2[0]);
            arrayList.add(new yi1(bArr, bArrM28129o));
            iMax = Math.max(iMax, i6);
            iMax2 = Math.max(iMax2, bArrM28129o.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new fdj("Data bytes does not match offset");
        }
        xh1 xh1Var2 = new xh1();
        for (int i7 = 0; i7 < iMax; i7++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrM57852a = ((yi1) it.next()).m57852a();
                if (i7 < bArrM57852a.length) {
                    xh1Var2.m56302c(bArrM57852a[i7], 8);
                }
            }
        }
        for (int i8 = 0; i8 < iMax2; i8++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrM57853b = ((yi1) it2.next()).m57853b();
                if (i8 < bArrM57853b.length) {
                    xh1Var2.m56302c(bArrM57853b[i8], 8);
                }
            }
        }
        if (i == xh1Var2.m56307j()) {
            return xh1Var2;
        }
        throw new fdj("Interleaving error: " + i + " and " + xh1Var2.m56307j() + " differ.");
    }

    /* renamed from: s */
    public static boolean m28133s(String str) throws UnsupportedEncodingException {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: t */
    public static pti m28134t(hj6 hj6Var, pgb pgbVar, xh1 xh1Var, xh1 xh1Var2) {
        return m28127m(m28123i(pgbVar, xh1Var, xh1Var2, m28127m(m28123i(pgbVar, xh1Var, xh1Var2, pti.m44164e(1)), hj6Var)), hj6Var);
    }

    /* renamed from: u */
    public static void m28135u(int i, xh1 xh1Var) throws fdj {
        int i2 = i << 3;
        if (xh1Var.m56306i() > i2) {
            throw new fdj("data bits cannot fit in the QR Code" + xh1Var.m56306i() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && xh1Var.m56306i() < i2; i3++) {
            xh1Var.m56300a(false);
        }
        int iM56306i = xh1Var.m56306i() & 7;
        if (iM56306i > 0) {
            while (iM56306i < 8) {
                xh1Var.m56300a(false);
                iM56306i++;
            }
        }
        int iM56307j = i - xh1Var.m56307j();
        for (int i4 = 0; i4 < iM56307j; i4++) {
            xh1Var.m56302c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (xh1Var.m56306i() != i2) {
            throw new fdj("Bits size does not equal capacity");
        }
    }

    /* renamed from: v */
    public static boolean m28136v(int i, pti ptiVar, hj6 hj6Var) {
        return ptiVar.m44167d() - ptiVar.m44166c(hj6Var).m44174d() >= (i + 7) / 8;
    }
}
