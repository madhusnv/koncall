package sd;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: sd.c */
/* loaded from: classes.dex */
public final class C6809c implements InterfaceC6811e {
    @Override // sd.InterfaceC6811e
    /* renamed from: a */
    public final C6808b mo12984a(String decoded) {
        AbstractC4154l.m8923f(decoded, "decoded");
        AbstractC4154l.m8923f(decoded, "decoded");
        return new C6808b(decoded, decoded, this);
    }

    @Override // sd.InterfaceC6811e
    /* renamed from: b */
    public final C6808b mo12985b(String encoded) {
        AbstractC4154l.m8923f(encoded, "encoded");
        AbstractC4154l.m8923f(encoded, "encoded");
        return new C6808b(encoded, encoded, this);
    }

    @Override // sd.InterfaceC6811e
    public final String getName() {
        return "(no encoding)";
    }
}
