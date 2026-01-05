package im;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class i1 extends k1 {

    /* renamed from: a */
    public final Object f17561a;

    public i1(Object obj) {
        this.f17561a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && AbstractC4154l.m8918a(this.f17561a, ((i1) obj).f17561a);
    }

    public final int hashCode() {
        Object obj = this.f17561a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(response=" + this.f17561a + ")";
    }
}
