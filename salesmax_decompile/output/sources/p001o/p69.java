package p001o;

import java.util.concurrent.CancellationException;
import p001o.q74;

/* loaded from: classes6.dex */
public interface p69 extends q74.InterfaceC16311b {

    /* renamed from: t */
    public static final C15967b f39399t = C15967b.f39400a;

    /* renamed from: o.p69$a */
    public static final class C15966a {
        /* renamed from: a */
        public static /* synthetic */ void m42999a(p69 p69Var, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            p69Var.mo22429f(cancellationException);
        }

        /* renamed from: b */
        public static Object m43000b(p69 p69Var, Object obj, nl7 nl7Var) {
            return q74.InterfaceC16311b.a.m44920a(p69Var, obj, nl7Var);
        }

        /* renamed from: c */
        public static q74.InterfaceC16311b m43001c(p69 p69Var, q74.InterfaceC16312c interfaceC16312c) {
            return q74.InterfaceC16311b.a.m44921b(p69Var, interfaceC16312c);
        }

        /* renamed from: d */
        public static /* synthetic */ yu5 m43002d(p69 p69Var, boolean z, boolean z2, xk7 xk7Var, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return p69Var.mo22422T(z, z2, xk7Var);
        }

        /* renamed from: e */
        public static q74 m43003e(p69 p69Var, q74.InterfaceC16312c interfaceC16312c) {
            return q74.InterfaceC16311b.a.m44922c(p69Var, interfaceC16312c);
        }

        /* renamed from: f */
        public static q74 m43004f(p69 p69Var, q74 q74Var) {
            return q74.InterfaceC16311b.a.m44923d(p69Var, q74Var);
        }
    }

    /* renamed from: o.p69$b */
    public static final class C15967b implements q74.InterfaceC16312c {

        /* renamed from: a */
        public static final /* synthetic */ C15967b f39400a = new C15967b();
    }

    /* renamed from: J */
    boolean mo22414J();

    /* renamed from: S */
    c93 mo22421S(h93 h93Var);

    /* renamed from: T */
    yu5 mo22422T(boolean z, boolean z2, xk7 xk7Var);

    /* renamed from: a */
    boolean mo22428a();

    Object d0(n64 n64Var);

    /* renamed from: f */
    void mo22429f(CancellationException cancellationException);

    yu5 j0(xk7 xk7Var);

    /* renamed from: k */
    ief mo22430k();

    /* renamed from: r */
    CancellationException mo22431r();

    boolean start();
}
