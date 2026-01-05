package wt;

import a2.AbstractC0030c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: wt.b */
/* loaded from: classes3.dex */
public final class C8184b {

    /* renamed from: a */
    public final boolean f39143a;

    public C8184b(boolean z6) {
        this.f39143a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8184b) && this.f39143a == ((C8184b) obj).f39143a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f39143a);
    }

    public final String toString() {
        return AbstractC0030c.m122m("QRScannerState(isConnectingDialogVisible=", ")", this.f39143a);
    }
}
