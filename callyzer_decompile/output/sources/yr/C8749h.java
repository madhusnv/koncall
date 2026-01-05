package yr;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: yr.h */
/* loaded from: classes3.dex */
public final class C8749h extends AbstractC8761t {

    /* renamed from: a */
    public final boolean f42364a;

    public C8749h(boolean z6) {
        this.f42364a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8749h) && this.f42364a == ((C8749h) obj).f42364a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42364a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("CloseDialog(revalidateForm=", ")", this.f42364a);
    }
}
