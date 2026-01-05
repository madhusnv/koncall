package id;

import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.k */
/* loaded from: classes.dex */
public final class C3241k {

    /* renamed from: a */
    public final String f17413a;

    /* renamed from: b */
    public final String f17414b;

    public C3241k(String local, String str) {
        AbstractC4154l.m8923f(local, "local");
        this.f17413a = local;
        this.f17414b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3241k)) {
            return false;
        }
        C3241k c3241k = (C3241k) obj;
        return AbstractC4154l.m8918a(this.f17413a, c3241k.f17413a) && AbstractC4154l.m8918a(this.f17414b, c3241k.f17414b);
    }

    public final int hashCode() {
        int iHashCode = this.f17413a.hashCode() * 31;
        String str = this.f17414b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f17413a;
        String str2 = this.f17414b;
        if (str2 == null) {
            return str;
        }
        return str2 + ':' + str;
    }
}
