package com.amplifyframework.statemachine;

import p001o.h84;
import p001o.jgg;
import p001o.l75;
import p001o.n64;
import p001o.nl7;
import p001o.uq8;
import p001o.wre;
import p001o.y3i;

@l75(m36647c = "com.amplifyframework.statemachine.ConcurrentEffectExecutor$execute$1$1", m36648f = "ConcurrentEffectExecutor.kt", m36649l = {26}, m36650m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ConcurrentEffectExecutor$execute$1$1 extends jgg implements nl7 {
    final /* synthetic */ Action $action;
    final /* synthetic */ Environment $environment;
    final /* synthetic */ EventDispatcher $eventDispatcher;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConcurrentEffectExecutor$execute$1$1(Action action, EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        super(2, n64Var);
        this.$action = action;
        this.$eventDispatcher = eventDispatcher;
        this.$environment = environment;
    }

    @Override // p001o.vb1
    public final n64 create(Object obj, n64 n64Var) {
        return new ConcurrentEffectExecutor$execute$1$1(this.$action, this.$eventDispatcher, this.$environment, n64Var);
    }

    @Override // p001o.vb1
    public final Object invokeSuspend(Object obj) {
        Object objM51918f = uq8.m51918f();
        int i = this.label;
        if (i == 0) {
            wre.m54934b(obj);
            Action action = this.$action;
            EventDispatcher eventDispatcher = this.$eventDispatcher;
            Environment environment = this.$environment;
            this.label = 1;
            if (action.execute(eventDispatcher, environment, this) == objM51918f) {
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
        return ((ConcurrentEffectExecutor$execute$1$1) create(h84Var, n64Var)).invokeSuspend(y3i.f54824a);
    }
}
