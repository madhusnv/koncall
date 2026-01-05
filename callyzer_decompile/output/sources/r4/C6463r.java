package r4;

import og.af;
import s4.C6759o;
import s4.C6760p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.r */
/* loaded from: classes.dex */
public final class C6463r {

    /* renamed from: c */
    public static final C6463r f31127c = new C6463r(af.m10534c(0), af.m10534c(0));

    /* renamed from: a */
    public final long f31128a;

    /* renamed from: b */
    public final long f31129b;

    public C6463r(long j6, long j10) {
        this.f31128a = j6;
        this.f31129b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6463r)) {
            return false;
        }
        C6463r c6463r = (C6463r) obj;
        return C6759o.m12952a(this.f31128a, c6463r.f31128a) && C6759o.m12952a(this.f31129b, c6463r.f31129b);
    }

    public final int hashCode() {
        C6760p[] c6760pArr = C6759o.f32212b;
        return Long.hashCode(this.f31129b) + (Long.hashCode(this.f31128a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) C6759o.m12955d(this.f31128a)) + ", restLine=" + ((Object) C6759o.m12955d(this.f31129b)) + ')';
    }
}
