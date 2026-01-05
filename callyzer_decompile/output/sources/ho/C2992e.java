package ho;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ho.e */
/* loaded from: classes3.dex */
public final class C2992e {

    /* renamed from: a */
    public final boolean f16133a;

    /* renamed from: b */
    public final Integer f16134b;

    /* renamed from: c */
    public final Object f16135c;

    public /* synthetic */ C2992e(boolean z6, Integer num, int i10) {
        this(z6, (i10 & 2) != 0 ? null : num, (Object) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2992e)) {
            return false;
        }
        C2992e c2992e = (C2992e) obj;
        return this.f16133a == c2992e.f16133a && AbstractC4154l.m8918a(this.f16134b, c2992e.f16134b) && AbstractC4154l.m8918a(this.f16135c, c2992e.f16135c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f16133a) * 31;
        Integer num = this.f16134b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Object obj = this.f16135c;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "FieldValidatorResult(success=" + this.f16133a + ", errorMessageSrc=" + this.f16134b + ", stringArgs=" + this.f16135c + ")";
    }

    public C2992e(boolean z6, Integer num, Object obj) {
        this.f16133a = z6;
        this.f16134b = num;
        this.f16135c = obj;
    }
}
