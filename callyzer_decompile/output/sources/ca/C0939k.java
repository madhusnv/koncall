package ca;

import java.util.ArrayList;
import og.la;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ca.k */
/* loaded from: classes.dex */
public final class C0939k {

    /* renamed from: a */
    public final la f5693a;

    /* renamed from: b */
    public final ArrayList f5694b;

    public C0939k(la laVar, ArrayList arrayList) {
        this.f5693a = laVar;
        this.f5694b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0939k)) {
            return false;
        }
        C0939k c0939k = (C0939k) obj;
        return this.f5693a.equals(c0939k.f5693a) && this.f5694b.equals(c0939k.f5694b);
    }

    public final int hashCode() {
        return this.f5694b.hashCode() + (this.f5693a.hashCode() * 31);
    }

    public final String toString() {
        return "ProfileChain(leaf=" + this.f5693a + ", roles=" + this.f5694b + ')';
    }
}
