package com.amplifyframework.api.graphql;

import p001o.s6c;

/* loaded from: classes5.dex */
public final class GraphQLPathSegment {
    private final Object value;

    public GraphQLPathSegment(int i) {
        this.value = Integer.valueOf(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GraphQLPathSegment.class == obj.getClass()) {
            GraphQLPathSegment graphQLPathSegment = (GraphQLPathSegment) obj;
            if (isString() && graphQLPathSegment.isString()) {
                return s6c.m47909a(getAsString(), graphQLPathSegment.getAsString());
            }
            if (isInteger() && graphQLPathSegment.isInteger()) {
                return s6c.m47909a(Integer.valueOf(getAsInt()), Integer.valueOf(graphQLPathSegment.getAsInt()));
            }
        }
        return false;
    }

    public int getAsInt() {
        if (isInteger()) {
            return ((Integer) this.value).intValue();
        }
        throw new ClassCastException("Not an int: " + this.value.getClass().getSimpleName());
    }

    public String getAsString() {
        if (isString()) {
            return (String) this.value;
        }
        throw new ClassCastException("Not a String: " + this.value.getClass().getSimpleName());
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
