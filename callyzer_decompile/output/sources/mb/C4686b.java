package mb;

import kotlin.jvm.internal.AbstractC4154l;
import l1.C4327p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.b */
/* loaded from: classes.dex */
public final class C4686b {

    /* renamed from: a */
    public final l2 f23193a;

    public C4686b(C4327p c4327p) {
        this.f23193a = (l2) c4327p.f21788b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4686b.class == obj.getClass() && AbstractC4154l.m8918a(this.f23193a, ((C4686b) obj).f23193a);
    }

    public final int hashCode() {
        l2 l2Var = this.f23193a;
        if (l2Var != null) {
            return l2Var.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AbortMultipartUploadResponse(");
        sb2.append("requestCharged=" + this.f23193a);
        sb2.append(")");
        return sb2.toString();
    }
}
