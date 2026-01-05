package j3;

import com.sun.mail.util.AbstractC1452a;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: j3.w */
/* loaded from: classes.dex */
public final class C3569w extends c0 {

    /* renamed from: c */
    public final float f19111c;

    /* renamed from: d */
    public final float f19112d;

    public C3569w(float f6, float f10) {
        super(3);
        this.f19111c = f6;
        this.f19112d = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3569w)) {
            return false;
        }
        C3569w c3569w = (C3569w) obj;
        return Float.compare(this.f19111c, c3569w.f19111c) == 0 && Float.compare(this.f19112d, c3569w.f19112d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19112d) + (Float.hashCode(this.f19111c) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.f19111c);
        sb2.append(", dy=");
        return AbstractC1452a.m4562i(sb2, this.f19112d, ')');
    }
}
