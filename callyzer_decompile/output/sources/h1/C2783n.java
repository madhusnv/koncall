package h1;

import com.skydoves.balloon.internals.DefinitionKt;
import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.n */
/* loaded from: classes.dex */
public final class C2783n extends AbstractC2785p {

    /* renamed from: a */
    public float f15518a;

    /* renamed from: b */
    public float f15519b;

    /* renamed from: c */
    public float f15520c;

    public C2783n(float f6, float f10, float f11) {
        this.f15518a = f6;
        this.f15519b = f10;
        this.f15520c = f11;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: a */
    public final float mo6831a(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? DefinitionKt.NO_Float_VALUE : this.f15520c : this.f15519b : this.f15518a;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: b */
    public final int mo6832b() {
        return 3;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: c */
    public final AbstractC2785p mo6833c() {
        return new C2783n(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
    }

    @Override // h1.AbstractC2785p
    /* renamed from: d */
    public final void mo6834d() {
        this.f15518a = DefinitionKt.NO_Float_VALUE;
        this.f15519b = DefinitionKt.NO_Float_VALUE;
        this.f15520c = DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: e */
    public final void mo6835e(float f6, int i10) {
        if (i10 == 0) {
            this.f15518a = f6;
        } else if (i10 == 1) {
            this.f15519b = f6;
        } else {
            if (i10 != 2) {
                return;
            }
            this.f15520c = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2783n)) {
            return false;
        }
        C2783n c2783n = (C2783n) obj;
        return c2783n.f15518a == this.f15518a && c2783n.f15519b == this.f15519b && c2783n.f15520c == this.f15520c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15520c) + AbstractC1452a.m4555b(this.f15519b, Float.hashCode(this.f15518a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.f15518a + ", v2 = " + this.f15519b + ", v3 = " + this.f15520c;
    }
}
