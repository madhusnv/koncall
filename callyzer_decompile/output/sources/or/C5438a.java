package or;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: or.a */
/* loaded from: classes3.dex */
public final class C5438a {

    /* renamed from: a */
    public final AbstractC5453p f27346a;

    /* renamed from: b */
    public final boolean f27347b;

    public C5438a(AbstractC5453p componentType, boolean z6) {
        AbstractC4154l.m8923f(componentType, "componentType");
        this.f27346a = componentType;
        this.f27347b = z6;
    }

    /* renamed from: a */
    public static C5438a m11146a(AbstractC5453p componentType, boolean z6) {
        AbstractC4154l.m8923f(componentType, "componentType");
        return new C5438a(componentType, z6);
    }

    /* renamed from: b */
    public static /* synthetic */ C5438a m11147b(C5438a c5438a, AbstractC5453p abstractC5453p, boolean z6, int i10) {
        if ((i10 & 1) != 0) {
            abstractC5453p = c5438a.f27346a;
        }
        if ((i10 & 2) != 0) {
            z6 = c5438a.f27347b;
        }
        c5438a.getClass();
        return m11146a(abstractC5453p, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5438a)) {
            return false;
        }
        C5438a c5438a = (C5438a) obj;
        return AbstractC4154l.m8918a(this.f27346a, c5438a.f27346a) && this.f27347b == c5438a.f27347b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f27347b) + (this.f27346a.hashCode() * 31);
    }

    public final String toString() {
        return "DynamicLeadField(componentType=" + this.f27346a + ", isError=" + this.f27347b + ")";
    }
}
