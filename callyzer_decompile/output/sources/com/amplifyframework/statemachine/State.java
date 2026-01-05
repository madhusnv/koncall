package com.amplifyframework.statemachine;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public interface State {

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class DefaultImpls {
        @Deprecated
        public static String getType(State state) {
            return State.super.getType();
        }
    }

    boolean equals(Object obj);

    default String getType() {
        return getClass().getSimpleName();
    }

    int hashCode();

    String toString();
}
