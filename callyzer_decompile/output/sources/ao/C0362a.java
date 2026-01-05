package ao;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ao.a */
/* loaded from: classes3.dex */
public final class C0362a extends AbstractC0366e {

    /* renamed from: a */
    public final boolean f2895a;

    public C0362a(boolean z6) {
        this.f2895a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0362a) && this.f2895a == ((C0362a) obj).f2895a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2895a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("DataLoadedSuccess(mayBeConferenceCallIdentify=", ")", this.f2895a);
    }
}
