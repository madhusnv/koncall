package mk;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.g */
/* loaded from: classes.dex */
public final class C4768g implements ParameterizedType, Serializable {

    /* renamed from: a */
    public final Type f23782a;

    /* renamed from: b */
    public final Type f23783b;

    /* renamed from: c */
    public final Type[] f23784c;

    public C4768g(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.f23782a = type == null ? null : AbstractC4770i.m9688a(type);
        this.f23783b = AbstractC4770i.m9688a(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f23784c = typeArr2;
        int length = typeArr2.length;
        for (int i10 = 0; i10 < length; i10++) {
            Objects.requireNonNull(this.f23784c[i10]);
            AbstractC4770i.m9690c(this.f23784c[i10]);
            Type[] typeArr3 = this.f23784c;
            typeArr3[i10] = AbstractC4770i.m9688a(typeArr3[i10]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && AbstractC4770i.m9692e(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f23784c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f23782a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f23783b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f23784c) ^ this.f23783b.hashCode();
        Type type = this.f23782a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f23784c;
        int length = typeArr.length;
        Type type = this.f23783b;
        if (length == 0) {
            return AbstractC4770i.m9699l(type);
        }
        StringBuilder sb2 = new StringBuilder((length + 1) * 30);
        sb2.append(AbstractC4770i.m9699l(type));
        sb2.append("<");
        sb2.append(AbstractC4770i.m9699l(typeArr[0]));
        for (int i10 = 1; i10 < length; i10++) {
            sb2.append(", ");
            sb2.append(AbstractC4770i.m9699l(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
