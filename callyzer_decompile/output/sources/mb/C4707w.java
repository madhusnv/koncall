package mb;

import java.util.List;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: mb.w */
/* loaded from: classes.dex */
public final class C4707w {

    /* renamed from: a */
    public final List f23504a;

    public C4707w(C4706v c4706v) {
        this.f23504a = c4706v.f23496a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4707w.class == obj.getClass() && AbstractC4154l.m8918a(this.f23504a, ((C4707w) obj).f23504a);
    }

    public final int hashCode() {
        List list = this.f23504a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CompletedMultipartUpload(");
        sb2.append("parts=" + this.f23504a);
        sb2.append(")");
        return sb2.toString();
    }
}
