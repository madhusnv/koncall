package com.amplifyframework.hub;

import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SubscriptionToken {
    private final UUID uuid;

    private SubscriptionToken(UUID uuid) {
        this.uuid = uuid;
    }

    public static SubscriptionToken create() {
        return new SubscriptionToken(UUID.randomUUID());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubscriptionToken.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.uuid, ((SubscriptionToken) obj).uuid);
    }

    public int hashCode() {
        UUID uuid = this.uuid;
        if (uuid != null) {
            return uuid.hashCode();
        }
        return 0;
    }
}
