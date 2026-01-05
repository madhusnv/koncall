package com.amplifyframework.datastore;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.Model;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class DataStoreItemChange<T extends Model> {
    private final Initiator initiator;
    private final T item;
    private final Class<T> itemClass;
    private final Type type;
    private final UUID uuid;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder<T extends Model> {
        private Initiator initiator;
        private T item;
        private Class<T> itemClass;
        private Type type;
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
            Type type = this.type;
            Objects.requireNonNull(type);
            T t7 = this.item;
            Objects.requireNonNull(t7);
            Class<T> cls = this.itemClass;
            Objects.requireNonNull(cls);
            Initiator initiator = this.initiator;
            Objects.requireNonNull(initiator);
            return new DataStoreItemChange<>(uuid, type, t7, cls, initiator, 0);
        }

        public Builder<T> initiator(Initiator initiator) {
            Objects.requireNonNull(initiator);
            this.initiator = initiator;
            return this;
        }

        public Builder<T> item(T t7) {
            Objects.requireNonNull(t7);
            this.item = t7;
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

        public Builder<T> type(Type type) {
            Objects.requireNonNull(type);
            this.type = type;
            return this;
        }

        public Builder<T> uuid(String str) {
            Objects.requireNonNull(str);
            this.uuid = UUID.fromString(str);
            return this;
        }
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Initiator {
        LOCAL,
        REMOTE
    }

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public enum Type {
        CREATE,
        UPDATE,
        DELETE
    }

    public /* synthetic */ DataStoreItemChange(UUID uuid, Type type, Model model, Class cls, Initiator initiator, int i10) {
        this(uuid, type, model, cls, initiator);
    }

    public static <T extends Model> Builder<T> builder() {
        return new Builder<>();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DataStoreItemChange.class == obj.getClass()) {
            DataStoreItemChange dataStoreItemChange = (DataStoreItemChange) obj;
            if (this.uuid.equals(dataStoreItemChange.uuid) && this.type == dataStoreItemChange.type && this.item.equals(dataStoreItemChange.item) && this.itemClass.equals(dataStoreItemChange.itemClass) && this.initiator == dataStoreItemChange.initiator) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.initiator.hashCode() + ((this.itemClass.hashCode() + ((this.item.hashCode() + ((this.type.hashCode() + (this.uuid.hashCode() * 31)) * 31)) * 31)) * 31);
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
        return "DataStoreItemChange{uuid=" + this.uuid + ", type=" + this.type + ", item=" + this.item + ", itemClass=" + this.itemClass + ", initiator=" + this.initiator + '}';
    }

    public Type type() {
        return this.type;
    }

    public UUID uuid() {
        return this.uuid;
    }

    private DataStoreItemChange(UUID uuid, Type type, T t7, Class<T> cls, Initiator initiator) {
        this.uuid = uuid;
        this.type = type;
        this.item = t7;
        this.itemClass = cls;
        this.initiator = initiator;
    }
}
