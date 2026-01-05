package com.amplifyframework.datastore.events;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class OutboxStatusEvent implements HubEvent.Data<OutboxStatusEvent> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final boolean isEmpty;

    public OutboxStatusEvent(boolean z) {
        this.isEmpty = z;
    }

    public static OutboxStatusEvent from(HubEvent<?> hubEvent) throws AmplifyException {
        if (hubEvent.getData() instanceof OutboxStatusEvent) {
            return (OutboxStatusEvent) hubEvent.getData();
        }
        String name = OutboxStatusEvent.class.getName();
        throw new AmplifyException("Unable to cast event data from " + name, "Ensure that the event payload is of type " + name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OutboxStatusEvent.class != obj.getClass()) {
            return false;
        }
        return s6c.m47909a(Boolean.valueOf(this.isEmpty), Boolean.valueOf(((OutboxStatusEvent) obj).isEmpty));
    }

    public int hashCode() {
        return Boolean.valueOf(this.isEmpty).hashCode();
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<OutboxStatusEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.OUTBOX_STATUS, this);
    }

    public String toString() {
        return "OutboxStatus{isEmpty=" + this.isEmpty + "}";
    }
}
