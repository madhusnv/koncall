package com.amplifyframework.statemachine;

import java.util.UUID;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class StateChangeListenerToken {
    private final UUID uuid;

    private StateChangeListenerToken(UUID uuid) {
        this.uuid = uuid;
    }

    public boolean equals(Object obj) {
        return (obj instanceof StateChangeListenerToken) && sq8.m48644c(((StateChangeListenerToken) obj).uuid, this.uuid);
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return this.uuid.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StateChangeListenerToken() {
        UUID uuidRandomUUID = UUID.randomUUID();
        sq8.m48648g(uuidRandomUUID, "randomUUID(...)");
        this(uuidRandomUUID);
    }
}
