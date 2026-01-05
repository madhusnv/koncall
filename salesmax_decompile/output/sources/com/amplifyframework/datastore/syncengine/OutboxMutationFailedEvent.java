package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.MutationType;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.datastore.appsync.AppSyncExtensions;
import com.amplifyframework.hub.HubEvent;
import java.util.List;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class OutboxMutationFailedEvent<M extends Model> implements HubEvent.Data<OutboxMutationFailedEvent<M>> {
    private final MutationErrorType errorType;
    private final M model;
    private final String modelName;
    private final MutationType operation;

    public enum MutationErrorType {
        UNAUTHORIZED("Unauthorized"),
        UNKNOWN("Unknown");

        private final String value;

        MutationErrorType(String str) {
            this.value = str;
        }

        public static MutationErrorType enumerate(String str) {
            for (MutationErrorType mutationErrorType : values()) {
                if (mutationErrorType.getValue().equals(str)) {
                    return mutationErrorType;
                }
            }
            return UNKNOWN;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MutationErrorType fromGraphQlErrors(List<GraphQLResponse.Error> list) {
            try {
                return enumerate(new AppSyncExtensions(list.get(0).getExtensions()).getErrorType().getValue());
            } catch (IndexOutOfBoundsException | NullPointerException unused) {
                return UNKNOWN;
            }
        }

        public String getValue() {
            return this.value;
        }
    }

    private OutboxMutationFailedEvent(MutationErrorType mutationErrorType, MutationType mutationType, String str, M m) {
        this.errorType = mutationErrorType;
        this.operation = mutationType;
        this.modelName = str;
        this.model = m;
    }

    public static <M extends Model> OutboxMutationFailedEvent<M> create(PendingMutation<M> pendingMutation, List<GraphQLResponse.Error> list) {
        Objects.requireNonNull(pendingMutation);
        Objects.requireNonNull(list);
        return new OutboxMutationFailedEvent<>(MutationErrorType.fromGraphQlErrors(list), MutationType.valueOf(pendingMutation.getMutationType().name()), pendingMutation.getModelSchema().getName(), pendingMutation.getMutatedItem());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OutboxMutationFailedEvent.class != obj.getClass()) {
            return false;
        }
        OutboxMutationFailedEvent outboxMutationFailedEvent = (OutboxMutationFailedEvent) obj;
        return getErrorType() == outboxMutationFailedEvent.getErrorType() && getOperation() == outboxMutationFailedEvent.getOperation() && getModelName().equals(outboxMutationFailedEvent.getModelName()) && getModel().equals(outboxMutationFailedEvent.getModel());
    }

    public MutationErrorType getErrorType() {
        return this.errorType;
    }

    public M getModel() {
        return this.model;
    }

    public String getModelName() {
        return this.modelName;
    }

    public MutationType getOperation() {
        return this.operation;
    }

    public int hashCode() {
        return s6c.m47910b(getErrorType(), getOperation(), getModelName(), getModel());
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<OutboxMutationFailedEvent<M>> toHubEvent() {
        return HubEvent.create(DataStoreChannelEventName.OUTBOX_MUTATION_FAILED, this);
    }

    public String toString() {
        return "OutboxMutationFailedEvent{errorType=" + this.errorType + ", operation=" + this.operation + ", modelName=" + this.modelName + ", model=" + this.model + '}';
    }
}
