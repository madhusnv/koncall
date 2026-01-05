package pg;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pg.a */
/* loaded from: classes.dex */
public final class C5920a implements InterfaceC5923d {

    /* renamed from: a */
    public final int f28784a;

    /* renamed from: b */
    public final EnumC5922c f28785b;

    public C5920a(int i10, EnumC5922c enumC5922c) {
        this.f28784a = i10;
        this.f28785b = enumC5922c;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC5923d.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC5923d)) {
            return false;
        }
        C5920a c5920a = (C5920a) ((InterfaceC5923d) obj);
        return this.f28784a == c5920a.f28784a && this.f28785b.equals(c5920a.f28785b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f28784a ^ 14552422) + (this.f28785b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f28784a + "intEncoding=" + this.f28785b + ')';
    }
}
