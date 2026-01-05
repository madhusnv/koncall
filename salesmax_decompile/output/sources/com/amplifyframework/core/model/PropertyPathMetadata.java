package com.amplifyframework.core.model;

import p001o.id5;
import p001o.sq8;

/* loaded from: classes5.dex */
public final class PropertyPathMetadata {
    private final boolean isCollection;
    private final String name;
    private final PropertyPath parent;

    public PropertyPathMetadata(String str, boolean z, PropertyPath propertyPath) {
        sq8.m48649h(str, "name");
        this.name = str;
        this.isCollection = z;
        this.parent = propertyPath;
    }

    public static /* synthetic */ PropertyPathMetadata copy$default(PropertyPathMetadata propertyPathMetadata, String str, boolean z, PropertyPath propertyPath, int i, Object obj) {
        if ((i & 1) != 0) {
            str = propertyPathMetadata.name;
        }
        if ((i & 2) != 0) {
            z = propertyPathMetadata.isCollection;
        }
        if ((i & 4) != 0) {
            propertyPath = propertyPathMetadata.parent;
        }
        return propertyPathMetadata.copy(str, z, propertyPath);
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component2() {
        return this.isCollection;
    }

    public final PropertyPath component3() {
        return this.parent;
    }

    public final PropertyPathMetadata copy(String str, boolean z, PropertyPath propertyPath) {
        sq8.m48649h(str, "name");
        return new PropertyPathMetadata(str, z, propertyPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyPathMetadata)) {
            return false;
        }
        PropertyPathMetadata propertyPathMetadata = (PropertyPathMetadata) obj;
        return sq8.m48644c(this.name, propertyPathMetadata.name) && this.isCollection == propertyPathMetadata.isCollection && sq8.m48644c(this.parent, propertyPathMetadata.parent);
    }

    public final String getName() {
        return this.name;
    }

    public final PropertyPath getParent() {
        return this.parent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        boolean z = this.isCollection;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        PropertyPath propertyPath = this.parent;
        return i2 + (propertyPath == null ? 0 : propertyPath.hashCode());
    }

    public final boolean isCollection() {
        return this.isCollection;
    }

    public String toString() {
        return "PropertyPathMetadata(name=" + this.name + ", isCollection=" + this.isCollection + ", parent=" + this.parent + ")";
    }

    public /* synthetic */ PropertyPathMetadata(String str, boolean z, PropertyPath propertyPath, int i, id5 id5Var) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : propertyPath);
    }
}
