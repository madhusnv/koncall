package com.google.common.util.concurrent;

import java.util.Objects;
import yh.AbstractC8662f;
import zh.AbstractC8954a;
import zh.AbstractC8955b;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CycleDetectingLockFactory$PotentialDeadlockException extends IllegalStateException {
    static {
        AbstractC8662f.m16004k(3, AbstractC8955b.class.getName(), "com.google.common.util.concurrent.CycleDetectingLockFactory$PotentialDeadlockException", AbstractC8954a.class.getName());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        Objects.requireNonNull(message);
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable cause = null; cause != null; cause = cause.getCause()) {
            sb2.append(", ");
            sb2.append(cause.getMessage());
        }
        return sb2.toString();
    }
}
