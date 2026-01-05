package p001o;

import java.io.IOException;
import p001o.gk8;

/* loaded from: classes3.dex */
public final class kac extends v18 {

    /* renamed from: h */
    public static final C14761b f31753h;

    /* renamed from: q */
    public static final xk7 f31754q;

    /* renamed from: d */
    public final mac f31755d;

    /* renamed from: e */
    public final d28 f31756e;

    /* renamed from: f */
    public final at3 f31757f;

    /* renamed from: g */
    public final hac f31758g;

    /* renamed from: o.kac$a */
    public /* synthetic */ class C14760a extends dm7 implements xk7 {
        public C14760a(Object obj) {
            super(1, obj, C14761b.class, "invoke", "invoke(Lkotlin/jvm/functions/Function1;)Laws/smithy/kotlin/runtime/http/engine/okhttp/OkHttpEngine;", 0);
        }

        @Override // p001o.xk7
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kac invoke(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "p0");
            return ((C14761b) this.receiver).m35246a(xk7Var);
        }
    }

    /* renamed from: o.kac$b */
    public static final class C14761b {
        public C14761b() {
        }

        public /* synthetic */ C14761b(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final kac m35246a(xk7 xk7Var) {
            sq8.m48649h(xk7Var, "block");
            return new kac(mac.f35055m.m38642b(xk7Var));
        }
    }

    /* renamed from: o.kac$c */
    public static final class C14762c extends o64 {

        /* renamed from: a */
        public Object f31759a;

        /* renamed from: b */
        public Object f31760b;

        /* renamed from: c */
        public Object f31761c;

        /* renamed from: d */
        public /* synthetic */ Object f31762d;

        /* renamed from: f */
        public int f31764f;

        public C14762c(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f31762d = obj;
            this.f31764f |= Integer.MIN_VALUE;
            return kac.this.mo35244u(null, null, this);
        }
    }

    static {
        C14761b c14761b = new C14761b(null);
        f31753h = c14761b;
        f31754q = new C14760a(c14761b);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public kac(mac macVar) {
        super("OkHttp");
        sq8.m48649h(macVar, "config");
        this.f31755d = macVar;
        d28 d28Var = new d28("aws.smithy.kotlin.runtime.http.engine.okhttp", getConfig().m58649k());
        this.f31756e = d28Var;
        k16 k16VarM38633p = getConfig().m38633p();
        at3 at3Var = k16VarM38633p != null ? new at3(k16VarM38633p.m34896X(), 0 == true ? 1 : 0) : null;
        this.f31757f = at3Var;
        this.f31758g = oac.m41882e(getConfig(), d28Var, at3Var);
    }

    /* renamed from: g */
    public static final y3i m35242g(gac gacVar, zqe zqeVar, Throwable th) {
        if (th != null) {
            gacVar.mo28289a();
        }
        cre creVarM59735c = zqeVar.m59735c();
        if (creVarM59735c != null) {
            creVarM59735c.close();
        }
        return y3i.f54824a;
    }

    @Override // p001o.t18
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public mac getConfig() {
        return this.f31755d;
    }

    @Override // p001o.v18
    public void shutdown() {
        at3 at3Var = this.f31757f;
        if (at3Var != null) {
            at3Var.m17808y();
        }
        this.f31758g.m30073l().m21741b();
        this.f31758g.m30076o().m23823c().shutdown();
        this.f31756e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.t18
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo35244u(jl6 jl6Var, y38 y38Var, n64 n64Var) {
        C14762c c14762c;
        kac kacVar;
        bt1 bt1Var;
        y38 y38Var2;
        q74 q74Var;
        if (n64Var instanceof C14762c) {
            c14762c = (C14762c) n64Var;
            int i = c14762c.f31764f;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14762c.f31764f = i - Integer.MIN_VALUE;
            } else {
                c14762c = new C14762c(n64Var);
            }
        }
        Object objM43169f = c14762c.f31762d;
        Object objM51918f = uq8.m51918f();
        int i2 = c14762c.f31764f;
        try {
            if (i2 == 0) {
                wre.m54934b(objM43169f);
                c14762c.f31759a = this;
                c14762c.f31760b = jl6Var;
                c14762c.f31761c = y38Var;
                c14762c.f31764f = 1;
                objM43169f = p84.m43169f(c14762c);
                if (objM43169f == objM51918f) {
                    return objM51918f;
                }
                kacVar = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bt1 bt1Var2 = (bt1) c14762c.f31761c;
                    q74Var = (q74) c14762c.f31760b;
                    y38 y38Var3 = (y38) c14762c.f31759a;
                    wre.m54934b(objM43169f);
                    bt1Var = bt1Var2;
                    y38Var2 = y38Var3;
                    final zqe zqeVar = (zqe) objM43169f;
                    g48 g48VarM49658h = tac.m49658h(zqeVar);
                    gk8.C13769a c13769a = gk8.f25374b;
                    final gac gacVar = new gac(y38Var2, g48VarM49658h, jk8.m33903a(c13769a, zqeVar.m59733S()), jk8.m33903a(c13769a, zqeVar.m59731O()), q74Var, bt1Var);
                    z69.m58846k(q74Var).j0(new xk7() { // from class: o.jac
                        @Override // p001o.xk7
                        public final Object invoke(Object obj) {
                            return kac.m35242g(gacVar, zqeVar, (Throwable) obj);
                        }
                    });
                    return gacVar;
                }
                y38Var = (y38) c14762c.f31761c;
                jl6Var = (jl6) c14762c.f31760b;
                kacVar = (kac) c14762c.f31759a;
                wre.m54934b(objM43169f);
            }
            q74 q74Var2 = (q74) objM43169f;
            bt1 bt1VarMo19702a = kacVar.f31758g.mo19702a(tac.m49657g(y38Var, jl6Var, q74Var2, kacVar.f31756e));
            c14762c.f31759a = y38Var;
            c14762c.f31760b = q74Var2;
            c14762c.f31761c = bt1VarMo19702a;
            c14762c.f31764f = 2;
            Object objM30756a = hl6.m30756a(bt1VarMo19702a, c14762c);
            if (objM30756a == objM51918f) {
                return objM51918f;
            }
            bt1Var = bt1VarMo19702a;
            y38Var2 = y38Var;
            q74Var = q74Var2;
            objM43169f = objM30756a;
            final zqe zqeVar2 = (zqe) objM43169f;
            g48 g48VarM49658h2 = tac.m49658h(zqeVar2);
            gk8.C13769a c13769a2 = gk8.f25374b;
            final gac gacVar2 = new gac(y38Var2, g48VarM49658h2, jk8.m33903a(c13769a2, zqeVar2.m59733S()), jk8.m33903a(c13769a2, zqeVar2.m59731O()), q74Var, bt1Var);
            z69.m58846k(q74Var).j0(new xk7() { // from class: o.jac
                @Override // p001o.xk7
                public final Object invoke(Object obj) {
                    return kac.m35242g(gacVar2, zqeVar2, (Throwable) obj);
                }
            });
            return gacVar2;
        } catch (IOException e) {
            throw new y28(e, tac.m49652b(e), true);
        }
    }

    public kac() {
        this(mac.f35055m.m38641a());
    }
}
