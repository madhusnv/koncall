package p001o;

import p001o.alb;

/* loaded from: classes2.dex */
public abstract class yzb {
    /* renamed from: b */
    public static final alb.AbstractC12216c m58561b(rk5 rk5Var, int i, int i2) {
        alb.AbstractC12216c abstractC12216cM17353B = rk5Var.mo17377h().m17353B();
        if (abstractC12216cM17353B == null || (abstractC12216cM17353B.m17352A() & i) == 0) {
            return null;
        }
        while (abstractC12216cM17353B != null) {
            int iM17356E = abstractC12216cM17353B.m17356E();
            if ((iM17356E & i2) != 0) {
                return null;
            }
            if ((iM17356E & i) != 0) {
                return abstractC12216cM17353B;
            }
            abstractC12216cM17353B = abstractC12216cM17353B.m17353B();
        }
        return null;
    }
}
