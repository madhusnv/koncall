package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class a1i extends y0i {
    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.UPC_E) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + x0i.m55543b(z0i.m58635c(str));
            } catch (hf7 e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!x0i.m55542a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (hf7 unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int iDigit = Character.digit(str.charAt(0), 10);
        if (iDigit != 0 && iDigit != 1) {
            throw new IllegalArgumentException("Number system must be 0 or 1");
        }
        int i = z0i.f56388g[iDigit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int iM41970b = occ.m41970b(zArr, 0, x0i.f53036a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit2 = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit2 += 10;
            }
            iM41970b += occ.m41970b(zArr, iM41970b, x0i.f53040e[iDigit2], false);
        }
        occ.m41970b(zArr, iM41970b, x0i.f53038c, false);
        return zArr;
    }
}
