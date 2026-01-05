package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f1 extends g2 {

    /* renamed from: a */
    public final String f43076a;

    /* renamed from: b */
    public final String f43077b;

    public f1(String str, String str2) {
        this.f43076a = str;
        this.f43077b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g2) {
            f1 f1Var = (f1) ((g2) obj);
            if (this.f43076a.equals(f1Var.f43076a) && this.f43077b.equals(f1Var.f43077b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43076a.hashCode() ^ 1000003) * 1000003) ^ this.f43077b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.f43076a);
        sb2.append(", variantId=");
        return AbstractC1452a.m4564k(sb2, this.f43077b, "}");
    }
}
