package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.Action;
import p001o.bj8;
import p001o.n64;
import p001o.o64;
import p001o.ql7;
import p001o.uq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class Action$Companion$invoke$1 implements Action {
    final /* synthetic */ ql7 $block;
    private final String id;

    public Action$Companion$invoke$1(String str, ql7 ql7Var) {
        this.$block = ql7Var;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        Object objInvoke = this.$block.invoke(eventDispatcher, environment, n64Var);
        return objInvoke == uq8.m51918f() ? objInvoke : y3i.f54824a;
    }

    public Object execute$$forInline(EventDispatcher eventDispatcher, Environment environment, final n64 n64Var) {
        bj8.m19245c(4);
        new o64(n64Var) { // from class: com.amplifyframework.statemachine.Action$Companion$invoke$1$execute$1
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
        this.$block.invoke(eventDispatcher, environment, n64Var);
        return y3i.f54824a;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }
}
