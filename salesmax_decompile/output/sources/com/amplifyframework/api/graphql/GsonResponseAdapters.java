package com.amplifyframework.api.graphql;

import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import com.amplifyframework.datastore.appsync.ModelWithMetadata;
import com.amplifyframework.util.GsonObjectConverter;
import com.amplifyframework.util.TypeMaker;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class GsonResponseAdapters {

    public static final class ErrorDeserializer implements JsonDeserializer<GraphQLResponse.Error> {
        private static final String EXTENSIONS_KEY = "extensions";
        private static final String LOCATIONS_KEY = "locations";
        private static final String MESSAGE_KEY = "message";
        private static final String PATH_KEY = "path";

        private List<GraphQLPathSegment> getPath(JsonElement jsonElement) {
            ArrayList arrayList = new ArrayList();
            if (jsonElement.isJsonNull()) {
                return null;
            }
            if (!jsonElement.isJsonArray()) {
                throw new JsonParseException("Expected a JsonArray but found a " + jsonElement.getClass().getName() + " while deserializing path");
            }
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) it.next();
                if (jsonPrimitive.isNumber()) {
                    arrayList.add(new GraphQLPathSegment(jsonPrimitive.getAsInt()));
                } else {
                    if (!jsonPrimitive.isString()) {
                        throw new JsonParseException("Expected a String or int, but found a " + JsonPrimitive.class.getSimpleName() + " while deserializing path segment");
                    }
                    arrayList.add(new GraphQLPathSegment(jsonPrimitive.getAsString()));
                }
            }
            return arrayList;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public GraphQLResponse.Error deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (!jsonElement.isJsonObject()) {
                throw new JsonParseException("Expected a JSONObject but found a " + jsonElement.getClass().getName() + " while deserializing error");
            }
            JsonObject jsonObject = new JsonObject();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            String str = null;
            List list = null;
            List<GraphQLPathSegment> path = null;
            for (String str2 : asJsonObject.keySet()) {
                JsonElement jsonElement2 = asJsonObject.get(str2);
                if (jsonElement2 != null) {
                    str2.hashCode();
                    switch (str2) {
                        case "extensions":
                            jsonObject = jsonElement2.getAsJsonObject();
                            continue;
                        case "locations":
                            list = (List) jsonDeserializationContext.deserialize(jsonElement2, TypeMaker.getParameterizedType(List.class, GraphQLLocation.class));
                            continue;
                        case "path":
                            path = getPath(jsonElement2);
                            continue;
                        case "message":
                            str = (String) jsonDeserializationContext.deserialize(jsonElement2, String.class);
                            break;
                        default:
                            jsonObject2.add(str2, jsonElement2);
                            break;
                    }
                }
            }
            if (str == null) {
                str = "Message was null or missing while deserializing error";
            }
            for (String str3 : jsonObject2.keySet()) {
                if (!jsonObject.has(str3)) {
                    jsonObject.add(str3, jsonObject2.get(str3));
                }
            }
            return new GraphQLResponse.Error(str, list, path, jsonObject.size() > 0 ? GsonObjectConverter.toMap(jsonObject) : null);
        }
    }

    public static final class ResponseDeserializer implements JsonDeserializer<GraphQLResponse<Object>> {
        private static final String DATA_KEY = "data";
        private static final String ERRORS_KEY = "errors";

        private List<GraphQLResponse.Error> parseErrors(JsonElement jsonElement, JsonDeserializationContext jsonDeserializationContext) {
            return (jsonElement == null || jsonElement.isJsonNull()) ? Collections.emptyList() : (List) jsonDeserializationContext.deserialize(jsonElement, TypeMaker.getParameterizedType(ArrayList.class, GraphQLResponse.Error.class));
        }

        private boolean shouldSkipQueryLevel(Type type2) {
            if (!(type2 instanceof ParameterizedType)) {
                return Model.class.isAssignableFrom((Class) type2);
            }
            Type rawType = ((ParameterizedType) type2).getRawType();
            if (ModelWithMetadata.class.equals(rawType)) {
                return true;
            }
            Class cls = (Class) rawType;
            return Iterable.class.isAssignableFrom(cls) || ModelPage.class.isAssignableFrom(cls);
        }

        private JsonElement skipQueryLevel(JsonElement jsonElement) {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                return null;
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (asJsonObject.size() == 0) {
                throw new JsonParseException("Amplify encountered an error while serializing/deserializing an object.  Please add a single top level field in your query.");
            }
            if (asJsonObject.size() <= 1) {
                return asJsonObject.get(asJsonObject.keySet().iterator().next());
            }
            throw new JsonParseException("Amplify encountered an error while serializing/deserializing an object.  Please reduce your query to a single top level field.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public GraphQLResponse<Object> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (!jsonElement.isJsonObject()) {
                throw new JsonParseException("Expected a JsonObject while deserializing GraphQLResponse but found " + jsonElement);
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            JsonElement jsonElementSkipQueryLevel = asJsonObject.has("data") ? asJsonObject.get("data") : null;
            List<GraphQLResponse.Error> errors = parseErrors(asJsonObject.has(ERRORS_KEY) ? asJsonObject.get(ERRORS_KEY) : null, jsonDeserializationContext);
            if (!(type2 instanceof ParameterizedType)) {
                throw new JsonParseException("Expected a parameterized type during GraphQLResponse deserialization.");
            }
            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
            if (shouldSkipQueryLevel(type3)) {
                jsonElementSkipQueryLevel = skipQueryLevel(jsonElementSkipQueryLevel);
            }
            return (jsonElementSkipQueryLevel == null || jsonElementSkipQueryLevel.isJsonNull()) ? new GraphQLResponse<>(null, errors) : new GraphQLResponse<>(jsonDeserializationContext.deserialize(jsonElementSkipQueryLevel, type3), errors);
        }
    }

    private GsonResponseAdapters() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeAdapter(GraphQLResponse.class, new ResponseDeserializer()).registerTypeAdapter(GraphQLResponse.Error.class, new ErrorDeserializer());
    }
}
