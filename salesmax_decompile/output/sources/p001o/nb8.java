package p001o;

/* loaded from: classes3.dex */
public interface nb8 {

    /* renamed from: o.nb8$a */
    public static final class C15534a {
        /* renamed from: a */
        public static /* synthetic */ Object m40285a(nb8 nb8Var, qx0 qx0Var, n64 n64Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve");
            }
            if ((i & 1) != 0) {
                qx0Var = tx0.m50736a();
            }
            return nb8Var.resolve(qx0Var, n64Var);
        }
    }

    Object resolve(qx0 qx0Var, n64 n64Var);
}
