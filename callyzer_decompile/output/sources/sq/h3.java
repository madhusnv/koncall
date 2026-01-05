package sq;

import ex.InterfaceC2142f;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class h3 {

    /* renamed from: a */
    public final String f32940a;

    /* renamed from: b */
    public final InterfaceC2142f f32941b;

    public h3(String str, InterfaceC2142f interfaceC2142f) {
        this.f32940a = str;
        this.f32941b = interfaceC2142f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) obj;
        return AbstractC4154l.m8918a(this.f32940a, h3Var.f32940a) && AbstractC4154l.m8918a(this.f32941b, h3Var.f32941b);
    }

    public final int hashCode() {
        return this.f32941b.hashCode() + (this.f32940a.hashCode() * 31);
    }

    public final String toString() {
        return "TabItemWithNav(name=" + this.f32940a + ", screenCompose=" + this.f32941b + ")";
    }
}
