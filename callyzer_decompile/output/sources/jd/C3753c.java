package jd;

import i0.m0;
import id.C3241k;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: jd.c */
/* loaded from: classes.dex */
public final class C3753c extends AbstractC3754d {

    /* renamed from: a */
    public final C3241k f19616a;

    /* renamed from: b */
    public final C3753c f19617b;

    /* renamed from: c */
    public final boolean f19618c;

    /* renamed from: d */
    public final int f19619d;

    public C3753c(C3241k c3241k, C3753c c3753c, boolean z6) {
        this.f19616a = c3241k;
        this.f19617b = c3753c;
        this.f19618c = z6;
        this.f19619d = (c3753c != null ? c3753c.f19619d : 0) + 1;
    }

    /* renamed from: c */
    public static C3753c m8279c(C3753c c3753c) {
        return new C3753c(c3753c.f19616a, c3753c.f19617b, true);
    }

    @Override // pg.i8
    /* renamed from: b */
    public final int mo8278b() {
        return this.f19619d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3753c)) {
            return false;
        }
        C3753c c3753c = (C3753c) obj;
        return this.f19616a.equals(c3753c.f19616a) && AbstractC4154l.m8918a(this.f19617b, c3753c.f19617b) && this.f19618c == c3753c.f19618c;
    }

    public final int hashCode() {
        int iHashCode = this.f19616a.hashCode() * 31;
        C3753c c3753c = this.f19617b;
        return Boolean.hashCode(this.f19618c) + ((iHashCode + (c3753c == null ? 0 : c3753c.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OpenTag(name=");
        sb2.append(this.f19616a);
        sb2.append(", parent=");
        sb2.append(this.f19617b);
        sb2.append(", seenChildren=");
        return m0.m7382o(sb2, this.f19618c, ')');
    }
}
