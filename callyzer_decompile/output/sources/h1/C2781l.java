package h1;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: h1.l */
/* loaded from: classes.dex */
public final class C2781l extends AbstractC2785p {

    /* renamed from: a */
    public float f15504a;

    public C2781l(float f6) {
        this.f15504a = f6;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: a */
    public final float mo6831a(int i10) {
        return i10 == 0 ? this.f15504a : DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: b */
    public final int mo6832b() {
        return 1;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: c */
    public final AbstractC2785p mo6833c() {
        return new C2781l(DefinitionKt.NO_Float_VALUE);
    }

    @Override // h1.AbstractC2785p
    /* renamed from: d */
    public final void mo6834d() {
        this.f15504a = DefinitionKt.NO_Float_VALUE;
    }

    @Override // h1.AbstractC2785p
    /* renamed from: e */
    public final void mo6835e(float f6, int i10) {
        if (i10 == 0) {
            this.f15504a = f6;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2781l) && ((C2781l) obj).f15504a == this.f15504a;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15504a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f15504a;
    }
}
