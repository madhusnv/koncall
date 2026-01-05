package com.amplifyframework.core.model;

import android.annotation.SuppressLint;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class CustomTypeSchema {
    private final Map<String, CustomTypeField> fields;
    private final String name;
    private final String pluralName;

    /* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
    public static final class Builder {
        private final Map<String, CustomTypeField> fields = new TreeMap();
        private String name;
        private String pluralName;

        @SuppressLint({"SyntheticAccessor"})
        public CustomTypeSchema build() {
            Objects.requireNonNull(this.name);
            return new CustomTypeSchema(this, 0);
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

    public /* synthetic */ CustomTypeSchema(Builder builder, int i10) {
        this(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CustomTypeSchema.class == obj.getClass()) {
            CustomTypeSchema customTypeSchema = (CustomTypeSchema) obj;
            if (Objects.equals(getName(), customTypeSchema.getName()) && Objects.equals(getPluralName(), customTypeSchema.getPluralName()) && Objects.equals(getFields(), customTypeSchema.getFields())) {
                return true;
            }
        }
        return false;
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
        return Objects.hash(getName(), getPluralName(), getFields());
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
