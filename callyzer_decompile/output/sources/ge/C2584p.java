package ge;

import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import rw.C6669s;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ge.p */
/* loaded from: classes.dex */
public final class C2584p {

    /* renamed from: b */
    public static final C2584p f14070b = new C2584p(C6669s.f31944a);

    /* renamed from: a */
    public final Map f14071a;

    public C2584p(Map map) {
        this.f14071a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2584p) {
            return AbstractC4154l.m8918a(this.f14071a, ((C2584p) obj).f14071a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14071a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f14071a + ')';
    }
}
