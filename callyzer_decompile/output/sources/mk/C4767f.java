package mk;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.f */
/* loaded from: classes.dex */
public final class C4767f implements GenericArrayType, Serializable {

    /* renamed from: a */
    public final Type f23781a;

    public C4767f(Type type) {
        Objects.requireNonNull(type);
        this.f23781a = AbstractC4770i.m9688a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && AbstractC4770i.m9692e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f23781a;
    }

    public final int hashCode() {
        return this.f23781a.hashCode();
    }

    public final String toString() {
        return AbstractC4770i.m9699l(this.f23781a) + "[]";
    }
}
