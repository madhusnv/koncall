package com.amplifyframework.statemachine;

import java.util.Iterator;
import java.util.List;
import p001o.kt7;
import p001o.rm1;
import p001o.sq8;
import p001o.z74;

/* loaded from: classes5.dex */
public final class ConcurrentEffectExecutor implements EffectExecutor {
    private final z74 dispatcherQueue;

    public ConcurrentEffectExecutor(z74 z74Var) {
        sq8.m48649h(z74Var, "dispatcherQueue");
        this.dispatcherQueue = z74Var;
    }

    @Override // com.amplifyframework.statemachine.EffectExecutor
    public void execute(List<? extends Action> list, EventDispatcher eventDispatcher, Environment environment) {
        sq8.m48649h(list, "actions");
        sq8.m48649h(eventDispatcher, "eventDispatcher");
        sq8.m48649h(environment, "environment");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            rm1.m46952d(kt7.f32697a, this.dispatcherQueue, null, new ConcurrentEffectExecutor$execute$1$1((Action) it.next(), eventDispatcher, environment, null), 2, null);
        }
    }
}
