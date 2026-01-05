package p001o;

import java.io.IOException;
import p001o.vre;

/* loaded from: classes6.dex */
public abstract class hl6 {

    /* renamed from: o.hl6$a */
    public static final class C13990a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ bt1 f27104a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13990a(bt1 bt1Var) {
            super(1);
            this.f27104a = bt1Var;
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return y3i.f54824a;
        }

        public final void invoke(Throwable th) {
            this.f27104a.cancel();
        }
    }

    /* renamed from: o.hl6$b */
    public static final class C13991b implements z22 {

        /* renamed from: a */
        public final /* synthetic */ xb2 f27105a;

        /* renamed from: o.hl6$b$a */
        public static final class a extends kf9 implements xk7 {

            /* renamed from: a */
            public final /* synthetic */ zqe f27106a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(zqe zqeVar) {
                super(1);
                this.f27106a = zqeVar;
            }

            @Override // p001o.xk7
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
                invoke((Throwable) obj);
                return y3i.f54824a;
            }

            public final void invoke(Throwable th) throws IOException {
                sq8.m48649h(th, "it");
                ggj.m28626f(this.f27106a);
            }
        }

        public C13991b(xb2 xb2Var) {
            this.f27105a = xb2Var;
        }

        @Override // p001o.z22
        public void onFailure(bt1 bt1Var, IOException iOException) {
            sq8.m48649h(bt1Var, "call");
            sq8.m48649h(iOException, "e");
            xb2 xb2Var = this.f27105a;
            vre.C17665a c17665a = vre.f50797b;
            xb2Var.resumeWith(vre.m53351b(wre.m54933a(iOException)));
        }

        @Override // p001o.z22
        public void onResponse(bt1 bt1Var, zqe zqeVar) {
            sq8.m48649h(bt1Var, "call");
            sq8.m48649h(zqeVar, "response");
            this.f27105a.mo48685B(zqeVar, new a(zqeVar));
        }
    }

    /* renamed from: a */
    public static final Object m30756a(bt1 bt1Var, n64 n64Var) {
        zb2 zb2Var = new zb2(tq8.m50336c(n64Var), 1);
        zb2Var.m59116E();
        zb2Var.mo48694y(new C13990a(bt1Var));
        bt1Var.v1(new C13991b(zb2Var));
        Object objM59140v = zb2Var.m59140v();
        if (objM59140v == uq8.m51918f()) {
            n75.m40201c(n64Var);
        }
        return objM59140v;
    }
}
