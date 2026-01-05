package com.amplifyframework.datastore.appsync;

import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.category.CategoryType;
import com.amplifyframework.core.model.ModelField;
import com.amplifyframework.core.model.ModelSchema;
import com.amplifyframework.core.model.SchemaRegistry;
import com.amplifyframework.core.model.SerializedCustomType;
import com.amplifyframework.core.model.SerializedModel;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.util.GsonObjectConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class SerializedModelAdapter implements JsonDeserializer<SerializedModel>, JsonSerializer<SerializedModel> {
    private static final Logger LOGGER = Amplify.Logging.logger(CategoryType.DATASTORE, SerializedModelAdapter.class.getName());

    private SerializedModelAdapter() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(SerializedModel.class, new SerializedModelAdapter());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public SerializedModel deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        LOGGER.verbose(String.format("deserialize: json=%s, typeOfT=%s", jsonElement, type2));
        JsonObject asJsonObject = jsonElement.getAsJsonObject();
        ModelSchema modelSchema = (ModelSchema) jsonDeserializationContext.deserialize(asJsonObject.get("modelSchema"), ModelSchema.class);
        JsonObject asJsonObject2 = asJsonObject.get("serializedData").getAsJsonObject();
        HashMap map = new HashMap(GsonObjectConverter.toMap(asJsonObject2));
        for (Map.Entry<String, JsonElement> entry : asJsonObject2.entrySet()) {
            ModelField modelField = modelSchema.getFields().get(entry.getKey());
            if (modelField != null) {
                String name = modelField.getName();
                JsonElement value = entry.getValue();
                if (value.isJsonNull()) {
                    LOGGER.verbose(String.format("Field %s is null", name));
                    map.put(name, null);
                } else {
                    boolean zIsModel = modelField.isModel();
                    boolean zIsCustomType = modelField.isCustomType();
                    boolean zIsArray = modelField.isArray();
                    LOGGER.verbose(String.format("Deserializing field %s: isModel=%s, isCustom=%s, isArray=%s", name, Boolean.valueOf(zIsModel), Boolean.valueOf(zIsCustomType), Boolean.valueOf(zIsArray)));
                    if (zIsModel) {
                        map.put(name, SerializedModel.builder().modelSchema(SchemaRegistry.instance().getModelSchemaForModelClass(modelField.getTargetType())).serializedData((Map) new Gson().fromJson(value, new TypeToken<Map<String, Object>>() { // from class: com.amplifyframework.datastore.appsync.SerializedModelAdapter.1
                        }.getType())).build());
                    } else if (zIsCustomType) {
                        if (zIsArray) {
                            JsonArray asJsonArray = value.getAsJsonArray();
                            ArrayList arrayList = new ArrayList();
                            for (int i = 0; i < asJsonArray.size(); i++) {
                                arrayList.add((SerializedCustomType) jsonDeserializationContext.deserialize(asJsonArray.get(i), SerializedCustomType.class));
                            }
                            map.put(name, arrayList);
                        } else {
                            map.put(name, jsonDeserializationContext.deserialize(value, SerializedCustomType.class));
                        }
                    }
                }
            }
        }
        return SerializedModel.builder().modelSchema(modelSchema).serializedData(map).build();
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SerializedModel serializedModel, Type type2, JsonSerializationContext jsonSerializationContext) {
        LOGGER.verbose(String.format("serialize: src=%s, typeOfSrc=%s", serializedModel, type2));
        ModelSchema modelSchema = serializedModel.getModelSchema();
        JsonObject jsonObject = new JsonObject();
        jsonObject.add(OutcomeConstants.OUTCOME_ID, jsonSerializationContext.serialize(serializedModel.getPrimaryKeyString()));
        jsonObject.add("modelSchema", jsonSerializationContext.serialize(modelSchema));
        JsonObject jsonObject2 = new JsonObject();
        for (Map.Entry<String, Object> entry : serializedModel.getSerializedData().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            boolean z = value instanceof SerializedModel;
            boolean z2 = value instanceof SerializedCustomType;
            LOGGER.verbose(String.format("Serializing field %s: isModel=%s, isCustom=%s", key, Boolean.valueOf(z), Boolean.valueOf(z2)));
            if (z) {
                jsonObject2.add(key, jsonSerializationContext.serialize(((SerializedModel) value).getSerializedData()));
            } else if (z2) {
                jsonObject2.add(key, jsonSerializationContext.serialize(value));
            } else {
                jsonObject2.add(key, jsonSerializationContext.serialize(value));
            }
        }
        LOGGER.verbose(String.format("Successfully serialized model: %s", jsonObject2));
        jsonObject.add("serializedData", jsonObject2);
        return jsonObject;
    }
}
