package com.amplifyframework.datastore.events;

import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import com.sun.mail.util.AbstractC1452a;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class NonApplicableDataReceivedEvent implements HubEvent.Data<NonApplicableDataReceivedEvent> {
    private final List<GraphQLResponse.Error> errors;
    private final String model;

    public NonApplicableDataReceivedEvent(List<GraphQLResponse.Error> list, String str) {
        this.errors = list;
        this.model = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || NonApplicableDataReceivedEvent.class != obj.getClass()) {
            return false;
        }
        NonApplicableDataReceivedEvent nonApplicableDataReceivedEvent = (NonApplicableDataReceivedEvent) obj;
        if (Objects.equals(this.errors, nonApplicableDataReceivedEvent.errors)) {
            return Objects.equals(this.model, nonApplicableDataReceivedEvent.model);
        }
        return false;
    }

    public List<GraphQLResponse.Error> getErrors() {
        return this.errors;
    }

    public String getModel() {
        return this.model;
    }

    public int hashCode() {
        List<GraphQLResponse.Error> list = this.errors;
        int iHashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.model;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<NonApplicableDataReceivedEvent> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.NON_APPLICABLE_DATA_RECEIVED, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NonApplicableDataReceivedEvent{errors=");
        sb2.append(this.errors);
        sb2.append(", model='");
        return AbstractC1452a.m4564k(sb2, this.model, "'}");
    }
}
