package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: androidx.datastore.preferences.protobuf.v */
/* loaded from: classes.dex */
public final class C0331v implements o0 {

    /* renamed from: b */
    public static final C0331v f2420b = new C0331v(0);

    /* renamed from: a */
    public final /* synthetic */ int f2421a;

    public /* synthetic */ C0331v(int i10) {
        this.f2421a = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    /* renamed from: a */
    public final z0 mo904a(Class cls) {
        switch (this.f2421a) {
            case 0:
                if (!AbstractC0335z.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (z0) AbstractC0335z.m1076d(cls.asSubclass(AbstractC0335z.class)).mo1080c(EnumC0334y.BUILD_MESSAGE_INFO);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o0
    /* renamed from: b */
    public final boolean mo905b(Class cls) {
        switch (this.f2421a) {
            case 0:
                return AbstractC0335z.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
