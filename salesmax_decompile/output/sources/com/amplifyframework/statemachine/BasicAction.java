package com.amplifyframework.statemachine;

import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import p001o.n64;
import p001o.ql7;
import p001o.sq8;
import p001o.uq8;
import p001o.y3i;

/* loaded from: classes5.dex */
public final class BasicAction implements Action {
    private final ql7 block;
    private String id;

    public BasicAction(String str, ql7 ql7Var) {
        sq8.m48649h(str, OutcomeConstants.OUTCOME_ID);
        sq8.m48649h(ql7Var, "block");
        this.id = str;
        this.block = ql7Var;
    }

    @Override // com.amplifyframework.statemachine.Action
    public Object execute(EventDispatcher eventDispatcher, Environment environment, n64 n64Var) {
        Object objInvoke = this.block.invoke(eventDispatcher, environment, n64Var);
        return objInvoke == uq8.m51918f() ? objInvoke : y3i.f54824a;
    }

    public final ql7 getBlock() {
        return this.block;
    }

    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    public void setId(String str) {
        sq8.m48649h(str, "<set-?>");
        this.id = str;
    }
}
