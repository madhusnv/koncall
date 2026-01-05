package g4;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 implements InterfaceC2487c {

    /* renamed from: a */
    public final String f13705a;

    public q0(String str) {
        this.f13705a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return AbstractC4154l.m8918a(this.f13705a, ((q0) obj).f13705a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13705a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("UrlAnnotation(url="), this.f13705a, ')');
    }
}
