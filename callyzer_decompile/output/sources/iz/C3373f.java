package iz;

import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4154l;
import pg.c8;
import rw.AbstractC6663m;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: iz.f */
/* loaded from: classes3.dex */
public final class C3373f {

    /* renamed from: c */
    public static final C3373f f17860c = new C3373f(AbstractC6663m.g0(new ArrayList()), null);

    /* renamed from: a */
    public final Set f17861a;

    /* renamed from: b */
    public final c8 f17862b;

    public C3373f(Set set, c8 c8Var) {
        this.f17861a = set;
        this.f17862b = c8Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3373f)) {
            return false;
        }
        C3373f c3373f = (C3373f) obj;
        return AbstractC4154l.m8918a(c3373f.f17861a, this.f17861a) && AbstractC4154l.m8918a(c3373f.f17862b, this.f17862b);
    }

    public final int hashCode() {
        int iHashCode = (this.f17861a.hashCode() + 1517) * 41;
        c8 c8Var = this.f17862b;
        return iHashCode + (c8Var != null ? c8Var.hashCode() : 0);
    }
}
