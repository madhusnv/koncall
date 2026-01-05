package xd;

import ge.C2583o;
import i3.AbstractC3166c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: xd.g */
/* loaded from: classes.dex */
public final class C8336g extends AbstractC8337h {

    /* renamed from: a */
    public final AbstractC3166c f39931a;

    /* renamed from: b */
    public final C2583o f39932b;

    public C8336g(AbstractC3166c abstractC3166c, C2583o c2583o) {
        this.f39931a = abstractC3166c;
        this.f39932b = c2583o;
    }

    @Override // xd.AbstractC8337h
    /* renamed from: a */
    public final AbstractC3166c mo15519a() {
        return this.f39931a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8336g)) {
            return false;
        }
        C8336g c8336g = (C8336g) obj;
        return AbstractC4154l.m8918a(this.f39931a, c8336g.f39931a) && AbstractC4154l.m8918a(this.f39932b, c8336g.f39932b);
    }

    public final int hashCode() {
        return this.f39932b.hashCode() + (this.f39931a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f39931a + ", result=" + this.f39932b + ')';
    }
}
