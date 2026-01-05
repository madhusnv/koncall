package p001o;

import p001o.vre;

/* loaded from: classes6.dex */
public final class j85 extends i85 implements n64 {

    /* renamed from: a */
    public ql7 f29950a;

    /* renamed from: b */
    public Object f29951b;

    /* renamed from: c */
    public n64 f29952c;

    /* renamed from: d */
    public Object f29953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j85(ql7 ql7Var, Object obj) {
        super(null);
        sq8.m48649h(ql7Var, "block");
        this.f29950a = ql7Var;
        this.f29951b = obj;
        sq8.m48647f(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f29952c = this;
        this.f29953d = h85.f26392a;
    }

    @Override // p001o.i85
    /* renamed from: b */
    public Object mo31714b(Object obj, n64 n64Var) {
        sq8.m48647f(n64Var, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f29952c = n64Var;
        this.f29951b = obj;
        Object objM51918f = uq8.m51918f();
        if (objM51918f == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM51918f;
    }

    /* renamed from: c */
    public final Object m33414c() {
        while (true) {
            Object obj = this.f29953d;
            n64 n64Var = this.f29952c;
            if (n64Var == null) {
                wre.m54934b(obj);
                return obj;
            }
            if (vre.m53353d(h85.f26392a, obj)) {
                try {
                    ql7 ql7Var = this.f29950a;
                    Object obj2 = this.f29951b;
                    Object objM50338e = !(ql7Var instanceof vb1) ? tq8.m50338e(ql7Var, this, obj2, n64Var) : ((ql7) azh.m18052e(ql7Var, 3)).invoke(this, obj2, n64Var);
                    if (objM50338e != uq8.m51918f()) {
                        n64Var.resumeWith(vre.m53351b(objM50338e));
                    }
                } catch (Throwable th) {
                    vre.C17665a c17665a = vre.f50797b;
                    n64Var.resumeWith(vre.m53351b(wre.m54933a(th)));
                }
            } else {
                this.f29953d = h85.f26392a;
                n64Var.resumeWith(obj);
            }
        }
    }

    @Override // p001o.n64
    public q74 getContext() {
        return e66.f21035a;
    }

    @Override // p001o.n64
    public void resumeWith(Object obj) {
        this.f29952c = null;
        this.f29953d = obj;
    }
}
