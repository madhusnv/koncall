package com.amplifyframework.datastore.appsync;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.util.GsonObjectConverter;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class ModelWithMetadataAdapter implements JsonDeserializer<ModelWithMetadata<? extends Model>>, JsonSerializer<ModelWithMetadata<? extends Model>> {
    public static final String DELETED_KEY = "_deleted";
    public static final String LAST_CHANGED_AT_KEY = "_lastChangedAt";
    public static final String TYPE_NAME = "__typename";
    public static final String VERSION_KEY = "_version";

    public static void register(GsonBuilder gsonBuilder) {
        Objects.requireNonNull(gsonBuilder);
        gsonBuilder.registerTypeAdapter(ModelWithMetadata.class, new ModelWithMetadataAdapter());
    }

    private void removeMetadataFields(JsonObject jsonObject) {
        jsonObject.remove(DELETED_KEY);
        jsonObject.remove(VERSION_KEY);
        jsonObject.remove(LAST_CHANGED_AT_KEY);
        jsonObject.remove(TYPE_NAME);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public ModelWithMetadata<? extends Model> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        Model modelBuild;
        if (!(type2 instanceof ParameterizedType)) {
            throw new JsonParseException("Expected a parameterized type during ModelWithMetadata deserialization.");
        }
        Class cls = (Class) ((ParameterizedType) type2).getActualTypeArguments()[0];
        ModelMetadata modelMetadata = (ModelMetadata) jsonDeserializationContext.deserialize(jsonElement, ModelMetadata.class);
        if (cls == SerializedModel.class) {
            JsonObject jsonObject = (JsonObject) jsonElement;
            ModelSchema modelSchemaForModelClass = SchemaRegistry.instance().getModelSchemaForModelClass(jsonObject.get(TYPE_NAME).getAsString());
            removeMetadataFields(jsonObject);
            modelBuild = SerializedModel.builder().modelSchema(modelSchemaForModelClass).serializedData(GsonObjectConverter.toMap(jsonObject)).build();
        } else {
            modelBuild = (Model) jsonDeserializationContext.deserialize(jsonElement, cls);
        }
        return new ModelWithMetadata<>(modelBuild, modelMetadata);
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(ModelWithMetadata<? extends Model> modelWithMetadata, Type type2, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        ModelMetadata syncMetadata = modelWithMetadata.getSyncMetadata();
        for (Map.Entry<String, JsonElement> entry : ((JsonObject) jsonSerializationContext.serialize(syncMetadata)).entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue());
        }
        jsonObject.addProperty(TYPE_NAME, syncMetadata.getTypename());
        for (Map.Entry<String, JsonElement> entry2 : ((JsonObject) jsonSerializationContext.serialize(modelWithMetadata.getModel())).entrySet()) {
            jsonObject.add(entry2.getKey(), entry2.getValue());
        }
        return jsonObject;
    }
}
