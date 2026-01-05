package p001o;

import java.util.concurrent.CancellationException;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class zt5 {

    /* renamed from: a */
    public static final lgg f57669a = new lgg("UNDEFINED");

    /* renamed from: b */
    public static final lgg f57670b = new lgg("REUSABLE_CLAIMED");

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public static final void m59877b(n64 n64Var, Object obj) {
        boolean z;
        if (!(n64Var instanceof yt5)) {
            n64Var.resumeWith(obj);
            return;
        }
        yt5 yt5Var = (yt5) n64Var;
        Object objM46955b = rm3.m46955b(obj);
        if (yt5Var.f55910d.k0(yt5Var.getContext())) {
            yt5Var.f55912f = objM46955b;
            yt5Var.f16829c = 1;
            yt5Var.f55910d.mo22314K(yt5Var.getContext(), yt5Var);
            return;
        }
        ek6 ek6VarM43813b = pkh.f40203a.m43813b();
        if (ek6VarM43813b.F0()) {
            yt5Var.f55912f = objM46955b;
            yt5Var.f16829c = 1;
            ek6VarM43813b.y0(yt5Var);
            return;
        }
        ek6VarM43813b.A0(true);
        try {
            p69 p69Var = (p69) yt5Var.getContext().get(p69.f39399t);
            if (p69Var == null || p69Var.mo22428a()) {
                z = false;
            } else {
                CancellationException cancellationExceptionMo22431r = p69Var.mo22431r();
                yt5Var.mo19807b(objM46955b, cancellationExceptionMo22431r);
                vre.C17665a c17665a = vre.f50797b;
                yt5Var.resumeWith(vre.m53351b(wre.m54933a(cancellationExceptionMo22431r)));
                z = true;
            }
            if (!z) {
                n64 n64Var2 = yt5Var.f55911e;
                Object obj2 = yt5Var.f55913g;
                q74 context = n64Var2.getContext();
                Object objM35820i = kkh.m35820i(context, obj2);
                h3i h3iVarM51084m = objM35820i != kkh.f32357a ? u74.m51084m(n64Var2, context, objM35820i) : null;
                try {
                    yt5Var.f55911e.resumeWith(obj);
                    y3i y3iVar = y3i.f54824a;
                    if (h3iVarM51084m == null || h3iVarM51084m.W0()) {
                        kkh.m35817f(context, objM35820i);
                    }
                } catch (Throwable th) {
                    if (h3iVarM51084m == null || h3iVarM51084m.W0()) {
                        kkh.m35817f(context, objM35820i);
                    }
                    throw th;
                }
            }
            while (ek6VarM43813b.I0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: c */
    public static final boolean m59878c(yt5 yt5Var) {
        y3i y3iVar = y3i.f54824a;
        ek6 ek6VarM43813b = pkh.f40203a.m43813b();
        if (ek6VarM43813b.G0()) {
            return false;
        }
        if (ek6VarM43813b.F0()) {
            yt5Var.f55912f = y3iVar;
            yt5Var.f16829c = 1;
            ek6VarM43813b.y0(yt5Var);
            return true;
        }
        ek6VarM43813b.A0(true);
        try {
            yt5Var.run();
            do {
            } while (ek6VarM43813b.I0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
