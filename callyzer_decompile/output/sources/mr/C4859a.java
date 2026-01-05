package mr;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mr.a */
/* loaded from: classes3.dex */
public final class C4859a extends AbstractC4865g {

    /* renamed from: a */
    public final Object f24365a;

    /* renamed from: b */
    public final int f24366b;

    public C4859a(int i10, Object obj) {
        this.f24365a = obj;
        this.f24366b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4859a)) {
            return false;
        }
        C4859a c4859a = (C4859a) obj;
        return AbstractC4154l.m8918a(this.f24365a, c4859a.f24365a) && this.f24366b == c4859a.f24366b;
    }

    public final int hashCode() {
        Object obj = this.f24365a;
        return Integer.hashCode(this.f24366b) + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "OnGenericValueChange(newVal=" + this.f24365a + ", position=" + this.f24366b + ")";
    }
}
