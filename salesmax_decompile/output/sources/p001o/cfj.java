package p001o;

/* loaded from: classes6.dex */
public abstract class cfj {
    /* renamed from: a */
    public static final Object m21131a(n64 n64Var) {
        Object objM51918f;
        q74 context = n64Var.getContext();
        z69.m58844i(context);
        n64 n64VarM50336c = tq8.m50336c(n64Var);
        yt5 yt5Var = n64VarM50336c instanceof yt5 ? (yt5) n64VarM50336c : null;
        if (yt5Var == null) {
            objM51918f = y3i.f54824a;
        } else {
            if (yt5Var.f55910d.k0(context)) {
                yt5Var.m58192l(context, y3i.f54824a);
            } else {
                bfj bfjVar = new bfj();
                q74 q74VarPlus = context.plus(bfjVar);
                y3i y3iVar = y3i.f54824a;
                yt5Var.m58192l(q74VarPlus, y3iVar);
                objM51918f = (!bfjVar.f16104b || zt5.m59878c(yt5Var)) ? uq8.m51918f() : y3iVar;
            }
            objM51918f = uq8.m51918f();
        }
        if (objM51918f == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM51918f == uq8.m51918f() ? objM51918f : y3i.f54824a;
    }
}
