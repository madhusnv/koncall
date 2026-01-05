package s4;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: s4.d */
/* loaded from: classes.dex */
public final class C6748d implements InterfaceC6747c {

    /* renamed from: a */
    public final float f32196a;

    /* renamed from: b */
    public final float f32197b;

    public C6748d(float f6, float f10) {
        this.f32196a = f6;
        this.f32197b = f10;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: O */
    public final float mo154O() {
        return this.f32197b;
    }

    @Override // s4.InterfaceC6747c
    /* renamed from: a */
    public final float mo155a() {
        return this.f32196a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6748d)) {
            return false;
        }
        C6748d c6748d = (C6748d) obj;
        return Float.compare(this.f32196a, c6748d.f32196a) == 0 && Float.compare(this.f32197b, c6748d.f32197b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f32197b) + (Float.hashCode(this.f32196a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f32196a);
        sb2.append(", fontScale=");
        return AbstractC1452a.m4562i(sb2, this.f32197b, ')');
    }
}
