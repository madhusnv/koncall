package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.annotations.Index;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import com.amplifyframework.core.model.query.predicate.QueryPredicates;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.util.Objects;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class PendingMutation<T extends Model> implements Comparable<PendingMutation<? extends Model>> {
    private final ModelSchema modelSchema;
    private final T mutatedItem;
    private final TimeBasedUuid mutationId;
    private final Type mutationType;
    private final QueryPredicate predicate;

    public interface Converter {
        <T extends Model> PendingMutation<T> fromRecord(PersistentRecord persistentRecord);

        <T extends Model> PersistentRecord toRecord(PendingMutation<T> pendingMutation);
    }

    @Index(fields = {"containedModelClassName"}, name = "containedModelClassNameBasedIndex")
    @ModelConfig(pluralName = "PersistentRecords", type = Model.Type.SYSTEM)
    public static final class PersistentRecord implements Model, Comparable<PersistentRecord> {

        @ModelField(isRequired = true, targetType = "String")
        private final String containedModelClassName;

        @ModelField(isRequired = true, targetType = "String")
        private final String containedModelId;

        @ModelField(isRequired = true, targetType = "ID")
        private final String id;

        @ModelField(isRequired = true, targetType = "String")
        private final String serializedMutationData;
        static final QueryField ID = QueryField.field("PersistentRecord", OutcomeConstants.OUTCOME_ID);
        static final QueryField CONTAINED_MODEL_ID = QueryField.field("PersistentRecord", "containedModelId");

        public static final class Builder<T extends Model> {
            private String containedModelClassName;
            private String containedModelId;
            private TimeBasedUuid mutationId;
            private String serializedMutationData;

            public PersistentRecord build() {
                TimeBasedUuid timeBasedUuid = this.mutationId;
                Objects.requireNonNull(timeBasedUuid);
                String string = timeBasedUuid.toString();
                String str = this.containedModelId;
                Objects.requireNonNull(str);
                String str2 = this.serializedMutationData;
                Objects.requireNonNull(str2);
                String str3 = this.containedModelClassName;
                Objects.requireNonNull(str3);
                return new PersistentRecord(string, str, str2, str3);
            }

            public Builder<T> containedModelClassName(String str) {
                Objects.requireNonNull(str);
                this.containedModelClassName = str;
                return this;
            }

            public Builder<T> containedModelId(String str) {
                Objects.requireNonNull(str);
                this.containedModelId = str;
                return this;
            }

            public Builder<T> mutationId(TimeBasedUuid timeBasedUuid) {
                Objects.requireNonNull(timeBasedUuid);
                this.mutationId = timeBasedUuid;
                return this;
            }

            public Builder<T> serializedMutationData(String str) {
                Objects.requireNonNull(str);
                this.serializedMutationData = str;
                return this;
            }
        }

        public static <T extends Model> Builder<T> builder() {
            return new Builder<>();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || PersistentRecord.class != obj.getClass()) {
                return false;
            }
            PersistentRecord persistentRecord = (PersistentRecord) obj;
            return s6c.m47909a(this.id, persistentRecord.id) && s6c.m47909a(this.containedModelId, persistentRecord.containedModelId) && s6c.m47909a(this.serializedMutationData, persistentRecord.serializedMutationData) && s6c.m47909a(this.containedModelClassName, persistentRecord.containedModelClassName);
        }

        public String getContainedModelClassName() {
            return this.containedModelClassName;
        }

        public String getContainedModelId() {
            return this.containedModelId;
        }

        public String getSerializedMutationData() {
            return this.serializedMutationData;
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + this.containedModelId.hashCode()) * 31) + this.serializedMutationData.hashCode()) * 31) + this.containedModelClassName.hashCode();
        }

        public String toString() {
            return "Record{id='" + this.id + "', containedModelId='" + this.containedModelId + "', serializedMutationData='" + this.serializedMutationData + "', containedModelClassName='" + this.containedModelClassName + "'}";
        }

        private PersistentRecord(String str, String str2, String str3, String str4) {
            this.id = str;
            this.containedModelId = str2;
            this.serializedMutationData = str3;
            this.containedModelClassName = str4;
        }

        @Override // java.lang.Comparable
        public int compareTo(PersistentRecord persistentRecord) {
            return TimeBasedUuid.fromString(resolveIdentifier()).compareTo(TimeBasedUuid.fromString(persistentRecord.resolveIdentifier()));
        }

        @Override // com.amplifyframework.core.model.Model
        public String resolveIdentifier() {
            return this.id;
        }
    }

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    private PendingMutation(TimeBasedUuid timeBasedUuid, T t, ModelSchema modelSchema, Type type2, QueryPredicate queryPredicate) {
        this.mutationId = timeBasedUuid;
        this.mutatedItem = t;
        this.modelSchema = modelSchema;
        this.mutationType = type2;
        this.predicate = queryPredicate;
    }

    public static <T extends Model> PendingMutation<T> creation(T t, ModelSchema modelSchema) {
        return instance(t, modelSchema, Type.CREATE, QueryPredicates.all());
    }

    public static <T extends Model> PendingMutation<T> deletion(T t, ModelSchema modelSchema) {
        return instance(t, modelSchema, Type.DELETE, QueryPredicates.all());
    }

    public static <T extends Model> PendingMutation<T> instance(TimeBasedUuid timeBasedUuid, T t, ModelSchema modelSchema, Type type2, QueryPredicate queryPredicate) {
        Objects.requireNonNull(timeBasedUuid);
        Objects.requireNonNull(t);
        Objects.requireNonNull(modelSchema);
        Objects.requireNonNull(type2);
        Objects.requireNonNull(queryPredicate);
        return new PendingMutation<>(timeBasedUuid, t, modelSchema, type2, queryPredicate);
    }

    public static <T extends Model> PendingMutation<T> update(T t, ModelSchema modelSchema) {
        return instance(t, modelSchema, Type.UPDATE, QueryPredicates.all());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PendingMutation.class != obj.getClass()) {
            return false;
        }
        PendingMutation pendingMutation = (PendingMutation) obj;
        return s6c.m47909a(this.mutationId, pendingMutation.mutationId) && s6c.m47909a(this.mutatedItem, pendingMutation.mutatedItem) && s6c.m47909a(this.modelSchema, pendingMutation.modelSchema) && s6c.m47909a(this.mutationType, pendingMutation.mutationType) && s6c.m47909a(this.predicate, pendingMutation.predicate);
    }

    public ModelSchema getModelSchema() {
        return this.modelSchema;
    }

    public T getMutatedItem() {
        return this.mutatedItem;
    }

    public TimeBasedUuid getMutationId() {
        return this.mutationId;
    }

    public Type getMutationType() {
        return this.mutationType;
    }

    public QueryPredicate getPredicate() {
        return this.predicate;
    }

    public int hashCode() {
        return (((((((this.mutationId.hashCode() * 31) + this.mutatedItem.hashCode()) * 31) + this.modelSchema.hashCode()) * 31) + this.mutationType.hashCode()) * 31) + this.predicate.hashCode();
    }

    public String toString() {
        return "PendingMutation{mutatedItem=" + this.mutatedItem + ", mutationType=" + this.mutationType + ", mutationId=" + this.mutationId + ", predicate=" + this.predicate + '}';
    }

    public static <T extends Model> PendingMutation<T> deletion(T t, ModelSchema modelSchema, QueryPredicate queryPredicate) {
        return instance(t, modelSchema, Type.DELETE, queryPredicate);
    }

    public static <T extends Model> PendingMutation<T> update(T t, ModelSchema modelSchema, QueryPredicate queryPredicate) {
        return instance(t, modelSchema, Type.UPDATE, queryPredicate);
    }

    @Override // java.lang.Comparable
    public int compareTo(PendingMutation<? extends Model> pendingMutation) {
        Objects.requireNonNull(pendingMutation);
        return this.mutationId.compareTo(pendingMutation.getMutationId());
    }

    public static <T extends Model> PendingMutation<T> instance(T t, ModelSchema modelSchema, Type type2, QueryPredicate queryPredicate) {
        return instance(TimeBasedUuid.create(), t, modelSchema, type2, queryPredicate);
    }
}
