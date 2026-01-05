package id;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.j */
/* loaded from: classes.dex */
public final class C3240j {

    /* renamed from: a */
    public final String f17411a;

    /* renamed from: b */
    public final String f17412b;

    public C3240j(String uri, String str) {
        AbstractC4154l.m8923f(uri, "uri");
        this.f17411a = uri;
        this.f17412b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3240j)) {
            return false;
        }
        C3240j c3240j = (C3240j) obj;
        return AbstractC4154l.m8918a(this.f17411a, c3240j.f17411a) && AbstractC4154l.m8918a(this.f17412b, c3240j.f17412b);
    }

    public final int hashCode() {
        int iHashCode = this.f17411a.hashCode() * 31;
        String str = this.f17412b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Namespace(uri=");
        sb2.append(this.f17411a);
        sb2.append(", prefix=");
        return AbstractC0030c.m123n(sb2, this.f17412b, ')');
    }
}
