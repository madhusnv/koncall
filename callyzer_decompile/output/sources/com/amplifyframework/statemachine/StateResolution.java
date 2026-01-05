package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import java.util.List;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6668r;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StateResolution<T extends State> {
    public static final Companion Companion = new Companion(null);
    private final List<Action> actions;
    private final T newState;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T extends State> StateResolution<T> from(T _state) {
            AbstractC4154l.m8923f(_state, "_state");
            return new StateResolution<>(_state, null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateResolution(T newState, List<? extends Action> actions) {
        AbstractC4154l.m8923f(newState, "newState");
        AbstractC4154l.m8923f(actions, "actions");
        this.newState = newState;
        this.actions = actions;
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final T getNewState() {
        return this.newState;
    }

    public /* synthetic */ StateResolution(State state, List list, int i10, AbstractC4148f abstractC4148f) {
        this(state, (i10 & 2) != 0 ? C6668r.f31943a : list);
    }
}
