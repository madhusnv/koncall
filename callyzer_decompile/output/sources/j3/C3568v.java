package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.v */
/* loaded from: classes.dex */
public final class C3568v extends c0 {

    /* renamed from: c */
    public final float f19109c;

    /* renamed from: d */
    public final float f19110d;

    public C3568v(float f6, float f10) {
        super(3);
        this.f19109c = f6;
        this.f19110d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3568v)) {
            return false;
        }
        C3568v c3568v = (C3568v) obj;
        return Float.compare(this.f19109c, c3568v.f19109c) == 0 && Float.compare(this.f19110d, c3568v.f19110d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19110d) + (Float.hashCode(this.f19109c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f19109c);
        sb2.append(", dy=");
        return AbstractC1452a.m4562i(sb2, this.f19110d, ')');
    }
}
