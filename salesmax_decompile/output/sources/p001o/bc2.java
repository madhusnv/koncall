package p001o;

/* loaded from: classes6.dex */
public abstract class bc2 {
    /* renamed from: a */
    public static final void m18560a(xb2 xb2Var, yu5 yu5Var) {
        m18562c(xb2Var, new dv5(yu5Var));
    }

    /* renamed from: b */
    public static final zb2 m18561b(n64 n64Var) {
        if (!(n64Var instanceof yt5)) {
            return new zb2(n64Var, 1);
        }
        zb2 zb2VarM58191k = ((yt5) n64Var).m58191k();
        if (zb2VarM58191k != null) {
            if (!zb2VarM58191k.m59125P()) {
                zb2VarM58191k = null;
            }
            if (zb2VarM58191k != null) {
                return zb2VarM58191k;
            }
        }
        return new zb2(n64Var, 2);
    }

    /* renamed from: c */
    public static final void m18562c(xb2 xb2Var, tb2 tb2Var) {
        if (!(xb2Var instanceof zb2)) {
            throw new UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((zb2) xb2Var).m59119I(tb2Var);
    }
}
