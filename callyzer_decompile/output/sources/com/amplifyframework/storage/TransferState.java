package com.amplifyframework.storage;

import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;
import pg.b8;
import rw.AbstractC6662l;
import rw.AbstractC6663m;
import xw.InterfaceC8493a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class TransferState {
    private static final /* synthetic */ InterfaceC8493a $ENTRIES;
    private static final /* synthetic */ TransferState[] $VALUES;
    public static final Companion Companion;
    public static final TransferState WAITING = new TransferState("WAITING", 0);
    public static final TransferState IN_PROGRESS = new TransferState("IN_PROGRESS", 1);
    public static final TransferState PAUSED = new TransferState("PAUSED", 2);
    public static final TransferState RESUMED_WAITING = new TransferState("RESUMED_WAITING", 3);
    public static final TransferState COMPLETED = new TransferState("COMPLETED", 4);
    public static final TransferState CANCELED = new TransferState("CANCELED", 5);
    public static final TransferState PENDING_FAILED = new TransferState("PENDING_FAILED", 6);
    public static final TransferState FAILED = new TransferState("FAILED", 7);
    public static final TransferState PART_COMPLETED = new TransferState("PART_COMPLETED", 8);
    public static final TransferState PENDING_CANCEL = new TransferState("PENDING_CANCEL", 9);
    public static final TransferState PENDING_PAUSE = new TransferState("PENDING_PAUSE", 10);
    public static final TransferState UNKNOWN = new TransferState("UNKNOWN", 11);

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4148f abstractC4148f) {
            this();
        }

        public final TransferState getState(String state) {
            AbstractC4154l.m8923f(state, "state");
            try {
                return TransferState.valueOf(state);
            } catch (IllegalArgumentException unused) {
                return TransferState.UNKNOWN;
            }
        }

        public final boolean isCancelled(TransferState transferState) {
            return AbstractC6663m.m12767z(AbstractC6662l.m12710M(new TransferState[]{TransferState.PENDING_CANCEL, TransferState.CANCELED}), transferState);
        }

        public final boolean isInTerminalState(TransferState transferState) {
            return AbstractC6663m.m12767z(AbstractC6662l.m12710M(new TransferState[]{TransferState.COMPLETED, TransferState.CANCELED, TransferState.FAILED, TransferState.PART_COMPLETED}), transferState);
        }

        public final boolean isPaused(TransferState transferState) {
            return AbstractC6663m.m12767z(AbstractC6662l.m12710M(new TransferState[]{TransferState.PENDING_PAUSE, TransferState.PAUSED}), transferState);
        }

        public final boolean isStarted(TransferState transferState) {
            return AbstractC6663m.m12767z(AbstractC6662l.m12710M(new TransferState[]{TransferState.WAITING, TransferState.IN_PROGRESS, TransferState.RESUMED_WAITING}), transferState);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ TransferState[] $values() {
        return new TransferState[]{WAITING, IN_PROGRESS, PAUSED, RESUMED_WAITING, COMPLETED, CANCELED, PENDING_FAILED, FAILED, PART_COMPLETED, PENDING_CANCEL, PENDING_PAUSE, UNKNOWN};
    }

    static {
        TransferState[] transferStateArr$values = $values();
        $VALUES = transferStateArr$values;
        $ENTRIES = b8.m11548b(transferStateArr$values);
        Companion = new Companion(null);
    }

    private TransferState(String str, int i10) {
    }

    public static InterfaceC8493a getEntries() {
        return $ENTRIES;
    }

    public static final TransferState getState(String str) {
        return Companion.getState(str);
    }

    public static final boolean isCancelled(TransferState transferState) {
        return Companion.isCancelled(transferState);
    }

    public static final boolean isInTerminalState(TransferState transferState) {
        return Companion.isInTerminalState(transferState);
    }

    public static final boolean isPaused(TransferState transferState) {
        return Companion.isPaused(transferState);
    }

    public static final boolean isStarted(TransferState transferState) {
        return Companion.isStarted(transferState);
    }

    public static TransferState valueOf(String str) {
        return (TransferState) Enum.valueOf(TransferState.class, str);
    }

    public static TransferState[] values() {
        return (TransferState[]) $VALUES.clone();
    }
}
