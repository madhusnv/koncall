package p001o;

import p001o.pm7;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class i47 {
    /* renamed from: a */
    public static final v37 m31493a(v37 v37Var, int i, wl1 wl1Var) {
        int i2;
        wl1 wl1Var2;
        boolean z = true;
        if (!(i >= 0 || i == -2 || i == -1)) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && wl1Var != wl1.SUSPEND) {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            wl1Var2 = wl1.DROP_OLDEST;
            i2 = 0;
        } else {
            i2 = i;
            wl1Var2 = wl1Var;
        }
        return v37Var instanceof pm7 ? pm7.C16142a.m43874a((pm7) v37Var, null, i2, wl1Var2, 1, null) : new qg2(v37Var, null, i2, wl1Var2, 2, null);
    }

    /* renamed from: b */
    public static /* synthetic */ v37 m31494b(v37 v37Var, int i, wl1 wl1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            wl1Var = wl1.SUSPEND;
        }
        return e47.m24269c(v37Var, i, wl1Var);
    }
}
