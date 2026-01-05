package p001o;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* loaded from: classes6.dex */
public final class k91 implements ddj {
    /* renamed from: b */
    public static yh1 m35180b(String str, va1 va1Var, int i, int i2, Charset charset, int i3, int i4) {
        if (va1Var == va1.AZTEC) {
            return m35181c(e76.m24467d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(va1Var)));
    }

    /* renamed from: c */
    public static yh1 m35181c(j91 j91Var, int i, int i2) {
        yh1 yh1VarM33418a = j91Var.m33418a();
        if (yh1VarM33418a == null) {
            throw new IllegalStateException();
        }
        int iM57802g = yh1VarM33418a.m57802g();
        int iM57801f = yh1VarM33418a.m57801f();
        int iMax = Math.max(i, iM57802g);
        int iMax2 = Math.max(i2, iM57801f);
        int iMin = Math.min(iMax / iM57802g, iMax2 / iM57801f);
        int i3 = (iMax - (iM57802g * iMin)) / 2;
        int i4 = (iMax2 - (iM57801f * iMin)) / 2;
        yh1 yh1Var = new yh1(iMax, iMax2);
        int i5 = 0;
        while (i5 < iM57801f) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < iM57802g) {
                if (yh1VarM33418a.m57800c(i6, i5)) {
                    yh1Var.m57804i(i7, i4, iMin, iMin);
                }
                i6++;
                i7 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return yh1Var;
    }

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) throws NumberFormatException {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i3 = 0;
        if (map != null) {
            z66 z66Var = z66.CHARACTER_SET;
            if (map.containsKey(z66Var)) {
                charsetForName = Charset.forName(map.get(z66Var).toString());
            }
            z66 z66Var2 = z66.ERROR_CORRECTION;
            i = map.containsKey(z66Var2) ? Integer.parseInt(map.get(z66Var2).toString()) : 33;
            z66 z66Var3 = z66.AZTEC_LAYERS;
            if (map.containsKey(z66Var3)) {
                i3 = Integer.parseInt(map.get(z66Var3).toString());
            }
        }
        return m35180b(str, va1Var, i, i2, charsetForName, i, i3);
    }
}
