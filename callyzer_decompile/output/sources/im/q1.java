package im;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class q1 implements t1 {

    /* renamed from: a */
    public final boolean f17577a;

    public q1(boolean z6) {
        this.f17577a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1) && this.f17577a == ((q1) obj).f17577a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17577a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("CallLogSyncInProgress(inProgress=", ")", this.f17577a);
    }
}
