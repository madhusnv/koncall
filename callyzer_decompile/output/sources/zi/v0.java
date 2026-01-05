package zi;

import java.util.List;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class v0 extends a2 {

    /* renamed from: a */
    public final String f43294a;

    /* renamed from: b */
    public final int f43295b;

    /* renamed from: c */
    public final List f43296c;

    public v0(int i10, String str, List list) {
        this.f43294a = str;
        this.f43295b = i10;
        this.f43296c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a2) {
            v0 v0Var = (v0) ((a2) obj);
            if (this.f43294a.equals(v0Var.f43294a) && this.f43295b == v0Var.f43295b && this.f43296c.equals(v0Var.f43296c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f43294a.hashCode() ^ 1000003) * 1000003) ^ this.f43295b) * 1000003) ^ this.f43296c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Thread{name=");
        sb2.append(this.f43294a);
        sb2.append(", importance=");
        sb2.append(this.f43295b);
        sb2.append(", frames=");
        return AbstractC5601a.m11240k("}", sb2, this.f43296c);
    }
}
