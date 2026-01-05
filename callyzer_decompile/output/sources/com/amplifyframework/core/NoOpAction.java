package com.amplifyframework.core;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class NoOpAction implements Action {
    private NoOpAction() {
    }

    public static NoOpAction create() {
        return new NoOpAction();
    }

    public boolean equals(Object obj) {
        return obj instanceof NoOpAction;
    }

    public int hashCode() {
        return NoOpAction.class.hashCode();
    }

    public String toString() {
        return "NoOpAction {}";
    }

    @Override // com.amplifyframework.core.Action
    public void call() {
    }
}
