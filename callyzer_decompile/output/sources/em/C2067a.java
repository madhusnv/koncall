package em;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: em.a */
/* loaded from: classes.dex */
public final class C2067a {

    /* renamed from: a */
    public final String f9679a;

    /* renamed from: b */
    public final ArrayList f9680b;

    /* renamed from: c */
    public final ArrayList f9681c;

    public C2067a(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f9679a = str;
        this.f9680b = arrayList;
        this.f9681c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2067a)) {
            return false;
        }
        C2067a c2067a = (C2067a) obj;
        return AbstractC4154l.m8918a(this.f9679a, c2067a.f9679a) && this.f9680b.equals(c2067a.f9680b) && this.f9681c.equals(c2067a.f9681c);
    }

    public final int hashCode() {
        String str = this.f9679a;
        return this.f9681c.hashCode() + ((this.f9680b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "Transformation(formatted=" + this.f9679a + ", originalToTransformed=" + this.f9680b + ", transformedToOriginal=" + this.f9681c + ")";
    }
}
