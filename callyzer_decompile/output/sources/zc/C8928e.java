package zc;

import kotlin.jvm.internal.AbstractC4154l;
import pg.z9;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: zc.e */
/* loaded from: classes.dex */
public final class C8928e {

    /* renamed from: a */
    public final String f42891a;

    /* renamed from: b */
    public final z9 f42892b;

    public C8928e(String str, z9 z9Var) {
        this.f42891a = str;
        this.f42892b = z9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8928e)) {
            return false;
        }
        C8928e c8928e = (C8928e) obj;
        return AbstractC4154l.m8918a(this.f42891a, c8928e.f42891a) && AbstractC4154l.m8918a(this.f42892b, c8928e.f42892b);
    }

    public final int hashCode() {
        return this.f42892b.hashCode() + (this.f42891a.hashCode() * 31);
    }

    public final String toString() {
        return "HostAddress(hostname=" + this.f42891a + ", address=" + this.f42892b + ')';
    }
}
