package com.amplifyframework.core.model.query.predicate;

import com.amplifyframework.core.model.query.predicate.QueryOperator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* loaded from: classes5.dex */
public final class GsonPredicateAdapters {

    /* renamed from: com.amplifyframework.core.model.query.predicate.GsonPredicateAdapters$1 */
    public static /* synthetic */ class C105521 {

        /* renamed from: $SwitchMap$com$amplifyframework$core$model$query$predicate$GsonPredicateAdapters$QueryPredicateAdapter$PredicateType */
        static final /* synthetic */ int[] f10639xd3427a67;

        /* renamed from: $SwitchMap$com$amplifyframework$core$model$query$predicate$QueryOperator$Type */
        static final /* synthetic */ int[] f10640x44beeda4;

        static {
            int[] iArr = new int[QueryPredicateAdapter.PredicateType.values().length];
            f10639xd3427a67 = iArr;
            try {
                iArr[QueryPredicateAdapter.PredicateType.OPERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10639xd3427a67[QueryPredicateAdapter.PredicateType.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10639xd3427a67[QueryPredicateAdapter.PredicateType.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10639xd3427a67[QueryPredicateAdapter.PredicateType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[QueryOperator.Type.values().length];
            f10640x44beeda4 = iArr2;
            try {
                iArr2[QueryOperator.Type.CONTAINS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.NOT_CONTAINS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.GREATER_OR_EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.LESS_OR_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.BETWEEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.EQUAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.NOT_EQUAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10640x44beeda4[QueryOperator.Type.BEGINS_WITH.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    public static final class QueryOperatorAdapter implements JsonDeserializer<QueryOperator<?>>, JsonSerializer<QueryOperator<?>> {
        private static final String TYPE = "type";

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public QueryOperator<?> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                return null;
            }
            switch (C105521.f10640x44beeda4[QueryOperator.Type.valueOf(jsonElement.getAsJsonObject().get("type").getAsString()).ordinal()]) {
                case 1:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, ContainsQueryOperator.class);
                case 2:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, NotContainsQueryOperator.class);
                case 3:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, GreaterOrEqualQueryOperator.class);
                case 4:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, LessOrEqualQueryOperator.class);
                case 5:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, GreaterThanQueryOperator.class);
                case 6:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, LessThanQueryOperator.class);
                case 7:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, BetweenQueryOperator.class);
                case 8:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, EqualQueryOperator.class);
                case 9:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, NotEqualQueryOperator.class);
                case 10:
                    return (QueryOperator) jsonDeserializationContext.deserialize(jsonElement, BeginsWithQueryOperator.class);
                default:
                    throw new JsonParseException("Unable to deserialize " + jsonElement.toString() + " to QueryOperator instance.");
            }
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(QueryOperator<?> queryOperator, Type type2, JsonSerializationContext jsonSerializationContext) {
            if (queryOperator instanceof ContainsQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, ContainsQueryOperator.class);
            }
            if (queryOperator instanceof NotContainsQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, NotContainsQueryOperator.class);
            }
            if (queryOperator instanceof GreaterOrEqualQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, GreaterOrEqualQueryOperator.class);
            }
            if (queryOperator instanceof LessOrEqualQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, LessOrEqualQueryOperator.class);
            }
            if (queryOperator instanceof GreaterThanQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, GreaterThanQueryOperator.class);
            }
            if (queryOperator instanceof LessThanQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, LessThanQueryOperator.class);
            }
            if (queryOperator instanceof BetweenQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, BetweenQueryOperator.class);
            }
            if (queryOperator instanceof EqualQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, EqualQueryOperator.class);
            }
            if (queryOperator instanceof NotEqualQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, NotEqualQueryOperator.class);
            }
            if (queryOperator instanceof BeginsWithQueryOperator) {
                return jsonSerializationContext.serialize(queryOperator, BeginsWithQueryOperator.class);
            }
            throw new JsonParseException("Unable to serialize a QueryOperator of type " + queryOperator.type().name() + ".");
        }
    }

    public static final class QueryPredicateAdapter implements JsonDeserializer<QueryPredicate>, JsonSerializer<QueryPredicate> {
        private static final String TYPE = "_type";
        private final Gson gson = new GsonBuilder().registerTypeAdapter(QueryOperator.class, new QueryOperatorAdapter()).serializeNulls().create();

        public enum PredicateType {
            OPERATION,
            GROUP,
            ALL,
            NONE
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.gson.JsonDeserializer
        public QueryPredicate deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
            if (jsonElement == null || jsonElement.isJsonNull()) {
                return null;
            }
            int i = C105521.f10639xd3427a67[PredicateType.valueOf(jsonElement.getAsJsonObject().get(TYPE).getAsString()).ordinal()];
            if (i == 1) {
                return (QueryPredicate) this.gson.fromJson(jsonElement, QueryPredicateOperation.class);
            }
            if (i == 2) {
                return (QueryPredicate) this.gson.fromJson(jsonElement, QueryPredicateGroup.class);
            }
            if (i == 3) {
                return (QueryPredicate) this.gson.fromJson(jsonElement, MatchAllQueryPredicate.class);
            }
            if (i == 4) {
                return (QueryPredicate) this.gson.fromJson(jsonElement, MatchNoneQueryPredicate.class);
            }
            throw new JsonParseException("Unable to deserialize " + jsonElement.toString() + " to QueryPredicate instance.");
        }

        @Override // com.google.gson.JsonSerializer
        public JsonElement serialize(QueryPredicate queryPredicate, Type type2, JsonSerializationContext jsonSerializationContext) {
            PredicateType predicateType;
            JsonElement jsonTree = this.gson.toJsonTree(queryPredicate);
            if (queryPredicate instanceof MatchAllQueryPredicate) {
                predicateType = PredicateType.ALL;
            } else if (queryPredicate instanceof MatchNoneQueryPredicate) {
                predicateType = PredicateType.NONE;
            } else if (queryPredicate instanceof QueryPredicateOperation) {
                predicateType = PredicateType.OPERATION;
            } else {
                if (!(queryPredicate instanceof QueryPredicateGroup)) {
                    throw new JsonParseException("Unable to identify the predicate type.");
                }
                predicateType = PredicateType.GROUP;
            }
            JsonObject asJsonObject = jsonTree.getAsJsonObject();
            asJsonObject.addProperty(TYPE, predicateType.name());
            return asJsonObject;
        }
    }

    private GsonPredicateAdapters() {
    }

    public static void register(GsonBuilder gsonBuilder) {
        gsonBuilder.registerTypeHierarchyAdapter(QueryPredicate.class, new QueryPredicateAdapter());
    }
}
