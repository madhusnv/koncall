package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.LoadedModelReferenceImpl;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelReference;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import p001o.bce;
import p001o.dh3;
import p001o.hsa;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelReferenceDeserializer<M extends Model> implements JsonDeserializer<ModelReference<M>> {
    private final String apiName;
    private final AWSApiSchemaRegistry schemaRegistry;

    public ModelReferenceDeserializer(String str, AWSApiSchemaRegistry aWSApiSchemaRegistry) {
        sq8.m48649h(aWSApiSchemaRegistry, "schemaRegistry");
        this.apiName = str;
        this.schemaRegistry = aWSApiSchemaRegistry;
    }

    public final String getApiName() {
        return this.apiName;
    }

    @Override // com.google.gson.JsonDeserializer
    public ModelReference<M> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        sq8.m48649h(jsonElement, "json");
        sq8.m48649h(type2, "typeOfT");
        sq8.m48649h(jsonDeserializationContext, "context");
        ParameterizedType parameterizedType = type2 instanceof ParameterizedType ? (ParameterizedType) type2 : null;
        if (parameterizedType == null) {
            throw new JsonParseException("Expected a parameterized type during list deserialization.");
        }
        Type type3 = parameterizedType.getActualTypeArguments()[0];
        sq8.m48647f(type3, "null cannot be cast to non-null type java.lang.Class<M of com.amplifyframework.api.aws.ModelReferenceDeserializer>");
        Class cls = (Class) type3;
        JsonObject jsonObject = LazyTypeDeserializersKt.getJsonObject(jsonElement);
        List<String> primaryIndexFields = this.schemaRegistry.getModelSchemaForModelClass(cls).getPrimaryIndexFields();
        sq8.m48648g(primaryIndexFields, "getPrimaryIndexFields(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(bce.m18601d(hsa.m31055e(dh3.m23088v(primaryIndexFields, 10)), 16));
        for (Object obj : primaryIndexFields) {
            linkedHashMap.put(obj, jsonObject.get((String) obj));
        }
        if (jsonObject.size() > linkedHashMap.size()) {
            try {
                return new LoadedModelReferenceImpl((Model) jsonDeserializationContext.deserialize(jsonElement, cls));
            } catch (Exception unused) {
            }
        }
        return new ApiLazyModelReference(cls, linkedHashMap, this.apiName, null, 8, null);
    }
}
