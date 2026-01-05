package i00;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class u0 implements ParameterizedType {

    /* renamed from: a */
    public final Type f16751a;

    /* renamed from: b */
    public final Type f16752b;

    /* renamed from: c */
    public final Type[] f16753c;

    public u0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            w0.m7465d(type3);
        }
        this.f16751a = type;
        this.f16752b = type2;
        this.f16753c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && w0.m7466e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f16753c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f16751a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f16752b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f16753c) ^ this.f16752b.hashCode();
        Type type = this.f16751a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f16753c;
        int length = typeArr.length;
        Type type = this.f16752b;
        if (length == 0) {
            return w0.m7479r(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(w0.m7479r(type));
        sb2.append("<");
        sb2.append(w0.m7479r(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(w0.m7479r(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
