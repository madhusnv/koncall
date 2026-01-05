package i00;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class v0 implements WildcardType {

    /* renamed from: a */
    public final Type f16757a;

    /* renamed from: b */
    public final Type f16758b;

    public v0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            w0.m7465d(typeArr[0]);
            this.f16758b = null;
            this.f16757a = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        w0.m7465d(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.f16758b = typeArr2[0];
        this.f16757a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && w0.m7466e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f16758b;
        return type != null ? new Type[]{type} : w0.f16761a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f16757a};
    }

    public final int hashCode() {
        Type type = this.f16758b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f16757a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f16758b;
        if (type != null) {
            return "? super " + w0.m7479r(type);
        }
        Type type2 = this.f16757a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + w0.m7479r(type2);
    }
}
