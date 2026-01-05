package com.amplifyframework.statemachine;

import java.util.List;

/* loaded from: classes5.dex */
public interface EffectExecutor {
    void execute(List<? extends Action> list, EventDispatcher eventDispatcher, Environment environment);
}
