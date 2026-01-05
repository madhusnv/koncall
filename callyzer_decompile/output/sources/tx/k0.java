package tx;

import ay.AbstractRunnableC0500j;
import dx.C1852b;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4154l;
import kotlinx.coroutines.DispatchException;
import og.od;
import uw.InterfaceC7559c;
import uw.InterfaceC7564h;
import ww.AbstractC8193c;
import yx.AbstractC8808b;
import yx.C8812f;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public abstract class k0 extends AbstractRunnableC0500j {

    /* renamed from: c */
    public int f34652c;

    public k0(int i10) {
        super(false, 0L);
        this.f34652c = i10;
    }

    /* renamed from: c */
    public abstract InterfaceC7559c mo13530c();

    /* renamed from: d */
    public Throwable mo13531d(Object obj) {
        C7260t c7260t = obj instanceof C7260t ? (C7260t) obj : null;
        if (c7260t != null) {
            return c7260t.f34677a;
        }
        return null;
    }

    /* renamed from: g */
    public final void m13547g(Throwable th2) {
        c0.m13497t(new C1852b("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), mo13530c().getContext());
    }

    /* renamed from: h */
    public abstract Object mo13533h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC7559c interfaceC7559cMo13530c = mo13530c();
            AbstractC4154l.m8921d(interfaceC7559cMo13530c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C8812f c8812f = (C8812f) interfaceC7559cMo13530c;
            AbstractC8193c abstractC8193c = c8812f.f42492e;
            Object obj = c8812f.f42494g;
            InterfaceC7564h context = abstractC8193c.getContext();
            Object objM16256p = AbstractC8808b.m16256p(context, obj);
            e1 e1Var = null;
            c2 c2VarM13474J = objM16256p != AbstractC8808b.f42482d ? c0.m13474J(abstractC8193c, context, objM16256p) : null;
            try {
                InterfaceC7564h context2 = abstractC8193c.getContext();
                Object objMo13533h = mo13533h();
                Throwable thMo13531d = mo13531d(objMo13533h);
                if (thMo13531d == null) {
                    int i10 = this.f34652c;
                    boolean z6 = true;
                    if (i10 != 1 && i10 != 2) {
                        z6 = false;
                    }
                    if (z6) {
                        e1Var = (e1) context2.o0(C7263w.f34689b);
                    }
                }
                if (e1Var != null && !e1Var.mo13509h()) {
                    CancellationException cancellationExceptionMo13507A = e1Var.mo13507A();
                    mo13529b(cancellationExceptionMo13507A);
                    abstractC8193c.resumeWith(od.m10796a(cancellationExceptionMo13507A));
                } else if (thMo13531d != null) {
                    abstractC8193c.resumeWith(od.m10796a(thMo13531d));
                } else {
                    abstractC8193c.resumeWith(mo13532e(objMo13533h));
                }
                if (c2VarM13474J == null || c2VarM13474J.l0()) {
                    AbstractC8808b.m16249i(context, objM16256p);
                }
            } catch (Throwable th2) {
                if (c2VarM13474J == null || c2VarM13474J.l0()) {
                    AbstractC8808b.m16249i(context, objM16256p);
                }
                throw th2;
            }
        } catch (DispatchException e2) {
            c0.m13497t(e2.f21165a, mo13530c().getContext());
        } catch (Throwable th3) {
            m13547g(th3);
        }
    }

    /* renamed from: b */
    public void mo13529b(CancellationException cancellationException) {
    }

    /* renamed from: e */
    public Object mo13532e(Object obj) {
        return obj;
    }
}
