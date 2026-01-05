package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface StateMachineResolver<StateType extends State> {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static <StateType extends State> AnyResolver<StateType, ?> eraseToAnyResolver(StateMachineResolver<StateType> stateMachineResolver) {
            return StateMachineResolver.super.eraseToAnyResolver();
        }

        @Deprecated
        public static <StateType extends State> LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(StateMachineResolver<StateType> stateMachineResolver, Logger logger, Level level) {
            AbstractC4154l.m8923f(level, "level");
            return StateMachineResolver.super.logging(logger, level);
        }
    }

    static /* synthetic */ LoggingStateMachineResolver logging$default(StateMachineResolver stateMachineResolver, Logger logger, Level FINE, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logging");
        }
        if ((i10 & 1) != 0) {
            logger = null;
        }
        if ((i10 & 2) != 0) {
            FINE = Level.FINE;
            AbstractC4154l.m8922e(FINE, "FINE");
        }
        return stateMachineResolver.logging(logger, FINE);
    }

    default AnyResolver<StateType, ?> eraseToAnyResolver() {
        AnyResolver<StateType, ?> anyResolver = this instanceof AnyResolver ? (AnyResolver) this : null;
        return anyResolver == null ? new AnyResolver<>(this) : anyResolver;
    }

    StateType getDefaultState();

    default LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, Level level) {
        AbstractC4154l.m8923f(level, "level");
        return new LoggingStateMachineResolver<>(this, logger, level);
    }

    StateResolution<StateType> resolve(StateType statetype, StateMachineEvent stateMachineEvent);
}
