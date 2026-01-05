package r4;

import com.sun.mail.util.AbstractC1452a;
import d3.AbstractC1561o;
import d3.C1565s;
import d3.j0;
import kotlin.jvm.internal.AbstractC4154l;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: r4.b */
/* loaded from: classes.dex */
public final class C6447b implements InterfaceC6461p {

    /* renamed from: a */
    public final j0 f31101a;

    /* renamed from: b */
    public final float f31102b;

    public C6447b(j0 j0Var, float f6) {
        this.f31101a = j0Var;
        this.f31102b = f6;
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: a */
    public final float mo12437a() {
        return this.f31102b;
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: b */
    public final long mo12438b() {
        int i10 = C1565s.f7818k;
        return C1565s.f7817j;
    }

    @Override // r4.InterfaceC6461p
    /* renamed from: c */
    public final AbstractC1561o mo12439c() {
        return this.f31101a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6447b)) {
            return false;
        }
        C6447b c6447b = (C6447b) obj;
        return AbstractC4154l.m8918a(this.f31101a, c6447b.f31101a) && Float.compare(this.f31102b, c6447b.f31102b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f31102b) + (this.f31101a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f31101a);
        sb2.append(", alpha=");
        return AbstractC1452a.m4562i(sb2, this.f31102b, ')');
    }
}
