package com.amplifyframework.datastore.syncengine;

import com.amplifyframework.annotations.InternalApiWarning;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.query.predicate.QueryPredicate;
import java.util.Objects;
import java.util.UUID;
import p001o.s6c;

@ModelConfig(type = Model.Type.SYSTEM)
/* loaded from: classes5.dex */
public final class LastSyncMetadata implements Model {

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    @ModelField(isRequired = true, targetType = "AWSTimestamp")
    private final Long lastSyncTime;

    @ModelField(isRequired = true, targetType = "String")
    private final String lastSyncType;

    @ModelField(isRequired = true, targetType = "String")
    private final String modelClassName;

    @ModelField(targetType = "String")
    private final QueryPredicate syncExpression;

    private LastSyncMetadata(String str, String str2, Long l, SyncType syncType, QueryPredicate queryPredicate) {
        this.id = str;
        this.modelClassName = str2;
        this.lastSyncTime = l;
        this.lastSyncType = syncType.name();
        this.syncExpression = queryPredicate;
    }

    @InternalApiWarning
    @Deprecated
    public static <T extends Model> LastSyncMetadata baseSyncedAt(String str, long j) {
        Objects.requireNonNull(str);
        return create(str, Long.valueOf(j), SyncType.BASE);
    }

    @Deprecated
    public static <T extends Model> LastSyncMetadata create(String str, Long l, SyncType syncType) {
        Objects.requireNonNull(str);
        return new LastSyncMetadata(hash(str), str, l, syncType, null);
    }

    @Deprecated
    public static <T extends Model> LastSyncMetadata deltaSyncedAt(String str, long j) {
        Objects.requireNonNull(str);
        return create(str, Long.valueOf(j), SyncType.DELTA);
    }

    private static String hash(String str) {
        return UUID.nameUUIDFromBytes(str.getBytes()).toString();
    }

    public static <T extends Model> LastSyncMetadata neverSynced(String str) {
        Objects.requireNonNull(str);
        return create(str, null, SyncType.BASE, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LastSyncMetadata.class != obj.getClass()) {
            return false;
        }
        LastSyncMetadata lastSyncMetadata = (LastSyncMetadata) obj;
        if (s6c.m47909a(this.id, lastSyncMetadata.id) && s6c.m47909a(this.modelClassName, lastSyncMetadata.modelClassName) && s6c.m47909a(this.lastSyncType, lastSyncMetadata.lastSyncType) && s6c.m47909a(this.syncExpression, lastSyncMetadata.syncExpression)) {
            return s6c.m47909a(this.lastSyncTime, lastSyncMetadata.lastSyncTime);
        }
        return false;
    }

    public String getId() {
        return this.id;
    }

    public Long getLastSyncTime() {
        return this.lastSyncTime;
    }

    public String getLastSyncType() {
        return this.lastSyncType;
    }

    public String getModelClassName() {
        return this.modelClassName;
    }

    public QueryPredicate getSyncExpression() {
        return this.syncExpression;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.modelClassName.hashCode()) * 31) + this.lastSyncTime.hashCode()) * 31) + this.lastSyncType.hashCode()) * 31) + this.syncExpression.hashCode();
    }

    public String toString() {
        return "LastSyncMetadata{id='" + this.id + "', modelClassName='" + this.modelClassName + "', lastSyncTime=" + this.lastSyncTime + ", lastSyncType=" + this.lastSyncType + ", syncExpression=" + this.syncExpression + '}';
    }

    @Override // com.amplifyframework.core.model.Model
    public String resolveIdentifier() {
        return this.id;
    }

    @InternalApiWarning
    public static <T extends Model> LastSyncMetadata baseSyncedAt(String str, long j, QueryPredicate queryPredicate) {
        Objects.requireNonNull(str);
        return create(str, Long.valueOf(j), SyncType.BASE, queryPredicate);
    }

    public static <T extends Model> LastSyncMetadata create(String str, Long l, SyncType syncType, QueryPredicate queryPredicate) {
        Objects.requireNonNull(str);
        return new LastSyncMetadata(hash(str), str, l, syncType, queryPredicate);
    }

    public static <T extends Model> LastSyncMetadata deltaSyncedAt(String str, long j, QueryPredicate queryPredicate) {
        Objects.requireNonNull(str);
        return create(str, Long.valueOf(j), SyncType.DELTA, queryPredicate);
    }
}
