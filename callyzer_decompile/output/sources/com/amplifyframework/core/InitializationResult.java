package com.amplifyframework.core;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class InitializationResult {
    private final Throwable failure;
    private final InitializationStatus initializationStatus;

    private InitializationResult(InitializationStatus initializationStatus, Throwable th2) {
        this.initializationStatus = initializationStatus;
        this.failure = th2;
    }

    public static InitializationResult failure(Throwable th2) {
        Objects.requireNonNull(th2);
        return new InitializationResult(InitializationStatus.FAILED, th2);
    }

    public static InitializationResult success() {
        return new InitializationResult(InitializationStatus.SUCCEEDED, null);
    }

    public Throwable getFailure() {
        return this.failure;
    }

    public InitializationStatus getInitializationStatus() {
        return this.initializationStatus;
    }

    public boolean isFailure() {
        return InitializationStatus.FAILED.equals(this.initializationStatus);
    }

    public boolean isSuccess() {
        return InitializationStatus.SUCCEEDED.equals(this.initializationStatus);
    }
}
