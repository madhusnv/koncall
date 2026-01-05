package com.amplifyframework.api.aws;

import com.amplifyframework.storage.s3.transfer.TransferTable;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class GraphQLRequestVariable {
    private final String key;

    /* renamed from: type, reason: collision with root package name */
    private final String f58094type;
    private final Object value;

    public GraphQLRequestVariable(String str, Object obj, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        sq8.m48649h(str2, "type");
        this.key = str;
        this.value = obj;
        this.f58094type = str2;
    }

    public static /* synthetic */ GraphQLRequestVariable copy$default(GraphQLRequestVariable graphQLRequestVariable, String str, Object obj, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = graphQLRequestVariable.key;
        }
        if ((i & 2) != 0) {
            obj = graphQLRequestVariable.value;
        }
        if ((i & 4) != 0) {
            str2 = graphQLRequestVariable.f58094type;
        }
        return graphQLRequestVariable.copy(str, obj, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final Object component2() {
        return this.value;
    }

    public final String component3() {
        return this.f58094type;
    }

    public final GraphQLRequestVariable copy(String str, Object obj, String str2) {
        sq8.m48649h(str, TransferTable.COLUMN_KEY);
        sq8.m48649h(obj, "value");
        sq8.m48649h(str2, "type");
        return new GraphQLRequestVariable(str, obj, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQLRequestVariable)) {
            return false;
        }
        GraphQLRequestVariable graphQLRequestVariable = (GraphQLRequestVariable) obj;
        return sq8.m48644c(this.key, graphQLRequestVariable.key) && sq8.m48644c(this.value, graphQLRequestVariable.value) && sq8.m48644c(this.f58094type, graphQLRequestVariable.f58094type);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getType() {
        return this.f58094type;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.key.hashCode() * 31) + this.value.hashCode()) * 31) + this.f58094type.hashCode();
    }

    public String toString() {
        return "GraphQLRequestVariable(key=" + this.key + ", value=" + this.value + ", type=" + this.f58094type + ")";
    }
}
