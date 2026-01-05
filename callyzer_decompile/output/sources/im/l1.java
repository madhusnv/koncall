package im;

import kotlin.jvm.internal.AbstractC4154l;
import pg.t6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes3.dex */
public final class l1 extends o1 {

    /* renamed from: a */
    public final t6 f17566a;

    public l1(t6 t6Var) {
        this.f17566a = t6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1) && AbstractC4154l.m8918a(this.f17566a, ((l1) obj).f17566a);
    }

    public final int hashCode() {
        return this.f17566a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.f17566a + ")";
    }
}
