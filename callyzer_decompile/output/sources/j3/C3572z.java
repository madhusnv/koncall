package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.z */
/* loaded from: classes.dex */
public final class C3572z extends c0 {

    /* renamed from: c */
    public final float f19121c;

    /* renamed from: d */
    public final float f19122d;

    public C3572z(float f6, float f10) {
        super(1);
        this.f19121c = f6;
        this.f19122d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3572z)) {
            return false;
        }
        C3572z c3572z = (C3572z) obj;
        return Float.compare(this.f19121c, c3572z.f19121c) == 0 && Float.compare(this.f19122d, c3572z.f19122d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19122d) + (Float.hashCode(this.f19121c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.f19121c);
        sb2.append(", dy=");
        return AbstractC1452a.m4562i(sb2, this.f19122d, ')');
    }
}
