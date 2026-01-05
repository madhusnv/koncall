package com.amplifyframework.core.model;

import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.datastore.DataStoreException;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class SchemaRegistryUtils {
    public static final SchemaRegistryUtils INSTANCE = new SchemaRegistryUtils();

    private SchemaRegistryUtils() {
    }

    public static final void registerSchema(Map<String, ModelSchema> modelSchemaMap, String modelName, ModelSchema modelSchema) throws DataStoreException.IrRecoverableException {
        AbstractC4154l.m8923f(modelSchemaMap, "modelSchemaMap");
        AbstractC4154l.m8923f(modelName, "modelName");
        AbstractC4154l.m8923f(modelSchema, "modelSchema");
        try {
            ModelConfig modelConfig = (ModelConfig) modelSchema.getModelClass().getAnnotation(ModelConfig.class);
            if (modelConfig != null && modelConfig.hasLazySupport()) {
                throw new DataStoreException.IrRecoverableException("Unsupported model type. Lazy model types are not yet supported on DataStore.", "Regenerate models with generatemodelsforlazyloadandcustomselectionset=false.");
            }
        } catch (NullPointerException unused) {
        }
        modelSchemaMap.put(modelName, modelSchema);
    }

    public static final void registerSchemas(Map<String, ModelSchema> modelSchemaMap, Map<String, ModelSchema> map) throws DataStoreException.IrRecoverableException {
        AbstractC4154l.m8923f(modelSchemaMap, "modelSchemaMap");
        if (map != null) {
            for (Map.Entry<String, ModelSchema> entry : map.entrySet()) {
                registerSchema(modelSchemaMap, entry.getKey(), entry.getValue());
            }
        }
    }

    public static /* synthetic */ void registerSchemas$default(Map map, Map map2, int i10, Object obj) throws DataStoreException.IrRecoverableException {
        if ((i10 & 2) != 0) {
            map2 = null;
        }
        registerSchemas(map, map2);
    }
}
