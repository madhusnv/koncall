package p001o;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes6.dex */
public final class cic implements ddj {
    /* renamed from: b */
    public static yh1 m21299b(byte[][] bArr, int i) {
        int i2 = i * 2;
        yh1 yh1Var = new yh1(bArr[0].length + i2, bArr.length + i2);
        yh1Var.clear();
        int iM57801f = (yh1Var.m57801f() - i) - 1;
        int i3 = 0;
        while (i3 < bArr.length) {
            byte[] bArr2 = bArr[i3];
            for (int i4 = 0; i4 < bArr[0].length; i4++) {
                if (bArr2[i4] == 1) {
                    yh1Var.m57803h(i4 + i, iM57801f);
                }
            }
            i3++;
            iM57801f--;
        }
        return yh1Var;
    }

    /* renamed from: c */
    public static yh1 m21300c(zhc zhcVar, String str, int i, int i2, int i3, int i4) throws fdj {
        boolean z;
        zhcVar.m59458e(str, i);
        byte[][] bArrM54128b = zhcVar.m59459f().m54128b(1, 4);
        if ((i3 > i2) != (bArrM54128b[0].length < bArrM54128b.length)) {
            bArrM54128b = m21301d(bArrM54128b);
            z = true;
        } else {
            z = false;
        }
        int length = i2 / bArrM54128b[0].length;
        int length2 = i3 / bArrM54128b.length;
        if (length >= length2) {
            length = length2;
        }
        if (length <= 1) {
            return m21299b(bArrM54128b, i4);
        }
        byte[][] bArrM54128b2 = zhcVar.m59459f().m54128b(length, length << 2);
        if (z) {
            bArrM54128b2 = m21301d(bArrM54128b2);
        }
        return m21299b(bArrM54128b2, i4);
    }

    /* renamed from: d */
    public static byte[][] m21301d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var != va1.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(va1Var)));
        }
        zhc zhcVar = new zhc();
        if (map != null) {
            z66 z66Var = z66.PDF417_COMPACT;
            if (map.containsKey(z66Var)) {
                zhcVar.m59460h(Boolean.valueOf(map.get(z66Var).toString()).booleanValue());
            }
            z66 z66Var2 = z66.PDF417_COMPACTION;
            if (map.containsKey(z66Var2)) {
                zhcVar.m59461i(ck3.valueOf(map.get(z66Var2).toString()));
            }
            z66 z66Var3 = z66.PDF417_DIMENSIONS;
            if (map.containsKey(z66Var3)) {
                tq.m50332a(map.get(z66Var3));
                throw null;
            }
            z66 z66Var4 = z66.MARGIN;
            i = map.containsKey(z66Var4) ? Integer.parseInt(map.get(z66Var4).toString()) : 30;
            z66 z66Var5 = z66.ERROR_CORRECTION;
            i = map.containsKey(z66Var5) ? Integer.parseInt(map.get(z66Var5).toString()) : 2;
            z66 z66Var6 = z66.CHARACTER_SET;
            if (map.containsKey(z66Var6)) {
                zhcVar.m59462j(Charset.forName(map.get(z66Var6).toString()));
            }
        }
        return m21300c(zhcVar, str, i, i, i2, i);
    }
}
