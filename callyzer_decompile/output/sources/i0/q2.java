package i0;

import com.sun.mail.util.AbstractC1452a;
import java.util.HashMap;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a */
    public final HashMap f16572a;

    /* renamed from: b */
    public final HashMap f16573b;

    /* renamed from: c */
    public final int f16574c;

    public q2(HashMap map, HashMap map2, int i10) {
        this.f16572a = map;
        this.f16573b = map2;
        this.f16574c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        return this.f16572a.equals(q2Var.f16572a) && this.f16573b.equals(q2Var.f16573b) && this.f16574c == q2Var.f16574c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16574c) + ((this.f16573b.hashCode() + (this.f16572a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurfaceStreamSpecQueryResult(useCaseStreamSpecs=");
        sb2.append(this.f16572a);
        sb2.append(", attachedSurfaceStreamSpecs=");
        sb2.append(this.f16573b);
        sb2.append(", maxSupportedFrameRate=");
        return AbstractC1452a.m4563j(sb2, this.f16574c, ')');
    }
}
