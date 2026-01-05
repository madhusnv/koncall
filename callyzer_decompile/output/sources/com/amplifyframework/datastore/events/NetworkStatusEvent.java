package com.amplifyframework.datastore.events;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.events.ApiEndpointStatusChangeEvent;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.amplifyframework.logging.Logger;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class NetworkStatusEvent implements HubEvent.Data<NetworkStatusEvent> {
    private static final Logger LOG = Amplify.Logging.logger(CategoryType.DATASTORE, "amplify:aws-datastore");
    private final boolean active;

    public NetworkStatusEvent(boolean z6) {
        this.active = z6;
    }

    public static NetworkStatusEvent from(HubEvent<?> hubEvent) throws AmplifyException {
        if (hubEvent.getData() instanceof NetworkStatusEvent) {
            return (NetworkStatusEvent) hubEvent.getData();
        }
        String name = NetworkStatusEvent.class.getName();
        throw new AmplifyException("Unable to cast event data from ".concat(name), "Ensure that the event payload is of type ".concat(name));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NetworkStatusEvent.class != obj.getClass()) {
            return false;
        }
        return Boolean.valueOf(this.active).equals(Boolean.valueOf(((NetworkStatusEvent) obj).active));
    }

    public boolean getActive() {
        return this.active;
    }

    public int hashCode() {
        return Boolean.valueOf(this.active).hashCode();
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<NetworkStatusEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.NETWORK_STATUS, this);
    }

    public String toString() {
        return AbstractC5601a.m11242m(new StringBuilder("NetworkStatus{active="), this.active, "}");
    }

    public static NetworkStatusEvent from(ApiEndpointStatusChangeEvent apiEndpointStatusChangeEvent) {
        return new NetworkStatusEvent(ApiEndpointStatusChangeEvent.ApiEndpointStatus.REACHABLE.equals(apiEndpointStatusChangeEvent.getCurrentStatus()));
    }
}
