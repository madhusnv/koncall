package kn;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: kn.i */
/* loaded from: classes3.dex */
public final class C4129i {

    /* renamed from: a */
    public final String f21079a;

    /* renamed from: b */
    public final String f21080b;

    public /* synthetic */ C4129i(String str) {
        this(str, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4129i)) {
            return false;
        }
        C4129i c4129i = (C4129i) obj;
        return AbstractC4154l.m8918a(this.f21079a, c4129i.f21079a) && AbstractC4154l.m8918a(this.f21080b, c4129i.f21080b);
    }

    public final int hashCode() {
        return this.f21080b.hashCode() + (this.f21079a.hashCode() * 31);
    }

    public final String toString() {
        return a1.m14333m("SIMVerificationViaCallData(callNumber=", this.f21079a, ", phoneAccountId=", this.f21080b, ")");
    }

    public C4129i(String callNumber, String str) {
        AbstractC4154l.m8923f(callNumber, "callNumber");
        this.f21079a = callNumber;
        this.f21080b = str;
    }
}
