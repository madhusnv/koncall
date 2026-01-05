package pu;

import a2.AbstractC0030c;
import og.kc;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: pu.a */
/* loaded from: classes3.dex */
public final class C6033a extends kc {

    /* renamed from: b */
    public final boolean f29482b;

    public C6033a(boolean z6) {
        this.f29482b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6033a) && this.f29482b == ((C6033a) obj).f29482b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f29482b);
    }

    public final String toString() {
        return AbstractC0030c.m122m("InternetErrorActions(isBackgroundDataUsageError=", ")", this.f29482b);
    }
}
