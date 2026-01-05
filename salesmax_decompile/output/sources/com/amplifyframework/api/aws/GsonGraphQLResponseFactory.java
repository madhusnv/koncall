package com.amplifyframework.api.aws;

import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.api.graphql.GraphQLResponse;
import com.amplifyframework.api.graphql.PaginatedResult;
import com.amplifyframework.core.model.ModelReference;
import com.amplifyframework.util.Empty;
import com.amplifyframework.util.TypeMaker;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
final class GsonGraphQLResponseFactory implements GraphQLResponse.Factory {
    private final Gson gson;
    private final AWSApiSchemaRegistry schemaRegistry;

    public static final class IterableDeserializer<R> implements JsonDeserializer<Iterable<Object>> {
        private static final String ITEMS_KEY = "items";
        private static final String NEXT_TOKEN_KEY = "nextToken";
        private final GraphQLRequest<R> request;

        public IterableDeserializer(GraphQLRequest<R> graphQLRequest) {
            this.request = graphQLRequest;
        }

        private PaginatedResult<Object> buildPaginatedResult(Iterable<Object> iterable, JsonElement jsonElement) throws AmplifyException {
            AppSyncGraphQLRequest<R> appSyncGraphQLRequestBuild = null;
            if (jsonElement != null && jsonElement.isJsonPrimitive()) {
                String asString = jsonElement.getAsJsonPrimitive().getAsString();
                try {
                    GraphQLRequest<R> graphQLRequest = this.request;
                    if (graphQLRequest instanceof AppSyncGraphQLRequest) {
                        appSyncGraphQLRequestBuild = ((AppSyncGraphQLRequest) graphQLRequest).newBuilder().variable("nextToken", "String", asString).build();
                    }
                } catch (AmplifyException e) {
                    throw new JsonParseException("Failed to create requestForNextPage with nextToken variable", e);
                }
            }
            return new PaginatedResult<>(iterable, appSyncGraphQLRequestBuild);
        }

        private Iterable<Object> toList(JsonArray jsonArray, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(jsonDeserializationContext.deserialize(it.next(), type2));
            }
            return arrayList;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public Iterable<Object> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (!(type2 instanceof ParameterizedType)) {
                throw new JsonParseException("Expected a parameterized type during list deserialization.");
            }
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            if (!jsonElement.isJsonObject()) {
                if (jsonElement.isJsonArray()) {
                    return toList(jsonElement.getAsJsonArray(), type3, jsonDeserializationContext);
                }
                throw new JsonParseException("Got a JSON value that was not an object or a list. Refusing to deserialize into a Java Iterable.");
            }
            JsonObject asJsonObject = jsonElement.getAsJsonObject();
            if (!asJsonObject.has("items") || !asJsonObject.get("items").isJsonArray()) {
                throw new JsonParseException("Got JSON from an API call which was supposed to go with a List but is in the form of an object rather than an array. It also is not in the standard format of having an items property with the actual array of data so we do not know how to deserialize it.");
            }
            Iterable<Object> list = toList(asJsonObject.get("items").getAsJsonArray(), type3, jsonDeserializationContext);
            return PaginatedResult.class.equals(parameterizedType.getRawType()) ? buildPaginatedResult(list, asJsonObject.get("nextToken")) : list;
        }
    }

    public GsonGraphQLResponseFactory() {
        this(GsonFactory.instance());
    }

    public <T> GraphQLResponse<T> buildResponse(GraphQLRequest<T> graphQLRequest, String str, String str2) throws ApiException {
        if (Empty.check(str)) {
            throw new ApiException("Amplify encountered an error while deserializing an object.", new JsonParseException("Empty response."), "Sorry, we don’t have a recovery suggestion for this error.");
        }
        try {
            return (GraphQLResponse) this.gson.newBuilder().registerTypeHierarchyAdapter(Iterable.class, new IterableDeserializer(graphQLRequest)).registerTypeAdapter(ModelReference.class, new ModelReferenceDeserializer(str2, this.schemaRegistry)).registerTypeAdapterFactory(new ModelPostProcessingTypeAdapter(str2, this.schemaRegistry)).create().fromJson(str, TypeMaker.getParameterizedType(GraphQLResponse.class, graphQLRequest.getResponseType()));
        } catch (JsonParseException e) {
            throw new ApiException("Amplify encountered an error while deserializing an object.", e, "Sorry, we don’t have a recovery suggestion for this error.");
        }
    }

    public GsonGraphQLResponseFactory(Gson gson) {
        this.schemaRegistry = new AWSApiSchemaRegistry();
        this.gson = gson;
    }

    @Override // com.amplifyframework.api.graphql.GraphQLResponse.Factory
    @Deprecated
    public <T> GraphQLResponse<T> buildResponse(GraphQLRequest<T> graphQLRequest, String str) {
        return buildResponse(graphQLRequest, str, null);
    }
}
