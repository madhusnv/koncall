package com.amplifyframework.datastore.events;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class OutboxStatusEvent implements HubEvent.Data<OutboxStatusEvent> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final boolean isEmpty;

    public OutboxStatusEvent(boolean z6) {
        this.isEmpty = z6;
    }

    public static OutboxStatusEvent from(HubEvent<?> hubEvent) throws AmplifyException {
        if (hubEvent.getData() instanceof OutboxStatusEvent) {
            return (OutboxStatusEvent) hubEvent.getData();
        }
        String name = OutboxStatusEvent.class.getName();
        throw new AmplifyException("Unable to cast event data from ".concat(name), "Ensure that the event payload is of type ".concat(name));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OutboxStatusEvent.class != obj.getClass()) {
            return false;
        }
        return Boolean.valueOf(this.isEmpty).equals(Boolean.valueOf(((OutboxStatusEvent) obj).isEmpty));
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
        return AbstractC5601a.m11242m(new StringBuilder("OutboxStatus{isEmpty="), this.isEmpty, "}");
    }
}
