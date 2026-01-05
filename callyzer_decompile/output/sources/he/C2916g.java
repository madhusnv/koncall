package he;

import kotlin.jvm.internal.AbstractC4154l;
import pg.AbstractC5935p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: he.g */
/* loaded from: classes.dex */
public final class C2916g {

    /* renamed from: c */
    public static final C2916g f15947c;

    /* renamed from: a */
    public final AbstractC5935p f15948a;

    /* renamed from: b */
    public final AbstractC5935p f15949b;

    static {
        C2911b c2911b = C2911b.f15945b;
        f15947c = new C2916g(c2911b, c2911b);
    }

    public C2916g(AbstractC5935p abstractC5935p, AbstractC5935p abstractC5935p2) {
        this.f15948a = abstractC5935p;
        this.f15949b = abstractC5935p2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2916g)) {
            return false;
        }
        C2916g c2916g = (C2916g) obj;
        return AbstractC4154l.m8918a(this.f15948a, c2916g.f15948a) && AbstractC4154l.m8918a(this.f15949b, c2916g.f15949b);
    }

    public final int hashCode() {
        return this.f15949b.hashCode() + (this.f15948a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f15948a + ", height=" + this.f15949b + ')';
    }
}
