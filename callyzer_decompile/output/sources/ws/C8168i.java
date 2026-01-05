package ws;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.i */
/* loaded from: classes3.dex */
public final class C8168i extends AbstractC8175p {

    /* renamed from: a */
    public final boolean f39091a;

    public C8168i(boolean z6) {
        this.f39091a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8168i) && this.f39091a == ((C8168i) obj).f39091a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39091a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("SkipCheckedChange(setChecked=", ")", this.f39091a);
    }
}
