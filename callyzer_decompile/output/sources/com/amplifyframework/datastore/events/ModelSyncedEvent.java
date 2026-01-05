package com.amplifyframework.datastore.events;

import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.sun.mail.util.AbstractC1452a;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ModelSyncedEvent implements HubEvent.Data<ModelSyncedEvent> {
    private final int added;
    private final int deleted;
    private final boolean isDeltaSync;
    private final boolean isFullSync;
    private final String model;
    private final int updated;

    public ModelSyncedEvent(String str, boolean z6, int i10, int i11, int i12) {
        this.added = i10;
        this.updated = i11;
        this.deleted = i12;
        this.model = str;
        this.isFullSync = z6;
        this.isDeltaSync = !z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelSyncedEvent.class != obj.getClass()) {
            return false;
        }
        ModelSyncedEvent modelSyncedEvent = (ModelSyncedEvent) obj;
        if (Objects.equals(this.model, modelSyncedEvent.model) && Boolean.valueOf(this.isFullSync).equals(Boolean.valueOf(modelSyncedEvent.isFullSync)) && Boolean.valueOf(this.isDeltaSync).equals(Boolean.valueOf(modelSyncedEvent.isDeltaSync)) && Integer.valueOf(this.added).equals(Integer.valueOf(modelSyncedEvent.added)) && Integer.valueOf(this.updated).equals(Integer.valueOf(modelSyncedEvent.updated))) {
            return Integer.valueOf(this.deleted).equals(Integer.valueOf(modelSyncedEvent.deleted));
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
        return ((((((Boolean.valueOf(this.isDeltaSync).hashCode() + ((Boolean.valueOf(this.isFullSync).hashCode() + ((str != null ? str.hashCode() : 0) * 31)) * 31)) * 31) + this.added) * 31) + this.updated) * 31) + this.deleted;
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
        StringBuilder sb2 = new StringBuilder("ModelSyncedEvent{model=");
        sb2.append(this.model);
        sb2.append(", isFullSync=");
        sb2.append(this.isFullSync);
        sb2.append(", isDeltaSync=");
        sb2.append(this.isDeltaSync);
        sb2.append(", added=");
        sb2.append(this.added);
        sb2.append(", updated=");
        sb2.append(this.updated);
        sb2.append(", deleted=");
        return AbstractC1452a.m4563j(sb2, this.deleted, '}');
    }
}
