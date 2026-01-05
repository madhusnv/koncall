package p001o;

import com.google.android.gms.common.api.Api;

/* loaded from: classes6.dex */
public abstract class tg2 {
    /* renamed from: a */
    public static final jg2 m49823a(int i, wl1 wl1Var, xk7 xk7Var) {
        jg2 dm1Var;
        if (i != -2) {
            if (i == -1) {
                if (wl1Var == wl1.SUSPEND) {
                    return new sr3(1, wl1.DROP_OLDEST, xk7Var);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? wl1Var == wl1.SUSPEND ? new dm1(i, xk7Var) : new sr3(i, wl1Var, xk7Var) : new dm1(Api.BaseClientBuilder.API_PRIORITY_OTHER, xk7Var);
            }
            dm1Var = wl1Var == wl1.SUSPEND ? new dm1(0, xk7Var) : new sr3(1, wl1Var, xk7Var);
        } else {
            dm1Var = wl1Var == wl1.SUSPEND ? new dm1(jg2.f30380k.m33787a(), xk7Var) : new sr3(1, wl1Var, xk7Var);
        }
        return dm1Var;
    }

    /* renamed from: b */
    public static /* synthetic */ jg2 m49824b(int i, wl1 wl1Var, xk7 xk7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            wl1Var = wl1.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            xk7Var = null;
        }
        return m49823a(i, wl1Var, xk7Var);
    }
}
