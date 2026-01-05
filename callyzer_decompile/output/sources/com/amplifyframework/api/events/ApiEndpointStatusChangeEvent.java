package com.amplifyframework.api.events;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.hub.HubEvent;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class ApiEndpointStatusChangeEvent implements HubEvent.Data<ApiEndpointStatusChangeEvent> {
    private final ApiEndpointStatus currentStatus;
    private final ApiEndpointStatus previousStatus;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum ApiEndpointStatus {
        UNKOWN,
        REACHABLE,
        NOT_REACHABLE;

        public ApiEndpointStatusChangeEvent transitionTo(ApiEndpointStatus apiEndpointStatus) {
            return new ApiEndpointStatusChangeEvent(apiEndpointStatus, this);
        }
    }

    public ApiEndpointStatusChangeEvent(ApiEndpointStatus apiEndpointStatus, ApiEndpointStatus apiEndpointStatus2) {
        this.currentStatus = apiEndpointStatus;
        this.previousStatus = apiEndpointStatus2;
    }

    public static ApiEndpointStatusChangeEvent from(HubEvent<?> hubEvent) throws AmplifyException {
        if (hubEvent.getData() instanceof ApiEndpointStatusChangeEvent) {
            return (ApiEndpointStatusChangeEvent) hubEvent.getData();
        }
        throw new AmplifyException("Unable to cast event data from ApiEndpointStatusChangeEvent", "Ensure that the event payload is of type ApiEndpointStatusChangeEvent");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApiEndpointStatusChangeEvent.class != obj.getClass()) {
            return false;
        }
        ApiEndpointStatusChangeEvent apiEndpointStatusChangeEvent = (ApiEndpointStatusChangeEvent) obj;
        if (Objects.equals(this.currentStatus, apiEndpointStatusChangeEvent.currentStatus)) {
            return Objects.equals(this.previousStatus, apiEndpointStatusChangeEvent.previousStatus);
        }
        return false;
    }

    public ApiEndpointStatus getCurrentStatus() {
        return this.currentStatus;
    }

    public ApiEndpointStatus getPreviousStatus() {
        return this.previousStatus;
    }

    public int hashCode() {
        ApiEndpointStatus apiEndpointStatus = this.currentStatus;
        int iHashCode = (apiEndpointStatus != null ? apiEndpointStatus.hashCode() : 0) * 31;
        ApiEndpointStatus apiEndpointStatus2 = this.previousStatus;
        return iHashCode + (apiEndpointStatus2 != null ? apiEndpointStatus2.hashCode() : 0);
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<ApiEndpointStatusChangeEvent> toHubEvent() {
        return HubEvent.create(ApiChannelEventName.API_ENDPOINT_STATUS_CHANGED, this);
    }

    public String toString() {
        return "ApiEndpointStatusChangeEvent{currentStatus=" + this.currentStatus + ", previousStatus=" + this.previousStatus + "}";
    }
}
