package p001o;

import ai.salesmax.ui.service.CallStateManagerService;
import android.app.Service;

/* loaded from: classes.dex */
public final class ja1 implements p01 {

    /* renamed from: a */
    public final String f30020a = "background-service-listener";

    /* renamed from: o.ja1$a */
    public static final class C14478a extends jgg implements xk7 {

        /* renamed from: a */
        public int f30021a;

        /* renamed from: c */
        public final /* synthetic */ mii f30023c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14478a(mii miiVar, n64 n64Var) {
            super(1, n64Var);
            this.f30023c = miiVar;
        }

        @Override // p001o.vb1
        public final n64 create(n64 n64Var) {
            return ja1.this.new C14478a(this.f30023c, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.f30021a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            String unused = ja1.this.f30020a;
            Service serviceM2593J = CallStateManagerService.m2593J();
            CallStateManagerService callStateManagerService = serviceM2593J instanceof CallStateManagerService ? (CallStateManagerService) serviceM2593J : null;
            if (callStateManagerService == null) {
                return null;
            }
            callStateManagerService.x0(this.f30023c);
            return y3i.f54824a;
        }

        @Override // p001o.xk7
        public final Object invoke(n64 n64Var) {
            return ((C14478a) create(n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    @Override // p001o.p01
    /* renamed from: a */
    public void mo33434a(mii miiVar) {
        sq8.m48649h(miiVar, "userprofile");
        p74.f39487a.m43079g(new C14478a(miiVar, null));
    }
}
