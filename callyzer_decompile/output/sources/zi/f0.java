package zi;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class f0 extends q1 {

    /* renamed from: a */
    public final String f43074a;

    /* renamed from: b */
    public final String f43075b;

    public f0(String str, String str2) {
        this.f43074a = str;
        this.f43075b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q1) {
            f0 f0Var = (f0) ((q1) obj);
            if (this.f43074a.equals(f0Var.f43074a) && this.f43075b.equals(f0Var.f43075b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f43074a.hashCode() ^ 1000003) * 1000003) ^ this.f43075b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f43074a);
        sb2.append(", value=");
        return AbstractC1452a.m4564k(sb2, this.f43075b, "}");
    }
}
