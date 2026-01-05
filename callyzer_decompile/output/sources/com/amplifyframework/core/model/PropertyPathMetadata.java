package com.amplifyframework.core.model;

import com.sun.mail.util.AbstractC1452a;
import kotlin.jvm.internal.AbstractC4148f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PropertyPathMetadata {
    private final boolean isCollection;
    private final String name;
    private final PropertyPath parent;

    public PropertyPathMetadata(String name, boolean z6, PropertyPath propertyPath) {
        AbstractC4154l.m8923f(name, "name");
        this.name = name;
        this.isCollection = z6;
        this.parent = propertyPath;
    }

    public static /* synthetic */ PropertyPathMetadata copy$core_release$default(PropertyPathMetadata propertyPathMetadata, String str, boolean z6, PropertyPath propertyPath, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = propertyPathMetadata.name;
        }
        if ((i10 & 2) != 0) {
            z6 = propertyPathMetadata.isCollection;
        }
        if ((i10 & 4) != 0) {
            propertyPath = propertyPathMetadata.parent;
        }
        return propertyPathMetadata.copy$core_release(str, z6, propertyPath);
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

    public final PropertyPathMetadata copy$core_release(String name, boolean z6, PropertyPath propertyPath) {
        AbstractC4154l.m8923f(name, "name");
        return new PropertyPathMetadata(name, z6, propertyPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PropertyPathMetadata)) {
            return false;
        }
        PropertyPathMetadata propertyPathMetadata = (PropertyPathMetadata) obj;
        return AbstractC4154l.m8918a(this.name, propertyPathMetadata.name) && this.isCollection == propertyPathMetadata.isCollection && AbstractC4154l.m8918a(this.parent, propertyPathMetadata.parent);
    }

    public final String getName() {
        return this.name;
    }

    public final PropertyPath getParent() {
        return this.parent;
    }

    public int hashCode() {
        int iM4558e = AbstractC1452a.m4558e(this.name.hashCode() * 31, 31, this.isCollection);
        PropertyPath propertyPath = this.parent;
        return iM4558e + (propertyPath == null ? 0 : propertyPath.hashCode());
    }

    public final boolean isCollection() {
        return this.isCollection;
    }

    public String toString() {
        return "PropertyPathMetadata(name=" + this.name + ", isCollection=" + this.isCollection + ", parent=" + this.parent + ")";
    }

    public /* synthetic */ PropertyPathMetadata(String str, boolean z6, PropertyPath propertyPath, int i10, AbstractC4148f abstractC4148f) {
        this(str, (i10 & 2) != 0 ? false : z6, (i10 & 4) != 0 ? null : propertyPath);
    }
}
