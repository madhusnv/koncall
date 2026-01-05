package p001o;

/* loaded from: classes6.dex */
public interface pm7 extends v37 {

    /* renamed from: o.pm7$a */
    public static final class C16142a {
        /* renamed from: a */
        public static /* synthetic */ v37 m43874a(pm7 pm7Var, q74 q74Var, int i, wl1 wl1Var, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i2 & 1) != 0) {
                q74Var = e66.f21035a;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                wl1Var = wl1.SUSPEND;
            }
            return pm7Var.mo17500e(q74Var, i, wl1Var);
        }
    }

    /* renamed from: e */
    v37 mo17500e(q74 q74Var, int i, wl1 wl1Var);
}
