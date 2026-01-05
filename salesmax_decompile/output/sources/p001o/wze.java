package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public final class wze extends o64 implements z37 {

    /* renamed from: a */
    public final z37 f52942a;

    /* renamed from: b */
    public final q74 f52943b;

    /* renamed from: c */
    public final int f52944c;

    /* renamed from: d */
    public q74 f52945d;

    /* renamed from: e */
    public n64 f52946e;

    public wze(z37 z37Var, q74 q74Var) {
        super(izb.f29408a, e66.f21035a);
        this.f52942a = z37Var;
        this.f52943b = q74Var;
        this.f52944c = ((Number) q74Var.fold(0, new nl7() { // from class: o.vze
            @Override // p001o.nl7
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(wze.m55486h(((Integer) obj).intValue(), (q74.InterfaceC16311b) obj2));
            }
        })).intValue();
    }

    /* renamed from: h */
    public static final int m55486h(int i, q74.InterfaceC16311b interfaceC16311b) {
        return i + 1;
    }

    @Override // p001o.z37
    public Object emit(Object obj, n64 n64Var) {
        try {
            Object objM55488i = m55488i(n64Var, obj);
            if (objM55488i == uq8.m51918f()) {
                n75.m40201c(n64Var);
            }
            return objM55488i == uq8.m51918f() ? objM55488i : y3i.f54824a;
        } catch (Throwable th) {
            this.f52945d = new tx5(th, n64Var.getContext());
            throw th;
        }
    }

    /* renamed from: g */
    public final void m55487g(q74 q74Var, q74 q74Var2, Object obj) {
        if (q74Var2 instanceof tx5) {
            m55489k((tx5) q74Var2, obj);
        }
        zze.m60155b(this, q74Var);
    }

    @Override // p001o.vb1, p001o.k84
    public k84 getCallerFrame() {
        n64 n64Var = this.f52946e;
        if (n64Var instanceof k84) {
            return (k84) n64Var;
        }
        return null;
    }

    @Override // p001o.o64, p001o.n64
    public q74 getContext() {
        q74 q74Var = this.f52945d;
        return q74Var == null ? e66.f21035a : q74Var;
    }

    @Override // p001o.vb1
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: i */
    public final Object m55488i(n64 n64Var, Object obj) {
        q74 context = n64Var.getContext();
        z69.m58844i(context);
        q74 q74Var = this.f52945d;
        if (q74Var != context) {
            m55487g(context, q74Var, obj);
            this.f52945d = context;
        }
        this.f52946e = n64Var;
        ql7 ql7Var = xze.f54645a;
        z37 z37Var = this.f52942a;
        sq8.m48647f(z37Var, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        sq8.m48647f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = ql7Var.invoke(z37Var, obj, this);
        if (!sq8.m48644c(objInvoke, uq8.m51918f())) {
            this.f52946e = null;
        }
        return objInvoke;
    }

    @Override // p001o.vb1
    public Object invokeSuspend(Object obj) {
        Throwable thM53354e = vre.m53354e(obj);
        if (thM53354e != null) {
            this.f52945d = new tx5(thM53354e, getContext());
        }
        n64 n64Var = this.f52946e;
        if (n64Var != null) {
            n64Var.resumeWith(obj);
        }
        return uq8.m51918f();
    }

    /* renamed from: k */
    public final void m55489k(tx5 tx5Var, Object obj) {
        throw new IllegalStateException(x8g.m55850f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + tx5Var.f47998b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // p001o.o64, p001o.vb1
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
