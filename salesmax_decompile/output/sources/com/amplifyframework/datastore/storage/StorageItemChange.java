package com.amplifyframework.datastore.storage;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class StorageItemChange<T extends Model> {
    private final UUID changeId;
    private final Initiator initiator;
    private final T item;
    private final ModelSchema modelSchema;
    private final SerializedModel patchItem;
    private final QueryPredicate predicate;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58108type;

    public static final class Builder<T extends Model> {
        private UUID changeId;
        private Initiator initiator;
        private T item;
        private ModelSchema modelSchema;
        private SerializedModel patchItem;
        private QueryPredicate predicate;

        /* renamed from: type, reason: collision with root package name */
        private Type f58109type;

        public StorageItemChange<T> build() {
            UUID uuidRandomUUID = this.changeId;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
            }
            UUID uuid = uuidRandomUUID;
            randomChangeId();
            Objects.requireNonNull(uuid);
            Initiator initiator = this.initiator;
            Objects.requireNonNull(initiator);
            Type type2 = this.f58109type;
            Objects.requireNonNull(type2);
            QueryPredicate queryPredicate = this.predicate;
            Objects.requireNonNull(queryPredicate);
            QueryPredicate queryPredicate2 = queryPredicate;
            T t = this.item;
            Objects.requireNonNull(t);
            SerializedModel serializedModel = this.patchItem;
            Objects.requireNonNull(serializedModel);
            ModelSchema modelSchema = this.modelSchema;
            Objects.requireNonNull(modelSchema);
            return new StorageItemChange<>(uuid, initiator, type2, queryPredicate2, t, serializedModel, modelSchema);
        }

        public Builder<T> changeId(String str) {
            Objects.requireNonNull(str);
            this.changeId = UUID.fromString(str);
            return this;
        }

        public Builder<T> initiator(Initiator initiator) {
            Objects.requireNonNull(initiator);
            this.initiator = initiator;
            return this;
        }

        public Builder<T> item(T t) {
            Objects.requireNonNull(t);
            this.item = t;
            return this;
        }

        public Builder<T> modelSchema(ModelSchema modelSchema) {
            Objects.requireNonNull(modelSchema);
            this.modelSchema = modelSchema;
            return this;
        }

        public Builder<T> patchItem(SerializedModel serializedModel) {
            Objects.requireNonNull(serializedModel);
            this.patchItem = serializedModel;
            return this;
        }

        public Builder<T> predicate(QueryPredicate queryPredicate) {
            Objects.requireNonNull(queryPredicate);
            this.predicate = queryPredicate;
            return this;
        }

        public Builder<T> randomChangeId() {
            this.changeId = null;
            return this;
        }

        public Builder<T> type(Type type2) {
            Objects.requireNonNull(type2);
            this.f58109type = type2;
            return this;
        }
    }

    public enum Initiator {
        SYNC_ENGINE,
        DATA_STORE_API
    }

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    public static <T extends Model> Builder<T> builder() {
        return new Builder<>();
    }

    public UUID changeId() {
        return this.changeId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StorageItemChange.class != obj.getClass()) {
            return false;
        }
        StorageItemChange storageItemChange = (StorageItemChange) obj;
        if (this.changeId.equals(storageItemChange.changeId) && this.initiator == storageItemChange.initiator && this.f58108type == storageItemChange.f58108type && this.predicate.equals(storageItemChange.predicate) && this.item.equals(storageItemChange.item)) {
            return this.modelSchema.equals(storageItemChange.modelSchema);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((this.changeId.hashCode() * 31) + this.initiator.hashCode()) * 31) + this.f58108type.hashCode()) * 31) + this.predicate.hashCode()) * 31) + this.item.hashCode()) * 31) + this.modelSchema.hashCode();
    }

    public Initiator initiator() {
        return this.initiator;
    }

    public T item() {
        return this.item;
    }

    public ModelSchema modelSchema() {
        return this.modelSchema;
    }

    public SerializedModel patchItem() {
        return this.patchItem;
    }

    public QueryPredicate predicate() {
        return this.predicate;
    }

    public String toString() {
        return "StorageItemChange{changeId=" + this.changeId + ", initiator=" + this.initiator + ", type=" + this.f58108type + ", predicate=" + this.predicate + ", item=" + this.item + ", modelSchema=" + this.modelSchema + '}';
    }

    public Type type() {
        return this.f58108type;
    }

    private StorageItemChange(UUID uuid, Initiator initiator, Type type2, QueryPredicate queryPredicate, T t, SerializedModel serializedModel, ModelSchema modelSchema) {
        this.changeId = uuid;
        this.initiator = initiator;
        this.f58108type = type2;
        this.predicate = queryPredicate;
        this.item = t;
        this.patchItem = serializedModel;
        this.modelSchema = modelSchema;
    }
}
