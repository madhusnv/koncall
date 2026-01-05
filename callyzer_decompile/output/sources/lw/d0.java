package lw;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;
import t3.w0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class d0 {

    /* renamed from: a */
    public final w0 f22565a;

    /* renamed from: b */
    public final w0 f22566b;

    /* renamed from: c */
    public final ArrayList f22567c;

    /* renamed from: d */
    public final ArrayList f22568d;

    public d0(w0 pie, w0 hole, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC4154l.m8923f(pie, "pie");
        AbstractC4154l.m8923f(hole, "hole");
        this.f22565a = pie;
        this.f22566b = hole;
        this.f22567c = arrayList;
        this.f22568d = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return AbstractC4154l.m8918a(this.f22565a, d0Var.f22565a) && AbstractC4154l.m8918a(this.f22566b, d0Var.f22566b) && this.f22567c.equals(d0Var.f22567c) && this.f22568d.equals(d0Var.f22568d);
    }

    public final int hashCode() {
        return this.f22568d.hashCode() + ((this.f22567c.hashCode() + ((this.f22566b.hashCode() + (this.f22565a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PiePlaceables(pie=" + this.f22565a + ", hole=" + this.f22566b + ", labels=" + this.f22567c + ", labelConnectors=" + this.f22568d + ")";
    }
}
