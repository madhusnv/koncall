package ws;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ws.a */
/* loaded from: classes3.dex */
public final class C8160a extends AbstractC8175p {

    /* renamed from: a */
    public final boolean f39083a;

    public C8160a(boolean z6) {
        this.f39083a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8160a) && this.f39083a == ((C8160a) obj).f39083a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39083a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("ApplySimilarCheckedChange(setChecked=", ")", this.f39083a);
    }
}
