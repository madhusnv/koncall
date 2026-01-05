package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class LoggingStateMachineResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    public static final Companion Companion = new Companion(null);
    private final StateType defaultState;
    private final Level level;
    private Logger logger;
    private final ResolverType resolver;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final Logger makeDefaultLogger() throws SecurityException {
            Logger logger = Logger.getLogger(toString());
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setLevel(Level.ALL);
            logger.setLevel(Level.ALL);
            logger.addHandler(consoleHandler);
            logger.setUseParentHandlers(false);
            sq8.m48646e(logger);
            return logger;
        }
    }

    public LoggingStateMachineResolver(ResolverType resolvertype, Logger logger, Level level) {
        sq8.m48649h(resolvertype, "resolver");
        sq8.m48649h(level, FirebaseAnalytics.Param.LEVEL);
        this.resolver = resolvertype;
        this.level = level;
        this.logger = logger == null ? Companion.makeDefaultLogger() : logger;
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

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, Level level) {
        return StateMachineResolver.DefaultImpls.logging(this, logger, level);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(StateType statetype, StateMachineEvent stateMachineEvent) {
        sq8.m48649h(statetype, "oldState");
        sq8.m48649h(stateMachineEvent, "event");
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(statetype, stateMachineEvent);
        this.logger.log(this.level, statetype.toString());
        this.logger.log(this.level, stateMachineEvent.getType());
        this.logger.log(this.level, stateResolutionResolve.getNewState().toString());
        return stateResolutionResolve;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoggingStateMachineResolver(StateMachineResolver stateMachineResolver, Logger logger, Level level, int i, id5 id5Var) {
        logger = (i & 2) != 0 ? null : logger;
        if ((i & 4) != 0) {
            level = Level.INFO;
            sq8.m48648g(level, "INFO");
        }
        this(stateMachineResolver, logger, level);
    }
}
