package y8;

import com.sun.mail.util.AbstractC1452a;
import i0.m0;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: y8.e */
/* loaded from: classes.dex */
public final class C8596e {

    /* renamed from: a */
    public final boolean f41842a;

    /* renamed from: b */
    public final boolean f41843b;

    /* renamed from: c */
    public final boolean f41844c;

    /* renamed from: d */
    public final boolean f41845d;

    public C8596e(boolean z6, boolean z10, boolean z11, boolean z12) {
        this.f41842a = z6;
        this.f41843b = z10;
        this.f41844c = z11;
        this.f41845d = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8596e)) {
            return false;
        }
        C8596e c8596e = (C8596e) obj;
        return this.f41842a == c8596e.f41842a && this.f41843b == c8596e.f41843b && this.f41844c == c8596e.f41844c && this.f41845d == c8596e.f41845d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f41845d) + AbstractC1452a.m4558e(AbstractC1452a.m4558e(Boolean.hashCode(this.f41842a) * 31, 31, this.f41843b), 31, this.f41844c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkState(isConnected=");
        sb2.append(this.f41842a);
        sb2.append(", isValidated=");
        sb2.append(this.f41843b);
        sb2.append(", isMetered=");
        sb2.append(this.f41844c);
        sb2.append(", isNotRoaming=");
        return m0.m7382o(sb2, this.f41845d, ')');
    }
}
