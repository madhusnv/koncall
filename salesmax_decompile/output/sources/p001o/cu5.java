package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public abstract class cu5 {
    /* renamed from: a */
    public static final void m21807a(bu5 bu5Var, int i) {
        n64 n64VarMo19808d = bu5Var.mo19808d();
        boolean z = i == 4;
        if (z || !(n64VarMo19808d instanceof yt5) || m21808b(i) != m21808b(bu5Var.f16829c)) {
            m21810d(bu5Var, n64VarMo19808d, z);
            return;
        }
        yt5 yt5Var = (yt5) n64VarMo19808d;
        z74 z74Var = yt5Var.f55910d;
        q74 context = yt5Var.getContext();
        if (z74Var.k0(context)) {
            z74Var.mo22314K(context, bu5Var);
        } else {
            m21811e(bu5Var);
        }
    }

    /* renamed from: b */
    public static final boolean m21808b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m21809c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final void m21810d(bu5 bu5Var, n64 n64Var, boolean z) {
        Object objMo19810g;
        Object objMo19812i = bu5Var.mo19812i();
        Throwable thMo19809f = bu5Var.mo19809f(objMo19812i);
        if (thMo19809f != null) {
            vre.C17665a c17665a = vre.f50797b;
            objMo19810g = wre.m54933a(thMo19809f);
        } else {
            vre.C17665a c17665a2 = vre.f50797b;
            objMo19810g = bu5Var.mo19810g(objMo19812i);
        }
        Object objM53351b = vre.m53351b(objMo19810g);
        if (!z) {
            n64Var.resumeWith(objM53351b);
            return;
        }
        sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        yt5 yt5Var = (yt5) n64Var;
        n64 n64Var2 = yt5Var.f55911e;
        Object obj = yt5Var.f55913g;
        q74 context = n64Var2.getContext();
        Object objM35820i = kkh.m35820i(context, obj);
        h3i h3iVarM51084m = objM35820i != kkh.f32357a ? u74.m51084m(n64Var2, context, objM35820i) : null;
        try {
            yt5Var.f55911e.resumeWith(objM53351b);
            y3i y3iVar = y3i.f54824a;
        } finally {
            if (h3iVarM51084m == null || h3iVarM51084m.W0()) {
                kkh.m35817f(context, objM35820i);
            }
        }
    }

    /* renamed from: e */
    public static final void m21811e(bu5 bu5Var) {
        ek6 ek6VarM43813b = pkh.f40203a.m43813b();
        if (ek6VarM43813b.F0()) {
            ek6VarM43813b.y0(bu5Var);
            return;
        }
        ek6VarM43813b.A0(true);
        try {
            m21810d(bu5Var, bu5Var.mo19808d(), true);
            do {
            } while (ek6VarM43813b.I0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
