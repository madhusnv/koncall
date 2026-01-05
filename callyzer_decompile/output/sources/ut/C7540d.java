package ut;

import kotlin.jvm.internal.AbstractC4154l;
import pg.f0;
import rt.C6617a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ut.d */
/* loaded from: classes3.dex */
public final class C7540d extends f0 {

    /* renamed from: a */
    public final C6617a f36300a;

    public C7540d(C6617a c6617a) {
        this.f36300a = c6617a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7540d) && AbstractC4154l.m8918a(this.f36300a, ((C7540d) obj).f36300a);
    }

    public final int hashCode() {
        return this.f36300a.hashCode();
    }

    public final String toString() {
        return "SetCallLogData(callLogData=" + this.f36300a + ")";
    }
}
