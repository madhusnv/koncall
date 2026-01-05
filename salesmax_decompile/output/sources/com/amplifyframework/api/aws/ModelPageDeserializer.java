package com.amplifyframework.api.aws;

import com.amplifyframework.core.model.Model;
import com.amplifyframework.core.model.ModelPage;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class ModelPageDeserializer<M extends Model> implements JsonDeserializer<ModelPage<? extends M>> {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(id5 id5Var) {
            this();
        }

        public final void register(GsonBuilder gsonBuilder) {
            sq8.m48649h(gsonBuilder, "builder");
            gsonBuilder.registerTypeHierarchyAdapter(ModelPage.class, new ModelPageDeserializer());
        }
    }

    public static final void register(GsonBuilder gsonBuilder) {
        Companion.register(gsonBuilder);
    }

    @Override // com.google.gson.JsonDeserializer
    public ModelPage<M> deserialize(JsonElement jsonElement, Type type2, JsonDeserializationContext jsonDeserializationContext) {
        sq8.m48649h(jsonElement, "json");
        sq8.m48649h(type2, "typeOfT");
        sq8.m48649h(jsonDeserializationContext, "context");
        return new ApiModelPage(LazyTypeDeserializersKt.deserializeItems(jsonElement, type2, jsonDeserializationContext), LazyTypeDeserializersKt.deserializeNextToken(jsonElement));
    }
}
