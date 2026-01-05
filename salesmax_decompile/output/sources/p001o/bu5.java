package p001o;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC11951a;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class bu5 extends xjg {

    /* renamed from: c */
    public int f16829c;

    public bu5(int i) {
        this.f16829c = i;
    }

    /* renamed from: b */
    public void mo19807b(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract n64 mo19808d();

    /* renamed from: f */
    public Throwable mo19809f(Object obj) {
        lm3 lm3Var = obj instanceof lm3 ? (lm3) obj : null;
        if (lm3Var != null) {
            return lm3Var.f34036a;
        }
        return null;
    }

    /* renamed from: g */
    public Object mo19810g(Object obj) {
        return obj;
    }

    /* renamed from: h */
    public final void m19811h(Throwable th) {
        AbstractC11951a.m16250a(mo19808d().getContext(), new r84("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* renamed from: i */
    public abstract Object mo19812i();

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            n64 n64VarMo19808d = mo19808d();
            sq8.m48647f(n64VarMo19808d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            yt5 yt5Var = (yt5) n64VarMo19808d;
            n64 n64Var = yt5Var.f55911e;
            Object obj = yt5Var.f55913g;
            q74 context = n64Var.getContext();
            Object objM35820i = kkh.m35820i(context, obj);
            p69 p69Var = null;
            h3i h3iVarM51084m = objM35820i != kkh.f32357a ? u74.m51084m(n64Var, context, objM35820i) : null;
            try {
                q74 context2 = n64Var.getContext();
                Object objMo19812i = mo19812i();
                Throwable thMo19809f = mo19809f(objMo19812i);
                if (thMo19809f == null && cu5.m21808b(this.f16829c)) {
                    p69Var = (p69) context2.get(p69.f39399t);
                }
                if (p69Var != null && !p69Var.mo22428a()) {
                    CancellationException cancellationExceptionMo22431r = p69Var.mo22431r();
                    mo19807b(objMo19812i, cancellationExceptionMo22431r);
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(wre.m54933a(cancellationExceptionMo22431r)));
                } else if (thMo19809f != null) {
                    vre.C17665a c17665a2 = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(wre.m54933a(thMo19809f)));
                } else {
                    vre.C17665a c17665a3 = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(mo19810g(objMo19812i)));
                }
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
        } catch (Throwable th2) {
            m19811h(th2);
        }
    }
}
