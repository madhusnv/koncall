package androidx.compose.material3.pulltorefresh;

import com.sun.mail.util.AbstractC1452a;
import ex.InterfaceC2137a;
import i2.C3157j;
import i2.C3160m;
import i2.InterfaceC3161n;
import kotlin.jvm.internal.AbstractC4154l;
import s4.C6750f;
import tx.c0;
import v3.a1;
import w2.AbstractC7878q;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class PullToRefreshElement extends a1 {

    /* renamed from: a */
    public final boolean f2082a;

    /* renamed from: b */
    public final InterfaceC2137a f2083b;

    /* renamed from: c */
    public final InterfaceC3161n f2084c;

    /* renamed from: d */
    public final float f2085d;

    public PullToRefreshElement(boolean z6, InterfaceC2137a interfaceC2137a, InterfaceC3161n interfaceC3161n, float f6) {
        this.f2082a = z6;
        this.f2083b = interfaceC2137a;
        this.f2084c = interfaceC3161n;
        this.f2085d = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PullToRefreshElement)) {
            return false;
        }
        PullToRefreshElement pullToRefreshElement = (PullToRefreshElement) obj;
        return this.f2082a == pullToRefreshElement.f2082a && AbstractC4154l.m8918a(this.f2083b, pullToRefreshElement.f2083b) && AbstractC4154l.m8918a(this.f2084c, pullToRefreshElement.f2084c) && C6750f.m12935a(this.f2085d, pullToRefreshElement.f2085d);
    }

    @Override // v3.a1
    /* renamed from: h */
    public final AbstractC7878q mo621h() {
        return new C3160m(this.f2082a, this.f2083b, this.f2084c, this.f2085d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f2085d) + ((this.f2084c.hashCode() + AbstractC1452a.m4558e((this.f2083b.hashCode() + (Boolean.hashCode(this.f2082a) * 31)) * 31, 31, true)) * 31);
    }

    @Override // v3.a1
    /* renamed from: i */
    public final void mo622i(AbstractC7878q abstractC7878q) {
        C3160m c3160m = (C3160m) abstractC7878q;
        c3160m.f17070t = this.f2083b;
        c3160m.f17071v = true;
        c3160m.f17072w = this.f2084c;
        c3160m.f17073x = this.f2085d;
        boolean z6 = c3160m.f17069s;
        boolean z10 = this.f2082a;
        if (z6 != z10) {
            c3160m.f17069s = z10;
            c0.m13502y(c3160m.z0(), null, null, new C3157j(c3160m, null, 2), 3);
        }
    }

    public final String toString() {
        return "PullToRefreshElement(isRefreshing=" + this.f2082a + ", onRefresh=" + this.f2083b + ", enabled=true, state=" + this.f2084c + ", threshold=" + ((Object) C6750f.m12936b(this.f2085d)) + ')';
    }
}
