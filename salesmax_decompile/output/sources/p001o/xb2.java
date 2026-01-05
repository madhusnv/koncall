package p001o;

/* loaded from: classes6.dex */
public interface xb2 extends n64 {

    /* renamed from: o.xb2$a */
    public static final class C18097a {
        /* renamed from: a */
        public static /* synthetic */ boolean m55920a(xb2 xb2Var, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return xb2Var.cancel(th);
        }
    }

    /* renamed from: A */
    void mo48684A(Object obj, ql7 ql7Var);

    /* renamed from: B */
    void mo48685B(Object obj, xk7 xk7Var);

    /* renamed from: F */
    void mo48686F(Object obj);

    /* renamed from: a */
    boolean mo48687a();

    boolean cancel(Throwable th);

    /* renamed from: e */
    void mo48688e(z74 z74Var, Object obj);

    /* renamed from: p */
    Object mo48693p(Object obj, Object obj2, ql7 ql7Var);

    /* renamed from: y */
    void mo48694y(xk7 xk7Var);
}
