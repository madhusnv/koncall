package com.amplifyframework.core.model;

import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public final class SchemaRegistry {
    private static SchemaRegistry instance;
    private final Map<String, ModelSchema> modelSchemaMap = new HashMap();
    private final Map<String, CustomTypeSchema> customTypeSchemaMap = new HashMap();

    private SchemaRegistry() {
    }

    public static synchronized SchemaRegistry instance() {
        if (instance == null) {
            instance = new SchemaRegistry();
        }
        return instance;
    }

    public void clear() {
        this.modelSchemaMap.clear();
        this.customTypeSchemaMap.clear();
    }

    public synchronized CustomTypeSchema getCustomTypeSchemaForCustomTypeClass(String str) {
        return this.customTypeSchemaMap.get(str);
    }

    public Map<String, CustomTypeSchema> getCustomTypeSchemaMap() {
        return Immutable.of(this.customTypeSchemaMap);
    }

    public synchronized ModelSchema getModelSchemaForModelClass(String str) {
        return this.modelSchemaMap.get(str);
    }

    public synchronized <T extends Model> ModelSchema getModelSchemaForModelInstance(T t) {
        return this.modelSchemaMap.get(t.getClass().getSimpleName());
    }

    public Map<String, ModelSchema> getModelSchemaMap() {
        return Immutable.of(this.modelSchemaMap);
    }

    public synchronized void register(Set<Class<? extends Model>> set) {
        for (Class<? extends Model> cls : set) {
            SchemaRegistryUtils.registerSchema(this.modelSchemaMap, cls.getSimpleName(), ModelSchema.fromModelClass(cls));
        }
    }

    public synchronized <T extends Model> ModelSchema getModelSchemaForModelClass(Class<T> cls) {
        return this.modelSchemaMap.get(cls.getSimpleName());
    }

    public synchronized void register(Map<String, ModelSchema> map) {
        SchemaRegistryUtils.registerSchemas(this.modelSchemaMap, map);
    }

    public synchronized void register(Map<String, ModelSchema> map, Map<String, CustomTypeSchema> map2) {
        SchemaRegistryUtils.registerSchemas(this.modelSchemaMap, map);
        this.customTypeSchemaMap.putAll(map2);
    }

    public synchronized void register(String str, ModelSchema modelSchema) {
        SchemaRegistryUtils.registerSchema(this.modelSchemaMap, str, modelSchema);
    }

    public synchronized void register(String str, CustomTypeSchema customTypeSchema) {
        this.customTypeSchemaMap.put(str, customTypeSchema);
    }
}
