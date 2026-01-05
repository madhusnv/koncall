package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public abstract class i84 {
    /* renamed from: a */
    public static final h84 m31707a(q74 q74Var) {
        if (q74Var.get(p69.f39399t) == null) {
            q74Var = q74Var.plus(a79.m16544b(null, 1, null));
        }
        return new h64(q74Var);
    }

    /* renamed from: b */
    public static final h84 m31708b() {
        return new h64(gdg.m28505b(null, 1, null).plus(eu5.m25612c()));
    }

    /* renamed from: c */
    public static final void m31709c(h84 h84Var, CancellationException cancellationException) {
        p69 p69Var = (p69) h84Var.mo6529D().get(p69.f39399t);
        if (p69Var != null) {
            p69Var.mo22429f(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + h84Var).toString());
    }

    /* renamed from: d */
    public static /* synthetic */ void m31710d(h84 h84Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m31709c(h84Var, cancellationException);
    }

    /* renamed from: e */
    public static final Object m31711e(nl7 nl7Var, n64 n64Var) {
        f6f f6fVar = new f6f(n64Var.getContext(), n64Var);
        Object objM31474b = i3i.m31474b(f6fVar, f6fVar, nl7Var);
        if (objM31474b == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM31474b;
    }

    /* renamed from: f */
    public static final void m31712f(h84 h84Var) {
        z69.m58844i(h84Var.mo6529D());
    }

    /* renamed from: g */
    public static final boolean m31713g(h84 h84Var) {
        p69 p69Var = (p69) h84Var.mo6529D().get(p69.f39399t);
        if (p69Var != null) {
            return p69Var.mo22428a();
        }
        return true;
    }
}
