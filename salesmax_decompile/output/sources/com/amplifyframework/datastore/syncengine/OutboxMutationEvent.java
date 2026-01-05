package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.datastore.DataStoreChannelEventName;
import com.amplifyframework.datastore.appsync.ModelMetadata;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.hub.HubEvent;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class OutboxMutationEvent<M extends Model> implements HubEvent.Data<OutboxMutationEvent<M>> {
    private final OutboxMutationEventElement<M> element;
    private final String modelName;

    public static final class OutboxMutationEventElement<M extends Model> {
        private final Boolean deleted;
        private final Long lastChangedAt;
        private final M model;
        private final Integer version;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || OutboxMutationEventElement.class != obj.getClass()) {
                return false;
            }
            OutboxMutationEventElement outboxMutationEventElement = (OutboxMutationEventElement) obj;
            return getModel().equals(outboxMutationEventElement.getModel()) && s6c.m47909a(getVersion(), outboxMutationEventElement.getVersion()) && s6c.m47909a(getLastChangedAt(), outboxMutationEventElement.getLastChangedAt()) && s6c.m47909a(isDeleted(), outboxMutationEventElement.isDeleted());
        }

        public Long getLastChangedAt() {
            return this.lastChangedAt;
        }

        public M getModel() {
            return this.model;
        }

        public Integer getVersion() {
            return this.version;
        }

        public int hashCode() {
            return s6c.m47910b(getModel(), getVersion(), getLastChangedAt(), isDeleted());
        }

        public Boolean isDeleted() {
            return this.deleted;
        }

        public String toString() {
            return "OutboxMutationEventElement{model=" + this.model + ", version=" + this.version + ", lastChangedAt=" + this.lastChangedAt + ", deleted=" + this.deleted + '}';
        }

        private OutboxMutationEventElement(M m, Integer num, Long l, Boolean bool) {
            this.model = m;
            this.version = num;
            this.lastChangedAt = l;
            this.deleted = bool;
        }
    }

    private OutboxMutationEvent(String str, OutboxMutationEventElement<M> outboxMutationEventElement) {
        this.modelName = str;
        this.element = outboxMutationEventElement;
    }

    public static <M extends Model> OutboxMutationEvent<M> create(String str, ModelWithMetadata<M> modelWithMetadata) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(modelWithMetadata);
        Model model = modelWithMetadata.getModel();
        ModelMetadata syncMetadata = modelWithMetadata.getSyncMetadata();
        return new OutboxMutationEvent<>(str, new OutboxMutationEventElement(model, syncMetadata.getVersion(), syncMetadata.getLastChangedAt() != null ? Long.valueOf(syncMetadata.getLastChangedAt().getSecondsSinceEpoch()) : null, syncMetadata.isDeleted()));
    }

    public static <M extends Model> OutboxMutationEvent<M> fromPendingMutation(PendingMutation<M> pendingMutation) {
        Objects.requireNonNull(pendingMutation);
        return new OutboxMutationEvent<>(pendingMutation.getModelSchema().getName(), new OutboxMutationEventElement(pendingMutation.getMutatedItem(), null, null, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OutboxMutationEvent.class != obj.getClass()) {
            return false;
        }
        OutboxMutationEvent outboxMutationEvent = (OutboxMutationEvent) obj;
        return s6c.m47909a(this.modelName, outboxMutationEvent.modelName) && s6c.m47909a(this.element, outboxMutationEvent.element);
    }

    public OutboxMutationEventElement<M> getElement() {
        return this.element;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int hashCode() {
        return (this.modelName.hashCode() * 31) + this.element.hashCode();
    }

    @Override // com.amplifyframework.hub.HubEvent.Data
    public HubEvent<OutboxMutationEvent<M>> toHubEvent() {
        return getElement().getVersion() == null ? HubEvent.create(DataStoreChannelEventName.OUTBOX_MUTATION_ENQUEUED, this) : HubEvent.create(DataStoreChannelEventName.OUTBOX_MUTATION_PROCESSED, this);
    }

    public String toString() {
        return "OutboxMutationEvent{modelName='" + this.modelName + "', element='" + this.element + "'}";
    }
}
