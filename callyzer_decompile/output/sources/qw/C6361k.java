package qw;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: qw.k */
/* loaded from: classes3.dex */
public final class C6361k implements Serializable {

    /* renamed from: a */
    public final Object f30755a;

    /* renamed from: b */
    public final Object f30756b;

    public C6361k(Object obj, Object obj2) {
        this.f30755a = obj;
        this.f30756b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6361k)) {
            return false;
        }
        C6361k c6361k = (C6361k) obj;
        return AbstractC4154l.m8918a(this.f30755a, c6361k.f30755a) && AbstractC4154l.m8918a(this.f30756b, c6361k.f30756b);
    }

    public final int hashCode() {
        Object obj = this.f30755a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f30756b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f30755a + ", " + this.f30756b + ')';
    }
}
