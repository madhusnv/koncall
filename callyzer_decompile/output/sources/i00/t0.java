package i00;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class t0 implements GenericArrayType {

    /* renamed from: a */
    public final Type f16748a;

    public t0(Type type) {
        this.f16748a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && w0.m7466e(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f16748a;
    }

    public final int hashCode() {
        return this.f16748a.hashCode();
    }

    public final String toString() {
        return w0.m7479r(this.f16748a) + "[]";
    }
}
