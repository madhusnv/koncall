package com.amplifyframework.api.aws;

/* loaded from: classes5.dex */
public enum EndpointType {
    GRAPHQL("GraphQL"),
    REST("REST");

    private final String name;

    EndpointType(String str) {
        this.name = str;
    }

    public static EndpointType from(String str) {
        for (EndpointType endpointType : values()) {
            if (endpointType.name.equals(str)) {
                return endpointType;
            }
        }
        throw new IllegalArgumentException("No such endpoint type: " + str);
    }
}
