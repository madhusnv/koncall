package pu;

import a2.AbstractC0030c;
import og.kc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.b */
/* loaded from: classes3.dex */
public final class C6034b extends kc {

    /* renamed from: b */
    public final boolean f29483b;

    public C6034b(boolean z6) {
        this.f29483b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6034b) && this.f29483b == ((C6034b) obj).f29483b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29483b);
    }

    public final String toString() {
        return AbstractC0030c.m122m("NotePopupPermissionErrorActions(isOverlayPermissionError=", ")", this.f29483b);
    }
}
