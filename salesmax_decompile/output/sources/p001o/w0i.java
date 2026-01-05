package p001o;

import java.util.Map;

/* loaded from: classes6.dex */
public final class w0i implements ddj {

    /* renamed from: a */
    public final m26 f51254a = new m26();

    @Override // p001o.ddj
    /* renamed from: a */
    public yh1 mo16332a(String str, va1 va1Var, int i, int i2, Map map) {
        if (va1Var == va1.UPC_A) {
            return this.f51254a.mo16332a("0".concat(String.valueOf(str)), va1.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(va1Var)));
    }
}
