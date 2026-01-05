package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelList;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelListDeserializer<M extends Model> implements JsonDeserializer<ModelList<? extends M>> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final void register(GsonBuilder gsonBuilder) {
            sq8.m48649h(gsonBuilder, "builder");
            gsonBuilder.registerTypeAdapter(ModelList.class, new ModelListDeserializer());
        }
    }

    public static final void register(GsonBuilder gsonBuilder) {
        Companion.register(gsonBuilder);
    }

    @Override // com.google.gson.JsonDeserializer
    public ModelList<M> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        sq8.m48649h(jsonElement, "json");
        sq8.m48649h(type2, "typeOfT");
        sq8.m48649h(jsonDeserializationContext, "context");
        return new ApiLoadedModelList(LazyTypeDeserializersKt.deserializeItems(jsonElement, type2, jsonDeserializationContext));
    }
}
