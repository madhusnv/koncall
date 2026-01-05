package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.sq8;

/* loaded from: classes5.dex */
public interface StateMachineResolver<StateType extends State> {

    public static final class DefaultImpls {
        public static <StateType extends State> AnyResolver<StateType, ?> eraseToAnyResolver(StateMachineResolver<StateType> stateMachineResolver) {
            AnyResolver<StateType, ?> anyResolver = stateMachineResolver instanceof AnyResolver ? (AnyResolver) stateMachineResolver : null;
            return anyResolver == null ? new AnyResolver<>(stateMachineResolver) : anyResolver;
        }

        public static <StateType extends State> LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(StateMachineResolver<StateType> stateMachineResolver, Logger logger, Level level) {
            sq8.m48649h(level, FirebaseAnalytics.Param.LEVEL);
            return new LoggingStateMachineResolver<>(stateMachineResolver, logger, level);
        }

        public static /* synthetic */ LoggingStateMachineResolver logging$default(StateMachineResolver stateMachineResolver, Logger logger, Level level, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logging");
            }
            if ((i & 1) != 0) {
                logger = null;
            }
            if ((i & 2) != 0) {
                level = Level.FINE;
                sq8.m48648g(level, "FINE");
            }
            return stateMachineResolver.logging(logger, level);
        }
    }

    AnyResolver<StateType, ?> eraseToAnyResolver();

    StateType getDefaultState();

    LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, Level level);

    StateResolution<StateType> resolve(StateType statetype, StateMachineEvent stateMachineEvent);
}
