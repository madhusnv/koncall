package sq;

import kotlin.jvm.internal.AbstractC4154l;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class g3 {

    /* renamed from: a */
    public final String f32921a;

    /* renamed from: b */
    public final C6734c f32922b;

    public g3(String name, C6734c c6734c) {
        AbstractC4154l.m8923f(name, "name");
        this.f32921a = name;
        this.f32922b = c6734c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3)) {
            return false;
        }
        g3 g3Var = (g3) obj;
        return AbstractC4154l.m8918a(this.f32921a, g3Var.f32921a) && this.f32922b.equals(g3Var.f32922b);
    }

    public final int hashCode() {
        return this.f32922b.hashCode() + (this.f32921a.hashCode() * 31);
    }

    public final String toString() {
        return "TabItem(name=" + this.f32921a + ", screenCompose=" + this.f32922b + ")";
    }
}
