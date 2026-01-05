package com.amplifyframework.datastore.events;

import a2.AbstractC0030c;
import java.util.Arrays;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SyncQueriesStartedEvent {
    private final String[] models;

    public SyncQueriesStartedEvent(String[] strArr) {
        this.models = (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SyncQueriesStartedEvent.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.models, ((SyncQueriesStartedEvent) obj).models);
    }

    public String[] getModels() {
        return this.models;
    }

    public int hashCode() {
        return Arrays.hashCode(this.models);
    }

    public String toString() {
        return AbstractC0030c.m123n(new StringBuilder("SyncQueriesStartedEvent{models="), Arrays.toString(this.models), '}');
    }
}
