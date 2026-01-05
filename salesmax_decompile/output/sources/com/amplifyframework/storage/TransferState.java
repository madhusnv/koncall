package com.amplifyframework.storage;

import p001o.gi6;
import p001o.hi6;
import p001o.id5;
import p001o.kh3;
import p001o.nif;
import p001o.sq8;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TransferState {
    private static final /* synthetic */ gi6 $ENTRIES;
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

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final TransferState getState(String str) {
            sq8.m48649h(str, "state");
            try {
                return TransferState.valueOf(str);
            } catch (IllegalArgumentException unused) {
                return TransferState.UNKNOWN;
            }
        }

        public final boolean isCancelled(TransferState transferState) {
            return kh3.m35708X(nif.m40668i(TransferState.PENDING_CANCEL, TransferState.CANCELED), transferState);
        }

        public final boolean isInTerminalState(TransferState transferState) {
            return kh3.m35708X(nif.m40668i(TransferState.COMPLETED, TransferState.CANCELED, TransferState.FAILED, TransferState.PART_COMPLETED), transferState);
        }

        public final boolean isPaused(TransferState transferState) {
            return kh3.m35708X(nif.m40668i(TransferState.PENDING_PAUSE, TransferState.PAUSED), transferState);
        }

        public final boolean isStarted(TransferState transferState) {
            return kh3.m35708X(nif.m40668i(TransferState.WAITING, TransferState.IN_PROGRESS, TransferState.RESUMED_WAITING), transferState);
        }
    }

    private static final /* synthetic */ TransferState[] $values() {
        return new TransferState[]{WAITING, IN_PROGRESS, PAUSED, RESUMED_WAITING, COMPLETED, CANCELED, PENDING_FAILED, FAILED, PART_COMPLETED, PENDING_CANCEL, PENDING_PAUSE, UNKNOWN};
    }

    static {
        TransferState[] transferStateArr$values = $values();
        $VALUES = transferStateArr$values;
        $ENTRIES = hi6.m30609a(transferStateArr$values);
        Companion = new Companion(null);
    }

    private TransferState(String str, int i) {
    }

    public static gi6 getEntries() {
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
