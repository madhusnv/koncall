package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.n */
/* loaded from: classes.dex */
public final class C3560n extends c0 {

    /* renamed from: c */
    public final float f19081c;

    /* renamed from: d */
    public final float f19082d;

    public C3560n(float f6, float f10) {
        super(3);
        this.f19081c = f6;
        this.f19082d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3560n)) {
            return false;
        }
        C3560n c3560n = (C3560n) obj;
        return Float.compare(this.f19081c, c3560n.f19081c) == 0 && Float.compare(this.f19082d, c3560n.f19082d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19082d) + (Float.hashCode(this.f19081c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f19081c);
        sb2.append(", y=");
        return AbstractC1452a.m4562i(sb2, this.f19082d, ')');
    }
}
