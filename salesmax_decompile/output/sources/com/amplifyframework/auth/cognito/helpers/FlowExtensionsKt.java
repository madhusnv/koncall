package com.amplifyframework.auth.cognito.helpers;

import p001o.e47;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.v37;
import p001o.wre;
import p001o.xk7;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class FlowExtensionsKt {

    @l75(m36647c = "com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt$collectWhile$2", m36648f = "FlowExtensions.kt", m36649l = {}, m36650m = "invokeSuspend")
    /* renamed from: com.amplifyframework.auth.cognito.helpers.FlowExtensionsKt$collectWhile$2 */
    public static final class C105202 extends jgg implements nl7 {
        final /* synthetic */ xk7 $collector;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105202(xk7 xk7Var, n64 n64Var) {
            super(2, n64Var);
            this.$collector = xk7Var;
        }

        @Override // p001o.vb1
        public final n64 create(Object obj, n64 n64Var) {
            C105202 c105202 = new C105202(this.$collector, n64Var);
            c105202.L$0 = obj;
            return c105202;
        }

        @Override // p001o.nl7
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((C105202) obj, (n64) obj2);
        }

        @Override // p001o.vb1
        public final Object invokeSuspend(Object obj) {
            uq8.m51918f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wre.m54934b(obj);
            return this.$collector.invoke(this.L$0);
        }

        public final Object invoke(T t, n64 n64Var) {
            return ((C105202) create(t, n64Var)).invokeSuspend(y3i.f54824a);
        }
    }

    public static final <T> Object collectWhile(v37 v37Var, xk7 xk7Var, n64 n64Var) {
        Object objM24272f = e47.m24272f(e47.m24287u(v37Var, new C105202(xk7Var, null)), n64Var);
        return objM24272f == uq8.m51918f() ? objM24272f : y3i.f54824a;
    }
}
