package mr;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mr.f */
/* loaded from: classes3.dex */
public final class C4864f extends AbstractC4865g {

    /* renamed from: a */
    public final List f24373a;

    /* renamed from: b */
    public final int f24374b;

    public C4864f(List options, int i10) {
        AbstractC4154l.m8923f(options, "options");
        this.f24373a = options;
        this.f24374b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4864f)) {
            return false;
        }
        C4864f c4864f = (C4864f) obj;
        return AbstractC4154l.m8918a(this.f24373a, c4864f.f24373a) && this.f24374b == c4864f.f24374b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24374b) + (this.f24373a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateAllOptions(options=" + this.f24373a + ", mainIndex=" + this.f24374b + ")";
    }
}
