package com.amplifyframework.statemachine;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;
import tx.AbstractC7262v;
import tx.c0;
import tx.z0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ConcurrentEffectExecutor implements EffectExecutor {
    private final AbstractC7262v dispatcherQueue;

    public ConcurrentEffectExecutor(AbstractC7262v dispatcherQueue) {
        AbstractC4154l.m8923f(dispatcherQueue, "dispatcherQueue");
        this.dispatcherQueue = dispatcherQueue;
    }

    @Override // com.amplifyframework.statemachine.EffectExecutor
    public void execute(List<? extends Action> actions, EventDispatcher eventDispatcher, Environment environment) {
        AbstractC4154l.m8923f(actions, "actions");
        AbstractC4154l.m8923f(eventDispatcher, "eventDispatcher");
        AbstractC4154l.m8923f(environment, "environment");
        for (Action action : actions) {
            c0.m13502y(z0.f34701a, this.dispatcherQueue, null, new ConcurrentEffectExecutor$execute$1$1(action, eventDispatcher, environment, null), 2);
        }
    }
}
