package com.amplifyframework.datastore.syncengine;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import java.util.Objects;

/* loaded from: classes5.dex */
final class SubscriptionEvent<T extends Model> {
    private final ModelSchema modelSchema;
    private final ModelWithMetadata<T> modelWithMetadata;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58112type;

    public static final class Builder<T extends Model> {
        private ModelSchema modelSchema;
        private ModelWithMetadata<T> modelWithMetadata;

        /* renamed from: type, reason: collision with root package name */
        private Type f58113type;

        @SuppressLint({"SyntheticAccessor"})
        public SubscriptionEvent<T> build() {
            return new SubscriptionEvent<>(this.modelWithMetadata, this.modelSchema, this.f58113type);
        }

        public Builder<T> modelSchema(ModelSchema modelSchema) {
            Objects.requireNonNull(modelSchema);
            this.modelSchema = modelSchema;
            return this;
        }

        public Builder<T> modelWithMetadata(ModelWithMetadata<T> modelWithMetadata) {
            Objects.requireNonNull(modelWithMetadata);
            this.modelWithMetadata = modelWithMetadata;
            return this;
        }

        public Builder<T> type(Type type2) {
            Objects.requireNonNull(type2);
            this.f58113type = type2;
            return this;
        }
    }

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    public static <T extends Model> Builder<T> builder() {
        return new Builder<>();
    }

    public ModelSchema modelSchema() {
        return this.modelSchema;
    }

    public ModelWithMetadata<T> modelWithMetadata() {
        return this.modelWithMetadata;
    }

    public Type type() {
        return this.f58112type;
    }

    private SubscriptionEvent(ModelWithMetadata<T> modelWithMetadata, ModelSchema modelSchema, Type type2) {
        this.modelWithMetadata = modelWithMetadata;
        this.modelSchema = modelSchema;
        this.f58112type = type2;
    }
}
