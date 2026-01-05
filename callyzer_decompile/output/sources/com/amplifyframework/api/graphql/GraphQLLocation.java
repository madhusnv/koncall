package com.amplifyframework.api.graphql;

import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class GraphQLLocation {
    private int column;
    private int line;

    public GraphQLLocation(int i10, int i11) {
        this.line = i10;
        this.column = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && GraphQLLocation.class == obj.getClass()) {
            GraphQLLocation graphQLLocation = (GraphQLLocation) obj;
            if (this.line == graphQLLocation.line && this.column == graphQLLocation.column) {
                return true;
            }
        }
        return false;
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GraphQLLocation{line='");
        sb2.append(this.line);
        sb2.append("', column='");
        return AbstractC5601a.m11233d(this.column, "'}", sb2);
    }
}
