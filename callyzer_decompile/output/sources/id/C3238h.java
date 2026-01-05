package id;

import i0.m0;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4154l;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: id.h */
/* loaded from: classes.dex */
public final class C3238h extends AbstractC3243m {

    /* renamed from: a */
    public final int f17405a;

    /* renamed from: b */
    public final C3241k f17406b;

    /* renamed from: c */
    public final Map f17407c;

    /* renamed from: d */
    public final List f17408d;

    public C3238h(int i10, C3241k c3241k, Map map, List list) {
        this.f17405a = i10;
        this.f17406b = c3241k;
        this.f17407c = map;
        this.f17408d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3238h)) {
            return false;
        }
        C3238h c3238h = (C3238h) obj;
        return this.f17405a == c3238h.f17405a && AbstractC4154l.m8918a(this.f17406b, c3238h.f17406b) && AbstractC4154l.m8918a(this.f17407c, c3238h.f17407c) && AbstractC4154l.m8918a(this.f17408d, c3238h.f17408d);
    }

    public final int hashCode() {
        return this.f17408d.hashCode() + m0.m7369b((this.f17406b.hashCode() + (Integer.hashCode(this.f17405a) * 31)) * 31, 31, this.f17407c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append(this.f17406b);
        sb2.append(" (");
        return AbstractC5601a.m11233d(this.f17405a, ")>", sb2);
    }
}
