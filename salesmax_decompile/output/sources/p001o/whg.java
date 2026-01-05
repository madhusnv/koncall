package p001o;

import p001o.big;
import p001o.m28;

/* loaded from: classes3.dex */
public final class whg implements m28.InterfaceC15204b {

    /* renamed from: o.whg$a */
    public static final class C17870a extends o64 {

        /* renamed from: a */
        public Object f52009a;

        /* renamed from: b */
        public Object f52010b;

        /* renamed from: c */
        public /* synthetic */ Object f52011c;

        /* renamed from: e */
        public int f52013e;

        public C17870a(n64 n64Var) {
            super(n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            this.f52011c = obj;
            this.f52013e |= Integer.MIN_VALUE;
            return whg.this.mo38219a(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p001o.m28.InterfaceC15204b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo38219a(jl6 jl6Var, o18 o18Var, n64 n64Var) throws Throwable {
        C17870a c17870a;
        if (n64Var instanceof C17870a) {
            c17870a = (C17870a) n64Var;
            int i = c17870a.f52013e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17870a.f52013e = i - Integer.MIN_VALUE;
            } else {
                c17870a = new C17870a(n64Var);
            }
        }
        Object objM39980a = c17870a.f52011c;
        Object objM51918f = uq8.m51918f();
        int i2 = c17870a.f52013e;
        if (i2 == 0) {
            wre.m54934b(objM39980a);
            g48 g48VarM41347f = o18Var.m41347f();
            if (t48.m49282c(g48VarM41347f.getStatus())) {
                big.C12437a c12437a = new big.C12437a();
                c12437a.m19213g((String) g48VarM41347f.getHeaders().get("Content-Type"));
                String str = (String) g48VarM41347f.getHeaders().get("x-amzn-RequestCharacters");
                c12437a.m19214h(str != null ? Integer.parseInt(str) : 0);
                c12437a.m19212f(n18.m39981b(g48VarM41347f.getBody()));
                c12437a.m19208b();
                return c12437a.m19207a();
            }
            m18 body = g48VarM41347f.getBody();
            c17870a.f52009a = jl6Var;
            c17870a.f52010b = o18Var;
            c17870a.f52013e = 1;
            objM39980a = n18.m39980a(body, c17870a);
            if (objM39980a == objM51918f) {
                return objM51918f;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o18Var = (o18) c17870a.f52010b;
            jl6Var = (jl6) c17870a.f52009a;
            wre.m54934b(objM39980a);
        }
        xhg.m56322b(jl6Var, o18Var, (byte[]) objM39980a);
        throw new qe9();
    }
}
