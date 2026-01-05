package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class h0 implements o0 {

    /* renamed from: a */
    public o0[] f2337a;

    @Override // androidx.datastore.preferences.protobuf.o0
    /* renamed from: a */
    public final z0 mo904a(Class cls) {
        for (o0 o0Var : this.f2337a) {
            if (o0Var.mo905b(cls)) {
                return o0Var.mo904a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    /* renamed from: b */
    public final boolean mo905b(Class cls) {
        for (o0 o0Var : this.f2337a) {
            if (o0Var.mo905b(cls)) {
                return true;
            }
        }
        return false;
    }
}
