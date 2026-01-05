package p001o;

import p001o.p64;

/* loaded from: classes6.dex */
public abstract class pg2 extends mg2 {

    /* renamed from: d */
    public final v37 f40024d;

    /* renamed from: o.pg2$a */
    public static final class C16107a extends jgg implements nl7 {

        /* renamed from: a */
        public int f40025a;

        /* renamed from: b */
        public /* synthetic */ Object f40026b;

        public C16107a(n64 n64Var) {
            super(2, n64Var);
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16107a c16107a = pg2.this.new C16107a(n64Var);
            c16107a.f40026b = obj;
            return c16107a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f40025a;
            if (i == 0) {
                wre.m54934b(obj);
                z37 z37Var = (z37) this.f40026b;
                pg2 pg2Var = pg2.this;
                this.f40025a = 1;
                if (pg2Var.mo43602q(z37Var, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return y3i.f54824a;
        }

        @Override // p001o.nl7
        public final Object invoke(z37 z37Var, n64 n64Var) {
            return ((C16107a) create(z37Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public pg2(v37 v37Var, q74 q74Var, int i, wl1 wl1Var) {
        super(q74Var, i, wl1Var);
        this.f40024d = v37Var;
    }

    /* renamed from: n */
    public static /* synthetic */ Object m43599n(pg2 pg2Var, z37 z37Var, n64 n64Var) {
        if (pg2Var.f35372b == -3) {
            q74 context = n64Var.getContext();
            q74 q74VarM51081j = u74.m51081j(context, pg2Var.f35371a);
            if (sq8.m48644c(q74VarM51081j, context)) {
                Object objMo43602q = pg2Var.mo43602q(z37Var, n64Var);
                return objMo43602q == uq8.m51918f() ? objMo43602q : y3i.f54824a;
            }
            p64.C15962b c15962b = p64.f39391p;
            if (sq8.m48644c(q74VarM51081j.get(c15962b), context.get(c15962b))) {
                Object objM43601p = pg2Var.m43601p(z37Var, q74VarM51081j, n64Var);
                return objM43601p == uq8.m51918f() ? objM43601p : y3i.f54824a;
            }
        }
        Object objMo9775a = super.mo9775a(z37Var, n64Var);
        return objMo9775a == uq8.m51918f() ? objMo9775a : y3i.f54824a;
    }

    /* renamed from: o */
    public static /* synthetic */ Object m43600o(pg2 pg2Var, ljd ljdVar, n64 n64Var) {
        Object objMo43602q = pg2Var.mo43602q(new aef(ljdVar), n64Var);
        return objMo43602q == uq8.m51918f() ? objMo43602q : y3i.f54824a;
    }

    @Override // p001o.mg2, p001o.v37
    /* renamed from: a */
    public Object mo9775a(z37 z37Var, n64 n64Var) {
        return m43599n(this, z37Var, n64Var);
    }

    @Override // p001o.mg2
    /* renamed from: h */
    public Object mo20154h(ljd ljdVar, n64 n64Var) {
        return m43600o(this, ljdVar, n64Var);
    }

    /* renamed from: p */
    public final Object m43601p(z37 z37Var, q74 q74Var, n64 n64Var) {
        return og2.m42205c(q74Var, og2.m42206d(z37Var, n64Var.getContext()), null, new C16107a(null), n64Var, 4, null);
    }

    /* renamed from: q */
    public abstract Object mo43602q(z37 z37Var, n64 n64Var);

    @Override // p001o.mg2
    public String toString() {
        return this.f40024d + " -> " + super.toString();
    }
}
