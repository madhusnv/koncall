package yr;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class j0 extends k0 {

    /* renamed from: a */
    public final String f42369a;

    /* renamed from: b */
    public final boolean f42370b;

    public j0(String tag, boolean z6) {
        AbstractC4154l.m8923f(tag, "tag");
        this.f42369a = tag;
        this.f42370b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return AbstractC4154l.m8918a(this.f42369a, j0Var.f42369a) && this.f42370b == j0Var.f42370b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42370b) + (this.f42369a.hashCode() * 31);
    }

    public final String toString() {
        return "OnToggleCheck(tag=" + this.f42369a + ", select=" + this.f42370b + ")";
    }
}
