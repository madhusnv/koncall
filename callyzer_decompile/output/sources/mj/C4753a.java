package mj;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mj.a */
/* loaded from: classes.dex */
public final class C4753a implements InterfaceC4757e {

    /* renamed from: a */
    public final int f23747a;

    /* renamed from: b */
    public final EnumC4756d f23748b;

    public C4753a(int i10, EnumC4756d enumC4756d) {
        this.f23747a = i10;
        this.f23748b = enumC4756d;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return InterfaceC4757e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4757e)) {
            return false;
        }
        C4753a c4753a = (C4753a) ((InterfaceC4757e) obj);
        return this.f23747a == c4753a.f23747a && this.f23748b.equals(c4753a.f23748b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f23747a) + (this.f23748b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f23747a + "intEncoding=" + this.f23748b + ')';
    }
}
