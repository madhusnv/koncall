package hb;

import c9.C0917l;
import ib.C3222b;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: hb.c */
/* loaded from: classes.dex */
public final class C2877c {

    /* renamed from: a */
    public final C3222b f15903a;

    /* renamed from: b */
    public final String f15904b;

    public C2877c(C0917l c0917l) {
        this.f15903a = (C3222b) c0917l.f5594b;
        String str = (String) c0917l.f5595c;
        if (str == null) {
            throw new IllegalArgumentException("operationName is a required auth scheme parameter");
        }
        this.f15904b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2877c)) {
            return false;
        }
        C2877c c2877c = (C2877c) obj;
        return AbstractC4154l.m8918a(this.f15903a, c2877c.f15903a) && AbstractC4154l.m8918a(this.f15904b, c2877c.f15904b);
    }

    public final int hashCode() {
        C3222b c3222b = this.f15903a;
        int iHashCode = (c3222b != null ? c3222b.hashCode() : 0) * 31;
        String str = this.f15904b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("S3AuthSchemeParameters(");
        sb2.append("endpointParameters=" + this.f15903a + ',');
        sb2.append("operationName=" + this.f15904b + ')');
        return sb2.toString();
    }
}
