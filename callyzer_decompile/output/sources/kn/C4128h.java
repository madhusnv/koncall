package kn;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.h */
/* loaded from: classes3.dex */
public final class C4128h {

    /* renamed from: a */
    public final boolean f21077a;

    /* renamed from: b */
    public final String f21078b;

    public C4128h(boolean z6, String str) {
        this.f21077a = z6;
        this.f21078b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4128h)) {
            return false;
        }
        C4128h c4128h = (C4128h) obj;
        return this.f21077a == c4128h.f21077a && AbstractC4154l.m8918a(this.f21078b, c4128h.f21078b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21077a) * 31;
        String str = this.f21078b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ReadContactResult(success=" + this.f21077a + ", errorMessage=" + this.f21078b + ")";
    }
}
