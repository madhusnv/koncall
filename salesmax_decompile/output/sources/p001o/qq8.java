package p001o;

import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public abstract class qq8 {

    /* renamed from: o.qq8$a */
    public static final class C16444a extends jgg implements nl7 {

        /* renamed from: a */
        public int f42290a;

        /* renamed from: b */
        public /* synthetic */ Object f42291b;

        /* renamed from: c */
        public final /* synthetic */ uk7 f42292c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16444a(uk7 uk7Var, n64 n64Var) {
            super(2, n64Var);
            this.f42292c = uk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C16444a c16444a = new C16444a(this.f42292c, n64Var);
            c16444a.f42291b = obj;
            return c16444a;
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f42290a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return qq8.m45767c(((h84) this.f42291b).mo6529D(), this.f42292c);
        }

        @Override // p001o.nl7
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C16444a) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    /* renamed from: b */
    public static final Object m45766b(q74 q74Var, uk7 uk7Var, n64 n64Var) {
        return pm1.m43867g(q74Var, new C16444a(uk7Var, null), n64Var);
    }

    /* renamed from: c */
    public static final Object m45767c(q74 q74Var, uk7 uk7Var) throws Throwable {
        try {
            dlh dlhVar = new dlh();
            dlhVar.m23426B(z69.m58846k(q74Var));
            try {
                return uk7Var.invoke();
            } finally {
                dlhVar.m23427y();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
