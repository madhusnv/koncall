package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AnyResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    private StateType defaultState;
    private final ResolverType resolver;

    public AnyResolver(ResolverType resolvertype) {
        sq8.m48649h(resolvertype, "resolver");
        this.resolver = resolvertype;
        this.defaultState = (StateType) resolvertype.getDefaultState();
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public AnyResolver<StateType, ?> eraseToAnyResolver() {
        return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
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
        return StateMachineResolver.DefaultImpls.logging(this, logger, level);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(StateType statetype, StateMachineEvent stateMachineEvent) {
        sq8.m48649h(statetype, "oldState");
        sq8.m48649h(stateMachineEvent, "event");
        return this.resolver.resolve(statetype, stateMachineEvent);
    }

    public void setDefaultState(StateType statetype) {
        sq8.m48649h(statetype, "<set-?>");
        this.defaultState = statetype;
    }
}
