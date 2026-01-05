package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: com.google.crypto.tink.shaded.protobuf.w */
/* loaded from: classes.dex */
public final class C1396w implements s0 {

    /* renamed from: b */
    public static final C1396w f7125b = new C1396w(0);

    /* renamed from: a */
    public final /* synthetic */ int f7126a;

    public /* synthetic */ C1396w(int i10) {
        this.f7126a = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: a */
    public final d1 mo4353a(Class cls) {
        switch (this.f7126a) {
            case 0:
                if (!a0.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (d1) a0.m4159g(cls.asSubclass(a0.class)).mo4165f(EnumC1399z.BUILD_MESSAGE_INFO);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: b */
    public final boolean mo4354b(Class cls) {
        switch (this.f7126a) {
            case 0:
                return a0.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
