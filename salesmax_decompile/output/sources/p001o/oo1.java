package p001o;

import java.util.Set;

/* loaded from: classes2.dex */
public abstract class oo1 {
    /* renamed from: c */
    public static final String m42487c(Set set) {
        if (set.isEmpty()) {
            return "";
        }
        String strP0 = kh3.p0(set, ",", "m/", null, 0, null, new xk7() { // from class: o.no1
            @Override // p001o.xk7
            public final Object invoke(Object obj) {
                return oo1.m42488d((lo1) obj);
            }
        }, 28, null);
        byte[] bArrM24603u = e9g.m24603u(strP0);
        if (bArrM24603u.length <= 1024) {
            return strP0;
        }
        byte[] bArrV0 = gp0.v0(bArrM24603u, bce.m18616s(0, 1024));
        int length = bArrV0.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (bArrV0[length] == 44) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        } else {
            length = -1;
        }
        Integer numValueOf = Integer.valueOf(length);
        if (!(numValueOf.intValue() != -1)) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            numValueOf.intValue();
            return e9g.m24601s(bArrM24603u, 0, numValueOf.intValue(), true);
        }
        throw new IllegalStateException("Business metrics are incorrectly formatted: " + strP0);
    }

    /* renamed from: d */
    public static final CharSequence m42488d(lo1 lo1Var) {
        sq8.m48649h(lo1Var, "it");
        return lo1Var.getIdentifier();
    }
}
