package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineResolver;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class LoggingStateMachineResolver<StateType extends State, ResolverType extends StateMachineResolver<StateType>> implements StateMachineResolver<StateType> {
    public static final Companion Companion = new Companion(null);
    private final StateType defaultState;
    private final Level level;
    private Logger logger;
    private final ResolverType resolver;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final Logger makeDefaultLogger() throws SecurityException {
            Logger logger = Logger.getLogger(toString());
            ConsoleHandler consoleHandler = new ConsoleHandler();
            Level level = Level.ALL;
            consoleHandler.setLevel(level);
            logger.setLevel(level);
            logger.addHandler(consoleHandler);
            logger.setUseParentHandlers(false);
            return logger;
        }

        private Companion() {
        }
    }

    public LoggingStateMachineResolver(ResolverType resolver, Logger logger, Level level) {
        AbstractC4154l.m8923f(resolver, "resolver");
        AbstractC4154l.m8923f(level, "level");
        this.resolver = resolver;
        this.level = level;
        this.logger = logger == null ? Companion.makeDefaultLogger() : logger;
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

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public LoggingStateMachineResolver<StateType, StateMachineResolver<StateType>> logging(Logger logger, Level level) {
        return super.logging(logger, level);
    }

    @Override // com.amplifyframework.statemachine.StateMachineResolver
    public StateResolution<StateType> resolve(StateType oldState, StateMachineEvent event) {
        AbstractC4154l.m8923f(oldState, "oldState");
        AbstractC4154l.m8923f(event, "event");
        StateResolution<StateType> stateResolutionResolve = this.resolver.resolve(oldState, event);
        this.logger.log(this.level, oldState.toString());
        this.logger.log(this.level, event.getType());
        this.logger.log(this.level, stateResolutionResolve.getNewState().toString());
        return stateResolutionResolve;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoggingStateMachineResolver(StateMachineResolver stateMachineResolver, Logger logger, Level INFO, int i10, AbstractC4148f abstractC4148f) {
        logger = (i10 & 2) != 0 ? null : logger;
        if ((i10 & 4) != 0) {
            INFO = Level.INFO;
            AbstractC4154l.m8922e(INFO, "INFO");
        }
        this(stateMachineResolver, logger, INFO);
    }
}
