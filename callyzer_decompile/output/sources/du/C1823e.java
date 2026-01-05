package du;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: du.e */
/* loaded from: classes3.dex */
public final class C1823e extends AbstractC1839u {

    /* renamed from: a */
    public final boolean f8800a;

    public C1823e(boolean z6) {
        this.f8800a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1823e) && this.f8800a == ((C1823e) obj).f8800a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8800a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("EnableLogFile(isEnable=", ")", this.f8800a);
    }
}
