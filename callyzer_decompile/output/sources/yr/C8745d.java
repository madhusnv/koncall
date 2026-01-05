package yr;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.d */
/* loaded from: classes3.dex */
public final class C8745d extends AbstractC8761t {

    /* renamed from: a */
    public final boolean f42356a;

    public C8745d(boolean z6) {
        this.f42356a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8745d) && this.f42356a == ((C8745d) obj).f42356a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42356a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("ChangeIsMapAvailableCallLog(isMapCallLog=", ")", this.f42356a);
    }
}
