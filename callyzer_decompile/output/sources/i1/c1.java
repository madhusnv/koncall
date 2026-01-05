package i1;

import androidx.compose.foundation.layout.AbstractC0242a;
import com.skydoves.balloon.internals.DefinitionKt;
import d3.C1565s;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final long f16815a;

    /* renamed from: b */
    public final o1.i1 f16816b;

    public c1() {
        long jM5132d = d3.h0.m5132d(4284900966L);
        o1.i1 i1VarM647a = AbstractC0242a.m647a(DefinitionKt.NO_Float_VALUE, 3);
        this.f16815a = jM5132d;
        this.f16816b = i1VarM647a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!c1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC4154l.m8921d(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
        c1 c1Var = (c1) obj;
        return C1565s.m5187c(this.f16815a, c1Var.f16815a) && AbstractC4154l.m8918a(this.f16816b, c1Var.f16816b);
    }

    public final int hashCode() {
        int i10 = C1565s.f7818k;
        return this.f16816b.hashCode() + (Long.hashCode(this.f16815a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        i0.m0.m7391x(this.f16815a, ", drawPadding=", sb2);
        sb2.append(this.f16816b);
        sb2.append(')');
        return sb2.toString();
    }
}
