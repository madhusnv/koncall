package g0;

import c0.b2;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g0.c */
/* loaded from: classes.dex */
public final class C2413c implements InterfaceC2415e {

    /* renamed from: a */
    public final b2 f10904a;

    public C2413c(b2 b2Var) {
        this.f10904a = b2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2413c) && AbstractC4154l.m8918a(this.f10904a, ((C2413c) obj).f10904a);
    }

    public final int hashCode() {
        return this.f10904a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.f10904a + ')';
    }
}
