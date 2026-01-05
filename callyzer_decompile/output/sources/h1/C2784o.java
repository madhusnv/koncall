package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.o */
/* loaded from: classes.dex */
public final class C2784o extends AbstractC2785p {

    /* renamed from: a */
    public float f15521a;

    /* renamed from: b */
    public float f15522b;

    /* renamed from: c */
    public float f15523c;

    /* renamed from: d */
    public float f15524d;

    public C2784o(float f6, float f10, float f11, float f12) {
        this.f15521a = f6;
        this.f15522b = f10;
        this.f15523c = f11;
        this.f15524d = f12;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: a */
    public final float mo6831a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? DefinitionKt.NO_Float_VALUE : this.f15524d : this.f15523c : this.f15522b : this.f15521a;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: b */
    public final int mo6832b() {
        return 4;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: c */
    public final AbstractC2785p mo6833c() {
        return new C2784o(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
    }

    @Override // h1.AbstractC2785p
    /* renamed from: d */
    public final void mo6834d() {
        this.f15521a = DefinitionKt.NO_Float_VALUE;
        this.f15522b = DefinitionKt.NO_Float_VALUE;
        this.f15523c = DefinitionKt.NO_Float_VALUE;
        this.f15524d = DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: e */
    public final void mo6835e(float f6, int i10) {
        if (i10 == 0) {
            this.f15521a = f6;
            return;
        }
        if (i10 == 1) {
            this.f15522b = f6;
        } else if (i10 == 2) {
            this.f15523c = f6;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f15524d = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2784o)) {
            return false;
        }
        C2784o c2784o = (C2784o) obj;
        return c2784o.f15521a == this.f15521a && c2784o.f15522b == this.f15522b && c2784o.f15523c == this.f15523c && c2784o.f15524d == this.f15524d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15524d) + AbstractC1452a.m4555b(this.f15523c, AbstractC1452a.m4555b(this.f15522b, Float.hashCode(this.f15521a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f15521a + ", v2 = " + this.f15522b + ", v3 = " + this.f15523c + ", v4 = " + this.f15524d;
    }
}
