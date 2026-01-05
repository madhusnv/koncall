package com.amplifyframework.statemachine;

import java.util.UUID;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class StateChangeListenerToken {
    private final UUID uuid;

    private StateChangeListenerToken(UUID uuid) {
        this.uuid = uuid;
    }

    public boolean equals(Object obj) {
        return (obj instanceof StateChangeListenerToken) && AbstractC4154l.m8918a(((StateChangeListenerToken) obj).uuid, this.uuid);
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
        AbstractC4154l.m8922e(uuidRandomUUID, "randomUUID(...)");
        this(uuidRandomUUID);
    }
}
