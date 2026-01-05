package com.amplifyframework.api.aws;

import com.amplifyframework.api.graphql.GraphQLRequest;
import com.google.gson.Gson;
import java.util.Map;

/* loaded from: classes5.dex */
public final class GsonVariablesSerializer implements GraphQLRequest.VariablesSerializer {
    private final Gson gson;

    public GsonVariablesSerializer() {
        this(com.amplifyframework.util.GsonFactory.instance());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && GsonVariablesSerializer.class == obj.getClass();
    }

    public int hashCode() {
        return 0;
    }

    @Override // com.amplifyframework.api.graphql.GraphQLRequest.VariablesSerializer
    public String serialize(Map<String, Object> map) {
        return this.gson.toJson(map);
    }

    public GsonVariablesSerializer(Gson gson) {
        this.gson = gson;
    }
}
