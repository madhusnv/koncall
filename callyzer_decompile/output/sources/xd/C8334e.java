package xd;

import ge.C2573e;
import i3.AbstractC3166c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.e */
/* loaded from: classes.dex */
public final class C8334e extends AbstractC8337h {

    /* renamed from: a */
    public final AbstractC3166c f39928a;

    /* renamed from: b */
    public final C2573e f39929b;

    public C8334e(AbstractC3166c abstractC3166c, C2573e c2573e) {
        this.f39928a = abstractC3166c;
        this.f39929b = c2573e;
    }

    @Override // xd.AbstractC8337h
    /* renamed from: a */
    public final AbstractC3166c mo15519a() {
        return this.f39928a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8334e)) {
            return false;
        }
        C8334e c8334e = (C8334e) obj;
        return AbstractC4154l.m8918a(this.f39928a, c8334e.f39928a) && AbstractC4154l.m8918a(this.f39929b, c8334e.f39929b);
    }

    public final int hashCode() {
        AbstractC3166c abstractC3166c = this.f39928a;
        return this.f39929b.hashCode() + ((abstractC3166c == null ? 0 : abstractC3166c.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.f39928a + ", result=" + this.f39929b + ')';
    }
}
