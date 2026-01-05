package com.amplifyframework.core;

/* loaded from: classes5.dex */
public final class NoOpAction implements Action {
    private NoOpAction() {
    }

    public static NoOpAction create() {
        return new NoOpAction();
    }

    @Override // com.amplifyframework.core.Action
    public void call() {
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
}
