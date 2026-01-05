package p001o;

import java.util.ConcurrentModificationException;

/* loaded from: classes2.dex */
public abstract class cp0 {
    /* renamed from: a */
    public static final void m21558a(ap0 ap0Var, int i) {
        sq8.m48649h(ap0Var, "<this>");
        ap0Var.m17586w(new int[i]);
        ap0Var.m17585v(new Object[i]);
    }

    /* renamed from: b */
    public static final int m21559b(ap0 ap0Var, int i) {
        sq8.m48649h(ap0Var, "<this>");
        try {
            return h14.m29727a(ap0Var.m17580j(), ap0Var.m17582o(), i);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public static final int m21560c(ap0 ap0Var, Object obj, int i) {
        sq8.m48649h(ap0Var, "<this>");
        int iM17582o = ap0Var.m17582o();
        if (iM17582o == 0) {
            return -1;
        }
        int iM21559b = m21559b(ap0Var, i);
        if (iM21559b < 0 || sq8.m48644c(obj, ap0Var.m17579e()[iM21559b])) {
            return iM21559b;
        }
        int i2 = iM21559b + 1;
        while (i2 < iM17582o && ap0Var.m17580j()[i2] == i) {
            if (sq8.m48644c(obj, ap0Var.m17579e()[i2])) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM21559b - 1; i3 >= 0 && ap0Var.m17580j()[i3] == i; i3--) {
            if (sq8.m48644c(obj, ap0Var.m17579e()[i3])) {
                return i3;
            }
        }
        return ~i2;
    }

    /* renamed from: d */
    public static final int m21561d(ap0 ap0Var) {
        sq8.m48649h(ap0Var, "<this>");
        return m21560c(ap0Var, null, 0);
    }
}
