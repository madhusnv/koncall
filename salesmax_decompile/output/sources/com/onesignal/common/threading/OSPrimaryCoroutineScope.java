package com.onesignal.common.threading;

import p001o.h84;
import p001o.i84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.rm1;
import p001o.sq8;
import p001o.uq8;
import p001o.wkh;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes6.dex */
public final class OSPrimaryCoroutineScope {
    public static final OSPrimaryCoroutineScope INSTANCE = new OSPrimaryCoroutineScope();
    private static final h84 mainScope = i84.m31707a(wkh.m54673b("OSPrimaryCoroutineScope"));

    @l75(m36647c = "com.onesignal.common.threading.OSPrimaryCoroutineScope$execute$1", m36648f = "OSPrimaryCoroutineScope.kt", m36649l = {16}, m36650m = "invokeSuspend")
    /* renamed from: com.onesignal.common.threading.OSPrimaryCoroutineScope$execute$1 */
    public static final class C115861 extends jgg implements nl7 {
        final /* synthetic */ xk7 $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115861(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.$block = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            return new C115861(this.$block, n64Var);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            Object objM51918f = uq8.m51918f();
            int i = this.label;
            if (i == 0) {
                wre.m54934b(obj);
                xk7 xk7Var = this.$block;
                this.label = 1;
                if (xk7Var.invoke(this) == objM51918f) {
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
        public final Object invoke(h84 h84Var, n64 n64Var) {
            return ((C115861) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    private OSPrimaryCoroutineScope() {
    }

    public final void execute(xk7 xk7Var) {
        sq8.m48649h(xk7Var, "block");
        rm1.m46952d(mainScope, null, null, new C115861(xk7Var, null), 3, null);
    }
}
