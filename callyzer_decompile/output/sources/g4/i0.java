package g4;

import kotlin.jvm.internal.AbstractC4154l;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class i0 implements InterfaceC2487c {

    /* renamed from: a */
    public final String f13656a;

    public final boolean equals(Object obj) {
        if (obj instanceof i0) {
            return AbstractC4154l.m8918a(this.f13656a, ((i0) obj).f13656a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13656a.hashCode();
    }

    public final String toString() {
        return a1.m14328h(')', "StringAnnotation(value=", this.f13656a);
    }
}
