package com.amplifyframework.api.aws;

import com.amplifyframework.api.ApiException;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import java.util.Map;
import p001o.gi9;
import p001o.si9;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class AWSApiSchemaRegistry {
    private final gi9 modelSchemaMap$delegate = si9.m48360a(AWSApiSchemaRegistry$modelSchemaMap$2.INSTANCE);

    private final Map<String, ModelSchema> getModelSchemaMap() {
        Object value = this.modelSchemaMap$delegate.getValue();
        sq8.m48648g(value, "getValue(...)");
        return (Map) value;
    }

    public final ModelSchema getModelSchemaForModelClass(String str) throws ApiException {
        sq8.m48649h(str, "classSimpleName");
        ModelSchema modelSchema = getModelSchemaMap().get(str);
        if (modelSchema != null) {
            return modelSchema;
        }
        throw new ApiException("Model type of `" + str + "` not found.", "Please regenerate codegen models and verify the class is found in AmplifyModelProvider.");
    }

    public final <T extends Model> ModelSchema getModelSchemaForModelClass(Class<T> cls) {
        sq8.m48649h(cls, "modelClass");
        String simpleName = cls.getSimpleName();
        sq8.m48648g(simpleName, "getSimpleName(...)");
        return getModelSchemaForModelClass(simpleName);
    }
}
