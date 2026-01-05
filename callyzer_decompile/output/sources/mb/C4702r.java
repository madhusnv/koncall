package mb;

import kotlin.jvm.internal.AbstractC4154l;
import mm.AbstractC4801l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.r */
/* loaded from: classes.dex */
public final class C4702r {

    /* renamed from: a */
    public final String f23443a;

    public C4702r(eb.w0 w0Var) {
        this.f23443a = w0Var.f9503a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4702r.class == obj.getClass() && AbstractC4154l.m8918a(this.f23443a, ((C4702r) obj).f23443a);
    }

    public final int hashCode() {
        String str = this.f23443a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return AbstractC4801l.m9737k(new StringBuilder("prefix="), this.f23443a, new StringBuilder("CommonPrefix("), ")");
    }
}
