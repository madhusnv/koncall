package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001o.dh3;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class LazyTypeDeserializersKt {
    public static final String ITEMS_KEY = "items";
    public static final String NEXT_TOKEN_KEY = "nextToken";

    /* JADX INFO: Access modifiers changed from: private */
    public static final <M extends Model> List<M> deserializeItems(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        ParameterizedType parameterizedType = type2 instanceof ParameterizedType ? (ParameterizedType) type2 : null;
        if (parameterizedType == null) {
            throw new JsonParseException("Expected a parameterized type during list deserialization.");
        }
        Type type3 = parameterizedType.getActualTypeArguments()[0];
        JsonObject jsonObject = getJsonObject(jsonElement);
        if (!jsonObject.has("items") || !jsonObject.get("items").isJsonArray()) {
            throw new JsonParseException("Got JSON from an API call which was supposed to go with a List but is in the form of an object rather than an array. It also is not in the standard format of having an items property with the actual array of data so we do not know how to deserialize it.");
        }
        JsonArray asJsonArray = jsonObject.getAsJsonArray("items");
        sq8.m48646e(asJsonArray);
        ArrayList arrayList = new ArrayList(dh3.m23088v(asJsonArray, 10));
        Iterator<JsonElement> it = asJsonArray.iterator();
        while (it.hasNext()) {
            arrayList.add((Model) jsonDeserializationContext.deserialize(it.next().getAsJsonObject(), type3));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiPaginationToken deserializeNextToken(JsonElement jsonElement) {
        JsonElement jsonElement2 = getJsonObject(jsonElement).get(NEXT_TOKEN_KEY);
        if (jsonElement2 == null) {
            return null;
        }
        String asString = jsonElement2.isJsonPrimitive() ? jsonElement2.getAsString() : null;
        if (asString != null) {
            return new ApiPaginationToken(asString);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonObject getJsonObject(JsonElement jsonElement) {
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        throw new JsonParseException("Got a JSON value that was not an object Unable to deserialize the response");
    }
}
