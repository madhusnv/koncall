package com.amplifyframework.datastore.model;

import android.annotation.SuppressLint;
import com.amplifyframework.core.model.CustomTypeSchema;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelProvider;
import com.amplifyframework.core.model.ModelSchema;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class SimpleModelProvider implements ModelProvider {
    private final Map<String, CustomTypeSchema> customTypeSchemaMap;
    private final LinkedHashSet<Class<? extends Model>> modelClasses;
    private final Map<String, ModelSchema> modelSchemaMap;
    private final String version;

    public static final class Builder {
        private String version;
        private final LinkedHashSet<Class<? extends Model>> modelClasses = new LinkedHashSet<>();
        private final LinkedHashSet<CustomTypeSchema> customTypeSchemas = new LinkedHashSet<>();

        public <T extends Model> Builder addCustomTypeSchema(CustomTypeSchema customTypeSchema) {
            Objects.requireNonNull(customTypeSchema);
            this.customTypeSchemas.add(customTypeSchema);
            return this;
        }

        public Builder addCustomTypeSchemas(CustomTypeSchema... customTypeSchemaArr) {
            Objects.requireNonNull(customTypeSchemaArr);
            for (CustomTypeSchema customTypeSchema : customTypeSchemaArr) {
                Objects.requireNonNull(customTypeSchema);
                addCustomTypeSchema(customTypeSchema);
            }
            return this;
        }

        public <T extends Model> Builder addModel(Class<T> cls) {
            Objects.requireNonNull(cls);
            this.modelClasses.add(cls);
            return this;
        }

        @SafeVarargs
        public final Builder addModels(Class<? extends Model>... clsArr) {
            Objects.requireNonNull(clsArr);
            for (Class<? extends Model> cls : clsArr) {
                Objects.requireNonNull(cls);
                addModel(cls);
            }
            return this;
        }

        @SuppressLint({"SyntheticAccessor"})
        public SimpleModelProvider build() {
            return SimpleModelProvider.instance(this.version, this.modelClasses);
        }

        public Builder version(String str) {
            Objects.requireNonNull(str);
            this.version = str;
            return this;
        }
    }

    private SimpleModelProvider(String str, LinkedHashSet<Class<? extends Model>> linkedHashSet) {
        LinkedHashSet<Class<? extends Model>> linkedHashSet2 = new LinkedHashSet<>();
        this.modelClasses = linkedHashSet2;
        this.modelSchemaMap = new HashMap();
        this.customTypeSchemaMap = new HashMap();
        this.version = str;
        linkedHashSet2.addAll(linkedHashSet);
    }

    public static Builder builder() {
        return new Builder();
    }

    @SafeVarargs
    public static SimpleModelProvider instance(String str, Class<? extends Model>... clsArr) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(clsArr);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Collections.addAll(linkedHashSet, clsArr);
        return new SimpleModelProvider(str, (LinkedHashSet<Class<? extends Model>>) linkedHashSet);
    }

    @SafeVarargs
    public static SimpleModelProvider withRandomVersion(Class<? extends Model>... clsArr) {
        Objects.requireNonNull(clsArr);
        return builder().version(UUID.randomUUID().toString()).addModels(clsArr).build();
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public Set<String> customTypeNames() {
        return this.customTypeSchemaMap.size() > 0 ? this.customTypeSchemaMap.keySet() : super.customTypeNames();
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public Map<String, CustomTypeSchema> customTypeSchemas() {
        return this.customTypeSchemaMap.size() > 0 ? this.customTypeSchemaMap : super.customTypeSchemas();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SimpleModelProvider.class != obj.getClass()) {
            return false;
        }
        SimpleModelProvider simpleModelProvider = (SimpleModelProvider) obj;
        if (this.version.equals(simpleModelProvider.version)) {
            return this.modelClasses.equals(simpleModelProvider.modelClasses);
        }
        return false;
    }

    public int hashCode() {
        return (this.version.hashCode() * 31) + this.modelClasses.hashCode();
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public Set<String> modelNames() {
        return this.modelSchemaMap.size() > 0 ? this.modelSchemaMap.keySet() : super.modelNames();
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public Map<String, ModelSchema> modelSchemas() {
        return this.modelSchemaMap.size() > 0 ? this.modelSchemaMap : super.modelSchemas();
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public Set<Class<? extends Model>> models() {
        return Collections.unmodifiableSet(this.modelClasses);
    }

    public String toString() {
        return "SimpleModelProvider{version='" + this.version + "', modelClasses=" + this.modelClasses + '}';
    }

    @Override // com.amplifyframework.core.model.ModelProvider
    public String version() {
        return this.version;
    }

    public static SimpleModelProvider instance(String str, Set<Class<? extends Model>> set) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(set);
        return new SimpleModelProvider(str, (LinkedHashSet<Class<? extends Model>>) new LinkedHashSet(set));
    }

    private SimpleModelProvider(String str, Map<String, ModelSchema> map) {
        this.modelClasses = new LinkedHashSet<>();
        HashMap map2 = new HashMap();
        this.modelSchemaMap = map2;
        this.customTypeSchemaMap = new HashMap();
        this.version = str;
        map2.putAll(map);
    }

    public static SimpleModelProvider instance(String str, Map<String, ModelSchema> map) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(map);
        return new SimpleModelProvider(str, map);
    }

    public static SimpleModelProvider instance(String str, Map<String, ModelSchema> map, Map<String, CustomTypeSchema> map2) {
        Objects.requireNonNull(str);
        Objects.requireNonNull(map);
        return new SimpleModelProvider(str, map, map2);
    }

    private SimpleModelProvider(String str, Map<String, ModelSchema> map, Map<String, CustomTypeSchema> map2) {
        this.modelClasses = new LinkedHashSet<>();
        HashMap map3 = new HashMap();
        this.modelSchemaMap = map3;
        HashMap map4 = new HashMap();
        this.customTypeSchemaMap = map4;
        this.version = str;
        map3.putAll(map);
        map4.putAll(map2);
    }
}
