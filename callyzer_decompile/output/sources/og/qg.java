package og;

import java.util.Arrays;
import sf.AbstractC6840z;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class qg {

    /* renamed from: a */
    public final e0 f26774a;

    public /* synthetic */ qg(l4.d0 d0Var) {
        this.f26774a = (e0) d0Var.f21881b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qg) {
            return AbstractC6840z.m13040k(this.f26774a, ((qg) obj).f26774a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f26774a});
    }
}
