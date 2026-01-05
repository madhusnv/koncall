package com.amplifyframework.datastore.events;

import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.hub.HubEvent;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
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
        return "NonApplicableDataReceivedEvent{errors=" + this.errors + ", model='" + this.model + "'}";
    }
}
