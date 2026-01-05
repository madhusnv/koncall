package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class n26 extends y0i {
    @Override // p001o.occ, p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.EAN_8) {
            return super.mo16332a(str, va1Var, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(va1Var)));
    }

    @Override // p001o.occ
    /* renamed from: c */
    public boolean[] mo16333c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + x0i.m55543b(str);
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
        boolean[] zArr = new boolean[67];
        int iM41970b = occ.m41970b(zArr, 0, x0i.f53036a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iM41970b += occ.m41970b(zArr, iM41970b, x0i.f53039d[Character.digit(str.charAt(i), 10)], false);
        }
        int iM41970b2 = iM41970b + occ.m41970b(zArr, iM41970b, x0i.f53037b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iM41970b2 += occ.m41970b(zArr, iM41970b2, x0i.f53039d[Character.digit(str.charAt(i2), 10)], true);
        }
        occ.m41970b(zArr, iM41970b2, x0i.f53036a, true);
        return zArr;
    }
}
