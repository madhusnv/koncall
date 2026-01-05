package p001o;

import p001o.plb;
import p001o.q74;

/* loaded from: classes2.dex */
public final class k8f implements plb {

    /* renamed from: a */
    public static final k8f f31650a = new k8f();

    /* renamed from: o.k8f$a */
    public static final class C14734a extends jgg implements nl7 {

        /* renamed from: a */
        public int f31651a;

        /* renamed from: b */
        public final /* synthetic */ xk7 f31652b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14734a(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f31652b = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C14734a(this.f31652b, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.f31651a;
            if (i == 0) {
                wre.m54934b(obj);
                this.f31651a = 1;
                if (nk5.m40720b(16L, this) == objM51918f) {
                    return objM51918f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wre.m54934b(obj);
            }
            return this.f31652b.invoke(ml1.m39305e(System.nanoTime()));
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C14734a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // p001o.q74
    public Object fold(Object obj, nl7 nl7Var) {
        return plb.C16135a.m43844a(this, obj, nl7Var);
    }

    @Override // p001o.q74.InterfaceC16311b, p001o.q74
    public q74.InterfaceC16311b get(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43845b(this, interfaceC16312c);
    }

    @Override // p001o.plb
    /* renamed from: h */
    public Object mo29725h(xk7 xk7Var, n64 n64Var) {
        return pm1.m43867g(eu5.m25612c(), new C14734a(xk7Var, null), n64Var);
    }

    @Override // p001o.q74
    public q74 minusKey(q74.InterfaceC16312c interfaceC16312c) {
        return plb.C16135a.m43846c(this, interfaceC16312c);
    }

    @Override // p001o.q74
    public q74 plus(q74 q74Var) {
        return plb.C16135a.m43847d(this, q74Var);
    }
}
