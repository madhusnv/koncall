package com.amplifyframework.statemachine;

import p001o.sq8;

/* loaded from: classes5.dex */
public interface State {

    public static final class DefaultImpls {
        public static String getType(State state) {
            String simpleName = state.getClass().getSimpleName();
            sq8.m48648g(simpleName, "getSimpleName(...)");
            return simpleName;
        }
    }

    boolean equals(Object obj);

    String getType();

    int hashCode();

    String toString();
}
