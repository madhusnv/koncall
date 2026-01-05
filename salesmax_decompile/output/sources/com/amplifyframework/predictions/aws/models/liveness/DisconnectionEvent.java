package com.amplifyframework.predictions.aws.models.liveness;

import p001o.dc9;
import p001o.dff;
import p001o.fff;
import p001o.id5;
import p001o.tbd;

@dff
/* loaded from: classes5.dex */
public final class DisconnectionEvent {
    public static final Companion Companion = new Companion(null);
    private final long timestampMillis;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final dc9 serializer() {
            return DisconnectionEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DisconnectionEvent(int i, long j, fff fffVar) {
        if (1 != (i & 1)) {
            tbd.m49692a(i, 1, DisconnectionEvent$$serializer.INSTANCE.getDescriptor());
        }
        this.timestampMillis = j;
    }

    public static /* synthetic */ DisconnectionEvent copy$default(DisconnectionEvent disconnectionEvent, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = disconnectionEvent.timestampMillis;
        }
        return disconnectionEvent.copy(j);
    }

    public static /* synthetic */ void getTimestampMillis$annotations() {
    }

    public final long component1() {
        return this.timestampMillis;
    }

    public final DisconnectionEvent copy(long j) {
        return new DisconnectionEvent(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisconnectionEvent) && this.timestampMillis == ((DisconnectionEvent) obj).timestampMillis;
    }

    public final long getTimestampMillis() {
        return this.timestampMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.timestampMillis);
    }

    public String toString() {
        return "DisconnectionEvent(timestampMillis=" + this.timestampMillis + ")";
    }

    public DisconnectionEvent(long j) {
        this.timestampMillis = j;
    }
}
