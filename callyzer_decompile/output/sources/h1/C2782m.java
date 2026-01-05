package h1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.m */
/* loaded from: classes.dex */
public final class C2782m extends AbstractC2785p {

    /* renamed from: a */
    public float f15511a;

    /* renamed from: b */
    public float f15512b;

    public C2782m(float f6, float f10) {
        this.f15511a = f6;
        this.f15512b = f10;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: a */
    public final float mo6831a(int i10) {
        return i10 != 0 ? i10 != 1 ? DefinitionKt.NO_Float_VALUE : this.f15512b : this.f15511a;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: b */
    public final int mo6832b() {
        return 2;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: c */
    public final AbstractC2785p mo6833c() {
        return new C2782m(DefinitionKt.NO_Float_VALUE, DefinitionKt.NO_Float_VALUE);
    }

    @Override // h1.AbstractC2785p
    /* renamed from: d */
    public final void mo6834d() {
        this.f15511a = DefinitionKt.NO_Float_VALUE;
        this.f15512b = DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: e */
    public final void mo6835e(float f6, int i10) {
        if (i10 == 0) {
            this.f15511a = f6;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f15512b = f6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2782m)) {
            return false;
        }
        C2782m c2782m = (C2782m) obj;
        return c2782m.f15511a == this.f15511a && c2782m.f15512b == this.f15512b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15512b) + (Float.hashCode(this.f15511a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f15511a + ", v2 = " + this.f15512b;
    }
}
