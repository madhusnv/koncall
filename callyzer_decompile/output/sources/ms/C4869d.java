package ms;

import com.sun.mail.util.AbstractC1452a;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: ms.d */
/* loaded from: classes3.dex */
public final class C4869d extends AbstractC4871f {

    /* renamed from: a */
    public final int f24379a;

    /* renamed from: b */
    public final int f24380b;

    /* renamed from: c */
    public final int f24381c;

    public C4869d(int i10, int i11, int i12) {
        this.f24379a = i10;
        this.f24380b = i11;
        this.f24381c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4869d)) {
            return false;
        }
        C4869d c4869d = (C4869d) obj;
        return this.f24379a == c4869d.f24379a && this.f24380b == c4869d.f24380b && this.f24381c == c4869d.f24381c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24381c) + AbstractC1452a.m4556c(this.f24380b, Integer.hashCode(this.f24379a) * 31, 31);
    }

    public final String toString() {
        return AbstractC5601a.m11233d(this.f24381c, ")", AbstractC1452a.m4566m(this.f24379a, this.f24380b, "ItemsScrolled(visibleItemCount=", ", totalItemCount=", ", firstVisibleItemPosition="));
    }
}
