package com.amplifyframework.statemachine;

import com.amplifyframework.statemachine.State;
import java.util.List;
import p001o.ch3;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class StateResolution<T extends State> {
    public static final Companion Companion = new Companion(null);
    private final List<Action> actions;
    private final T newState;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T extends State> StateResolution<T> from(T t) {
            sq8.m48649h(t, "_state");
            return new StateResolution<>(t, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateResolution(T t, List<? extends Action> list) {
        sq8.m48649h(t, "newState");
        sq8.m48649h(list, "actions");
        this.newState = t;
        this.actions = list;
    }

    public final List<Action> getActions() {
        return this.actions;
    }

    public final T getNewState() {
        return this.newState;
    }

    public /* synthetic */ StateResolution(State state, List list, int i, id5 id5Var) {
        this(state, (i & 2) != 0 ? ch3.m21246k() : list);
    }
}
