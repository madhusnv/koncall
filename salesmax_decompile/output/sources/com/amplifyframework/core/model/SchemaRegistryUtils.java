package com.amplifyframework.core.model;

import com.amplifyframework.core.model.annotations.ModelConfig;
import com.amplifyframework.datastore.DataStoreException;
import java.util.Map;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class SchemaRegistryUtils {
    public static final SchemaRegistryUtils INSTANCE = new SchemaRegistryUtils();

    private SchemaRegistryUtils() {
    }

    public static final void registerSchema(Map<String, ModelSchema> map, String str, ModelSchema modelSchema) throws DataStoreException.IrRecoverableException {
        boolean z;
        sq8.m48649h(map, "modelSchemaMap");
        sq8.m48649h(str, "modelName");
        sq8.m48649h(modelSchema, "modelSchema");
        try {
            ModelConfig modelConfig = (ModelConfig) modelSchema.getModelClass().getAnnotation(ModelConfig.class);
            z = false;
            if (modelConfig != null && modelConfig.hasLazySupport()) {
                z = true;
            }
        } catch (NullPointerException unused) {
        }
        if (z) {
            throw new DataStoreException.IrRecoverableException("Unsupported model type. Lazy model types are not yet supported on DataStore.", "Regenerate models with generatemodelsforlazyloadandcustomselectionset=false.");
        }
        map.put(str, modelSchema);
    }

    public static final void registerSchemas(Map<String, ModelSchema> map, Map<String, ModelSchema> map2) throws DataStoreException.IrRecoverableException {
        sq8.m48649h(map, "modelSchemaMap");
        if (map2 != null) {
            for (Map.Entry<String, ModelSchema> entry : map2.entrySet()) {
                registerSchema(map, entry.getKey(), entry.getValue());
            }
        }
    }

    public static /* synthetic */ void registerSchemas$default(Map map, Map map2, int i, Object obj) throws DataStoreException.IrRecoverableException {
        if ((i & 2) != 0) {
            map2 = null;
        }
        registerSchemas(map, map2);
    }
}
