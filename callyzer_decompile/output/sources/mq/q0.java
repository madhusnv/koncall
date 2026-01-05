package mq;

import kotlin.jvm.internal.AbstractC4154l;
import zp.C9008h;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q0 extends s0 {

    /* renamed from: a */
    public final C9008h f24313a;

    public q0(C9008h c9008h) {
        this.f24313a = c9008h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && AbstractC4154l.m8918a(this.f24313a, ((q0) obj).f24313a);
    }

    public final int hashCode() {
        C9008h c9008h = this.f24313a;
        if (c9008h == null) {
            return 0;
        }
        return c9008h.f43395a.hashCode();
    }

    public final String toString() {
        return "SetCallLogData(item=" + this.f24313a + ")";
    }
}
