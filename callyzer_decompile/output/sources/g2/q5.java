package g2;

import kotlin.jvm.internal.AbstractC4154l;
import s2.C6734c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a */
    public final Object f12486a;

    /* renamed from: b */
    public final C6734c f12487b;

    public q5(qa qaVar, C6734c c6734c) {
        this.f12486a = qaVar;
        this.f12487b = c6734c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5)) {
            return false;
        }
        q5 q5Var = (q5) obj;
        return AbstractC4154l.m8918a(this.f12486a, q5Var.f12486a) && this.f12487b.equals(q5Var.f12487b);
    }

    public final int hashCode() {
        Object obj = this.f12486a;
        return this.f12487b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12486a + ", transition=" + this.f12487b + ')';
    }
}
