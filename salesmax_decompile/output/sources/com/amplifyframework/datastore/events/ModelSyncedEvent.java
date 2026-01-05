package com.amplifyframework.datastore.events;

import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class ModelSyncedEvent implements HubEvent.Data<ModelSyncedEvent> {
    private final int added;
    private final int deleted;
    private final boolean isDeltaSync;
    private final boolean isFullSync;
    private final String model;
    private final int updated;

    public ModelSyncedEvent(String str, boolean z, int i, int i2, int i3) {
        this.added = i;
        this.updated = i2;
        this.deleted = i3;
        this.model = str;
        this.isFullSync = z;
        this.isDeltaSync = !z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSyncedEvent.class != obj.getClass()) {
            return false;
        }
        ModelSyncedEvent modelSyncedEvent = (ModelSyncedEvent) obj;
        if (s6c.m47909a(this.model, modelSyncedEvent.model) && s6c.m47909a(Boolean.valueOf(this.isFullSync), Boolean.valueOf(modelSyncedEvent.isFullSync)) && s6c.m47909a(Boolean.valueOf(this.isDeltaSync), Boolean.valueOf(modelSyncedEvent.isDeltaSync)) && s6c.m47909a(Integer.valueOf(this.added), Integer.valueOf(modelSyncedEvent.added)) && s6c.m47909a(Integer.valueOf(this.updated), Integer.valueOf(modelSyncedEvent.updated))) {
            return s6c.m47909a(Integer.valueOf(this.deleted), Integer.valueOf(modelSyncedEvent.deleted));
        }
        return false;
    }

    public int getAdded() {
        return this.added;
    }

    public int getDeleted() {
        return this.deleted;
    }

    public String getModel() {
        return this.model;
    }

    public int getUpdated() {
        return this.updated;
    }

    public int hashCode() {
        String str = this.model;
        return ((((((((((str != null ? str.hashCode() : 0) * 31) + Boolean.valueOf(this.isFullSync).hashCode()) * 31) + Boolean.valueOf(this.isDeltaSync).hashCode()) * 31) + Integer.valueOf(this.added).intValue()) * 31) + Integer.valueOf(this.updated).intValue()) * 31) + Integer.valueOf(this.deleted).intValue();
    }

    public boolean isDeltaSync() {
        return this.isDeltaSync;
    }

    public boolean isFullSync() {
        return this.isFullSync;
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<ModelSyncedEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.MODEL_SYNCED, this);
    }

    public String toString() {
        return "ModelSyncedEvent{model=" + this.model + ", isFullSync=" + this.isFullSync + ", isDeltaSync=" + this.isDeltaSync + ", added=" + this.added + ", updated=" + this.updated + ", deleted=" + this.deleted + '}';
    }
}
