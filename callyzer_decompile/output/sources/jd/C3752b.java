package jd;

import id.C3241k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jd.b */
/* loaded from: classes.dex */
public final class C3752b extends AbstractC3754d {

    /* renamed from: a */
    public final C3241k f19613a;

    /* renamed from: b */
    public final C3753c f19614b;

    /* renamed from: c */
    public final int f19615c;

    public C3752b(C3241k c3241k, C3753c c3753c) {
        this.f19613a = c3241k;
        this.f19614b = c3753c;
        this.f19615c = (c3753c != null ? c3753c.f19619d : 0) + 1;
    }

    @Override // pg.i8
    /* renamed from: b */
    public final int mo8278b() {
        return this.f19615c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3752b)) {
            return false;
        }
        C3752b c3752b = (C3752b) obj;
        return AbstractC4154l.m8918a(this.f19613a, c3752b.f19613a) && AbstractC4154l.m8918a(this.f19614b, c3752b.f19614b);
    }

    public final int hashCode() {
        int iHashCode = this.f19613a.hashCode() * 31;
        C3753c c3753c = this.f19614b;
        return iHashCode + (c3753c == null ? 0 : c3753c.hashCode());
    }

    public final String toString() {
        return "EmptyTag(name=" + this.f19613a + ", parent=" + this.f19614b + ')';
    }
}
