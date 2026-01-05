package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class o0 implements s0 {

    /* renamed from: a */
    public s0[] f7082a;

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: a */
    public final d1 mo4353a(Class cls) {
        for (s0 s0Var : this.f7082a) {
            if (s0Var.mo4354b(cls)) {
                return s0Var.mo4353a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    /* renamed from: b */
    public final boolean mo4354b(Class cls) {
        for (s0 s0Var : this.f7082a) {
            if (s0Var.mo4354b(cls)) {
                return true;
            }
        }
        return false;
    }
}
