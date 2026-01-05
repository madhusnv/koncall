package g4;

import a2.AbstractC0030c;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class r0 implements InterfaceC2487c {

    /* renamed from: a */
    public final String f13708a;

    public r0(String str) {
        this.f13708a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return AbstractC4154l.m8918a(this.f13708a, ((r0) obj).f13708a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13708a.hashCode();
    }

    public final String toString() {
        return AbstractC0030c.m123n(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f13708a, ')');
    }
}
