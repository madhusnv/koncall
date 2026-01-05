package og;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class k0 implements n0 {

    /* renamed from: a */
    public final int f26570a;

    /* renamed from: b */
    public final m0 f26571b;

    public k0(int i10, m0 m0Var) {
        this.f26570a = i10;
        this.f26571b = m0Var;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return n0.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        k0 k0Var = (k0) ((n0) obj);
        return this.f26570a == k0Var.f26570a && this.f26571b.equals(k0Var.f26571b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f26570a ^ 14552422) + (this.f26571b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f26570a + "intEncoding=" + this.f26571b + ')';
    }
}
