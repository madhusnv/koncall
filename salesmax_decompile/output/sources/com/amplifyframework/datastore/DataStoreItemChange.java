package com.amplifyframework.datastore;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.Model;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class DataStoreItemChange<T extends Model> {
    private final Initiator initiator;
    private final T item;
    private final Class<T> itemClass;

    /* renamed from: type, reason: collision with root package name */
    private final Type f58099type;
    private final UUID uuid;

    public static final class Builder<T extends Model> {
        private Initiator initiator;
        private T item;
        private Class<T> itemClass;

        /* renamed from: type, reason: collision with root package name */
        private Type f58100type;
        private UUID uuid;

        @SuppressLint({"SyntheticAccessor"})
        public DataStoreItemChange<T> build() {
            UUID uuidRandomUUID = this.uuid;
            if (uuidRandomUUID == null) {
                uuidRandomUUID = UUID.randomUUID();
            }
            UUID uuid = uuidRandomUUID;
            randomUuid();
            Objects.requireNonNull(uuid);
            Type type2 = this.f58100type;
            Objects.requireNonNull(type2);
            T t = this.item;
            Objects.requireNonNull(t);
            Class<T> cls = this.itemClass;
            Objects.requireNonNull(cls);
            Initiator initiator = this.initiator;
            Objects.requireNonNull(initiator);
            return new DataStoreItemChange<>(uuid, type2, t, cls, initiator);
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

        public Builder<T> itemClass(Class<T> cls) {
            Objects.requireNonNull(cls);
            this.itemClass = cls;
            return this;
        }

        public Builder<T> randomUuid() {
            this.uuid = null;
            return this;
        }

        public Builder<T> type(Type type2) {
            Objects.requireNonNull(type2);
            this.f58100type = type2;
            return this;
        }

        public Builder<T> uuid(String str) {
            Objects.requireNonNull(str);
            this.uuid = UUID.fromString(str);
            return this;
        }
    }

    public enum Initiator {
        LOCAL,
        REMOTE
    }

    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    public static <T extends Model> Builder<T> builder() {
        return new Builder<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DataStoreItemChange.class != obj.getClass()) {
            return false;
        }
        DataStoreItemChange dataStoreItemChange = (DataStoreItemChange) obj;
        return this.uuid.equals(dataStoreItemChange.uuid) && this.f58099type == dataStoreItemChange.f58099type && this.item.equals(dataStoreItemChange.item) && this.itemClass.equals(dataStoreItemChange.itemClass) && this.initiator == dataStoreItemChange.initiator;
    }

    public int hashCode() {
        return (((((((this.uuid.hashCode() * 31) + this.f58099type.hashCode()) * 31) + this.item.hashCode()) * 31) + this.itemClass.hashCode()) * 31) + this.initiator.hashCode();
    }

    public Initiator initiator() {
        return this.initiator;
    }

    public T item() {
        return this.item;
    }

    public Class<T> itemClass() {
        return this.itemClass;
    }

    public String toString() {
        return "DataStoreItemChange{uuid=" + this.uuid + ", type=" + this.f58099type + ", item=" + this.item + ", itemClass=" + this.itemClass + ", initiator=" + this.initiator + '}';
    }

    public Type type() {
        return this.f58099type;
    }

    public UUID uuid() {
        return this.uuid;
    }

    private DataStoreItemChange(UUID uuid, Type type2, T t, Class<T> cls, Initiator initiator) {
        this.uuid = uuid;
        this.f58099type = type2;
        this.item = t;
        this.itemClass = cls;
        this.initiator = initiator;
    }
}
