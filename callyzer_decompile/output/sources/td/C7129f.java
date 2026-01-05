package td;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: td.f */
/* loaded from: classes.dex */
public final class C7129f {

    /* renamed from: a */
    public final int f34349a;

    /* renamed from: b */
    public final Object f34350b;

    public C7129f(int i10, Object obj) {
        this.f34349a = i10;
        this.f34350b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7129f)) {
            return false;
        }
        C7129f c7129f = (C7129f) obj;
        return this.f34349a == c7129f.f34349a && AbstractC4154l.m8918a(this.f34350b, c7129f.f34350b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f34349a) * 31;
        Object obj = this.f34350b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ParseResult(pos=" + this.f34349a + ", result=" + this.f34350b + ')';
    }
}
