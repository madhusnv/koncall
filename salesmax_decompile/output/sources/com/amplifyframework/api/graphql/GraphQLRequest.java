package com.amplifyframework.api.graphql;

import android.text.TextUtils;
import com.amplifyframework.core.model.ModelIdentifier;
import com.amplifyframework.util.Wrap;
import com.google.android.gms.actions.SearchIntents;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Map;
import p001o.s6c;

/* loaded from: classes5.dex */
public abstract class GraphQLRequest<R> {
    private final Type responseType;
    private final VariablesSerializer variablesSerializer;

    public interface VariablesSerializer {
        String serialize(Map<String, Object> map);
    }

    public GraphQLRequest(Type type2, VariablesSerializer variablesSerializer) {
        this.responseType = type2;
        this.variablesSerializer = variablesSerializer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GraphQLRequest graphQLRequest = (GraphQLRequest) obj;
        return s6c.m47909a(this.responseType, graphQLRequest.responseType) && s6c.m47909a(this.variablesSerializer, graphQLRequest.variablesSerializer);
    }

    public String getContent() {
        String strReplace = getQuery().replace(ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "\\\"").replace("\n", "\\n");
        String strSerialize = getVariables().isEmpty() ? null : this.variablesSerializer.serialize(getVariables());
        return Wrap.inBraces(TextUtils.join(", ", Arrays.asList(Wrap.inDoubleQuotes(SearchIntents.EXTRA_QUERY) + ": " + Wrap.inDoubleQuotes(strReplace), Wrap.inDoubleQuotes("variables") + ": " + strSerialize)));
    }

    public abstract String getQuery();

    public Type getResponseType() {
        return this.responseType;
    }

    public abstract Map<String, Object> getVariables();

    public VariablesSerializer getVariablesSerializer() {
        return this.variablesSerializer;
    }

    public int hashCode() {
        int iHashCode = this.responseType.hashCode() * 31;
        VariablesSerializer variablesSerializer = this.variablesSerializer;
        return iHashCode + (variablesSerializer != null ? variablesSerializer.hashCode() : 0);
    }

    public String toString() {
        return "GraphQLRequest{, responseType='" + this.responseType + "', variablesSerializer='" + this.variablesSerializer + "'}";
    }
}
