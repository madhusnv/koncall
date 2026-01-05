package ur;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: a */
    public final String f36235a;

    /* renamed from: b */
    public final int f36236b;

    public k0(String name, int i10) {
        AbstractC4154l.m8923f(name, "name");
        this.f36235a = name;
        this.f36236b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return AbstractC4154l.m8918a(this.f36235a, k0Var.f36235a) && this.f36236b == k0Var.f36236b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36236b) + (this.f36235a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterTextAndIcon(name=" + this.f36235a + ", icon=" + this.f36236b + ")";
    }
}
