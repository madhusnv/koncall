package com.amplifyframework.core.model;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import p001o.s6c;

/* loaded from: classes5.dex */
public final class CustomTypeSchema {
    private final Map<String, CustomTypeField> fields;
    private final String name;
    private final String pluralName;

    public static final class Builder {
        private final Map<String, CustomTypeField> fields = new TreeMap();
        private String name;
        private String pluralName;

        @SuppressLint({"SyntheticAccessor"})
        public CustomTypeSchema build() {
            Objects.requireNonNull(this.name);
            return new CustomTypeSchema(this);
        }

        public Builder fields(Map<String, CustomTypeField> map) {
            Objects.requireNonNull(map);
            this.fields.clear();
            this.fields.putAll(map);
            return this;
        }

        public Builder name(String str) {
            Objects.requireNonNull(str);
            this.name = str;
            return this;
        }

        public Builder pluralName(String str) {
            this.pluralName = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CustomTypeSchema.class != obj.getClass()) {
            return false;
        }
        CustomTypeSchema customTypeSchema = (CustomTypeSchema) obj;
        return s6c.m47909a(getName(), customTypeSchema.getName()) && s6c.m47909a(getPluralName(), customTypeSchema.getPluralName()) && s6c.m47909a(getFields(), customTypeSchema.getFields());
    }

    public Map<String, CustomTypeField> getFields() {
        return this.fields;
    }

    public String getName() {
        return this.name;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public int hashCode() {
        return s6c.m47910b(getName(), getPluralName(), getFields());
    }

    public String toString() {
        return "CustomTypeSchema{name='" + this.name + "', pluralName='" + this.pluralName + "', fields=" + this.fields + '}';
    }

    private CustomTypeSchema(Builder builder) {
        this.name = builder.name;
        this.pluralName = builder.pluralName;
        this.fields = builder.fields;
    }
}
