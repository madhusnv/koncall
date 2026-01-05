package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class AnyResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    private StateType defaultState;
    private final ResolverType resolver;

    public AnyResolver(ResolverType resolver) {
        AbstractC4154l.m8923f(resolver, "resolver");
        this.resolver = resolver;
        this.defaultState = (StateType) resolver.getDefaultState();
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public AnyResolver<StateType, ?> eraseToAnyResolver() {
        return super.eraseToAnyResolver();
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateType getDefaultState() {
        return this.defaultState;
    }

    public final ResolverType getResolver() {
        return this.resolver;
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, Level level) {
        return super.logging(logger, level);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(StateType oldState, StateMachineEvent event) {
        AbstractC4154l.m8923f(oldState, "oldState");
        AbstractC4154l.m8923f(event, "event");
        return this.resolver.resolve(oldState, event);
    }

    public void setDefaultState(StateType statetype) {
        AbstractC4154l.m8923f(statetype, "<set-?>");
        this.defaultState = statetype;
    }
}
