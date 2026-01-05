package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Action;
import p001o.bj8;
import p001o.n64;
import p001o.o64;
import p001o.sl7;
import p001o.sq8;
import p001o.uq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class Action$Companion$invoke$2 implements Action {
    final /* synthetic */ sl7 $block;
    private final String id;

    public Action$Companion$invoke$2(String str, sl7 sl7Var) {
        this.$block = sl7Var;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
        Object objMo37376j = this.$block.mo37376j(environment, getId(), eventDispatcher, n64Var);
        return objMo37376j == uq8.m51918f() ? objMo37376j : y3i.f54824a;
    }

    public Object execute$$forInline(EventDispatcher eventDispatcher, Environment environment, final n64 n64Var) {
        bj8.m19245c(4);
        new o64(n64Var) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$2$execute$1
            int label;
            /* synthetic */ Object result;

            @Override // p001o.vb1
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.execute(null, null, this);
            }
        };
        bj8.m19245c(5);
        sq8.m48647f(environment, "null cannot be cast to non-null type EnvType of com.amplifyframework.statemachine.Action.Companion.invoke");
        this.$block.mo37376j(environment, getId(), eventDispatcher, n64Var);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
