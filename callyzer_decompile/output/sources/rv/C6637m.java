package rv;

import android.content.Context;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rv.m */
/* loaded from: classes3.dex */
public final class C6637m extends AbstractC6650z {

    /* renamed from: a */
    public final Context f31847a;

    /* renamed from: b */
    public final String f31848b;

    public C6637m(Context ccpContext, String number) {
        AbstractC4154l.m8923f(ccpContext, "ccpContext");
        AbstractC4154l.m8923f(number, "number");
        this.f31847a = ccpContext;
        this.f31848b = number;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6637m)) {
            return false;
        }
        C6637m c6637m = (C6637m) obj;
        return AbstractC4154l.m8918a(this.f31847a, c6637m.f31847a) && AbstractC4154l.m8918a(this.f31848b, c6637m.f31848b);
    }

    public final int hashCode() {
        return this.f31848b.hashCode() + (this.f31847a.hashCode() * 31);
    }

    public final String toString() {
        return "NumberChanged(ccpContext=" + this.f31847a + ", number=" + this.f31848b + ")";
    }
}
