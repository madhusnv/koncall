package h1;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a */
    public final AbstractC2785p f15417a;

    /* renamed from: b */
    public final InterfaceC2792w f15418b;

    public f2(AbstractC2785p abstractC2785p, InterfaceC2792w interfaceC2792w) {
        this.f15417a = abstractC2785p;
        this.f15418b = interfaceC2792w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return AbstractC4154l.m8918a(this.f15417a, f2Var.f15417a) && AbstractC4154l.m8918a(this.f15418b, f2Var.f15418b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f15418b.hashCode() + (this.f15417a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f15417a + ", easing=" + this.f15418b + ", arcMode=ArcMode(value=0))";
    }
}
