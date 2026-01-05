package com.amplifyframework.datastore.appsync;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.core.model.annotations.ModelField;
import com.amplifyframework.core.model.temporal.Temporal;
import java.util.Objects;
import p001o.s6c;

@ModelConfig
/* loaded from: classes5.dex */
public final class ModelMetadata implements Model {

    @ModelField(targetType = "Boolean")
    private final Boolean _deleted;

    @ModelField(targetType = "AWSTimestamp")
    private final Temporal.Timestamp _lastChangedAt;

    @ModelField(targetType = "Int")
    private final Integer _version;

    @ModelField(isRequired = true, targetType = "ID")
    private final String id;

    public ModelMetadata(String str, Boolean bool, Integer num, Temporal.Timestamp timestamp) {
        Objects.requireNonNull(str);
        this.id = str;
        this._deleted = bool;
        this._version = num;
        this._lastChangedAt = timestamp;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ModelMetadata.class != obj.getClass()) {
            return false;
        }
        ModelMetadata modelMetadata = (ModelMetadata) obj;
        if (s6c.m47909a(this.id, modelMetadata.id) && s6c.m47909a(this._deleted, modelMetadata._deleted) && s6c.m47909a(this._version, modelMetadata._version)) {
            return s6c.m47909a(this._lastChangedAt, modelMetadata._lastChangedAt);
        }
        return false;
    }

    public Temporal.Timestamp getLastChangedAt() {
        return this._lastChangedAt;
    }

    public String getTypename() {
        return this.id.split("\\|")[0];
    }

    public Integer getVersion() {
        return this._version;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Boolean bool = this._deleted;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this._version;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Temporal.Timestamp timestamp = this._lastChangedAt;
        return iHashCode3 + (timestamp != null ? timestamp.hashCode() : 0);
    }

    public Boolean isDeleted() {
        return this._deleted;
    }

    public String toString() {
        return "ModelMetadata{id='" + this.id + "', _deleted=" + this._deleted + ", _version=" + this._version + ", _lastChangedAt=" + this._lastChangedAt + '}';
    }

    @Override // com.amplifyframework.core.model.Model
    public String resolveIdentifier() {
        return this.id;
    }
}
