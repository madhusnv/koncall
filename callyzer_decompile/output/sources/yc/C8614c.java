package yc;

import ex.InterfaceC2142f;
import wc.InterfaceC7971e;
import ww.AbstractC8193c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yc.c */
/* loaded from: classes.dex */
public final class C8614c implements InterfaceC8613b {

    /* renamed from: a */
    public final Object f41878a;

    public C8614c(InterfaceC2142f interfaceC2142f) {
        this.f41878a = interfaceC2142f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ex.f, java.lang.Object] */
    @Override // yc.InterfaceC8613b
    /* renamed from: a */
    public final Object mo12192a(Object obj, InterfaceC7971e interfaceC7971e, AbstractC8193c abstractC8193c) {
        return this.f41878a.invoke(obj, interfaceC7971e, abstractC8193c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8614c) && this.f41878a.equals(((C8614c) obj).f41878a);
    }

    public final int hashCode() {
        return this.f41878a.hashCode();
    }

    public final String toString() {
        return "MiddlewareLambda(fn=" + this.f41878a + ')';
    }
}
