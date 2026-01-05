package g0;

import e0.C1894c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C2411a implements InterfaceC2415e {

    /* renamed from: a */
    public final C1894c f10902a;

    public C2411a(C1894c c1894c) {
        this.f10902a = c1894c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2411a) && AbstractC4154l.m8918a(this.f10902a, ((C2411a) obj).f10902a);
    }

    public final int hashCode() {
        return this.f10902a.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.f10902a + ')';
    }
}
