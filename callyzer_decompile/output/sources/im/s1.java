package im;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class s1 implements t1 {

    /* renamed from: a */
    public final boolean f17581a;

    public s1(boolean z6) {
        this.f17581a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s1) && this.f17581a == ((s1) obj).f17581a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17581a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("CallRecordingSyncInProgress(inProgress=", ")", this.f17581a);
    }
}
