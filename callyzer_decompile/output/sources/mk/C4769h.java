package mk;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mk.h */
/* loaded from: classes.dex */
public final class C4769h implements WildcardType, Serializable {

    /* renamed from: a */
    public final Type f23785a;

    /* renamed from: b */
    public final Type f23786b;

    public C4769h(Type[] typeArr, Type[] typeArr2) {
        AbstractC4770i.m9689b(typeArr2.length <= 1);
        AbstractC4770i.m9689b(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            AbstractC4770i.m9690c(typeArr[0]);
            this.f23786b = null;
            this.f23785a = AbstractC4770i.m9688a(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        AbstractC4770i.m9690c(typeArr2[0]);
        AbstractC4770i.m9689b(typeArr[0] == Object.class);
        this.f23786b = AbstractC4770i.m9688a(typeArr2[0]);
        this.f23785a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && AbstractC4770i.m9692e(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f23786b;
        return type != null ? new Type[]{type} : AbstractC4770i.f23787a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f23785a};
    }

    public final int hashCode() {
        Type type = this.f23786b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f23785a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f23786b;
        if (type != null) {
            return "? super " + AbstractC4770i.m9699l(type);
        }
        Type type2 = this.f23785a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + AbstractC4770i.m9699l(type2);
    }
}
