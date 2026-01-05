package d3;

import c3.C0848c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class d0 extends h0 {

    /* renamed from: e */
    public final C0848c f7738e;

    public d0(C0848c c0848c) {
        this.f7738e = c0848c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return AbstractC4154l.m8918a(this.f7738e, ((d0) obj).f7738e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7738e.hashCode();
    }
}
