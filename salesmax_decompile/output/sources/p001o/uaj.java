package p001o;

import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class uaj {

    /* renamed from: a */
    public final ll1 f48654a;

    public uaj(ll1 ll1Var) {
        sq8.m48649h(ll1Var, "_bounds");
        this.f48654a = ll1Var;
    }

    /* renamed from: a */
    public final Rect m51318a() {
        return this.f48654a.m37420f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !sq8.m48644c(uaj.class, obj.getClass())) {
            return false;
        }
        return sq8.m48644c(this.f48654a, ((uaj) obj).f48654a);
    }

    public int hashCode() {
        return this.f48654a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + m51318a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uaj(Rect rect) {
        this(new ll1(rect));
        sq8.m48649h(rect, "bounds");
    }
}
