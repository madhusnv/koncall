package c5;

import com.skydoves.balloon.internals.DefinitionKt;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: c5.e */
/* loaded from: classes.dex */
public final class C0867e extends AbstractC0865c {

    /* renamed from: e */
    public float f5413e;

    public C0867e(float f6) {
        super(null);
        this.f5413e = f6;
    }

    @Override // c5.AbstractC0865c
    /* renamed from: c */
    public final float mo2328c() {
        char[] cArr;
        if (Float.isNaN(this.f5413e) && (cArr = this.f5409a) != null && cArr.length >= 1) {
            this.f5413e = Float.parseFloat(m2327b());
        }
        return this.f5413e;
    }

    @Override // c5.AbstractC0865c
    /* renamed from: e */
    public final int mo2329e() {
        char[] cArr;
        if (Float.isNaN(this.f5413e) && (cArr = this.f5409a) != null && cArr.length >= 1) {
            this.f5413e = Integer.parseInt(m2327b());
        }
        return (int) this.f5413e;
    }

    @Override // c5.AbstractC0865c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0867e) {
            float fMo2328c = mo2328c();
            float fMo2328c2 = ((C0867e) obj).mo2328c();
            if ((Float.isNaN(fMo2328c) && Float.isNaN(fMo2328c2)) || fMo2328c == fMo2328c2) {
                return true;
            }
        }
        return false;
    }

    @Override // c5.AbstractC0865c
    public final int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f6 = this.f5413e;
        return iHashCode + (f6 != DefinitionKt.NO_Float_VALUE ? Float.floatToIntBits(f6) : 0);
    }
}
