package com.amplifyframework.api.graphql;

import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GraphQLPathSegment {
    private final Object value;

    public GraphQLPathSegment(int i10) {
        this.value = Integer.valueOf(i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GraphQLPathSegment.class == obj.getClass()) {
            GraphQLPathSegment graphQLPathSegment = (GraphQLPathSegment) obj;
            if (isString() && graphQLPathSegment.isString()) {
                return Objects.equals(getAsString(), graphQLPathSegment.getAsString());
            }
            if (isInteger() && graphQLPathSegment.isInteger()) {
                return Integer.valueOf(getAsInt()).equals(Integer.valueOf(graphQLPathSegment.getAsInt()));
            }
        }
        return false;
    }

    public int getAsInt() {
        if (isInteger()) {
            return ((Integer) this.value).intValue();
        }
        throw new ClassCastException("Not an int: ".concat(this.value.getClass().getSimpleName()));
    }

    public String getAsString() {
        if (isString()) {
            return (String) this.value;
        }
        throw new ClassCastException("Not a String: ".concat(this.value.getClass().getSimpleName()));
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public boolean isInteger() {
        return this.value instanceof Integer;
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public String toString() {
        return "GraphQLPathSegment{value='" + this.value + "'}";
    }

    public GraphQLPathSegment(String str) {
        this.value = str;
    }
}
